package godot.codegen

import godot.codegen.domain.CoreType.*
import godot.codegen.domain.GDType

object DefaultArgHelper {
  fun parse(type: GDType, value: String): String? {
    return when (type.coreType) {
      FLOAT -> "${value.toFloat()}f"
      INT -> "${value.toInt()}"
      STRING -> "\"$value\""
      BOOL -> "${value.toBoolean()}"
      COLOR -> "Color($value)"
      VECTOR2 -> "Vector2$value"
      VECTOR3 -> "Vector3$value"
      TRANSFORM2D -> {
        val args = value.drop(1).dropLast(1)
          .split("), ")
          .map { it.replace(")", "").replace("(", "") }
          .joinToString(", ") { "Vector2($it)" }

        "Transform2D($args)"
      }
      else -> null
    }
  }
}