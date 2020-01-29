// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PackedScene(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun canInstance(): Boolean {
    val _ret = __method_bind.canInstance.call(this._handle)
    return _ret.asBoolean()
  }

  fun getState(): SceneState {
    val _ret = __method_bind.getState.call(this._handle)
    return _ret.asObject(::SceneState)!!
  }

  fun instance(editState: Int = 0): Node {
    val _arg = Variant.new(editState)
    val _ret = __method_bind.instance.call(this._handle, _arg, 1)
    return _ret.asObject(::Node)!!
  }

  fun pack(path: Node): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.pack.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
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
      requireNotNull(fnPtr) { "No instance found for PackedScene" }
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
      val canInstance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedScene".cstr.ptr,
            "can_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_instance" }
        }
      val getState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedScene".cstr.ptr,
            "get_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_state" }
        }
      val instance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedScene".cstr.ptr,
            "instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance" }
        }
      val pack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedScene".cstr.ptr,
            "pack".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pack" }
        }}
  }
}
