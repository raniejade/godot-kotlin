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
    val _ret = __method_bind.getConnectionBinds.call(this._handle, _arg, 1)
    return _ret.asVariantArray()
  }

  fun getConnectionCount(): Int {
    val _ret = __method_bind.getConnectionCount.call(this._handle)
    return _ret.asInt()
  }

  fun getConnectionFlags(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionFlags.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getConnectionMethod(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionMethod.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getConnectionSignal(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionSignal.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getConnectionSource(idx: Int): NodePath {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionSource.call(this._handle, _arg, 1)
    return _ret.asNodePath()
  }

  fun getConnectionTarget(idx: Int): NodePath {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getConnectionTarget.call(this._handle, _arg, 1)
    return _ret.asNodePath()
  }

  fun getNodeCount(): Int {
    val _ret = __method_bind.getNodeCount.call(this._handle)
    return _ret.asInt()
  }

  fun getNodeGroups(idx: Int): PoolStringArray {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodeGroups.call(this._handle, _arg, 1)
    return _ret.asPoolStringArray()
  }

  fun getNodeIndex(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodeIndex.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getNodeInstance(idx: Int): PackedScene {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodeInstance.call(this._handle, _arg, 1)
    return _ret.asObject(::PackedScene)!!
  }

  fun getNodeInstancePlaceholder(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodeInstancePlaceholder.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getNodeName(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodeName.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getNodeOwnerPath(idx: Int): NodePath {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodeOwnerPath.call(this._handle, _arg, 1)
    return _ret.asNodePath()
  }

  fun getNodePath(idx: Int, forParent: Boolean): NodePath {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(forParent)
    val _ret = __method_bind.getNodePath.call(this._handle, _args.toVariant(), 2)
    return _ret.asNodePath()
  }

  fun getNodePropertyCount(idx: Int): Int {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodePropertyCount.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getNodePropertyName(idx: Int, propIdx: Int): String {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(propIdx)
    val _ret = __method_bind.getNodePropertyName.call(this._handle, _args.toVariant(), 2)
    return _ret.asString()
  }

  fun getNodePropertyValue(idx: Int, propIdx: Int): Variant {
    val _args = VariantArray.new()
    _args.append(idx)
    _args.append(propIdx)
    val _ret = __method_bind.getNodePropertyValue.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun getNodeType(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getNodeType.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun isNodeInstancePlaceholder(idx: Int): Boolean {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.isNodeInstancePlaceholder.call(this._handle, _arg, 1)
    return _ret.asBoolean()
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
      val getConnectionBinds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getConnectionBinds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionBinds" }
        }
      val getConnectionCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getConnectionCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionCount" }
        }
      val getConnectionFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getConnectionFlags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionFlags" }
        }
      val getConnectionMethod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getConnectionMethod".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionMethod" }
        }
      val getConnectionSignal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getConnectionSignal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionSignal" }
        }
      val getConnectionSource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getConnectionSource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionSource" }
        }
      val getConnectionTarget: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getConnectionTarget".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionTarget" }
        }
      val getNodeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getNodeCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodeCount" }
        }
      val getNodeGroups: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getNodeGroups".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodeGroups" }
        }
      val getNodeIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getNodeIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodeIndex" }
        }
      val getNodeInstance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getNodeInstance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodeInstance" }
        }
      val getNodeInstancePlaceholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getNodeInstancePlaceholder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodeInstancePlaceholder" }
        }
      val getNodeName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getNodeName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodeName" }
        }
      val getNodeOwnerPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getNodeOwnerPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodeOwnerPath" }
        }
      val getNodePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getNodePath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodePath" }
        }
      val getNodePropertyCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getNodePropertyCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodePropertyCount" }
        }
      val getNodePropertyName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getNodePropertyName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodePropertyName" }
        }
      val getNodePropertyValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getNodePropertyValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodePropertyValue" }
        }
      val getNodeType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "getNodeType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodeType" }
        }
      val isNodeInstancePlaceholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneState".cstr.ptr,
            "isNodeInstancePlaceholder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isNodeInstancePlaceholder" }
        }}
  }
}
