// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Navigation2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun getClosestPoint(toPoint: Vector2): Vector2 {
    val _arg = Variant(toPoint)
    val _ret = __method_bind.getClosestPoint.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun getClosestPointOwner(toPoint: Vector2): Object {
    val _arg = Variant(toPoint)
    val _ret = __method_bind.getClosestPointOwner.call(this._handle, listOf(_arg))
    return _ret.toAny() as Object
  }

  fun getSimplePath(
    start: Vector2,
    end: Vector2,
    optimize: Boolean = true
  ): PoolVector2Array {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(start))
    _args.add(Variant.fromAny(end))
    _args.add(Variant.fromAny(optimize))
    val _ret = __method_bind.getSimplePath.call(this._handle, _args)
    return _ret.asPoolVector2Array()
  }

  fun navpolyAdd(
    mesh: NavigationPolygon,
    xform: Transform2D,
    owner: Object
  ): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(xform))
    _args.add(Variant.fromAny(owner))
    val _ret = __method_bind.navpolyAdd.call(this._handle, _args)
    return _ret.asInt()
  }

  fun navpolyRemove(id: Int) {
    val _arg = Variant(id)
    __method_bind.navpolyRemove.call(this._handle, listOf(_arg))
  }

  fun navpolySetTransform(id: Int, xform: Transform2D) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(xform))
    __method_bind.navpolySetTransform.call(this._handle, _args)
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Navigation2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Navigation2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Navigation2D
     */
    private object __method_bind {
      val getClosestPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation2D".cstr.ptr,
            "get_closest_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_point" }
        }
      val getClosestPointOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation2D".cstr.ptr,
            "get_closest_point_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_closest_point_owner" }
        }
      val getSimplePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation2D".cstr.ptr,
            "get_simple_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_simple_path" }
        }
      val navpolyAdd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation2D".cstr.ptr,
            "navpoly_add".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method navpoly_add" }
        }
      val navpolyRemove: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation2D".cstr.ptr,
            "navpoly_remove".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method navpoly_remove" }
        }
      val navpolySetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Navigation2D".cstr.ptr,
            "navpoly_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method navpoly_set_transform" }
        }}
  }
}
