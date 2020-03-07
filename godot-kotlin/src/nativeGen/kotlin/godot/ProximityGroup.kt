// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
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

open class ProximityGroup(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var dispatchMode: DispatchMode
    get() {
       return getDispatchMode() 
    }
    set(value) {
      setDispatchMode(value.value)
    }

  var gridRadius: Vector3
    get() {
       return getGridRadius() 
    }
    set(value) {
      setGridRadius(value)
    }

  var groupName: String
    get() {
       return getGroupName() 
    }
    set(value) {
      setGroupName(value)
    }

  /**
   * ProximityGroup::broadcast signal
   */
  val signalBroadcast: Signal2<String, VariantArray> = Signal2("broadcast")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for gridRadius
   */
  fun gridRadius(cb: Vector3.() -> Unit) {
    val _p = gridRadius
    cb(_p)
    gridRadius = _p
  }

  open fun _proximity_group_broadcast(name: String, params: Variant) {
    TODO()
  }

  fun broadcast(name: String, parameters: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(parameters)
      __method_bind.broadcast.call(self._handle, _args, null)
    }
  }

  fun getDispatchMode(): DispatchMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDispatchMode.call(self._handle, emptyList(), _retPtr)
      ProximityGroup.DispatchMode.from(_ret.value)
    }
  }

  fun getGridRadius(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getGridRadius.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getGroupName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getGroupName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun setDispatchMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDispatchMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setGridRadius(radius: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGridRadius.call(self._handle, listOf(radius), null)
    }
  }

  fun setGroupName(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGroupName.call(self._handle, listOf(name), null)
    }
  }

  enum class DispatchMode(
    val value: Int
  ) {
    MODE_PROXY(0),

    MODE_SIGNAL(1);

    companion object {
      fun from(value: Int): DispatchMode {
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ProximityGroup".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ProximityGroup" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ProximityGroup
     */
    private object __method_bind {
      val broadcast: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
              "broadcast".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method broadcast" }
            }
          }

      val getDispatchMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
              "get_dispatch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dispatch_mode" }
            }
          }

      val getGridRadius: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
              "get_grid_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_grid_radius" }
            }
          }

      val getGroupName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
              "get_group_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_group_name" }
            }
          }

      val setDispatchMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
              "set_dispatch_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dispatch_mode" }
            }
          }

      val setGridRadius: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
              "set_grid_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_grid_radius" }
            }
          }

      val setGroupName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
              "set_group_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_group_name" }
            }
          }
    }
  }
}
