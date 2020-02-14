Any Kotlin method can be registered as long as its parameters and return type can be converted to a `Variant`. This binding automatically handles the conversions from and to a variant. This binding only supports methods with at most 10 parameters at the moment.

```kotlin
class RotatingCube: Spatial() {
  override fun _ready() {
    gprint("I am ready!")
  }

  ...
}
```

## Virtual methods
Virtual methods (like `_ready`, `_process` and `_physics_process`) are declared as overridable methods. The default implementation throws a `NotImplementedException`, so you have to override it if you plan to expose a virtual method to Godot.

## Registration
Methods can be registered in `GodotClass.init` via `ClassMemberRegistry.registerMethod`.

```kotlin
class RotatingCube: Spatial() {
  ...

  companion object: GodotClass<Spatial, RotatingCube>(::RotatingCube) {
    override fun init(registry: ClassMemberRegistry<RotatingCube>) {
      registry.registerMethod(RotatingCube::_ready)
    }
  }
}
```