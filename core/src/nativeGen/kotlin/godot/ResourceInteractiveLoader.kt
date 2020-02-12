// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class ResourceInteractiveLoader(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getResource(): Resource {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Resource
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getResource.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Resource>(_tmp.value!!)
      _ret
    }
  }

  fun getStage(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStage.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getStageCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStageCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun poll(): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.poll.call(self._handle, emptyList(), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun wait(): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.wait.call(self._handle, emptyList(), _retPtr)
      GDError.from(_ret.value)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for ResourceInteractiveLoader
     */
    private object __method_bind {
      val getResource: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceInteractiveLoader".cstr.ptr,
            "get_resource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_resource" }
        }
      val getStage: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceInteractiveLoader".cstr.ptr,
            "get_stage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stage" }
        }
      val getStageCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceInteractiveLoader".cstr.ptr,
            "get_stage_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stage_count" }
        }
      val poll: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceInteractiveLoader".cstr.ptr,
            "poll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method poll" }
        }
      val wait: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourceInteractiveLoader".cstr.ptr,
            "wait".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method wait" }
        }}
  }
}
