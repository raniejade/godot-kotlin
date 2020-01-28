// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
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

open class RegEx(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun compile(pattern: String): GDError {
    val _arg = Variant.new(pattern)
    val _ret = __method_bind.compile.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun getGroupCount(): Int {
    val _ret = __method_bind.getGroupCount.call(this._handle)
    return _ret.asInt()
  }

  fun getNames(): VariantArray {
    val _ret = __method_bind.getNames.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getPattern(): String {
    val _ret = __method_bind.getPattern.call(this._handle)
    return _ret.asString()
  }

  fun isValid(): Boolean {
    val _ret = __method_bind.isValid.call(this._handle)
    return _ret.asBoolean()
  }

  fun search(
    subject: String,
    offset: Int,
    end: Int
  ): RegExMatch {
    val _args = VariantArray.new()
    _args.append(subject)
    _args.append(offset)
    _args.append(end)
    val _ret = __method_bind.search.call(this._handle, _args.toVariant(), 3)
    return _ret.asObject(::RegExMatch)!!
  }

  fun searchAll(
    subject: String,
    offset: Int,
    end: Int
  ): VariantArray {
    val _args = VariantArray.new()
    _args.append(subject)
    _args.append(offset)
    _args.append(end)
    val _ret = __method_bind.searchAll.call(this._handle, _args.toVariant(), 3)
    return _ret.asVariantArray()
  }

  fun sub(
    subject: String,
    replacement: String,
    all: Boolean,
    offset: Int,
    end: Int
  ): String {
    val _args = VariantArray.new()
    _args.append(subject)
    _args.append(replacement)
    _args.append(all)
    _args.append(offset)
    _args.append(end)
    val _ret = __method_bind.sub.call(this._handle, _args.toVariant(), 5)
    return _ret.asString()
  }

  companion object {
    fun new(): RegEx = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("RegEx".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RegEx" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RegEx(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): RegEx = RegEx(ptr)
    /**
     * Container for method_bind pointers for RegEx
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val compile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "compile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method compile" }
        }
      val getGroupCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "getGroupCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGroupCount" }
        }
      val getNames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "getNames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNames" }
        }
      val getPattern: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "getPattern".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPattern" }
        }
      val isValid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "isValid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isValid" }
        }
      val search: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "search".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method search" }
        }
      val searchAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "searchAll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method searchAll" }
        }
      val sub: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "sub".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method sub" }
        }}
  }
}
