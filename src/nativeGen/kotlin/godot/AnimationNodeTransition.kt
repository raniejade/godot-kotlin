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
  var input0AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(0) 
    }
    set(value) {
      setInputAsAutoAdvance(0, value)
    }

  var input0Name: String
    get() {
       return getInputCaption(0) 
    }
    set(value) {
      setInputCaption(0, value)
    }

  var input1AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(1) 
    }
    set(value) {
      setInputAsAutoAdvance(1, value)
    }

  var input1Name: String
    get() {
       return getInputCaption(1) 
    }
    set(value) {
      setInputCaption(1, value)
    }

  var input10AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(10) 
    }
    set(value) {
      setInputAsAutoAdvance(10, value)
    }

  var input10Name: String
    get() {
       return getInputCaption(10) 
    }
    set(value) {
      setInputCaption(10, value)
    }

  var input11AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(11) 
    }
    set(value) {
      setInputAsAutoAdvance(11, value)
    }

  var input11Name: String
    get() {
       return getInputCaption(11) 
    }
    set(value) {
      setInputCaption(11, value)
    }

  var input12AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(12) 
    }
    set(value) {
      setInputAsAutoAdvance(12, value)
    }

  var input12Name: String
    get() {
       return getInputCaption(12) 
    }
    set(value) {
      setInputCaption(12, value)
    }

  var input13AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(13) 
    }
    set(value) {
      setInputAsAutoAdvance(13, value)
    }

  var input13Name: String
    get() {
       return getInputCaption(13) 
    }
    set(value) {
      setInputCaption(13, value)
    }

  var input14AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(14) 
    }
    set(value) {
      setInputAsAutoAdvance(14, value)
    }

  var input14Name: String
    get() {
       return getInputCaption(14) 
    }
    set(value) {
      setInputCaption(14, value)
    }

  var input15AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(15) 
    }
    set(value) {
      setInputAsAutoAdvance(15, value)
    }

  var input15Name: String
    get() {
       return getInputCaption(15) 
    }
    set(value) {
      setInputCaption(15, value)
    }

  var input16AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(16) 
    }
    set(value) {
      setInputAsAutoAdvance(16, value)
    }

  var input16Name: String
    get() {
       return getInputCaption(16) 
    }
    set(value) {
      setInputCaption(16, value)
    }

  var input17AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(17) 
    }
    set(value) {
      setInputAsAutoAdvance(17, value)
    }

  var input17Name: String
    get() {
       return getInputCaption(17) 
    }
    set(value) {
      setInputCaption(17, value)
    }

  var input18AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(18) 
    }
    set(value) {
      setInputAsAutoAdvance(18, value)
    }

  var input18Name: String
    get() {
       return getInputCaption(18) 
    }
    set(value) {
      setInputCaption(18, value)
    }

  var input19AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(19) 
    }
    set(value) {
      setInputAsAutoAdvance(19, value)
    }

  var input19Name: String
    get() {
       return getInputCaption(19) 
    }
    set(value) {
      setInputCaption(19, value)
    }

  var input2AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(2) 
    }
    set(value) {
      setInputAsAutoAdvance(2, value)
    }

  var input2Name: String
    get() {
       return getInputCaption(2) 
    }
    set(value) {
      setInputCaption(2, value)
    }

  var input20AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(20) 
    }
    set(value) {
      setInputAsAutoAdvance(20, value)
    }

  var input20Name: String
    get() {
       return getInputCaption(20) 
    }
    set(value) {
      setInputCaption(20, value)
    }

  var input21AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(21) 
    }
    set(value) {
      setInputAsAutoAdvance(21, value)
    }

  var input21Name: String
    get() {
       return getInputCaption(21) 
    }
    set(value) {
      setInputCaption(21, value)
    }

  var input22AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(22) 
    }
    set(value) {
      setInputAsAutoAdvance(22, value)
    }

  var input22Name: String
    get() {
       return getInputCaption(22) 
    }
    set(value) {
      setInputCaption(22, value)
    }

  var input23AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(23) 
    }
    set(value) {
      setInputAsAutoAdvance(23, value)
    }

  var input23Name: String
    get() {
       return getInputCaption(23) 
    }
    set(value) {
      setInputCaption(23, value)
    }

  var input24AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(24) 
    }
    set(value) {
      setInputAsAutoAdvance(24, value)
    }

  var input24Name: String
    get() {
       return getInputCaption(24) 
    }
    set(value) {
      setInputCaption(24, value)
    }

  var input25AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(25) 
    }
    set(value) {
      setInputAsAutoAdvance(25, value)
    }

  var input25Name: String
    get() {
       return getInputCaption(25) 
    }
    set(value) {
      setInputCaption(25, value)
    }

  var input26AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(26) 
    }
    set(value) {
      setInputAsAutoAdvance(26, value)
    }

  var input26Name: String
    get() {
       return getInputCaption(26) 
    }
    set(value) {
      setInputCaption(26, value)
    }

  var input27AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(27) 
    }
    set(value) {
      setInputAsAutoAdvance(27, value)
    }

  var input27Name: String
    get() {
       return getInputCaption(27) 
    }
    set(value) {
      setInputCaption(27, value)
    }

  var input28AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(28) 
    }
    set(value) {
      setInputAsAutoAdvance(28, value)
    }

  var input28Name: String
    get() {
       return getInputCaption(28) 
    }
    set(value) {
      setInputCaption(28, value)
    }

  var input29AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(29) 
    }
    set(value) {
      setInputAsAutoAdvance(29, value)
    }

  var input29Name: String
    get() {
       return getInputCaption(29) 
    }
    set(value) {
      setInputCaption(29, value)
    }

  var input3AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(3) 
    }
    set(value) {
      setInputAsAutoAdvance(3, value)
    }

  var input3Name: String
    get() {
       return getInputCaption(3) 
    }
    set(value) {
      setInputCaption(3, value)
    }

  var input30AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(30) 
    }
    set(value) {
      setInputAsAutoAdvance(30, value)
    }

  var input30Name: String
    get() {
       return getInputCaption(30) 
    }
    set(value) {
      setInputCaption(30, value)
    }

  var input31AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(31) 
    }
    set(value) {
      setInputAsAutoAdvance(31, value)
    }

  var input31Name: String
    get() {
       return getInputCaption(31) 
    }
    set(value) {
      setInputCaption(31, value)
    }

  var input4AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(4) 
    }
    set(value) {
      setInputAsAutoAdvance(4, value)
    }

  var input4Name: String
    get() {
       return getInputCaption(4) 
    }
    set(value) {
      setInputCaption(4, value)
    }

  var input5AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(5) 
    }
    set(value) {
      setInputAsAutoAdvance(5, value)
    }

  var input5Name: String
    get() {
       return getInputCaption(5) 
    }
    set(value) {
      setInputCaption(5, value)
    }

  var input6AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(6) 
    }
    set(value) {
      setInputAsAutoAdvance(6, value)
    }

  var input6Name: String
    get() {
       return getInputCaption(6) 
    }
    set(value) {
      setInputCaption(6, value)
    }

  var input7AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(7) 
    }
    set(value) {
      setInputAsAutoAdvance(7, value)
    }

  var input7Name: String
    get() {
       return getInputCaption(7) 
    }
    set(value) {
      setInputCaption(7, value)
    }

  var input8AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(8) 
    }
    set(value) {
      setInputAsAutoAdvance(8, value)
    }

  var input8Name: String
    get() {
       return getInputCaption(8) 
    }
    set(value) {
      setInputCaption(8, value)
    }

  var input9AutoAdvance: Boolean
    get() {
       return isInputSetAsAutoAdvance(9) 
    }
    set(value) {
      setInputAsAutoAdvance(9, value)
    }

  var input9Name: String
    get() {
       return getInputCaption(9) 
    }
    set(value) {
      setInputCaption(9, value)
    }

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
    val _ret = __method_bind.getInputCaption.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun isInputSetAsAutoAdvance(input: Int): Boolean {
    val _arg = Variant.new(input)
    val _ret = __method_bind.isInputSetAsAutoAdvance.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun setCrossFadeTime(time: Float) {
    val _arg = Variant.new(time)
    __method_bind.setCrossFadeTime.call(this._handle, listOf(_arg))
  }

  fun setEnabledInputs(amount: Int) {
    val _arg = Variant.new(amount)
    __method_bind.setEnabledInputs.call(this._handle, listOf(_arg))
  }

  fun setInputAsAutoAdvance(input: Int, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(input))
    _args.add(Variant.fromAny(enable))
    __method_bind.setInputAsAutoAdvance.call(this._handle, _args)
  }

  fun setInputCaption(input: Int, caption: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(input))
    _args.add(Variant.fromAny(caption))
    __method_bind.setInputCaption.call(this._handle, _args)
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
