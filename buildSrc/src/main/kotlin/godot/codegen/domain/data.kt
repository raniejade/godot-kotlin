package godot.codegen.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.squareup.kotlinpoet.ClassName
import org.jetbrains.kotlin.gradle.utils.loadPropertyFromResources

@JsonIgnoreProperties(ignoreUnknown = true)
data class RawGDProperty(
  val name: String,
  val type: String,
  val getter: String,
  val setter: String,
  val index: Int
) {
  val isMutable = setter.isNotBlank()
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class RawGDArgument(
  val name: String,
  val type: String,
  val has_default_value: Boolean,
  val default_value: String
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class RawGDMethod(
  val name: String,
  val return_type: String,
  val is_editor: Boolean,
  val is_noscript: Boolean,
  val is_const: Boolean,
  val is_reverse: Boolean,
  val is_virtual: Boolean,
  val has_varargs: Boolean,
  val is_from_script: Boolean,
  val arguments: List<RawGDArgument>
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class RawGDEnum(val name: String, val values: Map<String, Int>)

@JsonIgnoreProperties
data class RawGDSignal(val name: String, val arguments: List<RawGDArgument>)

@JsonIgnoreProperties(ignoreUnknown = true)
data class RawGDClass(
  val name: String,
  val base_class: String,
  val singleton: Boolean,
  val instanciable: Boolean,
  val is_reference: Boolean,
  val api_type: String,
  val constants: Map<String, Any>,
  val enums: List<RawGDEnum>,
  val methods: List<RawGDMethod>,
  val properties: List<RawGDProperty>,
  val signals: List<RawGDSignal>
)

enum class GDApiType {
  CORE,
  TOOLS
}

data class GDClass(
  val name: String,
  val baseClass: String,
  val isSingleton: Boolean,
  val isInstanciable: Boolean,
  val isReference: Boolean,
  val apiType: GDApiType,
  val enums: Map<String, GDEnum>,
  val properties: Map<String, GDProperty>,
  val methods: Map<String, GDMethod>,
  val constants: Map<String, Any>,
  val signals: List<GDSignal>
) {
  companion object {
    fun from(raw: RawGDClass): GDClass {
      return GDClass(
        raw.name,
        raw.base_class,
        raw.singleton,
        raw.instanciable,
        raw.is_reference,
        GDApiType.valueOf(raw.api_type.toUpperCase()),
        raw.enums.map(GDEnum.Companion::from).map { it.name to it }.toMap(),
        raw.properties.map(GDProperty.Companion::from).map { it.name to it }.toMap(),
        raw.methods.map(GDMethod.Companion::from).map { it.name to it }.toMap(),
        raw.constants,
        raw.signals.map(GDSignal.Companion::from)
      )
    }
  }
}

data class GDSignal(
  val rawName: String,
  val name: String,
  val arguments: List<GDArgument>
) {
  companion object {
    fun from(raw: RawGDSignal): GDSignal {
      return GDSignal(
        raw.name,
        "signal" + GDProperty.normalizePropertyName(raw.name).capitalize(),
        raw.arguments.map(GDArgument.Companion::from)
      )
    }
  }
}

data class GDType(
  val names: List<String>,
  val fqName: String,
  val isEnum: Boolean,
  val coreType: CoreType?
) {
  val isCoreType = coreType != null
  val isInnerType = names.size > 1
  val isVoid = coreType == CoreType.VOID
  val isVariant = coreType == CoreType.VARIANT
  val isPrimitive = coreType != null && coreType.primitive

  fun toClassName(): ClassName? {
    return when (coreType) {
      CoreType.VOID -> null
      null -> ClassName("godot", names)
      else -> {
        val packageName = if (isPrimitive) {
          "kotlin"
        } else {
          "godot.core"
        }
        ClassName(packageName, names)
      }
    }
  }

  companion object {
    fun from(name: String): GDType {
      var processedName = name
      var isEnum = false
      if (processedName.startsWith("enum.")) {
        processedName = processedName.replace("enum.", "")
        isEnum = true
      }
      // can be an inner type
      var names = processedName.split("::")
      var fqName = names.joinToString(".")
      val coreType = CoreTypeRegistry.get(fqName)

      if (coreType != null) {
        names = coreType.kotlinName.split(".")
        fqName = coreType.kotlinName
      }

      return GDType(
        names,
        fqName,
        isEnum,
        coreType
      )
    }
  }
}

data class GDEnum(
  val name: String,
  val values: Map<String, Int>
) {
  companion object {
    fun from(raw: RawGDEnum): GDEnum {
      return GDEnum(
        raw.name,
        raw.values
      )
    }
  }
}

data class GDProperty(
  val rawName: String,
  val name: String,
  val type: GDType,
  val getter: String,
  val setter: String,
  val index: Int
) {
  val isMutable = setter.isNotBlank()
  val isVirtual = name.startsWith("_")

  companion object {
    fun from(raw: RawGDProperty): GDProperty {
      return GDProperty(
        raw.name,
        normalizePropertyName(raw.name),
        GDType.from(raw.type),
        GDMethod.normalizeMethodName(raw.getter),
        GDMethod.normalizeMethodName(raw.setter),
        raw.index
      )
    }

    fun normalizePropertyName(name: String): String {
      return name.split("_", "/")
        .joinToString("") { it.capitalize() }
        .decapitalize()
    }
  }
}

data class GDMethod(
  val rawName: String,
  val name: String,
  val returnType: GDType,
  val isEditor: Boolean,
  val isNoScript: Boolean,
  val isConst: Boolean,
  val isReverse: Boolean,
  val isVirtual: Boolean,
  val hasVarargs: Boolean,
  val isFromScript: Boolean,
  val arguments: List<GDArgument>
) {
  companion object {
    fun from(raw: RawGDMethod): GDMethod {
      return GDMethod(
        raw.name,
        normalizeMethodName(raw.name),
        GDType.from(raw.return_type),
        raw.is_editor,
        raw.is_noscript,
        raw.is_const,
        raw.is_reverse,
        raw.is_virtual,
        raw.has_varargs,
        raw.is_from_script,
        raw.arguments.map(GDArgument.Companion::from)
      )
    }

    fun normalizeMethodName(name: String): String {
      val ret = name.split("_")
        .joinToString("") { it.capitalize() }
        .decapitalize()

      // some godot methods begin with '_', we need to preserve it.
      if (name.startsWith("_")) {
        return "_$ret"
      }

      return ret
    }
  }
}

data class GDArgument(
  val rawName: String,
  val name: String,
  val type: GDType,
  val hasDefaultValue: Boolean,
  val defaultValue: String
) {
  companion object {
    fun from(raw: RawGDArgument): GDArgument {
      return GDArgument(
        raw.name,
        normalizeArgName(raw.name),
        GDType.from(raw.type),
        raw.has_default_value,
        raw.default_value
      )
    }

    private fun normalizeArgName(name: String): String {
      return name.split("_")
        .joinToString("") { it.capitalize() }
        .decapitalize()
    }
  }
}