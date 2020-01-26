package godot.codegen.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class GDClass(
  val name: String,
  val base_class: String,
  val singleton: Boolean,
  val instanciable: Boolean,
  val is_reference: Boolean,
  val api_type: String
)