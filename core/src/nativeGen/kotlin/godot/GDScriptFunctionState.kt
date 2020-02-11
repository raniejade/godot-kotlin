// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class GDScriptFunctionState(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  /**
   * GDScriptFunctionState::completed signal
   */
  val signalCompleted: Signal1<Variant> = Signal1("completed")

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun isValid(extendedCheck: Boolean = false): Boolean {
    val _arg = Variant(extendedCheck)
    val _ret = __method_bind.isValid.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun resume(arg: Variant): Variant {
    val _arg = Variant(arg)
    val _ret = __method_bind.resume.call(this._handle, listOf(_arg))
    return _ret
  }

  companion object {
    /**
     * Container for method_bind pointers for GDScriptFunctionState
     */
    private object __method_bind {
      val isValid: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDScriptFunctionState".cstr.ptr,
            "is_valid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_valid" }
        }
      val resume: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDScriptFunctionState".cstr.ptr,
            "resume".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resume" }
        }}
  }
}
