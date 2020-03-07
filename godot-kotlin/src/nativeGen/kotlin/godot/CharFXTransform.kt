// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAbsoluteIndex.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCharacter(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCharacter.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getElapsedTime(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getElapsedTime.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getEnvironment(): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getEnvironment.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRelativeIndex(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRelativeIndex.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isVisible(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isVisible.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAbsoluteIndex(index: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAbsoluteIndex.call(self._handle, listOf(index), null)
    }
  }

  fun setCharacter(character: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCharacter.call(self._handle, listOf(character), null)
    }
  }

  fun setColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setColor.call(self._handle, listOf(color), null)
    }
  }

  fun setElapsedTime(time: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setElapsedTime.call(self._handle, listOf(time), null)
    }
  }

  fun setEnvironment(environment: Dictionary) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnvironment.call(self._handle, listOf(environment), null)
    }
  }

  fun setOffset(offset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOffset.call(self._handle, listOf(offset), null)
    }
  }

  fun setRelativeIndex(index: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRelativeIndex.call(self._handle, listOf(index), null)
    }
  }

  fun setVisibility(visibility: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVisibility.call(self._handle, listOf(visibility), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
      val getAbsoluteIndex: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "get_absolute_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_absolute_index" }
            }
          }

      val getCharacter: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "get_character".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_character" }
            }
          }

      val getColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "get_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color" }
            }
          }

      val getElapsedTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "get_elapsed_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_elapsed_time" }
            }
          }

      val getEnvironment: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "get_environment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_environment" }
            }
          }

      val getOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val getRelativeIndex: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "get_relative_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_relative_index" }
            }
          }

      val isVisible: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "is_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_visible" }
            }
          }

      val setAbsoluteIndex: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "set_absolute_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_absolute_index" }
            }
          }

      val setCharacter: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "set_character".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_character" }
            }
          }

      val setColor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color" }
            }
          }

      val setElapsedTime: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "set_elapsed_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_elapsed_time" }
            }
          }

      val setEnvironment: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "set_environment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_environment" }
            }
          }

      val setOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "set_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offset" }
            }
          }

      val setRelativeIndex: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "set_relative_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_relative_index" }
            }
          }

      val setVisibility: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CharFXTransform".cstr.ptr,
              "set_visibility".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_visibility" }
            }
          }
    }
  }
}
