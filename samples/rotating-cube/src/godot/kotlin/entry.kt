// GENERATED FILE, DO NOT EDIT!
import gdnative.godot_gdnative_init_options
import gdnative.godot_gdnative_terminate_options
import kotlin.native.CName
import kotlinx.cinterop.COpaquePointer

@CName("godot_gdnative_init")
fun godot_gdnative_init(options: godot_gdnative_init_options) {
  godot.init(options)
}

@CName("godot_gdnative_terminate")
fun godot_gdnative_terminate(options: godot_gdnative_terminate_options) {
  godot.terminate(options)
}

@CName("godot_nativescript_init")
fun godot_nativescript_init(handle: COpaquePointer) {
  godot.nativescriptInit(handle) {
    registerClass(RotatingCube)
  }
}
