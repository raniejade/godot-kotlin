// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolStringArray
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

open class ClassDBInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun canInstance(`class`: String): Boolean {
    val _arg = Variant(`class`)
    val _ret = __method_bind.canInstance.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun classExists(`class`: String): Boolean {
    val _arg = Variant(`class`)
    val _ret = __method_bind.classExists.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun classGetCategory(`class`: String): String {
    val _arg = Variant(`class`)
    val _ret = __method_bind.classGetCategory.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun classGetIntegerConstant(`class`: String, name: String): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`class`))
    _args.add(Variant.fromAny(name))
    val _ret = __method_bind.classGetIntegerConstant.call(this._handle, _args)
    return _ret.asInt()
  }

  fun classGetIntegerConstantList(`class`: String, noInheritance: Boolean = false):
      PoolStringArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`class`))
    _args.add(Variant.fromAny(noInheritance))
    val _ret = __method_bind.classGetIntegerConstantList.call(this._handle, _args)
    return _ret.asPoolStringArray()
  }

  fun classGetMethodList(`class`: String, noInheritance: Boolean = false): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`class`))
    _args.add(Variant.fromAny(noInheritance))
    val _ret = __method_bind.classGetMethodList.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun classGetProperty(`object`: Object, property: String): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(property))
    val _ret = __method_bind.classGetProperty.call(this._handle, _args)
    return _ret
  }

  fun classGetPropertyList(`class`: String, noInheritance: Boolean = false): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`class`))
    _args.add(Variant.fromAny(noInheritance))
    val _ret = __method_bind.classGetPropertyList.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun classGetSignal(`class`: String, signal: String): Dictionary {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`class`))
    _args.add(Variant.fromAny(signal))
    val _ret = __method_bind.classGetSignal.call(this._handle, _args)
    return _ret.asDictionary()
  }

  fun classGetSignalList(`class`: String, noInheritance: Boolean = false): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`class`))
    _args.add(Variant.fromAny(noInheritance))
    val _ret = __method_bind.classGetSignalList.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun classHasIntegerConstant(`class`: String, name: String): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`class`))
    _args.add(Variant.fromAny(name))
    val _ret = __method_bind.classHasIntegerConstant.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun classHasMethod(
    `class`: String,
    method: String,
    noInheritance: Boolean = false
  ): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`class`))
    _args.add(Variant.fromAny(method))
    _args.add(Variant.fromAny(noInheritance))
    val _ret = __method_bind.classHasMethod.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun classHasSignal(`class`: String, signal: String): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`class`))
    _args.add(Variant.fromAny(signal))
    val _ret = __method_bind.classHasSignal.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun classSetProperty(
    `object`: Object,
    property: String,
    value: Variant
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`object`))
    _args.add(Variant.fromAny(property))
    _args.add(Variant.fromAny(value))
    val _ret = __method_bind.classSetProperty.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun getClassList(): PoolStringArray {
    val _ret = __method_bind.getClassList.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getInheritersFromClass(`class`: String): PoolStringArray {
    val _arg = Variant(`class`)
    val _ret = __method_bind.getInheritersFromClass.call(this._handle, listOf(_arg))
    return _ret.asPoolStringArray()
  }

  fun getParentClass(`class`: String): String {
    val _arg = Variant(`class`)
    val _ret = __method_bind.getParentClass.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun instance(`class`: String): Variant {
    val _arg = Variant(`class`)
    val _ret = __method_bind.instance.call(this._handle, listOf(_arg))
    return _ret
  }

  fun isClassEnabled(`class`: String): Boolean {
    val _arg = Variant(`class`)
    val _ret = __method_bind.isClassEnabled.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isParentClass(`class`: String, inherits: String): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(`class`))
    _args.add(Variant.fromAny(inherits))
    val _ret = __method_bind.isParentClass.call(this._handle, _args)
    return _ret.asBoolean()
  }

  companion object {
    /**
     * Container for method_bind pointers for ClassDB
     */
    private object __method_bind {
      val canInstance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "can_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_instance" }
        }
      val classExists: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "class_exists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method class_exists" }
        }
      val classGetCategory: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "class_get_category".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method class_get_category" }
        }
      val classGetIntegerConstant: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "class_get_integer_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method class_get_integer_constant" }
        }
      val classGetIntegerConstantList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "class_get_integer_constant_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method class_get_integer_constant_list" }
        }
      val classGetMethodList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "class_get_method_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method class_get_method_list" }
        }
      val classGetProperty: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "class_get_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method class_get_property" }
        }
      val classGetPropertyList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "class_get_property_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method class_get_property_list" }
        }
      val classGetSignal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "class_get_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method class_get_signal" }
        }
      val classGetSignalList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "class_get_signal_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method class_get_signal_list" }
        }
      val classHasIntegerConstant: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "class_has_integer_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method class_has_integer_constant" }
        }
      val classHasMethod: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "class_has_method".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method class_has_method" }
        }
      val classHasSignal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "class_has_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method class_has_signal" }
        }
      val classSetProperty: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "class_set_property".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method class_set_property" }
        }
      val getClassList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "get_class_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_class_list" }
        }
      val getInheritersFromClass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "get_inheriters_from_class".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_inheriters_from_class" }
        }
      val getParentClass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "get_parent_class".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent_class" }
        }
      val instance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance" }
        }
      val isClassEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "is_class_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_class_enabled" }
        }
      val isParentClass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "is_parent_class".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_parent_class" }
        }}
  }
}

object ClassDB : ClassDBInternal(null) {
  init {
    Allocator.allocationScope {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("ClassDB".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton ClassDB" }
      _handle = handle
    }
  }
}
