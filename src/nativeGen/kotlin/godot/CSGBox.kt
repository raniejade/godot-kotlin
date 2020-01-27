// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CSGBox internal constructor(
  _handle: COpaquePointer
) : CSGPrimitive(_handle) {
  fun getDepth(): Float {
    val _ret = __method_bind.get_depth.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getHeight(): Float {
    val _ret = __method_bind.get_height.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getMaterial(): Material {
    val _ret = __method_bind.get_material.call(this.toVariant())
    return _ret.asObject(::Material)!!
  }

  fun getWidth(): Float {
    val _ret = __method_bind.get_width.call(this.toVariant())
    return _ret.asFloat()
  }

  fun setDepth(depth: Float) {
    val _arg = Variant.new(depth)
    __method_bind.set_depth.call(this.toVariant(), _arg, 1)
  }

  fun setHeight(height: Float) {
    val _arg = Variant.new(height)
    __method_bind.set_height.call(this.toVariant(), _arg, 1)
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.set_material.call(this.toVariant(), _arg, 1)
  }

  fun setWidth(width: Float) {
    val _arg = Variant.new(width)
    __method_bind.set_width.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): CSGBox = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CSGBox".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CSGBox" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CSGBox(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CSGBox = CSGBox(ptr)
    /**
     * Container for method_bind pointers for CSGBox
     */
    private object __method_bind {
      val get_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
              "get_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_depth" }
            }
          }

      val get_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val get_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
              "get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_material" }
            }
          }

      val get_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
              "get_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_width" }
            }
          }

      val set_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
              "set_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_depth" }
            }
          }

      val set_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
              "set_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_height" }
            }
          }

      val set_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
              "set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_material" }
            }
          }

      val set_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
              "set_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_width" }
            }
          }
    }
  }
}
