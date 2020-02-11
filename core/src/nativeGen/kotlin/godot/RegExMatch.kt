// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RegExMatch(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getEnd(name: Variant): Int {
    val _arg = Variant(name)
    val _ret = __method_bind.getEnd.call(this._handle, listOf(_arg))
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
    val _arg = Variant(name)
    val _ret = __method_bind.getStart.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getString(name: Variant): String {
    val _arg = Variant(name)
    val _ret = __method_bind.getString.call(this._handle, listOf(_arg))
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RegExMatch".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RegExMatch" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for RegExMatch
     */
    private object __method_bind {
      val getEnd: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
            "get_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_end" }
        }
      val getGroupCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
            "get_group_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_group_count" }
        }
      val getNames: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
            "get_names".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_names" }
        }
      val getStart: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
            "get_start".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_start" }
        }
      val getString: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
            "get_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_string" }
        }
      val getStrings: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
            "get_strings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_strings" }
        }
      val getSubject: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegExMatch".cstr.ptr,
            "get_subject".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subject" }
        }}
  }
}
