package godot.gradle

import org.gradle.api.Project
import org.gradle.api.artifacts.ModuleIdentifier
import org.gradle.api.artifacts.ModuleVersionIdentifier
import org.gradle.api.component.ComponentWithCoordinates
import org.gradle.api.component.ComponentWithVariants
import org.gradle.api.component.SoftwareComponent
import org.gradle.api.internal.component.SoftwareComponentInternal
import org.gradle.api.internal.component.UsageContext
import org.gradle.api.publish.maven.MavenPublication

class GodotSoftwareComponent(private val project: Project,
                             private val name: String,
                             private val publication: MavenPublication? = null
): ComponentWithVariants, SoftwareComponentInternal, ComponentWithCoordinates {
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

  override fun getCoordinates(): ModuleVersionIdentifier {
    return object: ModuleVersionIdentifier {
      private var self = this
      override fun getGroup(): String {
        return publication?.groupId ?: project.group.toString()
      }

      override fun getVersion(): String {
        return publication?.version ?: project.version.toString()
      }

      override fun getName(): String {
        return publication?.artifactId ?: project.name
      }

      override fun getModule(): ModuleIdentifier {
        return object: ModuleIdentifier {
          override fun getGroup(): String {
            return self.group
          }

          override fun getName(): String {
            return self.name
          }
        }
      }
    }
  }
}