// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ClippedCamera(
  _handle: COpaquePointer
) : Camera(_handle) {
  var clipToAreas: Boolean
    get() {
       return isClipToAreasEnabled() 
    }
    set(value) {
      setClipToAreas(value)
    }

  var clipToBodies: Boolean
    get() {
       return isClipToBodiesEnabled() 
    }
    set(value) {
      setClipToBodies(value)
    }

  var collisionMask: Int
    get() {
       return getCollisionMask() 
    }
    set(value) {
      setCollisionMask(value)
    }

  var margin: Float
    get() {
       return getMargin() 
    }
    set(value) {
      setMargin(value)
    }

  var processMode: Int
    get() {
       return ClippedCamera.ProcessMode.from(getProcessMode()) 
    }
    set(value) {
      setProcessMode(ClippedCamera.ProcessMode.from(value))
    }

  fun addException(node: Object) {
    val _arg = Variant.new(node)
    __method_bind.addException.call(this._handle, _arg, 1)
  }

  fun addExceptionRid(rid: RID) {
    val _arg = Variant.new(rid)
    __method_bind.addExceptionRid.call(this._handle, _arg, 1)
  }

  fun clearExceptions() {
    __method_bind.clearExceptions.call(this._handle)
  }

  fun getClipOffset(): Float {
    val _ret = __method_bind.getClipOffset.call(this._handle)
    return _ret.asFloat()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.getCollisionMask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.getCollisionMaskBit.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getMargin(): Float {
    val _ret = __method_bind.getMargin.call(this._handle)
    return _ret.asFloat()
  }

  fun getProcessMode(): ProcessMode {
    val _ret = __method_bind.getProcessMode.call(this._handle)
    return ClippedCamera.ProcessMode.from(_ret.asInt())
  }

  fun isClipToAreasEnabled(): Boolean {
    val _ret = __method_bind.isClipToAreasEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isClipToBodiesEnabled(): Boolean {
    val _ret = __method_bind.isClipToBodiesEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun removeException(node: Object) {
    val _arg = Variant.new(node)
    __method_bind.removeException.call(this._handle, _arg, 1)
  }

  fun removeExceptionRid(rid: RID) {
    val _arg = Variant.new(rid)
    __method_bind.removeExceptionRid.call(this._handle, _arg, 1)
  }

  fun setClipToAreas(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setClipToAreas.call(this._handle, _arg, 1)
  }

  fun setClipToBodies(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setClipToBodies.call(this._handle, _arg, 1)
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setCollisionMask.call(this._handle, _arg, 1)
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.setCollisionMaskBit.call(this._handle, _args.toVariant(), 2)
  }

  fun setMargin(margin: Float) {
    val _arg = Variant.new(margin)
    __method_bind.setMargin.call(this._handle, _arg, 1)
  }

  fun setProcessMode(processMode: Int) {
    val _arg = Variant.new(processMode)
    __method_bind.setProcessMode.call(this._handle, _arg, 1)
  }

  enum class ProcessMode(
    val value: Int
  ) {
    CLIP_PROCESS_PHYSICS(0),

    CLIP_PROCESS_IDLE(1);

    companion object {
      fun from(value: Int): ProcessMode {
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
    val CLIP_PROCESS_IDLE: Int = 1

    val CLIP_PROCESS_PHYSICS: Int = 0

    fun new(): ClippedCamera = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ClippedCamera".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ClippedCamera" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ClippedCamera(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ClippedCamera = ClippedCamera(ptr)
    /**
     * Container for method_bind pointers for ClippedCamera
     */
    private object __method_bind {
      val addException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "addException".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addException" }
        }
      val addExceptionRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "addExceptionRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addExceptionRid" }
        }
      val clearExceptions: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "clearExceptions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearExceptions" }
        }
      val getClipOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "getClipOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClipOffset" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "getCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "getCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMaskBit" }
        }
      val getMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "getMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMargin" }
        }
      val getProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "getProcessMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getProcessMode" }
        }
      val isClipToAreasEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "isClipToAreasEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isClipToAreasEnabled" }
        }
      val isClipToBodiesEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "isClipToBodiesEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isClipToBodiesEnabled" }
        }
      val removeException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "removeException".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeException" }
        }
      val removeExceptionRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "removeExceptionRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeExceptionRid" }
        }
      val setClipToAreas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "setClipToAreas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setClipToAreas" }
        }
      val setClipToBodies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "setClipToBodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setClipToBodies" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "setCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "setCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMaskBit" }
        }
      val setMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "setMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMargin" }
        }
      val setProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "setProcessMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProcessMode" }
        }}
  }
}
