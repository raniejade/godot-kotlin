// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventScreenDrag(
  _handle: COpaquePointer
) : InputEvent(_handle) {
  var index: Int
    get() {
       return getIndex() 
    }
    set(value) {
      setIndex(value)
    }

  var position: Vector2
    get() {
       return getPosition() 
    }
    set(value) {
      setPosition(value)
    }

  var relative: Vector2
    get() {
       return getRelative() 
    }
    set(value) {
      setRelative(value)
    }

  var speed: Vector2
    get() {
       return getSpeed() 
    }
    set(value) {
      setSpeed(value)
    }

  fun getIndex(): Int {
    val _ret = __method_bind.getIndex.call(this._handle)
    return _ret.asInt()
  }

  fun getPosition(): Vector2 {
    val _ret = __method_bind.getPosition.call(this._handle)
    return _ret.asVector2()
  }

  fun getRelative(): Vector2 {
    val _ret = __method_bind.getRelative.call(this._handle)
    return _ret.asVector2()
  }

  fun getSpeed(): Vector2 {
    val _ret = __method_bind.getSpeed.call(this._handle)
    return _ret.asVector2()
  }

  fun setIndex(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.setIndex.call(this._handle, _arg, 1)
  }

  fun setPosition(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.setPosition.call(this._handle, _arg, 1)
  }

  fun setRelative(relative: Vector2) {
    val _arg = Variant.new(relative)
    __method_bind.setRelative.call(this._handle, _arg, 1)
  }

  fun setSpeed(speed: Vector2) {
    val _arg = Variant.new(speed)
    __method_bind.setSpeed.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): InputEventScreenDrag = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventScreenDrag".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventScreenDrag" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventScreenDrag(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventScreenDrag = InputEventScreenDrag(ptr)
    /**
     * Container for method_bind pointers for InputEventScreenDrag
     */
    private object __method_bind {
      val getIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "getIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIndex" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "getPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPosition" }
        }
      val getRelative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "getRelative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRelative" }
        }
      val getSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "getSpeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpeed" }
        }
      val setIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "setIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIndex" }
        }
      val setPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "setPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPosition" }
        }
      val setRelative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "setRelative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRelative" }
        }
      val setSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventScreenDrag".cstr.ptr,
            "setSpeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSpeed" }
        }}
  }
}
