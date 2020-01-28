// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolIntArray
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

  var blendMode: Int
    get() {
       return AnimationNodeBlendSpace2D.BlendMode.from(getBlendMode()) 
    }
    set(value) {
      setBlendMode(AnimationNodeBlendSpace2D.BlendMode.from(value))
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

  var triangles: PoolIntArray
    get() {
       return _getTriangles() 
    }
    set(value) {
      _setTriangles(value)
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
            "addBlendPoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addBlendPoint" }
        }
      val addTriangle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "addTriangle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addTriangle" }
        }
      val getAutoTriangles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "getAutoTriangles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAutoTriangles" }
        }
      val getBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "getBlendMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBlendMode" }
        }
      val getBlendPointCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "getBlendPointCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBlendPointCount" }
        }
      val getBlendPointNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "getBlendPointNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBlendPointNode" }
        }
      val getBlendPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "getBlendPointPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBlendPointPosition" }
        }
      val getMaxSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "getMaxSpace".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaxSpace" }
        }
      val getMinSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "getMinSpace".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMinSpace" }
        }
      val getSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "getSnap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSnap" }
        }
      val getTriangleCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "getTriangleCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTriangleCount" }
        }
      val getTrianglePoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "getTrianglePoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTrianglePoint" }
        }
      val getXLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "getXLabel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getXLabel" }
        }
      val getYLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "getYLabel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getYLabel" }
        }
      val removeBlendPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "removeBlendPoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeBlendPoint" }
        }
      val removeTriangle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "removeTriangle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeTriangle" }
        }
      val setAutoTriangles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "setAutoTriangles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAutoTriangles" }
        }
      val setBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "setBlendMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBlendMode" }
        }
      val setBlendPointNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "setBlendPointNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBlendPointNode" }
        }
      val setBlendPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "setBlendPointPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBlendPointPosition" }
        }
      val setMaxSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "setMaxSpace".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaxSpace" }
        }
      val setMinSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "setMinSpace".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMinSpace" }
        }
      val setSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "setSnap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSnap" }
        }
      val setXLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "setXLabel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setXLabel" }
        }
      val setYLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "setYLabel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setYLabel" }
        }}
  }
}
