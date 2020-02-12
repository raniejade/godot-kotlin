// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
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

open class SkinReference(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getSkeleton(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getSkeleton.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSkin(): Skin {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Skin
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getSkin.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Skin>(_tmp.value!!)
      _ret
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for SkinReference
     */
    private object __method_bind {
      val getSkeleton: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkinReference".cstr.ptr,
            "get_skeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skeleton" }
        }
      val getSkin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkinReference".cstr.ptr,
            "get_skin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skin" }
        }}
  }
}
