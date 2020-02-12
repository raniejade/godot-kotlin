// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class CanvasLayer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getCanvas.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCustomViewport(): Node {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Node
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getCustomViewport.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Node>(_tmp.value!!)
      _ret
    }
  }

  fun getFollowViewportScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFollowViewportScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getLayer(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLayer.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRotation(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRotation.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRotationDegrees(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRotationDegrees.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getScale(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getScale.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTransform(): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.getTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isFollowingViewport(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFollowingViewport.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setCustomViewport(viewport: Node) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCustomViewport.call(self._handle, listOf(viewport), null)
    }
  }

  fun setFollowViewport(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFollowViewport.call(self._handle, listOf(enable), null)
    }
  }

  fun setFollowViewportScale(scale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFollowViewportScale.call(self._handle, listOf(scale), null)
    }
  }

  fun setLayer(layer: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLayer.call(self._handle, listOf(layer), null)
    }
  }

  fun setOffset(offset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOffset.call(self._handle, listOf(offset), null)
    }
  }

  fun setRotation(radians: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRotation.call(self._handle, listOf(radians), null)
    }
  }

  fun setRotationDegrees(degrees: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRotationDegrees.call(self._handle, listOf(degrees), null)
    }
  }

  fun setScale(scale: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScale.call(self._handle, listOf(scale), null)
    }
  }

  fun setTransform(transform: Transform2D) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTransform.call(self._handle, listOf(transform), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CanvasLayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CanvasLayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for CanvasLayer
     */
    private object __method_bind {
      val getCanvas: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_canvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_canvas" }
        }
      val getCustomViewport: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_custom_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_viewport" }
        }
      val getFollowViewportScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_follow_viewport_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_follow_viewport_scale" }
        }
      val getLayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_layer" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val getRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation" }
        }
      val getRotationDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation_degrees" }
        }
      val getScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scale" }
        }
      val getTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transform" }
        }
      val isFollowingViewport: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "is_following_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_following_viewport" }
        }
      val setCustomViewport: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_custom_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_viewport" }
        }
      val setFollowViewport: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_follow_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_follow_viewport" }
        }
      val setFollowViewportScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_follow_viewport_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_follow_viewport_scale" }
        }
      val setLayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_layer" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val setRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation" }
        }
      val setRotationDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation_degrees" }
        }
      val setScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scale" }
        }
      val setTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
            "set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transform" }
        }}
  }
}
