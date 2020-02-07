// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class Resource(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
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

  /**
   * Resource::changed signal
   */
  val signalChanged: Signal0 = Signal0("changed")

  constructor() : this(null) {
    _handle = __new()
  }

  fun duplicate(subresources: Boolean = false): Resource {
    val _arg = Variant(subresources)
    val _ret = __method_bind.duplicate.call(this._handle, listOf(_arg))
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
    val _arg = Variant(enable)
    __method_bind.setLocalToScene.call(this._handle, listOf(_arg))
  }

  fun setName(name: String) {
    val _arg = Variant(name)
    __method_bind.setName.call(this._handle, listOf(_arg))
  }

  fun setPath(path: String) {
    val _arg = Variant(path)
    __method_bind.setPath.call(this._handle, listOf(_arg))
  }

  fun setupLocalToScene() {
    __method_bind.setupLocalToScene.call(this._handle)
  }

  fun takeOverPath(path: String) {
    val _arg = Variant(path)
    __method_bind.takeOverPath.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Resource".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Resource" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
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
            "get_local_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_local_scene" }
        }
      val getName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_name" }
        }
      val getPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "get_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path" }
        }
      val getRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "get_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rid" }
        }
      val isLocalToScene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "is_local_to_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_local_to_scene" }
        }
      val setLocalToScene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "set_local_to_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_local_to_scene" }
        }
      val setName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "set_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_name" }
        }
      val setPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "set_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path" }
        }
      val setupLocalToScene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "setup_local_to_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setup_local_to_scene" }
        }
      val takeOverPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "take_over_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method take_over_path" }
        }}
  }
}
