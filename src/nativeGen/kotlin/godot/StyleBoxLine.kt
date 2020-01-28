// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StyleBoxLine(
  _handle: COpaquePointer
) : StyleBox(_handle) {
  var color: Color
    get() {
       return getColor() 
    }
    set(value) {
      setColor(value)
    }

  var growBegin: Float
    get() {
       return getGrowBegin() 
    }
    set(value) {
      setGrowBegin(value)
    }

  var growEnd: Float
    get() {
       return getGrowEnd() 
    }
    set(value) {
      setGrowEnd(value)
    }

  var thickness: Int
    get() {
       return getThickness() 
    }
    set(value) {
      setThickness(value)
    }

  var vertical: Boolean
    get() {
       return isVertical() 
    }
    set(value) {
      setVertical(value)
    }

  fun getColor(): Color {
    val _ret = __method_bind.getColor.call(this._handle)
    return _ret.asColor()
  }

  fun getGrowBegin(): Float {
    val _ret = __method_bind.getGrowBegin.call(this._handle)
    return _ret.asFloat()
  }

  fun getGrowEnd(): Float {
    val _ret = __method_bind.getGrowEnd.call(this._handle)
    return _ret.asFloat()
  }

  fun getThickness(): Int {
    val _ret = __method_bind.getThickness.call(this._handle)
    return _ret.asInt()
  }

  fun isVertical(): Boolean {
    val _ret = __method_bind.isVertical.call(this._handle)
    return _ret.asBoolean()
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setColor.call(this._handle, _arg, 1)
  }

  fun setGrowBegin(offset: Float) {
    val _arg = Variant.new(offset)
    __method_bind.setGrowBegin.call(this._handle, _arg, 1)
  }

  fun setGrowEnd(offset: Float) {
    val _arg = Variant.new(offset)
    __method_bind.setGrowEnd.call(this._handle, _arg, 1)
  }

  fun setThickness(thickness: Int) {
    val _arg = Variant.new(thickness)
    __method_bind.setThickness.call(this._handle, _arg, 1)
  }

  fun setVertical(vertical: Boolean) {
    val _arg = Variant.new(vertical)
    __method_bind.setVertical.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): StyleBoxLine = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StyleBoxLine".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StyleBoxLine" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StyleBoxLine(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): StyleBoxLine = StyleBoxLine(ptr)
    /**
     * Container for method_bind pointers for StyleBoxLine
     */
    private object __method_bind {
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "getColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColor" }
        }
      val getGrowBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "getGrowBegin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGrowBegin" }
        }
      val getGrowEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "getGrowEnd".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGrowEnd" }
        }
      val getThickness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "getThickness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getThickness" }
        }
      val isVertical: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "isVertical".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isVertical" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "setColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setColor" }
        }
      val setGrowBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "setGrowBegin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGrowBegin" }
        }
      val setGrowEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "setGrowEnd".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setGrowEnd" }
        }
      val setThickness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "setThickness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setThickness" }
        }
      val setVertical: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "setVertical".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVertical" }
        }}
  }
}
