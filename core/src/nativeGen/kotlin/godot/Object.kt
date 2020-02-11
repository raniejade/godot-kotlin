// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Object(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) {
  internal lateinit var _handle: COpaquePointer

  /**
   * Object::script_changed signal
   */
  val signalScriptChanged: Signal0 = Signal0("script_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addUserSignal(signal: String, arguments: VariantArray) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(signal))
    _args.add(Variant.fromAny(arguments))
    __method_bind.addUserSignal.call(this._handle, _args)
  }

  fun call(method: String, vararg varargs: Any?): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(method))
    varargs.forEach { _args.add(Variant.fromAny(it)) }
    val _ret = __method_bind.call.call(this._handle, _args)
    return _ret
  }

  fun callDeferred(method: String, vararg varargs: Any?) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(method))
    varargs.forEach { _args.add(Variant.fromAny(it)) }
    __method_bind.callDeferred.call(this._handle, _args)
  }

  fun callv(method: String, argArray: VariantArray): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(method))
    _args.add(Variant.fromAny(argArray))
    val _ret = __method_bind.callv.call(this._handle, _args)
    return _ret
  }

  fun canTranslateMessages(): Boolean {
    val _ret = __method_bind.canTranslateMessages.call(this._handle)
    return _ret.asBoolean()
  }

  fun connect(
    signal: String,
    target: Object,
    method: String,
    binds: VariantArray,
    flags: Int = 0
  ): GDError {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(signal))
    _args.add(Variant.fromAny(target))
    _args.add(Variant.fromAny(method))
    _args.add(Variant.fromAny(binds))
    _args.add(Variant.fromAny(flags))
    val _ret = __method_bind.connect.call(this._handle, _args)
    return GDError.from(_ret.asInt())
  }

  fun disconnect(
    signal: String,
    target: Object,
    method: String
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(signal))
    _args.add(Variant.fromAny(target))
    _args.add(Variant.fromAny(method))
    __method_bind.disconnect.call(this._handle, _args)
  }

  fun emitSignal(signal: String, vararg varargs: Any?) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(signal))
    varargs.forEach { _args.add(Variant.fromAny(it)) }
    __method_bind.emitSignal.call(this._handle, _args)
  }

  fun free() {
    __method_bind.free.call(this._handle)
  }

  fun get(property: String): Variant {
    val _arg = Variant(property)
    val _ret = __method_bind.get.call(this._handle, listOf(_arg))
    return _ret
  }

  fun getClass(): String {
    val _ret = __method_bind.getClass.call(this._handle)
    return _ret.asString()
  }

  fun getIncomingConnections(): VariantArray {
    val _ret = __method_bind.getIncomingConnections.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getIndexed(property: NodePath): Variant {
    val _arg = Variant(property)
    val _ret = __method_bind.getIndexed.call(this._handle, listOf(_arg))
    return _ret
  }

  fun getInstanceId(): Int {
    val _ret = __method_bind.getInstanceId.call(this._handle)
    return _ret.asInt()
  }

  fun getMeta(name: String): Variant {
    val _arg = Variant(name)
    val _ret = __method_bind.getMeta.call(this._handle, listOf(_arg))
    return _ret
  }

  fun getMetaList(): PoolStringArray {
    val _ret = __method_bind.getMetaList.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getMethodList(): VariantArray {
    val _ret = __method_bind.getMethodList.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getPropertyList(): VariantArray {
    val _ret = __method_bind.getPropertyList.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getScript(): Reference {
    val _ret = __method_bind.getScript.call(this._handle)
    return _ret.toAny() as Reference
  }

  fun getSignalConnectionList(signal: String): VariantArray {
    val _arg = Variant(signal)
    val _ret = __method_bind.getSignalConnectionList.call(this._handle, listOf(_arg))
    return _ret.asVariantArray()
  }

  fun getSignalList(): VariantArray {
    val _ret = __method_bind.getSignalList.call(this._handle)
    return _ret.asVariantArray()
  }

  fun hasMeta(name: String): Boolean {
    val _arg = Variant(name)
    val _ret = __method_bind.hasMeta.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun hasMethod(method: String): Boolean {
    val _arg = Variant(method)
    val _ret = __method_bind.hasMethod.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun hasUserSignal(signal: String): Boolean {
    val _arg = Variant(signal)
    val _ret = __method_bind.hasUserSignal.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isBlockingSignals(): Boolean {
    val _ret = __method_bind.isBlockingSignals.call(this._handle)
    return _ret.asBoolean()
  }

  fun isClass(`class`: String): Boolean {
    val _arg = Variant(`class`)
    val _ret = __method_bind.isClass.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isConnected(
    signal: String,
    target: Object,
    method: String
  ): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(signal))
    _args.add(Variant.fromAny(target))
    _args.add(Variant.fromAny(method))
    val _ret = __method_bind.isConnected.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun isQueuedForDeletion(): Boolean {
    val _ret = __method_bind.isQueuedForDeletion.call(this._handle)
    return _ret.asBoolean()
  }

  fun notification(what: Int, reversed: Boolean = false) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(what))
    _args.add(Variant.fromAny(reversed))
    __method_bind.notification.call(this._handle, _args)
  }

  fun propertyListChangedNotify() {
    __method_bind.propertyListChangedNotify.call(this._handle)
  }

  fun removeMeta(name: String) {
    val _arg = Variant(name)
    __method_bind.removeMeta.call(this._handle, listOf(_arg))
  }

  fun set(property: String, value: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(property))
    _args.add(Variant.fromAny(value))
    __method_bind.set.call(this._handle, _args)
  }

  fun setBlockSignals(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setBlockSignals.call(this._handle, listOf(_arg))
  }

  fun setDeferred(property: String, value: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(property))
    _args.add(Variant.fromAny(value))
    __method_bind.setDeferred.call(this._handle, _args)
  }

  fun setIndexed(property: NodePath, value: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(property))
    _args.add(Variant.fromAny(value))
    __method_bind.setIndexed.call(this._handle, _args)
  }

  fun setMessageTranslation(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setMessageTranslation.call(this._handle, listOf(_arg))
  }

  fun setMeta(name: String, value: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(value))
    __method_bind.setMeta.call(this._handle, _args)
  }

  fun setScript(script: Reference) {
    val _arg = Variant(script)
    __method_bind.setScript.call(this._handle, listOf(_arg))
  }

  override fun toString(): String {
    val _ret = __method_bind.toString.call(this._handle)
    return _ret.asString()
  }

  fun tr(message: String): String {
    val _arg = Variant(message)
    val _ret = __method_bind.tr.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  open fun _onInit() {
  }

  open fun _onDestroy() {
  }

  fun Signal0.emit() {
    emit(
      this@Object)
  }

  @Suppress("UNCHECKED_CAST")
  inline fun <reified K : () -> Unit> Signal0.connect(
    target: Object,
    method: K,
    binds: List<Any>? = null,
    flags: Int = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0> Signal1<A0>.emit(a0: A0) {
    emit(
      this@Object,
      a0)
  }

  @Suppress("UNCHECKED_CAST")
  inline fun <A0, reified K : (A0) -> Unit> Signal1<A0>.connect(
    target: Object,
    method: K,
    binds: List<Any>? = null,
    flags: Int = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1> Signal2<A0, A1>.emit(a0: A0, a1: A1) {
    emit(
      this@Object,
      a0,
      a1)
  }

  @Suppress("UNCHECKED_CAST")
  inline fun <A0, A1, reified K : (A0, A1) -> Unit> Signal2<A0, A1>.connect(
    target: Object,
    method: K,
    binds: List<Any>? = null,
    flags: Int = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2> Signal3<A0, A1, A2>.emit(
    a0: A0,
    a1: A1,
    a2: A2
  ) {
    emit(
      this@Object,
      a0,
      a1,
      a2)
  }

  @Suppress("UNCHECKED_CAST")
  inline fun <A0, A1, A2, reified K : (
    A0,
    A1,
    A2
  ) -> Unit> Signal3<A0, A1, A2>.connect(
    target: Object,
    method: K,
    binds: List<Any>? = null,
    flags: Int = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3> Signal4<A0, A1, A2, A3>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3
  ) {
    emit(
      this@Object,
      a0,
      a1,
      a2,
      a3)
  }

  @Suppress("UNCHECKED_CAST")
  inline fun <A0, A1, A2, A3, reified K : (
    A0,
    A1,
    A2,
    A3
  ) -> Unit> Signal4<A0, A1, A2, A3>.connect(
    target: Object,
    method: K,
    binds: List<Any>? = null,
    flags: Int = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4> Signal5<A0, A1, A2, A3, A4>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4
  ) {
    emit(
      this@Object,
      a0,
      a1,
      a2,
      a3,
      a4)
  }

  @Suppress("UNCHECKED_CAST")
  inline fun <A0, A1, A2, A3, A4, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4
  ) -> Unit> Signal5<A0, A1, A2, A3, A4>.connect(
    target: Object,
    method: K,
    binds: List<Any>? = null,
    flags: Int = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4, A5> Signal6<A0, A1, A2, A3, A4, A5>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5
  ) {
    emit(
      this@Object,
      a0,
      a1,
      a2,
      a3,
      a4,
      a5)
  }

  @Suppress("UNCHECKED_CAST")
  inline fun <A0, A1, A2, A3, A4, A5, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5
  ) -> Unit> Signal6<A0, A1, A2, A3, A4, A5>.connect(
    target: Object,
    method: K,
    binds: List<Any>? = null,
    flags: Int = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4, A5, A6> Signal7<A0, A1, A2, A3, A4, A5, A6>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6
  ) {
    emit(
      this@Object,
      a0,
      a1,
      a2,
      a3,
      a4,
      a5,
      a6)
  }

  @Suppress("UNCHECKED_CAST")
  inline fun <A0, A1, A2, A3, A4, A5, A6, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6
  ) -> Unit> Signal7<A0, A1, A2, A3, A4, A5, A6>.connect(
    target: Object,
    method: K,
    binds: List<Any>? = null,
    flags: Int = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4, A5, A6, A7> Signal8<A0, A1, A2, A3, A4, A5, A6, A7>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7
  ) {
    emit(
      this@Object,
      a0,
      a1,
      a2,
      a3,
      a4,
      a5,
      a6,
      a7)
  }

  @Suppress("UNCHECKED_CAST")
  inline fun <A0, A1, A2, A3, A4, A5, A6, A7, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7
  ) -> Unit> Signal8<A0, A1, A2, A3, A4, A5, A6, A7>.connect(
    target: Object,
    method: K,
    binds: List<Any>? = null,
    flags: Int = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4, A5, A6, A7, A8> Signal9<A0, A1, A2, A3, A4, A5, A6, A7, A8>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7,
    a8: A8
  ) {
    emit(
      this@Object,
      a0,
      a1,
      a2,
      a3,
      a4,
      a5,
      a6,
      a7,
      a8)
  }

  @Suppress("UNCHECKED_CAST")
  inline fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7,
    A8
  ) -> Unit> Signal9<A0, A1, A2, A3, A4, A5, A6, A7, A8>.connect(
    target: Object,
    method: K,
    binds: List<Any>? = null,
    flags: Int = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, A9> Signal10<A0, A1, A2, A3, A4, A5, A6, A7, A8,
      A9>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7,
    a8: A8,
    a9: A9
  ) {
    emit(
      this@Object,
      a0,
      a1,
      a2,
      a3,
      a4,
      a5,
      a6,
      a7,
      a8,
      a9)
  }

  @Suppress("UNCHECKED_CAST")
  inline fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7,
    A8,
    A9
  ) -> Unit> Signal10<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9>.connect(
    target: Object,
    method: K,
    binds: List<Any>? = null,
    flags: Int = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  enum class ConnectFlags(
    val value: Int
  ) {
    DEFERRED(1),

    PERSIST(2),

    ONESHOT(4),

    REFERENCE_COUNTED(8);

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
    val NOTIFICATION_POSTINITIALIZE: Int = 0

    val NOTIFICATION_PREDELETE: Int = 1

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Object".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Object" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Object
     */
    private object __method_bind {
      val addUserSignal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "add_user_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_user_signal" }
        }
      val call: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "call".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method call" }
        }
      val callDeferred: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "call_deferred".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method call_deferred" }
        }
      val callv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "callv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method callv" }
        }
      val canTranslateMessages: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "can_translate_messages".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_translate_messages" }
        }
      val connect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "connect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect" }
        }
      val disconnect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "disconnect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect" }
        }
      val emitSignal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "emit_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method emit_signal" }
        }
      val free: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "free".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method free" }
        }
      val get: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "get".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get" }
        }
      val getClass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "get_class".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_class" }
        }
      val getIncomingConnections: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "get_incoming_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_incoming_connections" }
        }
      val getIndexed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "get_indexed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_indexed" }
        }
      val getInstanceId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "get_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance_id" }
        }
      val getMeta: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "get_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_meta" }
        }
      val getMetaList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "get_meta_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_meta_list" }
        }
      val getMethodList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "get_method_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_method_list" }
        }
      val getPropertyList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "get_property_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_property_list" }
        }
      val getScript: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "get_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script" }
        }
      val getSignalConnectionList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "get_signal_connection_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_signal_connection_list" }
        }
      val getSignalList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "get_signal_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_signal_list" }
        }
      val hasMeta: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "has_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_meta" }
        }
      val hasMethod: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "has_method".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_method" }
        }
      val hasUserSignal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "has_user_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_user_signal" }
        }
      val isBlockingSignals: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "is_blocking_signals".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_blocking_signals" }
        }
      val isClass: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "is_class".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_class" }
        }
      val isConnected: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "is_connected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_connected" }
        }
      val isQueuedForDeletion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "is_queued_for_deletion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_queued_for_deletion" }
        }
      val notification: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "notification".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method notification" }
        }
      val propertyListChangedNotify: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "property_list_changed_notify".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method property_list_changed_notify" }
        }
      val removeMeta: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "remove_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_meta" }
        }
      val set: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "set".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set" }
        }
      val setBlockSignals: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "set_block_signals".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_block_signals" }
        }
      val setDeferred: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "set_deferred".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_deferred" }
        }
      val setIndexed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "set_indexed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_indexed" }
        }
      val setMessageTranslation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "set_message_translation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_message_translation" }
        }
      val setMeta: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "set_meta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_meta" }
        }
      val setScript: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "set_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_script" }
        }
      val toString: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "to_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method to_string" }
        }
      val tr: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Object".cstr.ptr,
            "tr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tr" }
        }}
  }
}
