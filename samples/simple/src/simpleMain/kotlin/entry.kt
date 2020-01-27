import gdnative.godot_gdnative_init_options
import gdnative.godot_gdnative_terminate_options
import godot.PhysicsServer
import godot.Spatial
import godot.core.*
import kotlinx.cinterop.COpaquePointer

@CName("godot_gdnative_init")
fun godot_gdnative_init(options: godot_gdnative_init_options) {
    Godot.init(options)
    Godot.print("Hello Godot from Kotlin!")
    val vec = Vector2.new()
    vec.x = 123f
    vec.y = 51f
    val variant = Variant.new(vec)
    val array = VariantArray.new()
    array.append(variant)
    val spatial = Spatial.new()
    val ps = PhysicsServer.Instance
    println(array[0])
    spatial.setRotationDegrees(Vector3.new(x = 12f))
    println(spatial.getRotationDegrees())
}

@CName("godot_gdnative_terminate")
fun godot_gdnative_terminate(options: godot_gdnative_terminate_options) {
    Godot.terminate(options)
}

@CName("godot_nativescript_init")
fun godot_nativescript_init(handle: COpaquePointer) {
    Godot.nativescriptInit(handle) {}
}