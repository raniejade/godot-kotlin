// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
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

open class ResourceSaverInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun getRecognizedExtensions(type: Resource): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getRecognizedExtensions.call(self._handle, listOf(type), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun save(
    path: String,
    resource: Resource,
    flags: Int = 0
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(resource)
      _args.add(flags)
      __method_bind.save.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for ResourceSaver
     */
    private object __method_bind {
      val getRecognizedExtensions: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceSaver".cstr.ptr,
            "get_recognized_extensions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_recognized_extensions" }
        }
      val save: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_ResourceSaver".cstr.ptr,
            "save".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save" }
        }}
  }
}

object ResourceSaver : ResourceSaverInternal(null) {
  init {
    Allocator.allocationScope {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("ResourceSaver".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton ResourceSaver" }
      _handle = handle
    }
  }

  enum class SaverFlags(
    val value: Int
  ) {
    FLAG_RELATIVE_PATHS(1),

    FLAG_BUNDLE_RESOURCES(2),

    FLAG_CHANGE_PATH(4),

    FLAG_OMIT_EDITOR_PROPERTIES(8),

    FLAG_SAVE_BIG_ENDIAN(16),

    FLAG_COMPRESS(32),

    FLAG_REPLACE_SUBRESOURCE_PATHS(64);

    companion object {
      fun from(value: Int): SaverFlags {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }
}
