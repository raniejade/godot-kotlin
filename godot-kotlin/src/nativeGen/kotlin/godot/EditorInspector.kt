// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class EditorInspector(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : ScrollContainer(null) {
  /**
   * EditorInspector::object_id_selected signal
   */
  val signalObjectIdSelected: Signal1<Int> = Signal1("object_id_selected")

  /**
   * EditorInspector::property_edited signal
   */
  val signalPropertyEdited: Signal1<String> = Signal1("property_edited")

  /**
   * EditorInspector::property_keyed signal
   */
  val signalPropertyKeyed: Signal1<String> = Signal1("property_keyed")

  /**
   * EditorInspector::property_selected signal
   */
  val signalPropertySelected: Signal1<String> = Signal1("property_selected")

  /**
   * EditorInspector::property_toggled signal
   */
  val signalPropertyToggled: Signal2<String, Boolean> = Signal2("property_toggled")

  /**
   * EditorInspector::resource_selected signal
   */
  val signalResourceSelected: Signal2<Object, String> = Signal2("resource_selected")

  /**
   * EditorInspector::restart_requested signal
   */
  val signalRestartRequested: Signal0 = Signal0("restart_requested")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _edit_request_change(arg0: Object, arg1: String) {
    TODO()
  }

  open fun _feature_profile_changed() {
    TODO()
  }

  open fun _filter_changed(arg0: String) {
    TODO()
  }

  open fun _multiple_properties_changed(arg0: PoolStringArray, arg1: VariantArray) {
    TODO()
  }

  open fun _node_removed(arg0: Node) {
    TODO()
  }

  open fun _object_id_selected(arg0: String, arg1: Int) {
    TODO()
  }

  open fun _property_changed(
    arg0: String,
    arg1: Variant,
    arg2: String = "",
    arg3: Boolean = false
  ) {
    TODO()
  }

  open fun _property_changed_update_all(
    arg0: String,
    arg1: Variant,
    arg2: String,
    arg3: Boolean
  ) {
    TODO()
  }

  open fun _property_checked(arg0: String, arg1: Boolean) {
    TODO()
  }

  open fun _property_keyed(arg0: String, arg1: Boolean) {
    TODO()
  }

  open fun _property_keyed_with_value(
    arg0: String,
    arg1: Variant,
    arg2: Boolean
  ) {
    TODO()
  }

  open fun _property_selected(arg0: String, arg1: Int) {
    TODO()
  }

  open fun _resource_selected(arg0: String, arg1: Resource) {
    TODO()
  }

  open fun _vscroll_changed(arg0: Float) {
    TODO()
  }

  fun refresh() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.refresh.call(self._handle, emptyList(), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorInspector
     */
    private object __method_bind {
      val refresh: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
              "refresh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method refresh" }
            }
          }
    }
  }
}
