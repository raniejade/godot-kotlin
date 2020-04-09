# Signals

Signals are represented as properties of type `Signal` and must start with a prefix `signal` \(see [API differences](../api-differences.md) section for an explanation\). Signals can be created via the `signalX` delegate, where `X` is the number of parameters your signal have. This binding only supports signals with at most 10 parameters at the moment.

```kotlin
class RotatingCube: Spatial() {
  val signalReverseChanged by signal1<Boolean>()

  ...
}
```

Do note that delegation is necessary here as the actual signal is only created during registration.

## Registration

Methods can be registered in `GodotClass.init` via `ClassMemberRegistry.registerSignal`.

```kotlin
class RotatingCube: Spatial() {
  ...

  companion object: GodotClass<Spatial, RotatingCube>(::RotatingCube) {
    override fun init(registry: ClassMemberRegistry<RotatingCube>) {
      registry.registerSignal(RotatingCube::reverseChanged)
    }
  }
}
```

## Emitting

Every signal has a `emit` method which can be used to emit it.

```kotlin
signalReverseChanged.emit(false)
```

## Subscribing

A method can be subscribed/connected to a signal via `SignalX.connect`. The number of parameters of the method and signal must match.

```kotlin
class SomeObject: Object() {
  fun onReverseChanged(reverse: Boolean) {
    gprint("Value of reverse has changed: $reverse")
  } 

  ...
}

val targetObject = SomeObject()
signalReverseChanged.connect(targetObject, targetObject::onReverseChanged)
```

