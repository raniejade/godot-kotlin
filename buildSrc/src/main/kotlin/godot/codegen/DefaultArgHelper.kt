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
      COLOR -> "Color.rgb($value)"
      VECTOR2 -> "Vector2.new$value"
      VECTOR3 -> "Vector3.new$value"
      TRANSFORM2D -> {
        val args = value.drop(1).dropLast(1)
          .split("), ")
          .map { it.replace(")", "").replace("(", "") }
          .joinToString(", ") { "Vector2.new($it)" }

        "Transform2D.new($args)"
      }
      else -> null
    }
  }
}