// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform2D
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Bone2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun applyRest() {
    TODO()
  }

  fun getDefaultLength(): Float {
    TODO()
  }

  fun getIndexInSkeleton(): Int {
    TODO()
  }

  fun getRest(): Transform2D {
    TODO()
  }

  fun getSkeletonRest(): Transform2D {
    TODO()
  }

  fun setDefaultLength(default_length: Float) {
    TODO()
  }

  fun setRest(rest: Transform2D) {
    TODO()
  }

  companion object {
    fun new(): Bone2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Bone2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Bone2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Bone2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Bone2D = Bone2D(ptr)
    /**
     * Container for method_bind pointers for Bone2D
     */
    private object __method_bind {
      val apply_rest: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
              "apply_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method apply_rest" }
            }
          }

      val get_default_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
              "get_default_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_default_length" }
            }
          }

      val get_index_in_skeleton: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
              "get_index_in_skeleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_index_in_skeleton" }
            }
          }

      val get_rest: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
              "get_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rest" }
            }
          }

      val get_skeleton_rest: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
              "get_skeleton_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_skeleton_rest" }
            }
          }

      val set_default_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
              "set_default_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_length" }
            }
          }

      val set_rest: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
              "set_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rest" }
            }
          }
    }
  }
}
