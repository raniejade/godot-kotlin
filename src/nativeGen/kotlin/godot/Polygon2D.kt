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
  var antialiased: Boolean
    get() {
       return getAntialiased() 
    }
    set(value) {
      setAntialiased(value)
    }

  var bones: Boolean
    get() {
       return _getBones() 
    }
    set(value) {
      _setBones(value)
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

  fun addBone(path: NodePath, weights: PoolRealArray) {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(weights)
    __method_bind.addBone.call(this._handle, _args.toVariant(), 2)
  }

  fun clearBones() {
    __method_bind.clearBones.call(this._handle)
  }

  fun eraseBone(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.eraseBone.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.getBonePath.call(this._handle, _arg, 1)
    return _ret.asNodePath()
  }

  fun getBoneWeights(index: Int): PoolRealArray {
    val _arg = Variant.new(index)
    val _ret = __method_bind.getBoneWeights.call(this._handle, _arg, 1)
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
    __method_bind.setAntialiased.call(this._handle, _arg, 1)
  }

  fun setBonePath(index: Int, path: NodePath) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(path)
    __method_bind.setBonePath.call(this._handle, _args.toVariant(), 2)
  }

  fun setBoneWeights(index: Int, weights: PoolRealArray) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(weights)
    __method_bind.setBoneWeights.call(this._handle, _args.toVariant(), 2)
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setColor.call(this._handle, _arg, 1)
  }

  fun setInternalVertexCount(internalVertexCount: Int) {
    val _arg = Variant.new(internalVertexCount)
    __method_bind.setInternalVertexCount.call(this._handle, _arg, 1)
  }

  fun setInvert(invert: Boolean) {
    val _arg = Variant.new(invert)
    __method_bind.setInvert.call(this._handle, _arg, 1)
  }

  fun setInvertBorder(invertBorder: Float) {
    val _arg = Variant.new(invertBorder)
    __method_bind.setInvertBorder.call(this._handle, _arg, 1)
  }

  fun setOffset(offset: Vector2) {
    val _arg = Variant.new(offset)
    __method_bind.setOffset.call(this._handle, _arg, 1)
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val _arg = Variant.new(polygon)
    __method_bind.setPolygon.call(this._handle, _arg, 1)
  }

  fun setPolygons(polygons: VariantArray) {
    val _arg = Variant.new(polygons)
    __method_bind.setPolygons.call(this._handle, _arg, 1)
  }

  fun setSkeleton(skeleton: NodePath) {
    val _arg = Variant.new(skeleton)
    __method_bind.setSkeleton.call(this._handle, _arg, 1)
  }

  fun setTexture(texture: Texture) {
    val _arg = Variant.new(texture)
    __method_bind.setTexture.call(this._handle, _arg, 1)
  }

  fun setTextureOffset(textureOffset: Vector2) {
    val _arg = Variant.new(textureOffset)
    __method_bind.setTextureOffset.call(this._handle, _arg, 1)
  }

  fun setTextureRotation(textureRotation: Float) {
    val _arg = Variant.new(textureRotation)
    __method_bind.setTextureRotation.call(this._handle, _arg, 1)
  }

  fun setTextureRotationDegrees(textureRotation: Float) {
    val _arg = Variant.new(textureRotation)
    __method_bind.setTextureRotationDegrees.call(this._handle, _arg, 1)
  }

  fun setTextureScale(textureScale: Vector2) {
    val _arg = Variant.new(textureScale)
    __method_bind.setTextureScale.call(this._handle, _arg, 1)
  }

  fun setUv(uv: PoolVector2Array) {
    val _arg = Variant.new(uv)
    __method_bind.setUv.call(this._handle, _arg, 1)
  }

  fun setVertexColors(vertexColors: PoolColorArray) {
    val _arg = Variant.new(vertexColors)
    __method_bind.setVertexColors.call(this._handle, _arg, 1)
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
      val addBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "addBone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addBone" }
        }
      val clearBones: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "clearBones".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearBones" }
        }
      val eraseBone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "eraseBone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method eraseBone" }
        }
      val getAntialiased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getAntialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAntialiased" }
        }
      val getBoneCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getBoneCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBoneCount" }
        }
      val getBonePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getBonePath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBonePath" }
        }
      val getBoneWeights: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getBoneWeights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBoneWeights" }
        }
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColor" }
        }
      val getInternalVertexCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getInternalVertexCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInternalVertexCount" }
        }
      val getInvert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getInvert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInvert" }
        }
      val getInvertBorder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getInvertBorder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInvertBorder" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOffset" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPolygon" }
        }
      val getPolygons: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getPolygons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPolygons" }
        }
      val getSkeleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getSkeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSkeleton" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTexture" }
        }
      val getTextureOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getTextureOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTextureOffset" }
        }
      val getTextureRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getTextureRotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTextureRotation" }
        }
      val getTextureRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getTextureRotationDegrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTextureRotationDegrees" }
        }
      val getTextureScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getTextureScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTextureScale" }
        }
      val getUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getUv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUv" }
        }
      val getVertexColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "getVertexColors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertexColors" }
        }
      val setAntialiased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setAntialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAntialiased" }
        }
      val setBonePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setBonePath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBonePath" }
        }
      val setBoneWeights: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setBoneWeights".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBoneWeights" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setColor" }
        }
      val setInternalVertexCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setInternalVertexCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setInternalVertexCount" }
        }
      val setInvert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setInvert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setInvert" }
        }
      val setInvertBorder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setInvertBorder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setInvertBorder" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOffset" }
        }
      val setPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPolygon" }
        }
      val setPolygons: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setPolygons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPolygons" }
        }
      val setSkeleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setSkeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSkeleton" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTexture" }
        }
      val setTextureOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setTextureOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTextureOffset" }
        }
      val setTextureRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setTextureRotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTextureRotation" }
        }
      val setTextureRotationDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setTextureRotationDegrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTextureRotationDegrees" }
        }
      val setTextureScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setTextureScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTextureScale" }
        }
      val setUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setUv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUv" }
        }
      val setVertexColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Polygon2D".cstr.ptr,
            "setVertexColors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVertexColors" }
        }}
  }
}
