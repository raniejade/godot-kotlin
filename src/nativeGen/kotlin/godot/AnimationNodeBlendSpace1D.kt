// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class AnimationNodeBlendSpace1D(
  _handle: COpaquePointer
) : AnimationRootNode(_handle) {
  var maxSpace: Float
    get() {
       return getMaxSpace() 
    }
    set(value) {
      setMaxSpace(value)
    }

  var minSpace: Float
    get() {
       return getMinSpace() 
    }
    set(value) {
      setMinSpace(value)
    }

  var snap: Float
    get() {
       return getSnap() 
    }
    set(value) {
      setSnap(value)
    }

  var valueLabel: String
    get() {
       return getValueLabel() 
    }
    set(value) {
      setValueLabel(value)
    }

  fun addBlendPoint(
    node: AnimationRootNode,
    pos: Float,
    atIndex: Int
  ) {
    val _args = VariantArray.new()
    _args.append(node)
    _args.append(pos)
    _args.append(atIndex)
    __method_bind.addBlendPoint.call(this._handle, _args.toVariant(), 3)
  }

  fun getBlendPointCount(): Int {
    val _ret = __method_bind.getBlendPointCount.call(this._handle)
    return _ret.asInt()
  }

  fun getBlendPointNode(point: Int): AnimationRootNode {
    val _arg = Variant.new(point)
    val _ret = __method_bind.getBlendPointNode.call(this._handle, _arg, 1)
    return _ret.asObject(::AnimationRootNode)!!
  }

  fun getBlendPointPosition(point: Int): Float {
    val _arg = Variant.new(point)
    val _ret = __method_bind.getBlendPointPosition.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getMaxSpace(): Float {
    val _ret = __method_bind.getMaxSpace.call(this._handle)
    return _ret.asFloat()
  }

  fun getMinSpace(): Float {
    val _ret = __method_bind.getMinSpace.call(this._handle)
    return _ret.asFloat()
  }

  fun getSnap(): Float {
    val _ret = __method_bind.getSnap.call(this._handle)
    return _ret.asFloat()
  }

  fun getValueLabel(): String {
    val _ret = __method_bind.getValueLabel.call(this._handle)
    return _ret.asString()
  }

  fun removeBlendPoint(point: Int) {
    val _arg = Variant.new(point)
    __method_bind.removeBlendPoint.call(this._handle, _arg, 1)
  }

  fun setBlendPointNode(point: Int, node: AnimationRootNode) {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(node)
    __method_bind.setBlendPointNode.call(this._handle, _args.toVariant(), 2)
  }

  fun setBlendPointPosition(point: Int, pos: Float) {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(pos)
    __method_bind.setBlendPointPosition.call(this._handle, _args.toVariant(), 2)
  }

  fun setMaxSpace(maxSpace: Float) {
    val _arg = Variant.new(maxSpace)
    __method_bind.setMaxSpace.call(this._handle, _arg, 1)
  }

  fun setMinSpace(minSpace: Float) {
    val _arg = Variant.new(minSpace)
    __method_bind.setMinSpace.call(this._handle, _arg, 1)
  }

  fun setSnap(snap: Float) {
    val _arg = Variant.new(snap)
    __method_bind.setSnap.call(this._handle, _arg, 1)
  }

  fun setValueLabel(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setValueLabel.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): AnimationNodeBlendSpace1D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeBlendSpace1D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeBlendSpace1D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeBlendSpace1D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNodeBlendSpace1D = AnimationNodeBlendSpace1D(ptr)
    /**
     * Container for method_bind pointers for AnimationNodeBlendSpace1D
     */
    private object __method_bind {
      val addBlendPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
            "add_blend_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_blend_point" }
        }
      val getBlendPointCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
            "get_blend_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_point_count" }
        }
      val getBlendPointNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
            "get_blend_point_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_point_node" }
        }
      val getBlendPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
            "get_blend_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_point_position" }
        }
      val getMaxSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
            "get_max_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_space" }
        }
      val getMinSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
            "get_min_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_min_space" }
        }
      val getSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
            "get_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_snap" }
        }
      val getValueLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
            "get_value_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_value_label" }
        }
      val removeBlendPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
            "remove_blend_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_blend_point" }
        }
      val setBlendPointNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
            "set_blend_point_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blend_point_node" }
        }
      val setBlendPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
            "set_blend_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blend_point_position" }
        }
      val setMaxSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
            "set_max_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_space" }
        }
      val setMinSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
            "set_min_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_min_space" }
        }
      val setSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
            "set_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_snap" }
        }
      val setValueLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
            "set_value_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_value_label" }
        }}
  }
}
