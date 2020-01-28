// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
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

open class CameraFeed(
  _handle: COpaquePointer
) : Reference(_handle) {
  var feedIsActive: Boolean
    get() {
       return isActive() 
    }
    set(value) {
      setActive(value)
    }

  var feedTransform: Transform2D
    get() {
       return getTransform() 
    }
    set(value) {
      setTransform(value)
    }

  fun getId(): Int {
    val _ret = __method_bind.getId.call(this._handle)
    return _ret.asInt()
  }

  fun getName(): String {
    val _ret = __method_bind.getName.call(this._handle)
    return _ret.asString()
  }

  fun getPosition(): FeedPosition {
    val _ret = __method_bind.getPosition.call(this._handle)
    return CameraFeed.FeedPosition.from(_ret.asInt())
  }

  fun getTransform(): Transform2D {
    val _ret = __method_bind.getTransform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun isActive(): Boolean {
    val _ret = __method_bind.isActive.call(this._handle)
    return _ret.asBoolean()
  }

  fun setActive(active: Boolean) {
    val _arg = Variant.new(active)
    __method_bind.setActive.call(this._handle, _arg, 1)
  }

  fun setTransform(transform: Transform2D) {
    val _arg = Variant.new(transform)
    __method_bind.setTransform.call(this._handle, _arg, 1)
  }

  enum class FeedDataType(
    val value: Int
  ) {
    FEED_NOIMAGE(0),

    FEED_RGB(1),

    FEED_YCbCr(2),

    FEED_YCbCr_Sep(3);

    companion object {
      fun from(value: Int): FeedDataType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class FeedPosition(
    val value: Int
  ) {
    FEED_UNSPECIFIED(0),

    FEED_FRONT(1),

    FEED_BACK(2);

    companion object {
      fun from(value: Int): FeedPosition {
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
    val FEED_BACK: Int = 2

    val FEED_FRONT: Int = 1

    val FEED_NOIMAGE: Int = 0

    val FEED_RGB: Int = 1

    val FEED_UNSPECIFIED: Int = 0

    val FEED_YCbCr: Int = 2

    val FEED_YCbCr_Sep: Int = 3

    fun new(): CameraFeed = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CameraFeed".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CameraFeed" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CameraFeed(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CameraFeed = CameraFeed(ptr)
    /**
     * Container for method_bind pointers for CameraFeed
     */
    private object __method_bind {
      val getId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
            "get_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_id" }
        }
      val getName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
            "get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_name" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
            "get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position" }
        }
      val getTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
            "get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transform" }
        }
      val isActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
            "is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_active" }
        }
      val setActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
            "set_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_active" }
        }
      val setTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraFeed".cstr.ptr,
            "set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transform" }
        }}
  }
}
