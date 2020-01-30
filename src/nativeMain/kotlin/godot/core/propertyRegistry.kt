package godot.core

import gdnative.godot_variant
import godot.Object
import kotlinx.cinterop.*
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty1

open class PropertyHandler<T: Object, R, P: KProperty1<T, R>>(val property: P) {
  open fun get(instance: T): Variant {
    return Variant.fromAny(
      property.get(instance) as Any
    )
  }
}

open class MutablePropertyHandler<T: Object, R>(property: KMutableProperty1<T, R>): PropertyHandler<T, R, KMutableProperty1<T, R>>(property) {
  open fun set(instance: T, value: Variant) {
    property.set(instance, value.toAny() as R)
  }
}

open class ObjectPropertyHandler<T: Object, R: Object, P: KProperty1<T, R>>(
  property: P
): PropertyHandler<T, R, P>(property)

open class MutableObjectPropertyHandler<T: Object, R: Object, P: KMutableProperty1<T, R>>(
  property: P,
  val factory: (COpaquePointer) -> R
): MutablePropertyHandler<T, R>(property) {
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