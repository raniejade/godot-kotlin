package godot

import gdnative.godot_variant
import godot.core.Allocator
import godot.core.Variant
import kotlinx.cinterop.*

fun createInstance(instance: COpaquePointer?, methodData: COpaquePointer?): COpaquePointer? {
  return Allocator.pushContext {
    val classHandle = checkNotNull(methodData).asStableRef<ClassHandle<Object, Object>>()
            .get()
    val kotlinInstance = classHandle.create(checkNotNull(instance))
    classHandle.initializeDefaultValues(kotlinInstance)
    kotlinInstance._onInit()
    val stableRef = StableRef.create(kotlinInstance)
    stableRef.asCPointer()
  }
}

fun disposeClassHandle(ref: COpaquePointer?) {
  val handle = checkNotNull(ref).asStableRef<ClassHandle<Object, Object>>()
  // this will destroy method and property refs as well
  handle.get().destroy()
  handle.dispose()
}

fun destroyInstance(instance: COpaquePointer?, methodData: COpaquePointer?, classData: COpaquePointer?) {
  Allocator.pushContext {
    val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
    val kotlinInstance = kotlinInstanceRef.get()
    kotlinInstance._onDestroy()
    kotlinInstanceRef.dispose()
  }
}

fun invokeMethod(instance: COpaquePointer?,
                 methodData: COpaquePointer?,
                 classData: COpaquePointer?,
                 numArgs: Int,
                 args: CPointer<CPointerVar<godot_variant>>?): CValue<godot_variant> {
  val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
  val kotlinInstance = kotlinInstanceRef.get()
  val methodHandleRef = checkNotNull(methodData).asStableRef<Method<Object, *>>()
  val methodHandle = methodHandleRef.get()

  check(methodHandle.parameterCount == numArgs) {
    "Invalid number of arguments, $numArgs passed but ${methodHandle.parameterCount} expected."
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

  return Allocator.pushContext {
    methodHandle(kotlinInstance, variantArgs)._value
  }
}

fun getProperty(
  instance: COpaquePointer?,
  methodData: COpaquePointer?,
  classData: COpaquePointer?
): CValue<godot_variant> {
  return Allocator.pushContext {
    val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
    val kotlinInstance = kotlinInstanceRef.get()
    val propertyHandleRef = checkNotNull(methodData).asStableRef<MutablePropertyHandler<Object, *>>()
    val propertyHandler = propertyHandleRef.get()

    propertyHandler.get(kotlinInstance)._value
  }
}

fun setProperty(
  instance: COpaquePointer?,
  methodData: COpaquePointer?,
  classData: COpaquePointer?,
  value: CPointer<godot_variant>?
) {
  Allocator.pushContext {
    val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
    val kotlinInstance = kotlinInstanceRef.get()
    val propertyHandleRef = checkNotNull(methodData).asStableRef<MutablePropertyHandler<Object, *>>()
    val propertyHandler = propertyHandleRef.get()
    val arg = if (value == null) {
      Variant()
    } else {
      Variant(value.pointed.readValue())
    }
    propertyHandler.set(kotlinInstance, arg)
  }
}

fun createWrapper(data: COpaquePointer?, tag: COpaquePointer?, instance: COpaquePointer?): COpaquePointer? {
  val wrapped = Wrapped(
    checkNotNull(instance),
    checkNotNull(tag)
  )
  return StableRef.create(wrapped).asCPointer()
}

fun destroyWrapper(data: COpaquePointer?, wrapper: COpaquePointer?) {
  wrapper?.asStableRef<Wrapped>()?.dispose()
}