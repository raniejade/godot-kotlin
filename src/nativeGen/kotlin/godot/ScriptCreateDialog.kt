// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ScriptCreateDialog(
  _handle: COpaquePointer
) : ConfirmationDialog(_handle) {
  /**
   * ScriptCreateDialog::script_created signal
   */
  val signalScriptCreated: Signal1<Script> = Signal1("script_created")

  fun config(
    inherits: String,
    path: String,
    builtInEnabled: Boolean = true,
    loadEnabled: Boolean = true
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(inherits))
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(builtInEnabled))
    _args.add(Variant.fromAny(loadEnabled))
    __method_bind.config.call(this._handle, _args)
  }

  companion object {
    /**
     * Container for method_bind pointers for ScriptCreateDialog
     */
    private object __method_bind {
      val config: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScriptCreateDialog".cstr.ptr,
            "config".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method config" }
        }}
  }
}
