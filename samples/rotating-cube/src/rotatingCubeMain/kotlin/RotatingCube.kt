import godot.Spatial
import godot.core.*
import kotlinx.cinterop.COpaquePointer

class RotatingCube(handle: COpaquePointer): Spatial(handle) {
  var rotationSpeed by floatProperty()
  var reverse by booleanProperty()

  override fun _onInit() {
    rotationDegrees = Vector3.new(y = 1f)
  }

  fun _process(delta: Float) {
    // will not work as core types are pass-by-value
    // rotationDegrees.y += delta * 12f

    // this will work
    rotationDegrees {
      if (!reverse) {
        y += delta * rotationSpeed
      } else {
        y -= delta * rotationSpeed
      }
    }

    // the code below is functionally the same as above
    // val rotation = rotationDegrees
    // rotation.y += delta * 12f
    // rotationDegrees = rotation
  }

  companion object: GodotClass<Spatial, RotatingCube>(::RotatingCube) {
    override fun init(registry: ClassMemberRegistry<RotatingCube>) {
      with(registry) {
        registerMethod(RotatingCube::_process)
        registerProperty(RotatingCube::rotationSpeed, 100f, hint =  PropertyHint.range(0f, 1000f, 0.5f))
        registerProperty(RotatingCube::reverse)
      }
    }
  }
}