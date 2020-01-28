// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualScriptComment(
  _handle: COpaquePointer
) : VisualScriptNode(_handle) {
  var description: String
    get() {
       return getDescription() 
    }
    set(value) {
      setDescription(value)
    }

  var size: Vector2
    get() {
       return getSize() 
    }
    set(value) {
      setSize(value)
    }

  var title: String
    get() {
       return getTitle() 
    }
    set(value) {
      setTitle(value)
    }

  fun getDescription(): String {
    val _ret = __method_bind.getDescription.call(this._handle)
    return _ret.asString()
  }

  fun getSize(): Vector2 {
    val _ret = __method_bind.getSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getTitle(): String {
    val _ret = __method_bind.getTitle.call(this._handle)
    return _ret.asString()
  }

  fun setDescription(description: String) {
    val _arg = Variant.new(description)
    __method_bind.setDescription.call(this._handle, _arg, 1)
  }

  fun setSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setSize.call(this._handle, _arg, 1)
  }

  fun setTitle(title: String) {
    val _arg = Variant.new(title)
    __method_bind.setTitle.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): VisualScriptComment = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptComment".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptComment" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualScriptComment(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualScriptComment = VisualScriptComment(ptr)
    /**
     * Container for method_bind pointers for VisualScriptComment
     */
    private object __method_bind {
      val getDescription: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "getDescription".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDescription" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "getSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSize" }
        }
      val getTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "getTitle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTitle" }
        }
      val setDescription: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "setDescription".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDescription" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "setSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSize" }
        }
      val setTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "setTitle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTitle" }
        }}
  }
}
