// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class NinePatchRect(
  _handle: COpaquePointer
) : Control(_handle) {
  var axisStretchHorizontal: AxisStretchMode
    get() {
       return getHAxisStretchMode() 
    }
    set(value) {
      setHAxisStretchMode(value.value)
    }

  var axisStretchVertical: AxisStretchMode
    get() {
       return getVAxisStretchMode() 
    }
    set(value) {
      setVAxisStretchMode(value.value)
    }

  var drawCenter: Boolean
    get() {
       return isDrawCenterEnabled() 
    }
    set(value) {
      setDrawCenter(value)
    }

  var regionRect: Rect2
    get() {
       return getRegionRect() 
    }
    set(value) {
      setRegionRect(value)
    }

  var texture: Texture
    get() {
       return getTexture() 
    }
    set(value) {
      setTexture(value)
    }

  /**
   * Specialized setter for regionRect
   */
  fun regionRect(cb: Rect2.() -> Unit) {
    val _p = regionRect
    cb(_p)
    regionRect = _p
  }

  fun getHAxisStretchMode(): AxisStretchMode {
    val _ret = __method_bind.getHAxisStretchMode.call(this._handle)
    return NinePatchRect.AxisStretchMode.from(_ret.asInt())
  }

  fun getPatchMargin(margin: Int): Int {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.getPatchMargin.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getRegionRect(): Rect2 {
    val _ret = __method_bind.getRegionRect.call(this._handle)
    return _ret.asRect2()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.getTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getVAxisStretchMode(): AxisStretchMode {
    val _ret = __method_bind.getVAxisStretchMode.call(this._handle)
    return NinePatchRect.AxisStretchMode.from(_ret.asInt())
  }

  fun isDrawCenterEnabled(): Boolean {
    val _ret = __method_bind.isDrawCenterEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setDrawCenter(drawCenter: Boolean) {
    val _arg = Variant.new(drawCenter)
    __method_bind.setDrawCenter.call(this._handle, _arg, 1)
  }

  fun setHAxisStretchMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setHAxisStretchMode.call(this._handle, _arg, 1)
  }

  fun setPatchMargin(margin: Int, value: Int) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(value)
    __method_bind.setPatchMargin.call(this._handle, _args.toVariant(), 2)
  }

  fun setRegionRect(rect: Rect2) {
    val _arg = Variant.new(rect)
    __method_bind.setRegionRect.call(this._handle, _arg, 1)
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, _arg, 1)
  }

  fun setVAxisStretchMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setVAxisStretchMode.call(this._handle, _arg, 1)
  }

  enum class AxisStretchMode(
    val value: Int
  ) {
    AXIS_STRETCH_MODE_STRETCH(0),

    AXIS_STRETCH_MODE_TILE(1),

    AXIS_STRETCH_MODE_TILE_FIT(2);

    companion object {
      fun from(value: Int): AxisStretchMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val AXIS_STRETCH_MODE_STRETCH: Int = 0

    val AXIS_STRETCH_MODE_TILE: Int = 1

    val AXIS_STRETCH_MODE_TILE_FIT: Int = 2

    fun new(): NinePatchRect = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("NinePatchRect".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NinePatchRect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NinePatchRect(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): NinePatchRect = NinePatchRect(ptr)
    /**
     * Container for method_bind pointers for NinePatchRect
     */
    private object __method_bind {
      val getHAxisStretchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
            "get_h_axis_stretch_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_axis_stretch_mode" }
        }
      val getPatchMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
            "get_patch_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_patch_margin" }
        }
      val getRegionRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
            "get_region_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_region_rect" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val getVAxisStretchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
            "get_v_axis_stretch_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_axis_stretch_mode" }
        }
      val isDrawCenterEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
            "is_draw_center_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_draw_center_enabled" }
        }
      val setDrawCenter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
            "set_draw_center".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_center" }
        }
      val setHAxisStretchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
            "set_h_axis_stretch_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_axis_stretch_mode" }
        }
      val setPatchMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
            "set_patch_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_patch_margin" }
        }
      val setRegionRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
            "set_region_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_region_rect" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }
      val setVAxisStretchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
            "set_v_axis_stretch_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_axis_stretch_mode" }
        }}
  }
}
