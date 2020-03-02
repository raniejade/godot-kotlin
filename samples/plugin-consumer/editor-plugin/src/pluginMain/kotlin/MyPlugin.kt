import godot.*

class MyPlugin: EditorPlugin() {
  override fun _enter_tree() {
    addCustomType(
      "MyCustomType",
      "Spatial",
      ResourceLoader.load<NativeScript>("res://addons/editor-plugin/src/godot/gdns/MyCustomType.gdns"),
      ResourceLoader.load<Texture>("res://icon.png")
    )
  }

  override fun _exit_tree() {
    removeCustomType("MyCustomType")
  }

  companion object: GodotClass<EditorPlugin, MyPlugin>(::MyPlugin) {
    override fun init(registry: ClassMemberRegistry<MyPlugin>) {
      registry.registerMethod(MyPlugin::_enter_tree)
      registry.registerMethod(MyPlugin::_exit_tree)
    }
  }
}