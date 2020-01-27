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

open class Polygon2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun addBone(path: NodePath, weights: PoolRealArray) {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(weights)
    __method_bind.add_bone.call(this._handle, _args.toVariant(), 2)
  }

  fun clearBones() {
    __method_bind.clear_bones.call(this._handle)
  }

  fun eraseBone(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.erase_bone.call(this._handle, _arg, 1)
  }

  fun getAntialiased(): Boolean {
    val _ret = __method_bind.get_antialiased.call(this._handle)
    return _ret.asBool()
  }

  fun getBoneCount(): Int {
    val _ret = __method_bind.get_bone_count.call(this._handle)
    return _ret.asInt()
  }

  fun getBonePath(index: Int): NodePath {
    val _arg = Variant.new(index)
    val _ret = __method_bind.get_bone_path.call(this._handle, _arg, 1)
    return _ret.asNodePath()
  }

  fun getBoneWeights(index: Int): PoolRealArray {
    val _arg = Variant.new(index)
    val _ret = __method_bind.get_bone_weights.call(this._handle, _arg, 1)
    return _ret.asPoolRealArray()
  }

  fun getColor(): Color {
    val _ret = __method_bind.get_color.call(this._handle)
    return _ret.asColor()
  }

  fun getInternalVertexCount(): Int {
    val _ret = __method_bind.get_internal_vertex_count.call(this._handle)
    return _ret.asInt()
  }

  fun getInvert(): Boolean {
    val _ret = __method_bind.get_invert.call(this._handle)
    return _ret.asBool()
  }

  fun getInvertBorder(): Float {
    val _ret = __method_bind.get_invert_border.call(this._handle)
    return _ret.asFloat()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.get_offset.call(this._handle)
    return _ret.asVector2()
  }

  fun getPolygon(): PoolVector2Array {
    val _ret = __method_bind.get_polygon.call(this._handle)
    return _ret.asPoolVector2Array()
  }

  fun getPolygons(): VariantArray {
    val _ret = __method_bind.get_polygons.call(this._handle)
    return _ret.asArray()
  }

  fun getSkeleton(): NodePath {
    val _ret = __method_bind.get_skeleton.call(this._handle)
    return _ret.asNodePath()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.get_texture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getTextureOffset(): Vector2 {
    val _ret = __method_bind.get_texture_offset.call(this._handle)
    return _ret.asVector2()
  }

  fun getTextureRotation(): Float {
    val _ret = __method_bind.get_texture_rotation.call(this._handle)
    return _ret.asFloat()
  }

  fun getTextureRotationDegrees(): Float {
    val _ret = __method_bind.get_texture_rotation_degrees.call(this._handle)
    return _ret.asFloat()
  }

  fun getTextureScale(): Vector2 {
    val _ret = __method_bind.get_texture_scale.call(this._handle)
    return _ret.asVector2()
  }

  fun getUv(): PoolVector2Array {
    val _ret = __method_bind.get_uv.call(this._handle)
    return _ret.asPoolVector2Array()
  }

  fun getVertexColors(): PoolColorArray {
    val _ret = __method_bind.get_vertex_colors.call(this._handle)
    return _ret.asPoolColorArray()
  }

  fun setAntialiased(antialiased: Boolean) {
    val _arg = Variant.new(antialiased)
    __method_bind.set_antialiased.call(this._handle, _arg, 1)
  }

  fun setBonePath(index: Int, path: NodePath) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(path)
    __method_bind.set_bone_path.call(this._handle, _args.toVariant(), 2)
  }

  fun setBoneWeights(index: Int, weights: PoolRealArray) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(weights)
    __method_bind.set_bone_weights.call(this._handle, _args.toVariant(), 2)
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.set_color.call(this._handle, _arg, 1)
  }

  fun setInternalVertexCount(internalVertexCount: Int) {
    val _arg = Variant.new(internalVertexCount)
    __method_bind.set_internal_vertex_count.call(this._handle, _arg, 1)
  }

  fun setInvert(invert: Boolean) {
    val _arg = Variant.new(invert)
    __method_bind.set_invert.call(this._handle, _arg, 1)
  }

  fun setInvertBorder(invertBorder: Float) {
    val _arg = Variant.new(invertBorder)
    __method_bind.set_invert_border.call(this._handle, _arg, 1)
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.set_offset.call(this._handle, _arg, 1)
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val _arg = Variant.new(polygon)
    __method_bind.set_polygon.call(this._handle, _arg, 1)
  }

  fun setPolygons(polygons: VariantArray) {
    val _arg = Variant.new(polygons)
    __method_bind.set_polygons.call(this._handle, _arg, 1)
  }

  fun setSkeleton(skeleton: NodePath) {
    val _arg = Variant.new(skeleton)
    __method_bind.set_skeleton.call(this._handle, _arg, 1)
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.set_texture.call(this._handle, _arg, 1)
  }

  fun setTextureOffset(textureOffset: Vector2) {
    val _arg = Variant.new(textureOffset)
    __method_bind.set_texture_offset.call(this._handle, _arg, 1)
  }

  fun setTextureRotation(textureRotation: Float) {
    val _arg = Variant.new(textureRotation)
    __method_bind.set_texture_rotation.call(this._handle, _arg, 1)
  }

  fun setTextureRotationDegrees(textureRotation: Float) {
    val _arg = Variant.new(textureRotation)
    __method_bind.set_texture_rotation_degrees.call(this._handle, _arg, 1)
  }

  fun setTextureScale(textureScale: Vector2) {
    val _arg = Variant.new(textureScale)
    __method_bind.set_texture_scale.call(this._handle, _arg, 1)
  }

  fun setUv(uv: PoolVector2Array) {
    val _arg = Variant.new(uv)
    __method_bind.set_uv.call(this._handle, _arg, 1)
  }

  fun setVertexColors(vertexColors: PoolColorArray) {
    val _arg = Variant.new(vertexColors)
    __method_bind.set_vertex_colors.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): Polygon2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Polygon2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Polygon2D" }
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
      val add_bone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "add_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_bone" }
        }
      val clear_bones: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "clear_bones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_bones" }
        }
      val erase_bone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "erase_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method erase_bone" }
        }
      val get_antialiased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_antialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_antialiased" }
        }
      val get_bone_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_bone_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_count" }
        }
      val get_bone_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_bone_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_path" }
        }
      val get_bone_weights: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_bone_weights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_weights" }
        }
      val get_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val get_internal_vertex_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_internal_vertex_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_internal_vertex_count" }
        }
      val get_invert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_invert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_invert" }
        }
      val get_invert_border: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_invert_border".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_invert_border" }
        }
      val get_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val get_polygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon" }
        }
      val get_polygons: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_polygons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygons" }
        }
      val get_skeleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_skeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skeleton" }
        }
      val get_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val get_texture_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_offset" }
        }
      val get_texture_rotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_texture_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_rotation" }
        }
      val get_texture_rotation_degrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_texture_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_rotation_degrees" }
        }
      val get_texture_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_texture_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_scale" }
        }
      val get_uv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_uv" }
        }
      val get_vertex_colors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_vertex_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_colors" }
        }
      val set_antialiased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_antialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_antialiased" }
        }
      val set_bone_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_bone_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_path" }
        }
      val set_bone_weights: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_bone_weights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_weights" }
        }
      val set_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val set_internal_vertex_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_internal_vertex_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_internal_vertex_count" }
        }
      val set_invert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_invert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_invert" }
        }
      val set_invert_border: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_invert_border".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_invert_border" }
        }
      val set_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val set_polygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_polygon" }
        }
      val set_polygons: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_polygons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_polygons" }
        }
      val set_skeleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_skeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_skeleton" }
        }
      val set_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }
      val set_texture_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_offset" }
        }
      val set_texture_rotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_texture_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_rotation" }
        }
      val set_texture_rotation_degrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_texture_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_rotation_degrees" }
        }
      val set_texture_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_texture_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_scale" }
        }
      val set_uv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uv" }
        }
      val set_vertex_colors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_vertex_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_colors" }
        }}
  }
}
