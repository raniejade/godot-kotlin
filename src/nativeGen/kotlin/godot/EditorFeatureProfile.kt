// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorFeatureProfile(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getFeatureName(feature: Int): String {
    val _arg = Variant.new(feature)
    val _ret = __method_bind.get_feature_name.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun isClassDisabled(className: String): Boolean {
    val _arg = Variant.new(className)
    val _ret = __method_bind.is_class_disabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isClassEditorDisabled(className: String): Boolean {
    val _arg = Variant.new(className)
    val _ret = __method_bind.is_class_editor_disabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isClassPropertyDisabled(className: String, arg1: String): Boolean {
    val _args = VariantArray.new()
    _args.append(className)
    _args.append(arg1)
    val _ret = __method_bind.is_class_property_disabled.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun isFeatureDisabled(feature: Int): Boolean {
    val _arg = Variant.new(feature)
    val _ret = __method_bind.is_feature_disabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun loadFromFile(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.load_from_file.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun saveToFile(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.save_to_file.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun setDisableClass(className: String, disable: Boolean) {
    val _args = VariantArray.new()
    _args.append(className)
    _args.append(disable)
    __method_bind.set_disable_class.call(this._handle, _args.toVariant(), 2)
  }

  fun setDisableClassEditor(className: String, disable: Boolean) {
    val _args = VariantArray.new()
    _args.append(className)
    _args.append(disable)
    __method_bind.set_disable_class_editor.call(this._handle, _args.toVariant(), 2)
  }

  fun setDisableClassProperty(
    className: String,
    property: String,
    arg2: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(className)
    _args.append(property)
    _args.append(arg2)
    __method_bind.set_disable_class_property.call(this._handle, _args.toVariant(), 3)
  }

  fun setDisableFeature(feature: Int, disable: Boolean) {
    val _args = VariantArray.new()
    _args.append(feature)
    _args.append(disable)
    __method_bind.set_disable_feature.call(this._handle, _args.toVariant(), 2)
  }

  enum class Feature(
    val value: Int
  ) {
    FEATURE_3D(0),

    FEATURE_SCRIPT(1),

    FEATURE_ASSET_LIB(2),

    FEATURE_SCENE_TREE(3),

    FEATURE_IMPORT_DOCK(4),

    FEATURE_NODE_DOCK(5),

    FEATURE_FILESYSTEM_DOCK(6),

    FEATURE_MAX(7);

    companion object {
      fun from(value: Int): Feature {
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
    val FEATURE_3D: Int = 0

    val FEATURE_ASSET_LIB: Int = 2

    val FEATURE_FILESYSTEM_DOCK: Int = 6

    val FEATURE_IMPORT_DOCK: Int = 4

    val FEATURE_MAX: Int = 7

    val FEATURE_NODE_DOCK: Int = 5

    val FEATURE_SCENE_TREE: Int = 3

    val FEATURE_SCRIPT: Int = 1

    fun new(): EditorFeatureProfile = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorFeatureProfile".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for EditorFeatureProfile" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorFeatureProfile(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): EditorFeatureProfile = EditorFeatureProfile(ptr)
    /**
     * Container for method_bind pointers for EditorFeatureProfile
     */
    private object __method_bind {
      val get_feature_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "get_feature_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feature_name" }
        }
      val is_class_disabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "is_class_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_class_disabled" }
        }
      val is_class_editor_disabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "is_class_editor_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_class_editor_disabled" }
        }
      val is_class_property_disabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "is_class_property_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_class_property_disabled" }
        }
      val is_feature_disabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "is_feature_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_feature_disabled" }
        }
      val load_from_file: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "load_from_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load_from_file" }
        }
      val save_to_file: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "save_to_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save_to_file" }
        }
      val set_disable_class: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "set_disable_class".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_class" }
        }
      val set_disable_class_editor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "set_disable_class_editor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_class_editor" }
        }
      val set_disable_class_property: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "set_disable_class_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_class_property" }
        }
      val set_disable_feature: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "set_disable_feature".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_feature" }
        }}
  }
}
