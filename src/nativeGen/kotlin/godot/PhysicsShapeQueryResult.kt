// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PhysicsShapeQueryResult internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getResultCount(): Int {
    TODO()
  }

  fun getResultObject(idx: Int): Object {
    TODO()
  }

  fun getResultObjectId(idx: Int): Int {
    TODO()
  }

  fun getResultObjectShape(idx: Int): Int {
    TODO()
  }

  fun getResultRid(idx: Int): RID {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for PhysicsShapeQueryResult
     */
    private object __method_bind {
      val get_result_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryResult".cstr.ptr,
              "get_result_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_result_count" }
            }
          }

      val get_result_object: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryResult".cstr.ptr,
              "get_result_object".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_result_object" }
            }
          }

      val get_result_object_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryResult".cstr.ptr,
              "get_result_object_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_result_object_id" }
            }
          }

      val get_result_object_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryResult".cstr.ptr,
              "get_result_object_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_result_object_shape" }
            }
          }

      val get_result_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryResult".cstr.ptr,
              "get_result_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_result_rid" }
            }
          }
    }
  }
}
