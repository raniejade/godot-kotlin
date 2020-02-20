// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class CSGPrimitive(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : CSGShape(null) {
  var invertFaces: Boolean
    get() {
       return isInvertingFaces() 
    }
    set(value) {
      setInvertFaces(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun isInvertingFaces(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isInvertingFaces.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setInvertFaces(invertFaces: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInvertFaces.call(self._handle, listOf(invertFaces), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for CSGPrimitive
     */
    private object __method_bind {
      val isInvertingFaces: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPrimitive".cstr.ptr,
            "is_inverting_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_inverting_faces" }
        }
      val setInvertFaces: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPrimitive".cstr.ptr,
            "set_invert_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_invert_faces" }
        }}
  }
}
