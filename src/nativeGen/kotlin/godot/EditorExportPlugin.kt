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

open class EditorExportPlugin(
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
    __method_bind.addFile.call(this._handle, _args.toVariant(), 3)
  }

  fun addIosBundleFile(path: String) {
    val _arg = Variant.new(path)
    __method_bind.addIosBundleFile.call(this._handle, _arg, 1)
  }

  fun addIosCppCode(code: String) {
    val _arg = Variant.new(code)
    __method_bind.addIosCppCode.call(this._handle, _arg, 1)
  }

  fun addIosFramework(path: String) {
    val _arg = Variant.new(path)
    __method_bind.addIosFramework.call(this._handle, _arg, 1)
  }

  fun addIosLinkerFlags(flags: String) {
    val _arg = Variant.new(flags)
    __method_bind.addIosLinkerFlags.call(this._handle, _arg, 1)
  }

  fun addIosPlistContent(plistContent: String) {
    val _arg = Variant.new(plistContent)
    __method_bind.addIosPlistContent.call(this._handle, _arg, 1)
  }

  fun addSharedObject(path: String, tags: PoolStringArray) {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(tags)
    __method_bind.addSharedObject.call(this._handle, _args.toVariant(), 2)
  }

  fun skip() {
    __method_bind.skip.call(this._handle)
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
      val addFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "addFile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addFile" }
        }
      val addIosBundleFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "addIosBundleFile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addIosBundleFile" }
        }
      val addIosCppCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "addIosCppCode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addIosCppCode" }
        }
      val addIosFramework: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "addIosFramework".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addIosFramework" }
        }
      val addIosLinkerFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "addIosLinkerFlags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addIosLinkerFlags" }
        }
      val addIosPlistContent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "addIosPlistContent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addIosPlistContent" }
        }
      val addSharedObject: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorExportPlugin".cstr.ptr,
            "addSharedObject".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addSharedObject" }
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
