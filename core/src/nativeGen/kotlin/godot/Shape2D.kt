// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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
    _handle = __new()
  }

  fun collide(
    localXform: Transform2D,
    withShape: Shape2D,
    shapeXform: Transform2D
  ): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(localXform))
    _args.add(Variant.fromAny(withShape))
    _args.add(Variant.fromAny(shapeXform))
    val _ret = __method_bind.collide.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun collideAndGetContacts(
    localXform: Transform2D,
    withShape: Shape2D,
    shapeXform: Transform2D
  ): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(localXform))
    _args.add(Variant.fromAny(withShape))
    _args.add(Variant.fromAny(shapeXform))
    val _ret = __method_bind.collideAndGetContacts.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun collideWithMotion(
    localXform: Transform2D,
    localMotion: Vector2,
    withShape: Shape2D,
    shapeXform: Transform2D,
    shapeMotion: Vector2
  ): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(localXform))
    _args.add(Variant.fromAny(localMotion))
    _args.add(Variant.fromAny(withShape))
    _args.add(Variant.fromAny(shapeXform))
    _args.add(Variant.fromAny(shapeMotion))
    val _ret = __method_bind.collideWithMotion.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun collideWithMotionAndGetContacts(
    localXform: Transform2D,
    localMotion: Vector2,
    withShape: Shape2D,
    shapeXform: Transform2D,
    shapeMotion: Vector2
  ): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(localXform))
    _args.add(Variant.fromAny(localMotion))
    _args.add(Variant.fromAny(withShape))
    _args.add(Variant.fromAny(shapeXform))
    _args.add(Variant.fromAny(shapeMotion))
    val _ret = __method_bind.collideWithMotionAndGetContacts.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun getCustomSolverBias(): Float {
    val _ret = __method_bind.getCustomSolverBias.call(this._handle)
    return _ret.asFloat()
  }

  fun setCustomSolverBias(bias: Float) {
    val _arg = Variant.new(bias)
    __method_bind.setCustomSolverBias.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for Shape2D
     */
    private object __method_bind {
      val collide: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
            "collide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method collide" }
        }
      val collideAndGetContacts: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
            "collide_and_get_contacts".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method collide_and_get_contacts" }
        }
      val collideWithMotion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
            "collide_with_motion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method collide_with_motion" }
        }
      val collideWithMotionAndGetContacts: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
            "collide_with_motion_and_get_contacts".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method collide_with_motion_and_get_contacts" }
        }
      val getCustomSolverBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
            "get_custom_solver_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_solver_bias" }
        }
      val setCustomSolverBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
            "set_custom_solver_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_solver_bias" }
        }}
  }
}
