// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisibilityNotifier internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun getAabb(): AABB {
    val _ret = __method_bind.get_aabb.call(this.toVariant())
    return _ret.asAABB()
  }

  fun isOnScreen(): Boolean {
    val _ret = __method_bind.is_on_screen.call(this.toVariant())
    return _ret.asBool()
  }

  fun setAabb(rect: AABB) {
    val _arg = Variant.new(rect)
    __method_bind.set_aabb.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): VisibilityNotifier = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisibilityNotifier".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisibilityNotifier" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisibilityNotifier(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisibilityNotifier = VisibilityNotifier(ptr)
    /**
     * Container for method_bind pointers for VisibilityNotifier
     */
    private object __method_bind {
      val get_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier".cstr.ptr,
              "get_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_aabb" }
            }
          }

      val is_on_screen: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier".cstr.ptr,
              "is_on_screen".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_on_screen" }
            }
          }

      val set_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisibilityNotifier".cstr.ptr,
              "set_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_aabb" }
            }
          }
    }
  }
}
