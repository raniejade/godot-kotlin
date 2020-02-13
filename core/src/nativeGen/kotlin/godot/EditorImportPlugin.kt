// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class EditorImportPlugin(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : ResourceImporter(null) {
  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun get_import_options(preset: Int): VariantArray {
    TODO()
  }

  open fun get_import_order(): Int {
    TODO()
  }

  open fun get_importer_name(): String {
    TODO()
  }

  open fun get_option_visibility(option: String, options: Dictionary): Boolean {
    TODO()
  }

  open fun get_preset_count(): Int {
    TODO()
  }

  open fun get_preset_name(preset: Int): String {
    TODO()
  }

  open fun get_priority(): Float {
    TODO()
  }

  open fun get_recognized_extensions(): VariantArray {
    TODO()
  }

  open fun get_resource_type(): String {
    TODO()
  }

  open fun get_save_extension(): String {
    TODO()
  }

  open fun get_visible_name(): String {
    TODO()
  }

  open fun import(
    sourceFile: String,
    savePath: String,
    options: Dictionary,
    platformVariants: VariantArray,
    genFiles: VariantArray
  ): Int {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorImportPlugin
     */
    private object __method_bind
  }
}
