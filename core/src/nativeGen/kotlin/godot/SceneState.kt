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
import kotlin.reflect.KCallable
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
    val _ret = __method_bind.getConnectionBinds.call(this._handle, listOf(_arg))
    return _ret.asVariantArray()
  }

  fun getConnectionCount(): Int {
    val _ret = __method_bind.getConnectionCount.call(this._handle)
    return _ret.asInt()
  }

  fun getConnectionFlags(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionFlags.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getConnectionMethod(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionMethod.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getConnectionSignal(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionSignal.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getConnectionSource(idx: Int): NodePath {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionSource.call(this._handle, listOf(_arg))
    return _ret.asNodePath()
  }

  fun getConnectionTarget(idx: Int): NodePath {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionTarget.call(this._handle, listOf(_arg))
    return _ret.asNodePath()
  }

  fun getNodeCount(): Int {
    val _ret = __method_bind.getNodeCount.call(this._handle)
    return _ret.asInt()
  }

  fun getNodeGroups(idx: Int): PoolStringArray {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodeGroups.call(this._handle, listOf(_arg))
    return _ret.asPoolStringArray()
  }

  fun getNodeIndex(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodeIndex.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getNodeInstance(idx: Int): PackedScene {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodeInstance.call(this._handle, listOf(_arg))
    return _ret.asObject(::PackedScene)!!
  }

  fun getNodeInstancePlaceholder(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodeInstancePlaceholder.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getNodeName(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodeName.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getNodeOwnerPath(idx: Int): NodePath {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodeOwnerPath.call(this._handle, listOf(_arg))
    return _ret.asNodePath()
  }

  fun getNodePath(idx: Int, forParent: Boolean = false): NodePath {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(forParent))
    val _ret = __method_bind.getNodePath.call(this._handle, _args)
    return _ret.asNodePath()
  }

  fun getNodePropertyCount(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodePropertyCount.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getNodePropertyName(idx: Int, propIdx: Int): String {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(propIdx))
    val _ret = __method_bind.getNodePropertyName.call(this._handle, _args)
    return _ret.asString()
  }

  fun getNodePropertyValue(idx: Int, propIdx: Int): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(propIdx))
    val _ret = __method_bind.getNodePropertyValue.call(this._handle, _args)
    return _ret
  }

  fun getNodeType(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodeType.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun isNodeInstancePlaceholder(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isNodeInstancePlaceholder.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  enum class GenEditState(
    val value: Int
  ) {
    DISABLED(0),

    INSTANCE(1),

    MAIN(2);

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
    /**
     * Container for method_bind pointers for SceneState
     */
    private object __method_bind {
      val getConnectionBinds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_connection_binds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_binds" }
        }
      val getConnectionCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_connection_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_count" }
        }
      val getConnectionFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_connection_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_flags" }
        }
      val getConnectionMethod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_connection_method".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_method" }
        }
      val getConnectionSignal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_connection_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_signal" }
        }
      val getConnectionSource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_connection_source".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_source" }
        }
      val getConnectionTarget: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_connection_target".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_target" }
        }
      val getNodeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_count" }
        }
      val getNodeGroups: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_groups".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_groups" }
        }
      val getNodeIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_index" }
        }
      val getNodeInstance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_instance" }
        }
      val getNodeInstancePlaceholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_instance_placeholder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_instance_placeholder" }
        }
      val getNodeName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_name" }
        }
      val getNodeOwnerPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_owner_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_owner_path" }
        }
      val getNodePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_path" }
        }
      val getNodePropertyCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_property_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_property_count" }
        }
      val getNodePropertyName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_property_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_property_name" }
        }
      val getNodePropertyValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_property_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_property_value" }
        }
      val getNodeType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "get_node_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_type" }
        }
      val isNodeInstancePlaceholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "is_node_instance_placeholder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_node_instance_placeholder" }
        }}
  }
}
