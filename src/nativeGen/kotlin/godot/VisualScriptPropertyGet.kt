// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptPropertyGet internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getBasePath(): NodePath {
    val _ret = __method_bind.get_base_path.call(this.toVariant())
    TODO()
  }

  fun getBaseScript(): String {
    val _ret = __method_bind.get_base_script.call(this.toVariant())
    TODO()
  }

  fun getBaseType(): String {
    val _ret = __method_bind.get_base_type.call(this.toVariant())
    TODO()
  }

  fun getBasicType(): Variant.Type {
    val _ret = __method_bind.get_basic_type.call(this.toVariant())
    TODO()
  }

  fun getCallMode(): CallMode {
    val _ret = __method_bind.get_call_mode.call(this.toVariant())
    TODO()
  }

  fun getIndex(): String {
    val _ret = __method_bind.get_index.call(this.toVariant())
    TODO()
  }

  fun getProperty(): String {
    val _ret = __method_bind.get_property.call(this.toVariant())
    TODO()
  }

  fun setBasePath(basePath: NodePath) {
    val _args = VariantArray.new()
    _args.append(basePath)
    val _ret = __method_bind.set_base_path.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBaseScript(baseScript: String) {
    val _args = VariantArray.new()
    _args.append(baseScript)
    val _ret = __method_bind.set_base_script.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBaseType(baseType: String) {
    val _args = VariantArray.new()
    _args.append(baseType)
    val _ret = __method_bind.set_base_type.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBasicType(basicType: Int) {
    val _args = VariantArray.new()
    _args.append(basicType)
    val _ret = __method_bind.set_basic_type.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCallMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    val _ret = __method_bind.set_call_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setIndex(index: String) {
    val _args = VariantArray.new()
    _args.append(index)
    val _ret = __method_bind.set_index.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setProperty(property: String) {
    val _args = VariantArray.new()
    _args.append(property)
    val _ret = __method_bind.set_property.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  enum class CallMode(
    val value: Int
  ) {
    CALL_MODE_SELF(0),

    CALL_MODE_NODE_PATH(1),

    CALL_MODE_INSTANCE(2);

    companion object {
      fun from(value: Int): CallMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val CALL_MODE_INSTANCE: Int = 2

    val CALL_MODE_NODE_PATH: Int = 1

    val CALL_MODE_SELF: Int = 0

    fun new(): VisualScriptPropertyGet = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptPropertyGet".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptPropertyGet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptPropertyGet(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptPropertyGet = VisualScriptPropertyGet(ptr)
    /**
     * Container for method_bind pointers for VisualScriptPropertyGet
     */
    private object __method_bind {
      val get_base_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
              "get_base_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_path" }
            }
          }

      val get_base_script: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
              "get_base_script".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_script" }
            }
          }

      val get_base_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
              "get_base_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_type" }
            }
          }

      val get_basic_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
              "get_basic_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_basic_type" }
            }
          }

      val get_call_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
              "get_call_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_call_mode" }
            }
          }

      val get_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
              "get_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_index" }
            }
          }

      val get_property: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
              "get_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_property" }
            }
          }

      val set_base_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
              "set_base_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_path" }
            }
          }

      val set_base_script: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
              "set_base_script".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_script" }
            }
          }

      val set_base_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
              "set_base_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_type" }
            }
          }

      val set_basic_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
              "set_basic_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_basic_type" }
            }
          }

      val set_call_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
              "set_call_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_call_mode" }
            }
          }

      val set_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
              "set_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_index" }
            }
          }

      val set_property: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertyGet".cstr.ptr,
              "set_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_property" }
            }
          }
    }
  }
}
