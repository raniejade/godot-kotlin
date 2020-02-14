// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
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

open class CSGPolygon(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : CSGPrimitive(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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

  open fun _has_editable_3d_polygon_no_depth(): Boolean {
    TODO()
  }

  open fun _is_editable_3d_polygon(): Boolean {
    TODO()
  }

  open fun _path_changed() {
    TODO()
  }

  open fun _path_exited() {
    TODO()
  }

  fun getDepth(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDepth.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMaterial(): Material {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Material
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMaterial.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Material>(_tmp.value!!)
      _ret
    }
  }

  fun getMode(): Mode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMode.call(self._handle, emptyList(), _retPtr)
      CSGPolygon.Mode.from(_ret.value)
    }
  }

  fun getPathInterval(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPathInterval.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPathNode(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getPathNode.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPathRotation(): PathRotation {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPathRotation.call(self._handle, emptyList(), _retPtr)
      CSGPolygon.PathRotation.from(_ret.value)
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

  fun getSmoothFaces(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSmoothFaces.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSpinDegrees(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSpinDegrees.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSpinSides(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSpinSides.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPathContinuousU(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPathContinuousU.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPathJoined(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPathJoined.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPathLocal(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPathLocal.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setDepth(depth: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDepth.call(self._handle, listOf(depth), null)
    }
  }

  fun setMaterial(material: Material) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaterial.call(self._handle, listOf(material), null)
    }
  }

  fun setMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setPathContinuousU(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPathContinuousU.call(self._handle, listOf(enable), null)
    }
  }

  fun setPathInterval(distance: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPathInterval.call(self._handle, listOf(distance), null)
    }
  }

  fun setPathJoined(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPathJoined.call(self._handle, listOf(enable), null)
    }
  }

  fun setPathLocal(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPathLocal.call(self._handle, listOf(enable), null)
    }
  }

  fun setPathNode(path: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPathNode.call(self._handle, listOf(path), null)
    }
  }

  fun setPathRotation(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPathRotation.call(self._handle, listOf(mode), null)
    }
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPolygon.call(self._handle, listOf(polygon), null)
    }
  }

  fun setSmoothFaces(smoothFaces: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSmoothFaces.call(self._handle, listOf(smoothFaces), null)
    }
  }

  fun setSpinDegrees(degrees: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpinDegrees.call(self._handle, listOf(degrees), null)
    }
  }

  fun setSpinSides(spinSides: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpinSides.call(self._handle, listOf(spinSides), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CSGPolygon".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CSGPolygon" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for CSGPolygon
     */
    private object __method_bind {
      val getDepth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_depth" }
        }
      val getMaterial: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_material" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val getPathInterval: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_path_interval".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path_interval" }
        }
      val getPathNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_path_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path_node" }
        }
      val getPathRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_path_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path_rotation" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon" }
        }
      val getSmoothFaces: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_smooth_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_smooth_faces" }
        }
      val getSpinDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_spin_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spin_degrees" }
        }
      val getSpinSides: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_spin_sides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spin_sides" }
        }
      val isPathContinuousU: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "is_path_continuous_u".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_path_continuous_u" }
        }
      val isPathJoined: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "is_path_joined".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_path_joined" }
        }
      val isPathLocal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "is_path_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_path_local" }
        }
      val setDepth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_depth" }
        }
      val setMaterial: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val setPathContinuousU: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_continuous_u".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_continuous_u" }
        }
      val setPathInterval: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_interval".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_interval" }
        }
      val setPathJoined: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_joined".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_joined" }
        }
      val setPathLocal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_local" }
        }
      val setPathNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_node" }
        }
      val setPathRotation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_rotation" }
        }
      val setPolygon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_polygon" }
        }
      val setSmoothFaces: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_smooth_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_smooth_faces" }
        }
      val setSpinDegrees: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_spin_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spin_degrees" }
        }
      val setSpinSides: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_spin_sides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spin_sides" }
        }}
  }
}
