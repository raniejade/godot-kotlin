import godot.Spatial
import godot.core.GodotClass
import godot.core.MethodRegistry
import godot.core.Vector3
import kotlinx.cinterop.COpaquePointer

class RotatingCube(handle: COpaquePointer): Spatial(handle) {
  private lateinit var rotation: Vector3

  override fun _onInit() {
    rotation = Vector3.new(y = 1f)
  }

  fun _process(delta: Float) {
    rotation.y += delta * 12f
    setRotationDegrees(rotation)
  }

  companion object: GodotClass<RotatingCube>(::RotatingCube) {
    override fun init(registry: MethodRegistry<RotatingCube>) {
      with(registry) {
        registerMethod(RotatingCube::_process)
      }
    }
  }
}