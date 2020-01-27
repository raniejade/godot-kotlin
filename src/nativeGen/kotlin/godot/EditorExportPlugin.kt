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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorExportPlugin internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun addFile(
    path: String,
    file: PoolByteArray,
    remap: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(file)
    _args.append(remap)
    __method_bind.add_file.call(this.toVariant(), _args.toVariant(), 3)
  }

  fun addIosBundleFile(path: String) {
    val _arg = Variant.new(path)
    __method_bind.add_ios_bundle_file.call(this.toVariant(), _arg, 1)
  }

  fun addIosCppCode(code: String) {
    val _arg = Variant.new(code)
    __method_bind.add_ios_cpp_code.call(this.toVariant(), _arg, 1)
  }

  fun addIosFramework(path: String) {
    val _arg = Variant.new(path)
    __method_bind.add_ios_framework.call(this.toVariant(), _arg, 1)
  }

  fun addIosLinkerFlags(flags: String) {
    val _arg = Variant.new(flags)
    __method_bind.add_ios_linker_flags.call(this.toVariant(), _arg, 1)
  }

  fun addIosPlistContent(plistContent: String) {
    val _arg = Variant.new(plistContent)
    __method_bind.add_ios_plist_content.call(this.toVariant(), _arg, 1)
  }

  fun addSharedObject(path: String, tags: PoolStringArray) {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(tags)
    __method_bind.add_shared_object.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun skip() {
    __method_bind.skip.call(this.toVariant())
  }

  companion object {
    fun new(): EditorExportPlugin = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorExportPlugin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for EditorExportPlugin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorExportPlugin(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): EditorExportPlugin = EditorExportPlugin(ptr)
    /**
     * Container for method_bind pointers for EditorExportPlugin
     */
    private object __method_bind {
      val add_file: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_file" }
        }
      val add_ios_bundle_file: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_ios_bundle_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ios_bundle_file" }
        }
      val add_ios_cpp_code: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_ios_cpp_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ios_cpp_code" }
        }
      val add_ios_framework: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_ios_framework".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ios_framework" }
        }
      val add_ios_linker_flags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_ios_linker_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ios_linker_flags" }
        }
      val add_ios_plist_content: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "add_ios_plist_content".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_ios_plist_content" }
        }
      val add_shared_object: CPointer<godot_method_bind>
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
