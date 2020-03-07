// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
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

open class Translation(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var locale: String
    get() {
       return getLocale() 
    }
    set(value) {
      setLocale(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _get_messages(): PoolStringArray {
    TODO()
  }

  open fun _set_messages(arg0: PoolStringArray) {
    TODO()
  }

  fun addMessage(srcMessage: String, xlatedMessage: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(srcMessage)
      _args.add(xlatedMessage)
      __method_bind.addMessage.call(self._handle, _args, null)
    }
  }

  fun eraseMessage(srcMessage: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.eraseMessage.call(self._handle, listOf(srcMessage), null)
    }
  }

  fun getLocale(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getLocale.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getMessage(srcMessage: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getMessage.call(self._handle, listOf(srcMessage), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getMessageCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMessageCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMessageList(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getMessageList.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setLocale(locale: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLocale.call(self._handle, listOf(locale), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Translation".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Translation" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Translation
     */
    private object __method_bind {
      val addMessage: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
              "add_message".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_message" }
            }
          }

      val eraseMessage: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
              "erase_message".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method erase_message" }
            }
          }

      val getLocale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
              "get_locale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_locale" }
            }
          }

      val getMessage: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
              "get_message".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_message" }
            }
          }

      val getMessageCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
              "get_message_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_message_count" }
            }
          }

      val getMessageList: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
              "get_message_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_message_list" }
            }
          }

      val setLocale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
              "set_locale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_locale" }
            }
          }
    }
  }
}
