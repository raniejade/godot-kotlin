package godot.idea

import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.diagnostic.logger
import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.options.Configurable
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.ui.components.JBLabel
import com.intellij.ui.layout.panel
import javax.swing.JComponent

class Settings: Configurable {
  private val logger = logger<Settings>()
  private val godotKotlin = ServiceManager.getService(GodotKotlin::class.java)

  private var modified = false
  private lateinit var godotExecutableField: TextFieldWithBrowseButton

  override fun isModified(): Boolean {
    return modified
  }

  override fun getDisplayName(): String {
    return "Godot Kotlin"
  }

  override fun apply() {
    godotKotlin.godotExecutable = godotExecutableField.text
  }

  override fun createComponent(): JComponent {
    return panel {
      row {
        cell {
          label("Godot Executable")
          godotExecutableField = textFieldWithBrowseButton(
            value = godotKotlin.godotExecutable,
            fileChooserDescriptor = FileChooserDescriptorFactory.createSingleLocalFileDescriptor(),
            fileChosen = ::executableSelected
          )
        }
      }
    }
  }

  override fun reset() {
    modified = false
  }

  private fun executableSelected(executable: VirtualFile): String {
    // todo: verify selected file
    val path = executable.path
    if (path != godotKotlin.godotExecutable) {
      modified = true
    }
    return path
  }
}