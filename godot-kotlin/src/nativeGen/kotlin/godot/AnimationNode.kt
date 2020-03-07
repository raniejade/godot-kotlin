// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class AnimationNode(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var filterEnabled: Boolean
    get() {
       return isFilterEnabled() 
    }
    set(value) {
      setFilterEnabled(value)
    }

  /**
   * AnimationNode::removed_from_graph signal
   */
  val signalRemovedFromGraph: Signal0 = Signal0("removed_from_graph")

  /**
   * AnimationNode::tree_changed signal
   */
  val signalTreeChanged: Signal0 = Signal0("tree_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _get_filters(): VariantArray {
    TODO()
  }

  open fun _set_filters(filters: VariantArray) {
    TODO()
  }

  fun addInput(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addInput.call(self._handle, listOf(name), null)
    }
  }

  fun blendAnimation(
    animation: String,
    time: Float,
    delta: Float,
    seeked: Boolean,
    blend: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(animation)
      _args.add(time)
      _args.add(delta)
      _args.add(seeked)
      _args.add(blend)
      __method_bind.blendAnimation.call(self._handle, _args, null)
    }
  }

  fun blendInput(
    inputIndex: Int,
    time: Float,
    seek: Boolean,
    blend: Float,
    filter: Int = 0,
    optimize: Boolean = true
  ): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(inputIndex)
      _args.add(time)
      _args.add(seek)
      _args.add(blend)
      _args.add(filter)
      _args.add(optimize)
      __method_bind.blendInput.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun blendNode(
    name: String,
    node: AnimationNode,
    time: Float,
    seek: Boolean,
    blend: Float,
    filter: Int = 0,
    optimize: Boolean = true
  ): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(node)
      _args.add(time)
      _args.add(seek)
      _args.add(blend)
      _args.add(filter)
      _args.add(optimize)
      __method_bind.blendNode.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  open fun get_caption(): String {
    TODO()
  }

  open fun get_child_by_name(name: String): Object {
    TODO()
  }

  open fun get_child_nodes(): Dictionary {
    TODO()
  }

  fun getInputCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getInputCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getInputName(input: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getInputName.call(self._handle, listOf(input), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getParameter(name: String): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getParameter.call(self._handle, listOf(name), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  open fun get_parameter_default_value(name: String): Variant {
    TODO()
  }

  open fun get_parameter_list(): VariantArray {
    TODO()
  }

  open fun has_filter(): String {
    TODO()
  }

  fun isFilterEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFilterEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPathFiltered(path: NodePath): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPathFiltered.call(self._handle, listOf(path), _retPtr)
      _ret.value
    }
  }

  open fun process(time: Float, seek: Boolean) {
    TODO()
  }

  fun removeInput(index: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeInput.call(self._handle, listOf(index), null)
    }
  }

  fun setFilterEnabled(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFilterEnabled.call(self._handle, listOf(enable), null)
    }
  }

  fun setFilterPath(path: NodePath, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(enable)
      __method_bind.setFilterPath.call(self._handle, _args, null)
    }
  }

  fun setParameter(name: String, value: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(value)
      __method_bind.setParameter.call(self._handle, _args, null)
    }
  }

  enum class FilterAction(
    val value: Int
  ) {
    IGNORE(0),

    PASS(1),

    STOP(2),

    BLEND(3);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNode".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNode" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AnimationNode
     */
    private object __method_bind {
      val addInput: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "add_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_input" }
            }
          }

      val blendAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "blend_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend_animation" }
            }
          }

      val blendInput: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "blend_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend_input" }
            }
          }

      val blendNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "blend_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend_node" }
            }
          }

      val getInputCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "get_input_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_input_count" }
            }
          }

      val getInputName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "get_input_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_input_name" }
            }
          }

      val getParameter: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "get_parameter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parameter" }
            }
          }

      val isFilterEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "is_filter_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_filter_enabled" }
            }
          }

      val isPathFiltered: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "is_path_filtered".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_path_filtered" }
            }
          }

      val removeInput: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "remove_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_input" }
            }
          }

      val setFilterEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "set_filter_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_filter_enabled" }
            }
          }

      val setFilterPath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "set_filter_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_filter_path" }
            }
          }

      val setParameter: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
              "set_parameter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_parameter" }
            }
          }
    }
  }
}
