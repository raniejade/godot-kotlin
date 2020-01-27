package godot.codegen.domain

enum class GDType(val gdName: String, val mappedName: String? = null, val primitive: Boolean = false, val isEnum: Boolean = false) {
  STRING("String", mappedName = "String", primitive = true),
  INT("int", mappedName = "Int", primitive = true),
  FLOAT("float", mappedName = "Float", primitive = true),
  BOOL("bool", mappedName = "Boolean", primitive = true),
  VOID("void", primitive = true),

  ERROR("Error", mappedName = "GDError", isEnum = true),
  AABB("AABB"),
  BASIS("Basis"),
  COLOR("Color"),
  DICTIONARY("Dictionary"),
  NODE_PATH("NodePath"),
  PLANE("Plane"),
  POOL_BYTE_ARRAY("PoolByteArray"),
  POOL_COLOR_ARRAY("PoolColorArray"),
  POOL_INT_ARRAY("PoolIntArray"),
  POOL_REAL_ARRAY("PoolRealArray"),
  POOL_STRING_ARRAY("PoolStringArray"),
  POOL_VECTOR2_ARRAY("PoolVector2Array"),
  POOL_VECTOR3_ARRAY("PoolVector3Array"),
  QUAT("Quat"),
  RECT2("Rect2"),
  RID("RID"),
  TRANSFORM("Transform"),
  TRANSFORM2D("Transform2D"),
  VARIANT("Variant"),
  VARIANT_TYPE("Variant.Type", isEnum = true),
  VARIANT_OPERATOR("Variant.Operator", isEnum = true),
  VARIANT_ARRAY("Array", mappedName = "VariantArray"),
  VECTOR2("Vector2"),
  VECTOR3("Vector3"),
  VECTOR3_AXIS("Vector3.Axis", isEnum = true);


  val kotlinName = mappedName ?: gdName
}

object TypeRegistry {
  private val types: Map<String, GDType>

  init {
    val tmp = mutableMapOf<String, GDType>()
    GDType.values().forEach { v ->
      tmp[v.gdName] = v
    }

    types = tmp.toMap()
  }

  fun get(name: String): GDType? {
    return types[name]
  }

  fun contains(name: String): Boolean {
    return types.containsKey(name)
  }
}