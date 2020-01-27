// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
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
  fun addInput(name: String) {
    val _args = VariantArray.new()
    _args.append(name)
    __method_bind.add_input.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun blendAnimation(
    animation: String,
    time: Float,
    delta: Float,
    seeked: Boolean,
    blend: Float
  ) {
    val _args = VariantArray.new()
    _args.append(animation)
    _args.append(time)
    _args.append(delta)
    _args.append(seeked)
    _args.append(blend)
    __method_bind.blend_animation.call(this.toVariant(), _args.toVariant(), 5)
  }

  fun blendInput(
    inputIndex: Int,
    time: Float,
    seek: Boolean,
    blend: Float,
    filter: Int,
    optimize: Boolean
  ): Float {
    val _args = VariantArray.new()
    _args.append(inputIndex)
    _args.append(time)
    _args.append(seek)
    _args.append(blend)
    _args.append(filter)
    _args.append(optimize)
    val _ret = __method_bind.blend_input.call(this.toVariant(), _args.toVariant(), 6)
    return _ret.asFloat()
  }

  fun blendNode(
    name: String,
    node: AnimationNode,
    time: Float,
    seek: Boolean,
    blend: Float,
    filter: Int,
    optimize: Boolean
  ): Float {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(node)
    _args.append(time)
    _args.append(seek)
    _args.append(blend)
    _args.append(filter)
    _args.append(optimize)
    val _ret = __method_bind.blend_node.call(this.toVariant(), _args.toVariant(), 7)
    return _ret.asFloat()
  }

  fun getInputCount(): Int {
    val _ret = __method_bind.get_input_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getInputName(input: Int): String {
    val _args = VariantArray.new()
    _args.append(input)
    val _ret = __method_bind.get_input_name.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asString()
  }

  fun getParameter(name: String): Variant {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.get_parameter.call(this.toVariant(), _args.toVariant(), 1)
    return _ret
  }

  fun isFilterEnabled(): Boolean {
    val _ret = __method_bind.is_filter_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isPathFiltered(path: NodePath): Boolean {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.is_path_filtered.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asBool()
  }

  fun removeInput(index: Int) {
    val _args = VariantArray.new()
    _args.append(index)
    __method_bind.remove_input.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setFilterEnabled(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_filter_enabled.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setFilterPath(path: NodePath, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(enable)
    __method_bind.set_filter_path.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setParameter(name: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(value)
    __method_bind.set_parameter.call(this.toVariant(), _args.toVariant(), 2)
  }

  enum class FilterAction(
    val value: Int
  ) {
    FILTER_IGNORE(0),

    FILTER_PASS(1),

    FILTER_STOP(2),

    FILTER_BLEND(3);

    companion object {
      fun from(value: Int): FilterAction {
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
    fun from(ptr: COpaquePointer): AnimationNode = AnimationNode(ptr)
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
