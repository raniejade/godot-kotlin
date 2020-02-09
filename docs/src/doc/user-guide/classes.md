To expose a class written in Kotlin it needs to extend `godot.Object` (or any type that extends it) and have its companion object implement `godot.GodotClass<S, T: S>`.

```kotlin
class RotatingCube: Spatial() {
  companion object: GodotClass<Spatial, RotatingCube>(::RotatingCube) {
    override fun init(registry: ClassMemberRegistry<RotatingCube>) {
      ...
    }
  }
}
```

## Lifecycle
In some cases you want to get notified when your class is initialized and destroyed, this can be done by implementing `_onInit` and `_onDestroy`, respectively.

```kotlin
class RotatingCube: Spatial() {
  override fun _onInit() {
    gprint("Initializing RotatingCube!")
  }

  override fun _onDestroy() {
   gprint("Cleaning up RotatingCube!")
  }

  ...
}
```

`_onInit` is equivalent to GDScript's constructor `_init`, however `_onInit` (and `_onDestroy`) are handled directly by this binding and not Godot.

## Instance checks
Checking if an object is an instance of a particular type can be done via the `is` operator.

```kotlin
fun _ready() {
  val parent = getParent()
  if (parent is CollisionShape) {
    // smart cast works!
    parent.setShape(...)
  } else {
    throw AssertionError("Unexpected parent!")
  }
}
```

This also works for any type you define. 

If you are sure that an object is always an instance of some type, then you can take advantage of Kotlin's [contracts](https://kotlinlang.org/docs/reference/whatsnew13.html#contracts) feature.

```kotlin
fun _ready() {
  val parent = getParent()
  require(parent is CollisionShape)
  // smart cast works here as well!
  parent.setShape(...)
}
```

## GodotClass
It represents metadata about the class you want to expose, which is used by this binding during class registration. The two type parameters represents the parent class `S` and the class `T` you want to expose. The parameter passed to the superclass is a function of type `() -> T`, which is called when Godot requests an instance of `T`.

The `init` method is called during class registration. The `registry` parameter allows you to [properties](properties.md), [methods](methods.md) and [signals](signals.md) to Godot.

## Registration
Defining the class alone is not enough to expose it to Godot, you have to tell the gradle plugin about it.

```kotlin
godot {
  libraries {
    val simple by creating {
      classes(
        "RotatingCube"
      )
    } 
  }
}
```

Running `./gradlew build` will produce a `RotatingCube.gdns` file (in `src/godot/gdns`) which can be used in Godot.
