// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
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

open class EditorFeatureProfile(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getFeatureName(feature: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getFeatureName.call(self._handle, listOf(feature), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun isClassDisabled(className: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isClassDisabled.call(self._handle, listOf(className), _retPtr)
      _ret.value
    }
  }

  fun isClassEditorDisabled(className: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isClassEditorDisabled.call(self._handle, listOf(className), _retPtr)
      _ret.value
    }
  }

  fun isClassPropertyDisabled(className: String, property: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(className)
      _args.add(property)
      __method_bind.isClassPropertyDisabled.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun isFeatureDisabled(feature: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isFeatureDisabled.call(self._handle, listOf(feature), _retPtr)
      _ret.value
    }
  }

  fun loadFromFile(path: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.loadFromFile.call(self._handle, listOf(path), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun saveToFile(path: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.saveToFile.call(self._handle, listOf(path), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setDisableClass(className: String, disable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(className)
      _args.add(disable)
      __method_bind.setDisableClass.call(self._handle, _args, null)
    }
  }

  fun setDisableClassEditor(className: String, disable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(className)
      _args.add(disable)
      __method_bind.setDisableClassEditor.call(self._handle, _args, null)
    }
  }

  fun setDisableClassProperty(
    className: String,
    property: String,
    disable: Boolean
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(className)
      _args.add(property)
      _args.add(disable)
      __method_bind.setDisableClassProperty.call(self._handle, _args, null)
    }
  }

  fun setDisableFeature(feature: Int, disable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(feature)
      _args.add(disable)
      __method_bind.setDisableFeature.call(self._handle, _args, null)
    }
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
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "get_feature_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_feature_name" }
        }
      val isClassDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "is_class_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_class_disabled" }
        }
      val isClassEditorDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "is_class_editor_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_class_editor_disabled" }
        }
      val isClassPropertyDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "is_class_property_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_class_property_disabled" }
        }
      val isFeatureDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "is_feature_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_feature_disabled" }
        }
      val loadFromFile: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "load_from_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load_from_file" }
        }
      val saveToFile: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "save_to_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save_to_file" }
        }
      val setDisableClass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "set_disable_class".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_class" }
        }
      val setDisableClassEditor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "set_disable_class_editor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_class_editor" }
        }
      val setDisableClassProperty: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "set_disable_class_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_class_property" }
        }
      val setDisableFeature: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorFeatureProfile".cstr.ptr,
            "set_disable_feature".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disable_feature" }
        }}
  }
}
