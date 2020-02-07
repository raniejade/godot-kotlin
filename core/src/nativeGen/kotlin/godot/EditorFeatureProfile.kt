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
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorFeatureProfile(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun getFeatureName(feature: Int): String {
    val _arg = Variant.new(feature)
    val _ret = __method_bind.getFeatureName.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun isClassDisabled(className: String): Boolean {
    val _arg = Variant.new(className)
    val _ret = __method_bind.isClassDisabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isClassEditorDisabled(className: String): Boolean {
    val _arg = Variant.new(className)
    val _ret = __method_bind.isClassEditorDisabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isClassPropertyDisabled(className: String, property: String): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(className))
    _args.add(Variant.fromAny(property))
    val _ret = __method_bind.isClassPropertyDisabled.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun isFeatureDisabled(feature: Int): Boolean {
    val _arg = Variant.new(feature)
    val _ret = __method_bind.isFeatureDisabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun loadFromFile(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.loadFromFile.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun saveToFile(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.saveToFile.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun setDisableClass(className: String, disable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(className))
    _args.add(Variant.fromAny(disable))
    __method_bind.setDisableClass.call(this._handle, _args)
  }

  fun setDisableClassEditor(className: String, disable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(className))
    _args.add(Variant.fromAny(disable))
    __method_bind.setDisableClassEditor.call(this._handle, _args)
  }

  fun setDisableClassProperty(
    className: String,
    property: String,
    disable: Boolean
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(className))
    _args.add(Variant.fromAny(property))
    _args.add(Variant.fromAny(disable))
    __method_bind.setDisableClassProperty.call(this._handle, _args)
  }

  fun setDisableFeature(feature: Int, disable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(feature))
    _args.add(Variant.fromAny(disable))
    __method_bind.setDisableFeature.call(this._handle, _args)
  }

  enum class Feature(
    val value: Int
  ) {
    `3D`(0),

    SCRIPT(1),

    ASSET_LIB(2),

    SCENE_TREE(3),

    IMPORT_DOCK(4),

    NODE_DOCK(5),

    FILESYSTEM_DOCK(6),

    MAX(7);

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
    /**
     * Container for method_bind pointers for EditorFeatureProfile
     */
    private object __method_bind {
      val getFeatureName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "get_feature_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feature_name" }
        }
      val isClassDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "is_class_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_class_disabled" }
        }
      val isClassEditorDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "is_class_editor_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_class_editor_disabled" }
        }
      val isClassPropertyDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "is_class_property_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_class_property_disabled" }
        }
      val isFeatureDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "is_feature_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_feature_disabled" }
        }
      val loadFromFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "load_from_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load_from_file" }
        }
      val saveToFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "save_to_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save_to_file" }
        }
      val setDisableClass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "set_disable_class".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_class" }
        }
      val setDisableClassEditor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "set_disable_class_editor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_class_editor" }
        }
      val setDisableClassProperty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "set_disable_class_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_class_property" }
        }
      val setDisableFeature: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "set_disable_feature".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_feature" }
        }}
  }
}
