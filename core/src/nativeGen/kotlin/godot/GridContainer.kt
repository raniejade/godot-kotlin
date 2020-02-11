// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
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

open class GridContainer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Container(null) {
  var columns: Int
    get() {
       return getColumns() 
    }
    set(value) {
      setColumns(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getColumns(): Int {
    val _ret = __method_bind.getColumns.call(this._handle)
    return _ret.asInt()
  }

  fun setColumns(columns: Int) {
    val _arg = Variant(columns)
    __method_bind.setColumns.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GridContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GridContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for GridContainer
     */
    private object __method_bind {
      val getColumns: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridContainer".cstr.ptr,
            "get_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_columns" }
        }
      val setColumns: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridContainer".cstr.ptr,
            "set_columns".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_columns" }
        }}
  }
}
