// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNodeBlendSpace2D internal constructor(
  _handle: COpaquePointer
) : AnimationRootNode(_handle) {
  fun addBlendPoint(
    node: AnimationRootNode,
    pos: Vector2,
    atIndex: Int
  ) {
    val _args = VariantArray.new()
    _args.append(node)
    _args.append(pos)
    _args.append(atIndex)
    __method_bind.add_blend_point.call(this.toVariant(), _args.toVariant(), 3)
  }

  fun addTriangle(
    x: Int,
    y: Int,
    z: Int,
    atIndex: Int
  ) {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    _args.append(z)
    _args.append(atIndex)
    __method_bind.add_triangle.call(this.toVariant(), _args.toVariant(), 4)
  }

  fun getAutoTriangles(): Boolean {
    val _ret = __method_bind.get_auto_triangles.call(this.toVariant())
    return _ret.asBool()
  }

  fun getBlendMode(): BlendMode {
    val _ret = __method_bind.get_blend_mode.call(this.toVariant())
    return AnimationNodeBlendSpace2D.BlendMode.from(_ret.asInt())
  }

  fun getBlendPointCount(): Int {
    val _ret = __method_bind.get_blend_point_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getBlendPointNode(point: Int): AnimationRootNode {
    val _args = VariantArray.new()
    _args.append(point)
    val _ret = __method_bind.get_blend_point_node.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asObject(::AnimationRootNode)!!
  }

  fun getBlendPointPosition(point: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(point)
    val _ret = __method_bind.get_blend_point_position.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asVector2()
  }

  fun getMaxSpace(): Vector2 {
    val _ret = __method_bind.get_max_space.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getMinSpace(): Vector2 {
    val _ret = __method_bind.get_min_space.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getSnap(): Vector2 {
    val _ret = __method_bind.get_snap.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getTriangleCount(): Int {
    val _ret = __method_bind.get_triangle_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getTrianglePoint(triangle: Int, point: Int): Int {
    val _args = VariantArray.new()
    _args.append(triangle)
    _args.append(point)
    val _ret = __method_bind.get_triangle_point.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getXLabel(): String {
    val _ret = __method_bind.get_x_label.call(this.toVariant())
    return _ret.asString()
  }

  fun getYLabel(): String {
    val _ret = __method_bind.get_y_label.call(this.toVariant())
    return _ret.asString()
  }

  fun removeBlendPoint(point: Int) {
    val _args = VariantArray.new()
    _args.append(point)
    __method_bind.remove_blend_point.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun removeTriangle(triangle: Int) {
    val _args = VariantArray.new()
    _args.append(triangle)
    __method_bind.remove_triangle.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setAutoTriangles(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_auto_triangles.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setBlendMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    __method_bind.set_blend_mode.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setBlendPointNode(point: Int, node: AnimationRootNode) {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(node)
    __method_bind.set_blend_point_node.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setBlendPointPosition(point: Int, pos: Vector2) {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(pos)
    __method_bind.set_blend_point_position.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setMaxSpace(maxSpace: Vector2) {
    val _args = VariantArray.new()
    _args.append(maxSpace)
    __method_bind.set_max_space.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setMinSpace(minSpace: Vector2) {
    val _args = VariantArray.new()
    _args.append(minSpace)
    __method_bind.set_min_space.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setSnap(snap: Vector2) {
    val _args = VariantArray.new()
    _args.append(snap)
    __method_bind.set_snap.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setXLabel(text: String) {
    val _args = VariantArray.new()
    _args.append(text)
    __method_bind.set_x_label.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setYLabel(text: String) {
    val _args = VariantArray.new()
    _args.append(text)
    __method_bind.set_y_label.call(this.toVariant(), _args.toVariant(), 1)
  }

  enum class BlendMode(
    val value: Int
  ) {
    BLEND_MODE_INTERPOLATED(0),

    BLEND_MODE_DISCRETE(1),

    BLEND_MODE_DISCRETE_CARRY(2);

    companion object {
      fun from(value: Int): BlendMode {
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
    val BLEND_MODE_DISCRETE: Int = 1

    val BLEND_MODE_DISCRETE_CARRY: Int = 2

    val BLEND_MODE_INTERPOLATED: Int = 0

    fun new(): AnimationNodeBlendSpace2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeBlendSpace2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationNodeBlendSpace2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeBlendSpace2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNodeBlendSpace2D = AnimationNodeBlendSpace2D(ptr)
    /**
     * Container for method_bind pointers for AnimationNodeBlendSpace2D
     */
    private object __method_bind {
      val add_blend_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "add_blend_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_blend_point" }
            }
          }

      val add_triangle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "add_triangle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_triangle" }
            }
          }

      val get_auto_triangles: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_auto_triangles".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_auto_triangles" }
            }
          }

      val get_blend_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_mode" }
            }
          }

      val get_blend_point_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_blend_point_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_point_count" }
            }
          }

      val get_blend_point_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_blend_point_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_point_node" }
            }
          }

      val get_blend_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_blend_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_point_position" }
            }
          }

      val get_max_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_max_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_space" }
            }
          }

      val get_min_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_min_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_min_space" }
            }
          }

      val get_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_snap" }
            }
          }

      val get_triangle_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_triangle_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_triangle_count" }
            }
          }

      val get_triangle_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_triangle_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_triangle_point" }
            }
          }

      val get_x_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_x_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_x_label" }
            }
          }

      val get_y_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_y_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_y_label" }
            }
          }

      val remove_blend_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "remove_blend_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_blend_point" }
            }
          }

      val remove_triangle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "remove_triangle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_triangle" }
            }
          }

      val set_auto_triangles: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_auto_triangles".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_auto_triangles" }
            }
          }

      val set_blend_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_mode" }
            }
          }

      val set_blend_point_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_blend_point_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_point_node" }
            }
          }

      val set_blend_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_blend_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_point_position" }
            }
          }

      val set_max_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_max_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_space" }
            }
          }

      val set_min_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_min_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_min_space" }
            }
          }

      val set_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_snap" }
            }
          }

      val set_x_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_x_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_x_label" }
            }
          }

      val set_y_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_y_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_y_label" }
            }
          }
    }
  }
}
