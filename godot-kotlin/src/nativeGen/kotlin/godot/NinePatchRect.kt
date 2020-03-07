// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHAxisStretchMode.call(self._handle, emptyList(), _retPtr)
      NinePatchRect.AxisStretchMode.from(_ret.value)
    }
  }

  fun getPatchMargin(margin: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPatchMargin.call(self._handle, listOf(margin), _retPtr)
      _ret.value
    }
  }

  fun getRegionRect(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getRegionRect.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getVAxisStretchMode(): AxisStretchMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVAxisStretchMode.call(self._handle, emptyList(), _retPtr)
      NinePatchRect.AxisStretchMode.from(_ret.value)
    }
  }

  fun isDrawCenterEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDrawCenterEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setDrawCenter(drawCenter: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDrawCenter.call(self._handle, listOf(drawCenter), null)
    }
  }

  fun setHAxisStretchMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHAxisStretchMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setPatchMargin(margin: Int, value: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(margin)
      _args.add(value)
      __method_bind.setPatchMargin.call(self._handle, _args, null)
    }
  }

  fun setRegionRect(rect: Rect2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRegionRect.call(self._handle, listOf(rect), null)
    }
  }

  fun setTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setVAxisStretchMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVAxisStretchMode.call(self._handle, listOf(mode), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("NinePatchRect".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NinePatchRect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for NinePatchRect
     */
    private object __method_bind {
      val getHAxisStretchMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "get_h_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_h_axis_stretch_mode" }
            }
          }

      val getPatchMargin: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "get_patch_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_patch_margin" }
            }
          }

      val getRegionRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "get_region_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_region_rect" }
            }
          }

      val getTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val getVAxisStretchMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "get_v_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_v_axis_stretch_mode" }
            }
          }

      val isDrawCenterEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "is_draw_center_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_draw_center_enabled" }
            }
          }

      val setDrawCenter: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "set_draw_center".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_center" }
            }
          }

      val setHAxisStretchMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "set_h_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_h_axis_stretch_mode" }
            }
          }

      val setPatchMargin: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "set_patch_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_patch_margin" }
            }
          }

      val setRegionRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "set_region_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region_rect" }
            }
          }

      val setTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val setVAxisStretchMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NinePatchRect".cstr.ptr,
              "set_v_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_v_axis_stretch_mode" }
            }
          }
    }
  }
}
