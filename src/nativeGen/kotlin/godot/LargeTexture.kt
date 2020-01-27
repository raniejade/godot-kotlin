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

open class LargeTexture internal constructor(
  _handle: COpaquePointer
) : Texture(_handle) {
  fun addPiece(ofs: Vector2, texture: Texture): Int {
    val _args = VariantArray.new()
    _args.append(ofs)
    _args.append(texture)
    val _ret = __method_bind.add_piece.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun clear() {
    __method_bind.clear.call(this.toVariant())
  }

  fun getPieceCount(): Int {
    val _ret = __method_bind.get_piece_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getPieceOffset(idx: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_piece_offset.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asVector2()
  }

  fun getPieceTexture(idx: Int): Texture {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_piece_texture.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asObject(::Texture)!!
  }

  fun setPieceOffset(idx: Int, ofs: Vector2) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(ofs)
    __method_bind.set_piece_offset.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setPieceTexture(idx: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(texture)
    __method_bind.set_piece_texture.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setSize(size: Vector2) {
    val _args = VariantArray.new()
    _args.append(size)
    __method_bind.set_size.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): LargeTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("LargeTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton LargeTexture" }
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
      val add_piece: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "add_piece".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_piece" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val get_piece_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "get_piece_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_piece_count" }
            }
          }

      val get_piece_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "get_piece_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_piece_offset" }
            }
          }

      val get_piece_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "get_piece_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_piece_texture" }
            }
          }

      val set_piece_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "set_piece_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_piece_offset" }
            }
          }

      val set_piece_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "set_piece_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_piece_texture" }
            }
          }

      val set_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "set_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_size" }
            }
          }
    }
  }
}
