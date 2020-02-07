// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector3Array
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ConcavePolygonShape(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Shape(null) {
  var data: PoolVector3Array
    get() {
       return getFaces() 
    }
    set(value) {
      setFaces(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for data
   */
  fun data(cb: PoolVector3Array.() -> Unit) {
    val _p = data
    cb(_p)
    data = _p
  }

  fun getFaces(): PoolVector3Array {
    val _ret = __method_bind.getFaces.call(this._handle)
    return _ret.asPoolVector3Array()
  }

  fun setFaces(faces: PoolVector3Array) {
    val _arg = Variant(faces)
    __method_bind.setFaces.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConcavePolygonShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ConcavePolygonShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ConcavePolygonShape
     */
    private object __method_bind {
      val getFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConcavePolygonShape".cstr.ptr,
            "get_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_faces" }
        }
      val setFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConcavePolygonShape".cstr.ptr,
            "set_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_faces" }
        }}
  }
}
