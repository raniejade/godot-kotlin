// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
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

open class Resource(
  _handle: COpaquePointer
) : Reference(_handle) {
  var resourceLocalToScene: Boolean
    get() {
       return isLocalToScene() 
    }
    set(value) {
      setLocalToScene(value)
    }

  var resourceName: String
    get() {
       return getName() 
    }
    set(value) {
      setName(value)
    }

  var resourcePath: String
    get() {
       return getPath() 
    }
    set(value) {
      setPath(value)
    }

  fun duplicate(subresources: Boolean): Resource {
    val _arg = Variant.new(subresources)
    val _ret = __method_bind.duplicate.call(this._handle, _arg, 1)
    return _ret.asObject(::Resource)!!
  }

  fun getLocalScene(): Node {
    val _ret = __method_bind.getLocalScene.call(this._handle)
    return _ret.asObject(::Node)!!
  }

  fun getName(): String {
    val _ret = __method_bind.getName.call(this._handle)
    return _ret.asString()
  }

  fun getPath(): String {
    val _ret = __method_bind.getPath.call(this._handle)
    return _ret.asString()
  }

  fun getRid(): RID {
    val _ret = __method_bind.getRid.call(this._handle)
    return _ret.asRID()
  }

  fun isLocalToScene(): Boolean {
    val _ret = __method_bind.isLocalToScene.call(this._handle)
    return _ret.asBoolean()
  }

  fun setLocalToScene(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setLocalToScene.call(this._handle, _arg, 1)
  }

  fun setName(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setName.call(this._handle, _arg, 1)
  }

  fun setPath(path: String) {
    val _arg = Variant.new(path)
    __method_bind.setPath.call(this._handle, _arg, 1)
  }

  fun setupLocalToScene() {
    __method_bind.setupLocalToScene.call(this._handle)
  }

  fun takeOverPath(path: String) {
    val _arg = Variant.new(path)
    __method_bind.takeOverPath.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): Resource = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Resource".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Resource" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Resource(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Resource = Resource(ptr)
    /**
     * Container for method_bind pointers for Resource
     */
    private object __method_bind {
      val duplicate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "duplicate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method duplicate" }
        }
      val getLocalScene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "getLocalScene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLocalScene" }
        }
      val getName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "getName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getName" }
        }
      val getPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "getPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPath" }
        }
      val getRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "getRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRid" }
        }
      val isLocalToScene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "isLocalToScene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isLocalToScene" }
        }
      val setLocalToScene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "setLocalToScene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLocalToScene" }
        }
      val setName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "setName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setName" }
        }
      val setPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "setPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPath" }
        }
      val setupLocalToScene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "setupLocalToScene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setupLocalToScene" }
        }
      val takeOverPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "takeOverPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method takeOverPath" }
        }}
  }
}
