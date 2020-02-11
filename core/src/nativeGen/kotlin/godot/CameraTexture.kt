// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class CameraTexture(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Texture(null) {
  var cameraFeedId: Int
    get() {
       return getCameraFeedId() 
    }
    set(value) {
      setCameraFeedId(value)
    }

  var cameraIsActive: Boolean
    get() {
       return getCameraActive() 
    }
    set(value) {
      setCameraActive(value)
    }

  var whichFeed: CameraServer.FeedImage
    get() {
       return getWhichFeed() 
    }
    set(value) {
      setWhichFeed(value.value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getCameraActive(): Boolean {
    val _ret = __method_bind.getCameraActive.call(this._handle)
    return _ret.asBoolean()
  }

  fun getCameraFeedId(): Int {
    val _ret = __method_bind.getCameraFeedId.call(this._handle)
    return _ret.asInt()
  }

  fun getWhichFeed(): CameraServer.FeedImage {
    val _ret = __method_bind.getWhichFeed.call(this._handle)
    return CameraServer.FeedImage.from(_ret.asInt())
  }

  fun setCameraActive(active: Boolean) {
    val _arg = Variant(active)
    __method_bind.setCameraActive.call(this._handle, listOf(_arg))
  }

  fun setCameraFeedId(feedId: Int) {
    val _arg = Variant(feedId)
    __method_bind.setCameraFeedId.call(this._handle, listOf(_arg))
  }

  fun setWhichFeed(whichFeed: Int) {
    val _arg = Variant(whichFeed)
    __method_bind.setWhichFeed.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CameraTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CameraTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for CameraTexture
     */
    private object __method_bind {
      val getCameraActive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "get_camera_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_active" }
        }
      val getCameraFeedId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "get_camera_feed_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_feed_id" }
        }
      val getWhichFeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "get_which_feed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_which_feed" }
        }
      val setCameraActive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "set_camera_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_camera_active" }
        }
      val setCameraFeedId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "set_camera_feed_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_camera_feed_id" }
        }
      val setWhichFeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "set_which_feed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_which_feed" }
        }}
  }
}
