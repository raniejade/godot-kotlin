// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class _Marshalls(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun base64ToRaw(base64Str: String): PoolByteArray {
    val _arg = Variant.new(base64Str)
    val _ret = __method_bind.base64ToRaw.call(this._handle, listOf(_arg))
    return _ret.asPoolByteArray()
  }

  fun base64ToUtf8(base64Str: String): String {
    val _arg = Variant.new(base64Str)
    val _ret = __method_bind.base64ToUtf8.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun base64ToVariant(base64Str: String, allowObjects: Boolean = false): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(base64Str))
    _args.add(Variant.fromAny(allowObjects))
    val _ret = __method_bind.base64ToVariant.call(this._handle, _args)
    return _ret
  }

  fun rawToBase64(array: PoolByteArray): String {
    val _arg = Variant.new(array)
    val _ret = __method_bind.rawToBase64.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun utf8ToBase64(utf8Str: String): String {
    val _arg = Variant.new(utf8Str)
    val _ret = __method_bind.utf8ToBase64.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun variantToBase64(variant: Variant, fullObjects: Boolean = false): String {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(variant))
    _args.add(Variant.fromAny(fullObjects))
    val _ret = __method_bind.variantToBase64.call(this._handle, _args)
    return _ret.asString()
  }

  companion object {
    val Instance: _Marshalls
      get() = memScoped {
        val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("_Marshalls".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton _Marshalls" }
        _Marshalls(
          handle
        )
      }
    /**
     * Container for method_bind pointers for _Marshalls
     */
    private object __method_bind {
      val base64ToRaw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
            "base64_to_raw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method base64_to_raw" }
        }
      val base64ToUtf8: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
            "base64_to_utf8".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method base64_to_utf8" }
        }
      val base64ToVariant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
            "base64_to_variant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method base64_to_variant" }
        }
      val rawToBase64: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
            "raw_to_base64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method raw_to_base64" }
        }
      val utf8ToBase64: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
            "utf8_to_base64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method utf8_to_base64" }
        }
      val variantToBase64: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
            "variant_to_base64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method variant_to_base64" }
        }}
  }
}
