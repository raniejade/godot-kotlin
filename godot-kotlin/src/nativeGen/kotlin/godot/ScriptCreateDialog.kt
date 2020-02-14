// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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

open class ScriptCreateDialog(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : ConfirmationDialog(null) {
  /**
   * ScriptCreateDialog::script_created signal
   */
  val signalScriptCreated: Signal1<Script> = Signal1("script_created")

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _browse_class_in_tree() {
    TODO()
  }

  open fun _browse_path(arg0: Boolean, arg1: Boolean) {
    TODO()
  }

  open fun _built_in_pressed() {
    TODO()
  }

  open fun _class_name_changed(arg0: String) {
    TODO()
  }

  open fun _create() {
    TODO()
  }

  open fun _file_selected(arg0: String) {
    TODO()
  }

  open fun _lang_changed(arg0: Int) {
    TODO()
  }

  open fun _parent_name_changed(arg0: String) {
    TODO()
  }

  open fun _path_changed(arg0: String) {
    TODO()
  }

  open fun _path_entered(arg0: String) {
    TODO()
  }

  open fun _path_hbox_sorted() {
    TODO()
  }

  open fun _template_changed(arg0: Int) {
    TODO()
  }

  fun config(
    inherits: String,
    path: String,
    builtInEnabled: Boolean = true,
    loadEnabled: Boolean = true
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(inherits)
      _args.add(path)
      _args.add(builtInEnabled)
      _args.add(loadEnabled)
      __method_bind.config.call(self._handle, _args, null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for ScriptCreateDialog
     */
    private object __method_bind {
      val config: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
            "config".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method config" }
        }}
  }
}
