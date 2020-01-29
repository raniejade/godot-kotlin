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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class _Thread(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getId(): String {
    val _ret = __method_bind.getId.call(this._handle)
    return _ret.asString()
  }

  fun isActive(): Boolean {
    val _ret = __method_bind.isActive.call(this._handle)
    return _ret.asBoolean()
  }

  fun start(
    instance: Object,
    method: String,
    userdata: Variant,
    priority: Int = 1
  ): GDError {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(method)
    _args.append(userdata)
    _args.append(priority)
    val _ret = __method_bind.start.call(this._handle, _args.toVariant(), 4)
    return GDError.from(_ret.asInt())
  }

  fun waitToFinish(): Variant {
    val _ret = __method_bind.waitToFinish.call(this._handle)
    return _ret
  }

  enum class Priority(
    val value: Int
  ) {
    PRIORITY_LOW(0),

    PRIORITY_NORMAL(1),

    PRIORITY_HIGH(2);

    companion object {
      fun from(value: Int): Priority {
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
    val PRIORITY_HIGH: Int = 2

    val PRIORITY_LOW: Int = 0

    val PRIORITY_NORMAL: Int = 1

    fun new(): _Thread = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("_Thread".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for _Thread" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      _Thread(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): _Thread = _Thread(ptr)
    /**
     * Container for method_bind pointers for _Thread
     */
    private object __method_bind {
      val getId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Thread".cstr.ptr,
            "get_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_id" }
        }
      val isActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Thread".cstr.ptr,
            "is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_active" }
        }
      val start: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Thread".cstr.ptr,
            "start".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method start" }
        }
      val waitToFinish: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Thread".cstr.ptr,
            "wait_to_finish".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method wait_to_finish" }
        }}
  }
}
