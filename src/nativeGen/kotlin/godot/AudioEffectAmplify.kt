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

open class AudioEffectAmplify internal constructor(
  _handle: COpaquePointer
) : AudioEffect(_handle) {
  fun getVolumeDb(): Float {
    val _ret = __method_bind.get_volume_db.call(this.toVariant())
    TODO()
  }

  fun setVolumeDb(volume: Float) {
    val _args = VariantArray.new()
    _args.append(volume)
    val _ret = __method_bind.set_volume_db.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): AudioEffectAmplify = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AudioEffectAmplify".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AudioEffectAmplify" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AudioEffectAmplify(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AudioEffectAmplify = AudioEffectAmplify(ptr)
    /**
     * Container for method_bind pointers for AudioEffectAmplify
     */
    private object __method_bind {
      val get_volume_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectAmplify".cstr.ptr,
              "get_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_volume_db" }
            }
          }

      val set_volume_db: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AudioEffectAmplify".cstr.ptr,
              "set_volume_db".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_volume_db" }
            }
          }
    }
  }
}
