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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CanvasLayer internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun getCanvas(): RID {
    val _ret = __method_bind.get_canvas.call(this.toVariant())
    return _ret.asRID()
  }

  fun getCustomViewport(): Node {
    val _ret = __method_bind.get_custom_viewport.call(this.toVariant())
    return _ret.asObject(::Node)!!
  }

  fun getFollowViewportScale(): Float {
    val _ret = __method_bind.get_follow_viewport_scale.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getLayer(): Int {
    val _ret = __method_bind.get_layer.call(this.toVariant())
    return _ret.asInt()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.get_offset.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getRotation(): Float {
    val _ret = __method_bind.get_rotation.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getRotationDegrees(): Float {
    val _ret = __method_bind.get_rotation_degrees.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getScale(): Vector2 {
    val _ret = __method_bind.get_scale.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getTransform(): Transform2D {
    val _ret = __method_bind.get_transform.call(this.toVariant())
    return _ret.asTransform2D()
  }

  fun isFollowingViewport(): Boolean {
    val _ret = __method_bind.is_following_viewport.call(this.toVariant())
    return _ret.asBool()
  }

  fun setCustomViewport(viewport: Node) {
    val _args = VariantArray.new()
    _args.append(viewport)
    __method_bind.set_custom_viewport.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setFollowViewport(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_follow_viewport.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setFollowViewportScale(scale: Float) {
    val _args = VariantArray.new()
    _args.append(scale)
    __method_bind.set_follow_viewport_scale.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setLayer(layer: Int) {
    val _args = VariantArray.new()
    _args.append(layer)
    __method_bind.set_layer.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setOffset(offset: Vector2) {
    val _args = VariantArray.new()
    _args.append(offset)
    __method_bind.set_offset.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setRotation(radians: Float) {
    val _args = VariantArray.new()
    _args.append(radians)
    __method_bind.set_rotation.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setRotationDegrees(degrees: Float) {
    val _args = VariantArray.new()
    _args.append(degrees)
    __method_bind.set_rotation_degrees.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setScale(scale: Vector2) {
    val _args = VariantArray.new()
    _args.append(scale)
    __method_bind.set_scale.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setTransform(transform: Transform2D) {
    val _args = VariantArray.new()
    _args.append(transform)
    __method_bind.set_transform.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): CanvasLayer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CanvasLayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CanvasLayer" }
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
      val get_canvas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_canvas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_canvas" }
            }
          }

      val get_custom_viewport: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_custom_viewport".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_viewport" }
            }
          }

      val get_follow_viewport_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_follow_viewport_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_follow_viewport_scale" }
            }
          }

      val get_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_layer" }
            }
          }

      val get_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val get_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rotation" }
            }
          }

      val get_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rotation_degrees" }
            }
          }

      val get_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scale" }
            }
          }

      val get_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transform" }
            }
          }

      val is_following_viewport: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "is_following_viewport".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_following_viewport" }
            }
          }

      val set_custom_viewport: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_custom_viewport".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_viewport" }
            }
          }

      val set_follow_viewport: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_follow_viewport".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_follow_viewport" }
            }
          }

      val set_follow_viewport_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_follow_viewport_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_follow_viewport_scale" }
            }
          }

      val set_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_layer" }
            }
          }

      val set_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offset" }
            }
          }

      val set_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rotation" }
            }
          }

      val set_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rotation_degrees" }
            }
          }

      val set_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scale" }
            }
          }

      val set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_transform" }
            }
          }
    }
  }
}
