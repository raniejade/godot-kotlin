// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
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

open class RegExMatch(
  _handle: COpaquePointer
) : Reference(_handle) {
  val names: Dictionary
    get() {
       return getNames() 
    }

  val strings: VariantArray
    get() {
       return getStrings() 
    }

  val subject: String
    get() {
       return getSubject() 
    }

  fun getEnd(name: Variant): Int {
    val _arg = Variant.new(name)
    val _ret = __method_bind.getEnd.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getGroupCount(): Int {
    val _ret = __method_bind.getGroupCount.call(this._handle)
    return _ret.asInt()
  }

  fun getNames(): Dictionary {
    val _ret = __method_bind.getNames.call(this._handle)
    return _ret.asDictionary()
  }

  fun getStart(name: Variant): Int {
    val _arg = Variant.new(name)
    val _ret = __method_bind.getStart.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getString(name: Variant): String {
    val _arg = Variant.new(name)
    val _ret = __method_bind.getString.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getStrings(): VariantArray {
    val _ret = __method_bind.getStrings.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getSubject(): String {
    val _ret = __method_bind.getSubject.call(this._handle)
    return _ret.asString()
  }

  companion object {
    fun new(): RegExMatch = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RegExMatch".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RegExMatch" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RegExMatch(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): RegExMatch = RegExMatch(ptr)
    /**
     * Container for method_bind pointers for RegExMatch
     */
    private object __method_bind {
      val getEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
            "get_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_end" }
        }
      val getGroupCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
            "get_group_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_group_count" }
        }
      val getNames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
            "get_names".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_names" }
        }
      val getStart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
            "get_start".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_start" }
        }
      val getString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
            "get_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_string" }
        }
      val getStrings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
            "get_strings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_strings" }
        }
      val getSubject: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
            "get_subject".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subject" }
        }}
  }
}
