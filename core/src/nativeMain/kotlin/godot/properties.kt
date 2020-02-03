package godot

import gdnative.godot_property_hint
import godot.core.CoreType
import godot.core.Variant
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

class MutableEnumProperty<T: Object, R: Enum<R>>(
  property: KMutableProperty1<T, R>,
  default: Variant,
  val converter: (String) -> R
) : MutablePropertyHandler<T, R>(property, default) {
  override fun get(instance: T): Variant {
    return Variant.new(
      property.get(instance).toString()
    )
  }

  override fun set(instance: T, value: Variant) {
    property.set(instance, converter(value.asString()))
  }
}

inline fun <T: Object, reified P: KMutableProperty1<T, Int>> ClassMemberRegistry<T>.registerProperty(
  property: P,
  default: Int = 0,
  hint: PropertyHint<Int> = PropertyHint.none()
) {
  val propertyName = property.name
  val variant = Variant.new(default)
  val handler = MutablePropertyHandler(property, variant)
  val propertyHandleRef = track(handler)
  doRegisterProperty(className, propertyName, propertyHandleRef, Variant.Type.INT, hint = hint, default = variant)
}

inline fun <T: Object, reified P: KMutableProperty1<T, Float>> ClassMemberRegistry<T>.registerProperty(
  property: P,
  default: Float = 0f,
  hint: PropertyHint<Float> = PropertyHint.none()
) {
  val propertyName = property.name
  val variant = Variant.new(default)
  val handler = MutablePropertyHandler(property, variant)
  val propertyHandleRef = track(handler)
  doRegisterProperty(className, propertyName, propertyHandleRef, Variant.Type.FLOAT, hint = hint, default = variant)
}

inline fun <T: Object, reified P: KMutableProperty1<T, String>> ClassMemberRegistry<T>.registerProperty(
  property: P,
  default: String = "",
  hint: PropertyHint<String> = PropertyHint.none()
) {
  val propertyName = property.name
  val variant = Variant.new(default)
  val handler = MutablePropertyHandler(property, variant)
  val propertyHandleRef = track(handler)
  doRegisterProperty(className, propertyName, propertyHandleRef, Variant.Type.STRING, hint = hint, default = variant)
}

inline fun <T: Object, reified P: KMutableProperty1<T, Boolean>> ClassMemberRegistry<T>.registerProperty(property: P, default: Boolean = false) {
  val propertyName = property.name
  val variant = Variant.new(default)
  val handler = MutablePropertyHandler(property, variant)
  val propertyHandleRef = track(handler)
  doRegisterProperty(className, propertyName, propertyHandleRef, Variant.Type.BOOL, default = variant)
}

inline fun <T: Object, reified R: CoreType<*>, reified P: KMutableProperty1<T, R>> ClassMemberRegistry<T>.registerProperty(
  property: P,
  default: R? = null,
  hint: PropertyHint<R> = PropertyHint.none()
) {
  val propertyName = property.name
  val variant = default?.toVariant() ?: Variant.defaultForType<R>().toVariant()
  val handler = MutablePropertyHandler(property, variant)
  val propertyHandleRef = track(handler)
  doRegisterProperty(className, propertyName, propertyHandleRef, variant.type, default = variant, hint = hint)
}

inline fun <T: Object, reified R: Enum<R>, reified P: KMutableProperty1<T, R>> ClassMemberRegistry<T>.registerProperty(property: P, default: R? = null) {
  val propertyName = property.name
  val variant = if (default != null) {
    Variant.new(default.toString())
  } else {
    Variant.new(enumValues<R>()[0].toString())
  }
  val handler = MutableEnumProperty(property, variant) { name ->
    enumValueOf(name)
  }
  val propertyHandleRef = track(handler)
  doRegisterProperty(
    className, propertyName, propertyHandleRef, Variant.Type.STRING,
    default = variant, hint = PropertyHint(godot_property_hint.GODOT_PROPERTY_HINT_ENUM, enumValues<R>().joinToString(","))
  )
}