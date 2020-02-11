package godot.core

import gdnative.godot_array
import godot.Object
import godot.toVariant
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.readValue

class VariantArray(
  value: CValue<godot_array>
): CoreType<godot_array>(value) {

  constructor(): this(__new())
  constructor(from: PoolByteArray): this(__new(from))
  constructor(from: PoolColorArray): this(__new(from))
  constructor(from: PoolIntArray): this(__new(from))
  constructor(from: PoolFloatArray): this(__new(from))
  constructor(from: PoolStringArray): this(__new(from))
  constructor(from: PoolVector2Array): this(__new(from))
  constructor(from: PoolVector3Array): this(__new(from))

  fun append(value: Int) {
    append(Variant(value))
  }

  fun append(value: Float) {
    append(Variant(value))
  }

  fun append(value: Boolean) {
    append(Variant(value))
  }

  fun append(value: String) {
    append(Variant(value))
  }

  fun  append(value: Object) {
    append(value.toVariant())
  }

  fun append(value: CoreType<*>) {
    append(value.toVariant())
  }

  fun append(value: Variant) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_append)(_value.ptr, value._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun back(): Variant {
    return Allocator.allocationScope {
      Variant(
        checkNotNull(Godot.gdnative.godot_array_back)(_value.ptr)
      )
    }
  }

  fun bsearch(value: Variant, before: Boolean = true): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_array_bsearch)(_value.ptr, value._value.ptr, before)
    }
  }

  fun bsearch(value: Int, before: Boolean = true) = bsearch(Variant(value), before)
  fun bsearch(value: Float, before: Boolean = true) = bsearch(Variant(value), before)
  fun bsearch(value: String, before: Boolean = true) = bsearch(Variant(value), before)
  fun bsearch(value: Boolean, before: Boolean = true) = bsearch(Variant(value), before)
  fun bsearch(value: Object, before: Boolean = true) = bsearch(value.toVariant(), before)
  fun bsearch(value: CoreType<*>, before: Boolean = true) = bsearch(value.toVariant(), before)

  fun clear() {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_clear)(_value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun has(value: Variant): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_array_has)(_value.ptr, value._value.ptr)
    }
  }

  fun has(value: Int) = has(Variant(value))
  fun has(value: Float) = has(Variant(value))
  fun has(value: String) = has(Variant(value))
  fun has(value: Boolean) = has(Variant(value))
  fun has(value: Object) = has(value.toVariant())
  fun has(value: CoreType<*>) = has(value.toVariant())

  fun copy(deep: Boolean = false): VariantArray {
    return Allocator.allocationScope {
      VariantArray(
        checkNotNull(Godot.gdnative11.godot_array_duplicate)(_value.ptr, deep)
      )
    }
  }

  fun count(value: Variant): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_array_count)(_value.ptr, value._value.ptr)
    }
  }

  fun count(value: Int) = count(Variant(value))
  fun count(value: Float) = count(Variant(value))
  fun count(value: String) = count(Variant(value))
  fun count(value: Boolean) = count(Variant(value))
  fun count(value: Object) = count(value.toVariant())
  fun count(value: CoreType<*>) = count(value.toVariant())

  fun find(value: Variant, from: Int = 0): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_array_find)(_value.ptr, value._value.ptr, from)
    }
  }

  fun find(value: Int, from: Int = 0) = find(Variant(value))
  fun find(value: Float, from: Int = 0) = find(Variant(value))
  fun find(value: String, from: Int = 0) = find(Variant(value))
  fun find(value: Boolean, from: Int = 0) = find(Variant(value))
  fun find(value: Object, from: Int = 0) = find(value.toVariant())
  fun find(value: CoreType<*>, from: Int = 0) = find(value.toVariant())

  fun findLast(value: Variant): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_array_find_last)(_value.ptr, value._value.ptr)
    }
  }

  fun findLast(value: Int) = findLast(Variant(value))
  fun findLast(value: Float) = findLast(Variant(value))
  fun findLast(value: String) = findLast(Variant(value))
  fun findLast(value: Boolean) = findLast(Variant(value))
  fun findLast(value: Object) = findLast(value.toVariant())
  fun findLast(value: CoreType<*>) = findLast(value.toVariant())

  fun hash(): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_array_hash)(_value.ptr)
    }
  }

  fun empty(): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_array_empty)(_value.ptr)
    }
  }

  fun insert(index: Int, value: Variant) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_insert)(_value.ptr, index, value._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun insert(index: Int, value: Int) = insert(index, Variant(value))
  fun insert(index: Int, value: Float) = insert(index, Variant(value))
  fun insert(index: Int, value: String) = insert(index, Variant(value))
  fun insert(index: Int, value: Boolean) = insert(index, Variant(value))
  fun insert(index: Int, value: Object) = insert(index, value.toVariant())
  fun insert(index: Int, value: CoreType<*>) = insert(index, value.toVariant())

  fun invert() {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_invert)(_value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun max(): Variant {
    return Allocator.allocationScope {
      Variant(
        checkNotNull(Godot.gdnative11.godot_array_max)(_value.ptr)
      )
    }
  }

  fun min(): Variant {
    return Allocator.allocationScope {
      Variant(
        checkNotNull(Godot.gdnative11.godot_array_min)(_value.ptr)
      )
    }
  }

  fun popBack(): Variant {
    lateinit var ret: Variant
    _value = Allocator.allocationScope {
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
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      ret = Variant(
        checkNotNull(Godot.gdnative.godot_array_pop_back)(_value.ptr)
      )
      ptr.pointed.readValue()
    }
    return ret
  }

  fun pushFront(value: Variant) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_push_front)(_value.ptr, value._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun pushFront(value: Int) = pushFront(Variant(value))
  fun pushFront(value: Float) = pushFront(Variant(value))
  fun pushFront(value: String) = pushFront(Variant(value))
  fun pushFront(value: Boolean) = pushFront(Variant(value))
  fun pushFront(value: Object) = pushFront(value.toVariant())
  fun pushFront(value: CoreType<*>) = pushFront(value.toVariant())

  fun pushBack(value: Variant) {
    append(value)
  }

  fun pushBack(value: Int) = pushBack(Variant(value))
  fun pushBack(value: Float) = pushBack(Variant(value))
  fun pushBack(value: String) = pushBack(Variant(value))
  fun pushBack(value: Boolean) = pushBack(Variant(value))
  fun pushBack(value: Object) = pushBack(value.toVariant())
  fun pushBack(value: CoreType<*>) = pushBack(value.toVariant())

  fun erase(value: Variant) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_erase)(_value.ptr, value._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun erase(value: Int) = erase(Variant(value))
  fun erase(value: Float) = erase(Variant(value))
  fun erase(value: String) = erase(Variant(value))
  fun erase(value: Boolean) = erase(Variant(value))
  fun erase(value: Object) = erase(value.toVariant())
  fun erase(value: CoreType<*>) = erase(value.toVariant())


  fun remove(index: Int) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_remove)(_value.ptr, index)
      ptr.pointed.readValue()
    }
  }

  fun sort() {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_sort)(_value.ptr)
      ptr.pointed.readValue()
    }
  }

  operator fun get(index: Int): Variant {
    return Allocator.allocationScope {
      val ptr = checkNotNull(Godot.gdnative.godot_array_operator_index_const)(_value.ptr, index)
      Variant(checkNotNull(ptr).pointed.readValue())
    }
  }

  @Suppress("UNCHECKED_CAST")
  fun <T: CoreType<*>> get(index: Int, cb: T.() -> Unit) {
    val value = get(index).toAny() as T
    cb(value)
    set(index, value)
  }

  operator fun set(index: Int, value: Variant) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_array_set)(ptr, index, value._value.ptr)
      ptr.pointed.readValue()
    }
  }

  operator fun set(index: Int, value: Int) = set(index, Variant(value))
  operator fun set(index: Int, value: Float) = set(index, Variant(value))
  operator fun set(index: Int, value: String) = set(index, Variant(value))
  operator fun set(index: Int, value: Boolean) = set(index, Variant(value))
  operator fun set(index: Int, value: Object) = set(index, value.toVariant())
  operator fun set(index: Int, value: CoreType<*>) = set(index, value.toVariant())

  operator fun <T: CoreType<*>> set(index: Int, value: T) {
    set(index, value.toVariant())
  }

  override fun toVariant(): Variant {
    return Variant(this)
  }

  override fun toGDString(): GDString {
    return GDString("GDArray()")
  }

  companion object {
    internal fun __new() = allocType2<godot_array> {
      checkNotNull(Godot.gdnative.godot_array_new)(it)
    }

    internal fun __new(from: PoolByteArray) = allocType2<godot_array> {
      checkNotNull(Godot.gdnative.godot_array_new_pool_byte_array)(it, from._value.ptr)
    }

    internal fun __new(from: PoolColorArray) = allocType2<godot_array> {
      checkNotNull(Godot.gdnative.godot_array_new_pool_color_array)(it, from._value.ptr)
    }


    internal fun __new(from: PoolIntArray) = allocType2<godot_array> {
      checkNotNull(Godot.gdnative.godot_array_new_pool_int_array)(it, from._value.ptr)
    }

    internal fun __new(from: PoolFloatArray) = allocType2<godot_array> {
      checkNotNull(Godot.gdnative.godot_array_new_pool_real_array)(it, from._value.ptr)
    }

    internal fun __new(from: PoolStringArray) = allocType2<godot_array> {
      checkNotNull(Godot.gdnative.godot_array_new_pool_string_array)(it, from._value.ptr)
    }

    internal fun __new(from: PoolVector2Array) = allocType2<godot_array> {
      checkNotNull(Godot.gdnative.godot_array_new_pool_vector2_array)(it, from._value.ptr)
    }

    internal fun __new(from: PoolVector3Array) = allocType2<godot_array> {
      checkNotNull(Godot.gdnative.godot_array_new_pool_vector3_array)(it, from._value.ptr)
    }
  }
}
