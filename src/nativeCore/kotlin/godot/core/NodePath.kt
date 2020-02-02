package godot.core

import gdnative.godot_node_path
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class NodePath(
  value: CValue<godot_node_path>
) : CoreType<godot_node_path>(value) {

  fun getAsPropertyPath(): NodePath {
    return memScoped {
      NodePath(
        checkNotNull(Godot.gdnative11.godot_node_path_get_as_property_path)(_value.ptr)
      )
    }
  }

  fun getConcatenatedSubnames(): String {
    return memScoped {
      val gdString = GDString(
        checkNotNull(Godot.gdnative.godot_node_path_get_concatenated_subnames)(_value.ptr)
      )
      val ret = gdString.toKString()
      gdString.destroy()
      ret
    }
  }

  fun getName(index: Int): String {
    return memScoped {
      val gdString = GDString(
        checkNotNull(Godot.gdnative.godot_node_path_get_name)(_value.ptr, index)
      )
      val ret = gdString.toKString()
      gdString.destroy()
      return ret
    }
  }

  fun getNameCount(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_node_path_get_name_count)(_value.ptr)
    }
  }

  fun getSubname(index: Int): String {
    return memScoped {
      val gdString = GDString(
        checkNotNull(Godot.gdnative.godot_node_path_get_subname)(_value.ptr, index)
      )
      val ret = gdString.toKString()
      gdString.destroy()
      return ret
    }
  }

  fun getSubnameCount(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_node_path_get_subname_count)(_value.ptr)
    }
  }

  fun isAbsolute(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_node_path_is_absolute)(_value.ptr)
    }
  }

  fun isEmpty(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_node_path_is_empty)(_value.ptr)
    }
  }

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