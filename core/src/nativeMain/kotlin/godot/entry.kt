package godot

import gdnative.godot_gdnative_init_options
import gdnative.godot_gdnative_terminate_options
import godot.core.GDString
import godot.core.Godot
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

fun init(options: godot_gdnative_init_options) {
  Godot.init(options)
}

fun terminate(options: godot_gdnative_terminate_options) {
  Godot.terminate(options)
}

fun nativescriptInit(handle: COpaquePointer, setup: ClassRegistry.() -> Unit) {
  Godot.nativescriptInit(handle)
  TagDB.initTagDB()
  setup(ClassRegistry(handle))
}

fun nativescriptTerminate(handle: COpaquePointer) {
  TagDB.terminate()
  Godot.nativescriptTerminate(handle)
}

fun gprint(msg: Any) {
  val str = GDString(msg.toString())
  print(str)
  str.destroy()
}

internal fun print(msg: GDString) {
  memScoped {
    checkNotNull(Godot.gdnative.godot_print)(msg._value.ptr)
  }
}