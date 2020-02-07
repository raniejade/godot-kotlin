// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
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

open class CharFXTransform(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  var absoluteIndex: Int
    get() {
       return getAbsoluteIndex() 
    }
    set(value) {
      setAbsoluteIndex(value)
    }

  var character: Int
    get() {
       return getCharacter() 
    }
    set(value) {
      setCharacter(value)
    }

  var color: Color
    get() {
       return getColor() 
    }
    set(value) {
      setColor(value)
    }

  var elapsedTime: Float
    get() {
       return getElapsedTime() 
    }
    set(value) {
      setElapsedTime(value)
    }

  var env: Dictionary
    get() {
       return getEnvironment() 
    }
    set(value) {
      setEnvironment(value)
    }

  var offset: Vector2
    get() {
       return getOffset() 
    }
    set(value) {
      setOffset(value)
    }

  var relativeIndex: Int
    get() {
       return getRelativeIndex() 
    }
    set(value) {
      setRelativeIndex(value)
    }

  var visible: Boolean
    get() {
       return isVisible() 
    }
    set(value) {
      setVisibility(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for color
   */
  fun color(cb: Color.() -> Unit) {
    val _p = color
    cb(_p)
    color = _p
  }

  /**
   * Specialized setter for env
   */
  fun env(cb: Dictionary.() -> Unit) {
    val _p = env
    cb(_p)
    env = _p
  }

  /**
   * Specialized setter for offset
   */
  fun offset(cb: Vector2.() -> Unit) {
    val _p = offset
    cb(_p)
    offset = _p
  }

  fun getAbsoluteIndex(): Int {
    val _ret = __method_bind.getAbsoluteIndex.call(this._handle)
    return _ret.asInt()
  }

  fun getCharacter(): Int {
    val _ret = __method_bind.getCharacter.call(this._handle)
    return _ret.asInt()
  }

  fun getColor(): Color {
    val _ret = __method_bind.getColor.call(this._handle)
    return _ret.asColor()
  }

  fun getElapsedTime(): Float {
    val _ret = __method_bind.getElapsedTime.call(this._handle)
    return _ret.asFloat()
  }

  fun getEnvironment(): Dictionary {
    val _ret = __method_bind.getEnvironment.call(this._handle)
    return _ret.asDictionary()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.getOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getRelativeIndex(): Int {
    val _ret = __method_bind.getRelativeIndex.call(this._handle)
    return _ret.asInt()
  }

  fun isVisible(): Boolean {
    val _ret = __method_bind.isVisible.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAbsoluteIndex(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.setAbsoluteIndex.call(this._handle, listOf(_arg))
  }

  fun setCharacter(character: Int) {
    val _arg = Variant.new(character)
    __method_bind.setCharacter.call(this._handle, listOf(_arg))
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setColor.call(this._handle, listOf(_arg))
  }

  fun setElapsedTime(time: Float) {
    val _arg = Variant.new(time)
    __method_bind.setElapsedTime.call(this._handle, listOf(_arg))
  }

  fun setEnvironment(environment: Dictionary) {
    val _arg = Variant.new(environment)
    __method_bind.setEnvironment.call(this._handle, listOf(_arg))
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.setOffset.call(this._handle, listOf(_arg))
  }

  fun setRelativeIndex(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.setRelativeIndex.call(this._handle, listOf(_arg))
  }

  fun setVisibility(visibility: Boolean) {
    val _arg = Variant.new(visibility)
    __method_bind.setVisibility.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CharFXTransform".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CharFXTransform" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for CharFXTransform
     */
    private object __method_bind {
      val getAbsoluteIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "get_absolute_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_absolute_index" }
        }
      val getCharacter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "get_character".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_character" }
        }
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getElapsedTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "get_elapsed_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_elapsed_time" }
        }
      val getEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "get_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_environment" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val getRelativeIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "get_relative_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_relative_index" }
        }
      val isVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "is_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_visible" }
        }
      val setAbsoluteIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "set_absolute_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_absolute_index" }
        }
      val setCharacter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "set_character".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_character" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val setElapsedTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "set_elapsed_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_elapsed_time" }
        }
      val setEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "set_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_environment" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val setRelativeIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "set_relative_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_relative_index" }
        }
      val setVisibility: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
            "set_visibility".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_visibility" }
        }}
  }
}
