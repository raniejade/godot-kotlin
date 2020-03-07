// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getCanvas(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getCanvas.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getDirectSpaceState(): Physics2DDirectSpaceState {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Physics2DDirectSpaceState
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getDirectSpaceState.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Physics2DDirectSpaceState>(_tmp.value!!)
      _ret
    }
  }

  fun getSpace(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getSpace.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("World2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for World2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for World2D
     */
    private object __method_bind {
      val getCanvas: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World2D".cstr.ptr,
              "get_canvas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_canvas" }
            }
          }

      val getDirectSpaceState: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World2D".cstr.ptr,
              "get_direct_space_state".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_direct_space_state" }
            }
          }

      val getSpace: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World2D".cstr.ptr,
              "get_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_space" }
            }
          }
    }
  }
}
