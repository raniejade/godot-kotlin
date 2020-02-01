// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ARVRInterface(
  _handle: COpaquePointer
) : Reference(_handle) {
  var arIsAnchorDetectionEnabled: Boolean
    get() {
       return getAnchorDetectionIsEnabled() 
    }
    set(value) {
      setAnchorDetectionIsEnabled(value)
    }

  var interfaceIsInitialized: Boolean
    get() {
       return isInitialized() 
    }
    set(value) {
      setIsInitialized(value)
    }

  var interfaceIsPrimary: Boolean
    get() {
       return isPrimary() 
    }
    set(value) {
      setIsPrimary(value)
    }

  fun getAnchorDetectionIsEnabled(): Boolean {
    val _ret = __method_bind.getAnchorDetectionIsEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun getCameraFeedId(): Int {
    val _ret = __method_bind.getCameraFeedId.call(this._handle)
    return _ret.asInt()
  }

  fun getCapabilities(): Int {
    val _ret = __method_bind.getCapabilities.call(this._handle)
    return _ret.asInt()
  }

  fun getName(): String {
    val _ret = __method_bind.getName.call(this._handle)
    return _ret.asString()
  }

  fun getRenderTargetsize(): Vector2 {
    val _ret = __method_bind.getRenderTargetsize.call(this._handle)
    return _ret.asVector2()
  }

  fun getTrackingStatus(): Tracking_status {
    val _ret = __method_bind.getTrackingStatus.call(this._handle)
    return ARVRInterface.Tracking_status.from(_ret.asInt())
  }

  fun initialize(): Boolean {
    val _ret = __method_bind.initialize.call(this._handle)
    return _ret.asBoolean()
  }

  fun isInitialized(): Boolean {
    val _ret = __method_bind.isInitialized.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPrimary(): Boolean {
    val _ret = __method_bind.isPrimary.call(this._handle)
    return _ret.asBoolean()
  }

  fun isStereo(): Boolean {
    val _ret = __method_bind.isStereo.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAnchorDetectionIsEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAnchorDetectionIsEnabled.call(this._handle, listOf(_arg))
  }

  fun setIsInitialized(initialized: Boolean) {
    val _arg = Variant.new(initialized)
    __method_bind.setIsInitialized.call(this._handle, listOf(_arg))
  }

  fun setIsPrimary(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setIsPrimary.call(this._handle, listOf(_arg))
  }

  fun uninitialize() {
    __method_bind.uninitialize.call(this._handle)
  }

  enum class Tracking_status(
    val value: Int
  ) {
    ARVR_NORMAL_TRACKING(0),

    ARVR_EXCESSIVE_MOTION(1),

    ARVR_INSUFFICIENT_FEATURES(2),

    ARVR_UNKNOWN_TRACKING(3),

    ARVR_NOT_TRACKING(4);

    companion object {
      fun from(value: Int): Tracking_status {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Eyes(
    val value: Int
  ) {
    EYE_MONO(0),

    EYE_LEFT(1),

    EYE_RIGHT(2);

    companion object {
      fun from(value: Int): Eyes {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Capabilities(
    val value: Int
  ) {
    ARVR_NONE(0),

    ARVR_MONO(1),

    ARVR_STEREO(2),

    ARVR_AR(4),

    ARVR_EXTERNAL(8);

    companion object {
      fun from(value: Int): Capabilities {
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
    val ARVR_AR: Int = 4

    val ARVR_EXCESSIVE_MOTION: Int = 1

    val ARVR_EXTERNAL: Int = 8

    val ARVR_INSUFFICIENT_FEATURES: Int = 2

    val ARVR_MONO: Int = 1

    val ARVR_NONE: Int = 0

    val ARVR_NORMAL_TRACKING: Int = 0

    val ARVR_NOT_TRACKING: Int = 4

    val ARVR_STEREO: Int = 2

    val ARVR_UNKNOWN_TRACKING: Int = 3

    val EYE_LEFT: Int = 1

    val EYE_MONO: Int = 0

    val EYE_RIGHT: Int = 2

    /**
     * Container for method_bind pointers for ARVRInterface
     */
    private object __method_bind {
      val getAnchorDetectionIsEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_anchor_detection_is_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_anchor_detection_is_enabled" }
        }
      val getCameraFeedId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_camera_feed_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_feed_id" }
        }
      val getCapabilities: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_capabilities".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_capabilities" }
        }
      val getName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_name" }
        }
      val getRenderTargetsize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_render_targetsize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_render_targetsize" }
        }
      val getTrackingStatus: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_tracking_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tracking_status" }
        }
      val initialize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "initialize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method initialize" }
        }
      val isInitialized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "is_initialized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_initialized" }
        }
      val isPrimary: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "is_primary".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_primary" }
        }
      val isStereo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "is_stereo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_stereo" }
        }
      val setAnchorDetectionIsEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "set_anchor_detection_is_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_anchor_detection_is_enabled" }
        }
      val setIsInitialized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "set_is_initialized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_is_initialized" }
        }
      val setIsPrimary: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "set_is_primary".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_is_primary" }
        }
      val uninitialize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "uninitialize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method uninitialize" }
        }}
  }
}
