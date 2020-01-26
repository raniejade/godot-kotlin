// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ConeTwistJoint internal constructor(
  _handle: COpaquePointer
) : Joint(_handle) {
  enum class Param(
    val value: Int
  ) {
    PARAM_SWING_SPAN(0),

    PARAM_TWIST_SPAN(1),

    PARAM_BIAS(2),

    PARAM_SOFTNESS(3),

    PARAM_RELAXATION(4),

    PARAM_MAX(5);
  }

  companion object {
    val PARAM_BIAS: Int = 2

    val PARAM_MAX: Int = 5

    val PARAM_RELAXATION: Int = 4

    val PARAM_SOFTNESS: Int = 3

    val PARAM_SWING_SPAN: Int = 0

    val PARAM_TWIST_SPAN: Int = 1

    fun new(): ConeTwistJoint = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConeTwistJoint".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ConeTwistJoint" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ConeTwistJoint(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ConeTwistJoint
     */
    private object __method_bind {
      val _get_swing_span: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConeTwistJoint".cstr.ptr,
              "_get_swing_span".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_swing_span" }
            }
          }

      val _get_twist_span: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConeTwistJoint".cstr.ptr,
              "_get_twist_span".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_twist_span" }
            }
          }

      val _set_swing_span: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConeTwistJoint".cstr.ptr,
              "_set_swing_span".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_swing_span" }
            }
          }

      val _set_twist_span: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConeTwistJoint".cstr.ptr,
              "_set_twist_span".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_twist_span" }
            }
          }

      val get_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConeTwistJoint".cstr.ptr,
              "get_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_param" }
            }
          }

      val set_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConeTwistJoint".cstr.ptr,
              "set_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_param" }
            }
          }
    }
  }
}
