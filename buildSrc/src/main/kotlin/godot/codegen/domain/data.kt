package godot.codegen.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties


@JsonIgnoreProperties(ignoreUnknown = true)
data class GDArgument(
  val name: String,
  val type: String,
  val has_default_value: Boolean,
  val default_value: String
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class GDMethod(
  val name: String,
  val return_type: String,
  val is_editor: Boolean,
  val is_noscript: Boolean,
  val is_const: Boolean,
  val is_reverse: Boolean,
  val is_virtual: Boolean,
  val has_varargs: Boolean,
  val is_from_script: Boolean,
  val arguments: List<GDArgument>
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class GDEnum(val name: String, val values: Map<String, Int>)

@JsonIgnoreProperties(ignoreUnknown = true)
data class GDClass(
  val name: String,
  val base_class: String,
  val singleton: Boolean,
  val instanciable: Boolean,
  val is_reference: Boolean,
  val api_type: String,
  val constants: Map<String, Any>,
  val enums: List<GDEnum>,
  val methods: List<GDMethod>
)