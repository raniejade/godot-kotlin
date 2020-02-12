// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class PhysicsShapeQueryParameters(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  var collideWithAreas: Boolean
    get() {
       return isCollideWithAreasEnabled() 
    }
    set(value) {
      setCollideWithAreas(value)
    }

  var collideWithBodies: Boolean
    get() {
       return isCollideWithBodiesEnabled() 
    }
    set(value) {
      setCollideWithBodies(value)
    }

  var collisionMask: Int
    get() {
       return getCollisionMask() 
    }
    set(value) {
      setCollisionMask(value)
    }

  var exclude: VariantArray
    get() {
       return getExclude() 
    }
    set(value) {
      setExclude(value)
    }

  var margin: Float
    get() {
       return getMargin() 
    }
    set(value) {
      setMargin(value)
    }

  var shapeRid: RID
    get() {
       return getShapeRid() 
    }
    set(value) {
      setShapeRid(value)
    }

  var transform: Transform
    get() {
       return getTransform() 
    }
    set(value) {
      setTransform(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for shapeRid
   */
  fun shapeRid(cb: RID.() -> Unit) {
    val _p = shapeRid
    cb(_p)
    shapeRid = _p
  }

  /**
   * Specialized setter for transform
   */
  fun transform(cb: Transform.() -> Unit) {
    val _p = transform
    cb(_p)
    transform = _p
  }

  fun getCollisionMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getExclude(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getExclude.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMargin(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMargin.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getShapeRid(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getShapeRid.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTransform(): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isCollideWithAreasEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCollideWithAreasEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isCollideWithBodiesEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCollideWithBodiesEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setCollideWithAreas(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollideWithAreas.call(self._handle, listOf(enable), null)
    }
  }

  fun setCollideWithBodies(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollideWithBodies.call(self._handle, listOf(enable), null)
    }
  }

  fun setCollisionMask(collisionMask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionMask.call(self._handle, listOf(collisionMask), null)
    }
  }

  fun setExclude(exclude: VariantArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExclude.call(self._handle, listOf(exclude), null)
    }
  }

  fun setMargin(margin: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMargin.call(self._handle, listOf(margin), null)
    }
  }

  fun setShape(shape: Resource) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShape.call(self._handle, listOf(shape), null)
    }
  }

  fun setShapeRid(shape: RID) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShapeRid.call(self._handle, listOf(shape), null)
    }
  }

  fun setTransform(transform: Transform) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTransform.call(self._handle, listOf(transform), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("PhysicsShapeQueryParameters".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PhysicsShapeQueryParameters" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for PhysicsShapeQueryParameters
     */
    private object __method_bind {
      val getCollisionMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val getExclude: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "get_exclude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_exclude" }
        }
      val getMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "get_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_margin" }
        }
      val getShapeRid: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "get_shape_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shape_rid" }
        }
      val getTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transform" }
        }
      val isCollideWithAreasEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "is_collide_with_areas_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_collide_with_areas_enabled" }
        }
      val isCollideWithBodiesEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "is_collide_with_bodies_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_collide_with_bodies_enabled" }
        }
      val setCollideWithAreas: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "set_collide_with_areas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collide_with_areas" }
        }
      val setCollideWithBodies: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "set_collide_with_bodies".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collide_with_bodies" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val setExclude: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "set_exclude".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_exclude" }
        }
      val setMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "set_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_margin" }
        }
      val setShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shape" }
        }
      val setShapeRid: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "set_shape_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shape_rid" }
        }
      val setTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryParameters".cstr.ptr,
            "set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_transform" }
        }}
  }
}
