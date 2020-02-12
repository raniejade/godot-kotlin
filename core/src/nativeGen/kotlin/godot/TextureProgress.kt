// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class TextureProgress(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Range(null) {
  var fillMode: Int
    get() {
       return getFillMode() 
    }
    set(value) {
      setFillMode(value)
    }

  var ninePatchStretch: Boolean
    get() {
       return getNinePatchStretch() 
    }
    set(value) {
      setNinePatchStretch(value)
    }

  var radialCenterOffset: Vector2
    get() {
       return getRadialCenterOffset() 
    }
    set(value) {
      setRadialCenterOffset(value)
    }

  var radialFillDegrees: Float
    get() {
       return getFillDegrees() 
    }
    set(value) {
      setFillDegrees(value)
    }

  var radialInitialAngle: Float
    get() {
       return getRadialInitialAngle() 
    }
    set(value) {
      setRadialInitialAngle(value)
    }

  var stretchMarginBottom: Int
    get() {
       return getStretchMargin(3) 
    }
    set(value) {
      setStretchMargin(3, value)
    }

  var stretchMarginLeft: Int
    get() {
       return getStretchMargin(0) 
    }
    set(value) {
      setStretchMargin(0, value)
    }

  var stretchMarginRight: Int
    get() {
       return getStretchMargin(2) 
    }
    set(value) {
      setStretchMargin(2, value)
    }

  var stretchMarginTop: Int
    get() {
       return getStretchMargin(1) 
    }
    set(value) {
      setStretchMargin(1, value)
    }

  var textureOver: Texture
    get() {
       return getOverTexture() 
    }
    set(value) {
      setOverTexture(value)
    }

  var textureProgress: Texture
    get() {
       return getProgressTexture() 
    }
    set(value) {
      setProgressTexture(value)
    }

  var textureUnder: Texture
    get() {
       return getUnderTexture() 
    }
    set(value) {
      setUnderTexture(value)
    }

  var tintOver: Color
    get() {
       return getTintOver() 
    }
    set(value) {
      setTintOver(value)
    }

  var tintProgress: Color
    get() {
       return getTintProgress() 
    }
    set(value) {
      setTintProgress(value)
    }

  var tintUnder: Color
    get() {
       return getTintUnder() 
    }
    set(value) {
      setTintUnder(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for radialCenterOffset
   */
  fun radialCenterOffset(cb: Vector2.() -> Unit) {
    val _p = radialCenterOffset
    cb(_p)
    radialCenterOffset = _p
  }

  /**
   * Specialized setter for tintOver
   */
  fun tintOver(cb: Color.() -> Unit) {
    val _p = tintOver
    cb(_p)
    tintOver = _p
  }

  /**
   * Specialized setter for tintProgress
   */
  fun tintProgress(cb: Color.() -> Unit) {
    val _p = tintProgress
    cb(_p)
    tintProgress = _p
  }

  /**
   * Specialized setter for tintUnder
   */
  fun tintUnder(cb: Color.() -> Unit) {
    val _p = tintUnder
    cb(_p)
    tintUnder = _p
  }

  fun getFillDegrees(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFillDegrees.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFillMode(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFillMode.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getNinePatchStretch(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getNinePatchStretch.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getOverTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getOverTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getProgressTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getProgressTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getRadialCenterOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getRadialCenterOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRadialInitialAngle(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRadialInitialAngle.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getStretchMargin(margin: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStretchMargin.call(self._handle, listOf(margin), _retPtr)
      _ret.value
    }
  }

  fun getTintOver(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getTintOver.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTintProgress(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getTintProgress.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTintUnder(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getTintUnder.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUnderTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getUnderTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun setFillDegrees(mode: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFillDegrees.call(self._handle, listOf(mode), null)
    }
  }

  fun setFillMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFillMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setNinePatchStretch(stretch: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNinePatchStretch.call(self._handle, listOf(stretch), null)
    }
  }

  fun setOverTexture(tex: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOverTexture.call(self._handle, listOf(tex), null)
    }
  }

  fun setProgressTexture(tex: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setProgressTexture.call(self._handle, listOf(tex), null)
    }
  }

  fun setRadialCenterOffset(mode: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRadialCenterOffset.call(self._handle, listOf(mode), null)
    }
  }

  fun setRadialInitialAngle(mode: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRadialInitialAngle.call(self._handle, listOf(mode), null)
    }
  }

  fun setStretchMargin(margin: Int, value: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(margin)
      _args.add(value)
      __method_bind.setStretchMargin.call(self._handle, _args, null)
    }
  }

  fun setTintOver(tint: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTintOver.call(self._handle, listOf(tint), null)
    }
  }

  fun setTintProgress(tint: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTintProgress.call(self._handle, listOf(tint), null)
    }
  }

  fun setTintUnder(tint: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTintUnder.call(self._handle, listOf(tint), null)
    }
  }

  fun setUnderTexture(tex: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUnderTexture.call(self._handle, listOf(tex), null)
    }
  }

  enum class FillMode(
    val value: Int
  ) {
    LEFT_TO_RIGHT(0),

    RIGHT_TO_LEFT(1),

    TOP_TO_BOTTOM(2),

    BOTTOM_TO_TOP(3),

    CLOCKWISE(4),

    COUNTER_CLOCKWISE(5),

    BILINEAR_LEFT_AND_RIGHT(6),

    BILINEAR_TOP_AND_BOTTOM(7),

    CLOCKWISE_AND_COUNTER_CLOCKWISE(8);

    companion object {
      fun from(value: Int): FillMode {
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
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("TextureProgress".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TextureProgress" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for TextureProgress
     */
    private object __method_bind {
      val getFillDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "get_fill_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fill_degrees" }
        }
      val getFillMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "get_fill_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fill_mode" }
        }
      val getNinePatchStretch: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "get_nine_patch_stretch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_nine_patch_stretch" }
        }
      val getOverTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "get_over_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_over_texture" }
        }
      val getProgressTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "get_progress_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_progress_texture" }
        }
      val getRadialCenterOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "get_radial_center_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radial_center_offset" }
        }
      val getRadialInitialAngle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "get_radial_initial_angle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radial_initial_angle" }
        }
      val getStretchMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "get_stretch_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stretch_margin" }
        }
      val getTintOver: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "get_tint_over".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tint_over" }
        }
      val getTintProgress: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "get_tint_progress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tint_progress" }
        }
      val getTintUnder: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "get_tint_under".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tint_under" }
        }
      val getUnderTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "get_under_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_under_texture" }
        }
      val setFillDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "set_fill_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fill_degrees" }
        }
      val setFillMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "set_fill_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fill_mode" }
        }
      val setNinePatchStretch: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "set_nine_patch_stretch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_nine_patch_stretch" }
        }
      val setOverTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "set_over_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_over_texture" }
        }
      val setProgressTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "set_progress_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_progress_texture" }
        }
      val setRadialCenterOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "set_radial_center_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radial_center_offset" }
        }
      val setRadialInitialAngle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "set_radial_initial_angle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radial_initial_angle" }
        }
      val setStretchMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "set_stretch_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stretch_margin" }
        }
      val setTintOver: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "set_tint_over".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tint_over" }
        }
      val setTintProgress: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "set_tint_progress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tint_progress" }
        }
      val setTintUnder: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "set_tint_under".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tint_under" }
        }
      val setUnderTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureProgress".cstr.ptr,
            "set_under_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_under_texture" }
        }}
  }
}
