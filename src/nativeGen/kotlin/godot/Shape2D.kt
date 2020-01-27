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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Shape2D internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun collide(
    localXform: Transform2D,
    withShape: Shape2D,
    shapeXform: Transform2D
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(localXform)
    _args.append(withShape)
    _args.append(shapeXform)
    val _ret = __method_bind.collide.call(this.toVariant(), _args.toVariant(), 3)
    return _ret.asBool()
  }

  fun collideAndGetContacts(
    localXform: Transform2D,
    withShape: Shape2D,
    shapeXform: Transform2D
  ): VariantArray {
    val _args = VariantArray.new()
    _args.append(localXform)
    _args.append(withShape)
    _args.append(shapeXform)
    val _ret = __method_bind.collide_and_get_contacts.call(this.toVariant(), _args.toVariant(), 3)
    return _ret.asArray()
  }

  fun collideWithMotion(
    localXform: Transform2D,
    localMotion: Vector2,
    withShape: Shape2D,
    shapeXform: Transform2D,
    shapeMotion: Vector2
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(localXform)
    _args.append(localMotion)
    _args.append(withShape)
    _args.append(shapeXform)
    _args.append(shapeMotion)
    val _ret = __method_bind.collide_with_motion.call(this.toVariant(), _args.toVariant(), 5)
    return _ret.asBool()
  }

  fun collideWithMotionAndGetContacts(
    localXform: Transform2D,
    localMotion: Vector2,
    withShape: Shape2D,
    shapeXform: Transform2D,
    shapeMotion: Vector2
  ): VariantArray {
    val _args = VariantArray.new()
    _args.append(localXform)
    _args.append(localMotion)
    _args.append(withShape)
    _args.append(shapeXform)
    _args.append(shapeMotion)
    val _ret = __method_bind.collide_with_motion_and_get_contacts.call(this.toVariant(),
        _args.toVariant(), 5)
    return _ret.asArray()
  }

  fun getCustomSolverBias(): Float {
    val _ret = __method_bind.get_custom_solver_bias.call(this.toVariant())
    return _ret.asFloat()
  }

  fun setCustomSolverBias(bias: Float) {
    val _arg = Variant.new(bias)
    __method_bind.set_custom_solver_bias.call(this.toVariant(), _arg, 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for Shape2D
     */
    private object __method_bind {
      val collide: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "collide".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method collide" }
            }
          }

      val collide_and_get_contacts: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "collide_and_get_contacts".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method collide_and_get_contacts" }
            }
          }

      val collide_with_motion: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "collide_with_motion".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method collide_with_motion" }
            }
          }

      val collide_with_motion_and_get_contacts: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "collide_with_motion_and_get_contacts".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method collide_with_motion_and_get_contacts" }
            }
          }

      val get_custom_solver_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "get_custom_solver_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_solver_bias" }
            }
          }

      val set_custom_solver_bias: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shape2D".cstr.ptr,
              "set_custom_solver_bias".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_solver_bias" }
            }
          }
    }
  }
}
