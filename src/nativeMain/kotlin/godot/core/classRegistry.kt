package godot.core

import gdnative.*
import godot.Object
import godot.Resource
import kotlinx.cinterop.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KCallable
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty

class ClassRegistry(val handle: COpaquePointer) {
  inline fun <reified S: Object, reified T: S> registerClass(info: GodotClass<S, T>) {
    val className = T::class.simpleName!!
    val superClassName = S::class.simpleName!!
    val classHandle = ClassHandle(handle, className, superClassName, info)
    classHandle.init()
  }
}

class ClassHandle<S: Object, T: S>(
  handle: COpaquePointer,
  className: String,
  val superClassName: String,
  val info: GodotClass<S, T>
) : ClassMemberRegistry<T>(handle, className) {
  fun create(instance: COpaquePointer): T {
    return info.factory(instance)
  }

  fun init() {
    memScoped {
      val methodData = StableRef.create(this@ClassHandle).asCPointer()
      // register constructor and destructor
      val create = cValue<godot_instance_create_func> {
        create_func = staticCFunction(::createInstance)
        method_data = methodData
      }
      val destroy = cValue<godot_instance_destroy_func> {
        destroy_func = staticCFunction(::destroyInstance)
        method_data = methodData
      }
      checkNotNull(Godot.nativescript.godot_nativescript_register_class)(
        handle,
        className.cstr.ptr,
        superClassName.cstr.ptr,
        create,
        destroy
      )
    }

    info.init(this)
  }
}

abstract class ClassMemberRegistry<T: Object>(val handle: COpaquePointer, val className: String) {
  private val properties = mutableListOf<StableRef<MutablePropertyHandler<Object, Any>>>()
  private val methods = mutableListOf<StableRef<MethodHandle<Object, Any>>>()

  @PublishedApi
  internal fun <T: Object, R> track(handler: MutablePropertyHandler<T, R>): COpaquePointer {
    val ref = StableRef.create(handler as MutablePropertyHandler<Object, Any>)
    properties.add(ref)
    return ref.asCPointer()
  }

  @PublishedApi
  internal fun <T: Object, R> track(handler: MethodHandle<T, R>): COpaquePointer {
    val ref = StableRef.create(handler as MethodHandle<Object, Any>)
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

  inline fun <R, reified K: (T) -> R> registerMethod(method: K) {
    val methodName = (method as KCallable<Unit>).name
    val methodHandle = MethodHandle0(method)
    val methodHandleRef = track(methodHandle)
    registerMethod(className, methodName, methodHandleRef)
  }

  inline fun <R, A1, reified K: (T, A1) -> R> registerMethod(method: K) {
    val methodName = (method as KCallable<Unit>).name
    val methodHandle = MethodHandle1(method)
    val methodHandleRef = track(methodHandle)
    registerMethod(className, methodName, methodHandleRef)
  }


  @PublishedApi
  internal fun registerMethod(className: String, methodName: String, methodHandleRef: COpaquePointer) {
    memScoped {
      val attribs = cValue<godot_method_attributes> {
        rpc_type = GODOT_METHOD_RPC_MODE_DISABLED
      }

      val instanceMethod = cValue<godot_instance_method> {
        method_data = methodHandleRef
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

  inline fun <T: Object, reified P: KMutableProperty1<T, Int>> registerProperty(
    property: P,
    default: Int = 0,
    hint: PropertyHint<Int> = PropertyHint.none()
  ) {
    val propertyName = property.name
    val variant = Variant.new(default)
    val handler = MutablePropertyHandler(property, variant)
    val propertyHandleRef = track(handler)
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.INT, hint = hint, default = variant)
  }

  inline fun <T: Object, reified P: KMutableProperty1<T, Float>> registerProperty(
    property: P,
    default: Float = 0f,
    hint: PropertyHint<Float> = PropertyHint.none()
  ) {
    val propertyName = property.name
    val variant = Variant.new(default)
    val handler = MutablePropertyHandler(property, variant)
    val propertyHandleRef = track(handler)
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.FLOAT, hint = hint, default = variant)
  }

  inline fun <T: Object, reified P: KMutableProperty1<T, String>> registerProperty(
    property: P,
    default: String = "",
    hint: PropertyHint<String> = PropertyHint.none()
  ) {
    val propertyName = property.name
    val variant = Variant.new(default)
    val handler = MutablePropertyHandler(property, variant)
    val propertyHandleRef = track(handler)
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.STRING, hint = hint, default = variant)
  }

  inline fun <T: Object, reified P: KMutableProperty1<T, Boolean>> registerProperty(property: P, default: Boolean = false) {
    val propertyName = property.name
    val variant = Variant.new(default)
    val handler = MutablePropertyHandler(property, variant)
    val propertyHandleRef = track(handler)
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.BOOL, default = variant)
  }

