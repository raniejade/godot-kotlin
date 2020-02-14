## Platform support
One of the core goal of this binding is to support every platform that Godot supports.

## Development efficiency
The biggest issue this binding is facing is the slow compilation times of Kotlin Native. If you are passionate about writing games using Kotlin, please voice your opinion [here](https://github.com/JetBrains/kotlin-native/issues/733).

Aside from the slow compile times, another area improvement is IDE integration. Several features in mind:

- Run your project (or a scene) directly in the IDE
- Project navigation to and from Godot (navigate to a scene where a class is being used)
- Debugging support

And finally, integrating [Spek Framework](https://spekframework.org) so that you can write unit and automation tests for your game.

## Performance
Improving performance is definitely a priority but as a first step, this binding needs some benchmark tests (and tooling).