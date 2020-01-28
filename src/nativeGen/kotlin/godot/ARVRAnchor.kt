// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Plane
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
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

open class ARVRAnchor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var anchorId: Int
    get() {
       return getAnchorId() 
    }
    set(value) {
      setAnchorId(value)
    }

  fun getAnchorId(): Int {
    val _ret = __method_bind.getAnchorId.call(this._handle)
    return _ret.asInt()
  }

  fun getAnchorName(): String {
    val _ret = __method_bind.getAnchorName.call(this._handle)
    return _ret.asString()
  }

  fun getIsActive(): Boolean {
    val _ret = __method_bind.getIsActive.call(this._handle)
    return _ret.asBoolean()
  }

  fun getMesh(): Mesh {
    val _ret = __method_bind.getMesh.call(this._handle)
    return _ret.asObject(::Mesh)!!
  }

  fun getPlane(): Plane {
    val _ret = __method_bind.getPlane.call(this._handle)
    return _ret.asPlane()
  }

  fun getSize(): Vector3 {
    val _ret = __method_bind.getSize.call(this._handle)
    return _ret.asVector3()
  }

  fun setAnchorId(anchorId: Int) {
    val _arg = Variant.new(anchorId)
    __method_bind.setAnchorId.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): ARVRAnchor = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ARVRAnchor".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ARVRAnchor" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ARVRAnchor(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ARVRAnchor = ARVRAnchor(ptr)
    /**
     * Container for method_bind pointers for ARVRAnchor
     */
    private object __method_bind {
      val getAnchorId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
            "getAnchorId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAnchorId" }
        }
      val getAnchorName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
            "getAnchorName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAnchorName" }
        }
      val getIsActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
            "getIsActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIsActive" }
        }
      val getMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
            "getMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMesh" }
        }
      val getPlane: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
            "getPlane".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPlane" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
            "getSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSize" }
        }
      val setAnchorId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVRAnchor".cstr.ptr,
            "setAnchorId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAnchorId" }
        }}
  }
}
