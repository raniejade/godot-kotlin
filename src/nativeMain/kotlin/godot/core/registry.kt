package godot.core

import gdnative.*
import godot.Object
import godot.Resource
import kotlinx.cinterop.*
import kotlin.reflect.KCallable
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty1

class ClassRegistry(val handle: COpaquePointer) {
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

    val registry = ClassMemberRegistry<T>(handle, className)
    info.init(registry)
  }
}

abstract class MethodHandle<T: Object, R>(val paramCount: Int) {
  abstract operator fun invoke(instance: T, args: List<Variant>): Variant
}

class MethodHandle0<T: Object, R>(val method: (T) -> R): MethodHandle<T, R>(0) {
  override fun invoke(instance: T, args: List<Variant>): Variant {
    return Variant.fromAny(
      method(instance) as Any
    )
  }
}

class MethodHandle1<T: Object, A1, R>(val method: (T, A1) -> R): MethodHandle<T, R>(1) {
  override fun invoke(instance: T, args: List<Variant>): Variant {
    return Variant.fromAny(
      method(instance, args[0].toAny() as A1) as Any
    )
  }
}

class ClassMemberRegistry<T: Object>(val handle: COpaquePointer, val className: String) {
  inline fun <R, reified K: (T) -> R> registerMethod(method: K) {
    val methodName = (method as KCallable<Unit>).name
    val methodHandle = MethodHandle0(method)
    val methodHandleRef = StableRef.create(methodHandle).asCPointer()
    registerMethod(className, methodName, methodHandleRef)
  }

  inline fun <R, A1, reified K: (T, A1) -> R> registerMethod(method: K) {
    val methodName = (method as KCallable<Unit>).name
    val methodHandle = MethodHandle1(method)
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

  inline fun <T: Object, reified P: KProperty1<T, Int>> registerProperty(property: P) {
    val propertyName = property.name
    val handler = PropertyHandler(property)
    val propertyHandleRef = StableRef.create(handler).asCPointer()
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.INT)
  }
  inline fun <T: Object, reified P: KMutableProperty1<T, Int>> registerProperty(property: P) {
    val propertyName = property.name
    val handler = MutablePropertyHandler(property)
    val propertyHandleRef = StableRef.create(handler).asCPointer()
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.INT, isMutable = true)
  }

  inline fun <T: Object, reified P: KProperty1<T, Float>> registerProperty(property: P) {
    val propertyName = property.name
    val handler = PropertyHandler(property)
    val propertyHandleRef = StableRef.create(handler).asCPointer()
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.FLOAT)
  }
  inline fun <T: Object, reified P: KMutableProperty1<T, Float>> registerProperty(property: P) {
    val propertyName = property.name
    val handler = MutablePropertyHandler(property)
    val propertyHandleRef = StableRef.create(handler).asCPointer()
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.FLOAT, isMutable = true)
  }

  inline fun <T: Object, reified P: KProperty1<T, String>> registerProperty(property: P) {
    val propertyName = property.name
    val handler = PropertyHandler(property)
    val propertyHandleRef = StableRef.create(handler).asCPointer()
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.STRING)
  }
  inline fun <T: Object, reified P: KMutableProperty1<T, String>> registerProperty(property: P) {
    val propertyName = property.name
    val handler = MutablePropertyHandler(property)
    val propertyHandleRef = StableRef.create(handler).asCPointer()
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.STRING, isMutable = true)
  }

  inline fun <T: Object, reified P: KProperty1<T, Boolean>> registerProperty(property: P) {
    val propertyName = property.name
    val handler = PropertyHandler(property)
    val propertyHandleRef = StableRef.create(handler).asCPointer()
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.BOOL)
  }
  inline fun <T: Object, reified P: KMutableProperty1<T, Boolean>> registerProperty(property: P) {
    val propertyName = property.name
    val handler = MutablePropertyHandler(property)
    val propertyHandleRef = StableRef.create(handler).asCPointer()
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.BOOL, isMutable = true)
  }

  inline fun <T: Object, R: Object, reified P: KProperty1<T, R>> registerProperty(property: P) {
    val propertyName = property.name
    val handler = PropertyHandler(property)
    val propertyHandleRef = StableRef.create(handler).asCPointer()
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.OBJECT)
  }
  inline fun <T: Object, R: Object, reified P: KMutableProperty1<T, R>> registerProperty(property: P) {
    val propertyName = property.name
    val handler = MutablePropertyHandler(property)
    val propertyHandleRef = StableRef.create(handler).asCPointer()
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.OBJECT, isMutable = true)
  }

  inline fun <T: Object, reified R: Resource, reified P: KProperty1<T, R>> registerResourceProperty(property: P) {
    val propertyName = property.name
    val handler = PropertyHandler(property)
    val propertyHandleRef = StableRef.create(handler).asCPointer()
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.OBJECT, isResource = true)
  }
  inline fun <T: Object, reified R: Resource, reified P: KMutableProperty1<T, R>> registerResourceProperty(property: P) {
    val propertyName = property.name
    val handler = MutablePropertyHandler(property)
    val propertyHandleRef = StableRef.create(handler).asCPointer()
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.OBJECT, isResource = true, isMutable = true)
  }

  // TODO: register core types & add default values

  @PublishedApi
  internal fun registerProperty(
    className: String,
    propertyName: String,
    propertyHandleRef: COpaquePointer,
    propertyType: Variant.Type,
    isResource: Boolean = false,
    isMutable: Boolean = false) {
    memScoped {
      var usageFlags = GODOT_PROPERTY_USAGE_DEFAULT

      if (isMutable) {
        usageFlags = usageFlags or GODOT_PROPERTY_USAGE_SCRIPT_VARIABLE
      }

      val attribs = cValue<godot_property_attributes> {
        rset_type = GODOT_METHOD_RPC_MODE_DISABLED
        usage = usageFlags
        type = propertyType.value

        if (propertyType == Variant.Type.OBJECT && isResource) {
          hint = godot_property_hint.GODOT_PROPERTY_HINT_RESOURCE_TYPE
        }
      }

      val getter = cValue<godot_property_get_func> {
        method_data = propertyHandleRef
        get_func = staticCFunction(::getProperty)
      }

      val setter = cValue<godot_property_set_func> {
        method_data = propertyHandleRef
        set_func = if (isMutable) {
          staticCFunction(::setProperty)
        } else {
          staticCFunction(::setPropertyFail)
        }
      }

      checkNotNull(Godot.nativescript.godot_nativescript_register_property)(
        handle,
        className.cstr.ptr,
        propertyName.cstr.ptr,
        attribs.ptr,
        setter,
        getter
      )
    }
  }
}

