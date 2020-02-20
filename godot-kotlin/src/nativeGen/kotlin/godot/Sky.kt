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

open class Sky(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var radianceSize: RadianceSize
    get() {
       return getRadianceSize() 
    }
    set(value) {
      setRadianceSize(value.value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getRadianceSize(): RadianceSize {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRadianceSize.call(self._handle, emptyList(), _retPtr)
      Sky.RadianceSize.from(_ret.value)
    }
  }

  fun setRadianceSize(size: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRadianceSize.call(self._handle, listOf(size), null)
    }
  }

  enum class RadianceSize(
    val value: Int
  ) {
    `32`(0),

    `64`(1),

    `128`(2),

    `256`(3),

    `512`(4),

    `1024`(5),

    `2048`(6),

    MAX(7);

    companion object {
      fun from(value: Int): RadianceSize {
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
     * Container for method_bind pointers for Sky
     */
    private object __method_bind {
      val getRadianceSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sky".cstr.ptr,
            "get_radiance_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radiance_size" }
        }
      val setRadianceSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sky".cstr.ptr,
            "set_radiance_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radiance_size" }
        }}
  }
}
