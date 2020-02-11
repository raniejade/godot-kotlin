// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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

  fun addInput(name: String) {
    val _arg = Variant(name)
    __method_bind.addInput.call(this._handle, listOf(_arg))
  }

  fun blendAnimation(
    animation: String,
    time: Float,
    delta: Float,
    seeked: Boolean,
    blend: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(animation))
    _args.add(Variant.fromAny(time))
    _args.add(Variant.fromAny(delta))
    _args.add(Variant.fromAny(seeked))
    _args.add(Variant.fromAny(blend))
    __method_bind.blendAnimation.call(this._handle, _args)
  }

  fun blendInput(
    inputIndex: Int,
    time: Float,
    seek: Boolean,
    blend: Float,
    filter: Int = 0,
    optimize: Boolean = true
  ): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(inputIndex))
    _args.add(Variant.fromAny(time))
    _args.add(Variant.fromAny(seek))
    _args.add(Variant.fromAny(blend))
    _args.add(Variant.fromAny(filter))
    _args.add(Variant.fromAny(optimize))
    val _ret = __method_bind.blendInput.call(this._handle, _args)
    return _ret.asFloat()
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
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(node))
    _args.add(Variant.fromAny(time))
    _args.add(Variant.fromAny(seek))
    _args.add(Variant.fromAny(blend))
    _args.add(Variant.fromAny(filter))
    _args.add(Variant.fromAny(optimize))
    val _ret = __method_bind.blendNode.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun getInputCount(): Int {
    val _ret = __method_bind.getInputCount.call(this._handle)
    return _ret.asInt()
  }

  fun getInputName(input: Int): String {
    val _arg = Variant(input)
    val _ret = __method_bind.getInputName.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getParameter(name: String): Variant {
    val _arg = Variant(name)
    val _ret = __method_bind.getParameter.call(this._handle, listOf(_arg))
    return _ret
  }

  fun isFilterEnabled(): Boolean {
    val _ret = __method_bind.isFilterEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPathFiltered(path: NodePath): Boolean {
    val _arg = Variant(path)
    val _ret = __method_bind.isPathFiltered.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun removeInput(index: Int) {
    val _arg = Variant(index)
    __method_bind.removeInput.call(this._handle, listOf(_arg))
  }

  fun setFilterEnabled(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setFilterEnabled.call(this._handle, listOf(_arg))
  }

  fun setFilterPath(path: NodePath, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(enable))
    __method_bind.setFilterPath.call(this._handle, _args)
  }

  fun setParameter(name: String, value: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(value))
    __method_bind.setParameter.call(this._handle, _args)
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
      val addInput: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "add_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_input" }
        }
      val blendAnimation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "blend_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend_animation" }
        }
      val blendInput: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "blend_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend_input" }
        }
      val blendNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "blend_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blend_node" }
        }
      val getInputCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "get_input_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_input_count" }
        }
      val getInputName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "get_input_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_input_name" }
        }
      val getParameter: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "get_parameter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parameter" }
        }
      val isFilterEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "is_filter_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_filter_enabled" }
        }
      val isPathFiltered: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "is_path_filtered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_path_filtered" }
        }
      val removeInput: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "remove_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_input" }
        }
      val setFilterEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "set_filter_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_filter_enabled" }
        }
      val setFilterPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "set_filter_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_filter_path" }
        }
      val setParameter: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "set_parameter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_parameter" }
        }}
  }
}
