package godot.core

import gdnative.godot_aabb
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class AABB(
  value: CValue<godot_aabb>
) : CoreType<godot_aabb>(value) {
  override fun toVariant(): Variant {
    return Variant.new(this)
  }

  override fun toGDString(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_aabb_as_string)(_value.ptr)
      )
    }
  }

  companion object {
    fun new(position: Vector3, size: Vector3): AABB {
      return allocType(::AABB) {
        checkNotNull(Godot.gdnative.godot_aabb_new)(it, position._value.ptr, size._value.ptr)
      }
    }
  }
}