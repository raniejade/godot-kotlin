// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptPropertySet internal constructor(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  fun getAssignOp(): AssignOp {
    val _ret = __method_bind.get_assign_op.call(this.toVariant())
    return VisualScriptPropertySet.AssignOp.from(_ret.asInt())
  }

  fun getBasePath(): NodePath {
    val _ret = __method_bind.get_base_path.call(this.toVariant())
    return _ret.asNodePath()
  }

  fun getBaseScript(): String {
    val _ret = __method_bind.get_base_script.call(this.toVariant())
    return _ret.asString()
  }

  fun getBaseType(): String {
    val _ret = __method_bind.get_base_type.call(this.toVariant())
    return _ret.asString()
  }

  fun getBasicType(): Variant.Type {
    val _ret = __method_bind.get_basic_type.call(this.toVariant())
    return Variant.Type.from(_ret.asInt())
  }

  fun getCallMode(): CallMode {
    val _ret = __method_bind.get_call_mode.call(this.toVariant())
    return VisualScriptPropertySet.CallMode.from(_ret.asInt())
  }

  fun getIndex(): String {
    val _ret = __method_bind.get_index.call(this.toVariant())
    return _ret.asString()
  }

  fun getProperty(): String {
    val _ret = __method_bind.get_property.call(this.toVariant())
    return _ret.asString()
  }

  fun setAssignOp(assignOp: Int) {
    val _args = VariantArray.new()
    _args.append(assignOp)
    __method_bind.set_assign_op.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setBasePath(basePath: NodePath) {
    val _args = VariantArray.new()
    _args.append(basePath)
    __method_bind.set_base_path.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setBaseScript(baseScript: String) {
    val _args = VariantArray.new()
    _args.append(baseScript)
    __method_bind.set_base_script.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setBaseType(baseType: String) {
    val _args = VariantArray.new()
    _args.append(baseType)
    __method_bind.set_base_type.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setBasicType(basicType: Int) {
    val _args = VariantArray.new()
    _args.append(basicType)
    __method_bind.set_basic_type.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setCallMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    __method_bind.set_call_mode.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setIndex(index: String) {
    val _args = VariantArray.new()
    _args.append(index)
    __method_bind.set_index.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setProperty(property: String) {
    val _args = VariantArray.new()
    _args.append(property)
    __method_bind.set_property.call(this.toVariant(), _args.toVariant(), 1)
  }

  enum class AssignOp(
    val value: Int
  ) {
    ASSIGN_OP_NONE(0),

    ASSIGN_OP_ADD(1),

    ASSIGN_OP_SUB(2),

    ASSIGN_OP_MUL(3),

    ASSIGN_OP_DIV(4),

    ASSIGN_OP_MOD(5),

    ASSIGN_OP_SHIFT_LEFT(6),

    ASSIGN_OP_SHIFT_RIGHT(7),

    ASSIGN_OP_BIT_AND(8),

    ASSIGN_OP_BIT_OR(9),

    ASSIGN_OP_BIT_XOR(10);

    companion object {
      fun from(value: Int): AssignOp {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class CallMode(
    val value: Int
  ) {
    CALL_MODE_SELF(0),

    CALL_MODE_NODE_PATH(1),

    CALL_MODE_INSTANCE(2),

    CALL_MODE_BASIC_TYPE(3);

    companion object {
      fun from(value: Int): CallMode {
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
    val ASSIGN_OP_ADD: Int = 1

    val ASSIGN_OP_BIT_AND: Int = 8

    val ASSIGN_OP_BIT_OR: Int = 9

    val ASSIGN_OP_BIT_XOR: Int = 10

    val ASSIGN_OP_DIV: Int = 4

    val ASSIGN_OP_MOD: Int = 5

    val ASSIGN_OP_MUL: Int = 3

    val ASSIGN_OP_NONE: Int = 0

    val ASSIGN_OP_SHIFT_LEFT: Int = 6

    val ASSIGN_OP_SHIFT_RIGHT: Int = 7

    val ASSIGN_OP_SUB: Int = 2

    val CALL_MODE_BASIC_TYPE: Int = 3

    val CALL_MODE_INSTANCE: Int = 2

    val CALL_MODE_NODE_PATH: Int = 1

    val CALL_MODE_SELF: Int = 0

    fun new(): VisualScriptPropertySet = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptPropertySet".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualScriptPropertySet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptPropertySet(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptPropertySet = VisualScriptPropertySet(ptr)
    /**
     * Container for method_bind pointers for VisualScriptPropertySet
     */
    private object __method_bind {
      val get_assign_op: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "get_assign_op".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_assign_op" }
            }
          }

      val get_base_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "get_base_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_path" }
            }
          }

      val get_base_script: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "get_base_script".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_script" }
            }
          }

      val get_base_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "get_base_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base_type" }
            }
          }

      val get_basic_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "get_basic_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_basic_type" }
            }
          }

      val get_call_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "get_call_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_call_mode" }
            }
          }

      val get_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "get_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_index" }
            }
          }

      val get_property: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "get_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_property" }
            }
          }

      val set_assign_op: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "set_assign_op".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_assign_op" }
            }
          }

      val set_base_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "set_base_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_path" }
            }
          }

      val set_base_script: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "set_base_script".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_script" }
            }
          }

      val set_base_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "set_base_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base_type" }
            }
          }

      val set_basic_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "set_basic_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_basic_type" }
            }
          }

      val set_call_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "set_call_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_call_mode" }
            }
          }

      val set_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "set_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_index" }
            }
          }

      val set_property: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptPropertySet".cstr.ptr,
              "set_property".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_property" }
            }
          }
    }
  }
}
