// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
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

open class ClassDBInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun canInstance(`class`: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.canInstance.call(self._handle, listOf(`class`), _retPtr)
      _ret.value
    }
  }

  fun classExists(`class`: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.classExists.call(self._handle, listOf(`class`), _retPtr)
      _ret.value
    }
  }

  fun classGetCategory(`class`: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.classGetCategory.call(self._handle, listOf(`class`), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun classGetIntegerConstant(`class`: String, name: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`class`)
      _args.add(name)
      __method_bind.classGetIntegerConstant.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun classGetIntegerConstantList(`class`: String, noInheritance: Boolean = false):
      PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`class`)
      _args.add(noInheritance)
      __method_bind.classGetIntegerConstantList.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun classGetMethodList(`class`: String, noInheritance: Boolean = false): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`class`)
      _args.add(noInheritance)
      __method_bind.classGetMethodList.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun classGetProperty(`object`: Object, property: String): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(property)
      __method_bind.classGetProperty.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun classGetPropertyList(`class`: String, noInheritance: Boolean = false): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`class`)
      _args.add(noInheritance)
      __method_bind.classGetPropertyList.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun classGetSignal(`class`: String, signal: String): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`class`)
      _args.add(signal)
      __method_bind.classGetSignal.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun classGetSignalList(`class`: String, noInheritance: Boolean = false): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`class`)
      _args.add(noInheritance)
      __method_bind.classGetSignalList.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun classHasIntegerConstant(`class`: String, name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`class`)
      _args.add(name)
      __method_bind.classHasIntegerConstant.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun classHasMethod(
    `class`: String,
    method: String,
    noInheritance: Boolean = false
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`class`)
      _args.add(method)
      _args.add(noInheritance)
      __method_bind.classHasMethod.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun classHasSignal(`class`: String, signal: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`class`)
      _args.add(signal)
      __method_bind.classHasSignal.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun classSetProperty(
    `object`: Object,
    property: String,
    value: Variant
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`object`)
      _args.add(property)
      _args.add(value)
      __method_bind.classSetProperty.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun getClassList(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getClassList.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getInheritersFromClass(`class`: String): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getInheritersFromClass.call(self._handle, listOf(`class`), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getParentClass(`class`: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getParentClass.call(self._handle, listOf(`class`), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun instance(`class`: String): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.instance.call(self._handle, listOf(`class`), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isClassEnabled(`class`: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isClassEnabled.call(self._handle, listOf(`class`), _retPtr)
      _ret.value
    }
  }

  fun isParentClass(`class`: String, inherits: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(`class`)
      _args.add(inherits)
      __method_bind.isParentClass.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for ClassDB
     */
    private object __method_bind {
      val canInstance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "can_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method can_instance" }
            }
          }

      val classExists: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_exists".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_exists" }
            }
          }

      val classGetCategory: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_category".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_get_category" }
            }
          }

      val classGetIntegerConstant: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_integer_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_get_integer_constant" }
            }
          }

      val classGetIntegerConstantList: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_integer_constant_list".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method class_get_integer_constant_list" }
            }
          }

      val classGetMethodList: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_method_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_get_method_list" }
            }
          }

      val classGetProperty: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_get_property" }
            }
          }

      val classGetPropertyList: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_property_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_get_property_list" }
            }
          }

      val classGetSignal: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_get_signal" }
            }
          }

      val classGetSignalList: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_signal_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_get_signal_list" }
            }
          }

      val classHasIntegerConstant: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_has_integer_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_has_integer_constant" }
            }
          }

      val classHasMethod: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_has_method".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_has_method" }
            }
          }

      val classHasSignal: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_has_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_has_signal" }
            }
          }

      val classSetProperty: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_set_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_set_property" }
            }
          }

      val getClassList: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "get_class_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_class_list" }
            }
          }

      val getInheritersFromClass: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "get_inheriters_from_class".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_inheriters_from_class" }
            }
          }

      val getParentClass: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "get_parent_class".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parent_class" }
            }
          }

      val instance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance" }
            }
          }

      val isClassEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "is_class_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_class_enabled" }
            }
          }

      val isParentClass: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "is_parent_class".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_parent_class" }
            }
          }
    }
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
