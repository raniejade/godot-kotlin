// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
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

open class CSGPolygon(
  _handle: COpaquePointer
) : CSGPrimitive(_handle) {
  var depth: Float
    get() {
       return getDepth() 
    }
    set(value) {
      setDepth(value)
    }

  var material: `SpatialMaterial,ShaderMaterial`
    get() {
       return getMaterial() 
    }
    set(value) {
      setMaterial(value)
    }

  var mode: Int
    get() {
       return CSGPolygon.Mode.from(getMode()) 
    }
    set(value) {
      setMode(CSGPolygon.Mode.from(value))
    }

  var pathContinuousU: Boolean
    get() {
       return isPathContinuousU() 
    }
    set(value) {
      setPathContinuousU(value)
    }

  var pathInterval: Float
    get() {
       return getPathInterval() 
    }
    set(value) {
      setPathInterval(value)
    }

  var pathJoined: Boolean
    get() {
       return isPathJoined() 
    }
    set(value) {
      setPathJoined(value)
    }

  var pathLocal: Boolean
    get() {
       return isPathLocal() 
    }
    set(value) {
      setPathLocal(value)
    }

  var pathNode: NodePath
    get() {
       return getPathNode() 
    }
    set(value) {
      setPathNode(value)
    }

  var pathRotation: Int
    get() {
       return CSGPolygon.PathRotation.from(getPathRotation()) 
    }
    set(value) {
      setPathRotation(CSGPolygon.PathRotation.from(value))
    }

  var polygon: PoolVector2Array
    get() {
       return getPolygon() 
    }
    set(value) {
      setPolygon(value)
    }

  var smoothFaces: Boolean
    get() {
       return getSmoothFaces() 
    }
    set(value) {
      setSmoothFaces(value)
    }

  var spinDegrees: Float
    get() {
       return getSpinDegrees() 
    }
    set(value) {
      setSpinDegrees(value)
    }

  var spinSides: Int
    get() {
       return getSpinSides() 
    }
    set(value) {
      setSpinSides(value)
    }

  fun getDepth(): Float {
    val _ret = __method_bind.getDepth.call(this._handle)
    return _ret.asFloat()
  }

  fun getMaterial(): Material {
    val _ret = __method_bind.getMaterial.call(this._handle)
    return _ret.asObject(::Material)!!
  }

  fun getMode(): Mode {
    val _ret = __method_bind.getMode.call(this._handle)
    return CSGPolygon.Mode.from(_ret.asInt())
  }

  fun getPathInterval(): Float {
    val _ret = __method_bind.getPathInterval.call(this._handle)
    return _ret.asFloat()
  }

  fun getPathNode(): NodePath {
    val _ret = __method_bind.getPathNode.call(this._handle)
    return _ret.asNodePath()
  }

  fun getPathRotation(): PathRotation {
    val _ret = __method_bind.getPathRotation.call(this._handle)
    return CSGPolygon.PathRotation.from(_ret.asInt())
  }

  fun getPolygon(): PoolVector2Array {
    val _ret = __method_bind.getPolygon.call(this._handle)
    return _ret.asPoolVector2Array()
  }

  fun getSmoothFaces(): Boolean {
    val _ret = __method_bind.getSmoothFaces.call(this._handle)
    return _ret.asBoolean()
  }

  fun getSpinDegrees(): Float {
    val _ret = __method_bind.getSpinDegrees.call(this._handle)
    return _ret.asFloat()
  }

  fun getSpinSides(): Int {
    val _ret = __method_bind.getSpinSides.call(this._handle)
    return _ret.asInt()
  }

  fun isPathContinuousU(): Boolean {
    val _ret = __method_bind.isPathContinuousU.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPathJoined(): Boolean {
    val _ret = __method_bind.isPathJoined.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPathLocal(): Boolean {
    val _ret = __method_bind.isPathLocal.call(this._handle)
    return _ret.asBoolean()
  }

  fun setDepth(depth: Float) {
    val _arg = Variant.new(depth)
    __method_bind.setDepth.call(this._handle, _arg, 1)
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.setMaterial.call(this._handle, _arg, 1)
  }

  fun setMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setMode.call(this._handle, _arg, 1)
  }

  fun setPathContinuousU(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setPathContinuousU.call(this._handle, _arg, 1)
  }

  fun setPathInterval(distance: Float) {
    val _arg = Variant.new(distance)
    __method_bind.setPathInterval.call(this._handle, _arg, 1)
  }

  fun setPathJoined(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setPathJoined.call(this._handle, _arg, 1)
  }

  fun setPathLocal(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setPathLocal.call(this._handle, _arg, 1)
  }

  fun setPathNode(path: NodePath) {
    val _arg = Variant.new(path)
    __method_bind.setPathNode.call(this._handle, _arg, 1)
  }

  fun setPathRotation(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setPathRotation.call(this._handle, _arg, 1)
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val _arg = Variant.new(polygon)
    __method_bind.setPolygon.call(this._handle, _arg, 1)
  }

  fun setSmoothFaces(smoothFaces: Boolean) {
    val _arg = Variant.new(smoothFaces)
    __method_bind.setSmoothFaces.call(this._handle, _arg, 1)
  }

  fun setSpinDegrees(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setSpinDegrees.call(this._handle, _arg, 1)
  }

  fun setSpinSides(spinSides: Int) {
    val _arg = Variant.new(spinSides)
    __method_bind.setSpinSides.call(this._handle, _arg, 1)
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
      requireNotNull(fnPtr) { "No instance found for CSGPolygon" }
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
      val getDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "getDepth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDepth" }
        }
      val getMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "getMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaterial" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "getMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMode" }
        }
      val getPathInterval: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "getPathInterval".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPathInterval" }
        }
      val getPathNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "getPathNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPathNode" }
        }
      val getPathRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "getPathRotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPathRotation" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "getPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPolygon" }
        }
      val getSmoothFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "getSmoothFaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSmoothFaces" }
        }
      val getSpinDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "getSpinDegrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpinDegrees" }
        }
      val getSpinSides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "getSpinSides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSpinSides" }
        }
      val isPathContinuousU: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "isPathContinuousU".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPathContinuousU" }
        }
      val isPathJoined: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "isPathJoined".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPathJoined" }
        }
      val isPathLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "isPathLocal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPathLocal" }
        }
      val setDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "setDepth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDepth" }
        }
      val setMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "setMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaterial" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "setMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMode" }
        }
      val setPathContinuousU: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "setPathContinuousU".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPathContinuousU" }
        }
      val setPathInterval: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "setPathInterval".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPathInterval" }
        }
      val setPathJoined: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "setPathJoined".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPathJoined" }
        }
      val setPathLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "setPathLocal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPathLocal" }
        }
      val setPathNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "setPathNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPathNode" }
        }
      val setPathRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "setPathRotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPathRotation" }
        }
      val setPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "setPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPolygon" }
        }
      val setSmoothFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "setSmoothFaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSmoothFaces" }
        }
      val setSpinDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "setSpinDegrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSpinDegrees" }
        }
      val setSpinSides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "setSpinSides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSpinSides" }
        }}
  }
}
