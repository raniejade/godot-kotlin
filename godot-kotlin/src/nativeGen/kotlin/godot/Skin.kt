// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Transform
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

open class Skin(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addBind(bone: Int, pose: Transform) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(bone)
      _args.add(pose)
      __method_bind.addBind.call(self._handle, _args, null)
    }
  }

  fun clearBinds() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearBinds.call(self._handle, emptyList(), null)
    }
  }

  fun getBindBone(bindIndex: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBindBone.call(self._handle, listOf(bindIndex), _retPtr)
      _ret.value
    }
  }

  fun getBindCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBindCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getBindPose(bindIndex: Int): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getBindPose.call(self._handle, listOf(bindIndex), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setBindBone(bindIndex: Int, bone: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(bindIndex)
      _args.add(bone)
      __method_bind.setBindBone.call(self._handle, _args, null)
    }
  }

  fun setBindCount(bindCount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBindCount.call(self._handle, listOf(bindCount), null)
    }
  }

  fun setBindPose(bindIndex: Int, pose: Transform) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(bindIndex)
      _args.add(pose)
      __method_bind.setBindPose.call(self._handle, _args, null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Skin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Skin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Skin
     */
    private object __method_bind {
      val addBind: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "add_bind".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_bind" }
        }
      val clearBinds: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "clear_binds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_binds" }
        }
      val getBindBone: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "get_bind_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bind_bone" }
        }
      val getBindCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "get_bind_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bind_count" }
        }
      val getBindPose: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "get_bind_pose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bind_pose" }
        }
      val setBindBone: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "set_bind_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bind_bone" }
        }
      val setBindCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "set_bind_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bind_count" }
        }
      val setBindPose: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skin".cstr.ptr,
            "set_bind_pose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bind_pose" }
        }}
  }
}
