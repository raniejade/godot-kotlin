// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
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
    val _ret = __method_bind.base64_to_raw.call(this._handle, _arg, 1)
    return _ret.asPoolByteArray()
  }

  fun base64ToUtf8(base64Str: String): String {
    val _arg = Variant.new(base64Str)
    val _ret = __method_bind.base64_to_utf8.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun base64ToVariant(base64Str: String, allowObjects: Boolean): Variant {
    val _args = VariantArray.new()
    _args.append(base64Str)
    _args.append(allowObjects)
    val _ret = __method_bind.base64_to_variant.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun rawToBase64(array: PoolByteArray): String {
    val _arg = Variant.new(array)
    val _ret = __method_bind.raw_to_base64.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun utf8ToBase64(utf8Str: String): String {
    val _arg = Variant.new(utf8Str)
    val _ret = __method_bind.utf8_to_base64.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun variantToBase64(variant: Variant, fullObjects: Boolean): String {
    val _args = VariantArray.new()
    _args.append(variant)
    _args.append(fullObjects)
    val _ret = __method_bind.variant_to_base64.call(this._handle, _args.toVariant(), 2)
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
      val base64_to_raw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
            "base64_to_raw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method base64_to_raw" }
        }
      val base64_to_utf8: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
            "base64_to_utf8".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method base64_to_utf8" }
        }
      val base64_to_variant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
            "base64_to_variant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method base64_to_variant" }
        }
      val raw_to_base64: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
            "raw_to_base64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method raw_to_base64" }
        }
      val utf8_to_base64: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
            "utf8_to_base64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method utf8_to_base64" }
        }
      val variant_to_base64: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
            "variant_to_base64".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method variant_to_base64" }
        }}
  }
}
