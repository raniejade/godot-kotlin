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

open class AnimationNodeBlendSpace2D(
  _handle: COpaquePointer
) : AnimationRootNode(_handle) {
  var autoTriangles: Boolean
    get() {
       return getAutoTriangles() 
    }
    set(value) {
      setAutoTriangles(value)
    }

  var blendMode: BlendMode
    get() {
       return getBlendMode() 
    }
    set(value) {
      setBlendMode(value.value)
    }

  var maxSpace: Vector2
    get() {
       return getMaxSpace() 
    }
    set(value) {
      setMaxSpace(value)
    }

  var minSpace: Vector2
    get() {
       return getMinSpace() 
    }
    set(value) {
      setMinSpace(value)
    }

  var snap: Vector2
    get() {
       return getSnap() 
    }
    set(value) {
      setSnap(value)
    }

  var xLabel: String
    get() {
       return getXLabel() 
    }
    set(value) {
      setXLabel(value)
    }

  var yLabel: String
    get() {
       return getYLabel() 
    }
    set(value) {
      setYLabel(value)
    }

  fun addBlendPoint(
    node: AnimationRootNode,
    pos: Vector2,
    atIndex: Int
  ) {
    val _args = VariantArray.new()
    _args.append(node)
    _args.append(pos)
    _args.append(atIndex)
    __method_bind.addBlendPoint.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.addTriangle.call(this._handle, _args.toVariant(), 4)
  }

  fun getAutoTriangles(): Boolean {
    val _ret = __method_bind.getAutoTriangles.call(this._handle)
    return _ret.asBoolean()
  }

  fun getBlendMode(): BlendMode {
    val _ret = __method_bind.getBlendMode.call(this._handle)
    return AnimationNodeBlendSpace2D.BlendMode.from(_ret.asInt())
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

  fun getBlendPointPosition(point: Int): Vector2 {
    val _arg = Variant.new(point)
    val _ret = __method_bind.getBlendPointPosition.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getMaxSpace(): Vector2 {
    val _ret = __method_bind.getMaxSpace.call(this._handle)
    return _ret.asVector2()
  }

  fun getMinSpace(): Vector2 {
    val _ret = __method_bind.getMinSpace.call(this._handle)
    return _ret.asVector2()
  }

  fun getSnap(): Vector2 {
    val _ret = __method_bind.getSnap.call(this._handle)
    return _ret.asVector2()
  }

  fun getTriangleCount(): Int {
    val _ret = __method_bind.getTriangleCount.call(this._handle)
    return _ret.asInt()
  }

  fun getTrianglePoint(triangle: Int, point: Int): Int {
    val _args = VariantArray.new()
    _args.append(triangle)
    _args.append(point)
    val _ret = __method_bind.getTrianglePoint.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getXLabel(): String {
    val _ret = __method_bind.getXLabel.call(this._handle)
    return _ret.asString()
  }

  fun getYLabel(): String {
    val _ret = __method_bind.getYLabel.call(this._handle)
    return _ret.asString()
  }

  fun removeBlendPoint(point: Int) {
    val _arg = Variant.new(point)
    __method_bind.removeBlendPoint.call(this._handle, _arg, 1)
  }

  fun removeTriangle(triangle: Int) {
    val _arg = Variant.new(triangle)
    __method_bind.removeTriangle.call(this._handle, _arg, 1)
  }

  fun setAutoTriangles(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAutoTriangles.call(this._handle, _arg, 1)
  }

  fun setBlendMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setBlendMode.call(this._handle, _arg, 1)
  }

  fun setBlendPointNode(point: Int, node: AnimationRootNode) {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(node)
    __method_bind.setBlendPointNode.call(this._handle, _args.toVariant(), 2)
  }

  fun setBlendPointPosition(point: Int, pos: Vector2) {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(pos)
    __method_bind.setBlendPointPosition.call(this._handle, _args.toVariant(), 2)
  }

  fun setMaxSpace(maxSpace: Vector2) {
    val _arg = Variant.new(maxSpace)
    __method_bind.setMaxSpace.call(this._handle, _arg, 1)
  }

  fun setMinSpace(minSpace: Vector2) {
    val _arg = Variant.new(minSpace)
    __method_bind.setMinSpace.call(this._handle, _arg, 1)
  }

  fun setSnap(snap: Vector2) {
    val _arg = Variant.new(snap)
    __method_bind.setSnap.call(this._handle, _arg, 1)
  }

  fun setXLabel(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setXLabel.call(this._handle, _arg, 1)
  }

  fun setYLabel(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setYLabel.call(this._handle, _arg, 1)
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
      requireNotNull(fnPtr) { "No instance found for AnimationNodeBlendSpace2D" }
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
      val addBlendPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "add_blend_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_blend_point" }
        }
      val addTriangle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "add_triangle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_triangle" }
        }
      val getAutoTriangles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_auto_triangles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_auto_triangles" }
        }
      val getBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_blend_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_mode" }
        }
      val getBlendPointCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_blend_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_point_count" }
        }
      val getBlendPointNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_blend_point_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_point_node" }
        }
      val getBlendPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_blend_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_point_position" }
        }
      val getMaxSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_max_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_space" }
        }
      val getMinSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_min_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_min_space" }
        }
      val getSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_snap" }
        }
      val getTriangleCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_triangle_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_triangle_count" }
        }
      val getTrianglePoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_triangle_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_triangle_point" }
        }
      val getXLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_x_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_x_label" }
        }
      val getYLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_y_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_y_label" }
        }
      val removeBlendPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "remove_blend_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_blend_point" }
        }
      val removeTriangle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "remove_triangle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_triangle" }
        }
      val setAutoTriangles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_auto_triangles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_auto_triangles" }
        }
      val setBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_blend_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blend_mode" }
        }
      val setBlendPointNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_blend_point_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blend_point_node" }
        }
      val setBlendPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_blend_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blend_point_position" }
        }
      val setMaxSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_max_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_space" }
        }
      val setMinSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_min_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_min_space" }
        }
      val setSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_snap" }
        }
      val setXLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_x_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_x_label" }
        }
      val setYLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_y_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_y_label" }
        }}
  }
}
