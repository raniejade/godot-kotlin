// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ProximityGroup(
  _handle: COpaquePointer
) : Spatial(_handle) {
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
   * Specialized setter for gridRadius
   */
  fun gridRadius(cb: Vector3.() -> Unit) {
    val _p = gridRadius
    cb(_p)
    gridRadius = _p
  }

  fun broadcast(name: String, parameters: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(parameters))
    __method_bind.broadcast.call(this._handle, _args)
  }

  fun getDispatchMode(): DispatchMode {
    val _ret = __method_bind.getDispatchMode.call(this._handle)
    return ProximityGroup.DispatchMode.from(_ret.asInt())
  }

  fun getGridRadius(): Vector3 {
    val _ret = __method_bind.getGridRadius.call(this._handle)
    return _ret.asVector3()
  }

  fun getGroupName(): String {
    val _ret = __method_bind.getGroupName.call(this._handle)
    return _ret.asString()
  }

  fun setDispatchMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setDispatchMode.call(this._handle, listOf(_arg))
  }

  fun setGridRadius(radius: Vector3) {
    val _arg = Variant.new(radius)
    __method_bind.setGridRadius.call(this._handle, listOf(_arg))
  }

  fun setGroupName(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setGroupName.call(this._handle, listOf(_arg))
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
    val MODE_PROXY: Int = 0

    val MODE_SIGNAL: Int = 1

    fun new(): ProximityGroup = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ProximityGroup".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ProximityGroup" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ProximityGroup(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ProximityGroup = ProximityGroup(ptr)
    /**
     * Container for method_bind pointers for ProximityGroup
     */
    private object __method_bind {
      val broadcast: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
            "broadcast".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method broadcast" }
        }
      val getDispatchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
            "get_dispatch_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dispatch_mode" }
        }
      val getGridRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
            "get_grid_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_grid_radius" }
        }
      val getGroupName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
            "get_group_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_group_name" }
        }
      val setDispatchMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
            "set_dispatch_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dispatch_mode" }
        }
      val setGridRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
            "set_grid_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_grid_radius" }
        }
      val setGroupName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ProximityGroup".cstr.ptr,
            "set_group_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_group_name" }
        }}
  }
}
