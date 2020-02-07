package godot.core

import gdnative.godot_rid
import godot.Object
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class RID(
  value: CValue<godot_rid>
): CoreType<godot_rid>(value) {

  constructor(): this(__new())
  constructor(resource: Object): this(__new(resource))

  val id: Int
    get() = memScoped {
      checkNotNull(Godot.gdnative.godot_rid_get_id)(_value.ptr)
    }

  override fun toVariant(): Variant {
    return Variant(this)
  }

  override fun toGDString(): GDString {
    return GDString("$id")
  }

  override fun equals(other: Any?): Boolean {
    if (other == null) {
      return false
    }
    return memScoped {
      when (other) {
        is RID -> checkNotNull(Godot.gdnative.godot_rid_operator_equal)(_value.ptr, other._value.ptr)
        else -> false
      }
    }
  }

  override fun hashCode(): Int {
    return _value.hashCode()
  }

  companion object {
    internal fun __new() = allocType2<godot_rid> {
      checkNotNull(Godot.gdnative.godot_rid_new)(it)
    }

    internal fun __new(resource: Object) = allocType2<godot_rid> {
      checkNotNull(Godot.gdnative.godot_rid_new_with_resource)(it, resource._handle)
    }
  }
}
