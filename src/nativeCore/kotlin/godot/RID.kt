package godot

import gdnative.godot_rid
import kotlinx.cinterop.*

class RID(
  value: CValue<godot_rid>
): Primitive<godot_rid>(value) {
  val id: Int
    get() = memScoped {
      checkNotNull(Godot.gdnative.godot_rid_get_id)(_value.ptr)
    }

  override fun toVariant(): Variant {
    return Variant.new(this)
  }

  override fun toGDString(): GDString {
    return GDString.new("$id")
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
    fun new(): RID {
      val value = memScoped {
        val tmp = alloc<godot_rid>()
        checkNotNull(Godot.gdnative.godot_rid_new)(tmp.ptr)
        tmp.readValue()
      }
      return RID(value)
    }

    // TODO: new_with_resource when GDObject is generated
  }
}
