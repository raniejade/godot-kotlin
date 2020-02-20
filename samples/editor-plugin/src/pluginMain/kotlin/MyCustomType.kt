import godot.*

class MyCustomType: Spatial() {
  var someProperty by stringProperty()

  companion object: GodotClass<Spatial, MyCustomType>(::MyCustomType) {
    override fun init(registry: ClassMemberRegistry<MyCustomType>) {
      registry.registerProperty(MyCustomType::someProperty)
    }
  }
}