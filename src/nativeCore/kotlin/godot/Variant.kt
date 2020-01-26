package godot

import gdnative.godot_variant
import gdnative.godot_variant_type
import kotlinx.cinterop.*

class Variant(
  value: CValue<godot_variant>
): Primitive<godot_variant>(value) {

  enum class Type {
    VECTOR2
  }

  internal val type: godot_variant_type
    get() {
      return memScoped {
        checkNotNull(Godot.gdnative.godot_variant_get_type)(_value.ptr)
      }
    }

  fun asString(): String {
    return memScoped {
      val gdString = GDString(
        checkNotNull(Godot.gdnative.godot_variant_as_string)(_value.ptr)
      )
      val ret = gdString.toKString()
      gdString.destroy()
      ret
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

  fun asColor(): Color {
    return memScoped {
      Color(
        checkNotNull(Godot.gdnative.godot_variant_as_color)(_value.ptr)
      )
    }
  }

  fun asArray(): GDArray {
    return memScoped {
      GDArray(
        checkNotNull(Godot.gdnative.godot_variant_as_array)(_value.ptr)
      )
    }
  }

  fun asPoolByteArray(): PoolByteArray {
    return memScoped {
      PoolByteArray(
        checkNotNull(Godot.gdnative.godot_variant_as_pool_byte_array)(_value.ptr)
      )
    }
  }

  fun asPoolColorArray(): PoolColorArray {
    return memScoped {
      PoolColorArray(
        checkNotNull(Godot.gdnative.godot_variant_as_pool_color_array)(_value.ptr)
      )
    }
  }

  fun asPoolIntArray(): PoolIntArray {
    return memScoped {
      PoolIntArray(
        checkNotNull(Godot.gdnative.godot_variant_as_pool_int_array)(_value.ptr)
      )
    }
  }

  fun asPoolRealArray(): PoolRealArray {
    return memScoped {
      PoolRealArray(
        checkNotNull(Godot.gdnative.godot_variant_as_pool_real_array)(_value.ptr)
      )
    }
  }

  fun asPoolStringArray(): PoolStringArray {
    return memScoped {
      PoolStringArray(
        checkNotNull(Godot.gdnative.godot_variant_as_pool_string_array)(_value.ptr)
      )
    }
  }

  fun asPoolVector2Array(): PoolVector2Array {
    return memScoped {
      PoolVector2Array(
        checkNotNull(Godot.gdnative.godot_variant_as_pool_vector2_array)(_value.ptr)
      )
    }
  }

  fun asPoolVector3Array(): PoolVector3Array {
    return memScoped {
      PoolVector3Array(
        checkNotNull(Godot.gdnative.godot_variant_as_pool_vector3_array)(_value.ptr)
      )
    }
  }

  fun asQuat(): Quat {
    return memScoped {
      Quat(
        checkNotNull(Godot.gdnative.godot_variant_as_quat)(_value.ptr)
      )
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

  fun asVector3(): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_variant_as_vector3)(_value.ptr)
      )
    }
  }

  override fun toVariant(): Variant {
    return this
  }

  // TODO: this might be wrong, make variant not a primitive type
  override fun toGDString(): GDString {
    return GDString.new(asString())
  }

  companion object {
    fun new(str: String): Variant {
      val value = memScoped {
        val tmp = alloc<godot_variant>()
        GDString.from(str) {
          checkNotNull(Godot.gdnative.godot_variant_new_string)(tmp.ptr, it._value.ptr)
        }
        tmp.readValue()
      }
      return Variant(value)
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