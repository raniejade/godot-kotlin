// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class CameraServerInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  /**
   * CameraServer::camera_feed_added signal
   */
  val signalCameraFeedAdded: Signal1<Int> = Signal1("camera_feed_added")

  /**
   * CameraServer::camera_feed_removed signal
   */
  val signalCameraFeedRemoved: Signal1<Int> = Signal1("camera_feed_removed")

  fun addFeed(feed: CameraFeed) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addFeed.call(self._handle, listOf(feed), null)
    }
  }

  fun feeds(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.feeds.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFeed(index: Int): CameraFeed {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: CameraFeed
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getFeed.call(self._handle, listOf(index), _retPtr)
      _ret = objectToType<CameraFeed>(_tmp.value!!)
      _ret
    }
  }

  fun getFeedCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFeedCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun removeFeed(feed: CameraFeed) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeFeed.call(self._handle, listOf(feed), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for CameraServer
     */
    private object __method_bind {
      val addFeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "add_feed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_feed" }
        }
      val feeds: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "feeds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method feeds" }
        }
      val getFeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "get_feed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feed" }
        }
      val getFeedCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "get_feed_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feed_count" }
        }
      val removeFeed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "remove_feed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_feed" }
        }}
  }
}

object CameraServer : CameraServerInternal(null) {
  init {
    Allocator.allocationScope {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("CameraServer".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton CameraServer" }
      _handle = handle
    }
  }

  enum class FeedImage(
    val value: Int
  ) {
    RGBA_IMAGE(0),

    YCBCR_IMAGE(0),

    Y_IMAGE(0),

    CBCR_IMAGE(1);

    companion object {
      fun from(value: Int): FeedImage {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }
}
