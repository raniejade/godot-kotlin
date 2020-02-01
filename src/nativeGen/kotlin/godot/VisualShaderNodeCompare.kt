// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeCompare(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  var condition: Condition
    get() {
       return getCondition() 
    }
    set(value) {
      setCondition(value.value)
    }

  var function: Function
    get() {
       return getFunction() 
    }
    set(value) {
      setFunction(value.value)
    }

  var type: ComparisonType
    get() {
       return getComparisonType() 
    }
    set(value) {
      setComparisonType(value.value)
    }

  fun getComparisonType(): ComparisonType {
    val _ret = __method_bind.getComparisonType.call(this._handle)
    return VisualShaderNodeCompare.ComparisonType.from(_ret.asInt())
  }

  fun getCondition(): Condition {
    val _ret = __method_bind.getCondition.call(this._handle)
    return VisualShaderNodeCompare.Condition.from(_ret.asInt())
  }

  fun getFunction(): Function {
    val _ret = __method_bind.getFunction.call(this._handle)
    return VisualShaderNodeCompare.Function.from(_ret.asInt())
  }

  fun setComparisonType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.setComparisonType.call(this._handle, listOf(_arg))
  }

  fun setCondition(condition: Int) {
    val _arg = Variant.new(condition)
    __method_bind.setCondition.call(this._handle, listOf(_arg))
  }

  fun setFunction(func: Int) {
    val _arg = Variant.new(func)
    __method_bind.setFunction.call(this._handle, listOf(_arg))
  }

  enum class ComparisonType(
    val value: Int
  ) {
    CTYPE_SCALAR(0),

    CTYPE_VECTOR(1),

    CTYPE_BOOLEAN(2),

    CTYPE_TRANSFORM(3);

    companion object {
      fun from(value: Int): ComparisonType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Function(
    val value: Int
  ) {
    FUNC_EQUAL(0),

    FUNC_NOT_EQUAL(1),

    FUNC_GREATER_THAN(2),

    FUNC_GREATER_THAN_EQUAL(3),

    FUNC_LESS_THAN(4),

    FUNC_LESS_THAN_EQUAL(5);

    companion object {
      fun from(value: Int): Function {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Condition(
    val value: Int
  ) {
    COND_ALL(0),

    COND_ANY(1);

    companion object {
      fun from(value: Int): Condition {
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
    val COND_ALL: Int = 0

    val COND_ANY: Int = 1

    val CTYPE_BOOLEAN: Int = 2

    val CTYPE_SCALAR: Int = 0

    val CTYPE_TRANSFORM: Int = 3

    val CTYPE_VECTOR: Int = 1

    val FUNC_EQUAL: Int = 0

    val FUNC_GREATER_THAN: Int = 2

    val FUNC_GREATER_THAN_EQUAL: Int = 3

    val FUNC_LESS_THAN: Int = 4

    val FUNC_LESS_THAN_EQUAL: Int = 5

    val FUNC_NOT_EQUAL: Int = 1

    fun new(): VisualShaderNodeCompare = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeCompare".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeCompare" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeCompare(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeCompare = VisualShaderNodeCompare(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeCompare
     */
    private object __method_bind {
      val getComparisonType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCompare".cstr.ptr,
            "get_comparison_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_comparison_type" }
        }
      val getCondition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCompare".cstr.ptr,
            "get_condition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_condition" }
        }
      val getFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCompare".cstr.ptr,
            "get_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_function" }
        }
      val setComparisonType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCompare".cstr.ptr,
            "set_comparison_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_comparison_type" }
        }
      val setCondition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCompare".cstr.ptr,
            "set_condition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_condition" }
        }
      val setFunction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCompare".cstr.ptr,
            "set_function".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_function" }
        }}
  }
}
