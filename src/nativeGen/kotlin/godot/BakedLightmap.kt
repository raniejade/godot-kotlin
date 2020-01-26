// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class BakedLightmap internal constructor(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
  fun bake(): BakeError {
    TODO()
  }

  fun debugBake() {
    TODO()
  }

  fun getBakeCellSize(): Float {
    TODO()
  }

  fun getBakeMode(): BakeMode {
    TODO()
  }

  fun getBakeQuality(): BakeQuality {
    TODO()
  }

  fun getCaptureCellSize(): Float {
    TODO()
  }

  fun getEnergy(): Float {
    TODO()
  }

  fun getExtents(): Vector3 {
    TODO()
  }

  fun getImagePath(): String {
    TODO()
  }

  fun getLightData(): BakedLightmapData {
    TODO()
  }

  fun getPropagation(): Float {
    TODO()
  }

  fun isHdr(): Boolean {
    TODO()
  }

  fun setBakeCellSize() {
    TODO()
  }

  fun setBakeMode() {
    TODO()
  }

  fun setBakeQuality() {
    TODO()
  }

  fun setCaptureCellSize() {
    TODO()
  }

  fun setEnergy() {
    TODO()
  }

  fun setExtents() {
    TODO()
  }

  fun setHdr() {
    TODO()
  }

  fun setImagePath() {
    TODO()
  }

  fun setLightData() {
    TODO()
  }

  fun setPropagation() {
    TODO()
  }

  enum class BakeQuality(
    val value: Int
  ) {
    BAKE_QUALITY_LOW(0),

    BAKE_QUALITY_MEDIUM(1),

    BAKE_QUALITY_HIGH(2);
  }

  enum class BakeError(
    val value: Int
  ) {
    BAKE_ERROR_OK(0),

    BAKE_ERROR_NO_SAVE_PATH(1),

    BAKE_ERROR_NO_MESHES(2),

    BAKE_ERROR_CANT_CREATE_IMAGE(3),

    BAKE_ERROR_USER_ABORTED(4);
  }

  enum class BakeMode(
    val value: Int
  ) {
    BAKE_MODE_CONE_TRACE(0),

    BAKE_MODE_RAY_TRACE(1);
  }

  companion object {
    val BAKE_ERROR_CANT_CREATE_IMAGE: Int = 3

    val BAKE_ERROR_NO_MESHES: Int = 2

    val BAKE_ERROR_NO_SAVE_PATH: Int = 1

    val BAKE_ERROR_OK: Int = 0

    val BAKE_ERROR_USER_ABORTED: Int = 4

    val BAKE_MODE_CONE_TRACE: Int = 0

    val BAKE_MODE_RAY_TRACE: Int = 1

    val BAKE_QUALITY_HIGH: Int = 2

    val BAKE_QUALITY_LOW: Int = 0

    val BAKE_QUALITY_MEDIUM: Int = 1

    fun new(): BakedLightmap = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("BakedLightmap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton BakedLightmap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      BakedLightmap(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for BakedLightmap
     */
    private object __method_bind {
      val bake: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "bake".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method bake" }
            }
          }

      val debug_bake: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "debug_bake".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method debug_bake" }
            }
          }

      val get_bake_cell_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_bake_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bake_cell_size" }
            }
          }

      val get_bake_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_bake_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bake_mode" }
            }
          }

      val get_bake_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_bake_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bake_quality" }
            }
          }

      val get_capture_cell_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_capture_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_capture_cell_size" }
            }
          }

      val get_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_energy" }
            }
          }

      val get_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_extents" }
            }
          }

      val get_image_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_image_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_image_path" }
            }
          }

      val get_light_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_light_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_light_data" }
            }
          }

      val get_propagation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_propagation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_propagation" }
            }
          }

      val is_hdr: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "is_hdr".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_hdr" }
            }
          }

      val set_bake_cell_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_bake_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bake_cell_size" }
            }
          }

      val set_bake_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_bake_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bake_mode" }
            }
          }

      val set_bake_quality: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_bake_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bake_quality" }
            }
          }

      val set_capture_cell_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_capture_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_capture_cell_size" }
            }
          }

      val set_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_energy" }
            }
          }

      val set_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_extents" }
            }
          }

      val set_hdr: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_hdr".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hdr" }
            }
          }

      val set_image_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_image_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_image_path" }
            }
          }

      val set_light_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_light_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_light_data" }
            }
          }

      val set_propagation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_propagation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_propagation" }
            }
          }
    }
  }
}
