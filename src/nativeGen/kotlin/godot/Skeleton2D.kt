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

open class Skeleton2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getBone(): Bone2D {
    TODO()
  }

  fun getBoneCount(): Int {
    TODO()
  }

  fun getSkeleton(): RID {
    TODO()
  }

  companion object {
    fun new(): Skeleton2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Skeleton2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Skeleton2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Skeleton2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Skeleton2D
     */
    private object __method_bind {
      val get_bone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton2D".cstr.ptr,
              "get_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone" }
            }
          }

      val get_bone_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton2D".cstr.ptr,
              "get_bone_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_count" }
            }
          }

      val get_skeleton: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton2D".cstr.ptr,
              "get_skeleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_skeleton" }
            }
          }
    }
  }
}
