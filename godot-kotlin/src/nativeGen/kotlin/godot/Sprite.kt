// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class Sprite(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var centered: Boolean
    get() {
       return isCentered() 
    }
    set(value) {
      setCentered(value)
    }

  var flipH: Boolean
    get() {
       return isFlippedH() 
    }
    set(value) {
      setFlipH(value)
    }

  var flipV: Boolean
    get() {
       return isFlippedV() 
    }
    set(value) {
      setFlipV(value)
    }

  var frame: Int
    get() {
       return getFrame() 
    }
    set(value) {
      setFrame(value)
    }

  var frameCoords: Vector2
    get() {
       return getFrameCoords() 
    }
    set(value) {
      setFrameCoords(value)
    }

  var hframes: Int
    get() {
       return getHframes() 
    }
    set(value) {
      setHframes(value)
    }

  var normalMap: Texture
    get() {
       return getNormalMap() 
    }
    set(value) {
      setNormalMap(value)
    }

  var offset: Vector2
    get() {
       return getOffset() 
    }
    set(value) {
      setOffset(value)
    }

  var regionEnabled: Boolean
    get() {
       return isRegion() 
    }
    set(value) {
      setRegion(value)
    }

  var regionFilterClip: Boolean
    get() {
       return isRegionFilterClipEnabled() 
    }
    set(value) {
      setRegionFilterClip(value)
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

  var vframes: Int
    get() {
       return getVframes() 
    }
    set(value) {
      setVframes(value)
    }

  /**
   * Sprite::frame_changed signal
   */
  val signalFrameChanged: Signal0 = Signal0("frame_changed")

  /**
   * Sprite::texture_changed signal
   */
  val signalTextureChanged: Signal0 = Signal0("texture_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for frameCoords
   */
  fun frameCoords(cb: Vector2.() -> Unit) {
    val _p = frameCoords
    cb(_p)
    frameCoords = _p
  }

  /**
   * Specialized setter for offset
   */
  fun offset(cb: Vector2.() -> Unit) {
    val _p = offset
    cb(_p)
    offset = _p
  }

  /**
   * Specialized setter for regionRect
   */
  fun regionRect(cb: Rect2.() -> Unit) {
    val _p = regionRect
    cb(_p)
    regionRect = _p
  }

  open fun _texture_changed() {
    TODO()
  }

  fun getFrame(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFrame.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getFrameCoords(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getFrameCoords.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getHframes(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHframes.call(self._handle, emptyList(), _retPtr)
      _ret.value
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

  fun getOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRect(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getRect.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
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

  fun getVframes(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVframes.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isCentered(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCentered.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isFlippedH(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFlippedH.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isFlippedV(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFlippedV.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPixelOpaque(pos: Vector2): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPixelOpaque.call(self._handle, listOf(pos), _retPtr)
      _ret.value
    }
  }

  fun isRegion(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRegion.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isRegionFilterClipEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRegionFilterClipEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setCentered(centered: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCentered.call(self._handle, listOf(centered), null)
    }
  }

  fun setFlipH(flipH: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFlipH.call(self._handle, listOf(flipH), null)
    }
  }

  fun setFlipV(flipV: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFlipV.call(self._handle, listOf(flipV), null)
    }
  }

  fun setFrame(frame: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFrame.call(self._handle, listOf(frame), null)
    }
  }

  fun setFrameCoords(coords: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFrameCoords.call(self._handle, listOf(coords), null)
    }
  }

  fun setHframes(hframes: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHframes.call(self._handle, listOf(hframes), null)
    }
  }

  fun setNormalMap(normalMap: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNormalMap.call(self._handle, listOf(normalMap), null)
    }
  }

  fun setOffset(offset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOffset.call(self._handle, listOf(offset), null)
    }
  }

  fun setRegion(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRegion.call(self._handle, listOf(enabled), null)
    }
  }

  fun setRegionFilterClip(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRegionFilterClip.call(self._handle, listOf(enabled), null)
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

  fun setVframes(vframes: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVframes.call(self._handle, listOf(vframes), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Sprite".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Sprite" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Sprite
     */
    private object __method_bind {
      val getFrame: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame" }
            }
          }

      val getFrameCoords: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_frame_coords".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame_coords" }
            }
          }

      val getHframes: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_hframes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hframes" }
            }
          }

      val getNormalMap: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_normal_map" }
            }
          }

      val getOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val getRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rect" }
            }
          }

      val getRegionRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_region_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_region_rect" }
            }
          }

      val getTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val getVframes: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "get_vframes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vframes" }
            }
          }

      val isCentered: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "is_centered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_centered" }
            }
          }

      val isFlippedH: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "is_flipped_h".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_flipped_h" }
            }
          }

      val isFlippedV: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "is_flipped_v".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_flipped_v" }
            }
          }

      val isPixelOpaque: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "is_pixel_opaque".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_pixel_opaque" }
            }
          }

      val isRegion: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "is_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_region" }
            }
          }

      val isRegionFilterClipEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "is_region_filter_clip_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_region_filter_clip_enabled"
              }
            }
          }

      val setCentered: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_centered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_centered" }
            }
          }

      val setFlipH: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_flip_h".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flip_h" }
            }
          }

      val setFlipV: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_flip_v".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flip_v" }
            }
          }

      val setFrame: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frame" }
            }
          }

      val setFrameCoords: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_frame_coords".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frame_coords" }
            }
          }

      val setHframes: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_hframes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hframes" }
            }
          }

      val setNormalMap: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_normal_map" }
            }
          }

      val setOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offset" }
            }
          }

      val setRegion: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region" }
            }
          }

      val setRegionFilterClip: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_region_filter_clip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region_filter_clip" }
            }
          }

      val setRegionRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_region_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region_rect" }
            }
          }

      val setTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val setVframes: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sprite".cstr.ptr,
              "set_vframes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vframes" }
            }
          }
    }
  }
}
