// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class MarshallsInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  fun base64ToRaw(base64Str: String): PoolByteArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolByteArray()
      val _retPtr = _ret._value.ptr
      __method_bind.base64ToRaw.call(self._handle, listOf(base64Str), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun base64ToUtf8(base64Str: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.base64ToUtf8.call(self._handle, listOf(base64Str), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun base64ToVariant(base64Str: String, allowObjects: Boolean = false): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(base64Str)
      _args.add(allowObjects)
      __method_bind.base64ToVariant.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun rawToBase64(array: PoolByteArray): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.rawToBase64.call(self._handle, listOf(array), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun utf8ToBase64(utf8Str: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.utf8ToBase64.call(self._handle, listOf(utf8Str), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun variantToBase64(variant: Variant, fullObjects: Boolean = false): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      val _args = mutableListOf<Any?>()
      _args.add(variant)
      _args.add(fullObjects)
      __method_bind.variantToBase64.call(self._handle, _args, _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for Marshalls
     */
    private object __method_bind {
      val base64ToRaw: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
              "base64_to_raw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method base64_to_raw" }
            }
          }

      val base64ToUtf8: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
              "base64_to_utf8".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method base64_to_utf8" }
            }
          }

      val base64ToVariant: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
              "base64_to_variant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method base64_to_variant" }
            }
          }

      val rawToBase64: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
              "raw_to_base64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method raw_to_base64" }
            }
          }

      val utf8ToBase64: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
              "utf8_to_base64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method utf8_to_base64" }
            }
          }

      val variantToBase64: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
              "variant_to_base64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method variant_to_base64" }
            }
          }
    }
  }
}

object Marshalls : MarshallsInternal(null) {
  init {
    Allocator.allocationScope {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("Marshalls".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton Marshalls" }
      _handle = handle
    }
  }
}
