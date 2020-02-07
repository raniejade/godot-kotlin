// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.PoolStringArray
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

open class EditorExportPlugin(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun addFile(
    path: String,
    file: PoolByteArray,
    remap: Boolean
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(file))
    _args.add(Variant.fromAny(remap))
    __method_bind.addFile.call(this._handle, _args)
  }

  fun addIosBundleFile(path: String) {
    val _arg = Variant.new(path)
    __method_bind.addIosBundleFile.call(this._handle, listOf(_arg))
  }

  fun addIosCppCode(code: String) {
    val _arg = Variant.new(code)
    __method_bind.addIosCppCode.call(this._handle, listOf(_arg))
  }

  fun addIosFramework(path: String) {
    val _arg = Variant.new(path)
    __method_bind.addIosFramework.call(this._handle, listOf(_arg))
  }

  fun addIosLinkerFlags(flags: String) {
    val _arg = Variant.new(flags)
    __method_bind.addIosLinkerFlags.call(this._handle, listOf(_arg))
  }

  fun addIosPlistContent(plistContent: String) {
    val _arg = Variant.new(plistContent)
    __method_bind.addIosPlistContent.call(this._handle, listOf(_arg))
  }

  fun addSharedObject(path: String, tags: PoolStringArray) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(tags))
    __method_bind.addSharedObject.call(this._handle, _args)
  }

  fun skip() {
    __method_bind.skip.call(this._handle)
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorExportPlugin
     */
    private object __method_bind {
      val addFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_file" }
        }
      val addIosBundleFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_ios_bundle_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ios_bundle_file" }
        }
      val addIosCppCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_ios_cpp_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ios_cpp_code" }
        }
      val addIosFramework: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_ios_framework".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ios_framework" }
        }
      val addIosLinkerFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_ios_linker_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ios_linker_flags" }
        }
      val addIosPlistContent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_ios_plist_content".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ios_plist_content" }
        }
      val addSharedObject: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_shared_object".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_shared_object" }
        }
      val skip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "skip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skip" }
        }}
  }
}
