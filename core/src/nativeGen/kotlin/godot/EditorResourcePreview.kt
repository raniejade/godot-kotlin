// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class EditorResourcePreview(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  /**
   * EditorResourcePreview::preview_invalidated signal
   */
  val signalPreviewInvalidated: Signal1<String> = Signal1("preview_invalidated")

  constructor() : this(null) {
    _handle = __new()
  }

  fun addPreviewGenerator(generator: EditorResourcePreviewGenerator) {
    val _arg = Variant.new(generator)
    __method_bind.addPreviewGenerator.call(this._handle, listOf(_arg))
  }

  fun checkForInvalidation(path: String) {
    val _arg = Variant.new(path)
    __method_bind.checkForInvalidation.call(this._handle, listOf(_arg))
  }

  fun queueEditedResourcePreview(
    resource: Resource,
    receiver: Object,
    receiverFunc: String,
    userdata: Variant
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(resource))
    _args.add(Variant.fromAny(receiver))
    _args.add(Variant.fromAny(receiverFunc))
    _args.add(Variant.fromAny(userdata))
    __method_bind.queueEditedResourcePreview.call(this._handle, _args)
  }

  fun queueResourcePreview(
    path: String,
    receiver: Object,
    receiverFunc: String,
    userdata: Variant
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(receiver))
    _args.add(Variant.fromAny(receiverFunc))
    _args.add(Variant.fromAny(userdata))
    __method_bind.queueResourcePreview.call(this._handle, _args)
  }

  fun removePreviewGenerator(generator: EditorResourcePreviewGenerator) {
    val _arg = Variant.new(generator)
    __method_bind.removePreviewGenerator.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorResourcePreview
     */
    private object __method_bind {
      val addPreviewGenerator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
            "add_preview_generator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_preview_generator" }
        }
      val checkForInvalidation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
            "check_for_invalidation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method check_for_invalidation" }
        }
      val queueEditedResourcePreview: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
            "queue_edited_resource_preview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queue_edited_resource_preview" }
        }
      val queueResourcePreview: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
            "queue_resource_preview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queue_resource_preview" }
        }
      val removePreviewGenerator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
            "remove_preview_generator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_preview_generator" }
        }}
  }
}
