// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolByteArray
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
    TODO()
  }

  fun getAttributeName(idx: Int): String {
    TODO()
  }

  fun getAttributeValue(idx: Int): String {
    TODO()
  }

  fun getCurrentLine(): Int {
    TODO()
  }

  fun getNamedAttributeValue(name: String): String {
    TODO()
  }

  fun getNamedAttributeValueSafe(name: String): String {
    TODO()
  }

  fun getNodeData(): String {
    TODO()
  }

  fun getNodeName(): String {
    TODO()
  }

  fun getNodeOffset(): Int {
    TODO()
  }

  fun getNodeType(): NodeType {
    TODO()
  }

  fun hasAttribute(name: String): Boolean {
    TODO()
  }

  fun isEmpty(): Boolean {
    TODO()
  }

  fun open(file: String): Error {
    TODO()
  }

  fun openBuffer(buffer: PoolByteArray): Error {
    TODO()
  }

  fun read(): Error {
    TODO()
  }

  fun seek(position: Int): Error {
    TODO()
  }

  fun skipSection() {
    TODO()
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
      requireNotNull(fnPtr) { "No instance found for singleton XMLParser" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      XMLParser(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for XMLParser
     */
    private object __method_bind {
      val get_attribute_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_attribute_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_attribute_count" }
            }
          }

      val get_attribute_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_attribute_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_attribute_name" }
            }
          }

      val get_attribute_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_attribute_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_attribute_value" }
            }
          }

      val get_current_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_current_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_line" }
            }
          }

      val get_named_attribute_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_named_attribute_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_named_attribute_value" }
            }
          }

      val get_named_attribute_value_safe: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_named_attribute_value_safe".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_named_attribute_value_safe"
              }
            }
          }

      val get_node_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_node_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_data" }
            }
          }

      val get_node_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_node_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_name" }
            }
          }

      val get_node_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_node_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_offset" }
            }
          }

      val get_node_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "get_node_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_type" }
            }
          }

      val has_attribute: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "has_attribute".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_attribute" }
            }
          }

      val is_empty: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "is_empty".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_empty" }
            }
          }

      val open: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "open".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open" }
            }
          }

      val open_buffer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "open_buffer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method open_buffer" }
            }
          }

      val read: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "read".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method read" }
            }
          }

      val seek: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "seek".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method seek" }
            }
          }

      val skip_section: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("XMLParser".cstr.ptr,
              "skip_section".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method skip_section" }
            }
          }
    }
  }
}
