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

open class PhysicsShapeQueryResult(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getResultCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getResultCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getResultObject(idx: Int): Object {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Object
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getResultObject.call(self._handle, listOf(idx), _retPtr)
      _ret = objectToType<Object>(_tmp.value!!)
      _ret
    }
  }

  fun getResultObjectId(idx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getResultObjectId.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun getResultObjectShape(idx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getResultObjectShape.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun getResultRid(idx: Int): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getResultRid.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for PhysicsShapeQueryResult
     */
    private object __method_bind {
      val getResultCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryResult".cstr.ptr,
            "get_result_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_result_count" }
        }
      val getResultObject: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryResult".cstr.ptr,
            "get_result_object".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_result_object" }
        }
      val getResultObjectId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryResult".cstr.ptr,
            "get_result_object_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_result_object_id" }
        }
      val getResultObjectShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryResult".cstr.ptr,
            "get_result_object_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_result_object_shape" }
        }
      val getResultRid: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryResult".cstr.ptr,
            "get_result_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_result_rid" }
        }}
  }
}
