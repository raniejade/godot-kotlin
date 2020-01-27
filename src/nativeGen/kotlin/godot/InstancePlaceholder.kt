// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
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

open class InstancePlaceholder internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun createInstance(replace: Boolean, customScene: PackedScene): Node {
    val _args = VariantArray.new()
    _args.append(replace)
    _args.append(customScene)
    val _ret = __method_bind.create_instance.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asObject(::Node)!!
  }

  fun getInstancePath(): String {
    val _ret = __method_bind.get_instance_path.call(this.toVariant())
    return _ret.asString()
  }

  fun getStoredValues(withOrder: Boolean): Dictionary {
    val _args = VariantArray.new()
    _args.append(withOrder)
    val _ret = __method_bind.get_stored_values.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asDictionary()
  }

  fun replaceByInstance(customScene: PackedScene) {
    val _args = VariantArray.new()
    _args.append(customScene)
    __method_bind.replace_by_instance.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for InstancePlaceholder
     */
    private object __method_bind {
      val create_instance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InstancePlaceholder".cstr.ptr,
              "create_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_instance" }
            }
          }

      val get_instance_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InstancePlaceholder".cstr.ptr,
              "get_instance_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_instance_path" }
            }
          }

      val get_stored_values: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InstancePlaceholder".cstr.ptr,
              "get_stored_values".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stored_values" }
            }
          }

      val replace_by_instance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InstancePlaceholder".cstr.ptr,
              "replace_by_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method replace_by_instance" }
            }
          }
    }
  }
}
