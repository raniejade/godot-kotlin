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

open class SpringArm(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var collisionMask: Int
    get() {
       return getCollisionMask() 
    }
    set(value) {
      setCollisionMask(value)
    }

  var margin: Float
    get() {
       return getMargin() 
    }
    set(value) {
      setMargin(value)
    }

  var shape: Shape
    get() {
       return getShape() 
    }
    set(value) {
      setShape(value)
    }

  var springLength: Float
    get() {
       return getLength() 
    }
    set(value) {
      setLength(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun addExcludedObject(rID: RID) {
    val _arg = Variant(rID)
    __method_bind.addExcludedObject.call(this._handle, listOf(_arg))
  }

  fun clearExcludedObjects() {
    __method_bind.clearExcludedObjects.call(this._handle)
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.getCollisionMask.call(this._handle)
    return _ret.asInt()
  }

  fun getHitLength(): Float {
    val _ret = __method_bind.getHitLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getLength(): Float {
    val _ret = __method_bind.getLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getMargin(): Float {
    val _ret = __method_bind.getMargin.call(this._handle)
    return _ret.asFloat()
  }

  fun getShape(): Shape {
    val _ret = __method_bind.getShape.call(this._handle)
    return _ret.toAny() as Shape
  }

  fun removeExcludedObject(rID: RID): Boolean {
    val _arg = Variant(rID)
    val _ret = __method_bind.removeExcludedObject.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant(mask)
    __method_bind.setCollisionMask.call(this._handle, listOf(_arg))
  }

  fun setLength(length: Float) {
    val _arg = Variant(length)
    __method_bind.setLength.call(this._handle, listOf(_arg))
  }

  fun setMargin(margin: Float) {
    val _arg = Variant(margin)
    __method_bind.setMargin.call(this._handle, listOf(_arg))
  }

  fun setShape(shape: Shape) {
    val _arg = Variant(shape)
    __method_bind.setShape.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpringArm".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SpringArm" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SpringArm
     */
    private object __method_bind {
      val addExcludedObject: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "add_excluded_object".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_excluded_object" }
        }
      val clearExcludedObjects: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "clear_excluded_objects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_excluded_objects" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val getHitLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "get_hit_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_hit_length" }
        }
      val getLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "get_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_length" }
        }
      val getMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "get_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_margin" }
        }
      val getShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shape" }
        }
      val removeExcludedObject: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "remove_excluded_object".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_excluded_object" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val setLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "set_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_length" }
        }
      val setMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "set_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_margin" }
        }
      val setShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpringArm".cstr.ptr,
            "set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shape" }
        }}
  }
}
