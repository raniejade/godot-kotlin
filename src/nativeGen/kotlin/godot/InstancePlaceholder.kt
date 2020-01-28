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

open class InstancePlaceholder(
  _handle: COpaquePointer
) : Node(_handle) {
  fun createInstance(replace: Boolean, customScene: PackedScene): Node {
    val _args = VariantArray.new()
    _args.append(replace)
    _args.append(customScene)
    val _ret = __method_bind.createInstance.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Node)!!
  }

  fun getInstancePath(): String {
    val _ret = __method_bind.getInstancePath.call(this._handle)
    return _ret.asString()
  }

  fun getStoredValues(withOrder: Boolean): Dictionary {
    val _arg = Variant.new(withOrder)
    val _ret = __method_bind.getStoredValues.call(this._handle, _arg, 1)
    return _ret.asDictionary()
  }

  fun replaceByInstance(customScene: PackedScene) {
    val _arg = Variant.new(customScene)
    __method_bind.replaceByInstance.call(this._handle, _arg, 1)
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
            "createInstance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createInstance" }
        }
      val getInstancePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InstancePlaceholder".cstr.ptr,
            "getInstancePath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInstancePath" }
        }
      val getStoredValues: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InstancePlaceholder".cstr.ptr,
            "getStoredValues".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStoredValues" }
        }
      val replaceByInstance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InstancePlaceholder".cstr.ptr,
            "replaceByInstance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method replaceByInstance" }
        }}
  }
}
