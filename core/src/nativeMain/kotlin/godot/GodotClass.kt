package godot

import godot.core.CoreType
import kotlinx.cinterop.COpaquePointer
import kotlin.native.concurrent.AtomicReference
import kotlin.native.concurrent.freeze
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

abstract class GodotClass<S: Object, T: S>(
  val factory: () -> T
) {

  internal val _signals = AtomicReference<Map<String, Signal>>(emptyMap())

  @PublishedApi
  internal fun signals(): Map<String, Signal> {
    return _signals.value
  }

  internal fun setup(registry: ClassMemberRegistry<T>) {
    init(registry)
    _signals.compareAndSet(_signals.value, registry.signals.toMap().freeze())
  }

  open fun init(registry: ClassMemberRegistry<T>) {}

  private class PropertyDelegate<T, R: Any>(val changeListener: ChangeListener<T, R>) : ReadWriteProperty<T, R> {
    private lateinit var value: R
    override fun getValue(thisRef: T, property: KProperty<*>): R {
      return value
    }

    override fun setValue(thisRef: T, property: KProperty<*>, value: R) {
      val oldValue = if (this::value.isInitialized) {
        this.value
      } else {
        null
      }
      this.value = value
      changeListener(thisRef, oldValue, value)
    }
  }

  fun <T: Object> intProperty(changeListener: ChangeListener<T, Int> = { _, _ -> }): ReadWriteProperty<T, Int> = PropertyDelegate(changeListener)
  fun <T: Object> floatProperty(changeListener: ChangeListener<T, Float> = { _, _ -> }): ReadWriteProperty<T, Float> = PropertyDelegate(changeListener)
  fun <T: Object> stringProperty(changeListener: ChangeListener<T, String> = { _, _ -> }): ReadWriteProperty<T, String> = PropertyDelegate(changeListener)
  fun <T: Object>booleanProperty(changeListener: ChangeListener<T, Boolean> = { _, _ -> }): ReadWriteProperty<T, Boolean> = PropertyDelegate(changeListener)
  fun <T: Object, R: CoreType<*>> property(changeListener: ChangeListener<T, R> = { _, _ -> }): ReadWriteProperty<T, R> = PropertyDelegate(changeListener)
}