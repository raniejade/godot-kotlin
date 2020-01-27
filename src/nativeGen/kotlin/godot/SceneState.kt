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

open class SceneState internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getConnectionBinds(idx: Int): VariantArray {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_connection_binds.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getConnectionCount(): Int {
    val _ret = __method_bind.get_connection_count.call(this.toVariant())
    TODO()
  }

  fun getConnectionFlags(idx: Int): Int {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_connection_flags.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getConnectionMethod(idx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_connection_method.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getConnectionSignal(idx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_connection_signal.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getConnectionSource(idx: Int): NodePath {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_connection_source.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getConnectionTarget(idx: Int): NodePath {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_connection_target.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getNodeCount(): Int {
    val _ret = __method_bind.get_node_count.call(this.toVariant())
    TODO()
  }

  fun getNodeGroups(idx: Int): PoolStringArray {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_node_groups.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getNodeIndex(idx: Int): Int {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_node_index.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getNodeInstance(idx: Int): PackedScene {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_node_instance.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getNodeInstancePlaceholder(idx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_node_instance_placeholder.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun getNodeName(idx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_node_name.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getNodeOwnerPath(idx: Int): NodePath {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_node_owner_path.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getNodePath(idx: Int, forParent: Boolean): NodePath {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(forParent)
    val _ret = __method_bind.get_node_path.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun getNodePropertyCount(idx: Int): Int {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_node_property_count.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getNodePropertyName(idx: Int, propIdx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(propIdx)
    val _ret = __method_bind.get_node_property_name.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun getNodePropertyValue(idx: Int, propIdx: Int): Variant {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(propIdx)
    val _ret = __method_bind.get_node_property_value.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun getNodeType(idx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_node_type.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isNodeInstancePlaceholder(idx: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.is_node_instance_placeholder.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
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
      val get_connection_binds: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_binds".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_binds" }
            }
          }

      val get_connection_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_count" }
            }
          }

      val get_connection_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_flags" }
            }
          }

      val get_connection_method: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_method".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_method" }
            }
          }

      val get_connection_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_signal" }
            }
          }

      val get_connection_source: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_source".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_source" }
            }
          }

      val get_connection_target: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_target".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_target" }
            }
          }

      val get_node_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_count" }
            }
          }

      val get_node_groups: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_groups".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_groups" }
            }
          }

      val get_node_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_index" }
            }
          }

      val get_node_instance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_instance" }
            }
          }

      val get_node_instance_placeholder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_instance_placeholder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_instance_placeholder"
              }
            }
          }

      val get_node_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_name" }
            }
          }

      val get_node_owner_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_owner_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_owner_path" }
            }
          }

      val get_node_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_path" }
            }
          }

      val get_node_property_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_property_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_property_count" }
            }
          }

      val get_node_property_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_property_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_property_name" }
            }
          }

      val get_node_property_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_property_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_property_value" }
            }
          }

      val get_node_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_type" }
            }
          }

      val is_node_instance_placeholder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "is_node_instance_placeholder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_node_instance_placeholder" }
            }
          }
    }
  }
}
