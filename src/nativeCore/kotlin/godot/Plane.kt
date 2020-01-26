package godot

import gdnative.godot_plane
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class Plane(
  value: CValue<godot_plane>
) : CoreType<godot_plane>(value) {
  override fun toVariant(): Variant {
    return Variant.new(this)
  }

  override fun toGDString(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_plane_as_string)(_value.ptr)
      )
    }
  }
}