// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Int
import kotlin.String
import kotlin.Suppress
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

open class LargeTexture(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Texture(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _get_data(): VariantArray {
    TODO()
  }

  open fun _set_data(data: VariantArray) {
    TODO()
  }

  fun addPiece(ofs: Vector2, texture: Texture): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(ofs)
      _args.add(texture)
      __method_bind.addPiece.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun getPieceCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPieceCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPieceOffset(idx: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getPieceOffset.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPieceTexture(idx: Int): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getPieceTexture.call(self._handle, listOf(idx), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun setPieceOffset(idx: Int, ofs: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(ofs)
      __method_bind.setPieceOffset.call(self._handle, _args, null)
    }
  }

  fun setPieceTexture(idx: Int, texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(texture)
      __method_bind.setPieceTexture.call(self._handle, _args, null)
    }
  }

  fun setSize(size: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSize.call(self._handle, listOf(size), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("LargeTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for LargeTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for LargeTexture
     */
    private object __method_bind {
      val addPiece: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "add_piece".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_piece" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val getPieceCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "get_piece_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_piece_count" }
            }
          }

      val getPieceOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "get_piece_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_piece_offset" }
            }
          }

      val getPieceTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "get_piece_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_piece_texture" }
            }
          }

      val setPieceOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "set_piece_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_piece_offset" }
            }
          }

      val setPieceTexture: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "set_piece_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_piece_texture" }
            }
          }

      val setSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "set_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_size" }
            }
          }
    }
  }
}
