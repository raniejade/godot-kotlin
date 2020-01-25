package godot

import gdnative.godot_variant
import kotlinx.cinterop.*

class Variant(
  value: CValue<godot_variant>
): Primitive<godot_variant>(value) {

  fun asString(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_variant_as_string)(_value.ptr)
      )
    }
  }

  fun asUInt(): UInt64 {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_variant_as_uint)(_value.ptr)
    }
  }

  fun asInt(): Int64 {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_variant_as_int)(_value.ptr)
    }
  }

  fun asReal(): Double {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_variant_as_real)(_value.ptr)
    }
  }

  fun asBasis(): Basis {
    return memScoped {
      Basis(
        checkNotNull(Godot.gdnative.godot_variant_as_basis)(_value.ptr)
      )
    }
  }

  fun asBasisRef(cb: Basis.() -> Unit) {
    _value = memScoped {
      val ptr = _value.ptr
      val ref = checkNotNull(Godot.gdnative.godot_variant_as_basis)(_value.ptr)
      val refValue = Basis(ref)
      cb(refValue)
      checkNotNull(Godot.gdnative.godot_variant_new_basis)(ptr, refValue._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun asColor(): Color {
    return memScoped {
      Color(
        checkNotNull(Godot.gdnative.godot_variant_as_color)(_value.ptr)
      )
    }
  }

  fun asColor(cb: Color.() -> Unit) {
    _value = memScoped {
      val ptr = _value.ptr
      val ref = checkNotNull(Godot.gdnative.godot_variant_as_color)(_value.ptr)
      val refValue = Color(ref)
      cb(refValue)
      checkNotNull(Godot.gdnative.godot_variant_new_color)(ptr, refValue._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun asArray(): GDArray {
    return memScoped {
      GDArray(
        checkNotNull(Godot.gdnative.godot_variant_as_array)(_value.ptr)
      )
    }
  }

  fun asArrayRef(cb: GDArray.() -> Unit) {
    _value = memScoped {
      val ptr = _value.ptr
      val ref = checkNotNull(Godot.gdnative.godot_variant_as_array)(_value.ptr)
      val refValue = GDArray(ref)
      cb(refValue)
      checkNotNull(Godot.gdnative.godot_variant_new_array)(ptr, refValue._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun asPoolByteArray(): PoolByteArray {
    return memScoped {
      PoolByteArray(
        checkNotNull(Godot.gdnative.godot_variant_as_pool_byte_array)(_value.ptr)
      )
    }
  }

  fun asPoolByteArrayRef(cb: PoolByteArray.() -> Unit) {
    _value = memScoped {
      val ptr = _value.ptr
      val ref = checkNotNull(Godot.gdnative.godot_variant_as_pool_byte_array)(_value.ptr)
      val refValue = PoolByteArray(ref)
      cb(refValue)
      checkNotNull(Godot.gdnative.godot_variant_new_pool_byte_array)(ptr, refValue._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun asPoolColorArray(): PoolColorArray {
    return memScoped {
      PoolColorArray(
        checkNotNull(Godot.gdnative.godot_variant_as_pool_color_array)(_value.ptr)
      )
    }
  }

  fun asPoolColorArrayRef(cb: PoolColorArray.() -> Unit) {
    _value = memScoped {
      val ptr = _value.ptr
      val ref = checkNotNull(Godot.gdnative.godot_variant_as_pool_color_array)(_value.ptr)
      val refValue = PoolColorArray(ref)
      cb(refValue)
      checkNotNull(Godot.gdnative.godot_variant_new_pool_color_array)(ptr, refValue._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun asPoolIntArray(): PoolIntArray {
    return memScoped {
      PoolIntArray(
        checkNotNull(Godot.gdnative.godot_variant_as_pool_int_array)(_value.ptr)
      )
    }
  }

  fun asPoolIntArrayRef(cb: PoolIntArray.() -> Unit) {
    _value = memScoped {
      val ptr = _value.ptr
      val ref = checkNotNull(Godot.gdnative.godot_variant_as_pool_int_array)(_value.ptr)
      val refValue = PoolIntArray(ref)
      cb(refValue)
      checkNotNull(Godot.gdnative.godot_variant_new_pool_int_array)(ptr, refValue._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun asPoolRealArray(): PoolRealArray {
    return memScoped {
      PoolRealArray(
        checkNotNull(Godot.gdnative.godot_variant_as_pool_real_array)(_value.ptr)
      )
    }
  }

  fun asPoolRealArrayRef(cb: PoolRealArray.() -> Unit) {
    _value = memScoped {
      val ptr = _value.ptr
      val ref = checkNotNull(Godot.gdnative.godot_variant_as_pool_real_array)(_value.ptr)
      val refValue = PoolRealArray(ref)
      cb(refValue)
      checkNotNull(Godot.gdnative.godot_variant_new_pool_real_array)(ptr, refValue._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun asPoolStringArray(): PoolStringArray {
    return memScoped {
      PoolStringArray(
        checkNotNull(Godot.gdnative.godot_variant_as_pool_string_array)(_value.ptr)
      )
    }
  }

  fun asPoolByteArrayRef(cb: PoolStringArray.() -> Unit) {
    _value = memScoped {
      val ptr = _value.ptr
      val ref = checkNotNull(Godot.gdnative.godot_variant_as_pool_string_array)(_value.ptr)
      val refValue = PoolStringArray(ref)
      cb(refValue)
      checkNotNull(Godot.gdnative.godot_variant_new_pool_string_array)(ptr, refValue._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun asPoolVector2Array(): PoolVector2Array {
    return memScoped {
      PoolVector2Array(
        checkNotNull(Godot.gdnative.godot_variant_as_pool_vector2_array)(_value.ptr)
      )
    }
  }

  fun asPoolVector2ArrayRef(cb: PoolVector2Array.() -> Unit) {
    _value = memScoped {
      val ptr = _value.ptr
      val ref = checkNotNull(Godot.gdnative.godot_variant_as_pool_vector2_array)(_value.ptr)
      val refValue = PoolVector2Array(ref)
      cb(refValue)
      checkNotNull(Godot.gdnative.godot_variant_new_pool_vector2_array)(ptr, refValue._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun asPoolVector3Array(): PoolVector3Array {
    return memScoped {
      PoolVector3Array(
        checkNotNull(Godot.gdnative.godot_variant_as_pool_vector3_array)(_value.ptr)
      )
    }
  }

  fun asPoolVector3ArrayRef(cb: PoolVector3Array.() -> Unit) {
    _value = memScoped {
      val ptr = _value.ptr
      val ref = checkNotNull(Godot.gdnative.godot_variant_as_pool_vector3_array)(_value.ptr)
      val refValue = PoolVector3Array(ref)
      cb(refValue)
      checkNotNull(Godot.gdnative.godot_variant_new_pool_vector3_array)(ptr, refValue._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun asQuat(): Quat {
    return memScoped {
      Quat(
        checkNotNull(Godot.gdnative.godot_variant_as_quat)(_value.ptr)
      )
    }
  }

  fun asQuatRef(cb: Quat.() -> Unit) {
    _value = memScoped {
      val ptr = _value.ptr
      val ref = checkNotNull(Godot.gdnative.godot_variant_as_quat)(_value.ptr)
      val refValue = Quat(ref)
      cb(refValue)
      checkNotNull(Godot.gdnative.godot_variant_new_quat)(ptr, refValue._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun asRID(): RID {
    return memScoped {
      RID(
        checkNotNull(Godot.gdnative.godot_variant_as_rid)(_value.ptr)
      )
    }
  }

  fun asVector2(): Vector2 {
    return memScoped {
      Vector2(
        checkNotNull(Godot.gdnative.godot_variant_as_vector2)(_value.ptr)
      )
    }
  }

  fun asVector2Ref(cb: Vector2.() -> Unit) {
    _value = memScoped {
      val ptr = _value.ptr
      val ref = checkNotNull(Godot.gdnative.godot_variant_as_vector2)(_value.ptr)
      val refValue = Vector2(ref)
      cb(refValue)
      checkNotNull(Godot.gdnative.godot_variant_new_vector2)(ptr, refValue._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun asVector3(): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_variant_as_vector3)(_value.ptr)
      )
    }
  }

  fun asVector3Ref(cb: Vector3.() -> Unit) {
    _value = memScoped {
      val ptr = _value.ptr
      val ref = checkNotNull(Godot.gdnative.godot_variant_as_vector3)(_value.ptr)
      val refValue = Vector3(ref)
      cb(refValue)
      checkNotNull(Godot.gdnative.godot_variant_new_vector3)(ptr, refValue._value.ptr)
      ptr.pointed.readValue()
    }
  }

  override fun toVariant(): Variant {
    return this
  }

  // TODO: this might be wrong
  override fun toGDString(): GDString {
    return asString()
  }

  companion object {
    fun new(str: GDString): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_string)(tmp.ptr, str._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(str: String): Variant {
      return new(GDString.new(str))
    }

    fun new(num: UInt64): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_uint)(tmp.ptr, num)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(num: Int64): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_int)(tmp.ptr, num)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(num: Double): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_real)(tmp.ptr, num)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(basis: Basis): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_basis)(tmp.ptr, basis._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(color: Color): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_color)(tmp.ptr, color._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(array: GDArray): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_array)(tmp.ptr, array._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(array: PoolByteArray): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_pool_byte_array)(tmp.ptr, array._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(array: PoolColorArray): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_pool_color_array)(tmp.ptr, array._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(array: PoolIntArray): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_pool_int_array)(tmp.ptr, array._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(array: PoolRealArray): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_pool_real_array)(tmp.ptr, array._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(array: PoolStringArray): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_pool_string_array)(tmp.ptr, array._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(array: PoolVector2Array): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_pool_vector2_array)(tmp.ptr, array._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(array: PoolVector3Array): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_pool_vector3_array)(tmp.ptr, array._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(quat: Quat): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_quat)(tmp.ptr, quat._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(rid: RID): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_rid)(tmp.ptr, rid._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(vec: Vector2): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_vector2)(tmp.ptr, vec._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }

    fun new(vec: Vector3): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        checkNotNull(Godot.gdnative.godot_variant_new_vector3)(tmp.ptr, vec._value.ptr)
        tmp.readValue()
      }
      return Variant(value)
    }
  }
}