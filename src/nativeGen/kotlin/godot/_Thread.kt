// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
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

open class _Thread internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getId(): String {
    TODO()
  }

  fun isActive(): Boolean {
    TODO()
  }

  fun start(
    instance: Object,
    method: String,
    userdata: Variant,
    priority: Int
  ): Error {
    TODO()
  }

  fun waitToFinish(): Variant {
    TODO()
  }

  enum class Priority(
    val value: Int
  ) {
    PRIORITY_LOW(0),

    PRIORITY_NORMAL(1),

    PRIORITY_HIGH(2);
  }

  companion object {
    val PRIORITY_HIGH: Int = 2

    val PRIORITY_LOW: Int = 0

    val PRIORITY_NORMAL: Int = 1

    fun new(): _Thread = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("_Thread".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton _Thread" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      _Thread(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for _Thread
     */
    private object __method_bind {
      val get_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Thread".cstr.ptr,
              "get_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_id" }
            }
          }

      val is_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Thread".cstr.ptr,
              "is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_active" }
            }
          }

      val start: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Thread".cstr.ptr,
              "start".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method start" }
            }
          }

      val wait_to_finish: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Thread".cstr.ptr,
              "wait_to_finish".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method wait_to_finish" }
            }
          }
    }
  }
}
