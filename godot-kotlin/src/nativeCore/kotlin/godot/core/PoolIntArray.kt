package godot.core

import gdnative.godot_error
import gdnative.godot_pool_int_array
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.readValue

class PoolIntArray(
  value: CValue<godot_pool_int_array>
) : CoreType<godot_pool_int_array>(value), Iterable<Int> {
  constructor(): this(__new())
  constructor(from: VariantArray): this(__new(from))

  fun append(int: Int) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_int_array_append)(ptr, int)
      ptr.pointed.readValue()
    }
  }

  fun append(array: PoolIntArray) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_int_array_append_array)(ptr, array._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun insert(index: Int, int: Int): godot_error {
    lateinit var ret: godot_error
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      ret = checkNotNull(Godot.gdnative.godot_pool_int_array_insert)(ptr, index, int)
      ptr.pointed.readValue()
    }
    return ret
  }

  fun invert() {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_int_array_invert)(ptr)
      ptr.pointed.readValue()
    }
  }

  fun remove(index: Int) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_int_array_remove)(ptr, index)
      ptr.pointed.readValue()
    }
  }

  fun resize(size: Int) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_int_array_resize)(ptr, size)
      ptr.pointed.readValue()
    }
  }

  operator fun set(index: Int, int: Int) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_int_array_set)(ptr, index, int)
      ptr.pointed.readValue()
    }
  }

  operator fun get(index: Int): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_pool_int_array_get)(_value.ptr, index)
    }
  }

  fun size(): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_pool_int_array_size)(_value.ptr)
    }
  }

  override fun toVariant(): Variant {
    return Variant(this)
  }

  override fun toGDString(): GDString {
    return GDString("PoolIntArray(${size()})")
  }

  override fun iterator(): Iterator<Int> {
    return IndexedIterator(size(), this::get)
  }

  companion object {
    internal fun __new() = allocType2<godot_pool_int_array> {
      checkNotNull(Godot.gdnative.godot_pool_int_array_new)(it)
    }

    internal fun __new(from: VariantArray) = allocType2<godot_pool_int_array> {
      checkNotNull(Godot.gdnative.godot_pool_int_array_new_with_array)(it, from._value.ptr)
    }
  }
}
