package godot

import gdnative.godot_error
import gdnative.godot_pool_vector2_array
import kotlinx.cinterop.*

class PoolVector2Array(
  value: CValue<godot_pool_vector2_array>
) : Primitive<godot_pool_vector2_array>(value), Iterable<Vector2> {
  fun append(vec: Vector2) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector2_array_append)(ptr, vec._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun append(array: PoolVector2Array) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector2_array_append_array)(ptr, array._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun insert(index: Int, vec: Vector2): godot_error {
    lateinit var ret: godot_error
    _value = memScoped {
      val ptr = _value.ptr
      ret = checkNotNull(Godot.gdnative.godot_pool_vector2_array_insert)(ptr, index, vec._value.ptr)
      ptr.pointed.readValue()
    }
    return ret
  }

  fun invert() {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector2_array_invert)(ptr)
      ptr.pointed.readValue()
    }
  }

  fun remove(index: Int) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector2_array_remove)(ptr, index)
      ptr.pointed.readValue()
    }
  }

  fun resize(size: Int) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector2_array_resize)(ptr, size)
      ptr.pointed.readValue()
    }
  }

  operator fun set(index: Int, vec: Vector2) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector2_array_set)(ptr, index, vec._value.ptr)
      ptr.pointed.readValue()
    }
  }

  operator fun get(index: Int): Vector2 {
    return memScoped {
      Vector2(
        checkNotNull(Godot.gdnative.godot_pool_vector2_array_get)(_value.ptr, index)
      )
    }
  }

  fun size(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_pool_vector2_array_size)(_value.ptr)
    }
  }

  override fun toVariant(): Variant {
    return Variant.new(this)
  }

  override fun toGDString(): GDString {
    return GDString.new("PoolVector2Array(${size()})")
  }

  override fun iterator(): Iterator<Vector2> {
    return IndexedIterator(size(), this::get)
  }

  companion object {
    fun new(): PoolVector2Array {
      val value = memScoped {
        val tmp = alloc<godot_pool_vector2_array>()
        checkNotNull(Godot.gdnative.godot_pool_vector2_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolVector2Array(value)
    }

    fun new(from: GDArray): PoolVector2Array {
      val value = memScoped {
        val tmp = alloc<godot_pool_vector2_array>()
        checkNotNull(Godot.gdnative.godot_pool_vector2_array_new_with_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return PoolVector2Array(value)
    }
  }
}
