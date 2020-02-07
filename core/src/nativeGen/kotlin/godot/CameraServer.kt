// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
    val _arg = Variant(feed)
    __method_bind.addFeed.call(this._handle, listOf(_arg))
  }

  fun feeds(): VariantArray {
    val _ret = __method_bind.feeds.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getFeed(index: Int): CameraFeed {
    val _arg = Variant(index)
    val _ret = __method_bind.getFeed.call(this._handle, listOf(_arg))
    return _ret.asObject(::CameraFeed)!!
  }

  fun getFeedCount(): Int {
    val _ret = __method_bind.getFeedCount.call(this._handle)
    return _ret.asInt()
  }

  fun removeFeed(feed: CameraFeed) {
    val _arg = Variant(feed)
    __method_bind.removeFeed.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for CameraServer
     */
    private object __method_bind {
      val addFeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "add_feed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_feed" }
        }
      val feeds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "feeds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method feeds" }
        }
      val getFeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "get_feed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feed" }
        }
      val getFeedCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "get_feed_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feed_count" }
        }
      val removeFeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "remove_feed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_feed" }
        }}
  }
}

object CameraServer : CameraServerInternal(null) {
  init {
    memScoped {
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
