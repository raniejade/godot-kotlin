// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
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

open class PackedScene(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun canInstance(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.canInstance.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getState(): SceneState {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: SceneState
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getState.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<SceneState>(_tmp.value!!)
      _ret
    }
  }

  fun instance(editState: Int = 0): Node {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Node
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.instance.call(self._handle, listOf(editState), _retPtr)
      _ret = objectToType<Node>(_tmp.value!!)
      _ret
    }
  }

  fun pack(path: Node): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.pack.call(self._handle, listOf(path), _retPtr)
      GDError.from(_ret.value)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedScene".cstr.ptr,
            "can_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_instance" }
        }
      val getState: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedScene".cstr.ptr,
            "get_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_state" }
        }
      val instance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedScene".cstr.ptr,
            "instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance" }
        }
      val pack: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedScene".cstr.ptr,
            "pack".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pack" }
        }}
  }
}
