package godot.core

import gdnative.godot_variant
import gdnative.godot_variant_operator
import gdnative.godot_variant_type
import godot.Object
import godot.TagDB
import godot.replaceHandle
import kotlinx.cinterop.*
import kotlin.native.concurrent.AtomicReference
import kotlin.native.concurrent.freeze

class Variant(
  value: CValue<godot_variant>
) {

  constructor(): this(__new())
  constructor(from: String): this(__new(from))
  constructor(from: UInt64): this(__new(from))
  constructor(from: Int): this(__new(from))
  constructor(from: Int64): this(__new(from))
  constructor(from: Float): this(__new(from))
  constructor(from: Boolean): this(__new(from))
  constructor(from: Basis): this(__new(from))
  constructor(from: Color): this(__new(from))
  constructor(from: VariantArray): this(__new(from))
  constructor(from: PoolByteArray): this(__new(from))
  constructor(from: PoolColorArray): this(__new(from))
  constructor(from: PoolIntArray): this(__new(from))
  constructor(from: PoolFloatArray): this(__new(from))
  constructor(from: PoolStringArray): this(__new(from))
  constructor(from: PoolVector2Array): this(__new(from))
  constructor(from: PoolVector3Array): this(__new(from))
  constructor(from: Quat): this(__new(from))
  constructor(from: RID): this(__new(from))
  constructor(from: Vector2): this(__new(from))
  constructor(from: Vector3): this(__new(from))
  constructor(from: Rect2): this(__new(from))
  constructor(from: Transform2D): this(__new(from))
  constructor(from: Plane): this(__new(from))
  constructor(from: AABB): this(__new(from))
  constructor(from: NodePath): this(__new(from))
  constructor(from: Transform): this(__new(from))
  constructor(from: Dictionary): this(__new(from))
  constructor(from: Object): this(__new(from))
  // lazy to fix generation api
  internal constructor(from: Variant): this(from._value)

  private val ref = AtomicReference(value.freeze())
  internal var _value: CValue<godot_variant>
    get() = ref.value
    set(value) {
      ref.compareAndSet(ref.value, value.freeze())
    }

  enum class Type(val value: Int) {
    NIL(godot_variant_type.GODOT_VARIANT_TYPE_NIL.value.toInt()),
    BOOL(godot_variant_type.GODOT_VARIANT_TYPE_BOOL.value.toInt()),
    INT(godot_variant_type.GODOT_VARIANT_TYPE_INT.value.toInt()),
    FLOAT(godot_variant_type.GODOT_VARIANT_TYPE_REAL.value.toInt()),
    STRING(godot_variant_type.GODOT_VARIANT_TYPE_STRING.value.toInt()),
    VECTOR2(godot_variant_type.GODOT_VARIANT_TYPE_VECTOR2.value.toInt()),
    RECT2(godot_variant_type.GODOT_VARIANT_TYPE_RECT2.value.toInt()),
    VECTOR3(godot_variant_type.GODOT_VARIANT_TYPE_VECTOR3.value.toInt()),
    TRANSFORM2D(godot_variant_type.GODOT_VARIANT_TYPE_TRANSFORM2D.value.toInt()),
    PLANE(godot_variant_type.GODOT_VARIANT_TYPE_PLANE.value.toInt()),
    QUAT(godot_variant_type.GODOT_VARIANT_TYPE_QUAT.value.toInt()),
    AABB(godot_variant_type.GODOT_VARIANT_TYPE_AABB.value.toInt()),
    BASIS(godot_variant_type.GODOT_VARIANT_TYPE_BASIS.value.toInt()),
    TRANSFORM(godot_variant_type.GODOT_VARIANT_TYPE_TRANSFORM.value.toInt()),
    COLOR(godot_variant_type.GODOT_VARIANT_TYPE_COLOR.value.toInt()),
    NODE_PATH(godot_variant_type.GODOT_VARIANT_TYPE_NODE_PATH.value.toInt()),
    RID(godot_variant_type.GODOT_VARIANT_TYPE_RID.value.toInt()),
    OBJECT(godot_variant_type.GODOT_VARIANT_TYPE_OBJECT.value.toInt()),
    DICTIONARY(godot_variant_type.GODOT_VARIANT_TYPE_DICTIONARY.value.toInt()),
    ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_ARRAY.value.toInt()),
    POOL_BYTE_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_BYTE_ARRAY.value.toInt()),
    POOL_INT_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_INT_ARRAY.value.toInt()),
    POOL_FLOAT_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_REAL_ARRAY.value.toInt()),
    POOL_STRING_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_STRING_ARRAY.value.toInt()),
    POOL_COLOR_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_COLOR_ARRAY.value.toInt()),
    POOL_VECTOR2_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_VECTOR2_ARRAY.value.toInt()),
    POOL_VECTOR3_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_VECTOR3_ARRAY.value.toInt());

    companion object {
      fun from(value: Int): Type {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("Unknown value: $value")
      }
    }
  }

  enum class Operator(val value: Int) {
    EQUAL(godot_variant_operator.GODOT_VARIANT_OP_EQUAL.value.toInt()),
    NOT_EQUAL(godot_variant_operator.GODOT_VARIANT_OP_NOT_EQUAL.value.toInt()),
    LESS(godot_variant_operator.GODOT_VARIANT_OP_LESS.value.toInt()),
    LESS_EQUAL(godot_variant_operator.GODOT_VARIANT_OP_LESS_EQUAL.value.toInt()),
    GREATER(godot_variant_operator.GODOT_VARIANT_OP_GREATER.value.toInt()),
    GREATER_EQUAL(godot_variant_operator.GODOT_VARIANT_OP_GREATER_EQUAL.value.toInt()),
    ADD(godot_variant_operator.GODOT_VARIANT_OP_ADD.value.toInt()),
    SUBTRACT(godot_variant_operator.GODOT_VARIANT_OP_SUBTRACT.value.toInt()),
    MULTIPLY(godot_variant_operator.GODOT_VARIANT_OP_MULTIPLY.value.toInt()),
    DIVIDE(godot_variant_operator.GODOT_VARIANT_OP_DIVIDE.value.toInt()),
    NEGATE(godot_variant_operator.GODOT_VARIANT_OP_NEGATE.value.toInt()),
    POSITIVE(godot_variant_operator.GODOT_VARIANT_OP_POSITIVE.value.toInt()),
    MODULE(godot_variant_operator.GODOT_VARIANT_OP_MODULE.value.toInt()),
    STRING_CONCAT(godot_variant_operator.GODOT_VARIANT_OP_STRING_CONCAT.value.toInt()),
    SHIFT_LEFT(godot_variant_operator.GODOT_VARIANT_OP_SHIFT_LEFT.value.toInt()),
    SHIFT_RIGHT(godot_variant_operator.GODOT_VARIANT_OP_SHIFT_RIGHT.value.toInt()),
    BIT_AND(godot_variant_operator.GODOT_VARIANT_OP_BIT_AND.value.toInt()),
    BIT_OR(godot_variant_operator.GODOT_VARIANT_OP_BIT_OR.value.toInt()),
    BIT_XOR(godot_variant_operator.GODOT_VARIANT_OP_BIT_XOR.value.toInt()),
    BIT_NEGATE(godot_variant_operator.GODOT_VARIANT_OP_BIT_NEGATE.value.toInt()),
    AND(godot_variant_operator.GODOT_VARIANT_OP_AND.value.toInt()),
    OR(godot_variant_operator.GODOT_VARIANT_OP_OR.value.toInt()),
    XOR(godot_variant_operator.GODOT_VARIANT_OP_XOR.value.toInt()),
    NOT(godot_variant_operator.GODOT_VARIANT_OP_NOT.value.toInt()),
    IN(godot_variant_operator.GODOT_VARIANT_OP_IN.value.toInt()),
    MAX(godot_variant_operator.GODOT_VARIANT_OP_MAX.value.toInt());

    companion object {
      fun from(value: Int): Operator {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("Unknown value: $value")
      }
    }
  }

  val type: Type
    get() {
      return memScoped {
        Type.from(checkNotNull(Godot.gdnative.godot_variant_get_type)(_value.ptr).value.toInt())
      }
    }

  fun asString(): String {
    return transmute {
      val gdString = GDString(
        checkNotNull(Godot.gdnative.godot_variant_as_string)(it)
      )
      val ret = gdString.toKString()
      gdString.destroy()
      ret
    }
  }

  fun asULong(): UInt64 {
    return transmute {
      checkNotNull(Godot.gdnative.godot_variant_as_uint)(it)
    }
  }

  fun asInt(): Int {
    return asLong().toInt()
  }

  fun asLong(): Int64 {
    return transmute {
      checkNotNull(Godot.gdnative.godot_variant_as_int)(it)
    }
  }

  fun asDouble(): Double {
    return transmute {
      checkNotNull(Godot.gdnative.godot_variant_as_real)(it)
    }
  }

  fun asFloat(): Float {
    return asDouble().toFloat()
  }

  fun asBoolean(): Boolean {
    return transmute {
      checkNotNull(Godot.gdnative.godot_variant_as_bool)(it)
    }
  }

  fun asBasis(): Basis {
    return transmute(::Basis) {
      checkNotNull(Godot.gdnative.godot_variant_as_basis)(it)
    }
  }

  fun asColor(): Color {
    return transmute(::Color) {
      checkNotNull(Godot.gdnative.godot_variant_as_color)(it)
    }
  }

  fun asVariantArray(): VariantArray {
    return transmute(::VariantArray) {
      checkNotNull(Godot.gdnative.godot_variant_as_array)(it)
    }
  }

  fun asPoolByteArray(): PoolByteArray {
    return transmute(::PoolByteArray) {
      checkNotNull(Godot.gdnative.godot_variant_as_pool_byte_array)(it)
    }
  }

  fun asPoolColorArray(): PoolColorArray {
    return transmute(::PoolColorArray) {
      checkNotNull(Godot.gdnative.godot_variant_as_pool_color_array)(it)
    }
  }

  fun asPoolIntArray(): PoolIntArray {
    return transmute(::PoolIntArray) {
      checkNotNull(Godot.gdnative.godot_variant_as_pool_int_array)(it)
    }
  }

  fun asPoolFloatArray(): PoolFloatArray {
    return transmute(::PoolFloatArray) {
      checkNotNull(Godot.gdnative.godot_variant_as_pool_real_array)(it)
    }
  }

  fun asPoolStringArray(): PoolStringArray {
    return transmute(::PoolStringArray) {
      checkNotNull(Godot.gdnative.godot_variant_as_pool_string_array)(it)
    }
  }

  fun asPoolVector2Array(): PoolVector2Array {
    return transmute(::PoolVector2Array) {
      checkNotNull(Godot.gdnative.godot_variant_as_pool_vector2_array)(it)
    }
  }

  fun asPoolVector3Array(): PoolVector3Array {
    return transmute(::PoolVector3Array) {
      checkNotNull(Godot.gdnative.godot_variant_as_pool_vector3_array)(it)
    }
  }

  fun asQuat(): Quat {
    return transmute(::Quat) {
      checkNotNull(Godot.gdnative.godot_variant_as_quat)(it)
    }
  }

  fun asRID(): RID {
    return transmute(::RID) {
      checkNotNull(Godot.gdnative.godot_variant_as_rid)(it)
    }
  }

  fun asVector2(): Vector2 {
    return transmute(::Vector2) {
      checkNotNull(Godot.gdnative.godot_variant_as_vector2)(it)
    }
  }

  fun asVector3(): Vector3 {
    return transmute(::Vector3) {
      checkNotNull(Godot.gdnative.godot_variant_as_vector3)(it)
    }
  }

  fun asRect2(): Rect2 {
    return transmute(::Rect2) {
      checkNotNull(Godot.gdnative.godot_variant_as_rect2)(it)
    }
  }

  fun asTransform2D(): Transform2D {
    return transmute(::Transform2D) {
      checkNotNull(Godot.gdnative.godot_variant_as_transform2d)(it)
    }
  }

  fun asPlane(): Plane {
    return transmute(::Plane) {
      checkNotNull(Godot.gdnative.godot_variant_as_plane)(it)
    }
  }

  fun asAABB(): AABB {
    return transmute(::AABB) {
      checkNotNull(Godot.gdnative.godot_variant_as_aabb)(it)
    }
  }

  fun asNodePath(): NodePath {
    return transmute(::NodePath) {
      checkNotNull(Godot.gdnative.godot_variant_as_node_path)(it)
    }
  }

  fun asTransform(): Transform {
    return transmute(::Transform) {
      checkNotNull(Godot.gdnative.godot_variant_as_transform)(it)
    }
  }

  fun asDictionary(): Dictionary {
    return transmute(::Dictionary) {
      checkNotNull(Godot.gdnative.godot_variant_as_dictionary)(it)
    }
  }

  fun <T: Object> asObject(factory: () -> T): T? {
    return memScoped {
      val obj = checkNotNull(Godot.gdnative.godot_variant_as_object)(_value.ptr)
      if (obj == null) {
        null
      } else {
        val ret = factory()
        ret._handle = obj
        ret
      }
    }
  }

  fun asObject(): Object? {
    return memScoped {
      val ptr = checkNotNull(Godot.gdnative.godot_variant_as_object)(_value.ptr)
      if (ptr == null) {
        null
      } else {
        val obj = Object()
        obj.replaceHandle(ptr)
        var tag = checkNotNull(Godot.nativescript11.godot_nativescript_get_type_tag)(ptr)
        if (tag == null) {
          tag = checkNotNull(Godot.nativescript11.godot_nativescript_get_global_type_tag)(Godot.languageIndex, obj.getClass().cstr.ptr)
        }
        if (tag != null) {
          val cast = TagDB.newInstance(tag)
          cast.replaceHandle(ptr)
          cast
        } else {
          obj
        }
      }
    }
  }

  fun toAny(): Any? {
    return when (type) {
      Type.NIL -> null
      Type.OBJECT -> asObject()
      Type.BOOL -> asBoolean()
      Type.FLOAT -> asFloat()
      Type.INT -> asInt()
      Type.STRING -> asString()
      Type.AABB -> asAABB()
      Type.ARRAY -> asVariantArray()
      Type.BASIS -> asBasis()
      Type.COLOR -> asColor()
      Type.DICTIONARY -> asDictionary()
      Type.NODE_PATH -> asNodePath()
      Type.PLANE -> asPlane()
      Type.POOL_BYTE_ARRAY -> asPoolByteArray()
      Type.POOL_COLOR_ARRAY -> asPoolColorArray()
      Type.POOL_INT_ARRAY -> asPoolIntArray()
      Type.POOL_FLOAT_ARRAY -> asPoolFloatArray()
      Type.POOL_STRING_ARRAY -> asPoolStringArray()
      Type.POOL_VECTOR2_ARRAY -> asPoolVector2Array()
      Type.POOL_VECTOR3_ARRAY -> asPoolVector3Array()
      Type.QUAT -> asQuat()
      Type.RECT2 -> asRect2()
      Type.RID -> asRID()
      Type.TRANSFORM -> asTransform()
      Type.TRANSFORM2D -> asTransform2D()
      Type.VECTOR2 -> asVector2()
      Type.VECTOR3 -> asVector3()
      else -> throw UnsupportedOperationException("Unknown type $type")
    }
  }

  override fun toString(): String {
    return asString()
  }

  private fun <K: CStructVar, T: CoreType<K>> transmute(factory: (CValue<K>) -> T, transformer: (CPointer<godot_variant>) -> CValue<K>): T {
    return memScoped {
      factory(
        transformer(_value.ptr)
      )
    }
  }

  private fun <T> transmute(transformer: (CPointer<godot_variant>) -> T): T {
    return memScoped {
      transformer(_value.ptr)
    }
  }

  companion object {
    internal fun __new() = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_nil)(it)
    }

    internal fun __new(from: String) = allocType2<godot_variant> {
      GDString.from(from) { str ->
        checkNotNull(Godot.gdnative.godot_variant_new_string)(it, str._value.ptr)
      }
    }

    internal fun __new(from: UInt64) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_uint)(it, from)

    }

    internal fun __new(from: Int) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_int)(it, from.toLong())

    }

    internal fun __new(from: Int64) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_int)(it, from)

    }

    internal fun __new(from: Float) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_real)(it, from.toDouble())
    }

    internal fun __new(from: Boolean) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_bool)(it, from)
    }

    internal fun __new(from: Basis) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_basis)(it, from._value.ptr)
    }

    internal fun __new(from: Color) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_color)(it, from._value.ptr)
    }

    internal fun __new(from: VariantArray) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_array)(it, from._value.ptr)
    }

    internal fun __new(from: PoolByteArray) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_pool_byte_array)(it, from._value.ptr)
    }

    internal fun __new(from: PoolColorArray) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_pool_color_array)(it, from._value.ptr)
    }

    internal fun __new(from: PoolIntArray) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_pool_int_array)(it, from._value.ptr)
    }

    internal fun __new(from: PoolFloatArray) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_pool_real_array)(it, from._value.ptr)
    }

    internal fun __new(from: PoolStringArray) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_pool_string_array)(it, from._value.ptr)
    }

    internal fun __new(from: PoolVector2Array) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_pool_vector2_array)(it, from._value.ptr)
    }

    internal fun __new(from: PoolVector3Array) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_pool_vector3_array)(it, from._value.ptr)
    }

    internal fun __new(from: Quat) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_quat)(it, from._value.ptr)
    }

    internal fun __new(from: RID) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_rid)(it, from._value.ptr)
    }

    internal fun __new(from: Vector2) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_vector2)(it, from._value.ptr)
    }

    internal fun __new(from: Vector3) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_vector3)(it, from._value.ptr)
    }

    internal fun __new(from: Rect2) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_rect2)(it, from._value.ptr)
    }

    internal fun __new(from: Transform2D) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_transform2d)(it, from._value.ptr)
    }

    internal fun __new(from: Plane) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_plane)(it, from._value.ptr)
    }

    internal fun __new(from: AABB) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_aabb)(it, from._value.ptr)
    }

    internal fun __new(from: NodePath) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_node_path)(it, from._value.ptr)
    }

    internal fun __new(from: Transform) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_transform)(it, from._value.ptr)
    }

    internal fun __new(from: Dictionary) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_dictionary)(it, from._value.ptr)
    }

    internal fun __new(from: Object) = allocType2<godot_variant> {
      checkNotNull(Godot.gdnative.godot_variant_new_object)(it, from._handle)
    }

    fun fromAny(value: Any?): Variant {
      if (value == null) {
        return Variant()
      }
      return when (value) {
        is Unit -> Variant()
        is Int -> Variant(value)
        is Float -> Variant(value)
        is String -> Variant(value)
        is Boolean -> Variant(value)
        is CoreType<*> -> value.toVariant()
        is Variant -> value
        is Object -> Variant(value)
        else -> throw UnsupportedOperationException("Can't convert type ${value::class} to Variant")
      }
    }

    // hack to get default values of core types
    // nil variants will always attempt to convert to a sane value of the
    // target type
    @PublishedApi
    internal inline fun <reified T: CoreType<*>> defaultForType(): T {
      val nil = Variant()
      return when (T::class) {
        AABB::class -> nil.asAABB()
        VariantArray::class -> nil.asVariantArray()
        Basis::class -> nil.asBasis()
        Color::class -> nil.asColor()
        Dictionary::class -> nil.asDictionary()
        NodePath::class -> nil.asNodePath()
        Plane::class -> nil.asPlane()
        PoolByteArray::class -> nil.asPoolByteArray()
        PoolColorArray::class -> nil.asPoolColorArray()
        PoolIntArray::class -> nil.asPoolIntArray()
        PoolFloatArray::class -> nil.asPoolFloatArray()
        PoolStringArray::class -> nil.asPoolStringArray()
        PoolVector2Array::class -> nil.asPoolVector2Array()
        PoolVector3Array::class -> nil.asPoolVector3Array()
        Quat::class -> nil.asQuat()
        Rect2::class -> nil.asRect2()
        RID::class -> nil.asRID()
        Transform::class -> nil.asTransform()
        Transform2D::class -> nil.asTransform2D()
        Vector2::class -> nil.asVector2()
        Vector3::class -> nil.asVector3()
        else -> throw UnsupportedOperationException("Unknown variant class ${T::class}")
      } as T
    }

    @PublishedApi
    internal inline fun <reified T> typeForT(): Type {
      return when (T::class) {
        Int::class -> Type.INT
        Float::class -> Type.FLOAT
        String::class -> Type.STRING
        Boolean::class -> Type.BOOL
        AABB::class -> Type.AABB
        VariantArray::class -> Type.ARRAY
        Basis::class -> Type.BASIS
        Color::class -> Type.COLOR
        Dictionary::class -> Type.DICTIONARY
        NodePath::class -> Type.NODE_PATH
        Plane::class -> Type.PLANE
        PoolByteArray::class -> Type.POOL_BYTE_ARRAY
        PoolColorArray::class -> Type.POOL_COLOR_ARRAY
        PoolIntArray::class -> Type.POOL_INT_ARRAY
        PoolFloatArray::class -> Type.POOL_FLOAT_ARRAY
        PoolStringArray::class -> Type.POOL_STRING_ARRAY
        PoolVector2Array::class -> Type.POOL_VECTOR2_ARRAY
        PoolVector3Array::class -> Type.POOL_VECTOR3_ARRAY
        Quat::class -> Type.QUAT
        Rect2::class -> Type.RECT2
        RID::class -> Type.RID
        Transform::class -> Type.TRANSFORM
        Transform2D::class -> Type.TRANSFORM2D
        Vector2::class -> Type.VECTOR2
        Vector3::class -> Type.VECTOR3
        // assume an object
        else -> Type.OBJECT
      }
    }

    private fun allocateVariant(constructor: MemScope.(CPointer<godot_variant>) -> Unit): Variant {
      return allocType(::Variant, constructor)
    }
  }
}