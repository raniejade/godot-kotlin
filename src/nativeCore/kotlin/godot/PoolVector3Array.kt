package godot

import gdnative.godot_error
import gdnative.godot_pool_vector3_array
import kotlinx.cinterop.*

class PoolVector3Array(
  value: CValue<godot_pool_vector3_array>
): Primitive<godot_pool_vector3_array>(value), Iterable<Vector3> {
  fun append(vec: Vector3) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_append)(ptr, vec._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun append(array: PoolVector3Array) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_append_array)(ptr, array._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun insert(index: Int, vec: Vector3): godot_error {
    lateinit var ret: godot_error
    _value = memScoped {
      val ptr = _value.ptr
      ret = checkNotNull(Godot.gdnative.godot_pool_vector3_array_insert)(ptr, index, vec._value.ptr)
      ptr.pointed.readValue()
    }
    return ret
  }

  fun invert() {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_invert)(ptr)
      ptr.pointed.readValue()
    }
  }

  fun remove(index: Int) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_remove)(ptr, index)
      ptr.pointed.readValue()
    }
  }

  fun resize(size: Int) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_resize)(ptr, size)
      ptr.pointed.readValue()
    }
  }

  operator fun set(index: Int, vec: Vector3) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_set)(ptr, index, vec._value.ptr)
      ptr.pointed.readValue()
    }
  }

  operator fun get(index: Int): Vector3 {
    return memScoped {
      Vector3(
        checkNotNull(Godot.gdnative.godot_pool_vector3_array_get)(_value.ptr, index)
      )
    }
  }

  fun size(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_size)(_value.ptr)
    }
  }

  override fun iterator(): Iterator<Vector3> {
    return IndexedIterator(size(), this::get)
  }

  override fun toGDString(): GDString {
    return GDString.new("PoolVector3Array(${size()})")
  }

  companion object {
    fun new(): PoolVector3Array {
      val value = memScoped {
        val tmp = alloc<godot_pool_vector3_array>()
        checkNotNull(Godot.gdnative.godot_pool_vector3_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolVector3Array(value)
    }

    fun new(from: GDArray): PoolVector3Array {
      val value = memScoped {
        val tmp = alloc<godot_pool_vector3_array>()
        checkNotNull(Godot.gdnative.godot_pool_vector3_array_new_with_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return PoolVector3Array(value)
    }
  }
}
