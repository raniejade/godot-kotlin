package godot

import gdnative.godot_error
import gdnative.godot_pool_string_array
import kotlinx.cinterop.*

class PoolStringArray(
  value: CValue<godot_pool_string_array>
) : Primitive<godot_pool_string_array>(value), Iterable<GDString> {
  fun append(string: GDString) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_string_array_append)(ptr, string._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun append(array: PoolStringArray) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_string_array_append_array)(ptr, array._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun insert(index: Int, string: GDString): godot_error {
    lateinit var ret: godot_error
    _value = memScoped {
      val ptr = _value.ptr
      ret = checkNotNull(Godot.gdnative.godot_pool_string_array_insert)(ptr, index, string._value.ptr)
      ptr.pointed.readValue()
    }
    return ret
  }

  fun invert() {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_string_array_invert)(ptr)
      ptr.pointed.readValue()
    }
  }

  fun remove(index: Int) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_string_array_remove)(ptr, index)
      ptr.pointed.readValue()
    }
  }

  fun resize(size: Int) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_string_array_resize)(ptr, size)
      ptr.pointed.readValue()
    }
  }

  operator fun set(index: Int, string: GDString) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_pool_string_array_set)(ptr, index, string._value.ptr)
      ptr.pointed.readValue()
    }
  }

  operator fun get(index: Int): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_pool_string_array_get)(_value.ptr, index)
      )
    }
  }

  fun size(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_pool_string_array_size)(_value.ptr)
    }
  }

  override fun iterator(): Iterator<GDString> {
    return IndexedIterator(size(), this::get)
  }
  
  companion object {
    fun new(): PoolStringArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_string_array>()
        checkNotNull(Godot.gdnative.godot_pool_string_array_new)(tmp.ptr)
        tmp.readValue()
      }
      return PoolStringArray(value)
    }

    fun new(from: GDArray): PoolStringArray {
      val value = memScoped {
        val tmp = alloc<godot_pool_string_array>()
        checkNotNull(Godot.gdnative.godot_pool_string_array_new_with_array)(tmp.ptr, from._value.ptr)
        tmp.readValue()
      }
      return PoolStringArray(value)
    }
  }
}
