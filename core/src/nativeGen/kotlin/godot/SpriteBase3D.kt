// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
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

open class SpriteBase3D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : GeometryInstance(null) {
  var alphaCut: AlphaCutMode
    get() {
       return getAlphaCutMode() 
    }
    set(value) {
      setAlphaCutMode(value.value)
    }

  var axis: Vector3.Axis
    get() {
       return getAxis() 
    }
    set(value) {
      setAxis(value.value)
    }

  var billboard: SpatialMaterial.BillboardMode
    get() {
       return getBillboardMode() 
    }
    set(value) {
      setBillboardMode(value.value)
    }

  var centered: Boolean
    get() {
       return isCentered() 
    }
    set(value) {
      setCentered(value)
    }

  var doubleSided: Boolean
    get() {
       return getDrawFlag(2) 
    }
    set(value) {
      setDrawFlag(2, value)
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

  var modulate: Color
    get() {
       return getModulate() 
    }
    set(value) {
      setModulate(value)
    }

  var offset: Vector2
    get() {
       return getOffset() 
    }
    set(value) {
      setOffset(value)
    }

  var opacity: Float
    get() {
       return getOpacity() 
    }
    set(value) {
      setOpacity(value)
    }

  var pixelSize: Float
    get() {
       return getPixelSize() 
    }
    set(value) {
      setPixelSize(value)
    }

  var shaded: Boolean
    get() {
       return getDrawFlag(1) 
    }
    set(value) {
      setDrawFlag(1, value)
    }

  var transparent: Boolean
    get() {
       return getDrawFlag(0) 
    }
    set(value) {
      setDrawFlag(0, value)
    }

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for modulate
   */
  fun modulate(cb: Color.() -> Unit) {
    val _p = modulate
    cb(_p)
    modulate = _p
  }

  /**
   * Specialized setter for offset
   */
  fun offset(cb: Vector2.() -> Unit) {
    val _p = offset
    cb(_p)
    offset = _p
  }

  fun generateTriangleMesh(): TriangleMesh {
    val _ret = __method_bind.generateTriangleMesh.call(this._handle)
    return _ret.toAny() as TriangleMesh
  }

  fun getAlphaCutMode(): AlphaCutMode {
    val _ret = __method_bind.getAlphaCutMode.call(this._handle)
    return SpriteBase3D.AlphaCutMode.from(_ret.asInt())
  }

  fun getAxis(): Vector3.Axis {
    val _ret = __method_bind.getAxis.call(this._handle)
    return Vector3.Axis.from(_ret.asInt())
  }

  fun getBillboardMode(): SpatialMaterial.BillboardMode {
    val _ret = __method_bind.getBillboardMode.call(this._handle)
    return SpatialMaterial.BillboardMode.from(_ret.asInt())
  }

  fun getDrawFlag(flag: Int): Boolean {
    val _arg = Variant(flag)
    val _ret = __method_bind.getDrawFlag.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getItemRect(): Rect2 {
    val _ret = __method_bind.getItemRect.call(this._handle)
    return _ret.asRect2()
  }

  fun getModulate(): Color {
    val _ret = __method_bind.getModulate.call(this._handle)
    return _ret.asColor()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.getOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getOpacity(): Float {
    val _ret = __method_bind.getOpacity.call(this._handle)
    return _ret.asFloat()
  }

  fun getPixelSize(): Float {
    val _ret = __method_bind.getPixelSize.call(this._handle)
    return _ret.asFloat()
  }

  fun isCentered(): Boolean {
    val _ret = __method_bind.isCentered.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFlippedH(): Boolean {
    val _ret = __method_bind.isFlippedH.call(this._handle)
    return _ret.asBoolean()
  }

  fun isFlippedV(): Boolean {
    val _ret = __method_bind.isFlippedV.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAlphaCutMode(mode: Int) {
    val _arg = Variant(mode)
    __method_bind.setAlphaCutMode.call(this._handle, listOf(_arg))
  }

  fun setAxis(axis: Int) {
    val _arg = Variant(axis)
    __method_bind.setAxis.call(this._handle, listOf(_arg))
  }

  fun setBillboardMode(mode: Int) {
    val _arg = Variant(mode)
    __method_bind.setBillboardMode.call(this._handle, listOf(_arg))
  }

  fun setCentered(centered: Boolean) {
    val _arg = Variant(centered)
    __method_bind.setCentered.call(this._handle, listOf(_arg))
  }

  fun setDrawFlag(flag: Int, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(flag))
    _args.add(Variant.fromAny(enabled))
    __method_bind.setDrawFlag.call(this._handle, _args)
  }

  fun setFlipH(flipH: Boolean) {
    val _arg = Variant(flipH)
    __method_bind.setFlipH.call(this._handle, listOf(_arg))
  }

  fun setFlipV(flipV: Boolean) {
    val _arg = Variant(flipV)
    __method_bind.setFlipV.call(this._handle, listOf(_arg))
  }

  fun setModulate(modulate: Color) {
    val _arg = Variant(modulate)
    __method_bind.setModulate.call(this._handle, listOf(_arg))
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant(offset)
    __method_bind.setOffset.call(this._handle, listOf(_arg))
  }

  fun setOpacity(opacity: Float) {
    val _arg = Variant(opacity)
    __method_bind.setOpacity.call(this._handle, listOf(_arg))
  }

  fun setPixelSize(pixelSize: Float) {
    val _arg = Variant(pixelSize)
    __method_bind.setPixelSize.call(this._handle, listOf(_arg))
  }

  enum class DrawFlags(
    val value: Int
  ) {
    FLAG_TRANSPARENT(0),

    FLAG_SHADED(1),

    FLAG_DOUBLE_SIDED(2),

    FLAG_MAX(3);

    companion object {
      fun from(value: Int): DrawFlags {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class AlphaCutMode(
    val value: Int
  ) {
    DISABLED(0),

    DISCARD(1),

    OPAQUE_PREPASS(2);

    companion object {
      fun from(value: Int): AlphaCutMode {
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
    /**
     * Container for method_bind pointers for SpriteBase3D
     */
    private object __method_bind {
      val generateTriangleMesh: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "generate_triangle_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generate_triangle_mesh" }
        }
      val getAlphaCutMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "get_alpha_cut_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_alpha_cut_mode" }
        }
      val getAxis: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "get_axis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_axis" }
        }
      val getBillboardMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "get_billboard_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_billboard_mode" }
        }
      val getDrawFlag: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "get_draw_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_draw_flag" }
        }
      val getItemRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "get_item_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_item_rect" }
        }
      val getModulate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "get_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_modulate" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val getOpacity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "get_opacity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_opacity" }
        }
      val getPixelSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "get_pixel_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pixel_size" }
        }
      val isCentered: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "is_centered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_centered" }
        }
      val isFlippedH: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "is_flipped_h".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flipped_h" }
        }
      val isFlippedV: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "is_flipped_v".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_flipped_v" }
        }
      val setAlphaCutMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "set_alpha_cut_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_alpha_cut_mode" }
        }
      val setAxis: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "set_axis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_axis" }
        }
      val setBillboardMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "set_billboard_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_billboard_mode" }
        }
      val setCentered: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "set_centered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_centered" }
        }
      val setDrawFlag: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "set_draw_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_flag" }
        }
      val setFlipH: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "set_flip_h".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flip_h" }
        }
      val setFlipV: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "set_flip_v".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flip_v" }
        }
      val setModulate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "set_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_modulate" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val setOpacity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "set_opacity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_opacity" }
        }
      val setPixelSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "set_pixel_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pixel_size" }
        }}
  }
}
