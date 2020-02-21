package godot.gradle

import org.gradle.api.component.ComponentWithVariants
import org.gradle.api.component.SoftwareComponent
import org.gradle.api.internal.component.SoftwareComponentInternal
import org.gradle.api.internal.component.UsageContext

class GodotSoftwareComponent(
  private val name: String
): ComponentWithVariants, SoftwareComponentInternal {
  private val variants = mutableSetOf<SoftwareComponent>()

  fun addVariant(variant: SoftwareComponent) {
    variants.add(variant)
  }

  override fun getVariants(): MutableSet<out SoftwareComponent> {
    return variants
  }

  override fun getUsages(): MutableSet<out UsageContext> {
    return mutableSetOf()
  }

  override fun getName(): String {
    return name
  }
}