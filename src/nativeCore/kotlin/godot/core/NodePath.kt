package godot.core

import gdnative.godot_node_path
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class NodePath(
  value: CValue<godot_node_path>
) : CoreType<godot_node_path>(value) {
  override fun toVariant(): Variant {
    return Variant.new(this)
  }

  override fun toGDString(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_node_path_as_string)(_value.ptr)
      )
    }
  }

  companion object {
    fun new(path: String): NodePath {
      return allocType(::NodePath) {
        GDString.from(path) { str ->
          checkNotNull(Godot.gdnative.godot_node_path_new)(it, str._value.ptr)
        }
      }
    }
  }
}