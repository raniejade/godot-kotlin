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

open class CameraTexture(
  _handle: COpaquePointer
) : Texture(_handle) {
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

  var whichFeed: Int
    get() {
       return CameraServer.FeedImage.from(getWhichFeed()) 
    }
    set(value) {
      setWhichFeed(CameraServer.FeedImage.from(value))
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
    val _arg = Variant.new(active)
    __method_bind.setCameraActive.call(this._handle, _arg, 1)
  }

  fun setCameraFeedId(feedId: Int) {
    val _arg = Variant.new(feedId)
    __method_bind.setCameraFeedId.call(this._handle, _arg, 1)
  }

  fun setWhichFeed(whichFeed: Int) {
    val _arg = Variant.new(whichFeed)
    __method_bind.setWhichFeed.call(this._handle, _arg, 1)
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
      val getCameraActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "getCameraActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCameraActive" }
        }
      val getCameraFeedId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "getCameraFeedId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCameraFeedId" }
        }
      val getWhichFeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "getWhichFeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWhichFeed" }
        }
      val setCameraActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "setCameraActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCameraActive" }
        }
      val setCameraFeedId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "setCameraFeedId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCameraFeedId" }
        }
      val setWhichFeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CameraTexture".cstr.ptr,
            "setWhichFeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWhichFeed" }
        }}
  }
}
