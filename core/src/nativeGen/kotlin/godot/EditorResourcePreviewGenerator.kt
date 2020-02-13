// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
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

open class EditorResourcePreviewGenerator(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun can_generate_small_preview(): Boolean {
    TODO()
  }

  open fun generate(from: Resource, size: Vector2): Texture {
    TODO()
  }

  open fun generate_from_path(path: String, size: Vector2): Texture {
    TODO()
  }

  open fun generate_small_preview_automatically(): Boolean {
    TODO()
  }

  open fun handles(type: String): Boolean {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorResourcePreviewGenerator
     */
    private object __method_bind
  }
}
