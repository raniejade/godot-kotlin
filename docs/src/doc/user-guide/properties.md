Similar to signals, properties are created via a delegate which varies depending on the type of the property.

- `intProperty()`for `Int`s
- `floatProperty()` for `Float`s
- `booleanProperty()` for `Boolean`
- `stringProperty()` for `String`
- `enumProperty()` for `Enum`s
- `resourceProperty()` for `godot.Resource` types.
- `property` for Godot core types (i.e. `Vector2`, `Basis` and etc).

Note that properties must be mutable (declared as `var`s).

```kotlin
class RotatingCube: Spatial() {
  var rotationSpeed by floatProperty()
  var reverse by booleanProperty()

  ...
}
```


## Value changes
You can optionally pass a `ChangeListener` to a property delegate to get notified when the value of the property changes.

```kotlin
val reverse by booleanProperty { oldValue, newValue ->
  gprint("Value of reverse has changed. from: $oldValue to: $newValue")
}
```

It is quite common to emit some signal when a value of the property changes, to make it simpler a signal can be converted to a ChangeListener via `signal.asListener().`

```kotlin
val signalReverseChanged by signal1<Boolean>()
val reverse by booleanProperty(signalReverseChanged.asListener())
```

Whenever the value of `reverse` changes, the signal `reverseChanged` is emitted automatically.


## Registration
Properties can be registered in `GodotClass.init` via `ClassMemberRegistry.registerProperty`.

```kotlin
class RotatingCube: Spatial() {
  ...

  companion object: GodotClass<Spatial, RotatingCube>(::RotatingCube) {
    override fun init(registry: ClassMemberRegistry<RotatingCube>) {
      registry.registerProperty(RotatingCube::rotationSpeed)
      registry.registerProperty(RotatingCube::reverse)
    }
  }
}
```

## Default values
Specifying default values should be done during registration in order for Godot to know about it. This binding will automatically set this value when the owner of the property is instantiated.

```kotlin
registry.registerProperty(RotatingCube::rotationSpeed, default = 100f)
```

## Property hints
Exposed properties are displayed in Godot's editors, to control how a property is displayed can done by passing a property hint during registration.

```kotlin
registry.registerProperty(
  RotatingCube::rotationSpeed, 
  hint = PropertyHint.range(0f, 1000f, 0.5f)
)
```

Certain `PropertyHint`s are only available for certain property types. The property hint `range` for example is only available for `Float` and `Int` properties. The following are the available property hints and their respective supported types.

| Property hint                                   | Supported property type(s)            |
|-------------------------------------------------|---------------------------------------|
| `range(end)`, `range(start, end, step)`         | `Int`, `Float`                        |
| `ease()`                                        | `Float`                               |
| `exp(start, end, step)`                         | `Float`                               |
| `rgb()`, `rgba()`                               | `godot.core.Color`                    |
| `multiline()`                                   | `String`                              |
| `file(global, filter)`, `directory(global)`     | `String`                              |
| `resource()`                                    | `godot.Resource`                      |

See [GDScript exports](https://docs.godotengine.org/en/stable/getting_started/scripting/gdscript/gdscript_exports.html) for more details.
 