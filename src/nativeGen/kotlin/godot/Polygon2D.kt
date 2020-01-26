// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolColorArray
import godot.core.PoolRealArray
import godot.core.PoolVector2Array
import godot.core.VariantArray
import godot.core.Vector2
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

open class Polygon2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun addBone(path: NodePath, weights: PoolRealArray) {
    TODO()
  }

  fun clearBones() {
    TODO()
  }

  fun eraseBone(index: Int) {
    TODO()
  }

  fun getAntialiased(): Boolean {
    TODO()
  }

  fun getBoneCount(): Int {
    TODO()
  }

  fun getBonePath(index: Int): NodePath {
    TODO()
  }

  fun getBoneWeights(index: Int): PoolRealArray {
    TODO()
  }

  fun getColor(): Color {
    TODO()
  }

  fun getInternalVertexCount(): Int {
    TODO()
  }

  fun getInvert(): Boolean {
    TODO()
  }

  fun getInvertBorder(): Float {
    TODO()
  }

  fun getOffset(): Vector2 {
    TODO()
  }

  fun getPolygon(): PoolVector2Array {
    TODO()
  }

  fun getPolygons(): VariantArray {
    TODO()
  }

  fun getSkeleton(): NodePath {
    TODO()
  }

  fun getTexture(): Texture {
    TODO()
  }

  fun getTextureOffset(): Vector2 {
    TODO()
  }

  fun getTextureRotation(): Float {
    TODO()
  }

  fun getTextureRotationDegrees(): Float {
    TODO()
  }

  fun getTextureScale(): Vector2 {
    TODO()
  }

  fun getUv(): PoolVector2Array {
    TODO()
  }

  fun getVertexColors(): PoolColorArray {
    TODO()
  }

  fun setAntialiased(antialiased: Boolean) {
    TODO()
  }

  fun setBonePath(index: Int, path: NodePath) {
    TODO()
  }

  fun setBoneWeights(index: Int, weights: PoolRealArray) {
    TODO()
  }

  fun setColor(color: Color) {
    TODO()
  }

  fun setInternalVertexCount(internal_vertex_count: Int) {
    TODO()
  }

  fun setInvert(invert: Boolean) {
    TODO()
  }

  fun setInvertBorder(invert_border: Float) {
    TODO()
  }

  fun setOffset(offset: Vector2) {
    TODO()
  }

  fun setPolygon(polygon: PoolVector2Array) {
    TODO()
  }

  fun setPolygons(polygons: VariantArray) {
    TODO()
  }

  fun setSkeleton(skeleton: NodePath) {
    TODO()
  }

  fun setTexture(texture: Texture) {
    TODO()
  }

  fun setTextureOffset(texture_offset: Vector2) {
    TODO()
  }

  fun setTextureRotation(texture_rotation: Float) {
    TODO()
  }

  fun setTextureRotationDegrees(texture_rotation: Float) {
    TODO()
  }

  fun setTextureScale(texture_scale: Vector2) {
    TODO()
  }

  fun setUv(uv: PoolVector2Array) {
    TODO()
  }

  fun setVertexColors(vertex_colors: PoolColorArray) {
    TODO()
  }

  companion object {
    fun new(): Polygon2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Polygon2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Polygon2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Polygon2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Polygon2D
     */
    private object __method_bind {
      val add_bone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "add_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_bone" }
            }
          }

      val clear_bones: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "clear_bones".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_bones" }
            }
          }

      val erase_bone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "erase_bone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method erase_bone" }
            }
          }

      val get_antialiased: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_antialiased".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_antialiased" }
            }
          }

      val get_bone_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_bone_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_count" }
            }
          }

      val get_bone_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_bone_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_path" }
            }
          }

      val get_bone_weights: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_bone_weights".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bone_weights" }
            }
          }

      val get_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color" }
            }
          }

      val get_internal_vertex_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_internal_vertex_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_internal_vertex_count" }
            }
          }

      val get_invert: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_invert".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_invert" }
            }
          }

      val get_invert_border: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_invert_border".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_invert_border" }
            }
          }

      val get_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val get_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_polygon" }
            }
          }

      val get_polygons: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_polygons".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_polygons" }
            }
          }

      val get_skeleton: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_skeleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_skeleton" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_texture_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_texture_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_offset" }
            }
          }

      val get_texture_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_texture_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_rotation" }
            }
          }

      val get_texture_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_texture_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_rotation_degrees" }
            }
          }

      val get_texture_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_texture_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_scale" }
            }
          }

      val get_uv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_uv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_uv" }
            }
          }

      val get_vertex_colors: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "get_vertex_colors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertex_colors" }
            }
          }

      val set_antialiased: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_antialiased".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_antialiased" }
            }
          }

      val set_bone_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_bone_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_path" }
            }
          }

      val set_bone_weights: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_bone_weights".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bone_weights" }
            }
          }

      val set_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color" }
            }
          }

      val set_internal_vertex_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_internal_vertex_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_internal_vertex_count" }
            }
          }

      val set_invert: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_invert".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_invert" }
            }
          }

      val set_invert_border: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_invert_border".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_invert_border" }
            }
          }

      val set_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offset" }
            }
          }

      val set_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_polygon" }
            }
          }

      val set_polygons: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_polygons".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_polygons" }
            }
          }

      val set_skeleton: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_skeleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_skeleton" }
            }
          }

      val set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val set_texture_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_texture_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_offset" }
            }
          }

      val set_texture_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_texture_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_rotation" }
            }
          }

      val set_texture_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_texture_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_rotation_degrees" }
            }
          }

      val set_texture_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_texture_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_scale" }
            }
          }

      val set_uv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_uv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_uv" }
            }
          }

      val set_vertex_colors: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
              "set_vertex_colors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vertex_colors" }
            }
          }
    }
  }
}
