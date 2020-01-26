// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolVector2Array
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CSGPolygon internal constructor(
  _handle: COpaquePointer
) : CSGPrimitive(_handle) {
  fun getDepth(): Float {
    TODO()
  }

  fun getMaterial(): Material {
    TODO()
  }

  fun getMode(): Mode {
    TODO()
  }

  fun getPathInterval(): Float {
    TODO()
  }

  fun getPathNode(): NodePath {
    TODO()
  }

  fun getPathRotation(): PathRotation {
    TODO()
  }

  fun getPolygon(): PoolVector2Array {
    TODO()
  }

  fun getSmoothFaces(): Boolean {
    TODO()
  }

  fun getSpinDegrees(): Float {
    TODO()
  }

  fun getSpinSides(): Int {
    TODO()
  }

  fun isPathContinuousU(): Boolean {
    TODO()
  }

  fun isPathJoined(): Boolean {
    TODO()
  }

  fun isPathLocal(): Boolean {
    TODO()
  }

  fun setDepth(depth: Float) {
    TODO()
  }

  fun setMaterial(material: Material) {
    TODO()
  }

  fun setMode(mode: Int) {
    TODO()
  }

  fun setPathContinuousU(enable: Boolean) {
    TODO()
  }

  fun setPathInterval(distance: Float) {
    TODO()
  }

  fun setPathJoined(enable: Boolean) {
    TODO()
  }

  fun setPathLocal(enable: Boolean) {
    TODO()
  }

  fun setPathNode(path: NodePath) {
    TODO()
  }

  fun setPathRotation(mode: Int) {
    TODO()
  }

  fun setPolygon(polygon: PoolVector2Array) {
    TODO()
  }

  fun setSmoothFaces(smooth_faces: Boolean) {
    TODO()
  }

  fun setSpinDegrees(degrees: Float) {
    TODO()
  }

  fun setSpinSides(spin_sides: Int) {
    TODO()
  }

  enum class PathRotation(
    val value: Int
  ) {
    PATH_ROTATION_POLYGON(0),

    PATH_ROTATION_PATH(1),

    PATH_ROTATION_PATH_FOLLOW(2);

    companion object {
      fun from(value: Int): PathRotation {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Mode(
    val value: Int
  ) {
    MODE_DEPTH(0),

    MODE_SPIN(1),

    MODE_PATH(2);

    companion object {
      fun from(value: Int): Mode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val MODE_DEPTH: Int = 0

    val MODE_PATH: Int = 2

    val MODE_SPIN: Int = 1

    val PATH_ROTATION_PATH: Int = 1

    val PATH_ROTATION_PATH_FOLLOW: Int = 2

    val PATH_ROTATION_POLYGON: Int = 0

    fun new(): CSGPolygon = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CSGPolygon".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CSGPolygon" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CSGPolygon(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CSGPolygon = CSGPolygon(ptr)
    /**
     * Container for method_bind pointers for CSGPolygon
     */
    private object __method_bind {
      val get_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "get_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_depth" }
            }
          }

      val get_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_material" }
            }
          }

      val get_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "get_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mode" }
            }
          }

      val get_path_interval: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "get_path_interval".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_path_interval" }
            }
          }

      val get_path_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "get_path_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_path_node" }
            }
          }

      val get_path_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "get_path_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_path_rotation" }
            }
          }

      val get_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "get_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_polygon" }
            }
          }

      val get_smooth_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "get_smooth_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_smooth_faces" }
            }
          }

      val get_spin_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "get_spin_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_spin_degrees" }
            }
          }

      val get_spin_sides: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "get_spin_sides".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_spin_sides" }
            }
          }

      val is_path_continuous_u: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "is_path_continuous_u".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_path_continuous_u" }
            }
          }

      val is_path_joined: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "is_path_joined".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_path_joined" }
            }
          }

      val is_path_local: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "is_path_local".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_path_local" }
            }
          }

      val set_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "set_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_depth" }
            }
          }

      val set_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_material" }
            }
          }

      val set_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "set_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mode" }
            }
          }

      val set_path_continuous_u: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "set_path_continuous_u".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_path_continuous_u" }
            }
          }

      val set_path_interval: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "set_path_interval".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_path_interval" }
            }
          }

      val set_path_joined: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "set_path_joined".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_path_joined" }
            }
          }

      val set_path_local: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "set_path_local".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_path_local" }
            }
          }

      val set_path_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "set_path_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_path_node" }
            }
          }

      val set_path_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "set_path_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_path_rotation" }
            }
          }

      val set_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "set_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_polygon" }
            }
          }

      val set_smooth_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "set_smooth_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_smooth_faces" }
            }
          }

      val set_spin_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "set_spin_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_spin_degrees" }
            }
          }

      val set_spin_sides: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
              "set_spin_sides".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_spin_sides" }
            }
          }
    }
  }
}
