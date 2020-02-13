// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolColorArray
import godot.core.PoolFloatArray
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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

  open fun _get_bones(): VariantArray {
    TODO()
  }

  open fun _set_bones(bones: VariantArray) {
    TODO()
  }

  open fun _skeleton_bone_setup_changed() {
    TODO()
  }

  fun addBone(path: NodePath, weights: PoolFloatArray) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(weights)
      __method_bind.addBone.call(self._handle, _args, null)
    }
  }

  fun clearBones() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearBones.call(self._handle, emptyList(), null)
    }
  }

  fun eraseBone(index: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.eraseBone.call(self._handle, listOf(index), null)
    }
  }

  fun getAntialiased(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAntialiased.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getBoneCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBoneCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getBonePath(index: Int): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getBonePath.call(self._handle, listOf(index), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBoneWeights(index: Int): PoolFloatArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolFloatArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getBoneWeights.call(self._handle, listOf(index), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getInternalVertexCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getInternalVertexCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getInvert(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getInvert.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getInvertBorder(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getInvertBorder.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPolygon(): PoolVector2Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector2Array()
      val _retPtr = _ret._value.ptr
      __method_bind.getPolygon.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPolygons(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getPolygons.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSkeleton(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getSkeleton.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTexture(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTexture.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getTextureOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getTextureOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTextureRotation(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTextureRotation.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTextureRotationDegrees(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTextureRotationDegrees.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getTextureScale(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getTextureScale.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUv(): PoolVector2Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector2Array()
      val _retPtr = _ret._value.ptr
      __method_bind.getUv.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVertexColors(): PoolColorArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolColorArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getVertexColors.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setAntialiased(antialiased: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAntialiased.call(self._handle, listOf(antialiased), null)
    }
  }

  fun setBonePath(index: Int, path: NodePath) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(index)
      _args.add(path)
      __method_bind.setBonePath.call(self._handle, _args, null)
    }
  }

  fun setBoneWeights(index: Int, weights: PoolFloatArray) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(index)
      _args.add(weights)
      __method_bind.setBoneWeights.call(self._handle, _args, null)
    }
  }

  fun setColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setColor.call(self._handle, listOf(color), null)
    }
  }

  fun setInternalVertexCount(internalVertexCount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInternalVertexCount.call(self._handle, listOf(internalVertexCount), null)
    }
  }

  fun setInvert(invert: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInvert.call(self._handle, listOf(invert), null)
    }
  }

  fun setInvertBorder(invertBorder: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInvertBorder.call(self._handle, listOf(invertBorder), null)
    }
  }

  fun setOffset(offset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOffset.call(self._handle, listOf(offset), null)
    }
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPolygon.call(self._handle, listOf(polygon), null)
    }
  }

  fun setPolygons(polygons: VariantArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPolygons.call(self._handle, listOf(polygons), null)
    }
  }

  fun setSkeleton(skeleton: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSkeleton.call(self._handle, listOf(skeleton), null)
    }
  }

  fun setTexture(texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTexture.call(self._handle, listOf(texture), null)
    }
  }

  fun setTextureOffset(textureOffset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTextureOffset.call(self._handle, listOf(textureOffset), null)
    }
  }

  fun setTextureRotation(textureRotation: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTextureRotation.call(self._handle, listOf(textureRotation), null)
    }
  }

  fun setTextureRotationDegrees(textureRotation: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTextureRotationDegrees.call(self._handle, listOf(textureRotation), null)
    }
  }

  fun setTextureScale(textureScale: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTextureScale.call(self._handle, listOf(textureScale), null)
    }
  }

  fun setUv(uv: PoolVector2Array) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUv.call(self._handle, listOf(uv), null)
    }
  }

  fun setVertexColors(vertexColors: PoolColorArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVertexColors.call(self._handle, listOf(vertexColors), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "add_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_bone" }
        }
      val clearBones: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "clear_bones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_bones" }
        }
      val eraseBone: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "erase_bone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method erase_bone" }
        }
      val getAntialiased: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_antialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_antialiased" }
        }
      val getBoneCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_bone_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_count" }
        }
      val getBonePath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_bone_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_path" }
        }
      val getBoneWeights: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_bone_weights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bone_weights" }
        }
      val getColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getInternalVertexCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_internal_vertex_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_internal_vertex_count" }
        }
      val getInvert: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_invert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_invert" }
        }
      val getInvertBorder: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_invert_border".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_invert_border" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon" }
        }
      val getPolygons: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_polygons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygons" }
        }
      val getSkeleton: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_skeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skeleton" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val getTextureOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_offset" }
        }
      val getTextureRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_texture_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_rotation" }
        }
      val getTextureRotationDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_texture_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_rotation_degrees" }
        }
      val getTextureScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_texture_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_scale" }
        }
      val getUv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_uv" }
        }
      val getVertexColors: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "get_vertex_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_vertex_colors" }
        }
      val setAntialiased: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_antialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_antialiased" }
        }
      val setBonePath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_bone_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_path" }
        }
      val setBoneWeights: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_bone_weights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bone_weights" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val setInternalVertexCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_internal_vertex_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_internal_vertex_count" }
        }
      val setInvert: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_invert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_invert" }
        }
      val setInvertBorder: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_invert_border".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_invert_border" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val setPolygon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_polygon" }
        }
      val setPolygons: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_polygons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_polygons" }
        }
      val setSkeleton: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_skeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_skeleton" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }
      val setTextureOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_offset" }
        }
      val setTextureRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_texture_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_rotation" }
        }
      val setTextureRotationDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_texture_rotation_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_rotation_degrees" }
        }
      val setTextureScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_texture_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_scale" }
        }
      val setUv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_uv" }
        }
      val setVertexColors: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "set_vertex_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertex_colors" }
        }}
  }
}
