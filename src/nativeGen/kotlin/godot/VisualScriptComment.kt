// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KCallable
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

  /**
   * Specialized setter for size
   */
  fun size(cb: Vector2.() -> Unit) {
    val _p = size
    cb(_p)
    size = _p
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
    __method_bind.setDescription.call(this._handle, listOf(_arg))
  }

  fun setSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setSize.call(this._handle, listOf(_arg))
  }

  fun setTitle(title: String) {
    val _arg = Variant.new(title)
    __method_bind.setTitle.call(this._handle, listOf(_arg))
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
            "get_description".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_description" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val getTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "get_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_title" }
        }
      val setDescription: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "set_description".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_description" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }
      val setTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptComment".cstr.ptr,
            "set_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_title" }
        }}
  }
}
