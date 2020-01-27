// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNodeBlend2 internal constructor(
  _handle: COpaquePointer
) : AnimationNode(_handle) {
  fun isUsingSync(): Boolean {
    val _ret = __method_bind.is_using_sync.call(this.toVariant())
    TODO()
  }

  fun setUseSync(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_use_sync.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): AnimationNodeBlend2 = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeBlend2".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationNodeBlend2" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeBlend2(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNodeBlend2 = AnimationNodeBlend2(ptr)
    /**
     * Container for method_bind pointers for AnimationNodeBlend2
     */
    private object __method_bind {
      val is_using_sync: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlend2".cstr.ptr,
              "is_using_sync".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_sync" }
            }
          }

      val set_use_sync: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlend2".cstr.ptr,
              "set_use_sync".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_sync" }
            }
          }
    }
  }
}
