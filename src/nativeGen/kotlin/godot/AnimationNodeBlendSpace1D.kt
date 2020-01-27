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

open class AnimationNodeBlendSpace1D internal constructor(
  _handle: COpaquePointer
) : AnimationRootNode(_handle) {
  fun addBlendPoint(
    node: AnimationRootNode,
    pos: Float,
    atIndex: Int
  ) {
    val _args = VariantArray.new()
    _args.append(node)
    _args.append(pos)
    _args.append(atIndex)
    val _ret = __method_bind.add_blend_point.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun getBlendPointCount(): Int {
    val _ret = __method_bind.get_blend_point_count.call(this.toVariant())
    TODO()
  }

  fun getBlendPointNode(point: Int): AnimationRootNode {
    val _args = VariantArray.new()
    _args.append(point)
    val _ret = __method_bind.get_blend_point_node.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getBlendPointPosition(point: Int): Float {
    val _args = VariantArray.new()
    _args.append(point)
    val _ret = __method_bind.get_blend_point_position.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getMaxSpace(): Float {
    val _ret = __method_bind.get_max_space.call(this.toVariant())
    TODO()
  }

  fun getMinSpace(): Float {
    val _ret = __method_bind.get_min_space.call(this.toVariant())
    TODO()
  }

  fun getSnap(): Float {
    val _ret = __method_bind.get_snap.call(this.toVariant())
    TODO()
  }

  fun getValueLabel(): String {
    val _ret = __method_bind.get_value_label.call(this.toVariant())
    TODO()
  }

  fun removeBlendPoint(point: Int) {
    val _args = VariantArray.new()
    _args.append(point)
    val _ret = __method_bind.remove_blend_point.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBlendPointNode(point: Int, node: AnimationRootNode) {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(node)
    val _ret = __method_bind.set_blend_point_node.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setBlendPointPosition(point: Int, pos: Float) {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(pos)
    val _ret = __method_bind.set_blend_point_position.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setMaxSpace(maxSpace: Float) {
    val _args = VariantArray.new()
    _args.append(maxSpace)
    val _ret = __method_bind.set_max_space.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setMinSpace(minSpace: Float) {
    val _args = VariantArray.new()
    _args.append(minSpace)
    val _ret = __method_bind.set_min_space.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSnap(snap: Float) {
    val _args = VariantArray.new()
    _args.append(snap)
    val _ret = __method_bind.set_snap.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setValueLabel(text: String) {
    val _args = VariantArray.new()
    _args.append(text)
    val _ret = __method_bind.set_value_label.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): AnimationNodeBlendSpace1D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeBlendSpace1D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationNodeBlendSpace1D" }
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
      val add_blend_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "add_blend_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_blend_point" }
            }
          }

      val get_blend_point_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "get_blend_point_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_point_count" }
            }
          }

      val get_blend_point_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "get_blend_point_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_point_node" }
            }
          }

      val get_blend_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "get_blend_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_point_position" }
            }
          }

      val get_max_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "get_max_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_space" }
            }
          }

      val get_min_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "get_min_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_min_space" }
            }
          }

      val get_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "get_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_snap" }
            }
          }

      val get_value_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "get_value_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_value_label" }
            }
          }

      val remove_blend_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "remove_blend_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_blend_point" }
            }
          }

      val set_blend_point_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "set_blend_point_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_point_node" }
            }
          }

      val set_blend_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "set_blend_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_point_position" }
            }
          }

      val set_max_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "set_max_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_space" }
            }
          }

      val set_min_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "set_min_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_min_space" }
            }
          }

      val set_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "set_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_snap" }
            }
          }

      val set_value_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "set_value_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_value_label" }
            }
          }
    }
  }
}
