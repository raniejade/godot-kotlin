// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SpriteBase3D(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  var alphaCut: Int
    get() {
       return SpriteBase3D.AlphaCutMode.from(getAlphaCutMode()) 
    }
    set(value) {
      setAlphaCutMode(SpriteBase3D.AlphaCutMode.from(value))
    }

  var axis: Int
    get() {
       return Vector3.Axis.from(getAxis()) 
    }
    set(value) {
      setAxis(Vector3.Axis.from(value))
    }

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

  fun generateTriangleMesh(): TriangleMesh {
    val _ret = __method_bind.generateTriangleMesh.call(this._handle)
    return _ret.asObject(::TriangleMesh)!!
  }

  fun getAlphaCutMode(): AlphaCutMode {
    val _ret = __method_bind.getAlphaCutMode.call(this._handle)
    return SpriteBase3D.AlphaCutMode.from(_ret.asInt())
  }

  fun getAxis(): Vector3.Axis {
    val _ret = __method_bind.getAxis.call(this._handle)
    return Vector3.Axis.from(_ret.asInt())
  }

  fun getDrawFlag(flag: Int): Boolean {
    val _arg = Variant.new(flag)
    val _ret = __method_bind.getDrawFlag.call(this._handle, _arg, 1)
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
    val _arg = Variant.new(mode)
    __method_bind.setAlphaCutMode.call(this._handle, _arg, 1)
  }

  fun setAxis(axis: Int) {
    val _arg = Variant.new(axis)
    __method_bind.setAxis.call(this._handle, _arg, 1)
  }

  fun setCentered(centered: Boolean) {
    val _arg = Variant.new(centered)
    __method_bind.setCentered.call(this._handle, _arg, 1)
  }

  fun setDrawFlag(flag: Int, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(flag)
    _args.append(enabled)
    __method_bind.setDrawFlag.call(this._handle, _args.toVariant(), 2)
  }

  fun setFlipH(flipH: Boolean) {
    val _arg = Variant.new(flipH)
    __method_bind.setFlipH.call(this._handle, _arg, 1)
  }

  fun setFlipV(flipV: Boolean) {
    val _arg = Variant.new(flipV)
    __method_bind.setFlipV.call(this._handle, _arg, 1)
  }

  fun setModulate(modulate: Color) {
    val _arg = Variant.new(modulate)
    __method_bind.setModulate.call(this._handle, _arg, 1)
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.setOffset.call(this._handle, _arg, 1)
  }

  fun setOpacity(opacity: Float) {
    val _arg = Variant.new(opacity)
    __method_bind.setOpacity.call(this._handle, _arg, 1)
  }

  fun setPixelSize(pixelSize: Float) {
    val _arg = Variant.new(pixelSize)
    __method_bind.setPixelSize.call(this._handle, _arg, 1)
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
    ALPHA_CUT_DISABLED(0),

    ALPHA_CUT_DISCARD(1),

    ALPHA_CUT_OPAQUE_PREPASS(2);

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
    val ALPHA_CUT_DISABLED: Int = 0

    val ALPHA_CUT_DISCARD: Int = 1

    val ALPHA_CUT_OPAQUE_PREPASS: Int = 2

    val FLAG_DOUBLE_SIDED: Int = 2

    val FLAG_MAX: Int = 3

    val FLAG_SHADED: Int = 1

    val FLAG_TRANSPARENT: Int = 0

    /**
     * Container for method_bind pointers for SpriteBase3D
     */
    private object __method_bind {
      val generateTriangleMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "generateTriangleMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generateTriangleMesh" }
        }
      val getAlphaCutMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "getAlphaCutMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAlphaCutMode" }
        }
      val getAxis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "getAxis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAxis" }
        }
      val getDrawFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "getDrawFlag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDrawFlag" }
        }
      val getItemRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "getItemRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getItemRect" }
        }
      val getModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "getModulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getModulate" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "getOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOffset" }
        }
      val getOpacity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "getOpacity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOpacity" }
        }
      val getPixelSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "getPixelSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPixelSize" }
        }
      val isCentered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "isCentered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCentered" }
        }
      val isFlippedH: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "isFlippedH".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFlippedH" }
        }
      val isFlippedV: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "isFlippedV".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFlippedV" }
        }
      val setAlphaCutMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "setAlphaCutMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAlphaCutMode" }
        }
      val setAxis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "setAxis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAxis" }
        }
      val setCentered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "setCentered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCentered" }
        }
      val setDrawFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "setDrawFlag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDrawFlag" }
        }
      val setFlipH: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "setFlipH".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFlipH" }
        }
      val setFlipV: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "setFlipV".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFlipV" }
        }
      val setModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "setModulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setModulate" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "setOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOffset" }
        }
      val setOpacity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "setOpacity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOpacity" }
        }
      val setPixelSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteBase3D".cstr.ptr,
            "setPixelSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPixelSize" }
        }}
  }
}
