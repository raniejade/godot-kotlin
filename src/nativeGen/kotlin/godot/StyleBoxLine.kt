// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
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

open class StyleBoxLine internal constructor(
  _handle: COpaquePointer
) : StyleBox(_handle) {
  fun getColor(): Color {
    TODO()
  }

  fun getGrowBegin(): Float {
    TODO()
  }

  fun getGrowEnd(): Float {
    TODO()
  }

  fun getThickness(): Int {
    TODO()
  }

  fun isVertical(): Boolean {
    TODO()
  }

  fun setColor() {
    TODO()
  }

  fun setGrowBegin() {
    TODO()
  }

  fun setGrowEnd() {
    TODO()
  }

  fun setThickness() {
    TODO()
  }

  fun setVertical() {
    TODO()
  }

  companion object {
    fun new(): StyleBoxLine = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StyleBoxLine".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton StyleBoxLine" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StyleBoxLine(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for StyleBoxLine
     */
    private object __method_bind {
      val get_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
              "get_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color" }
            }
          }

      val get_grow_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
              "get_grow_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_grow_begin" }
            }
          }

      val get_grow_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
              "get_grow_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_grow_end" }
            }
          }

      val get_thickness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
              "get_thickness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_thickness" }
            }
          }

      val is_vertical: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
              "is_vertical".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_vertical" }
            }
          }

      val set_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
              "set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color" }
            }
          }

      val set_grow_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
              "set_grow_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_grow_begin" }
            }
          }

      val set_grow_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
              "set_grow_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_grow_end" }
            }
          }

      val set_thickness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
              "set_thickness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_thickness" }
            }
          }

      val set_vertical: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
              "set_vertical".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vertical" }
            }
          }
    }
  }
}
