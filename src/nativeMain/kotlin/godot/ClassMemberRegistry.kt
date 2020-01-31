package godot

import gdnative.*
import godot.core.Godot
import godot.core.Variant
import kotlinx.cinterop.*
import kotlin.math.sign

abstract class ClassMemberRegistry<T: Object>(val handle: COpaquePointer, val className: String) {
  private val properties = mutableListOf<StableRef<MutablePropertyHandler<Object, Any>>>()
  private val methods = mutableListOf<StableRef<Method<Object, Any>>>()
  @PublishedApi
  internal val signals = mutableMapOf<String, Signal>()

  @PublishedApi
  internal fun <T: Object, R> track(handler: MutablePropertyHandler<T, R>): COpaquePointer {
    val ref = StableRef.create(handler as MutablePropertyHandler<Object, Any>)
    properties.add(ref)
    return ref.asCPointer()
  }

  @PublishedApi
  internal fun <T: Object, R> track(handler: Method<T, R>): COpaquePointer {
    val ref = StableRef.create(handler as Method<Object, Any>)
    methods.add(ref)
    return ref.asCPointer()
  }

  internal fun initializeDefaultValues(instance: T) {
    properties.forEach {
      it.get().initializeDefaultValue(instance)
    }
  }

  internal fun destroy() {
    properties.forEach { it.dispose() }
    methods.forEach { it.dispose() }
  }

  @PublishedApi
  internal fun doRegisterMethod(className: String, methodName: String, methodRef: COpaquePointer) {
    memScoped {
      val attribs = cValue<godot_method_attributes> {
        rpc_type = GODOT_METHOD_RPC_MODE_DISABLED
      }

      val instanceMethod = cValue<godot_instance_method> {
        method_data = methodRef
        this.method = staticCFunction(::invokeMethod)
      }

      checkNotNull(Godot.nativescript.godot_nativescript_register_method)(
        handle,
        className.cstr.ptr,
        methodName.cstr.ptr,
        attribs,
        instanceMethod
      )
    }
  }

  @PublishedApi
  internal fun doRegisterSignal(className: String, signalName: String, signal: Signal, parameterTypes: Map<String, Variant.Type>) {
    signals[signalName] = signal
    memScoped {
      val gdSignal = alloc<godot_signal> {
        val argInfos = allocArray<godot_signal_argument>(parameterTypes.size)
        parameterTypes.keys.forEachIndexed { index, key ->
          val argInfo = argInfos[index]
          val value = parameterTypes.getValue(key)
          // argument name
          checkNotNull(Godot.gdnative.godot_string_parse_utf8)(argInfo.name.ptr, key.cstr.ptr)
          // argument type
          argInfo.type = value.value
        }
        args = argInfos.getPointer(this@memScoped)
        checkNotNull(Godot.gdnative.godot_string_parse_utf8)(name.ptr, signalName.cstr.ptr)
        num_args = parameterTypes.size
      }
      checkNotNull(Godot.nativescript.godot_nativescript_register_signal)(
        handle,
        className.cstr.ptr,
        gdSignal.ptr
      )
    }
  }

  @PublishedApi
  internal fun doRegisterProperty(
    className: String,
    propertyName: String,
    propertyHandleRef: COpaquePointer,
    propertyType: Variant.Type,
    hint: PropertyHint<out Any> = PropertyHint.none(),
    default: Variant? = null) {
    memScoped {
      val usageFlags = GODOT_PROPERTY_USAGE_DEFAULT or GODOT_PROPERTY_USAGE_SCRIPT_VARIABLE
      val attribs = alloc<godot_property_attributes> {
        rset_type = GODOT_METHOD_RPC_MODE_DISABLED
        usage = usageFlags
        type = propertyType.value
        this.hint = checkNotNull(hint.hint)
        checkNotNull(Godot.gdnative.godot_string_parse_utf8)(hint_string.ptr, hint.hintString.cstr.ptr)
        if (default != null) {
          checkNotNull(Godot.gdnative.godot_variant_new_copy)(default_value.ptr, default._value.ptr)
        }
      }

      val getter = cValue<godot_property_get_func> {
        method_data = propertyHandleRef
        get_func = staticCFunction(::getProperty)
      }

      val setter = cValue<godot_property_set_func> {
        method_data = propertyHandleRef
        set_func = staticCFunction(::setProperty)
      }

      checkNotNull(Godot.nativescript.godot_nativescript_register_property)(
        handle,
        className.cstr.ptr,
        propertyName.cstr.ptr,
        attribs.ptr,
        setter,
        getter
      )
    }
  }
}

