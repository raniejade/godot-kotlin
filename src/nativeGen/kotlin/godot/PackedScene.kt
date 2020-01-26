// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PackedScene internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun canInstance(): Boolean {
    TODO()
  }

  fun getState(): SceneState {
    TODO()
  }

  fun instance(edit_state: Int): Node {
    TODO()
  }

  fun pack(path: Node): Error {
    TODO()
  }

  enum class GenEditState(
    val value: Int
  ) {
    GEN_EDIT_STATE_DISABLED(0),

    GEN_EDIT_STATE_INSTANCE(1),

    GEN_EDIT_STATE_MAIN(2);

    companion object {
      fun from(value: Int): GenEditState {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val GEN_EDIT_STATE_DISABLED: Int = 0

    val GEN_EDIT_STATE_INSTANCE: Int = 1

    val GEN_EDIT_STATE_MAIN: Int = 2

    fun new(): PackedScene = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PackedScene".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PackedScene" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PackedScene(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PackedScene = PackedScene(ptr)
    /**
     * Container for method_bind pointers for PackedScene
     */
    private object __method_bind {
      val can_instance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedScene".cstr.ptr,
              "can_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method can_instance" }
            }
          }

      val get_state: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedScene".cstr.ptr,
              "get_state".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_state" }
            }
          }

      val instance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedScene".cstr.ptr,
              "instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance" }
            }
          }

      val pack: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedScene".cstr.ptr,
              "pack".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method pack" }
            }
          }
    }
  }
}
