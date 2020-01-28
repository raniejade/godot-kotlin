// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CanvasLayer(
  _handle: COpaquePointer
) : Node(_handle) {
  var customViewport: Node
    get() {
       return getCustomViewport() 
    }
    set(value) {
      setCustomViewport(value)
    }

  var followViewportEnable: Boolean
    get() {
       return isFollowingViewport() 
    }
    set(value) {
      setFollowViewport(value)
    }

  var followViewportScale: Float
    get() {
       return getFollowViewportScale() 
    }
    set(value) {
      setFollowViewportScale(value)
    }

  var layer: Int
    get() {
       return getLayer() 
    }
    set(value) {
      setLayer(value)
    }

  var offset: Vector2
    get() {
       return getOffset() 
    }
    set(value) {
      setOffset(value)
    }

  var rotation: Float
    get() {
       return getRotation() 
    }
    set(value) {
      setRotation(value)
    }

  var rotationDegrees: Float
    get() {
       return getRotationDegrees() 
    }
    set(value) {
      setRotationDegrees(value)
    }

  var scale: Vector2
    get() {
       return getScale() 
    }
    set(value) {
      setScale(value)
    }

  var transform: Transform2D
    get() {
       return getTransform() 
    }
    set(value) {
      setTransform(value)
    }

  /**
   * Specialized setter for offset
   */
  fun offset(cb: Vector2.() -> Unit) {
    val _p = offset
    cb(_p)
    offset = _p
  }

  /**
   * Specialized setter for scale
   */
  fun scale(cb: Vector2.() -> Unit) {
    val _p = scale
    cb(_p)
    scale = _p
  }

  /**
   * Specialized setter for transform
   */
  fun transform(cb: Transform2D.() -> Unit) {
    val _p = transform
    cb(_p)
    transform = _p
  }

  fun getCanvas(): RID {
    val _ret = __method_bind.getCanvas.call(this._handle)
    return _ret.asRID()
  }

  fun getCustomViewport(): Node {
    val _ret = __method_bind.getCustomViewport.call(this._handle)
    return _ret.asObject(::Node)!!
  }

  fun getFollowViewportScale(): Float {
    val _ret = __method_bind.getFollowViewportScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getLayer(): Int {
    val _ret = __method_bind.getLayer.call(this._handle)
    return _ret.asInt()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.getOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getRotation(): Float {
    val _ret = __method_bind.getRotation.call(this._handle)
    return _ret.asFloat()
  }

  fun getRotationDegrees(): Float {
    val _ret = __method_bind.getRotationDegrees.call(this._handle)
    return _ret.asFloat()
  }

  fun getScale(): Vector2 {
    val _ret = __method_bind.getScale.call(this._handle)
    return _ret.asVector2()
  }

  fun getTransform(): Transform2D {
    val _ret = __method_bind.getTransform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun isFollowingViewport(): Boolean {
    val _ret = __method_bind.isFollowingViewport.call(this._handle)
    return _ret.asBoolean()
  }

  fun setCustomViewport(viewport: Node) {
    val _arg = Variant.new(viewport)
    __method_bind.setCustomViewport.call(this._handle, _arg, 1)
  }

  fun setFollowViewport(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setFollowViewport.call(this._handle, _arg, 1)
  }

  fun setFollowViewportScale(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.setFollowViewportScale.call(this._handle, _arg, 1)
  }

  fun setLayer(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.setLayer.call(this._handle, _arg, 1)
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.setOffset.call(this._handle, _arg, 1)
  }

  fun setRotation(radians: Float) {
    val _arg = Variant.new(radians)
    __method_bind.setRotation.call(this._handle, _arg, 1)
  }

  fun setRotationDegrees(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setRotationDegrees.call(this._handle, _arg, 1)
  }

  fun setScale(scale: Vector2) {
    val _arg = Variant.new(scale)
    __method_bind.setScale.call(this._handle, _arg, 1)
  }

  fun setTransform(transform: Transform2D) {
    val _arg = Variant.new(transform)
    __method_bind.setTransform.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): CanvasLayer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CanvasLayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CanvasLayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CanvasLayer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CanvasLayer = CanvasLayer(ptr)
    /**
     * Container for method_bind pointers for CanvasLayer
     */
    private object __method_bind {
      val getCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_canvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_canvas" }
        }
      val getCustomViewport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_custom_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_viewport" }
        }
      val getFollowViewportScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_follow_viewport_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_follow_viewport_scale" }
        }
      val getLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_layer" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val getRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation" }
        }
      val getRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation_degrees" }
        }
      val getScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scale" }
        }
      val getTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transform" }
        }
      val isFollowingViewport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "is_following_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_following_viewport" }
        }
      val setCustomViewport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_custom_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_viewport" }
        }
      val setFollowViewport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_follow_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_follow_viewport" }
        }
      val setFollowViewportScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_follow_viewport_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_follow_viewport_scale" }
        }
      val setLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_layer" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val setRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation" }
        }
      val setRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation_degrees" }
        }
      val setScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scale" }
        }
      val setTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transform" }
        }}
  }
}
