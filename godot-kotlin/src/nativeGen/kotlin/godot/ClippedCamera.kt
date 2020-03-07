// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class ClippedCamera(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Camera(null) {
  var clipToAreas: Boolean
    get() {
       return isClipToAreasEnabled() 
    }
    set(value) {
      setClipToAreas(value)
    }

  var clipToBodies: Boolean
    get() {
       return isClipToBodiesEnabled() 
    }
    set(value) {
      setClipToBodies(value)
    }

  var collisionMask: Int
    get() {
       return getCollisionMask() 
    }
    set(value) {
      setCollisionMask(value)
    }

  var margin: Float
    get() {
       return getMargin() 
    }
    set(value) {
      setMargin(value)
    }

  var processMode: ProcessMode
    get() {
       return getProcessMode() 
    }
    set(value) {
      setProcessMode(value.value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addException(node: Object) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addException.call(self._handle, listOf(node), null)
    }
  }

  fun addExceptionRid(rid: RID) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addExceptionRid.call(self._handle, listOf(rid), null)
    }
  }

  fun clearExceptions() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearExceptions.call(self._handle, emptyList(), null)
    }
  }

  fun getClipOffset(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getClipOffset.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getCollisionMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionMaskBit.call(self._handle, listOf(bit), _retPtr)
      _ret.value
    }
  }

  fun getMargin(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMargin.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getProcessMode(): ProcessMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getProcessMode.call(self._handle, emptyList(), _retPtr)
      ClippedCamera.ProcessMode.from(_ret.value)
    }
  }

  fun isClipToAreasEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isClipToAreasEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isClipToBodiesEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isClipToBodiesEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun removeException(node: Object) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeException.call(self._handle, listOf(node), null)
    }
  }

  fun removeExceptionRid(rid: RID) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeExceptionRid.call(self._handle, listOf(rid), null)
    }
  }

  fun setClipToAreas(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setClipToAreas.call(self._handle, listOf(enable), null)
    }
  }

  fun setClipToBodies(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setClipToBodies.call(self._handle, listOf(enable), null)
    }
  }

  fun setCollisionMask(mask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionMask.call(self._handle, listOf(mask), null)
    }
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(bit)
      _args.add(value)
      __method_bind.setCollisionMaskBit.call(self._handle, _args, null)
    }
  }

  fun setMargin(margin: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMargin.call(self._handle, listOf(margin), null)
    }
  }

  fun setProcessMode(processMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setProcessMode.call(self._handle, listOf(processMode), null)
    }
  }

  enum class ProcessMode(
    val value: Int
  ) {
    CLIP_PROCESS_PHYSICS(0),

    CLIP_PROCESS_IDLE(1);

    companion object {
      fun from(value: Int): ProcessMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ClippedCamera".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ClippedCamera" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ClippedCamera
     */
    private object __method_bind {
      val addException: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "add_exception".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_exception" }
            }
          }

      val addExceptionRid: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "add_exception_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_exception_rid" }
            }
          }

      val clearExceptions: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "clear_exceptions".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_exceptions" }
            }
          }

      val getClipOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "get_clip_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_clip_offset" }
            }
          }

      val getCollisionMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "get_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
            }
          }

      val getCollisionMaskBit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "get_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
            }
          }

      val getMargin: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "get_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_margin" }
            }
          }

      val getProcessMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "get_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_process_mode" }
            }
          }

      val isClipToAreasEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "is_clip_to_areas_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_clip_to_areas_enabled" }
            }
          }

      val isClipToBodiesEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "is_clip_to_bodies_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_clip_to_bodies_enabled" }
            }
          }

      val removeException: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "remove_exception".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_exception" }
            }
          }

      val removeExceptionRid: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "remove_exception_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_exception_rid" }
            }
          }

      val setClipToAreas: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "set_clip_to_areas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_clip_to_areas" }
            }
          }

      val setClipToBodies: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "set_clip_to_bodies".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_clip_to_bodies" }
            }
          }

      val setCollisionMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "set_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
            }
          }

      val setCollisionMaskBit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "set_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
            }
          }

      val setMargin: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "set_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_margin" }
            }
          }

      val setProcessMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "set_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_process_mode" }
            }
          }
    }
  }
}
