package godot.idea

import com.intellij.openapi.components.*

@Service
@State(
  name = "com.github.raniejade.godot-kotlin",
  storages = [
    Storage("com.github.raniejade.godot-kotlin.xml", roamingType = RoamingType.DISABLED)
  ]
)
class GodotKotlin: PersistentStateComponent<GodotKotlin.State> {
  data class State(
    var godotExecutable: String? = null
  )

  private var state: State = State()

  var godotExecutable: String?
    get() = state.godotExecutable
    set(value) { state.godotExecutable = value }

  override fun getState(): State {
    return state
  }

  override fun loadState(state: State) {
    this.state = state
  }
}