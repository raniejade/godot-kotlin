// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun duplicate(subresources: Boolean = false): Resource {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Resource
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.duplicate.call(self._handle, listOf(subresources), _retPtr)
      _ret = objectToType<Resource>(_tmp.value!!)
      _ret
    }
  }

  fun getLocalScene(): Node {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Node
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getLocalScene.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Node>(_tmp.value!!)
      _ret
    }
  }

  fun getName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getPath(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getPath.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getRid(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getRid.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isLocalToScene(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isLocalToScene.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setLocalToScene(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLocalToScene.call(self._handle, listOf(enable), null)
    }
  }

  fun setName(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setName.call(self._handle, listOf(name), null)
    }
  }

  fun setPath(path: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPath.call(self._handle, listOf(path), null)
    }
  }

  fun setupLocalToScene() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setupLocalToScene.call(self._handle, emptyList(), null)
    }
  }

  fun takeOverPath(path: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.takeOverPath.call(self._handle, listOf(path), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "duplicate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method duplicate" }
        }
      val getLocalScene: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "get_local_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_local_scene" }
        }
      val getName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_name" }
        }
      val getPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "get_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path" }
        }
      val getRid: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "get_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rid" }
        }
      val isLocalToScene: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "is_local_to_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_local_to_scene" }
        }
      val setLocalToScene: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "set_local_to_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_local_to_scene" }
        }
      val setName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "set_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_name" }
        }
      val setPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "set_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path" }
        }
      val setupLocalToScene: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "setup_local_to_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setup_local_to_scene" }
        }
      val takeOverPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Resource".cstr.ptr,
            "take_over_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method take_over_path" }
        }}
  }
}
