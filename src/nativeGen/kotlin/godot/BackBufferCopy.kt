// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class BackBufferCopy internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getCopyMode(): CopyMode {
    val _ret = __method_bind.get_copy_mode.call(this.toVariant())
    return BackBufferCopy.CopyMode.from(_ret.asInt())
  }

  fun getRect(): Rect2 {
    val _ret = __method_bind.get_rect.call(this.toVariant())
    return _ret.asRect2()
  }

  fun setCopyMode(copyMode: Int) {
    val _arg = Variant.new(copyMode)
    __method_bind.set_copy_mode.call(this.toVariant(), _arg, 1)
  }

  fun setRect(rect: Rect2) {
    val _arg = Variant.new(rect)
    __method_bind.set_rect.call(this.toVariant(), _arg, 1)
  }

  enum class CopyMode(
    val value: Int
  ) {
    COPY_MODE_DISABLED(0),

    COPY_MODE_RECT(1),

    COPY_MODE_VIEWPORT(2);

    companion object {
      fun from(value: Int): CopyMode {
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
    val COPY_MODE_DISABLED: Int = 0

    val COPY_MODE_RECT: Int = 1

    val COPY_MODE_VIEWPORT: Int = 2

    fun new(): BackBufferCopy = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("BackBufferCopy".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for BackBufferCopy" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      BackBufferCopy(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): BackBufferCopy = BackBufferCopy(ptr)
    /**
     * Container for method_bind pointers for BackBufferCopy
     */
    private object __method_bind {
      val get_copy_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
              "get_copy_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_copy_mode" }
            }
          }

      val get_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
              "get_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rect" }
            }
          }

      val set_copy_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
              "set_copy_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_copy_mode" }
            }
          }

      val set_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
              "set_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rect" }
            }
          }
    }
  }
}
