// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CameraServer(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addFeed(feed: CameraFeed) {
    val _arg = Variant.new(feed)
    __method_bind.addFeed.call(this._handle, _arg, 1)
  }

  fun feeds(): VariantArray {
    val _ret = __method_bind.feeds.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getFeed(index: Int): CameraFeed {
    val _arg = Variant.new(index)
    val _ret = __method_bind.getFeed.call(this._handle, _arg, 1)
    return _ret.asObject(::CameraFeed)!!
  }

  fun getFeedCount(): Int {
    val _ret = __method_bind.getFeedCount.call(this._handle)
    return _ret.asInt()
  }

  fun removeFeed(feed: CameraFeed) {
    val _arg = Variant.new(feed)
    __method_bind.removeFeed.call(this._handle, _arg, 1)
  }

  enum class FeedImage(
    val value: Int
  ) {
    FEED_RGBA_IMAGE(0),

    FEED_YCbCr_IMAGE(0),

    FEED_Y_IMAGE(0),

    FEED_CbCr_IMAGE(1);

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

  companion object {
    val Instance: CameraServer
      get() = memScoped {
        val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("CameraServer".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton CameraServer" }
        CameraServer(
          handle
        )
      }
    val FEED_CbCr_IMAGE: Int = 1

    val FEED_RGBA_IMAGE: Int = 0

    val FEED_YCbCr_IMAGE: Int = 0

    val FEED_Y_IMAGE: Int = 0

    /**
     * Container for method_bind pointers for CameraServer
     */
    private object __method_bind {
      val addFeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "addFeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addFeed" }
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
            "getFeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFeed" }
        }
      val getFeedCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "getFeedCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFeedCount" }
        }
      val removeFeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraServer".cstr.ptr,
            "removeFeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeFeed" }
        }}
  }
}
