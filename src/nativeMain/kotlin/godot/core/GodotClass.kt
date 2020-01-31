package godot.core

import godot.Object
import kotlinx.cinterop.COpaquePointer
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

abstract class GodotClass<S: Object, T: S>(
  val factory: (COpaquePointer) -> T
) {
  open fun init(registry: ClassMemberRegistry<T>) {}

  private class PropertyDelegate<T, R: Any> : ReadWriteProperty<T, R> {
    private lateinit var value: R
    override inline fun getValue(thisRef: T, property: KProperty<*>): R {
      return value
    }

    override inline fun setValue(thisRef: T, property: KProperty<*>, value: R) {
      this.value = value
    }
  }

  fun intProperty(): ReadWriteProperty<T, Int> = PropertyDelegate()
  fun floatProperty(): ReadWriteProperty<T, Float> = PropertyDelegate()
  fun stringProperty(): ReadWriteProperty<T, String> = PropertyDelegate()
  fun booleanProperty(): ReadWriteProperty<T, Boolean> = PropertyDelegate()
  fun <R: CoreType<*>> property(): ReadWriteProperty<T, R> = PropertyDelegate()
}