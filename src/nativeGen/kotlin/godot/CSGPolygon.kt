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
import kotlin.Unit
import kotlin.reflect.KCallable
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

  var material: Material
    get() {
       return getMaterial() 
    }
    set(value) {
      setMaterial(value)
    }

  var mode: Mode
    get() {
       return getMode() 
    }
    set(value) {
      setMode(value.value)
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

  var pathRotation: PathRotation
    get() {
       return getPathRotation() 
    }
    set(value) {
      setPathRotation(value.value)
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

  /**
   * Specialized setter for pathNode
   */
  fun pathNode(cb: NodePath.() -> Unit) {
    val _p = pathNode
    cb(_p)
    pathNode = _p
  }

  /**
   * Specialized setter for polygon
   */
  fun polygon(cb: PoolVector2Array.() -> Unit) {
    val _p = polygon
    cb(_p)
    polygon = _p
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
    __method_bind.setDepth.call(this._handle, listOf(_arg))
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.setMaterial.call(this._handle, listOf(_arg))
  }

  fun setMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setMode.call(this._handle, listOf(_arg))
  }

  fun setPathContinuousU(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setPathContinuousU.call(this._handle, listOf(_arg))
  }

  fun setPathInterval(distance: Float) {
    val _arg = Variant.new(distance)
    __method_bind.setPathInterval.call(this._handle, listOf(_arg))
  }

  fun setPathJoined(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setPathJoined.call(this._handle, listOf(_arg))
  }

  fun setPathLocal(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setPathLocal.call(this._handle, listOf(_arg))
  }

  fun setPathNode(path: NodePath) {
    val _arg = Variant.new(path)
    __method_bind.setPathNode.call(this._handle, listOf(_arg))
  }

  fun setPathRotation(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setPathRotation.call(this._handle, listOf(_arg))
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val _arg = Variant.new(polygon)
    __method_bind.setPolygon.call(this._handle, listOf(_arg))
  }

  fun setSmoothFaces(smoothFaces: Boolean) {
    val _arg = Variant.new(smoothFaces)
    __method_bind.setSmoothFaces.call(this._handle, listOf(_arg))
  }

  fun setSpinDegrees(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.setSpinDegrees.call(this._handle, listOf(_arg))
  }

  fun setSpinSides(spinSides: Int) {
    val _arg = Variant.new(spinSides)
    __method_bind.setSpinSides.call(this._handle, listOf(_arg))
  }

  enum class PathRotation(
    val value: Int
  ) {
    POLYGON(0),

    PATH(1),

    PATH_FOLLOW(2);

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
    DEPTH(0),

    SPIN(1),

    PATH(2);

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
            "get_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_depth" }
        }
      val getMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_material" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val getPathInterval: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_path_interval".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path_interval" }
        }
      val getPathNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_path_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path_node" }
        }
      val getPathRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_path_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path_rotation" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon" }
        }
      val getSmoothFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_smooth_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_smooth_faces" }
        }
      val getSpinDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_spin_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spin_degrees" }
        }
      val getSpinSides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_spin_sides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spin_sides" }
        }
      val isPathContinuousU: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "is_path_continuous_u".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_path_continuous_u" }
        }
      val isPathJoined: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "is_path_joined".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_path_joined" }
        }
      val isPathLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "is_path_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_path_local" }
        }
      val setDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_depth" }
        }
      val setMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val setPathContinuousU: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_continuous_u".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_continuous_u" }
        }
      val setPathInterval: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_interval".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_interval" }
        }
      val setPathJoined: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_joined".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_joined" }
        }
      val setPathLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_local" }
        }
      val setPathNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_node" }
        }
      val setPathRotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_rotation" }
        }
      val setPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_polygon" }
        }
      val setSmoothFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_smooth_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_smooth_faces" }
        }
      val setSpinDegrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_spin_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spin_degrees" }
        }
      val setSpinSides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_spin_sides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spin_sides" }
        }}
  }
}
