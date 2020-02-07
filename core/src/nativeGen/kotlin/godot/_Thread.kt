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

open class _Thread(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    _handle = __new()
  }

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
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(method))
    _args.add(Variant.fromAny(userdata))
    _args.add(Variant.fromAny(priority))
    val _ret = __method_bind.start.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun waitToFinish(): Variant {
    val _ret = __method_bind.waitToFinish.call(this._handle)
    return _ret
  }

  enum class Priority(
    val value: Int
  ) {
    LOW(0),

    NORMAL(1),

    HIGH(2);

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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("_Thread".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for _Thread" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
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
