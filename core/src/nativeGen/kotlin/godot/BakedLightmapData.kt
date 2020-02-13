// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.AABB
import godot.core.Allocator
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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

  open fun _get_user_data(): VariantArray {
    TODO()
  }

  open fun _set_user_data(data: VariantArray) {
    TODO()
  }

  fun addUser(
    path: NodePath,
    lightmap: Texture,
    instance: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(lightmap)
      _args.add(instance)
      __method_bind.addUser.call(self._handle, _args, null)
    }
  }

  fun clearUsers() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearUsers.call(self._handle, emptyList(), null)
    }
  }

  fun getBounds(): AABB {
    val self = this
    return Allocator.allocationScope {
      val _ret = AABB()
      val _retPtr = _ret._value.ptr
      __method_bind.getBounds.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCellSpaceTransform(): Transform {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform()
      val _retPtr = _ret._value.ptr
      __method_bind.getCellSpaceTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCellSubdiv(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCellSubdiv.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getEnergy(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEnergy.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getOctree(): PoolByteArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolByteArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getOctree.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUserCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUserCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getUserLightmap(userIdx: Int): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getUserLightmap.call(self._handle, listOf(userIdx), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getUserPath(userIdx: Int): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getUserPath.call(self._handle, listOf(userIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setBounds(bounds: AABB) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBounds.call(self._handle, listOf(bounds), null)
    }
  }

  fun setCellSpaceTransform(xform: Transform) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCellSpaceTransform.call(self._handle, listOf(xform), null)
    }
  }

  fun setCellSubdiv(cellSubdiv: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCellSubdiv.call(self._handle, listOf(cellSubdiv), null)
    }
  }

  fun setEnergy(energy: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnergy.call(self._handle, listOf(energy), null)
    }
  }

  fun setOctree(octree: PoolByteArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOctree.call(self._handle, listOf(octree), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "add_user".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_user" }
        }
      val clearUsers: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "clear_users".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_users" }
        }
      val getBounds: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_bounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bounds" }
        }
      val getCellSpaceTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_cell_space_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_space_transform" }
        }
      val getCellSubdiv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_cell_subdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_subdiv" }
        }
      val getEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_energy" }
        }
      val getOctree: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_octree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_octree" }
        }
      val getUserCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_user_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_user_count" }
        }
      val getUserLightmap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_user_lightmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_user_lightmap" }
        }
      val getUserPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "get_user_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_user_path" }
        }
      val setBounds: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "set_bounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bounds" }
        }
      val setCellSpaceTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "set_cell_space_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_space_transform" }
        }
      val setCellSubdiv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "set_cell_subdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_subdiv" }
        }
      val setEnergy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "set_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_energy" }
        }
      val setOctree: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "set_octree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_octree" }
        }}
  }
}
