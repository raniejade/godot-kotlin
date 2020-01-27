// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SpringArm internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun addExcludedObject(rID: RID) {
    val _args = VariantArray.new()
    _args.append(rID)
    __method_bind.add_excluded_object.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun clearExcludedObjects() {
    __method_bind.clear_excluded_objects.call(this.toVariant())
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.get_collision_mask.call(this.toVariant())
    return _ret.asInt()
  }

  fun getHitLength(): Float {
    val _ret = __method_bind.get_hit_length.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getLength(): Float {
    val _ret = __method_bind.get_length.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getMargin(): Float {
    val _ret = __method_bind.get_margin.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getShape(): Shape {
    val _ret = __method_bind.get_shape.call(this.toVariant())
    return _ret.asObject(::Shape)!!
  }

  fun removeExcludedObject(rID: RID): Boolean {
    val _args = VariantArray.new()
    _args.append(rID)
    val _ret = __method_bind.remove_excluded_object.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asBool()
  }

  fun setCollisionMask(mask: Int) {
    val _args = VariantArray.new()
    _args.append(mask)
    __method_bind.set_collision_mask.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setLength(length: Float) {
    val _args = VariantArray.new()
    _args.append(length)
    __method_bind.set_length.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setMargin(margin: Float) {
    val _args = VariantArray.new()
    _args.append(margin)
    __method_bind.set_margin.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setShape(shape: Shape) {
    val _args = VariantArray.new()
    _args.append(shape)
    __method_bind.set_shape.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): SpringArm = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpringArm".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton SpringArm" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SpringArm(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SpringArm = SpringArm(ptr)
    /**
     * Container for method_bind pointers for SpringArm
     */
    private object __method_bind {
      val add_excluded_object: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
              "add_excluded_object".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_excluded_object" }
            }
          }

      val clear_excluded_objects: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
              "clear_excluded_objects".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_excluded_objects" }
            }
          }

      val get_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
              "get_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
            }
          }

      val get_hit_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
              "get_hit_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hit_length" }
            }
          }

      val get_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
              "get_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_length" }
            }
          }

      val get_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
              "get_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_margin" }
            }
          }

      val get_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
              "get_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shape" }
            }
          }

      val remove_excluded_object: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
              "remove_excluded_object".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_excluded_object" }
            }
          }

      val set_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
              "set_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
            }
          }

      val set_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
              "set_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_length" }
            }
          }

      val set_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
              "set_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_margin" }
            }
          }

      val set_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
              "set_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shape" }
            }
          }
    }
  }
}
