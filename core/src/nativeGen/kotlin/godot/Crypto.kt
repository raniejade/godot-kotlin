// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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

open class Crypto(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun generateRandomBytes(size: Int): PoolByteArray {
    val _arg = Variant(size)
    val _ret = __method_bind.generateRandomBytes.call(this._handle, listOf(_arg))
    return _ret.asPoolByteArray()
  }

  fun generateRsa(size: Int): CryptoKey {
    val _arg = Variant(size)
    val _ret = __method_bind.generateRsa.call(this._handle, listOf(_arg))
    return _ret.toAny() as CryptoKey
  }

  fun generateSelfSignedCertificate(
    key: CryptoKey,
    issuerName: String = "CN=myserver,O=myorganisation,C=IT",
    notBefore: String = "20140101000000",
    notAfter: String = "20340101000000"
  ): X509Certificate {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(key))
    _args.add(Variant.fromAny(issuerName))
    _args.add(Variant.fromAny(notBefore))
    _args.add(Variant.fromAny(notAfter))
    val _ret = __method_bind.generateSelfSignedCertificate.call(this._handle, _args)
    return _ret.toAny() as X509Certificate
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Crypto".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Crypto" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Crypto
     */
    private object __method_bind {
      val generateRandomBytes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Crypto".cstr.ptr,
            "generate_random_bytes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generate_random_bytes" }
        }
      val generateRsa: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Crypto".cstr.ptr,
            "generate_rsa".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generate_rsa" }
        }
      val generateSelfSignedCertificate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Crypto".cstr.ptr,
            "generate_self_signed_certificate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generate_self_signed_certificate" }
        }}
  }
}
