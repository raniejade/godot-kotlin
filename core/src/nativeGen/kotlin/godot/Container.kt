// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
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

open class Container(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Control(null) {
  /**
   * Container::sort_children signal
   */
  val signalSortChildren: Signal0 = Signal0("sort_children")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun fitChildInRect(child: Control, rect: Rect2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(child))
    _args.add(Variant.fromAny(rect))
    __method_bind.fitChildInRect.call(this._handle, _args)
  }

  fun queueSort() {
    __method_bind.queueSort.call(this._handle)
  }

  companion object {
    val NOTIFICATION_SORT_CHILDREN: Int = 50

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Container".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Container" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Container
     */
    private object __method_bind {
      val fitChildInRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Container".cstr.ptr,
            "fit_child_in_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method fit_child_in_rect" }
        }
      val queueSort: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Container".cstr.ptr,
            "queue_sort".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queue_sort" }
        }}
  }
}
