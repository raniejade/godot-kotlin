package godot

import gdnative.godot_array
import kotlinx.cinterop.*

class GDArray(
  value: CValue<godot_array>
): Primitive<godot_array>(value) {

  override fun toGDString(): GDString {
    return GDString.new("GDArray()")
  }

  companion object {
    fun new(): GDArray {
      val value = memScoped {
        val tmp = alloc<godot_array>()
        checkNotNull(Godot.gdnative.godot_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return GDArray(value)
    }

    fun new(from: PoolByteArray): GDArray {
      val value = memScoped {
        val tmp = alloc<godot_array>()
        checkNotNull(Godot.gdnative.godot_array_new_pool_byte_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return GDArray(value)
    }

    fun new(from: PoolColorArray): GDArray {
      val value = memScoped {
        val tmp = alloc<godot_array>()
        checkNotNull(Godot.gdnative.godot_array_new_pool_color_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return GDArray(value)
    }

    fun new(from: PoolIntArray): GDArray {
      val value = memScoped {
        val tmp = alloc<godot_array>()
        checkNotNull(Godot.gdnative.godot_array_new_pool_int_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return GDArray(value)
    }

    fun new(from: PoolRealArray): GDArray {
      val value = memScoped {
        val tmp = alloc<godot_array>()
        checkNotNull(Godot.gdnative.godot_array_new_pool_real_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return GDArray(value)
    }

    fun new(from: PoolStringArray): GDArray {
      val value = memScoped {
        val tmp = alloc<godot_array>()
        checkNotNull(Godot.gdnative.godot_array_new_pool_string_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return GDArray(value)
    }

    fun new(from: PoolVector2Array): GDArray {
      val value = memScoped {
        val tmp = alloc<godot_array>()
        checkNotNull(Godot.gdnative.godot_array_new_pool_vector2_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return GDArray(value)
    }

    fun new(from: PoolVector3Array): GDArray {
      val value = memScoped {
        val tmp = alloc<godot_array>()
        checkNotNull(Godot.gdnative.godot_array_new_pool_vector3_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return GDArray(value)
    }
  }
}
