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

open class CSGPolygon internal constructor(
  _handle: COpaquePointer
) : CSGPrimitive(_handle) {
  fun getDepth(): Float {
    val _ret = __method_bind.get_depth.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getMaterial(): Material {
    val _ret = __method_bind.get_material.call(this.toVariant())
    return _ret.asObject(::Material)!!
  }

  fun getMode(): Mode {
    val _ret = __method_bind.get_mode.call(this.toVariant())
    return CSGPolygon.Mode.from(_ret.asInt())
  }

  fun getPathInterval(): Float {
    val _ret = __method_bind.get_path_interval.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getPathNode(): NodePath {
    val _ret = __method_bind.get_path_node.call(this.toVariant())
    return _ret.asNodePath()
  }

  fun getPathRotation(): PathRotation {
    val _ret = __method_bind.get_path_rotation.call(this.toVariant())
    return CSGPolygon.PathRotation.from(_ret.asInt())
  }

  fun getPolygon(): PoolVector2Array {
    val _ret = __method_bind.get_polygon.call(this.toVariant())
    return _ret.asPoolVector2Array()
  }

  fun getSmoothFaces(): Boolean {
    val _ret = __method_bind.get_smooth_faces.call(this.toVariant())
    return _ret.asBool()
  }

  fun getSpinDegrees(): Float {
    val _ret = __method_bind.get_spin_degrees.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSpinSides(): Int {
    val _ret = __method_bind.get_spin_sides.call(this.toVariant())
    return _ret.asInt()
  }

  fun isPathContinuousU(): Boolean {
    val _ret = __method_bind.is_path_continuous_u.call(this.toVariant())
    return _ret.asBool()
  }

  fun isPathJoined(): Boolean {
    val _ret = __method_bind.is_path_joined.call(this.toVariant())
    return _ret.asBool()
  }

  fun isPathLocal(): Boolean {
    val _ret = __method_bind.is_path_local.call(this.toVariant())
    return _ret.asBool()
  }

  fun setDepth(depth: Float) {
    val _arg = Variant.new(depth)
    __method_bind.set_depth.call(this.toVariant(), _arg, 1)
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.set_material.call(this.toVariant(), _arg, 1)
  }

  fun setMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_mode.call(this.toVariant(), _arg, 1)
  }

  fun setPathContinuousU(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_path_continuous_u.call(this.toVariant(), _arg, 1)
  }

  fun setPathInterval(distance: Float) {
    val _arg = Variant.new(distance)
    __method_bind.set_path_interval.call(this.toVariant(), _arg, 1)
  }

  fun setPathJoined(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_path_joined.call(this.toVariant(), _arg, 1)
  }

  fun setPathLocal(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_path_local.call(this.toVariant(), _arg, 1)
  }

  fun setPathNode(path: NodePath) {
    val _arg = Variant.new(path)
    __method_bind.set_path_node.call(this.toVariant(), _arg, 1)
  }

  fun setPathRotation(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_path_rotation.call(this.toVariant(), _arg, 1)
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val _arg = Variant.new(polygon)
    __method_bind.set_polygon.call(this.toVariant(), _arg, 1)
  }

  fun setSmoothFaces(smoothFaces: Boolean) {
    val _arg = Variant.new(smoothFaces)
    __method_bind.set_smooth_faces.call(this.toVariant(), _arg, 1)
  }

  fun setSpinDegrees(degrees: Float) {
    val _arg = Variant.new(degrees)
    __method_bind.set_spin_degrees.call(this.toVariant(), _arg, 1)
  }

  fun setSpinSides(spinSides: Int) {
    val _arg = Variant.new(spinSides)
    __method_bind.set_spin_sides.call(this.toVariant(), _arg, 1)
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
      val get_depth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_depth" }
        }
      val get_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_material" }
        }
      val get_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val get_path_interval: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_path_interval".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path_interval" }
        }
      val get_path_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_path_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path_node" }
        }
      val get_path_rotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_path_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path_rotation" }
        }
      val get_polygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon" }
        }
      val get_smooth_faces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_smooth_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_smooth_faces" }
        }
      val get_spin_degrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_spin_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spin_degrees" }
        }
      val get_spin_sides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "get_spin_sides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spin_sides" }
        }
      val is_path_continuous_u: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "is_path_continuous_u".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_path_continuous_u" }
        }
      val is_path_joined: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "is_path_joined".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_path_joined" }
        }
      val is_path_local: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "is_path_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_path_local" }
        }
      val set_depth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_depth" }
        }
      val set_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material" }
        }
      val set_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val set_path_continuous_u: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_continuous_u".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_continuous_u" }
        }
      val set_path_interval: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_interval".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_interval" }
        }
      val set_path_joined: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_joined".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_joined" }
        }
      val set_path_local: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_local" }
        }
      val set_path_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_node" }
        }
      val set_path_rotation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_path_rotation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_path_rotation" }
        }
      val set_polygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_polygon" }
        }
      val set_smooth_faces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_smooth_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_smooth_faces" }
        }
      val set_spin_degrees: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_spin_degrees".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spin_degrees" }
        }
      val set_spin_sides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGPolygon".cstr.ptr,
            "set_spin_sides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spin_sides" }
        }}
  }
}
