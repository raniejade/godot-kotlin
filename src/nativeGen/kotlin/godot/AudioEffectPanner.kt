// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AudioEffectPanner(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  var pan: Float
    get() {
       return getPan() 
    }
    set(value) {
      setPan(value)
    }

  fun getPan(): Float {
    val _ret = __method_bind.getPan.call(this._handle)
    return _ret.asFloat()
  }

  fun setPan(cpanume: Float) {
    val _arg = Variant.new(cpanume)
    __method_bind.setPan.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AudioEffectPanner = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectPanner".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AudioEffectPanner" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectPanner(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectPanner = AudioEffectPanner(ptr)
    /**
     * Container for method_bind pointers for AudioEffectPanner
     */
    private object __method_bind {
      val getPan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPanner".cstr.ptr,
            "get_pan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pan" }
        }
      val setPan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectPanner".cstr.ptr,
            "set_pan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pan" }
        }}
  }
}
