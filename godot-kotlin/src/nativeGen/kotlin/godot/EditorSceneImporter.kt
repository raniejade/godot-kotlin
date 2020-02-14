// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
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

open class EditorSceneImporter(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Reference(null) {
  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _get_extensions(): VariantArray {
    TODO()
  }

  open fun _get_import_flags(): Int {
    TODO()
  }

  open fun _import_animation(
    path: String,
    flags: Int,
    bakeFps: Int
  ): Animation {
    TODO()
  }

  open fun _import_scene(
    path: String,
    flags: Int,
    bakeFps: Int
  ): Node {
    TODO()
  }

  fun importAnimationFromOtherImporter(
    path: String,
    flags: Int,
    bakeFps: Int
  ): Animation {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Animation
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(flags)
      _args.add(bakeFps)
      __method_bind.importAnimationFromOtherImporter.call(self._handle, _args, _retPtr)
      _ret = objectToType<Animation>(_tmp.value!!)
      _ret
    }
  }

  fun importSceneFromOtherImporter(
    path: String,
    flags: Int,
    bakeFps: Int
  ): Node {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Node
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(flags)
      _args.add(bakeFps)
      __method_bind.importSceneFromOtherImporter.call(self._handle, _args, _retPtr)
      _ret = objectToType<Node>(_tmp.value!!)
      _ret
    }
  }

  companion object {
    val IMPORT_ANIMATION: Int = 2

    val IMPORT_ANIMATION_DETECT_LOOP: Int = 4

    val IMPORT_ANIMATION_FORCE_ALL_TRACKS_IN_ALL_CLIPS: Int = 16

    val IMPORT_ANIMATION_KEEP_VALUE_TRACKS: Int = 32

    val IMPORT_ANIMATION_OPTIMIZE: Int = 8

    val IMPORT_FAIL_ON_MISSING_DEPENDENCIES: Int = 512

    val IMPORT_GENERATE_TANGENT_ARRAYS: Int = 256

    val IMPORT_MATERIALS_IN_INSTANCES: Int = 1024

    val IMPORT_SCENE: Int = 1

    val IMPORT_USE_COMPRESSION: Int = 2048

    /**
     * Container for method_bind pointers for EditorSceneImporter
     */
    private object __method_bind {
      val importAnimationFromOtherImporter: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSceneImporter".cstr.ptr,
            "import_animation_from_other_importer".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method import_animation_from_other_importer" }
        }
      val importSceneFromOtherImporter: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSceneImporter".cstr.ptr,
            "import_scene_from_other_importer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method import_scene_from_other_importer" }
        }}
  }
}
