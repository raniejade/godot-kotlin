// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class NinePatchRect(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Control(null) {
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

  var patchMarginBottom: Int
    get() {
       return getPatchMargin(3) 
    }
    set(value) {
      setPatchMargin(3, value)
    }

  var patchMarginLeft: Int
    get() {
       return getPatchMargin(0) 
    }
    set(value) {
      setPatchMargin(0, value)
    }

  var patchMarginRight: Int
    get() {
       return getPatchMargin(2) 
    }
    set(value) {
      setPatchMargin(2, value)
    }

  var patchMarginTop: Int
    get() {
       return getPatchMargin(1) 
    }
    set(value) {
      setPatchMargin(1, value)
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
   * NinePatchRect::texture_changed signal
   */
  val signalTextureChanged: Signal0 = Signal0("texture_changed")

  constructor() : this(null) {
    _handle = __new()
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
    val _arg = Variant(margin)
    val _ret = __method_bind.getPatchMargin.call(this._handle, listOf(_arg))
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
    val _arg = Variant(drawCenter)
    __method_bind.setDrawCenter.call(this._handle, listOf(_arg))
  }

  fun setHAxisStretchMode(mode: Int) {
    val _arg = Variant(mode)
    __method_bind.setHAxisStretchMode.call(this._handle, listOf(_arg))
  }

  fun setPatchMargin(margin: Int, value: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(margin))
    _args.add(Variant.fromAny(value))
    __method_bind.setPatchMargin.call(this._handle, _args)
  }

  fun setRegionRect(rect: Rect2) {
    val _arg = Variant(rect)
    __method_bind.setRegionRect.call(this._handle, listOf(_arg))
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant(texture)
    __method_bind.setTexture.call(this._handle, listOf(_arg))
  }

  fun setVAxisStretchMode(mode: Int) {
    val _arg = Variant(mode)
    __method_bind.setVAxisStretchMode.call(this._handle, listOf(_arg))
  }

  enum class AxisStretchMode(
    val value: Int
  ) {
    STRETCH(0),

    TILE(1),

    TILE_FIT(2);

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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("NinePatchRect".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NinePatchRect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
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
