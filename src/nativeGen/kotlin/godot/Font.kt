// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Font(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun draw(
    canvasItem: RID,
    position: Vector2,
    string: String,
    modulate: Color = Color.rgb(1,1,1,1),
    clipW: Int = -1,
    outlineModulate: Color = Color.rgb(1,1,1,1)
  ) {
    val _args = VariantArray.new()
    _args.append(canvasItem)
    _args.append(position)
    _args.append(string)
    _args.append(modulate)
    _args.append(clipW)
    _args.append(outlineModulate)
    __method_bind.draw.call(this._handle, _args.toVariant(), 6)
  }

  fun drawChar(
    canvasItem: RID,
    position: Vector2,
    char: Int,
    next: Int = -1,
    modulate: Color = Color.rgb(1,1,1,1),
    outline: Boolean = false
  ): Float {
    val _args = VariantArray.new()
    _args.append(canvasItem)
    _args.append(position)
    _args.append(char)
    _args.append(next)
    _args.append(modulate)
    _args.append(outline)
    val _ret = __method_bind.drawChar.call(this._handle, _args.toVariant(), 6)
    return _ret.asFloat()
  }

  fun getAscent(): Float {
    val _ret = __method_bind.getAscent.call(this._handle)
    return _ret.asFloat()
  }

  fun getDescent(): Float {
    val _ret = __method_bind.getDescent.call(this._handle)
    return _ret.asFloat()
  }

  fun getHeight(): Float {
    val _ret = __method_bind.getHeight.call(this._handle)
    return _ret.asFloat()
  }

  fun getStringSize(string: String): Vector2 {
    val _arg = Variant.new(string)
    val _ret = __method_bind.getStringSize.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getWordwrapStringSize(string: String, pWidth: Float): Vector2 {
    val _args = VariantArray.new()
    _args.append(string)
    _args.append(pWidth)
    val _ret = __method_bind.getWordwrapStringSize.call(this._handle, _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun hasOutline(): Boolean {
    val _ret = __method_bind.hasOutline.call(this._handle)
    return _ret.asBoolean()
  }

  fun isDistanceFieldHint(): Boolean {
    val _ret = __method_bind.isDistanceFieldHint.call(this._handle)
    return _ret.asBoolean()
  }

  fun updateChanges() {
    __method_bind.updateChanges.call(this._handle)
  }

  companion object {
    /**
     * Container for method_bind pointers for Font
     */
    private object __method_bind {
      val draw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
            "draw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw" }
        }
      val drawChar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
            "draw_char".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_char" }
        }
      val getAscent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
            "get_ascent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ascent" }
        }
      val getDescent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
            "get_descent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_descent" }
        }
      val getHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
            "get_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_height" }
        }
      val getStringSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
            "get_string_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_string_size" }
        }
      val getWordwrapStringSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
            "get_wordwrap_string_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_wordwrap_string_size" }
        }
      val hasOutline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
            "has_outline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_outline" }
        }
      val isDistanceFieldHint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
            "is_distance_field_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_distance_field_hint" }
        }
      val updateChanges: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
            "update_changes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_changes" }
        }}
  }
}
