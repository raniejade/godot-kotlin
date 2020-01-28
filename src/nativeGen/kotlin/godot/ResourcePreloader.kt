// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
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

open class ResourcePreloader(
  _handle: COpaquePointer
) : Node(_handle) {
  var resources: VariantArray
    get() {
       return _getResources() 
    }
    set(value) {
      _setResources(value)
    }

  fun addResource(name: String, resource: Resource) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(resource)
    __method_bind.addResource.call(this._handle, _args.toVariant(), 2)
  }

  fun getResource(name: String): Resource {
    val _arg = Variant.new(name)
    val _ret = __method_bind.getResource.call(this._handle, _arg, 1)
    return _ret.asObject(::Resource)!!
  }

  fun getResourceList(): PoolStringArray {
    val _ret = __method_bind.getResourceList.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun hasResource(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.hasResource.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun removeResource(name: String) {
    val _arg = Variant.new(name)
    __method_bind.removeResource.call(this._handle, _arg, 1)
  }

  fun renameResource(name: String, newname: String) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(newname)
    __method_bind.renameResource.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    fun new(): ResourcePreloader = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ResourcePreloader".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ResourcePreloader" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ResourcePreloader(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ResourcePreloader = ResourcePreloader(ptr)
    /**
     * Container for method_bind pointers for ResourcePreloader
     */
    private object __method_bind {
      val addResource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
            "addResource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addResource" }
        }
      val getResource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
            "getResource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getResource" }
        }
      val getResourceList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
            "getResourceList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getResourceList" }
        }
      val hasResource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
            "hasResource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasResource" }
        }
      val removeResource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
            "removeResource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeResource" }
        }
      val renameResource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ResourcePreloader".cstr.ptr,
            "renameResource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method renameResource" }
        }}
  }
}
