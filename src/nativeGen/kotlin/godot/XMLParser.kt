// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
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

open class XMLParser internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getAttributeCount(): Int {
    val _ret = __method_bind.get_attribute_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getAttributeName(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_attribute_name.call(this.toVariant(), _arg, 1)
    return _ret.asString()
  }

  fun getAttributeValue(idx: Int): String {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_attribute_value.call(this.toVariant(), _arg, 1)
    return _ret.asString()
  }

  fun getCurrentLine(): Int {
    val _ret = __method_bind.get_current_line.call(this.toVariant())
    return _ret.asInt()
  }

  fun getNamedAttributeValue(name: String): String {
    val _arg = Variant.new(name)
    val _ret = __method_bind.get_named_attribute_value.call(this.toVariant(), _arg, 1)
    return _ret.asString()
  }

  fun getNamedAttributeValueSafe(name: String): String {
    val _arg = Variant.new(name)
    val _ret = __method_bind.get_named_attribute_value_safe.call(this.toVariant(), _arg, 1)
    return _ret.asString()
  }

  fun getNodeData(): String {
    val _ret = __method_bind.get_node_data.call(this.toVariant())
    return _ret.asString()
  }

  fun getNodeName(): String {
    val _ret = __method_bind.get_node_name.call(this.toVariant())
    return _ret.asString()
  }

  fun getNodeOffset(): Int {
    val _ret = __method_bind.get_node_offset.call(this.toVariant())
    return _ret.asInt()
  }

  fun getNodeType(): NodeType {
    val _ret = __method_bind.get_node_type.call(this.toVariant())
    return XMLParser.NodeType.from(_ret.asInt())
  }

  fun hasAttribute(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.has_attribute.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun isEmpty(): Boolean {
    val _ret = __method_bind.is_empty.call(this.toVariant())
    return _ret.asBool()
  }

  fun open(file: String): GDError {
    val _arg = Variant.new(file)
    val _ret = __method_bind.open.call(this.toVariant(), _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun openBuffer(buffer: PoolByteArray): GDError {
    val _arg = Variant.new(buffer)
    val _ret = __method_bind.open_buffer.call(this.toVariant(), _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun read(): GDError {
    val _ret = __method_bind.read.call(this.toVariant())
    return GDError.from(_ret.asInt())
  }

  fun seek(position: Int): GDError {
    val _arg = Variant.new(position)
    val _ret = __method_bind.seek.call(this.toVariant(), _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun skipSection() {
    __method_bind.skip_section.call(this.toVariant())
  }

  enum class NodeType(
    val value: Int
  ) {
    NODE_NONE(0),

    NODE_ELEMENT(1),

    NODE_ELEMENT_END(2),

    NODE_TEXT(3),

    NODE_COMMENT(4),

    NODE_CDATA(5),

    NODE_UNKNOWN(6);

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
    val NODE_CDATA: Int = 5

    val NODE_COMMENT: Int = 4

    val NODE_ELEMENT: Int = 1

    val NODE_ELEMENT_END: Int = 2

    val NODE_NONE: Int = 0

    val NODE_TEXT: Int = 3

    val NODE_UNKNOWN: Int = 6

    fun new(): XMLParser = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("XMLParser".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for XMLParser" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      XMLParser(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): XMLParser = XMLParser(ptr)
    /**
     * Container for method_bind pointers for XMLParser
     */
    private object __method_bind {
      val get_attribute_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "get_attribute_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_attribute_count" }
        }
      val get_attribute_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "get_attribute_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_attribute_name" }
        }
      val get_attribute_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "get_attribute_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_attribute_value" }
        }
      val get_current_line: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "get_current_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_line" }
        }
      val get_named_attribute_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "get_named_attribute_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_named_attribute_value" }
        }
      val get_named_attribute_value_safe: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "get_named_attribute_value_safe".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_named_attribute_value_safe" }
        }
      val get_node_data: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "get_node_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_data" }
        }
      val get_node_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "get_node_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_name" }
        }
      val get_node_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "get_node_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_offset" }
        }
      val get_node_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "get_node_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_type" }
        }
      val has_attribute: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "has_attribute".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_attribute" }
        }
      val is_empty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "is_empty".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_empty" }
        }
      val open: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "open".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open" }
        }
      val open_buffer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "open_buffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open_buffer" }
        }
      val read: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "read".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method read" }
        }
      val seek: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "seek".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method seek" }
        }
      val skip_section: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
            "skip_section".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skip_section" }
        }}
  }
}
