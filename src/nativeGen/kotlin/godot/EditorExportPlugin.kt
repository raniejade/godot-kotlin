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
    val _ret = __method_bind.add_file.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun addIosBundleFile(path: String) {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.add_ios_bundle_file.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun addIosCppCode(code: String) {
    val _args = VariantArray.new()
    _args.append(code)
    val _ret = __method_bind.add_ios_cpp_code.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun addIosFramework(path: String) {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.add_ios_framework.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun addIosLinkerFlags(flags: String) {
    val _args = VariantArray.new()
    _args.append(flags)
    val _ret = __method_bind.add_ios_linker_flags.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun addIosPlistContent(plistContent: String) {
    val _args = VariantArray.new()
    _args.append(plistContent)
    val _ret = __method_bind.add_ios_plist_content.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun addSharedObject(path: String, tags: PoolStringArray) {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(tags)
    val _ret = __method_bind.add_shared_object.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun skip() {
    val _ret = __method_bind.skip.call(this.toVariant())
    TODO()
  }

  companion object {
    fun new(): EditorExportPlugin = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorExportPlugin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorExportPlugin" }
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
      val add_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
              "add_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_file" }
            }
          }

      val add_ios_bundle_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
              "add_ios_bundle_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_ios_bundle_file" }
            }
          }

      val add_ios_cpp_code: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
              "add_ios_cpp_code".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_ios_cpp_code" }
            }
          }

      val add_ios_framework: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
              "add_ios_framework".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_ios_framework" }
            }
          }

      val add_ios_linker_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
              "add_ios_linker_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_ios_linker_flags" }
            }
          }

      val add_ios_plist_content: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
              "add_ios_plist_content".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_ios_plist_content" }
            }
          }

      val add_shared_object: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
              "add_shared_object".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_shared_object" }
            }
          }

      val skip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
              "skip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method skip" }
            }
          }
    }
  }
}
