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

open class JavaClassWrapperInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun wrap(name: String): JavaClass {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: JavaClass
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.wrap.call(self._handle, listOf(name), _retPtr)
      _ret = objectToType<JavaClass>(_tmp.value!!)
      _ret
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for JavaClassWrapper
     */
    private object __method_bind {
      val wrap: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JavaClassWrapper".cstr.ptr,
              "wrap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method wrap" }
            }
          }
    }
  }
}

object JavaClassWrapper : JavaClassWrapperInternal(null) {
  init {
    Allocator.allocationScope {
      val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("JavaClassWrapper".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton JavaClassWrapper" }
      _handle = handle
    }
  }
}
