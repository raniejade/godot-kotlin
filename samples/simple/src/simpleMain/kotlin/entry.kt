import gdnative.godot_gdnative_init_options
import gdnative.godot_gdnative_terminate_options
import godot.GDString
import godot.Godot
import kotlinx.cinterop.COpaquePointer

@CName("godot_gdnative_init")
fun godot_gdnative_init(options: godot_gdnative_init_options) {
    Godot.init(options)
    val string = GDString.new("aaaHello Godot from Kotlin!")
    string.erase(0, 3)
    Godot.print(string)

    if (string.beginsWith("Hello")) {
        Godot.print("Yasss!")
    } else {
        Godot.print("Noooo!")
    }
}

@CName("godot_gdnative_terminate")
fun godot_gdnative_terminate(options: godot_gdnative_terminate_options) {
    Godot.terminate(options)
}

@CName("godot_nativescript_init")
fun godot_nativescript_init(handle: COpaquePointer) {
    Godot.nativescriptInit(handle) {}
}