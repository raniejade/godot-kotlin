// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolStringArray
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

open class _ClassDB(
  _handle: COpaquePointer
) : Object(_handle) {
  fun canInstance(`class`: String): Boolean {
    val _arg = Variant.new(`class`)
    val _ret = __method_bind.canInstance.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun classExists(`class`: String): Boolean {
    val _arg = Variant.new(`class`)
    val _ret = __method_bind.classExists.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun classGetCategory(`class`: String): String {
    val _arg = Variant.new(`class`)
    val _ret = __method_bind.classGetCategory.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun classGetIntegerConstant(`class`: String, name: String): Int {
    val _args = VariantArray.new()
    _args.append(`class`)
    _args.append(name)
    val _ret = __method_bind.classGetIntegerConstant.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun classGetIntegerConstantList(`class`: String, noInheritance: Boolean): PoolStringArray {
    val _args = VariantArray.new()
    _args.append(`class`)
    _args.append(noInheritance)
    val _ret = __method_bind.classGetIntegerConstantList.call(this._handle, _args.toVariant(), 2)
    return _ret.asPoolStringArray()
  }

  fun classGetMethodList(`class`: String, noInheritance: Boolean): VariantArray {
    val _args = VariantArray.new()
    _args.append(`class`)
    _args.append(noInheritance)
    val _ret = __method_bind.classGetMethodList.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  fun classGetProperty(`object`: Object, property: String): Variant {
    val _args = VariantArray.new()
    _args.append(`object`)
    _args.append(property)
    val _ret = __method_bind.classGetProperty.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun classGetPropertyList(`class`: String, noInheritance: Boolean): VariantArray {
    val _args = VariantArray.new()
    _args.append(`class`)
    _args.append(noInheritance)
    val _ret = __method_bind.classGetPropertyList.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  fun classGetSignal(`class`: String, signal: String): Dictionary {
    val _args = VariantArray.new()
    _args.append(`class`)
    _args.append(signal)
    val _ret = __method_bind.classGetSignal.call(this._handle, _args.toVariant(), 2)
    return _ret.asDictionary()
  }

  fun classGetSignalList(`class`: String, noInheritance: Boolean): VariantArray {
    val _args = VariantArray.new()
    _args.append(`class`)
    _args.append(noInheritance)
    val _ret = __method_bind.classGetSignalList.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  fun classHasIntegerConstant(`class`: String, name: String): Boolean {
    val _args = VariantArray.new()
    _args.append(`class`)
    _args.append(name)
    val _ret = __method_bind.classHasIntegerConstant.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun classHasMethod(
    `class`: String,
    method: String,
    noInheritance: Boolean
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(`class`)
    _args.append(method)
    _args.append(noInheritance)
    val _ret = __method_bind.classHasMethod.call(this._handle, _args.toVariant(), 3)
    return _ret.asBoolean()
  }

  fun classHasSignal(`class`: String, signal: String): Boolean {
    val _args = VariantArray.new()
    _args.append(`class`)
    _args.append(signal)
    val _ret = __method_bind.classHasSignal.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun classSetProperty(
    `object`: Object,
    property: String,
    value: Variant
  ): GDError {
    val _args = VariantArray.new()
    _args.append(`object`)
    _args.append(property)
    _args.append(value)
    val _ret = __method_bind.classSetProperty.call(this._handle, _args.toVariant(), 3)
    return GDError.from(_ret.asInt())
  }

  fun getClassList(): PoolStringArray {
    val _ret = __method_bind.getClassList.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getInheritersFromClass(`class`: String): PoolStringArray {
    val _arg = Variant.new(`class`)
    val _ret = __method_bind.getInheritersFromClass.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun getParentClass(`class`: String): String {
    val _arg = Variant.new(`class`)
    val _ret = __method_bind.getParentClass.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun instance(`class`: String): Variant {
    val _arg = Variant.new(`class`)
    val _ret = __method_bind.instance.call(this._handle, _arg, 1)
    return _ret
  }

  fun isClassEnabled(`class`: String): Boolean {
    val _arg = Variant.new(`class`)
    val _ret = __method_bind.isClassEnabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isParentClass(`class`: String, inherits: String): Boolean {
    val _args = VariantArray.new()
    _args.append(`class`)
    _args.append(inherits)
    val _ret = __method_bind.isParentClass.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  companion object {
    val Instance: _ClassDB
      get() = memScoped {
        val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("_ClassDB".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton _ClassDB" }
        _ClassDB(
          handle
        )
      }
    /**
     * Container for method_bind pointers for _ClassDB
     */
    private object __method_bind {
      val canInstance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "canInstance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canInstance" }
        }
      val classExists: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "classExists".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method classExists" }
        }
      val classGetCategory: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "classGetCategory".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method classGetCategory" }
        }
      val classGetIntegerConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "classGetIntegerConstant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method classGetIntegerConstant" }
        }
      val classGetIntegerConstantList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "classGetIntegerConstantList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method classGetIntegerConstantList" }
        }
      val classGetMethodList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "classGetMethodList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method classGetMethodList" }
        }
      val classGetProperty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "classGetProperty".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method classGetProperty" }
        }
      val classGetPropertyList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "classGetPropertyList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method classGetPropertyList" }
        }
      val classGetSignal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "classGetSignal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method classGetSignal" }
        }
      val classGetSignalList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "classGetSignalList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method classGetSignalList" }
        }
      val classHasIntegerConstant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "classHasIntegerConstant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method classHasIntegerConstant" }
        }
      val classHasMethod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "classHasMethod".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method classHasMethod" }
        }
      val classHasSignal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "classHasSignal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method classHasSignal" }
        }
      val classSetProperty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "classSetProperty".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method classSetProperty" }
        }
      val getClassList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "getClassList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClassList" }
        }
      val getInheritersFromClass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "getInheritersFromClass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInheritersFromClass" }
        }
      val getParentClass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "getParentClass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParentClass" }
        }
      val instance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance" }
        }
      val isClassEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "isClassEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isClassEnabled" }
        }
      val isParentClass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
            "isParentClass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isParentClass" }
        }}
  }
}
