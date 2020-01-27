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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ARVRInterface internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getAnchorDetectionIsEnabled(): Boolean {
    val _ret = __method_bind.get_anchor_detection_is_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun getCameraFeedId(): Int {
    val _ret = __method_bind.get_camera_feed_id.call(this.toVariant())
    return _ret.asInt()
  }

  fun getCapabilities(): Int {
    val _ret = __method_bind.get_capabilities.call(this.toVariant())
    return _ret.asInt()
  }

  fun getName(): String {
    val _ret = __method_bind.get_name.call(this.toVariant())
    return _ret.asString()
  }

  fun getRenderTargetsize(): Vector2 {
    val _ret = __method_bind.get_render_targetsize.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getTrackingStatus(): Tracking_status {
    val _ret = __method_bind.get_tracking_status.call(this.toVariant())
    return ARVRInterface.Tracking_status.from(_ret.asInt())
  }

  fun initialize(): Boolean {
    val _ret = __method_bind.initialize.call(this.toVariant())
    return _ret.asBool()
  }

  fun isInitialized(): Boolean {
    val _ret = __method_bind.is_initialized.call(this.toVariant())
    return _ret.asBool()
  }

  fun isPrimary(): Boolean {
    val _ret = __method_bind.is_primary.call(this.toVariant())
    return _ret.asBool()
  }

  fun isStereo(): Boolean {
    val _ret = __method_bind.is_stereo.call(this.toVariant())
    return _ret.asBool()
  }

  fun setAnchorDetectionIsEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_anchor_detection_is_enabled.call(this.toVariant(), _arg, 1)
  }

  fun setIsInitialized(initialized: Boolean) {
    val _arg = Variant.new(initialized)
    __method_bind.set_is_initialized.call(this.toVariant(), _arg, 1)
  }

  fun setIsPrimary(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_is_primary.call(this.toVariant(), _arg, 1)
  }

  fun uninitialize() {
    __method_bind.uninitialize.call(this.toVariant())
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
      val get_anchor_detection_is_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_anchor_detection_is_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_anchor_detection_is_enabled" }
        }
      val get_camera_feed_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_camera_feed_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_feed_id" }
        }
      val get_capabilities: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_capabilities".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_capabilities" }
        }
      val get_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_name" }
        }
      val get_render_targetsize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_render_targetsize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_render_targetsize" }
        }
      val get_tracking_status: CPointer<godot_method_bind>
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
      val is_initialized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "is_initialized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_initialized" }
        }
      val is_primary: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "is_primary".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_primary" }
        }
      val is_stereo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "is_stereo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_stereo" }
        }
      val set_anchor_detection_is_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "set_anchor_detection_is_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_anchor_detection_is_enabled" }
        }
      val set_is_initialized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "set_is_initialized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_is_initialized" }
        }
      val set_is_primary: CPointer<godot_method_bind>
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
