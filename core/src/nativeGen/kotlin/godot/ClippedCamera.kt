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

open class ClippedCamera(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Camera(null) {
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

  var processMode: ProcessMode
    get() {
       return getProcessMode() 
    }
    set(value) {
      setProcessMode(value.value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun addException(node: Object) {
    val _arg = Variant(node)
    __method_bind.addException.call(this._handle, listOf(_arg))
  }

  fun addExceptionRid(rid: RID) {
    val _arg = Variant(rid)
    __method_bind.addExceptionRid.call(this._handle, listOf(_arg))
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
    val _arg = Variant(bit)
    val _ret = __method_bind.getCollisionMaskBit.call(this._handle, listOf(_arg))
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
    val _arg = Variant(node)
    __method_bind.removeException.call(this._handle, listOf(_arg))
  }

  fun removeExceptionRid(rid: RID) {
    val _arg = Variant(rid)
    __method_bind.removeExceptionRid.call(this._handle, listOf(_arg))
  }

  fun setClipToAreas(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setClipToAreas.call(this._handle, listOf(_arg))
  }

  fun setClipToBodies(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setClipToBodies.call(this._handle, listOf(_arg))
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant(mask)
    __method_bind.setCollisionMask.call(this._handle, listOf(_arg))
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bit))
    _args.add(Variant.fromAny(value))
    __method_bind.setCollisionMaskBit.call(this._handle, _args)
  }

  fun setMargin(margin: Float) {
    val _arg = Variant(margin)
    __method_bind.setMargin.call(this._handle, listOf(_arg))
  }

  fun setProcessMode(processMode: Int) {
    val _arg = Variant(processMode)
    __method_bind.setProcessMode.call(this._handle, listOf(_arg))
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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ClippedCamera".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ClippedCamera" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ClippedCamera
     */
    private object __method_bind {
      val addException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "add_exception".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_exception" }
        }
      val addExceptionRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "add_exception_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_exception_rid" }
        }
      val clearExceptions: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "clear_exceptions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_exceptions" }
        }
      val getClipOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "get_clip_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_clip_offset" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val getMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "get_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_margin" }
        }
      val getProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "get_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_mode" }
        }
      val isClipToAreasEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "is_clip_to_areas_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_clip_to_areas_enabled" }
        }
      val isClipToBodiesEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "is_clip_to_bodies_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_clip_to_bodies_enabled" }
        }
      val removeException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "remove_exception".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_exception" }
        }
      val removeExceptionRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "remove_exception_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_exception_rid" }
        }
      val setClipToAreas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "set_clip_to_areas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clip_to_areas" }
        }
      val setClipToBodies: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "set_clip_to_bodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clip_to_bodies" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val setMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "set_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_margin" }
        }
      val setProcessMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
            "set_process_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_mode" }
        }}
  }
}
