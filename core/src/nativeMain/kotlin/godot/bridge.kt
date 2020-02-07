package godot

import gdnative.godot_variant
import godot.core.Variant
import kotlinx.cinterop.*

fun createInstance(instance: COpaquePointer?, methodData: COpaquePointer?): COpaquePointer? {
  val classHandle = checkNotNull(methodData).asStableRef<ClassHandle<Object, Object>>()
    .get()
  val kotlinInstance = classHandle.create(checkNotNull(instance))
  classHandle.initializeDefaultValues(kotlinInstance)
  kotlinInstance._onInit()
  val stableRef = StableRef.create(kotlinInstance)
  return stableRef.asCPointer()
}

fun destroyInstance(instance: COpaquePointer?, methodData: COpaquePointer?, classData: COpaquePointer?) {
  val classHandleRef = checkNotNull(methodData).asStableRef<ClassHandle<Object, Object>>()
  val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
  val kotlinInstance = kotlinInstanceRef.get()
  kotlinInstance._onDestroy()
  classHandleRef.get().destroy()
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

  return methodHandle(kotlinInstance, variantArgs)._value
}

fun getProperty(
  instance: COpaquePointer?,
  methodData: COpaquePointer?,
  classData: COpaquePointer?
): CValue<godot_variant> {
  val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
  val kotlinInstance = kotlinInstanceRef.get()
  val propertyHandleRef = checkNotNull(methodData).asStableRef<MutablePropertyHandler<Object, *>>()
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
    Variant()
  } else {
    Variant(value.pointed.readValue())
  }
  propertyHandler.set(kotlinInstance, arg)
}
