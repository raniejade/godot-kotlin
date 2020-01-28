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

open class Skeleton2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getBone(idx: Int): Bone2D {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getBone.call(this._handle, _arg, 1)
    return _ret.asObject(::Bone2D)!!
  }

  fun getBoneCount(): Int {
    val _ret = __method_bind.getBoneCount.call(this._handle)
    return _ret.asInt()
  }

  fun getSkeleton(): RID {
    val _ret = __method_bind.getSkeleton.call(this._handle)
    return _ret.asRID()
  }

  companion object {
    fun new(): Skeleton2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Skeleton2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Skeleton2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Skeleton2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Skeleton2D = Skeleton2D(ptr)
    /**
     * Container for method_bind pointers for Skeleton2D
     */
    private object __method_bind {
      val getBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton2D".cstr.ptr,
            "getBone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBone" }
        }
      val getBoneCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton2D".cstr.ptr,
            "getBoneCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBoneCount" }
        }
      val getSkeleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Skeleton2D".cstr.ptr,
            "getSkeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSkeleton" }
        }}
  }
}
