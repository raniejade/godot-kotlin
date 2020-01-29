package godot.core

import gdnative.godot_variant
import gdnative.godot_variant_operator
import gdnative.godot_variant_type
import godot.Object
import kotlinx.cinterop.*
import kotlin.native.concurrent.AtomicReference
import kotlin.native.concurrent.freeze

class Variant(
  value: CValue<godot_variant>
) {
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
    POOL_REAL_ARRAY(godot_variant_type.GODOT_VARIANT_TYPE_POOL_REAL_ARRAY.value.toInt()),
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

  fun asPoolRealArray(): PoolRealArray {
    return transmute(::PoolRealArray) {
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

  fun <T: Object> asObject(factory: (COpaquePointer) -> T): T? {
    return memScoped {
      val obj = checkNotNull(Godot.gdnative.godot_variant_as_object)(_value.ptr)
      obj?.let(factory)
    }
  }

  fun toAny(): Any? {
    return when (type) {
      Type.NIL -> null
      Type.OBJECT -> throw UnsupportedOperationException("Can't convert to Any type")
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
      Type.POOL_REAL_ARRAY -> asPoolRealArray()
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
    fun new(): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_nil)(it)
      }
    }

    fun new(str: String): Variant {
      return allocateVariant {
        GDString.from(str) { str ->
          checkNotNull(Godot.gdnative.godot_variant_new_string)(it, str._value.ptr)
        }
      }
    }

    fun new(num: UInt64): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_uint)(it, num)
      }
    }

    fun new(num: Int): Variant {
      return new(num.toLong())
    }

    fun new(num: Int64): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_int)(it, num)
      }
    }

    fun new(num: Float): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_real)(it, num.toDouble())
      }
    }

    fun new(boolean: Boolean): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_bool)(it, boolean)
      }
    }

    fun new(basis: Basis): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_basis)(it, basis._value.ptr)
      }
    }

    fun new(color: Color): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_color)(it, color._value.ptr)
      }
    }

    fun new(array: VariantArray): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_array)(it, array._value.ptr)
      }
    }

    fun new(array: PoolByteArray): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_pool_byte_array)(it, array._value.ptr)
      }
    }

    fun new(array: PoolColorArray): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_pool_color_array)(it, array._value.ptr)
      }
    }

    fun new(array: PoolIntArray): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_pool_int_array)(it, array._value.ptr)
      }
    }

    fun new(array: PoolRealArray): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_pool_real_array)(it, array._value.ptr)
      }
    }

    fun new(array: PoolStringArray): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_pool_string_array)(it, array._value.ptr)
      }
    }

    fun new(array: PoolVector2Array): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_pool_vector2_array)(it, array._value.ptr)
      }
    }

    fun new(array: PoolVector3Array): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_pool_vector3_array)(it, array._value.ptr)
      }
    }

    fun new(quat: Quat): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_quat)(it, quat._value.ptr)
      }
    }

    fun new(rid: RID): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_rid)(it, rid._value.ptr)
      }
    }

    fun new(vec: Vector2): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_vector2)(it, vec._value.ptr)
      }
    }

    fun new(vec: Vector3): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_vector3)(it, vec._value.ptr)
      }
    }

    fun new(rec: Rect2): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_rect2)(it, rec._value.ptr)
      }
    }

    fun new(transform: Transform2D): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_transform2d)(it, transform._value.ptr)
      }
    }

    fun new(plane: Plane): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_plane)(it, plane._value.ptr)
      }
    }

    fun new(aabb: AABB): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_aabb)(it, aabb._value.ptr)
      }
    }

    fun new(nodePath: NodePath): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_node_path)(it, nodePath._value.ptr)
      }
    }

    fun new(transform: Transform): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_transform)(it, transform._value.ptr)
      }
    }

    fun new(dictionary: Dictionary): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_dictionary)(it, dictionary._value.ptr)
      }
    }

    fun new(obj: Object): Variant {
      return allocateVariant {
        checkNotNull(Godot.gdnative.godot_variant_new_object)(it, obj._handle)
      }
    }

    // I'm lazy to fix API generation
    fun new(variant: Variant): Variant {
      return variant
    }

    fun fromAny(value: Any?): Variant {
      if (value == null) {
        return new()
      }
      return when (value) {
        is Unit -> new()
        is CoreType<*> -> value.toVariant()
        is Variant -> value
        else -> throw UnsupportedOperationException("Can't convert type ${value::class} to Variant")
      }
    }

    private fun allocateVariant(constructor: MemScope.(CPointer<godot_variant>) -> Unit): Variant {
      return allocType(::Variant, constructor)
    }
  }
}