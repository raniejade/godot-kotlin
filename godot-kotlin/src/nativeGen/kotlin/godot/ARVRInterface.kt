// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class ARVRInterface(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAnchorDetectionIsEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAnchorDetectionIsEnabled.call(self._handle, emptyList(), _retPtr)
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

  fun getCapabilities(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCapabilities.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getRenderTargetsize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getRenderTargetsize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTrackingStatus(): Tracking_status {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTrackingStatus.call(self._handle, emptyList(), _retPtr)
      ARVRInterface.Tracking_status.from(_ret.value)
    }
  }

  fun initialize(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.initialize.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isInitialized(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isInitialized.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPrimary(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPrimary.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isStereo(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isStereo.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAnchorDetectionIsEnabled(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAnchorDetectionIsEnabled.call(self._handle, listOf(enable), null)
    }
  }

  fun setIsInitialized(initialized: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setIsInitialized.call(self._handle, listOf(initialized), null)
    }
  }

  fun setIsPrimary(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setIsPrimary.call(self._handle, listOf(enable), null)
    }
  }

  fun uninitialize() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.uninitialize.call(self._handle, emptyList(), null)
    }
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
    /**
     * Container for method_bind pointers for ARVRInterface
     */
    private object __method_bind {
      val getAnchorDetectionIsEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_anchor_detection_is_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_anchor_detection_is_enabled" }
        }
      val getCameraFeedId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_camera_feed_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_camera_feed_id" }
        }
      val getCapabilities: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_capabilities".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_capabilities" }
        }
      val getName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_name" }
        }
      val getRenderTargetsize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_render_targetsize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_render_targetsize" }
        }
      val getTrackingStatus: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "get_tracking_status".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tracking_status" }
        }
      val initialize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "initialize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method initialize" }
        }
      val isInitialized: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "is_initialized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_initialized" }
        }
      val isPrimary: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "is_primary".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_primary" }
        }
      val isStereo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "is_stereo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_stereo" }
        }
      val setAnchorDetectionIsEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "set_anchor_detection_is_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_anchor_detection_is_enabled" }
        }
      val setIsInitialized: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "set_is_initialized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_is_initialized" }
        }
      val setIsPrimary: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "set_is_primary".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_is_primary" }
        }
      val uninitialize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRInterface".cstr.ptr,
            "uninitialize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method uninitialize" }
        }}
  }
}
