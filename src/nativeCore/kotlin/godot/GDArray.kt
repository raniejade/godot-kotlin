package godot

import gdnative.godot_array
import kotlinx.cinterop.*

class GDArray(
  value: CValue<godot_array>
): Primitive<godot_array>(value) {

  fun append(value: Variant) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_append)(_value.ptr, value._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun back(): Variant {
    return memScoped {
      Variant(
        checkNotNull(Godot.gdnative.godot_array_back)(_value.ptr)
      )
    }
  }

  fun binarySearch(value: Variant, before: Boolean = true): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_array_bsearch)(_value.ptr, value._value.ptr, before)
    }
  }

  fun clear() {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_clear)(_value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun contains(value: Variant): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_array_has)(_value.ptr, value._value.ptr)
    }
  }

  fun copy(deep: Boolean = false): GDArray {
    return memScoped {
      GDArray(
        checkNotNull(Godot.gdnative11.godot_array_duplicate)(_value.ptr, deep)
      )
    }
  }

  fun count(value: Variant): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_array_count)(_value.ptr, value._value.ptr)
    }
  }

  fun find(value: Variant, from: Int = 0): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_array_find)(_value.ptr, value._value.ptr, from)
    }
  }

  fun findLast(value: Variant): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_array_find_last)(_value.ptr, value._value.ptr)
    }
  }

  fun hash(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_array_hash)(_value.ptr)
    }
  }

  fun isEmpty(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_array_empty)(_value.ptr)
    }
  }

  fun insert(index: Int, value: Variant) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_insert)(_value.ptr, index, value._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun invert() {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_invert)(_value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun max(): Variant {
    return memScoped {
      Variant(
        checkNotNull(Godot.gdnative11.godot_array_max)(_value.ptr)
      )
    }
  }

  fun min(): Variant {
    return memScoped {
      Variant(
        checkNotNull(Godot.gdnative11.godot_array_min)(_value.ptr)
      )
    }
  }

  fun popBack(): Variant {
    lateinit var ret: Variant
    _value = memScoped {
      val ptr = _value.ptr
      ret = Variant(
        checkNotNull(Godot.gdnative.godot_array_pop_back)(_value.ptr)
      )
      ptr.pointed.readValue()
    }
    return ret
  }

  fun popFront(): Variant {
    lateinit var ret: Variant
    _value = memScoped {
      val ptr = _value.ptr
      ret = Variant(
        checkNotNull(Godot.gdnative.godot_array_pop_back)(_value.ptr)
      )
      ptr.pointed.readValue()
    }
    return ret
  }

  fun pushFront(value: Variant) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_push_front)(_value.ptr, value._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun remove(value: Variant) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_erase)(_value.ptr, value._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun remove(index: Int) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_remove)(_value.ptr, index)
      ptr.pointed.readValue()
    }
  }

  fun sort() {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_sort)(_value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun get(index: Int): Variant {
    return memScoped {
      val ptr = checkNotNull(Godot.gdnative.godot_array_operator_index_const)(_value.ptr, index)
      Variant(checkNotNull(ptr).pointed.readValue())
    }
  }

  fun getRef(index: Int, cb: Variant.() -> Unit) {
    return memScoped {
      val ptr = _value.ptr
      val ref = checkNotNull(Godot.gdnative.godot_array_operator_index)(ptr, index)!!
      val variant = Variant(ref.pointed.readValue())
      cb(variant)
      variant._value.write(ref.rawValue)
    }
  }

  fun set(index: Int, value: Variant) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_set)(ptr, index, value._value.ptr)
      ptr.pointed.readValue()
    }
  }

  override fun toVariant(): Variant {
    return Variant.new(this)
  }

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
