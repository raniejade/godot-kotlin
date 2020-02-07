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
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Polygon2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var antialiased: Boolean
    get() {
       return getAntialiased() 
    }
    set(value) {
      setAntialiased(value)
    }

  var color: Color
    get() {
       return getColor() 
    }
    set(value) {
      setColor(value)
    }

  var internalVertexCount: Int
    get() {
       return getInternalVertexCount() 
    }
    set(value) {
      setInternalVertexCount(value)
    }

  var invertBorder: Float
    get() {
       return getInvertBorder() 
    }
    set(value) {
      setInvertBorder(value)
    }

  var invertEnable: Boolean
    get() {
       return getInvert() 
    }
    set(value) {
      setInvert(value)
    }

  var offset: Vector2
    get() {
       return getOffset() 
    }
    set(value) {
      setOffset(value)
    }

  var polygon: PoolVector2Array
    get() {
       return getPolygon() 
    }
    set(value) {
      setPolygon(value)
    }

  var polygons: VariantArray
    get() {
       return getPolygons() 
    }
    set(value) {
      setPolygons(value)
    }

  var skeleton: NodePath
    get() {
       return getSkeleton() 
    }
    set(value) {
      setSkeleton(value)
    }

  var texture: Texture
    get() {
       return getTexture() 
    }
    set(value) {
      setTexture(value)
    }

  var textureOffset: Vector2
    get() {
       return getTextureOffset() 
    }
    set(value) {
      setTextureOffset(value)
    }

  var textureRotation: Float
    get() {
       return getTextureRotation() 
    }
    set(value) {
      setTextureRotation(value)
    }

  var textureRotationDegrees: Float
    get() {
       return getTextureRotationDegrees() 
    }
    set(value) {
      setTextureRotationDegrees(value)
    }

  var textureScale: Vector2
    get() {
       return getTextureScale() 
    }
    set(value) {
      setTextureScale(value)
    }

  var uv: PoolVector2Array
    get() {
       return getUv() 
    }
    set(value) {
      setUv(value)
    }

  var vertexColors: PoolColorArray
    get() {
       return getVertexColors() 
    }
    set(value) {
      setVertexColors(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for color
   */
  fun color(cb: Color.() -> Unit) {
    val _p = color
    cb(_p)
    color = _p
  }

  /**
   * Specialized setter for offset
   */
  fun offset(cb: Vector2.() -> Unit) {
    val _p = offset
    cb(_p)
    offset = _p
  }

  /**
   * Specialized setter for polygon
   */
  fun polygon(cb: PoolVector2Array.() -> Unit) {
    val _p = polygon
    cb(_p)
    polygon = _p
  }

  /**
   * Specialized setter for skeleton
   */
  fun skeleton(cb: NodePath.() -> Unit) {
    val _p = skeleton
    cb(_p)
    skeleton = _p
  }

  /**
   * Specialized setter for textureOffset
   */
  fun textureOffset(cb: Vector2.() -> Unit) {
    val _p = textureOffset
    cb(_p)
    textureOffset = _p
  }

  /**
   * Specialized setter for textureScale
   */
  fun textureScale(cb: Vector2.() -> Unit) {
    val _p = textureScale
    cb(_p)
    textureScale = _p
  }

  /**
   * Specialized setter for uv
   */
  fun uv(cb: PoolVector2Array.() -> Unit) {
    val _p = uv
    cb(_p)
    uv = _p
  }

  /**
   * Specialized setter for vertexColors
   */
  fun vertexColors(cb: PoolColorArray.() -> Unit) {
    val _p = vertexColors
    cb(_p)
    vertexColors = _p
  }

  fun addBone(path: NodePath, weights: PoolRealArray) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(weights))
    __method_bind.addBone.call(this._handle, _args)
  }

  fun clearBones() {
    __method_bind.clearBones.call(this._handle)
  }

  fun eraseBone(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.eraseBone.call(this._handle, listOf(_arg))
  }

  fun getAntialiased(): Boolean {
    val _ret = __method_bind.getAntialiased.call(this._handle)
    return _ret.asBoolean()
  }

  fun getBoneCount(): Int {
    val _ret = __method_bind.getBoneCount.call(this._handle)
    return _ret.asInt()
  }

  fun getBonePath(index: Int): NodePath {
    val _arg = Variant.new(index)
    val _ret = __method_bind.getBonePath.call(this._handle, listOf(_arg))
    return _ret.asNodePath()
  }

  fun getBoneWeights(index: Int): PoolRealArray {
    val _arg = Variant.new(index)
    val _ret = __method_bind.getBoneWeights.call(this._handle, listOf(_arg))
    return _ret.asPoolRealArray()
  }

  fun getColor(): Color {
    val _ret = __method_bind.getColor.call(this._handle)
    return _ret.asColor()
  }

  fun getInternalVertexCount(): Int {
    val _ret = __method_bind.getInternalVertexCount.call(this._handle)
    return _ret.asInt()
  }

  fun getInvert(): Boolean {
    val _ret = __method_bind.getInvert.call(this._handle)
    return _ret.asBoolean()
  }

  fun getInvertBorder(): Float {
    val _ret = __method_bind.getInvertBorder.call(this._handle)
    return _ret.asFloat()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.getOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getPolygon(): PoolVector2Array {
    val _ret = __method_bind.getPolygon.call(this._handle)
    return _ret.asPoolVector2Array()
  }

  fun getPolygons(): VariantArray {
    val _ret = __method_bind.getPolygons.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getSkeleton(): NodePath {
    val _ret = __method_bind.getSkeleton.call(this._handle)
    return _ret.asNodePath()
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.getTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getTextureOffset(): Vector2 {
    val _ret = __method_bind.getTextureOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getTextureRotation(): Float {
    val _ret = __method_bind.getTextureRotation.call(this._handle)
    return _ret.asFloat()
  }

  fun getTextureRotationDegrees(): Float {
    val _ret = __method_bind.getTextureRotationDegrees.call(this._handle)
    return _ret.asFloat()
  }

  fun getTextureScale(): Vector2 {
    val _ret = __method_bind.getTextureScale.call(this._handle)
    return _ret.asVector2()
  }

  fun getUv(): PoolVector2Array {
    val _ret = __method_bind.getUv.call(this._handle)
    return _ret.asPoolVector2Array()
  }

  fun getVertexColors(): PoolColorArray {
    val _ret = __method_bind.getVertexColors.call(this._handle)
    return _ret.asPoolColorArray()
  }

  fun setAntialiased(antialiased: Boolean) {
    val _arg = Variant.new(antialiased)
    __method_bind.setAntialiased.call(this._handle, listOf(_arg))
  }

  fun setBonePath(index: Int, path: NodePath) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(index))
    _args.add(Variant.fromAny(path))
    __method_bind.setBonePath.call(this._handle, _args)
  }

  fun setBoneWeights(index: Int, weights: PoolRealArray) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(index))
    _args.add(Variant.fromAny(weights))
    __method_bind.setBoneWeights.call(this._handle, _args)
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setColor.call(this._handle, listOf(_arg))
  }

  fun setInternalVertexCount(internalVertexCount: Int) {
    val _arg = Variant.new(internalVertexCount)
    __method_bind.setInternalVertexCount.call(this._handle, listOf(_arg))
  }

  fun setInvert(invert: Boolean) {
    val _arg = Variant.new(invert)
    __method_bind.setInvert.call(this._handle, listOf(_arg))
  }

  fun setInvertBorder(invertBorder: Float) {
    val _arg = Variant.new(invertBorder)
    __method_bind.setInvertBorder.call(this._handle, listOf(_arg))
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.setOffset.call(this._handle, listOf(_arg))
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val _arg = Variant.new(polygon)
    __method_bind.setPolygon.call(this._handle, listOf(_arg))
  }

  fun setPolygons(polygons: VariantArray) {
    val _arg = Variant.new(polygons)
    __method_bind.setPolygons.call(this._handle, listOf(_arg))
  }

  fun setSkeleton(skeleton: NodePath) {
    val _arg = Variant.new(skeleton)
    __method_bind.setSkeleton.call(this._handle, listOf(_arg))
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, listOf(_arg))
  }

  fun setTextureOffset(textureOffset: Vector2) {
    val _arg = Variant.new(textureOffset)
    __method_bind.setTextureOffset.call(this._handle, listOf(_arg))
  }

  fun setTextureRotation(textureRotation: Float) {
    val _arg = Variant.new(textureRotation)
    __method_bind.setTextureRotation.call(this._handle, listOf(_arg))
  }

  fun setTextureRotationDegrees(textureRotation: Float) {
    val _arg = Variant.new(textureRotation)
    __method_bind.setTextureRotationDegrees.call(this._handle, listOf(_arg))
  }

  fun setTextureScale(textureScale: Vector2) {
    val _arg = Variant.new(textureScale)
    __method_bind.setTextureScale.call(this._handle, listOf(_arg))
  }

  fun setUv(uv: PoolVector2Array) {
    val _arg = Variant.new(uv)
    __method_bind.setUv.call(this._handle, listOf(_arg))
  }

  fun setVertexColors(vertexColors: PoolColorArray) {
    val _arg = Variant.new(vertexColors)
    __method_bind.setVertexColors.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Polygon2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Polygon2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Polygon2D
     */
    private object __method_bind {
      val addBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "add_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_bone" }
        }
      val clearBones: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "clear_bones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_bones" }
        }
      val eraseBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "erase_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method erase_bone" }
        }
      val getAntialiased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_antialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_antialiased" }
        }
      val getBoneCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_bone_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_count" }
        }
      val getBonePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_bone_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_path" }
        }
      val getBoneWeights: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_bone_weights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_weights" }
        }
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getInternalVertexCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_internal_vertex_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_internal_vertex_count" }
        }
      val getInvert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_invert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_invert" }
        }
      val getInvertBorder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_invert_border".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_invert_border" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon" }
        }
      val getPolygons: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_polygons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygons" }
        }
      val getSkeleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_skeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skeleton" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val getTextureOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_offset" }
        }
      val getTextureRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_texture_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_rotation" }
        }
      val getTextureRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_texture_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_rotation_degrees" }
        }
      val getTextureScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_texture_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_scale" }
        }
      val getUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_uv" }
        }
      val getVertexColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_vertex_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_colors" }
        }
      val setAntialiased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_antialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_antialiased" }
        }
      val setBonePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_bone_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_path" }
        }
      val setBoneWeights: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_bone_weights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_weights" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val setInternalVertexCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_internal_vertex_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_internal_vertex_count" }
        }
      val setInvert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_invert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_invert" }
        }
      val setInvertBorder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_invert_border".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_invert_border" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val setPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_polygon" }
        }
      val setPolygons: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_polygons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_polygons" }
        }
      val setSkeleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_skeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_skeleton" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }
      val setTextureOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_offset" }
        }
      val setTextureRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_texture_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_rotation" }
        }
      val setTextureRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_texture_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_rotation_degrees" }
        }
      val setTextureScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_texture_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_scale" }
        }
      val setUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uv" }
        }
      val setVertexColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_vertex_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_colors" }
        }}
  }
}