  inline fun <T: Object, reified P: KMutableProperty1<T, Color>> registerProperty(
    property: P,
    default: Color = Color.rgb(0, 0, 0),
    hint: PropertyHint<Color> = PropertyHint.rgba()
  ) {
    val propertyName = property.name
    val variant = default.toVariant()
    val handler = MutablePropertyHandler(property, variant)
    val propertyHandleRef = track(handler)
    registerProperty(className, propertyName, propertyHandleRef, Variant.Type.COLOR, hint = hint, default = variant)
  }

  inline fun <T: Object, reified R: Resource, reified P: KMutableProperty1<T, R>> registerProperty(property: P, noinline factory: (COpaquePointer) -> R) {
    val propertyName = property.name
    val variant = Variant.new()
    val handler = MutableObjectPropertyHandler(property, variant, factory)
    val propertyHandleRef = track(handler)
    registerProperty(
      className, propertyName, propertyHandleRef, Variant.Type.OBJECT, hint = PropertyHint.resource<R>(),
      default = variant
    )
  }

  inline fun <T: Object, reified R: Enum<R>, reified P: KMutableProperty1<T, R>> registerProperty(property: P, default: R? = null) {
    val propertyName = property.name
    val variant = if (default != null) {
      Variant.new(default.toString())
    } else {
      Variant.new(enumValues<R>()[0].toString())
    }
    val handler = MutableEnumProperty(property, variant) { name ->
      enumValueOf(name)
    }
    val propertyHandleRef = track(handler)
    registerProperty(
      className, propertyName, propertyHandleRef, Variant.Type.STRING,
      default = variant, hint = PropertyHint(godot_property_hint.GODOT_PROPERTY_HINT_ENUM, enumValues<R>().joinToString(","))
    )
  }

  // TODO: register core types & add default values

  @PublishedApi
  internal fun registerProperty(
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

fun createInstance(instance: COpaquePointer?, methodData: COpaquePointer?): COpaquePointer? {
  val classHandle = checkNotNull(methodData).asStableRef<ClassHandle<Object, Object>>()
    .get()
  val kotlinInstance = classHandle.create(checkNotNull(instance))
  classHandle.initializeDefaultValues(kotlinInstance)
  kotlinInstance._onInit()
  val stableRef = StableRef.create(kotlinInstance)
  return stableRef.asCPointer()
}

fun destroyInstance(instance: COpaquePointer?, methodData: COpaquePointer?, classData: COpaquePointer?) {
  val classHandleRef = checkNotNull(methodData).asStableRef<ClassHandle<Object, Object>>()
  val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
  val kotlinInstance = kotlinInstanceRef.get()
  kotlinInstance._onDestroy()
  classHandleRef.get().destroy()
  classHandleRef.dispose()
  kotlinInstanceRef.dispose()
}

abstract class GodotClass<S: Object, T: S>(
  val factory: (COpaquePointer) -> T
) {
  open fun init(registry: ClassMemberRegistry<T>) {}

  fun <R: Any> property(): ReadWriteProperty<T, R> {
    return object: ReadWriteProperty<T, R> {
      private lateinit var value: R
      override fun getValue(thisRef: T, property: KProperty<*>): R {
        return value
      }

      override fun setValue(thisRef: T, property: KProperty<*>, value: R) {
        this.value = value
      }
    }
  }
}
