// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class StyleBoxTexture(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : StyleBox(null) {
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

  var expandMarginBottom: Float
    get() {
       return getExpandMarginSize(3) 
    }
    set(value) {
      setExpandMarginSize(3, value)
    }

  var expandMarginLeft: Float
    get() {
       return getExpandMarginSize(0) 
    }
    set(value) {
      setExpandMarginSize(0, value)
    }

  var expandMarginRight: Float
    get() {
       return getExpandMarginSize(2) 
    }
    set(value) {
      setExpandMarginSize(2, value)
    }

  var expandMarginTop: Float
    get() {
       return getExpandMarginSize(1) 
    }
    set(value) {
      setExpandMarginSize(1, value)
    }

  var marginBottom: Float
    get() {
       return getMarginSize(3) 
    }
    set(value) {
      setMarginSize(3, value)
    }

  var marginLeft: Float
    get() {
       return getMarginSize(0) 
    }
    set(value) {
      setMarginSize(0, value)
    }

  var marginRight: Float
    get() {
       return getMarginSize(2) 
    }
    set(value) {
      setMarginSize(2, value)
    }

  var marginTop: Float
    get() {
       return getMarginSize(1) 
    }
    set(value) {
      setMarginSize(1, value)
    }

  var modulateColor: Color
    get() {
       return getModulate() 
    }
    set(value) {
      setModulate(value)
    }

  var normalMap: Texture
    get() {
       return getNormalMap() 
    }
    set(value) {
      setNormalMap(value)
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
   * StyleBoxTexture::texture_changed signal
   */
  val signalTextureChanged: Signal0 = Signal0("texture_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for modulateColor
   */
  fun modulateColor(cb: Color.() -> Unit) {
    val _p = modulateColor
    cb(_p)
    modulateColor = _p
  }

  /**
   * Specialized setter for regionRect
   */
  fun regionRect(cb: Rect2.() -> Unit) {
    val _p = regionRect
    cb(_p)
    regionRect = _p
  }

  fun getExpandMarginSize(margin: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getExpandMarginSize.call(self._handle, listOf(margin), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getHAxisStretchMode(): AxisStretchMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHAxisStretchMode.call(self._handle, emptyList(), _retPtr)
      StyleBoxTexture.AxisStretchMode.from(_ret.value)
    }
  }

  fun getMarginSize(margin: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMarginSize.call(self._handle, listOf(margin), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getModulate(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getModulate.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNormalMap(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNormalMap.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
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
      StyleBoxTexture.AxisStretchMode.from(_ret.value)
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

  fun setDrawCenter(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDrawCenter.call(self._handle, listOf(enable), null)
    }
  }

  fun setExpandMarginAll(size: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExpandMarginAll.call(self._handle, listOf(size), null)
    }
  }

  fun setExpandMarginIndividual(
    sizeLeft: Float,
    sizeTop: Float,
    sizeRight: Float,
    sizeBottom: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(sizeLeft)
      _args.add(sizeTop)
      _args.add(sizeRight)
      _args.add(sizeBottom)
      __method_bind.setExpandMarginIndividual.call(self._handle, _args, null)
    }
  }

  fun setExpandMarginSize(margin: Int, size: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(margin)
      _args.add(size)
      __method_bind.setExpandMarginSize.call(self._handle, _args, null)
    }
  }

  fun setHAxisStretchMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHAxisStretchMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setMarginSize(margin: Int, size: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(margin)
      _args.add(size)
      __method_bind.setMarginSize.call(self._handle, _args, null)
    }
  }

  fun setModulate(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setModulate.call(self._handle, listOf(color), null)
    }
  }

  fun setNormalMap(normalMap: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNormalMap.call(self._handle, listOf(normalMap), null)
    }
  }

  fun setRegionRect(region: Rect2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRegionRect.call(self._handle, listOf(region), null)
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
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("StyleBoxTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StyleBoxTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for StyleBoxTexture
     */
    private object __method_bind {
      val getExpandMarginSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_expand_margin_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_expand_margin_size" }
            }
          }

      val getHAxisStretchMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_h_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_h_axis_stretch_mode" }
            }
          }

      val getMarginSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_margin_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_margin_size" }
            }
          }

      val getModulate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_modulate" }
            }
          }

      val getNormalMap: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_normal_map" }
            }
          }

      val getRegionRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_region_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_region_rect" }
            }
          }

      val getTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val getVAxisStretchMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "get_v_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_v_axis_stretch_mode" }
            }
          }

      val isDrawCenterEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "is_draw_center_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_draw_center_enabled" }
            }
          }

      val setDrawCenter: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_draw_center".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_center" }
            }
          }

      val setExpandMarginAll: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_expand_margin_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_margin_all" }
            }
          }

      val setExpandMarginIndividual: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_expand_margin_individual".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_margin_individual" }
            }
          }

      val setExpandMarginSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_expand_margin_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_expand_margin_size" }
            }
          }

      val setHAxisStretchMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_h_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_h_axis_stretch_mode" }
            }
          }

      val setMarginSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_margin_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_margin_size" }
            }
          }

      val setModulate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_modulate" }
            }
          }

      val setNormalMap: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_normal_map" }
            }
          }

      val setRegionRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_region_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region_rect" }
            }
          }

      val setTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val setVAxisStretchMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxTexture".cstr.ptr,
              "set_v_axis_stretch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_v_axis_stretch_mode" }
            }
          }
    }
  }
}
