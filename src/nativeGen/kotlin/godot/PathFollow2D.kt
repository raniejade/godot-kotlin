// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PathFollow2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getCubicInterpolation(): Boolean {
    val _ret = __method_bind.get_cubic_interpolation.call(this.toVariant())
    return _ret.asBool()
  }

  fun getHOffset(): Float {
    val _ret = __method_bind.get_h_offset.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getLookahead(): Float {
    val _ret = __method_bind.get_lookahead.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getOffset(): Float {
    val _ret = __method_bind.get_offset.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getUnitOffset(): Float {
    val _ret = __method_bind.get_unit_offset.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getVOffset(): Float {
    val _ret = __method_bind.get_v_offset.call(this.toVariant())
    return _ret.asFloat()
  }

  fun hasLoop(): Boolean {
    val _ret = __method_bind.has_loop.call(this.toVariant())
    return _ret.asBool()
  }

  fun isRotating(): Boolean {
    val _ret = __method_bind.is_rotating.call(this.toVariant())
    return _ret.asBool()
  }

  fun setCubicInterpolation(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_cubic_interpolation.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setHOffset(hOffset: Float) {
    val _args = VariantArray.new()
    _args.append(hOffset)
    __method_bind.set_h_offset.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setLookahead(lookahead: Float) {
    val _args = VariantArray.new()
    _args.append(lookahead)
    __method_bind.set_lookahead.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setLoop(loop: Boolean) {
    val _args = VariantArray.new()
    _args.append(loop)
    __method_bind.set_loop.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setOffset(offset: Float) {
    val _args = VariantArray.new()
    _args.append(offset)
    __method_bind.set_offset.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setRotate(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_rotate.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setUnitOffset(unitOffset: Float) {
    val _args = VariantArray.new()
    _args.append(unitOffset)
    __method_bind.set_unit_offset.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setVOffset(vOffset: Float) {
    val _args = VariantArray.new()
    _args.append(vOffset)
    __method_bind.set_v_offset.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): PathFollow2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PathFollow2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PathFollow2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PathFollow2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PathFollow2D = PathFollow2D(ptr)
    /**
     * Container for method_bind pointers for PathFollow2D
     */
    private object __method_bind {
      val get_cubic_interpolation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "get_cubic_interpolation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cubic_interpolation" }
            }
          }

      val get_h_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "get_h_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_h_offset" }
            }
          }

      val get_lookahead: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "get_lookahead".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lookahead" }
            }
          }

      val get_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val get_unit_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "get_unit_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_unit_offset" }
            }
          }

      val get_v_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "get_v_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_v_offset" }
            }
          }

      val has_loop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "has_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_loop" }
            }
          }

      val is_rotating: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "is_rotating".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_rotating" }
            }
          }

      val set_cubic_interpolation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "set_cubic_interpolation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cubic_interpolation" }
            }
          }

      val set_h_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "set_h_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_h_offset" }
            }
          }

      val set_lookahead: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "set_lookahead".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lookahead" }
            }
          }

      val set_loop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "set_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_loop" }
            }
          }

      val set_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "set_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offset" }
            }
          }

      val set_rotate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "set_rotate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rotate" }
            }
          }

      val set_unit_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "set_unit_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_unit_offset" }
            }
          }

      val set_v_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow2D".cstr.ptr,
              "set_v_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_v_offset" }
            }
          }
    }
  }
}
