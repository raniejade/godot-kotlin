// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class SceneState(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getConnectionBinds(idx: Int): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getConnectionBinds.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getConnectionCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getConnectionCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getConnectionFlags(idx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getConnectionFlags.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun getConnectionMethod(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getConnectionMethod.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getConnectionSignal(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getConnectionSignal.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getConnectionSource(idx: Int): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getConnectionSource.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getConnectionTarget(idx: Int): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getConnectionTarget.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNodeCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getNodeCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getNodeGroups(idx: Int): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getNodeGroups.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNodeIndex(idx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getNodeIndex.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun getNodeInstance(idx: Int): PackedScene {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: PackedScene
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNodeInstance.call(self._handle, listOf(idx), _retPtr)
      _ret = objectToType<PackedScene>(_tmp.value!!)
      _ret
    }
  }

  fun getNodeInstancePlaceholder(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getNodeInstancePlaceholder.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getNodeName(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getNodeName.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getNodeOwnerPath(idx: Int): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getNodeOwnerPath.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNodePath(idx: Int, forParent: Boolean = false): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(forParent)
      __method_bind.getNodePath.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNodePropertyCount(idx: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getNodePropertyCount.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
  }

  fun getNodePropertyName(idx: Int, propIdx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(propIdx)
      __method_bind.getNodePropertyName.call(self._handle, _args, _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getNodePropertyValue(idx: Int, propIdx: Int): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(propIdx)
      __method_bind.getNodePropertyValue.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNodeType(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getNodeType.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun isNodeInstancePlaceholder(idx: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isNodeInstancePlaceholder.call(self._handle, listOf(idx), _retPtr)
      _ret.value
    }
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
      val getConnectionBinds: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_binds".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_binds" }
            }
          }

      val getConnectionCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_count" }
            }
          }

      val getConnectionFlags: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_flags" }
            }
          }

      val getConnectionMethod: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_method".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_method" }
            }
          }

      val getConnectionSignal: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_signal" }
            }
          }

      val getConnectionSource: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_source".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_source" }
            }
          }

      val getConnectionTarget: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_connection_target".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_target" }
            }
          }

      val getNodeCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_count" }
            }
          }

      val getNodeGroups: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_groups".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_groups" }
            }
          }

      val getNodeIndex: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_index" }
            }
          }

      val getNodeInstance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_instance" }
            }
          }

      val getNodeInstancePlaceholder: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_instance_placeholder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_instance_placeholder"
              }
            }
          }

      val getNodeName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_name" }
            }
          }

      val getNodeOwnerPath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_owner_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_owner_path" }
            }
          }

      val getNodePath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_path" }
            }
          }

      val getNodePropertyCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_property_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_property_count" }
            }
          }

      val getNodePropertyName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_property_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_property_name" }
            }
          }

      val getNodePropertyValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_property_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_property_value" }
            }
          }

      val getNodeType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "get_node_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_type" }
            }
          }

      val isNodeInstancePlaceholder: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
              "is_node_instance_placeholder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_node_instance_placeholder" }
            }
          }
    }
  }
}
