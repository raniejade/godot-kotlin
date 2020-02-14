// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.PoolStringArray
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

open class EditorExportPlugin(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _export_begin(
    features: PoolStringArray,
    isDebug: Boolean,
    path: String,
    flags: Int
  ) {
    TODO()
  }

  open fun _export_end() {
    TODO()
  }

  open fun _export_file(
    path: String,
    type: String,
    features: PoolStringArray
  ) {
    TODO()
  }

  fun addFile(
    path: String,
    file: PoolByteArray,
    remap: Boolean
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(file)
      _args.add(remap)
      __method_bind.addFile.call(self._handle, _args, null)
    }
  }

  fun addIosBundleFile(path: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addIosBundleFile.call(self._handle, listOf(path), null)
    }
  }

  fun addIosCppCode(code: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addIosCppCode.call(self._handle, listOf(code), null)
    }
  }

  fun addIosFramework(path: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addIosFramework.call(self._handle, listOf(path), null)
    }
  }

  fun addIosLinkerFlags(flags: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addIosLinkerFlags.call(self._handle, listOf(flags), null)
    }
  }

  fun addIosPlistContent(plistContent: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addIosPlistContent.call(self._handle, listOf(plistContent), null)
    }
  }

  fun addSharedObject(path: String, tags: PoolStringArray) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(tags)
      __method_bind.addSharedObject.call(self._handle, _args, null)
    }
  }

  fun skip() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.skip.call(self._handle, emptyList(), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorExportPlugin
     */
    private object __method_bind {
      val addFile: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_file" }
        }
      val addIosBundleFile: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_ios_bundle_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ios_bundle_file" }
        }
      val addIosCppCode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_ios_cpp_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ios_cpp_code" }
        }
      val addIosFramework: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_ios_framework".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ios_framework" }
        }
      val addIosLinkerFlags: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_ios_linker_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ios_linker_flags" }
        }
      val addIosPlistContent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_ios_plist_content".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ios_plist_content" }
        }
      val addSharedObject: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_shared_object".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_shared_object" }
        }
      val skip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "skip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skip" }
        }}
  }
}
