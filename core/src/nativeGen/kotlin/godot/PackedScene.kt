// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
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

open class PackedScene(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun canInstance(): Boolean {
    val _ret = __method_bind.canInstance.call(this._handle)
    return _ret.asBoolean()
  }

  fun getState(): SceneState {
    val _ret = __method_bind.getState.call(this._handle)
    return _ret.asObject(::SceneState)!!
  }

  fun instance(editState: Int = 0): Node {
    val _arg = Variant(editState)
    val _ret = __method_bind.instance.call(this._handle, listOf(_arg))
    return _ret.asObject(::Node)!!
  }

  fun pack(path: Node): GDError {
    val _arg = Variant(path)
    val _ret = __method_bind.pack.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  enum class GenEditState(
    val value: Int
  ) {
    DISABLED(0),

    INSTANCE(1),

    MAIN(2);

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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PackedScene".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PackedScene" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
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
