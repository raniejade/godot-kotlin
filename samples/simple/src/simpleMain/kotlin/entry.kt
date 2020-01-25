import gdnative.godot_gdnative_init_options
import gdnative.godot_gdnative_terminate_options
import godot.*
import kotlinx.cinterop.COpaquePointer

@CName("godot_gdnative_init")
fun godot_gdnative_init(options: godot_gdnative_init_options) {
    Godot.init(options)
    val string = GDString.new("aaaHello Godot from Kotlin!")
    string.erase(0, 3)
    Godot.print(string.toString())

    if (string[0] == 'H') {
        Godot.print("Yasss!")
    } else {
        Godot.print("Noooo!")
    }

    val vec = Vector2.new()
    val variant = Variant.new(vec)
    val array = GDArray.new()
    array.append(variant)
    array[0] = array[0].run {
        val v = asVector2()
        v.x = 12f
        v.y = 162f
        v
    }
    println(array[0])
}

@CName("godot_gdnative_terminate")
fun godot_gdnative_terminate(options: godot_gdnative_terminate_options) {
    Godot.terminate(options)
}

@CName("godot_nativescript_init")
fun godot_nativescript_init(handle: COpaquePointer) {
    Godot.nativescriptInit(handle) {}
}