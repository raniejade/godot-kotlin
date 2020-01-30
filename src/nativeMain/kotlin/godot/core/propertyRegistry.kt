package godot.core

import gdnative.godot_variant
import godot.Object
import kotlinx.cinterop.*
import kotlin.reflect.KMutableProperty1

open class MutablePropertyHandler<T: Object, R>(val property: KMutableProperty1<T, R>, val default: Variant) {
  open fun get(instance: T): Variant {
    return Variant.fromAny(
      property.get(instance) as Any
    )
  }

  open fun set(instance: T, value: Variant) {
    property.set(instance, value.toAny() as R)
  }

  fun initializeDefaultValue(instance: T) {
    set(instance, default)
  }
}

open class MutableObjectPropertyHandler<T: Object, R: Object, P: KMutableProperty1<T, R>>(
  property: P,
  default: Variant,
  val factory: (COpaquePointer) -> R
): MutablePropertyHandler<T, R>(property, default) {
  override fun set(instance: T, value: Variant) {
    property.set(instance, value.asObject(factory) as R)
  }
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
    Variant.new()
  } else {
    Variant(value.pointed.readValue())
  }
  propertyHandler.set(kotlinInstance, arg)
}
