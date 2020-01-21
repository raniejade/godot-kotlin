import gdnative.godot_gdnative_init_options
import gdnative.godot_gdnative_terminate_options
import godot.Godot
import kotlinx.cinterop.COpaquePointer

@CName("godot_gdnative_init")
fun godot_gdnative_init(options: godot_gdnative_init_options) {
    Godot.init(options)
    Godot.print("Hello Godot from Kotlin!")
}

@CName("godot_gdnative_terminate")
fun godot_gdnative_terminate(options: godot_gdnative_terminate_options) {
    Godot.terminate(options)
}

@CName("godot_nativescript_init")
fun godot_nativescript_init(handle: COpaquePointer) {
    Godot.nativescriptInit(handle) {}
}