// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class GrooveJoint2D internal constructor(
  _handle: COpaquePointer
) : Joint2D(_handle) {
  fun getInitialOffset(): Float {
    val _ret = __method_bind.get_initial_offset.call(this._handle)
    return _ret.asFloat()
  }

  fun getLength(): Float {
    val _ret = __method_bind.get_length.call(this._handle)
    return _ret.asFloat()
  }

  fun setInitialOffset(offset: Float) {
    val _arg = Variant.new(offset)
    __method_bind.set_initial_offset.call(this._handle, _arg, 1)
  }

  fun setLength(length: Float) {
    val _arg = Variant.new(length)
    __method_bind.set_length.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): GrooveJoint2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GrooveJoint2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GrooveJoint2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GrooveJoint2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): GrooveJoint2D = GrooveJoint2D(ptr)
    /**
     * Container for method_bind pointers for GrooveJoint2D
     */
    private object __method_bind {
      val get_initial_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GrooveJoint2D".cstr.ptr,
            "get_initial_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_initial_offset" }
        }
      val get_length: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GrooveJoint2D".cstr.ptr,
            "get_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_length" }
        }
      val set_initial_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GrooveJoint2D".cstr.ptr,
            "set_initial_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_initial_offset" }
        }
      val set_length: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GrooveJoint2D".cstr.ptr,
            "set_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_length" }
        }}
  }
}
