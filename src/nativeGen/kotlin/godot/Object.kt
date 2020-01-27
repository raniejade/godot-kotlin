// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolStringArray
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

open class Object internal constructor(
  internal val _handle: COpaquePointer
) {
  fun addUserSignal(signal: String, arguments: VariantArray) {
    val _args = VariantArray.new()
    _args.append(signal)
    _args.append(arguments)
    __method_bind.add_user_signal.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun call(method: String): Variant {
    val _arg = Variant.new(method)
    val _ret = __method_bind.call.call(this.toVariant(), _arg, 1)
    return _ret
  }

  fun callDeferred(method: String): Variant {
    val _arg = Variant.new(method)
    val _ret = __method_bind.call_deferred.call(this.toVariant(), _arg, 1)
    return _ret
  }

  fun callv(method: String, argArray: VariantArray): Variant {
    val _args = VariantArray.new()
    _args.append(method)
    _args.append(argArray)
    val _ret = __method_bind.callv.call(this.toVariant(), _args.toVariant(), 2)
    return _ret
  }

  fun canTranslateMessages(): Boolean {
    val _ret = __method_bind.can_translate_messages.call(this.toVariant())
    return _ret.asBool()
  }

  fun connect(
    signal: String,
    target: Object,
    method: String,
    binds: VariantArray,
    flags: Int
  ): GDError {
    val _args = VariantArray.new()
    _args.append(signal)
    _args.append(target)
    _args.append(method)
    _args.append(binds)
    _args.append(flags)
    val _ret = __method_bind.connect.call(this.toVariant(), _args.toVariant(), 5)
    return GDError.from(_ret.asInt())
  }

  fun disconnect(
    signal: String,
    target: Object,
    method: String
  ) {
    val _args = VariantArray.new()
    _args.append(signal)
    _args.append(target)
    _args.append(method)
    __method_bind.disconnect.call(this.toVariant(), _args.toVariant(), 3)
  }

  fun emitSignal(signal: String): Variant {
    val _arg = Variant.new(signal)
    val _ret = __method_bind.emit_signal.call(this.toVariant(), _arg, 1)
    return _ret
  }

  fun free() {
    __method_bind.free.call(this.toVariant())
  }

  fun get(property: String): Variant {
    val _arg = Variant.new(property)
    val _ret = __method_bind.get.call(this.toVariant(), _arg, 1)
    return _ret
  }

  fun getClass(): String {
    val _ret = __method_bind.get_class.call(this.toVariant())
    return _ret.asString()
  }

  fun getIncomingConnections(): VariantArray {
    val _ret = __method_bind.get_incoming_connections.call(this.toVariant())
    return _ret.asArray()
  }

  fun getIndexed(property: NodePath): Variant {
    val _arg = Variant.new(property)
    val _ret = __method_bind.get_indexed.call(this.toVariant(), _arg, 1)
    return _ret
  }

  fun getInstanceId(): Int {
    val _ret = __method_bind.get_instance_id.call(this.toVariant())
    return _ret.asInt()
  }

  fun getMeta(name: String): Variant {
    val _arg = Variant.new(name)
    val _ret = __method_bind.get_meta.call(this.toVariant(), _arg, 1)
    return _ret
  }

  fun getMetaList(): PoolStringArray {
    val _ret = __method_bind.get_meta_list.call(this.toVariant())
    return _ret.asPoolStringArray()
  }

  fun getMethodList(): VariantArray {
    val _ret = __method_bind.get_method_list.call(this.toVariant())
    return _ret.asArray()
  }

  fun getPropertyList(): VariantArray {
    val _ret = __method_bind.get_property_list.call(this.toVariant())
    return _ret.asArray()
  }

  fun getScript(): Reference {
    val _ret = __method_bind.get_script.call(this.toVariant())
    return _ret.asObject(::Reference)!!
  }

  fun getSignalConnectionList(signal: String): VariantArray {
    val _arg = Variant.new(signal)
    val _ret = __method_bind.get_signal_connection_list.call(this.toVariant(), _arg, 1)
    return _ret.asArray()
  }

  fun getSignalList(): VariantArray {
    val _ret = __method_bind.get_signal_list.call(this.toVariant())
    return _ret.asArray()
  }

  fun hasMeta(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.has_meta.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun hasMethod(method: String): Boolean {
    val _arg = Variant.new(method)
    val _ret = __method_bind.has_method.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun hasUserSignal(signal: String): Boolean {
    val _arg = Variant.new(signal)
    val _ret = __method_bind.has_user_signal.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun isBlockingSignals(): Boolean {
    val _ret = __method_bind.is_blocking_signals.call(this.toVariant())
    return _ret.asBool()
  }

  fun isClass(type: String): Boolean {
    val _arg = Variant.new(type)
    val _ret = __method_bind.is_class.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun isConnected(
    signal: String,
    target: Object,
    method: String
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(signal)
    _args.append(target)
    _args.append(method)
    val _ret = __method_bind.is_connected.call(this.toVariant(), _args.toVariant(), 3)
    return _ret.asBool()
  }

  fun isQueuedForDeletion(): Boolean {
    val _ret = __method_bind.is_queued_for_deletion.call(this.toVariant())
    return _ret.asBool()
  }

  fun notification(what: Int, reversed: Boolean) {
    val _args = VariantArray.new()
    _args.append(what)
    _args.append(reversed)
    __method_bind.notification.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun propertyListChangedNotify() {
    __method_bind.property_list_changed_notify.call(this.toVariant())
  }

  fun removeMeta(name: String) {
    val _arg = Variant.new(name)
    __method_bind.remove_meta.call(this.toVariant(), _arg, 1)
  }

  fun set(property: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(property)
    _args.append(value)
    __method_bind.set.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setBlockSignals(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_block_signals.call(this.toVariant(), _arg, 1)
  }

  fun setDeferred(property: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(property)
    _args.append(value)
    __method_bind.set_deferred.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setIndexed(property: NodePath, value: Variant) {
    val _args = VariantArray.new()
    _args.append(property)
    _args.append(value)
    __method_bind.set_indexed.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setMessageTranslation(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_message_translation.call(this.toVariant(), _arg, 1)
  }

  fun setMeta(name: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(value)
    __method_bind.set_meta.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setScript(script: Reference) {
    val _arg = Variant.new(script)
    __method_bind.set_script.call(this.toVariant(), _arg, 1)
  }

  override fun toString(): String {
    val _ret = __method_bind.to_string.call(this.toVariant())
    return _ret.asString()
  }

  fun tr(message: String): String {
    val _arg = Variant.new(message)
    val _ret = __method_bind.tr.call(this.toVariant(), _arg, 1)
    return _ret.asString()
  }

  enum class ConnectFlags(
    val value: Int
  ) {
    CONNECT_DEFERRED(1),

    CONNECT_PERSIST(2),

    CONNECT_ONESHOT(4),

    CONNECT_REFERENCE_COUNTED(8);

    companion object {
      fun from(value: Int): ConnectFlags {
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
    val CONNECT_DEFERRED: Int = 1

    val CONNECT_ONESHOT: Int = 4

    val CONNECT_PERSIST: Int = 2

    val CONNECT_REFERENCE_COUNTED: Int = 8

    val NOTIFICATION_POSTINITIALIZE: Int = 0

    val NOTIFICATION_PREDELETE: Int = 1

    fun new(): Object = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Object".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Object" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Object(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Object = Object(ptr)
    /**
     * Container for method_bind pointers for Object
     */
    private object __method_bind {
      val add_user_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "add_user_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_user_signal" }
            }
          }

      val call: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "call".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method call" }
            }
          }

      val call_deferred: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "call_deferred".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method call_deferred" }
            }
          }

      val callv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "callv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method callv" }
            }
          }

      val can_translate_messages: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "can_translate_messages".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method can_translate_messages" }
            }
          }

      val connect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "connect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect" }
            }
          }

      val disconnect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "disconnect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect" }
            }
          }

      val emit_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "emit_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method emit_signal" }
            }
          }

      val free: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "free".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method free" }
            }
          }

      val get: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "get".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get" }
            }
          }

      val get_class: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "get_class".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_class" }
            }
          }

      val get_incoming_connections: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "get_incoming_connections".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_incoming_connections" }
            }
          }

      val get_indexed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "get_indexed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_indexed" }
            }
          }

      val get_instance_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "get_instance_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_instance_id" }
            }
          }

      val get_meta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "get_meta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_meta" }
            }
          }

      val get_meta_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "get_meta_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_meta_list" }
            }
          }

      val get_method_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "get_method_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_method_list" }
            }
          }

      val get_property_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "get_property_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_property_list" }
            }
          }

      val get_script: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "get_script".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_script" }
            }
          }

      val get_signal_connection_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "get_signal_connection_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_signal_connection_list" }
            }
          }

      val get_signal_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "get_signal_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_signal_list" }
            }
          }

      val has_meta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "has_meta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_meta" }
            }
          }

      val has_method: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "has_method".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_method" }
            }
          }

      val has_user_signal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "has_user_signal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_user_signal" }
            }
          }

      val is_blocking_signals: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "is_blocking_signals".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_blocking_signals" }
            }
          }

      val is_class: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "is_class".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_class" }
            }
          }

      val is_connected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "is_connected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_connected" }
            }
          }

      val is_queued_for_deletion: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "is_queued_for_deletion".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_queued_for_deletion" }
            }
          }

      val notification: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "notification".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method notification" }
            }
          }

      val property_list_changed_notify: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "property_list_changed_notify".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method property_list_changed_notify" }
            }
          }

      val remove_meta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "remove_meta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_meta" }
            }
          }

      val set: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "set".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set" }
            }
          }

      val set_block_signals: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "set_block_signals".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_block_signals" }
            }
          }

      val set_deferred: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "set_deferred".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_deferred" }
            }
          }

      val set_indexed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "set_indexed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_indexed" }
            }
          }

      val set_message_translation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "set_message_translation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_message_translation" }
            }
          }

      val set_meta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "set_meta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_meta" }
            }
          }

      val set_script: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "set_script".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_script" }
            }
          }

      val to_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "to_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method to_string" }
            }
          }

      val tr: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
              "tr".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tr" }
            }
          }
    }
  }
}
