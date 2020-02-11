package godot.core

import gdnative.godot_dictionary
import godot.Object
import godot.toVariant
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.readValue

class Dictionary(
  value: CValue<godot_dictionary>
) : CoreType<godot_dictionary>(value) {
  constructor(): this(__new())

  fun clear() {
    Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_dictionary_clear)(_value.ptr)
    }
  }

  fun duplicate(deep: Boolean = false): Dictionary {
    return Allocator.allocationScope {
      Dictionary(
        checkNotNull(Godot.gdnative12.godot_dictionary_duplicate)(_value.ptr, deep)
      )
    }
  }

  fun empty(): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_dictionary_empty)(_value.ptr)
    }
  }

  fun erase(key: Variant) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_dictionary_erase)(ptr, key._value.ptr)
      ptr.pointed.readValue()
    }
  }

  fun erase(key: Int) = erase(Variant(key))
  fun erase(key: Float) = erase(Variant(key))
  fun erase(key: String) = erase(Variant(key))
  fun erase(key: Boolean) = erase(Variant(key))
  fun erase(key: Object) = erase(key.toVariant())
  fun erase(key: CoreType<*>) = erase(key.toVariant())

  fun getOrDefault(key: Variant, default: Variant = Variant()): Variant {
    return Allocator.allocationScope {
      Variant(
        checkNotNull(Godot.gdnative11.godot_dictionary_get_with_default)(_value.ptr, key._value.ptr, default._value.ptr)
      )
    }
  }

  fun getOrDefault(key: Int, default: Variant) = getOrDefault(Variant(key), default)
  fun getOrDefault(key: Int, default: Int) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: Int, default: Float) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: Int, default: String) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: Int, default: Boolean) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: Int, default: Object) = getOrDefault(Variant(key), default.toVariant())
  fun getOrDefault(key: Int, default: CoreType<*>) = getOrDefault(Variant(key), default.toVariant())

  fun getOrDefault(key: Float, default: Variant) = getOrDefault(Variant(key), default)
  fun getOrDefault(key: Float, default: Int) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: Float, default: Float) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: Float, default: String) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: Float, default: Boolean) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: Float, default: Object) = getOrDefault(Variant(key), default.toVariant())
  fun getOrDefault(key: Float, default: CoreType<*>) = getOrDefault(Variant(key), default.toVariant())

  fun getOrDefault(key: String, default: Variant) = getOrDefault(Variant(key), default)
  fun getOrDefault(key: String, default: Int) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: String, default: Float) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: String, default: String) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: String, default: Boolean) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: String, default: Object) = getOrDefault(Variant(key), default.toVariant())
  fun getOrDefault(key: String, default: CoreType<*>) = getOrDefault(Variant(key), default.toVariant())

  fun getOrDefault(key: Boolean, default: Variant) = getOrDefault(Variant(key), default)
  fun getOrDefault(key: Boolean, default: Int) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: Boolean, default: Float) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: Boolean, default: String) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: Boolean, default: Boolean) = getOrDefault(Variant(key), Variant(default))
  fun getOrDefault(key: Boolean, default: Object) = getOrDefault(Variant(key), default.toVariant())
  fun getOrDefault(key: Boolean, default: CoreType<*>) = getOrDefault(Variant(key), default.toVariant())

  fun getOrDefault(key: Object, default: Variant) = getOrDefault(key.toVariant(), default)
  fun getOrDefault(key: Object, default: Int) = getOrDefault(key.toVariant(), Variant(default))
  fun getOrDefault(key: Object, default: Float) = getOrDefault(key.toVariant(), Variant(default))
  fun getOrDefault(key: Object, default: String) = getOrDefault(key.toVariant(), Variant(default))
  fun getOrDefault(key: Object, default: Boolean) = getOrDefault(key.toVariant(), Variant(default))
  fun getOrDefault(key: Object, default: Object) = getOrDefault(key.toVariant(), default.toVariant())
  fun getOrDefault(key: Object, default: CoreType<*>) = getOrDefault(key.toVariant(), default.toVariant())

  fun getOrDefault(key: CoreType<*>, default: Variant) = getOrDefault(key.toVariant(), default)
  fun getOrDefault(key: CoreType<*>, default: Int) = getOrDefault(key.toVariant(), Variant(default))
  fun getOrDefault(key: CoreType<*>, default: Float) = getOrDefault(key.toVariant(), Variant(default))
  fun getOrDefault(key: CoreType<*>, default: String) = getOrDefault(key.toVariant(), Variant(default))
  fun getOrDefault(key: CoreType<*>, default: Boolean) = getOrDefault(key.toVariant(), Variant(default))
  fun getOrDefault(key: CoreType<*>, default: Object) = getOrDefault(key.toVariant(), default.toVariant())
  fun getOrDefault(key: CoreType<*>, default: CoreType<*>) = getOrDefault(key.toVariant(), default.toVariant())

  operator fun get(key: Variant): Variant {
    return Allocator.allocationScope {
      Variant(
        checkNotNull(Godot.gdnative.godot_dictionary_get)(_value.ptr, key._value.ptr)
      )
    }
  }

  operator fun get(key: Int) = get(Variant(key))
  operator fun get(key: Float) = get(Variant(key))
  operator fun get(key: String) = get(Variant(key))
  operator fun get(key: Boolean) = get(Variant(key))
  operator fun get(key: Object) = get(key.toVariant())
  operator fun get(key: CoreType<*>) = get(key.toVariant())

  @Suppress("UNCHECKED_CAST")
  fun <T: CoreType<*>> get(key: Variant, cb: T.() -> Unit) {
    val value = get(key).toAny() as T
    cb(value)
    set(key, value.toVariant())
  }

  fun <T: CoreType<*>> get(key: Int, cb: T.() -> Unit) = get(Variant(key), cb)
  fun <T: CoreType<*>> get(key: Float, cb: T.() -> Unit) = get(Variant(key), cb)
  fun <T: CoreType<*>> get(key: String, cb: T.() -> Unit) = get(Variant(key), cb)
  fun <T: CoreType<*>> get(key: Boolean, cb: T.() -> Unit) = get(Variant(key), cb)
  fun <T: CoreType<*>> get(key: Object, cb: T.() -> Unit) = get(key.toVariant(), cb)
  fun <T: CoreType<*>> get(key: CoreType<*>, cb: T.() -> Unit) = get(key.toVariant(), cb)

  operator fun set(key: Variant, value: Variant) {
    Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_dictionary_set)(_value.ptr, key._value.ptr, value._value.ptr)
    }
  }

  operator fun set(key: Int, value: Variant) = set(Variant(key), value)
  operator fun set(key: Int, value: Int) = set(Variant(key), Variant(value))
  operator fun set(key: Int, value: Float) = set(Variant(key), Variant(value))
  operator fun set(key: Int, value: String) = set(Variant(key), Variant(value))
  operator fun set(key: Int, value: Boolean) = set(Variant(key), Variant(value))
  operator fun set(key: Int, value: Object) = set(Variant(key), value.toVariant())
  operator fun set(key: Int, value: CoreType<*>) = set(Variant(key), value.toVariant())

  operator fun set(key: Float, value: Variant) = set(Variant(key), value)
  operator fun set(key: Float, value: Int) = set(Variant(key), Variant(value))
  operator fun set(key: Float, value: Float) = set(Variant(key), Variant(value))
  operator fun set(key: Float, value: String) = set(Variant(key), Variant(value))
  operator fun set(key: Float, value: Boolean) = set(Variant(key), Variant(value))
  operator fun set(key: Float, value: Object) = set(Variant(key), value.toVariant())
  operator fun set(key: Float, value: CoreType<*>) = set(Variant(key), value.toVariant())

  operator fun set(key: String, value: Variant) = set(Variant(key), value)
  operator fun set(key: String, value: Int) = set(Variant(key), Variant(value))
  operator fun set(key: String, value: Float) = set(Variant(key), Variant(value))
  operator fun set(key: String, value: String) = set(Variant(key), Variant(value))
  operator fun set(key: String, value: Boolean) = set(Variant(key), Variant(value))
  operator fun set(key: String, value: Object) = set(Variant(key), value.toVariant())
  operator fun set(key: String, value: CoreType<*>) = set(Variant(key), value.toVariant())

  operator fun set(key: Boolean, value: Variant) = set(Variant(key), value)
  operator fun set(key: Boolean, value: Int) = set(Variant(key), Variant(value))
  operator fun set(key: Boolean, value: Float) = set(Variant(key), Variant(value))
  operator fun set(key: Boolean, value: String) = set(Variant(key), Variant(value))
  operator fun set(key: Boolean, value: Boolean) = set(Variant(key), Variant(value))
  operator fun set(key: Boolean, value: Object) = set(Variant(key), value.toVariant())
  operator fun set(key: Boolean, value: CoreType<*>) = set(Variant(key), value.toVariant())

  operator fun set(key: Object, value: Variant) = set(key.toVariant(), value)
  operator fun set(key: Object, value: Int) = set(Variant(key), Variant(value))
  operator fun set(key: Object, value: Float) = set(Variant(key), Variant(value))
  operator fun set(key: Object, value: String) = set(Variant(key), Variant(value))
  operator fun set(key: Object, value: Boolean) = set(Variant(key), Variant(value))
  operator fun set(key: Object, value: Object) = set(Variant(key), value.toVariant())
  operator fun set(key: Object, value: CoreType<*>) = set(Variant(key), value.toVariant())

  operator fun set(key: CoreType<*>, value: Variant) = set(key.toVariant(), value)
  operator fun set(key: CoreType<*>, value: Int) = set(key.toVariant(), Variant(value))
  operator fun set(key: CoreType<*>, value: Float) = set(key.toVariant(), Variant(value))
  operator fun set(key: CoreType<*>, value: String) = set(key.toVariant(), Variant(value))
  operator fun set(key: CoreType<*>, value: Boolean) = set(key.toVariant(), Variant(value))
  operator fun set(key: CoreType<*>, value: Object) = set(key.toVariant(), value.toVariant())
  operator fun set(key: CoreType<*>, value: CoreType<*>) = set(key.toVariant(), value.toVariant())

  fun has(key: Variant): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_dictionary_has)(_value.ptr, key._value.ptr)
    }
  }

  fun has(key: Int) = has(Variant(key))
  fun has(key: Float) = has(Variant(key))
  fun has(key: String) = has(Variant(key))
  fun has(key: Boolean) = has(Variant(key))
  fun has(key: Object) = has(key.toVariant())
  fun has(key: CoreType<*>) = has(key.toVariant())

  fun hasAll(keys: VariantArray): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_dictionary_has_all)(_value.ptr, keys._value.ptr)
    }
  }

  fun hash(): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_dictionary_hash)(_value.ptr)
    }
  }

  fun keys(): VariantArray {
    return Allocator.allocationScope {
      VariantArray(
        checkNotNull(Godot.gdnative.godot_dictionary_keys)(_value.ptr)
      )
    }
  }

  fun size(): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_dictionary_size)(_value.ptr)
    }
  }

  fun values(): VariantArray {
    return Allocator.allocationScope {
      VariantArray(
        checkNotNull(Godot.gdnative.godot_dictionary_values)(_value.ptr)
      )
    }
  }

  override fun equals(other: Any?): Boolean {
    if (other == null || other !is Dictionary) {
      return false
    }
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_dictionary_operator_equal)(_value.ptr, other._value.ptr)
    }
  }

  override fun hashCode(): Int {
    return hash()
  }

  override fun toVariant(): Variant {
    return Variant(this)
  }

  override fun toGDString(): GDString {
    return GDString("Dictionary()")
  }

  companion object {
    internal fun __new() = allocType2<godot_dictionary> {
      checkNotNull(Godot.gdnative.godot_dictionary_new)(it)
    }

  }
}