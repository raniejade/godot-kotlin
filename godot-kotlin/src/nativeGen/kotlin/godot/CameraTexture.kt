// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
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
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCameraActive.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCameraFeedId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCameraFeedId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getWhichFeed(): CameraServer.FeedImage {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getWhichFeed.call(self._handle, emptyList(), _retPtr)
      CameraServer.FeedImage.from(_ret.value)
    }
  }

  fun setCameraActive(active: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCameraActive.call(self._handle, listOf(active), null)
    }
  }

  fun setCameraFeedId(feedId: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCameraFeedId.call(self._handle, listOf(feedId), null)
    }
  }

  fun setWhichFeed(whichFeed: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWhichFeed.call(self._handle, listOf(whichFeed), null)
    }
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
