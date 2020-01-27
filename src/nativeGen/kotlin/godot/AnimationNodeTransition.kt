// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNodeTransition internal constructor(
  _handle: COpaquePointer
) : AnimationNode(_handle) {
  fun getCrossFadeTime(): Float {
    val _ret = __method_bind.get_cross_fade_time.call(this.toVariant())
    TODO()
  }

  fun getEnabledInputs(): Int {
    val _ret = __method_bind.get_enabled_inputs.call(this.toVariant())
    TODO()
  }

  fun getInputCaption(input: Int): String {
    val _args = VariantArray.new()
    _args.append(input)
    val _ret = __method_bind.get_input_caption.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isInputSetAsAutoAdvance(input: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(input)
    val _ret = __method_bind.is_input_set_as_auto_advance.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun setCrossFadeTime(time: Float) {
    val _args = VariantArray.new()
    _args.append(time)
    val _ret = __method_bind.set_cross_fade_time.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setEnabledInputs(amount: Int) {
    val _args = VariantArray.new()
    _args.append(amount)
    val _ret = __method_bind.set_enabled_inputs.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setInputAsAutoAdvance(input: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(input)
    _args.append(enable)
    val _ret = __method_bind.set_input_as_auto_advance.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setInputCaption(input: Int, caption: String) {
    val _args = VariantArray.new()
    _args.append(input)
    _args.append(caption)
    val _ret = __method_bind.set_input_caption.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  companion object {
    fun new(): AnimationNodeTransition = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeTransition".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationNodeTransition" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeTransition(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNodeTransition = AnimationNodeTransition(ptr)
    /**
     * Container for method_bind pointers for AnimationNodeTransition
     */
    private object __method_bind {
      val get_cross_fade_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
              "get_cross_fade_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cross_fade_time" }
            }
          }

      val get_enabled_inputs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
              "get_enabled_inputs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_enabled_inputs" }
            }
          }

      val get_input_caption: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
              "get_input_caption".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_input_caption" }
            }
          }

      val is_input_set_as_auto_advance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
              "is_input_set_as_auto_advance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_input_set_as_auto_advance" }
            }
          }

      val set_cross_fade_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
              "set_cross_fade_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cross_fade_time" }
            }
          }

      val set_enabled_inputs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
              "set_enabled_inputs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enabled_inputs" }
            }
          }

      val set_input_as_auto_advance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
              "set_input_as_auto_advance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_input_as_auto_advance" }
            }
          }

      val set_input_caption: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
              "set_input_caption".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_input_caption" }
            }
          }
    }
  }
}
