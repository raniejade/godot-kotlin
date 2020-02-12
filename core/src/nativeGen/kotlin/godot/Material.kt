// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class Material(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var nextPass: Material
    get() {
       return getNextPass() 
    }
    set(value) {
      setNextPass(value)
    }

  var renderPriority: Int
    get() {
       return getRenderPriority() 
    }
    set(value) {
      setRenderPriority(value)
    }

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getNextPass(): Material {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Material
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNextPass.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Material>(_tmp.value!!)
      _ret
    }
  }

  fun getRenderPriority(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRenderPriority.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setNextPass(nextPass: Material) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNextPass.call(self._handle, listOf(nextPass), null)
    }
  }

  fun setRenderPriority(priority: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRenderPriority.call(self._handle, listOf(priority), null)
    }
  }

  companion object {
    val RENDER_PRIORITY_MAX: Int = 127

    val RENDER_PRIORITY_MIN: Int = -128

    /**
     * Container for method_bind pointers for Material
     */
    private object __method_bind {
      val getNextPass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
            "get_next_pass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_next_pass" }
        }
      val getRenderPriority: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
            "get_render_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_render_priority" }
        }
      val setNextPass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
            "set_next_pass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_next_pass" }
        }
      val setRenderPriority: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Material".cstr.ptr,
            "set_render_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_render_priority" }
        }}
  }
}
