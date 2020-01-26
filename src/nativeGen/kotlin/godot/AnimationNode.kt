// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNode internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addInput() {
    TODO()
  }

  fun blendAnimation() {
    TODO()
  }

  fun blendInput(): Float {
    TODO()
  }

  fun blendNode(): Float {
    TODO()
  }

  fun getInputCount(): Int {
    TODO()
  }

  fun getInputName(): String {
    TODO()
  }

  fun getParameter(): Variant {
    TODO()
  }

  fun isFilterEnabled(): Boolean {
    TODO()
  }

  fun isPathFiltered(): Boolean {
    TODO()
  }

  fun removeInput() {
    TODO()
  }

  fun setFilterEnabled() {
    TODO()
  }

  fun setFilterPath() {
    TODO()
  }

  fun setParameter() {
    TODO()
  }

  enum class FilterAction(
    val value: Int
  ) {
    FILTER_IGNORE(0),

    FILTER_PASS(1),

    FILTER_STOP(2),

    FILTER_BLEND(3);
  }

  companion object {
    val FILTER_BLEND: Int = 3

    val FILTER_IGNORE: Int = 0

    val FILTER_PASS: Int = 1

    val FILTER_STOP: Int = 2

    fun new(): AnimationNode = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNode".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationNode" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNode(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AnimationNode
     */
    private object __method_bind {
      val add_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "add_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_input" }
            }
          }

      val blend_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "blend_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend_animation" }
            }
          }

      val blend_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "blend_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend_input" }
            }
          }

      val blend_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "blend_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend_node" }
            }
          }

      val get_input_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "get_input_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_input_count" }
            }
          }

      val get_input_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "get_input_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_input_name" }
            }
          }

      val get_parameter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "get_parameter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parameter" }
            }
          }

      val is_filter_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "is_filter_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_filter_enabled" }
            }
          }

      val is_path_filtered: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "is_path_filtered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_path_filtered" }
            }
          }

      val remove_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "remove_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_input" }
            }
          }

      val set_filter_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "set_filter_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_filter_enabled" }
            }
          }

      val set_filter_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "set_filter_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_filter_path" }
            }
          }

      val set_parameter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "set_parameter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_parameter" }
            }
          }
    }
  }
}
