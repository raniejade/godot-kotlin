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

open class StyleBox internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun draw(canvasItem: RID, rect: Rect2) {
    val _args = VariantArray.new()
    _args.append(canvasItem)
    _args.append(rect)
    __method_bind.draw.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun getCenterSize(): Vector2 {
    val _ret = __method_bind.get_center_size.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getCurrentItemDrawn(): CanvasItem {
    val _ret = __method_bind.get_current_item_drawn.call(this.toVariant())
    return _ret.asObject(::CanvasItem)!!
  }

  fun getDefaultMargin(margin: Int): Float {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.get_default_margin.call(this.toVariant(), _arg, 1)
    return _ret.asFloat()
  }

  fun getMargin(margin: Int): Float {
    val _arg = Variant.new(margin)
    val _ret = __method_bind.get_margin.call(this.toVariant(), _arg, 1)
    return _ret.asFloat()
  }

  fun getMinimumSize(): Vector2 {
    val _ret = __method_bind.get_minimum_size.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.get_offset.call(this.toVariant())
    return _ret.asVector2()
  }

  fun setDefaultMargin(margin: Int, offset: Float) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(offset)
    __method_bind.set_default_margin.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun testMask(point: Vector2, rect: Rect2): Boolean {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(rect)
    val _ret = __method_bind.test_mask.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asBool()
  }

  companion object {
    /**
     * Container for method_bind pointers for StyleBox
     */
    private object __method_bind {
      val draw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw" }
            }
          }

      val get_center_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "get_center_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_center_size" }
            }
          }

      val get_current_item_drawn: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "get_current_item_drawn".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_item_drawn" }
            }
          }

      val get_default_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "get_default_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_default_margin" }
            }
          }

      val get_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "get_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_margin" }
            }
          }

      val get_minimum_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "get_minimum_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_minimum_size" }
            }
          }

      val get_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val set_default_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "set_default_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_margin" }
            }
          }

      val test_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "test_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method test_mask" }
            }
          }
    }
  }
}
