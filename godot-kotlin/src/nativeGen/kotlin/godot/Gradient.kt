// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.PoolColorArray
import godot.core.PoolFloatArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class Gradient(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var colors: PoolColorArray
    get() {
       return getColors() 
    }
    set(value) {
      setColors(value)
    }

  var offsets: PoolFloatArray
    get() {
       return getOffsets() 
    }
    set(value) {
      setOffsets(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for colors
   */
  fun colors(cb: PoolColorArray.() -> Unit) {
    val _p = colors
    cb(_p)
    colors = _p
  }

  /**
   * Specialized setter for offsets
   */
  fun offsets(cb: PoolFloatArray.() -> Unit) {
    val _p = offsets
    cb(_p)
    offsets = _p
  }

  fun addPoint(offset: Float, color: Color) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(offset)
      _args.add(color)
      __method_bind.addPoint.call(self._handle, _args, null)
    }
  }

  fun getColor(point: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getColor.call(self._handle, listOf(point), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getColors(): PoolColorArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolColorArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getColors.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getOffset(point: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOffset.call(self._handle, listOf(point), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getOffsets(): PoolFloatArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolFloatArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getOffsets.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPointCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPointCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun interpolate(offset: Float): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.interpolate.call(self._handle, listOf(offset), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun removePoint(offset: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removePoint.call(self._handle, listOf(offset), null)
    }
  }

  fun setColor(point: Int, color: Color) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(point)
      _args.add(color)
      __method_bind.setColor.call(self._handle, _args, null)
    }
  }

  fun setColors(colors: PoolColorArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setColors.call(self._handle, listOf(colors), null)
    }
  }

  fun setOffset(point: Int, offset: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(point)
      _args.add(offset)
      __method_bind.setOffset.call(self._handle, _args, null)
    }
  }

  fun setOffsets(offsets: PoolFloatArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOffsets.call(self._handle, listOf(offsets), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Gradient".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Gradient" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Gradient
     */
    private object __method_bind {
      val addPoint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "add_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_point" }
            }
          }

      val getColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "get_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color" }
            }
          }

      val getColors: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "get_colors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_colors" }
            }
          }

      val getOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val getOffsets: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "get_offsets".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offsets" }
            }
          }

      val getPointCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "get_point_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_count" }
            }
          }

      val interpolate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "interpolate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolate" }
            }
          }

      val removePoint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "remove_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_point" }
            }
          }

      val setColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color" }
            }
          }

      val setColors: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "set_colors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_colors" }
            }
          }

      val setOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "set_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offset" }
            }
          }

      val setOffsets: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "set_offsets".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offsets" }
            }
          }
    }
  }
}
