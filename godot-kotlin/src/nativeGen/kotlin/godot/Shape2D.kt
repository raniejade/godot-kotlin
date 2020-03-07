// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
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

open class Shape2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var customSolverBias: Float
    get() {
       return getCustomSolverBias() 
    }
    set(value) {
      setCustomSolverBias(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun collide(
    localXform: Transform2D,
    withShape: Shape2D,
    shapeXform: Transform2D
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(localXform)
      _args.add(withShape)
      _args.add(shapeXform)
      __method_bind.collide.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun collideAndGetContacts(
    localXform: Transform2D,
    withShape: Shape2D,
    shapeXform: Transform2D
  ): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(localXform)
      _args.add(withShape)
      _args.add(shapeXform)
      __method_bind.collideAndGetContacts.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun collideWithMotion(
    localXform: Transform2D,
    localMotion: Vector2,
    withShape: Shape2D,
    shapeXform: Transform2D,
    shapeMotion: Vector2
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(localXform)
      _args.add(localMotion)
      _args.add(withShape)
      _args.add(shapeXform)
      _args.add(shapeMotion)
      __method_bind.collideWithMotion.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun collideWithMotionAndGetContacts(
    localXform: Transform2D,
    localMotion: Vector2,
    withShape: Shape2D,
    shapeXform: Transform2D,
    shapeMotion: Vector2
  ): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(localXform)
      _args.add(localMotion)
      _args.add(withShape)
      _args.add(shapeXform)
      _args.add(shapeMotion)
      __method_bind.collideWithMotionAndGetContacts.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCustomSolverBias(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCustomSolverBias.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setCustomSolverBias(bias: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCustomSolverBias.call(self._handle, listOf(bias), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for Shape2D
     */
    private object __method_bind {
      val collide: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "collide".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method collide" }
            }
          }

      val collideAndGetContacts: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "collide_and_get_contacts".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method collide_and_get_contacts" }
            }
          }

      val collideWithMotion: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "collide_with_motion".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method collide_with_motion" }
            }
          }

      val collideWithMotionAndGetContacts: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "collide_with_motion_and_get_contacts".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method collide_with_motion_and_get_contacts" }
            }
          }

      val getCustomSolverBias: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "get_custom_solver_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_solver_bias" }
            }
          }

      val setCustomSolverBias: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "set_custom_solver_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_solver_bias" }
            }
          }
    }
  }
}
