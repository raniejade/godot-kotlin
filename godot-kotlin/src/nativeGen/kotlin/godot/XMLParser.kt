// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class XMLParser(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAttributeCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAttributeCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getAttributeName(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getAttributeName.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getAttributeValue(idx: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getAttributeValue.call(self._handle, listOf(idx), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getCurrentLine(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCurrentLine.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getNamedAttributeValue(name: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getNamedAttributeValue.call(self._handle, listOf(name), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getNamedAttributeValueSafe(name: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getNamedAttributeValueSafe.call(self._handle, listOf(name), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getNodeData(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getNodeData.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getNodeName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getNodeName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getNodeOffset(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getNodeOffset.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getNodeType(): NodeType {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getNodeType.call(self._handle, emptyList(), _retPtr)
      XMLParser.NodeType.from(_ret.value)
    }
  }

  fun hasAttribute(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasAttribute.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun isEmpty(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEmpty.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun open(file: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.open.call(self._handle, listOf(file), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun openBuffer(buffer: PoolByteArray): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.openBuffer.call(self._handle, listOf(buffer), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun read(): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.read.call(self._handle, emptyList(), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun seek(position: Int): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.seek.call(self._handle, listOf(position), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun skipSection() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.skipSection.call(self._handle, emptyList(), null)
    }
  }

  enum class NodeType(
    val value: Int
  ) {
    NONE(0),

    ELEMENT(1),

    ELEMENT_END(2),

    TEXT(3),

    COMMENT(4),

    CDATA(5),

    UNKNOWN(6);

    companion object {
      fun from(value: Int): NodeType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("XMLParser".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for XMLParser" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for XMLParser
     */
    private object __method_bind {
      val getAttributeCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_attribute_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_attribute_count" }
            }
          }

      val getAttributeName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_attribute_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_attribute_name" }
            }
          }

      val getAttributeValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_attribute_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_attribute_value" }
            }
          }

      val getCurrentLine: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_current_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_line" }
            }
          }

      val getNamedAttributeValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_named_attribute_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_named_attribute_value" }
            }
          }

      val getNamedAttributeValueSafe: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_named_attribute_value_safe".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_named_attribute_value_safe"
              }
            }
          }

      val getNodeData: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_node_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_data" }
            }
          }

      val getNodeName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_node_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_name" }
            }
          }

      val getNodeOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_node_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_offset" }
            }
          }

      val getNodeType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_node_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_type" }
            }
          }

      val hasAttribute: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "has_attribute".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_attribute" }
            }
          }

      val isEmpty: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "is_empty".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_empty" }
            }
          }

      val open: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "open".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open" }
            }
          }

      val openBuffer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "open_buffer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open_buffer" }
            }
          }

      val read: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "read".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method read" }
            }
          }

      val seek: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "seek".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method seek" }
            }
          }

      val skipSection: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "skip_section".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method skip_section" }
            }
          }
    }
  }
}
