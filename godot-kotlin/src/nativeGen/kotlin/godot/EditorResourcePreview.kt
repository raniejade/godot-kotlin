// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class EditorResourcePreview(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  /**
   * EditorResourcePreview::preview_invalidated signal
   */
  val signalPreviewInvalidated: Signal1<String> = Signal1("preview_invalidated")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _preview_ready(
    arg0: String,
    arg1: Texture,
    arg2: Texture,
    arg3: Int,
    arg4: String,
    arg5: Variant
  ) {
    TODO()
  }

  fun addPreviewGenerator(generator: EditorResourcePreviewGenerator) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addPreviewGenerator.call(self._handle, listOf(generator), null)
    }
  }

  fun checkForInvalidation(path: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.checkForInvalidation.call(self._handle, listOf(path), null)
    }
  }

  fun queueEditedResourcePreview(
    resource: Resource,
    receiver: Object,
    receiverFunc: String,
    userdata: Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(resource)
      _args.add(receiver)
      _args.add(receiverFunc)
      _args.add(userdata)
      __method_bind.queueEditedResourcePreview.call(self._handle, _args, null)
    }
  }

  fun queueResourcePreview(
    path: String,
    receiver: Object,
    receiverFunc: String,
    userdata: Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(receiver)
      _args.add(receiverFunc)
      _args.add(userdata)
      __method_bind.queueResourcePreview.call(self._handle, _args, null)
    }
  }

  fun removePreviewGenerator(generator: EditorResourcePreviewGenerator) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removePreviewGenerator.call(self._handle, listOf(generator), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorResourcePreview
     */
    private object __method_bind {
      val addPreviewGenerator: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
            "add_preview_generator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_preview_generator" }
        }
      val checkForInvalidation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
            "check_for_invalidation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method check_for_invalidation" }
        }
      val queueEditedResourcePreview: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
            "queue_edited_resource_preview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queue_edited_resource_preview" }
        }
      val queueResourcePreview: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
            "queue_resource_preview".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queue_resource_preview" }
        }
      val removePreviewGenerator: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorResourcePreview".cstr.ptr,
            "remove_preview_generator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_preview_generator" }
        }}
  }
}
