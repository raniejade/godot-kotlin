import gdnative.godot_gdnative_init_options
import gdnative.godot_gdnative_terminate_options
import godot.PhysicsServer
import godot.Spatial
import godot.core.GDArray
import godot.core.Godot
import godot.core.Variant
import godot.core.Vector2
import kotlinx.cinterop.COpaquePointer

@CName("godot_gdnative_init")
fun godot_gdnative_init(options: godot_gdnative_init_options) {
    Godot.init(options)
    Godot.print("Hello Godot from Kotlin!")
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
    val spatial = Spatial.new()
    val ps = PhysicsServer.Instance
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