// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
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

open class World2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  val canvas: RID
    get() {
       return getCanvas() 
    }

  val directSpaceState: Physics2DDirectSpaceState
    get() {
       return getDirectSpaceState() 
    }

  val space: RID
    get() {
       return getSpace() 
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getCanvas(): RID {
    val _ret = __method_bind.getCanvas.call(this._handle)
    return _ret.asRID()
  }

  fun getDirectSpaceState(): Physics2DDirectSpaceState {
    val _ret = __method_bind.getDirectSpaceState.call(this._handle)
    return _ret.toAny() as Physics2DDirectSpaceState
  }

  fun getSpace(): RID {
    val _ret = __method_bind.getSpace.call(this._handle)
    return _ret.asRID()
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("World2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for World2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for World2D
     */
    private object __method_bind {
      val getCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World2D".cstr.ptr,
            "get_canvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_canvas" }
        }
      val getDirectSpaceState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World2D".cstr.ptr,
            "get_direct_space_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_direct_space_state" }
        }
      val getSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World2D".cstr.ptr,
            "get_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_space" }
        }}
  }
}
