import godot.*
import godot.core.Vector3
import kotlinx.cinterop.COpaquePointer

class RotatingCube(handle: COpaquePointer): Spatial(handle) {
  var rotationSpeed by floatProperty()
  // signal emitted when reverse property is changed
  val signalReverseChanged by signal1<Boolean>()
  // properties optionally accepts a lambda a.k.a ChangeListener, that is called when
  // the value of the property changes.
  // signals can be converted to a ChangeListener, via <signal>.asListener()
  var reverse by booleanProperty(signalReverseChanged.asListener())

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

  // this is attached to Timer::timeout signal via the editor
  fun flipRotation() {
    reverse = !reverse
  }

  companion object: GodotClass<Spatial, RotatingCube>(::RotatingCube) {
    override fun init(registry: ClassMemberRegistry<RotatingCube>) {
      with(registry) {
        registerMethod(RotatingCube::_process)
        registerMethod(RotatingCube::flipRotation)
        registerProperty(RotatingCube::rotationSpeed, 100f, hint =  PropertyHint.range(0f, 1000f, 0.5f))
        registerProperty(RotatingCube::reverse)
        registerSignal(RotatingCube::signalReverseChanged, "reverse")
      }
    }
  }
}