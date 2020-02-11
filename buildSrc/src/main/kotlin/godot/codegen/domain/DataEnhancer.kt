package godot.codegen.domain

// TODO: improve this
object DataEnhancer {
  private val methodsWithNullableReturnTypes = mutableMapOf(
    "PhysicsDirectBodyState" to setOf("get_contact_collider_object"),
    "Node" to setOf("get_node", "get_parent")
  )
  fun isMethodReturnTypeNullable(className: String, method: String): Boolean {
    return methodsWithNullableReturnTypes[className]?.contains(method) ?: false
  }
}