open class PropertyHandler<T: Object, R, P: KProperty1<T, R>>(val property: P) {
  fun get(instance: T): Variant {
    return Variant.fromAny(
      property.get(instance) as Any
    )
  }
}

class MutablePropertyHandler<T: Object, R>(property: KMutableProperty1<T, R>): PropertyHandler<T, R, KMutableProperty1<T, R>>(property) {
  fun set(instance: T, value: Variant) {
    property.set(instance, value.toAny() as R)
  }
}

fun createInstance(instance: COpaquePointer?, methodData: COpaquePointer?): COpaquePointer? {
  val classHandle = checkNotNull(methodData).asStableRef<ClassHandle<Object>>()
    .get()
  val kotlinInstance = classHandle.create(checkNotNull(instance))
  kotlinInstance._onInit()
  val stableRef = StableRef.create(kotlinInstance)
  return stableRef.asCPointer()
}

fun destroyInstance(instance: COpaquePointer?, methodData: COpaquePointer?, classData: COpaquePointer?) {
  val classHandleRef = checkNotNull(methodData).asStableRef<ClassHandle<Object>>()
  val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
  val kotlinInstance = kotlinInstanceRef.get()
  kotlinInstance._onDestroy()
  classHandleRef.dispose()
  kotlinInstanceRef.dispose()
}

fun invokeMethod(instance: COpaquePointer?,
                 methodData: COpaquePointer?,
                 classData: COpaquePointer?,
                 numArgs: Int,
                 args: CPointer<CPointerVar<godot_variant>>?): CValue<godot_variant> {
  val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
  val kotlinInstance = kotlinInstanceRef.get()
  val methodHandleRef = checkNotNull(methodData).asStableRef<MethodHandle<Object, *>>()
  val methodHandle = methodHandleRef.get()

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

  return methodHandle(kotlinInstance, variantArgs)._value
}

fun getProperty(
  instance: COpaquePointer?,
  methodData: COpaquePointer?,
  classData: COpaquePointer?
): CValue<godot_variant> {
  val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
  val kotlinInstance = kotlinInstanceRef.get()
  val propertyHandleRef = checkNotNull(methodData).asStableRef<PropertyHandler<Object, *, KProperty1<Object, *>>>()
  val propertyHandler = propertyHandleRef.get()

  return propertyHandler.get(kotlinInstance)._value
}

fun setProperty(
  instance: COpaquePointer?,
  methodData: COpaquePointer?,
  classData: COpaquePointer?,
  value: CPointer<godot_variant>?
) {
  val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
  val kotlinInstance = kotlinInstanceRef.get()
  val propertyHandleRef = checkNotNull(methodData).asStableRef<MutablePropertyHandler<Object, *>>()
  val propertyHandler = propertyHandleRef.get()
  val arg = if (value == null) {
    Variant.new()
  } else {
    Variant(value.pointed.readValue())
  }
  propertyHandler.set(kotlinInstance, arg)
}

fun setPropertyFail(
  instance: COpaquePointer?,
  methodData: COpaquePointer?,
  classData: COpaquePointer?,
  value: CPointer<godot_variant>?
) {
  throw IllegalStateException("Property is immutable!")
}

abstract class GodotClass<T: Object>(
  val factory: (COpaquePointer) -> T
) {
  open fun init(registry: ClassMemberRegistry<T>) {}
}
