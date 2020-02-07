// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Godot
import godot.core.NodePath
import godot.core.PoolByteArray
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
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

open class BakedLightmapData(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var bounds: AABB
    get() {
       return getBounds() 
    }
    set(value) {
      setBounds(value)
    }

  var cellSpaceTransform: Transform
    get() {
       return getCellSpaceTransform() 
    }
    set(value) {
      setCellSpaceTransform(value)
    }

  var cellSubdiv: Int
    get() {
       return getCellSubdiv() 
    }
    set(value) {
      setCellSubdiv(value)
    }

  var energy: Float
    get() {
       return getEnergy() 
    }
    set(value) {
      setEnergy(value)
    }

  var octree: PoolByteArray
    get() {
       return getOctree() 
    }
    set(value) {
      setOctree(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for bounds
   */
  fun bounds(cb: AABB.() -> Unit) {
    val _p = bounds
    cb(_p)
    bounds = _p
  }

  /**
   * Specialized setter for cellSpaceTransform
   */
  fun cellSpaceTransform(cb: Transform.() -> Unit) {
    val _p = cellSpaceTransform
    cb(_p)
    cellSpaceTransform = _p
  }

  /**
   * Specialized setter for octree
   */
  fun octree(cb: PoolByteArray.() -> Unit) {
    val _p = octree
    cb(_p)
    octree = _p
  }

  fun addUser(
    path: NodePath,
    lightmap: Texture,
    instance: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(lightmap))
    _args.add(Variant.fromAny(instance))
    __method_bind.addUser.call(this._handle, _args)
  }

  fun clearUsers() {
    __method_bind.clearUsers.call(this._handle)
  }

  fun getBounds(): AABB {
    val _ret = __method_bind.getBounds.call(this._handle)
    return _ret.asAABB()
  }

  fun getCellSpaceTransform(): Transform {
    val _ret = __method_bind.getCellSpaceTransform.call(this._handle)
    return _ret.asTransform()
  }

  fun getCellSubdiv(): Int {
    val _ret = __method_bind.getCellSubdiv.call(this._handle)
    return _ret.asInt()
  }

  fun getEnergy(): Float {
    val _ret = __method_bind.getEnergy.call(this._handle)
    return _ret.asFloat()
  }

  fun getOctree(): PoolByteArray {
    val _ret = __method_bind.getOctree.call(this._handle)
    return _ret.asPoolByteArray()
  }

  fun getUserCount(): Int {
    val _ret = __method_bind.getUserCount.call(this._handle)
    return _ret.asInt()
  }

  fun getUserLightmap(userIdx: Int): Texture {
    val _arg = Variant.new(userIdx)
    val _ret = __method_bind.getUserLightmap.call(this._handle, listOf(_arg))
    return _ret.asObject(::Texture)!!
  }

  fun getUserPath(userIdx: Int): NodePath {
    val _arg = Variant.new(userIdx)
    val _ret = __method_bind.getUserPath.call(this._handle, listOf(_arg))
    return _ret.asNodePath()
  }

  fun setBounds(bounds: AABB) {
    val _arg = Variant.new(bounds)
    __method_bind.setBounds.call(this._handle, listOf(_arg))
  }

  fun setCellSpaceTransform(xform: Transform) {
    val _arg = Variant.new(xform)
    __method_bind.setCellSpaceTransform.call(this._handle, listOf(_arg))
  }

  fun setCellSubdiv(cellSubdiv: Int) {
    val _arg = Variant.new(cellSubdiv)
    __method_bind.setCellSubdiv.call(this._handle, listOf(_arg))
  }

  fun setEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setEnergy.call(this._handle, listOf(_arg))
  }

  fun setOctree(octree: PoolByteArray) {
    val _arg = Variant.new(octree)
    __method_bind.setOctree.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("BakedLightmapData".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for BakedLightmapData" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for BakedLightmapData
     */
    private object __method_bind {
      val addUser: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "add_user".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_user" }
        }
      val clearUsers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "clear_users".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_users" }
        }
      val getBounds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_bounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bounds" }
        }
      val getCellSpaceTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_cell_space_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_space_transform" }
        }
      val getCellSubdiv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_cell_subdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_subdiv" }
        }
      val getEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_energy" }
        }
      val getOctree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_octree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_octree" }
        }
      val getUserCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_user_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_user_count" }
        }
      val getUserLightmap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_user_lightmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_user_lightmap" }
        }
      val getUserPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_user_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_user_path" }
        }
      val setBounds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "set_bounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bounds" }
        }
      val setCellSpaceTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "set_cell_space_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_space_transform" }
        }
      val setCellSubdiv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "set_cell_subdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_subdiv" }
        }
      val setEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "set_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_energy" }
        }
      val setOctree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "set_octree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_octree" }
        }}
  }
}
