// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class GrooveJoint2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Joint2D(null) {
  var initialOffset: Float
    get() {
       return getInitialOffset() 
    }
    set(value) {
      setInitialOffset(value)
    }

  var length: Float
    get() {
       return getLength() 
    }
    set(value) {
      setLength(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getInitialOffset(): Float {
    val _ret = __method_bind.getInitialOffset.call(this._handle)
    return _ret.asFloat()
  }

  fun getLength(): Float {
    val _ret = __method_bind.getLength.call(this._handle)
    return _ret.asFloat()
  }

  fun setInitialOffset(offset: Float) {
    val _arg = Variant(offset)
    __method_bind.setInitialOffset.call(this._handle, listOf(_arg))
  }

  fun setLength(length: Float) {
    val _arg = Variant(length)
    __method_bind.setLength.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GrooveJoint2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GrooveJoint2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for GrooveJoint2D
     */
    private object __method_bind {
      val getInitialOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GrooveJoint2D".cstr.ptr,
            "get_initial_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_initial_offset" }
        }
      val getLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GrooveJoint2D".cstr.ptr,
            "get_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_length" }
        }
      val setInitialOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GrooveJoint2D".cstr.ptr,
            "set_initial_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_initial_offset" }
        }
      val setLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GrooveJoint2D".cstr.ptr,
            "set_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_length" }
        }}
  }
}
