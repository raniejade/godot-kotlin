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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class BakedLightmapData(
  _handle: COpaquePointer
) : Resource(_handle) {
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

  var userData: VariantArray
    get() {
       return _getUserData() 
    }
    set(value) {
      _setUserData(value)
    }

  fun addUser(
    path: NodePath,
    lightmap: Texture,
    instance: Int
  ) {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(lightmap)
    _args.append(instance)
    __method_bind.addUser.call(this._handle, _args.toVariant(), 3)
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
    val _ret = __method_bind.getUserLightmap.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun getUserPath(userIdx: Int): NodePath {
    val _arg = Variant.new(userIdx)
    val _ret = __method_bind.getUserPath.call(this._handle, _arg, 1)
    return _ret.asNodePath()
  }

  fun setBounds(bounds: AABB) {
    val _arg = Variant.new(bounds)
    __method_bind.setBounds.call(this._handle, _arg, 1)
  }

  fun setCellSpaceTransform(xform: Transform) {
    val _arg = Variant.new(xform)
    __method_bind.setCellSpaceTransform.call(this._handle, _arg, 1)
  }

  fun setCellSubdiv(cellSubdiv: Int) {
    val _arg = Variant.new(cellSubdiv)
    __method_bind.setCellSubdiv.call(this._handle, _arg, 1)
  }

  fun setEnergy(energy: Float) {
    val _arg = Variant.new(energy)
    __method_bind.setEnergy.call(this._handle, _arg, 1)
  }

  fun setOctree(octree: PoolByteArray) {
    val _arg = Variant.new(octree)
    __method_bind.setOctree.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): BakedLightmapData = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("BakedLightmapData".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for BakedLightmapData" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      BakedLightmapData(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): BakedLightmapData = BakedLightmapData(ptr)
    /**
     * Container for method_bind pointers for BakedLightmapData
     */
    private object __method_bind {
      val addUser: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "addUser".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addUser" }
        }
      val clearUsers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "clearUsers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearUsers" }
        }
      val getBounds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "getBounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBounds" }
        }
      val getCellSpaceTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "getCellSpaceTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCellSpaceTransform" }
        }
      val getCellSubdiv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "getCellSubdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCellSubdiv" }
        }
      val getEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "getEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEnergy" }
        }
      val getOctree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "getOctree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOctree" }
        }
      val getUserCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "getUserCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUserCount" }
        }
      val getUserLightmap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "getUserLightmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUserLightmap" }
        }
      val getUserPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "getUserPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUserPath" }
        }
      val setBounds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "setBounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBounds" }
        }
      val setCellSpaceTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "setCellSpaceTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCellSpaceTransform" }
        }
      val setCellSubdiv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "setCellSubdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCellSubdiv" }
        }
      val setEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "setEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEnergy" }
        }
      val setOctree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmapData".cstr.ptr,
            "setOctree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOctree" }
        }}
  }
}
