// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
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

open class _ClassDB internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun canInstance(`class`: String): Boolean {
    TODO()
  }

  fun classExists(`class`: String): Boolean {
    TODO()
  }

  fun classGetCategory(`class`: String): String {
    TODO()
  }

  fun classGetIntegerConstant(`class`: String, name: String): Int {
    TODO()
  }

  fun classGetIntegerConstantList(`class`: String, no_inheritance: Boolean): PoolStringArray {
    TODO()
  }

  fun classGetMethodList(`class`: String, no_inheritance: Boolean): VariantArray {
    TODO()
  }

  fun classGetProperty(`object`: Object, property: String): Variant {
    TODO()
  }

  fun classGetPropertyList(`class`: String, no_inheritance: Boolean): VariantArray {
    TODO()
  }

  fun classGetSignal(`class`: String, signal: String): Dictionary {
    TODO()
  }

  fun classGetSignalList(`class`: String, no_inheritance: Boolean): VariantArray {
    TODO()
  }

  fun classHasIntegerConstant(`class`: String, name: String): Boolean {
    TODO()
  }

  fun classHasMethod(
    `class`: String,
    method: String,
    no_inheritance: Boolean
  ): Boolean {
    TODO()
  }

  fun classHasSignal(`class`: String, signal: String): Boolean {
    TODO()
  }

  fun classSetProperty(
    `object`: Object,
    property: String,
    value: Variant
  ): Error {
    TODO()
  }

  fun getClassList(): PoolStringArray {
    TODO()
  }

  fun getInheritersFromClass(`class`: String): PoolStringArray {
    TODO()
  }

  fun getParentClass(`class`: String): String {
    TODO()
  }

  fun instance(`class`: String): Variant {
    TODO()
  }

  fun isClassEnabled(`class`: String): Boolean {
    TODO()
  }

  fun isParentClass(`class`: String, inherits: String): Boolean {
    TODO()
  }

  companion object {
    val Instance: _ClassDB = memScoped {
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
      val can_instance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "can_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method can_instance" }
            }
          }

      val class_exists: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_exists".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_exists" }
            }
          }

      val class_get_category: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_category".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_get_category" }
            }
          }

      val class_get_integer_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_integer_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_get_integer_constant" }
            }
          }

      val class_get_integer_constant_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_integer_constant_list".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method class_get_integer_constant_list" }
            }
          }

      val class_get_method_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_method_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_get_method_list" }
            }
          }

      val class_get_property: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_get_property" }
            }
          }

      val class_get_property_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_property_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_get_property_list" }
            }
          }

      val class_get_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_get_signal" }
            }
          }

      val class_get_signal_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_get_signal_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_get_signal_list" }
            }
          }

      val class_has_integer_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_has_integer_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_has_integer_constant" }
            }
          }

      val class_has_method: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_has_method".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_has_method" }
            }
          }

      val class_has_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_has_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_has_signal" }
            }
          }

      val class_set_property: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "class_set_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method class_set_property" }
            }
          }

      val get_class_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "get_class_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_class_list" }
            }
          }

      val get_inheriters_from_class: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "get_inheriters_from_class".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_inheriters_from_class" }
            }
          }

      val get_parent_class: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "get_parent_class".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parent_class" }
            }
          }

      val instance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method instance" }
            }
          }

      val is_class_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "is_class_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_class_enabled" }
            }
          }

      val is_parent_class: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ClassDB".cstr.ptr,
              "is_parent_class".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_parent_class" }
            }
          }
    }
  }
}
