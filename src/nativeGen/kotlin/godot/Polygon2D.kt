// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolColorArray
import godot.core.PoolRealArray
import godot.core.PoolVector2Array
import godot.core.Variant
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
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(weights)
    val _ret = __method_bind.add_bone.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun clearBones() {
    val _ret = __method_bind.clear_bones.call(this.toVariant())
    TODO()
  }

  fun eraseBone(index: Int) {
    val _args = VariantArray.new()
    _args.append(index)
    val _ret = __method_bind.erase_bone.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getAntialiased(): Boolean {
    val _ret = __method_bind.get_antialiased.call(this.toVariant())
    TODO()
  }

  fun getBoneCount(): Int {
    val _ret = __method_bind.get_bone_count.call(this.toVariant())
    TODO()
  }

  fun getBonePath(index: Int): NodePath {
    val _args = VariantArray.new()
    _args.append(index)
    val _ret = __method_bind.get_bone_path.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getBoneWeights(index: Int): PoolRealArray {
    val _args = VariantArray.new()
    _args.append(index)
    val _ret = __method_bind.get_bone_weights.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getColor(): Color {
    val _ret = __method_bind.get_color.call(this.toVariant())
    TODO()
  }

  fun getInternalVertexCount(): Int {
    val _ret = __method_bind.get_internal_vertex_count.call(this.toVariant())
    TODO()
  }

  fun getInvert(): Boolean {
    val _ret = __method_bind.get_invert.call(this.toVariant())
    TODO()
  }

  fun getInvertBorder(): Float {
    val _ret = __method_bind.get_invert_border.call(this.toVariant())
    TODO()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.get_offset.call(this.toVariant())
    TODO()
  }

  fun getPolygon(): PoolVector2Array {
    val _ret = __method_bind.get_polygon.call(this.toVariant())
    TODO()
  }

  fun getPolygons(): VariantArray {
    val _ret = __method_bind.get_polygons.call(this.toVariant())
    TODO()
  }

  fun getSkeleton(): NodePath {
    val _ret = __method_bind.get_skeleton.call(this.toVariant())
    TODO()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.get_texture.call(this.toVariant())
    TODO()
  }

  fun getTextureOffset(): Vector2 {
    val _ret = __method_bind.get_texture_offset.call(this.toVariant())
    TODO()
  }

  fun getTextureRotation(): Float {
    val _ret = __method_bind.get_texture_rotation.call(this.toVariant())
    TODO()
  }

  fun getTextureRotationDegrees(): Float {
    val _ret = __method_bind.get_texture_rotation_degrees.call(this.toVariant())
    TODO()
  }

  fun getTextureScale(): Vector2 {
    val _ret = __method_bind.get_texture_scale.call(this.toVariant())
    TODO()
  }

  fun getUv(): PoolVector2Array {
    val _ret = __method_bind.get_uv.call(this.toVariant())
    TODO()
  }

  fun getVertexColors(): PoolColorArray {
    val _ret = __method_bind.get_vertex_colors.call(this.toVariant())
    TODO()
  }

  fun setAntialiased(antialiased: Boolean) {
    val _args = VariantArray.new()
    _args.append(antialiased)
    val _ret = __method_bind.set_antialiased.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setBonePath(index: Int, path: NodePath) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(path)
    val _ret = __method_bind.set_bone_path.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setBoneWeights(index: Int, weights: PoolRealArray) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(weights)
    val _ret = __method_bind.set_bone_weights.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setColor(color: Color) {
    val _args = VariantArray.new()
    _args.append(color)
    val _ret = __method_bind.set_color.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setInternalVertexCount(internalVertexCount: Int) {
    val _args = VariantArray.new()
    _args.append(internalVertexCount)
    val _ret = __method_bind.set_internal_vertex_count.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setInvert(invert: Boolean) {
    val _args = VariantArray.new()
    _args.append(invert)
    val _ret = __method_bind.set_invert.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setInvertBorder(invertBorder: Float) {
    val _args = VariantArray.new()
    _args.append(invertBorder)
    val _ret = __method_bind.set_invert_border.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setOffset(offset: Vector2) {
    val _args = VariantArray.new()
    _args.append(offset)
    val _ret = __method_bind.set_offset.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val _args = VariantArray.new()
    _args.append(polygon)
    val _ret = __method_bind.set_polygon.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPolygons(polygons: VariantArray) {
    val _args = VariantArray.new()
    _args.append(polygons)
    val _ret = __method_bind.set_polygons.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSkeleton(skeleton: NodePath) {
    val _args = VariantArray.new()
    _args.append(skeleton)
    val _ret = __method_bind.set_skeleton.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTexture(texture: Texture) {
    val _args = VariantArray.new()
    _args.append(texture)
    val _ret = __method_bind.set_texture.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTextureOffset(textureOffset: Vector2) {
    val _args = VariantArray.new()
    _args.append(textureOffset)
    val _ret = __method_bind.set_texture_offset.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTextureRotation(textureRotation: Float) {
    val _args = VariantArray.new()
    _args.append(textureRotation)
    val _ret = __method_bind.set_texture_rotation.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTextureRotationDegrees(textureRotation: Float) {
    val _args = VariantArray.new()
    _args.append(textureRotation)
    val _ret = __method_bind.set_texture_rotation_degrees.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun setTextureScale(textureScale: Vector2) {
    val _args = VariantArray.new()
    _args.append(textureScale)
    val _ret = __method_bind.set_texture_scale.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setUv(uv: PoolVector2Array) {
    val _args = VariantArray.new()
    _args.append(uv)
    val _ret = __method_bind.set_uv.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setVertexColors(vertexColors: PoolColorArray) {
    val _args = VariantArray.new()
    _args.append(vertexColors)
    val _ret = __method_bind.set_vertex_colors.call(this.toVariant(), _args.toVariant(), 1)
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
    fun from(ptr: COpaquePointer): Polygon2D = Polygon2D(ptr)
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
