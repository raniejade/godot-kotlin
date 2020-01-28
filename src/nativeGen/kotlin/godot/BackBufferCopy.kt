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

open class BackBufferCopy(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var copyMode: Int
    get() {
       return BackBufferCopy.CopyMode.from(getCopyMode()) 
    }
    set(value) {
      setCopyMode(BackBufferCopy.CopyMode.from(value))
    }

  var rect: Rect2
    get() {
       return getRect() 
    }
    set(value) {
      setRect(value)
    }

  fun getCopyMode(): CopyMode {
    val _ret = __method_bind.getCopyMode.call(this._handle)
    return BackBufferCopy.CopyMode.from(_ret.asInt())
  }

  fun getRect(): Rect2 {
    val _ret = __method_bind.getRect.call(this._handle)
    return _ret.asRect2()
  }

  fun setCopyMode(copyMode: Int) {
    val _arg = Variant.new(copyMode)
    __method_bind.setCopyMode.call(this._handle, _arg, 1)
  }

  fun setRect(rect: Rect2) {
    val _arg = Variant.new(rect)
    __method_bind.setRect.call(this._handle, _arg, 1)
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
      val getCopyMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
            "getCopyMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCopyMode" }
        }
      val getRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
            "getRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRect" }
        }
      val setCopyMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
            "setCopyMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCopyMode" }
        }
      val setRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
            "setRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRect" }
        }}
  }
}
