package godot.core

import gdnative.godot_error
import gdnative.godot_pool_vector3_array
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.readValue

class PoolVector3Array(
  value: CValue<godot_pool_vector3_array>
): CoreType<godot_pool_vector3_array>(value), Iterable<Vector3> {

  constructor(): this(__new())
  constructor(from: VariantArray): this(__new(from))

  fun append(vec: Vector3) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_append)(ptr, vec._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun append(array: PoolVector3Array) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_append_array)(ptr, array._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun insert(index: Int, vec: Vector3): godot_error {
    lateinit var ret: godot_error
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      ret = checkNotNull(Godot.gdnative.godot_pool_vector3_array_insert)(ptr, index, vec._value.ptr)
      ptr.pointed.readValue()
    }
    return ret
  }

  fun invert() {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_invert)(ptr)
      ptr.pointed.readValue()
    }
  }

  fun remove(index: Int) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_remove)(ptr, index)
      ptr.pointed.readValue()
    }
  }

  fun resize(size: Int) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_resize)(ptr, size)
      ptr.pointed.readValue()
    }
  }

  operator fun set(index: Int, vec: Vector3) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_set)(ptr, index, vec._value.ptr)
      ptr.pointed.readValue()
    }
  }

  operator fun get(index: Int): Vector3 {
    return Allocator.allocationScope {
      Vector3(
        checkNotNull(Godot.gdnative.godot_pool_vector3_array_get)(_value.ptr, index)
      )
    }
  }

  fun size(): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_size)(_value.ptr)
    }
  }

  override fun iterator(): Iterator<Vector3> {
    return IndexedIterator(size(), this::get)
  }

  override fun toVariant(): Variant {
    return Variant(this)
  }

  override fun toGDString(): GDString {
    return GDString("PoolVector3Array(${size()})")
  }

  companion object {
    internal fun __new() = allocType2<godot_pool_vector3_array> {
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_new)(it)
    }

    internal fun __new(from: VariantArray) = allocType2<godot_pool_vector3_array> {
      checkNotNull(Godot.gdnative.godot_pool_vector3_array_new_with_array)(it, from._value.ptr)
    }
  }
}
