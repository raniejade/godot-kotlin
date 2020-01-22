package godot.codegen.builtin.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Type(@JsonProperty val pkg: String, @JsonProperty val name: String)
data class Parameter(@JsonProperty val name: String, @JsonProperty val type: Type, @JsonProperty val isPointer: Boolean)
data class Constructor(@JsonProperty val params: List<Parameter>, @JsonProperty val internalConstructor: String)
data class BuiltInType(@JsonProperty val name: String, @JsonProperty val builtinType: String, @JsonProperty val constructors: List<Constructor> = emptyList())