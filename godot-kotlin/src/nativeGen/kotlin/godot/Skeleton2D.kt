// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
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

open class Skeleton2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  /**
   * Skeleton2D::bone_setup_changed signal
   */
  val signalBoneSetupChanged: Signal0 = Signal0("bone_setup_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _update_bone_setup() {
    TODO()
  }

  open fun _update_transform() {
    TODO()
  }

  fun getBone(idx: Int): Bone2D {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Bone2D
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getBone.call(self._handle, listOf(idx), _retPtr)
      _ret = objectToType<Bone2D>(_tmp.value!!)
      _ret
    }
  }

  fun getBoneCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBoneCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSkeleton(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getSkeleton.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Skeleton2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Skeleton2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Skeleton2D
     */
    private object __method_bind {
      val getBone: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton2D".cstr.ptr,
            "get_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone" }
        }
      val getBoneCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton2D".cstr.ptr,
            "get_bone_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_count" }
        }
      val getSkeleton: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton2D".cstr.ptr,
            "get_skeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skeleton" }
        }}
  }
}
