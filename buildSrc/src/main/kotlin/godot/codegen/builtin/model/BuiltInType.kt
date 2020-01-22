package godot.codegen.builtin.model

import com.fasterxml.jackson.annotation.JsonProperty

data class BuiltInType(@JsonProperty val name: String, @JsonProperty val builtinType: String)