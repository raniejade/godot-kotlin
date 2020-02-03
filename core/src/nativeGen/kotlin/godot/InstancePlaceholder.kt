// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InstancePlaceholder(
  _handle: COpaquePointer
) : Node(_handle) {
  fun createInstance(replace: Boolean = false, customScene: PackedScene): Node {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(replace))
    _args.add(Variant.fromAny(customScene))
    val _ret = __method_bind.createInstance.call(this._handle, _args)
    return _ret.asObject(::Node)!!
  }

  fun getInstancePath(): String {
    val _ret = __method_bind.getInstancePath.call(this._handle)
    return _ret.asString()
  }

  fun getStoredValues(withOrder: Boolean = false): Dictionary {
    val _arg = Variant.new(withOrder)
    val _ret = __method_bind.getStoredValues.call(this._handle, listOf(_arg))
    return _ret.asDictionary()
  }

  fun replaceByInstance(customScene: PackedScene) {
    val _arg = Variant.new(customScene)
    __method_bind.replaceByInstance.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for InstancePlaceholder
     */
    private object __method_bind {
      val createInstance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InstancePlaceholder".cstr.ptr,
            "create_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_instance" }
        }
      val getInstancePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InstancePlaceholder".cstr.ptr,
            "get_instance_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance_path" }
        }
      val getStoredValues: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InstancePlaceholder".cstr.ptr,
            "get_stored_values".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stored_values" }
        }
      val replaceByInstance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InstancePlaceholder".cstr.ptr,
            "replace_by_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method replace_by_instance" }
        }}
  }
}
