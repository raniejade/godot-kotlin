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
import godot.core.Vector2
import godot.core.Vector3
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

  open fun _im_update() {
    TODO()
  }

  open fun _queue_update() {
    TODO()
  }

  fun generateTriangleMesh(): TriangleMesh {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TriangleMesh
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.generateTriangleMesh.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<TriangleMesh>(_tmp.value!!)
      _ret
    }
  }

  fun getAlphaCutMode(): AlphaCutMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAlphaCutMode.call(self._handle, emptyList(), _retPtr)
      SpriteBase3D.AlphaCutMode.from(_ret.value)
    }
  }

  fun getAxis(): Vector3.Axis {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAxis.call(self._handle, emptyList(), _retPtr)
      Vector3.Axis.from(_ret.value)
    }
  }

  fun getBillboardMode(): SpatialMaterial.BillboardMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBillboardMode.call(self._handle, emptyList(), _retPtr)
      SpatialMaterial.BillboardMode.from(_ret.value)
    }
  }

  fun getDrawFlag(flag: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDrawFlag.call(self._handle, listOf(flag), _retPtr)
      _ret.value
    }
  }

  fun getItemRect(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getItemRect.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
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

  fun getOpacity(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOpacity.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPixelSize(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPixelSize.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
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

  fun setAlphaCutMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAlphaCutMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setAxis(axis: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAxis.call(self._handle, listOf(axis), null)
    }
  }

  fun setBillboardMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBillboardMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setCentered(centered: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCentered.call(self._handle, listOf(centered), null)
    }
  }

  fun setDrawFlag(flag: Int, enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(flag)
      _args.add(enabled)
      __method_bind.setDrawFlag.call(self._handle, _args, null)
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

  fun setModulate(modulate: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setModulate.call(self._handle, listOf(modulate), null)
    }
  }

  fun setOffset(offset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOffset.call(self._handle, listOf(offset), null)
    }
  }

  fun setOpacity(opacity: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOpacity.call(self._handle, listOf(opacity), null)
    }
  }

  fun setPixelSize(pixelSize: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPixelSize.call(self._handle, listOf(pixelSize), null)
    }
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
