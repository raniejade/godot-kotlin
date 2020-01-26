package godot.codegen.domain

data class GDType(val name: String, val mappedName: String? = null, val primitive: Boolean = false) {
  companion object {
    val STRING = GDType("String", mappedName = "String", primitive = true)
    val INT = GDType("int", mappedName = "Int", primitive = true)
    val FLOAT = GDType("float", mappedName = "Float", primitive = true)
    val BOOL = GDType("bool", mappedName = "Boolean", primitive = true)

    val AABB = GDType("AABB")
    val BASIS = GDType("Basis")
    val DICTIONARY = GDType("Dictionary")
    val COLOR = GDType("Color")
    val ARRAY = GDType("Array", mappedName = "VariantArray")
    val VARIANT = GDType("Variant")
  }
}


object Types {
}

object TypeRegistry {
  private val types: Map<String, GDType>

  init {
    val tmp = mutableMapOf<String, GDType>()

    fun MutableMap<String, GDType>.put(type: GDType) {
      put(type.name, type)
    }

    types = tmp.toMap()
  }
}