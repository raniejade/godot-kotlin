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

open class AnimationNodeBlend2(
  _handle: COpaquePointer
) : AnimationNode(_handle) {
  var sync: Boolean
    get() {
       return isUsingSync() 
    }
    set(value) {
      setUseSync(value)
    }

  fun isUsingSync(): Boolean {
    val _ret = __method_bind.isUsingSync.call(this._handle)
    return _ret.asBoolean()
  }

  fun setUseSync(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseSync.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AnimationNodeBlend2 = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeBlend2".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeBlend2" }
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
      val isUsingSync: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlend2".cstr.ptr,
            "is_using_sync".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_sync" }
        }
      val setUseSync: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlend2".cstr.ptr,
            "set_use_sync".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_sync" }
        }}
  }
}
