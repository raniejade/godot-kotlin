// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Float
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

open class StaticBody(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PhysicsBody(null) {
  var bounce: Float
    get() {
       return getBounce() 
    }
    set(value) {
      setBounce(value)
    }

  var constantAngularVelocity: Vector3
    get() {
       return getConstantAngularVelocity() 
    }
    set(value) {
      setConstantAngularVelocity(value)
    }

  var constantLinearVelocity: Vector3
    get() {
       return getConstantLinearVelocity() 
    }
    set(value) {
      setConstantLinearVelocity(value)
    }

  var friction: Float
    get() {
       return getFriction() 
    }
    set(value) {
      setFriction(value)
    }

  var physicsMaterialOverride: PhysicsMaterial
    get() {
       return getPhysicsMaterialOverride() 
    }
    set(value) {
      setPhysicsMaterialOverride(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for constantAngularVelocity
   */
  fun constantAngularVelocity(cb: Vector3.() -> Unit) {
    val _p = constantAngularVelocity
    cb(_p)
    constantAngularVelocity = _p
  }

  /**
   * Specialized setter for constantLinearVelocity
   */
  fun constantLinearVelocity(cb: Vector3.() -> Unit) {
    val _p = constantLinearVelocity
    cb(_p)
    constantLinearVelocity = _p
  }

  open fun _reload_physics_characteristics() {
    TODO()
  }

  fun getBounce(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBounce.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getConstantAngularVelocity(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getConstantAngularVelocity.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getConstantLinearVelocity(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getConstantLinearVelocity.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFriction(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFriction.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPhysicsMaterialOverride(): PhysicsMaterial {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: PhysicsMaterial
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getPhysicsMaterialOverride.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<PhysicsMaterial>(_tmp.value!!)
      _ret
    }
  }

  fun setBounce(bounce: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBounce.call(self._handle, listOf(bounce), null)
    }
  }

  fun setConstantAngularVelocity(vel: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setConstantAngularVelocity.call(self._handle, listOf(vel), null)
    }
  }

  fun setConstantLinearVelocity(vel: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setConstantLinearVelocity.call(self._handle, listOf(vel), null)
    }
  }

  fun setFriction(friction: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFriction.call(self._handle, listOf(friction), null)
    }
  }

  fun setPhysicsMaterialOverride(physicsMaterialOverride: PhysicsMaterial) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPhysicsMaterialOverride.call(self._handle, listOf(physicsMaterialOverride),
          null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StaticBody".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StaticBody" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for StaticBody
     */
    private object __method_bind {
      val getBounce: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "get_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bounce" }
            }
          }

      val getConstantAngularVelocity: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "get_constant_angular_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_constant_angular_velocity"
              }
            }
          }

      val getConstantLinearVelocity: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "get_constant_linear_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_constant_linear_velocity" }
            }
          }

      val getFriction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "get_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_friction" }
            }
          }

      val getPhysicsMaterialOverride: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "get_physics_material_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_physics_material_override"
              }
            }
          }

      val setBounce: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "set_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bounce" }
            }
          }

      val setConstantAngularVelocity: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "set_constant_angular_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_constant_angular_velocity"
              }
            }
          }

      val setConstantLinearVelocity: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "set_constant_linear_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_constant_linear_velocity" }
            }
          }

      val setFriction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "set_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_friction" }
            }
          }

      val setPhysicsMaterialOverride: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StaticBody".cstr.ptr,
              "set_physics_material_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_physics_material_override"
              }
            }
          }
    }
  }
}
