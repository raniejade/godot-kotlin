// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
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

open class SkinReference(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun getSkeleton(): RID {
    val _ret = __method_bind.getSkeleton.call(this._handle)
    return _ret.asRID()
  }

  fun getSkin(): Skin {
    val _ret = __method_bind.getSkin.call(this._handle)
    return _ret.asObject(::Skin)!!
  }

  companion object {
    /**
     * Container for method_bind pointers for SkinReference
     */
    private object __method_bind {
      val getSkeleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkinReference".cstr.ptr,
            "get_skeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skeleton" }
        }
      val getSkin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SkinReference".cstr.ptr,
            "get_skin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skin" }
        }}
  }
}
