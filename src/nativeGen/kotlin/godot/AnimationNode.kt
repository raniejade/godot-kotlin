// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
  fun getFilters(): VariantArray {
    TODO()
  }

  fun setFilters() {
    TODO()
  }

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

  fun getCaption(): String {
    TODO()
  }

  fun getChildByName(): Object {
    TODO()
  }

  fun getChildNodes(): Dictionary {
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

  fun getParameterDefaultValue(): Variant {
    TODO()
  }

  fun getParameterList(): VariantArray {
    TODO()
  }

  fun hasFilter(): String {
    TODO()
  }

  fun isFilterEnabled(): Boolean {
    TODO()
  }

  fun isPathFiltered(): Boolean {
    TODO()
  }

  fun process() {
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
      val _get_filters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "_get_filters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_filters" }
            }
          }

      val _set_filters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "_set_filters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_filters" }
            }
          }

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

      val get_caption: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "get_caption".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_caption" }
            }
          }

      val get_child_by_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "get_child_by_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_child_by_name" }
            }
          }

      val get_child_nodes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "get_child_nodes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_child_nodes" }
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

      val get_parameter_default_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "get_parameter_default_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parameter_default_value" }
            }
          }

      val get_parameter_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "get_parameter_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parameter_list" }
            }
          }

      val has_filter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "has_filter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_filter" }
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

      val process: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "process".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method process" }
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
