// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PhysicsShapeQueryResult(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getResultCount(): Int {
    val _ret = __method_bind.getResultCount.call(this._handle)
    return _ret.asInt()
  }

  fun getResultObject(idx: Int): Object {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getResultObject.call(this._handle, _arg, 1)
    return _ret.asObject(::Object)!!
  }

  fun getResultObjectId(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getResultObjectId.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getResultObjectShape(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getResultObjectShape.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getResultRid(idx: Int): RID {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getResultRid.call(this._handle, _arg, 1)
    return _ret.asRID()
  }

  companion object {
    /**
     * Container for method_bind pointers for PhysicsShapeQueryResult
     */
    private object __method_bind {
      val getResultCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryResult".cstr.ptr,
            "getResultCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getResultCount" }
        }
      val getResultObject: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryResult".cstr.ptr,
            "getResultObject".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getResultObject" }
        }
      val getResultObjectId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryResult".cstr.ptr,
            "getResultObjectId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getResultObjectId" }
        }
      val getResultObjectShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryResult".cstr.ptr,
            "getResultObjectShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getResultObjectShape" }
        }
      val getResultRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsShapeQueryResult".cstr.ptr,
            "getResultRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getResultRid" }
        }}
  }
}
