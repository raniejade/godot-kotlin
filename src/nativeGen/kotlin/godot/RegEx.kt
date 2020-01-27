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

open class RegEx internal constructor(
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
    val _ret = __method_bind.get_group_count.call(this._handle)
    return _ret.asInt()
  }

  fun getNames(): VariantArray {
    val _ret = __method_bind.get_names.call(this._handle)
    return _ret.asArray()
  }

  fun getPattern(): String {
    val _ret = __method_bind.get_pattern.call(this._handle)
    return _ret.asString()
  }

  fun isValid(): Boolean {
    val _ret = __method_bind.is_valid.call(this._handle)
    return _ret.asBool()
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
    val _ret = __method_bind.search_all.call(this._handle, _args.toVariant(), 3)
    return _ret.asArray()
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
      val get_group_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "get_group_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_group_count" }
        }
      val get_names: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "get_names".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_names" }
        }
      val get_pattern: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "get_pattern".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pattern" }
        }
      val is_valid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "is_valid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_valid" }
        }
      val search: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "search".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method search" }
        }
      val search_all: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "search_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method search_all" }
        }
      val sub: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RegEx".cstr.ptr,
            "sub".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method sub" }
        }}
  }
}
