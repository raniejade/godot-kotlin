package godot.core

import gdnative.godot_node_path
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke

class NodePath(
  value: CValue<godot_node_path>
) : CoreType<godot_node_path>(value) {
  internal constructor(): this(__new(""))
  constructor(path: String): this(__new(path))

  fun getAsPropertyPath(): NodePath {
    return Allocator.allocationScope {
      NodePath(
        checkNotNull(Godot.gdnative11.godot_node_path_get_as_property_path)(_value.ptr)
      )
    }
  }

  fun getConcatenatedSubnames(): String {
    return Allocator.allocationScope {
      val gdString = GDString(
        checkNotNull(Godot.gdnative.godot_node_path_get_concatenated_subnames)(_value.ptr)
      )
      val ret = gdString.toKString()
      gdString.destroy()
      ret
    }
  }

  fun getName(index: Int): String {
    return Allocator.allocationScope {
      val gdString = GDString(
        checkNotNull(Godot.gdnative.godot_node_path_get_name)(_value.ptr, index)
      )
      val ret = gdString.toKString()
      gdString.destroy()
      ret
    }
  }

  fun getNameCount(): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_node_path_get_name_count)(_value.ptr)
    }
  }

  fun getSubname(index: Int): String {
    return Allocator.allocationScope {
      val gdString = GDString(
        checkNotNull(Godot.gdnative.godot_node_path_get_subname)(_value.ptr, index)
      )
      val ret = gdString.toKString()
      gdString.destroy()
      ret
    }
  }

  fun getSubnameCount(): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_node_path_get_subname_count)(_value.ptr)
    }
  }

  fun isAbsolute(): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_node_path_is_absolute)(_value.ptr)
    }
  }

  fun isEmpty(): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_node_path_is_empty)(_value.ptr)
    }
  }

  override fun toVariant(): Variant {
    return Variant(this)
  }

  override fun toGDString(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_node_path_as_string)(_value.ptr)
      )
    }
  }

  companion object {
    internal fun __new(path: String) = allocType2<godot_node_path> {
      GDString.from(path) { str ->
        checkNotNull(Godot.gdnative.godot_node_path_new)(it, str._value.ptr)
      }
    }
  }
}