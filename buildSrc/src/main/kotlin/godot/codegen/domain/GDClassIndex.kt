package godot.codegen.domain

class GDClassIndex(val classes: Map<String, GDClass>) {
  fun findMethod(cls: GDClass?, methodName: String): GDMethod? {
    if (cls == null) {
      return null
    }

    val method = cls.methods[methodName]
    if (method != null) {
      return method
    }

    val baseClass = if (cls.baseClass.isNotBlank()) {
      checkNotNull(classes[cls.baseClass])
    } else {
      null
    }

    return findMethod(baseClass, methodName)
  }
}