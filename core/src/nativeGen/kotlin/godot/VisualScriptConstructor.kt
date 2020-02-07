// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptConstructor(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  var constructor: Dictionary
    get() {
       return getConstructor() 
    }
    set(value) {
      setConstructor(value)
    }

  var type: Variant.Type
    get() {
       return getConstructorType() 
    }
    set(value) {
      setConstructorType(value.value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for constructor
   */
  fun constructor(cb: Dictionary.() -> Unit) {
    val _p = constructor
    cb(_p)
    constructor = _p
  }

  fun getConstructor(): Dictionary {
    val _ret = __method_bind.getConstructor.call(this._handle)
    return _ret.asDictionary()
  }

  fun getConstructorType(): Variant.Type {
    val _ret = __method_bind.getConstructorType.call(this._handle)
    return Variant.Type.from(_ret.asInt())
  }

  fun setConstructor(constructor: Dictionary) {
    val _arg = Variant(constructor)
    __method_bind.setConstructor.call(this._handle, listOf(_arg))
  }

  fun setConstructorType(type: Int) {
    val _arg = Variant(type)
    __method_bind.setConstructorType.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptConstructor".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptConstructor" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptConstructor
     */
    private object __method_bind {
      val getConstructor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstructor".cstr.ptr,
            "get_constructor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constructor" }
        }
      val getConstructorType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstructor".cstr.ptr,
            "get_constructor_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constructor_type" }
        }
      val setConstructor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstructor".cstr.ptr,
            "set_constructor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constructor" }
        }
      val setConstructorType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstructor".cstr.ptr,
            "set_constructor_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constructor_type" }
        }}
  }
}
