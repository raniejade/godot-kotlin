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

open class Container(
  _handle: COpaquePointer
) : Control(_handle) {
  fun fitChildInRect(child: Control, rect: Rect2) {
    val _args = VariantArray.new()
    _args.append(child)
    _args.append(rect)
    __method_bind.fitChildInRect.call(this._handle, _args.toVariant(), 2)
  }

  fun queueSort() {
    __method_bind.queueSort.call(this._handle)
  }

  companion object {
    val NOTIFICATION_SORT_CHILDREN: Int = 50

    fun new(): Container = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Container".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Container" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Container(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Container = Container(ptr)
    /**
     * Container for method_bind pointers for Container
     */
    private object __method_bind {
      val fitChildInRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Container".cstr.ptr,
            "fitChildInRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method fitChildInRect" }
        }
      val queueSort: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Container".cstr.ptr,
            "queueSort".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queueSort" }
        }}
  }
}
