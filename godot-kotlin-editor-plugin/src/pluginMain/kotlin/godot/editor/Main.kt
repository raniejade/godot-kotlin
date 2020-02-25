package godot.editor

import godot.*

class Main: EditorPlugin() {
  override fun _enter_tree() {
    gprint("Wooot!")
  }

  companion object: GodotClass<EditorPlugin, Main>(::Main) {
    override fun init(registry: ClassMemberRegistry<Main>) {
      registry.registerMethod(Main::_enter_tree)
    }
  }
}