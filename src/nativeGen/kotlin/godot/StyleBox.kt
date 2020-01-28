// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class StyleBox(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun draw(canvasItem: RID, rect: Rect2) {
    val _args = VariantArray.new()
    _args.append(canvasItem)
    _args.append(rect)
    __method_bind.draw.call(this._handle, _args.toVariant(), 2)
  }

  fun getCenterSize(): Vector2 {
    val _ret = __method_bind.getCenterSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getCurrentItemDrawn(): CanvasItem {
    val _ret = __method_bind.getCurrentItemDrawn.call(this._handle)
    return _ret.asObject(::CanvasItem)!!
  }

  fun getDefaultMargin(margin: Int): Float {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.getDefaultMargin.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getMargin(margin: Int): Float {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.getMargin.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getMinimumSize(): Vector2 {
    val _ret = __method_bind.getMinimumSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.getOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun setDefaultMargin(margin: Int, offset: Float) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(offset)
    __method_bind.setDefaultMargin.call(this._handle, _args.toVariant(), 2)
  }

  fun testMask(point: Vector2, rect: Rect2): Boolean {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(rect)
    val _ret = __method_bind.testMask.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  companion object {
    /**
     * Container for method_bind pointers for StyleBox
     */
    private object __method_bind {
      val draw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "draw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw" }
        }
      val getCenterSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "getCenterSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCenterSize" }
        }
      val getCurrentItemDrawn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "getCurrentItemDrawn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentItemDrawn" }
        }
      val getDefaultMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "getDefaultMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDefaultMargin" }
        }
      val getMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "getMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMargin" }
        }
      val getMinimumSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "getMinimumSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMinimumSize" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "getOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOffset" }
        }
      val setDefaultMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "setDefaultMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDefaultMargin" }
        }
      val testMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "testMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method testMask" }
        }}
  }
}
