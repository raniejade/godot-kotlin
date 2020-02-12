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

open class Path(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var curve: Curve3D
    get() {
       return getCurve() 
    }
    set(value) {
      setCurve(value)
    }

  /**
   * Path::curve_changed signal
   */
  val signalCurveChanged: Signal0 = Signal0("curve_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getCurve(): Curve3D {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Curve3D
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getCurve.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Curve3D>(_tmp.value!!)
      _ret
    }
  }

  fun setCurve(curve: Curve3D) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCurve.call(self._handle, listOf(curve), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Path".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Path" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Path
     */
    private object __method_bind {
      val getCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Path".cstr.ptr,
            "get_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_curve" }
        }
      val setCurve: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Path".cstr.ptr,
            "set_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_curve" }
        }}
  }
}
