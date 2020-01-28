// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorResourcePreview(
  _handle: COpaquePointer
) : Node(_handle) {
  fun addPreviewGenerator(generator: EditorResourcePreviewGenerator) {
    val _arg = Variant.new(generator)
    __method_bind.addPreviewGenerator.call(this._handle, _arg, 1)
  }

  fun checkForInvalidation(path: String) {
    val _arg = Variant.new(path)
    __method_bind.checkForInvalidation.call(this._handle, _arg, 1)
  }

  fun queueEditedResourcePreview(
    resource: Resource,
    receiver: Object,
    receiverFunc: String,
    userdata: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(resource)
    _args.append(receiver)
    _args.append(receiverFunc)
    _args.append(userdata)
    __method_bind.queueEditedResourcePreview.call(this._handle, _args.toVariant(), 4)
  }

  fun queueResourcePreview(
    path: String,
    receiver: Object,
    receiverFunc: String,
    userdata: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(receiver)
    _args.append(receiverFunc)
    _args.append(userdata)
    __method_bind.queueResourcePreview.call(this._handle, _args.toVariant(), 4)
  }

  fun removePreviewGenerator(generator: EditorResourcePreviewGenerator) {
    val _arg = Variant.new(generator)
    __method_bind.removePreviewGenerator.call(this._handle, _arg, 1)
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
            "addPreviewGenerator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addPreviewGenerator" }
        }
      val checkForInvalidation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
            "checkForInvalidation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method checkForInvalidation" }
        }
      val queueEditedResourcePreview: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
            "queueEditedResourcePreview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queueEditedResourcePreview" }
        }
      val queueResourcePreview: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
            "queueResourcePreview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queueResourcePreview" }
        }
      val removePreviewGenerator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
            "removePreviewGenerator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removePreviewGenerator" }
        }}
  }
}
