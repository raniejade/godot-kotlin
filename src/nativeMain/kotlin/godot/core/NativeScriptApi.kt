package godot.core

import gdnative.*
import godot.Object
import kotlinx.cinterop.*
import kotlin.reflect.KCallable

class NativeScriptApi(val handle: COpaquePointer) {
  // TODO: registerClass, etc...
  inline fun <reified S: Object, reified T: S> registerClass(info: GodotClass<T>) {
    val className = T::class.simpleName!!
    val superClassName = S::class.simpleName!!
    val classHandle = ClassHandle(handle, className, superClassName, info)
    classHandle.init()
  }
}

class ClassHandle<T: Object>(
  val handle: COpaquePointer,
  val className: String,
  val superClassName: String,
  val info: GodotClass<T>
) {
  fun create(instance: COpaquePointer): T {
    return info.factory(instance)
  }

  fun init() {
    memScoped {
      val methodData = StableRef.create(this@ClassHandle).asCPointer()
      // register constructor and destructor
      val create = cValue<godot_instance_create_func> {
        create_func = staticCFunction(::createInstance)
        method_data = methodData
      }
      val destroy = cValue<godot_instance_destroy_func> {
        destroy_func = staticCFunction(::destroyInstance)
        method_data = methodData
      }
      checkNotNull(Godot.nativescript.godot_nativescript_register_class)(
        handle,
        className.cstr.ptr,
        superClassName.cstr.ptr,
        create,
        destroy
      )
    }

    val registry = ClassRegistry<T>(handle, className)
    with(info) {
      registry.init()
    }
  }
}

abstract class MethodHandle<T: Object, R>(val paramCount: Int) {
  abstract operator fun invoke(instance: T, args: List<Variant>): Variant
}

class MethodHandle0<T: Object, R>(val method: (T) -> R, val convert: (R) -> Variant): MethodHandle<T, R>(0) {
  override fun invoke(instance: T, args: List<Variant>): Variant {
    return convert(
      method(instance)
    )
  }
}

class ClassRegistry<T: Object>(val handle: COpaquePointer, val className: String) {
  inline fun <reified K: (T) -> Unit> registerMethod(method: K) {
    val methodName = (method as KCallable<Unit>).name
    val methodHandle = MethodHandle0(method) { Variant.new() }
    val methodHandleRef = StableRef.create(methodHandle).asCPointer()
    registerMethod(className, methodName, methodHandleRef)
  }

  @PublishedApi
  internal fun registerMethod(className: String, methodName: String, methodHandleRef: COpaquePointer) {
    memScoped {
      val attribs = cValue<godot_method_attributes> {
        rpc_type = GODOT_METHOD_RPC_MODE_DISABLED
      }

      val instanceMethod = cValue<godot_instance_method> {
        method_data = methodHandleRef
        this.method = staticCFunction(::invokeMethod)
      }

      checkNotNull(Godot.nativescript.godot_nativescript_register_method)(
        handle,
        className.cstr.ptr,
        methodName.cstr.ptr,
        attribs,
        instanceMethod
      )
    }
  }
}

fun createInstance(instance: COpaquePointer?, methodData: COpaquePointer?): COpaquePointer? {
  val classHandle = checkNotNull(methodData).asStableRef<ClassHandle<Object>>()
    .get()
  val kotlinInstance = classHandle.create(checkNotNull(instance))
  val stableRef = StableRef.create(kotlinInstance)
  return stableRef.asCPointer()
}

fun destroyInstance(instance: COpaquePointer?, methodData: COpaquePointer?, classData: COpaquePointer?) {
  val classHandleRef = checkNotNull(methodData).asStableRef<ClassHandle<Object>>()
  println("destroying instance classHandleRef: $classHandleRef")
  val classHandle = classHandleRef.get()
  val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
  println("destroying instance kotlinInstanceRef: $kotlinInstanceRef")
  val kotlinInstance = kotlinInstanceRef.get()
  kotlinInstance.free()
  classHandleRef.dispose()
  kotlinInstanceRef.dispose()
  println("destroying instance done")
}

fun invokeMethod(instance: COpaquePointer?,
                 methodData: COpaquePointer?,
                 classData: COpaquePointer?,
                 numArgs: Int,
                 args: CPointer<CPointerVar<godot_variant>>?): CValue<godot_variant> {
  val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
  println("kotlinInstanceRef $kotlinInstanceRef")
  val kotlinInstance = kotlinInstanceRef.get()
  //println("kotlinInstance $kotlinInstance")
  val methodHandleRef = checkNotNull(methodData).asStableRef<MethodHandle<Object, *>>()
  println("methodHandleRef $methodHandleRef")
  val methodHandle = methodHandleRef.get()
  println("methodHandle $methodHandle")

  check(methodHandle.paramCount == numArgs) {
    "Invalid number of arguments, $numArgs passed but ${methodHandle.paramCount} expected."
  }

  val variantArgs = if (numArgs == 0) {
    emptyList()
  } else {
    requireNotNull(args) { "args is null!" }
    val tmp = mutableListOf<Variant>()
    for (i in 0 until numArgs) {
      tmp.add(Variant(args[i]!!.pointed.readValue()))
    }
    tmp.toList()
  }

  println("calling with args: $variantArgs")

  return methodHandle(kotlinInstance, variantArgs)._value
}

abstract class GodotClass<T: Object>(
  val factory: (COpaquePointer) -> T
) {
  open fun ClassRegistry<T>.init() {}
}