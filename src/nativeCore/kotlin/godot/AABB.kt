package godot

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
}