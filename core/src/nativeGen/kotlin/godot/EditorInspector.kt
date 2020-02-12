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

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
      val refresh: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorInspector".cstr.ptr,
            "refresh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method refresh" }
        }}
  }
}
