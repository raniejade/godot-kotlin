// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class HashingContext(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun finish(): PoolByteArray {
    val _ret = __method_bind.finish.call(this._handle)
    return _ret.asPoolByteArray()
  }

  fun start(type: Int): GDError {
    val _arg = Variant(type)
    val _ret = __method_bind.start.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun update(chunk: PoolByteArray): GDError {
    val _arg = Variant(chunk)
    val _ret = __method_bind.update.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  enum class HashType(
    val value: Int
  ) {
    MD5(0),

    SHA1(1),

    SHA256(2);

    companion object {
      fun from(value: Int): HashType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("HashingContext".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for HashingContext" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for HashingContext
     */
    private object __method_bind {
      val finish: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HashingContext".cstr.ptr,
            "finish".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method finish" }
        }
      val start: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HashingContext".cstr.ptr,
            "start".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method start" }
        }
      val update: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("HashingContext".cstr.ptr,
            "update".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update" }
        }}
  }
}
