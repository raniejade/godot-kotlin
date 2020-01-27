// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SegmentShape2D internal constructor(
  _handle: COpaquePointer
) : Shape2D(_handle) {
  fun getA(): Vector2 {
    val _ret = __method_bind.get_a.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getB(): Vector2 {
    val _ret = __method_bind.get_b.call(this.toVariant())
    return _ret.asVector2()
  }

  fun setA(a: Vector2) {
    val _arg = Variant.new(a)
    __method_bind.set_a.call(this.toVariant(), _arg, 1)
  }

  fun setB(b: Vector2) {
    val _arg = Variant.new(b)
    __method_bind.set_b.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): SegmentShape2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("SegmentShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SegmentShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SegmentShape2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SegmentShape2D = SegmentShape2D(ptr)
    /**
     * Container for method_bind pointers for SegmentShape2D
     */
    private object __method_bind {
      val get_a: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SegmentShape2D".cstr.ptr,
              "get_a".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_a" }
            }
          }

      val get_b: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SegmentShape2D".cstr.ptr,
              "get_b".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_b" }
            }
          }

      val set_a: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SegmentShape2D".cstr.ptr,
              "set_a".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_a" }
            }
          }

      val set_b: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SegmentShape2D".cstr.ptr,
              "set_b".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_b" }
            }
          }
    }
  }
}
