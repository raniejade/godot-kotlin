// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SceneState(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getConnectionBinds(idx: Int): VariantArray {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_connection_binds.call(this._handle, _arg, 1)
    return _ret.asArray()
  }

  fun getConnectionCount(): Int {
    val _ret = __method_bind.get_connection_count.call(this._handle)
    return _ret.asInt()
  }

  fun getConnectionFlags(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_connection_flags.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getConnectionMethod(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_connection_method.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getConnectionSignal(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_connection_signal.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getConnectionSource(idx: Int): NodePath {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_connection_source.call(this._handle, _arg, 1)
    return _ret.asNodePath()
  }

  fun getConnectionTarget(idx: Int): NodePath {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_connection_target.call(this._handle, _arg, 1)
    return _ret.asNodePath()
  }

  fun getNodeCount(): Int {
    val _ret = __method_bind.get_node_count.call(this._handle)
    return _ret.asInt()
  }

  fun getNodeGroups(idx: Int): PoolStringArray {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_node_groups.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun getNodeIndex(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_node_index.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getNodeInstance(idx: Int): PackedScene {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_node_instance.call(this._handle, _arg, 1)
    return _ret.asObject(::PackedScene)!!
  }

  fun getNodeInstancePlaceholder(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_node_instance_placeholder.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getNodeName(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_node_name.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getNodeOwnerPath(idx: Int): NodePath {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_node_owner_path.call(this._handle, _arg, 1)
    return _ret.asNodePath()
  }

  fun getNodePath(idx: Int, forParent: Boolean): NodePath {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(forParent)
    val _ret = __method_bind.get_node_path.call(this._handle, _args.toVariant(), 2)
    return _ret.asNodePath()
  }

  fun getNodePropertyCount(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_node_property_count.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getNodePropertyName(idx: Int, propIdx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(propIdx)
    val _ret = __method_bind.get_node_property_name.call(this._handle, _args.toVariant(), 2)
    return _ret.asString()
  }

  fun getNodePropertyValue(idx: Int, propIdx: Int): Variant {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(propIdx)
    val _ret = __method_bind.get_node_property_value.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun getNodeType(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_node_type.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun isNodeInstancePlaceholder(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.is_node_instance_placeholder.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  enum class GenEditState(
    val value: Int
  ) {
    GEN_EDIT_STATE_DISABLED(0),

    GEN_EDIT_STATE_INSTANCE(1),

    GEN_EDIT_STATE_MAIN(2);

    companion object {
      fun from(value: Int): GenEditState {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val GEN_EDIT_STATE_DISABLED: Int = 0

    val GEN_EDIT_STATE_INSTANCE: Int = 1

    val GEN_EDIT_STATE_MAIN: Int = 2

    /**
     * Container for method_bind pointers for SceneState
     */
    private object __method_bind {
      val get_connection_binds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_connection_binds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_binds" }
        }
      val get_connection_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_connection_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_count" }
        }
      val get_connection_flags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_connection_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_flags" }
        }
      val get_connection_method: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_connection_method".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_method" }
        }
      val get_connection_signal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_connection_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_signal" }
        }
      val get_connection_source: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_connection_source".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_source" }
        }
      val get_connection_target: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_connection_target".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_target" }
        }
      val get_node_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_count" }
        }
      val get_node_groups: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_groups".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_groups" }
        }
      val get_node_index: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_index" }
        }
      val get_node_instance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_instance" }
        }
      val get_node_instance_placeholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_instance_placeholder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_instance_placeholder" }
        }
      val get_node_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_name" }
        }
      val get_node_owner_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_owner_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_owner_path" }
        }
      val get_node_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_path" }
        }
      val get_node_property_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_property_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_property_count" }
        }
      val get_node_property_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_property_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_property_name" }
        }
      val get_node_property_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_property_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_property_value" }
        }
      val get_node_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_type" }
        }
      val is_node_instance_placeholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "is_node_instance_placeholder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_node_instance_placeholder" }
        }}
  }
}
