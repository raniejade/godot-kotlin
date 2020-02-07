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
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class StyleBoxLine(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : StyleBox(null) {
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

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for color
   */
  fun color(cb: Color.() -> Unit) {
    val _p = color
    cb(_p)
    color = _p
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
    __method_bind.setColor.call(this._handle, listOf(_arg))
  }

  fun setGrowBegin(offset: Float) {
    val _arg = Variant.new(offset)
    __method_bind.setGrowBegin.call(this._handle, listOf(_arg))
  }

  fun setGrowEnd(offset: Float) {
    val _arg = Variant.new(offset)
    __method_bind.setGrowEnd.call(this._handle, listOf(_arg))
  }

  fun setThickness(thickness: Int) {
    val _arg = Variant.new(thickness)
    __method_bind.setThickness.call(this._handle, listOf(_arg))
  }

  fun setVertical(vertical: Boolean) {
    val _arg = Variant.new(vertical)
    __method_bind.setVertical.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StyleBoxLine".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StyleBoxLine" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for StyleBoxLine
     */
    private object __method_bind {
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getGrowBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "get_grow_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_grow_begin" }
        }
      val getGrowEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "get_grow_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_grow_end" }
        }
      val getThickness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "get_thickness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_thickness" }
        }
      val isVertical: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "is_vertical".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_vertical" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val setGrowBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "set_grow_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_grow_begin" }
        }
      val setGrowEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "set_grow_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_grow_end" }
        }
      val setThickness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "set_thickness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_thickness" }
        }
      val setVertical: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "set_vertical".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertical" }
        }}
  }
}
