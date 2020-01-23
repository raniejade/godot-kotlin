package godot

import gdnative.godot_rid
import kotlinx.cinterop.*

class Rid(
  value: CValue<godot_rid>
): Primitive<godot_rid>(value) {
  fun getId(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_rid_get_id)(_value.ptr)
    }
  }

  override fun equals(other: Any?): Boolean {
    if (other == null) {
      return false
    }
    return memScoped {
      when (other) {
        is Rid -> checkNotNull(Godot.gdnative.godot_rid_operator_equal)(_value.ptr, other._value.ptr)
        else -> false
      }
    }
  }

  override fun hashCode(): Int {
    return getId()
  }

  companion object {
    fun new(): Rid {
      val value = memScoped {
        val tmp = alloc<godot_rid>()
        checkNotNull(Godot.gdnative.godot_rid_new)(tmp.ptr)
        tmp.readValue()
      }
      return Rid(value)
    }

    // TODO: new_with_resource when GDObject is generated
  }
}
