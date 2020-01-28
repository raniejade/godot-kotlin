import godot.Spatial
import godot.core.GodotClass
import godot.core.MethodRegistry
import godot.core.Vector3
import kotlinx.cinterop.COpaquePointer

class RotatingCube(handle: COpaquePointer): Spatial(handle) {
  override fun _onInit() {
    rotationDegrees = Vector3.new(y = 1f)
  }

  fun _process(delta: Float) {
    // will not work as core types are pass-by-value
    // rotationDegrees.y += delta * 12f

    // this will work
    rotationDegrees {
      y += delta * 12f
    }

    // the code below is functionally the same as above
    // val rotation = rotationDegrees
    // rotation.y += delta * 12f
    // rotationDegrees = rotation
  }

  companion object: GodotClass<RotatingCube>(::RotatingCube) {
    override fun init(registry: MethodRegistry<RotatingCube>) {
      with(registry) {
        registerMethod(RotatingCube::_process)
      }
    }
  }
}