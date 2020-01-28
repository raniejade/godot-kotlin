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

open class AnimationNodeTransition(
  _handle: COpaquePointer
) : AnimationNode(_handle) {
  var inputCount: Int
    get() {
       return getEnabledInputs() 
    }
    set(value) {
      setEnabledInputs(value)
    }

  var xfadeTime: Float
    get() {
       return getCrossFadeTime() 
    }
    set(value) {
      setCrossFadeTime(value)
    }

  fun getCrossFadeTime(): Float {
    val _ret = __method_bind.getCrossFadeTime.call(this._handle)
    return _ret.asFloat()
  }

  fun getEnabledInputs(): Int {
    val _ret = __method_bind.getEnabledInputs.call(this._handle)
    return _ret.asInt()
  }

  fun getInputCaption(input: Int): String {
    val _arg = Variant.new(input)
    val _ret = __method_bind.getInputCaption.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun isInputSetAsAutoAdvance(input: Int): Boolean {
    val _arg = Variant.new(input)
    val _ret = __method_bind.isInputSetAsAutoAdvance.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun setCrossFadeTime(time: Float) {
    val _arg = Variant.new(time)
    __method_bind.setCrossFadeTime.call(this._handle, _arg, 1)
  }

  fun setEnabledInputs(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setEnabledInputs.call(this._handle, _arg, 1)
  }

  fun setInputAsAutoAdvance(input: Int, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(input)
    _args.append(enable)
    __method_bind.setInputAsAutoAdvance.call(this._handle, _args.toVariant(), 2)
  }

  fun setInputCaption(input: Int, caption: String) {
    val _args = VariantArray.new()
    _args.append(input)
    _args.append(caption)
    __method_bind.setInputCaption.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    fun new(): AnimationNodeTransition = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeTransition".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeTransition" }
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
      val getCrossFadeTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "get_cross_fade_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cross_fade_time" }
        }
      val getEnabledInputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "get_enabled_inputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_enabled_inputs" }
        }
      val getInputCaption: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "get_input_caption".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_input_caption" }
        }
      val isInputSetAsAutoAdvance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "is_input_set_as_auto_advance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_input_set_as_auto_advance" }
        }
      val setCrossFadeTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "set_cross_fade_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cross_fade_time" }
        }
      val setEnabledInputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "set_enabled_inputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enabled_inputs" }
        }
      val setInputAsAutoAdvance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "set_input_as_auto_advance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_as_auto_advance" }
        }
      val setInputCaption: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeTransition".cstr.ptr,
            "set_input_caption".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_caption" }
        }}
  }
}
