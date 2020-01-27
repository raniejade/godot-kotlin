// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CameraTexture internal constructor(
  _handle: COpaquePointer
) : Texture(_handle) {
  fun getCameraActive(): Boolean {
    val _ret = __method_bind.get_camera_active.call(this._handle)
    return _ret.asBool()
  }

  fun getCameraFeedId(): Int {
    val _ret = __method_bind.get_camera_feed_id.call(this._handle)
    return _ret.asInt()
  }

  fun getWhichFeed(): CameraServer.FeedImage {
    val _ret = __method_bind.get_which_feed.call(this._handle)
    return CameraServer.FeedImage.from(_ret.asInt())
  }

  fun setCameraActive(active: Boolean) {
    val _arg = Variant.new(active)
    __method_bind.set_camera_active.call(this._handle, _arg, 1)
  }

  fun setCameraFeedId(feedId: Int) {
    val _arg = Variant.new(feedId)
    __method_bind.set_camera_feed_id.call(this._handle, _arg, 1)
  }

  fun setWhichFeed(whichFeed: Int) {
    val _arg = Variant.new(whichFeed)
    __method_bind.set_which_feed.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): CameraTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CameraTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CameraTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CameraTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CameraTexture = CameraTexture(ptr)
    /**
     * Container for method_bind pointers for CameraTexture
     */
    private object __method_bind {
      val get_camera_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "get_camera_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_active" }
        }
      val get_camera_feed_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "get_camera_feed_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_feed_id" }
        }
      val get_which_feed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "get_which_feed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_which_feed" }
        }
      val set_camera_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "set_camera_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_camera_active" }
        }
      val set_camera_feed_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "set_camera_feed_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_camera_feed_id" }
        }
      val set_which_feed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "set_which_feed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_which_feed" }
        }}
  }
}
