// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class LargeTexture(
  _handle: COpaquePointer
) : Texture(_handle) {
  fun addPiece(ofs: Vector2, texture: Texture): Int {
    val _args = VariantArray.new()
    _args.append(ofs)
    _args.append(texture)
    val _ret = __method_bind.addPiece.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun getPieceCount(): Int {
    val _ret = __method_bind.getPieceCount.call(this._handle)
    return _ret.asInt()
  }

  fun getPieceOffset(idx: Int): Vector2 {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getPieceOffset.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getPieceTexture(idx: Int): Texture {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getPieceTexture.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun setPieceOffset(idx: Int, ofs: Vector2) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(ofs)
    __method_bind.setPieceOffset.call(this._handle, _args.toVariant(), 2)
  }

  fun setPieceTexture(idx: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(texture)
    __method_bind.setPieceTexture.call(this._handle, _args.toVariant(), 2)
  }

  fun setSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setSize.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): LargeTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("LargeTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for LargeTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      LargeTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): LargeTexture = LargeTexture(ptr)
    /**
     * Container for method_bind pointers for LargeTexture
     */
    private object __method_bind {
      val addPiece: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
            "add_piece".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_piece" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val getPieceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
            "get_piece_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_piece_count" }
        }
      val getPieceOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
            "get_piece_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_piece_offset" }
        }
      val getPieceTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
            "get_piece_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_piece_texture" }
        }
      val setPieceOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
            "set_piece_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_piece_offset" }
        }
      val setPieceTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
            "set_piece_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_piece_texture" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }}
  }
}
