package godot.core

import gdnative.godot_error
import gdnative.godot_pool_string_array
import kotlinx.cinterop.*

class PoolStringArray(
  value: CValue<godot_pool_string_array>
) : CoreType<godot_pool_string_array>(value), Iterable<String> {
  fun append(string: String) {
    _value = memScoped {
      val ptr = _value.ptr
      GDString.from(string) {
        checkNotNull(Godot.gdnative.godot_pool_string_array_append)(ptr, it._value.ptr)
      }
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

  fun destroy() {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_pool_string_array_destroy)(_value.ptr)
    }
  }

  fun insert(index: Int, string: String): godot_error {
    lateinit var ret: godot_error
    _value = memScoped {
      val ptr = _value.ptr
      GDString.from(string) {
        ret = checkNotNull(Godot.gdnative.godot_pool_string_array_insert)(ptr, index, it._value.ptr)
      }
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

  operator fun set(index: Int, string: String) {
    _value = memScoped {
      val ptr = _value.ptr
      GDString.from(string) {
        checkNotNull(Godot.gdnative.godot_pool_string_array_set)(ptr, index, it._value.ptr)
      }
      ptr.pointed.readValue()
    }
  }

  operator fun get(index: Int): String {
    return memScoped {
      val gdString = GDString(
        checkNotNull(Godot.gdnative.godot_pool_string_array_get)(_value.ptr, index)
      )
      val ret = gdString.toKString()
      gdString.destroy()
      ret
    }
  }

  fun size(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_pool_string_array_size)(_value.ptr)
    }
  }

  override fun toVariant(): Variant {
    return Variant.new(this)
  }

  override fun toGDString(): GDString {
    return GDString.new("PoolStringArray(${size()})")
  }

  override fun iterator(): Iterator<String> {
    return IndexedIterator(size(), this::get)
  }
  
  companion object {
    fun new(): PoolStringArray {
      return allocType(::PoolStringArray) {
        checkNotNull(Godot.gdnative.godot_pool_string_array_new)(it)
      }
    }

    fun new(from: VariantArray): PoolStringArray {
      return allocType(::PoolStringArray) {
        checkNotNull(Godot.gdnative.godot_pool_string_array_new_with_array)(it, from._value.ptr)
      }
    }
  }
}
