// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class BoneAttachment(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var boneName: String
    get() {
       return getBoneName() 
    }
    set(value) {
      setBoneName(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getBoneName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getBoneName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun setBoneName(boneName: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBoneName.call(self._handle, listOf(boneName), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("BoneAttachment".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for BoneAttachment" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for BoneAttachment
     */
    private object __method_bind {
      val getBoneName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoneAttachment".cstr.ptr,
            "get_bone_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_name" }
        }
      val setBoneName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoneAttachment".cstr.ptr,
            "set_bone_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_name" }
        }}
  }
}
