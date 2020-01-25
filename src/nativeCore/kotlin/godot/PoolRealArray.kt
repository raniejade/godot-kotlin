package godot

import gdnative.godot_error
import gdnative.godot_pool_real_array
import kotlinx.cinterop.*

class PoolRealArray(
  value: CValue<godot_pool_real_array>
) : Primitive<godot_pool_real_array>(value), Iterable<Float> {
  fun append(real: Float) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_real_array_append)(ptr, real)
      ptr.pointed.readValue()
    }
  }

  fun append(array: PoolRealArray) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_real_array_append_array)(ptr, array._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun insert(index: Int, real: Float): godot_error {
    lateinit var ret: godot_error
    _value = memScoped {
      val ptr = _value.ptr
      ret = checkNotNull(Godot.gdnative.godot_pool_real_array_insert)(ptr, index, real)
      ptr.pointed.readValue()
    }
    return ret
  }

  fun invert() {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_real_array_invert)(ptr)
      ptr.pointed.readValue()
    }
  }

  fun remove(index: Int) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_real_array_remove)(ptr, index)
      ptr.pointed.readValue()
    }
  }

  fun resize(size: Int) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_real_array_resize)(ptr, size)
      ptr.pointed.readValue()
    }
  }

  operator fun set(index: Int, real: Float) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_real_array_set)(ptr, index, real)
      ptr.pointed.readValue()
    }
  }

  operator fun get(index: Int): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_pool_real_array_get)(_value.ptr, index)
    }
  }

  override fun toVariant(): Variant {
    return Variant.new(this)
  }

  override fun toGDString(): GDString {
    return GDString.new("PoolRealArray(${size()})")
  }

  fun size(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_pool_real_array_size)(_value.ptr)
    }
  }

  override fun iterator(): Iterator<Float> {
    return IndexedIterator(size(), this::get)
  }

  companion object {
    fun new(): PoolRealArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_real_array>()
        checkNotNull(Godot.gdnative.godot_pool_real_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolRealArray(value)
    }

    fun new(from: GDArray): PoolRealArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_real_array>()
        checkNotNull(Godot.gdnative.godot_pool_real_array_new_with_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return PoolRealArray(value)
    }
  }
}
