// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
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

open class Crypto(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun generateRandomBytes(size: Int): PoolByteArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolByteArray()
      val _retPtr = _ret._value.ptr
      __method_bind.generateRandomBytes.call(self._handle, listOf(size), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun generateRsa(size: Int): CryptoKey {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: CryptoKey
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.generateRsa.call(self._handle, listOf(size), _retPtr)
      _ret = objectToType<CryptoKey>(_tmp.value!!)
      _ret
    }
  }

  fun generateSelfSignedCertificate(
    key: CryptoKey,
    issuerName: String = "CN=myserver,O=myorganisation,C=IT",
    notBefore: String = "20140101000000",
    notAfter: String = "20340101000000"
  ): X509Certificate {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: X509Certificate
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(key)
      _args.add(issuerName)
      _args.add(notBefore)
      _args.add(notAfter)
      __method_bind.generateSelfSignedCertificate.call(self._handle, _args, _retPtr)
      _ret = objectToType<X509Certificate>(_tmp.value!!)
      _ret
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Crypto".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Crypto" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Crypto
     */
    private object __method_bind {
      val generateRandomBytes: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Crypto".cstr.ptr,
              "generate_random_bytes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method generate_random_bytes" }
            }
          }

      val generateRsa: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Crypto".cstr.ptr,
              "generate_rsa".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method generate_rsa" }
            }
          }

      val generateSelfSignedCertificate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Crypto".cstr.ptr,
              "generate_self_signed_certificate".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method generate_self_signed_certificate" }
            }
          }
    }
  }
}
