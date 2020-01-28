// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
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

open class GridMap(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var cellCenterX: Boolean
    get() {
       return getCenterX() 
    }
    set(value) {
      setCenterX(value)
    }

  var cellCenterY: Boolean
    get() {
       return getCenterY() 
    }
    set(value) {
      setCenterY(value)
    }

  var cellCenterZ: Boolean
    get() {
       return getCenterZ() 
    }
    set(value) {
      setCenterZ(value)
    }

  var cellOctantSize: Int
    get() {
       return getOctantSize() 
    }
    set(value) {
      setOctantSize(value)
    }

  var cellScale: Float
    get() {
       return getCellScale() 
    }
    set(value) {
      setCellScale(value)
    }

  var cellSize: Vector3
    get() {
       return getCellSize() 
    }
    set(value) {
      setCellSize(value)
    }

  var collisionLayer: Int
    get() {
       return getCollisionLayer() 
    }
    set(value) {
      setCollisionLayer(value)
    }

  var collisionMask: Int
    get() {
       return getCollisionMask() 
    }
    set(value) {
      setCollisionMask(value)
    }

  var meshLibrary: MeshLibrary
    get() {
       return getMeshLibrary() 
    }
    set(value) {
      setMeshLibrary(value)
    }

  var theme: MeshLibrary
    get() {
       return getTheme() 
    }
    set(value) {
      setTheme(value)
    }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun clearBakedMeshes() {
    __method_bind.clearBakedMeshes.call(this._handle)
  }

  fun getBakeMeshInstance(idx: Int): RID {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getBakeMeshInstance.call(this._handle, _arg, 1)
    return _ret.asRID()
  }

  fun getBakeMeshes(): VariantArray {
    val _ret = __method_bind.getBakeMeshes.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getCellItem(
    x: Int,
    y: Int,
    z: Int
  ): Int {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    _args.append(z)
    val _ret = __method_bind.getCellItem.call(this._handle, _args.toVariant(), 3)
    return _ret.asInt()
  }

  fun getCellItemOrientation(
    x: Int,
    y: Int,
    z: Int
  ): Int {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    _args.append(z)
    val _ret = __method_bind.getCellItemOrientation.call(this._handle, _args.toVariant(), 3)
    return _ret.asInt()
  }

  fun getCellScale(): Float {
    val _ret = __method_bind.getCellScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getCellSize(): Vector3 {
    val _ret = __method_bind.getCellSize.call(this._handle)
    return _ret.asVector3()
  }

  fun getCenterX(): Boolean {
    val _ret = __method_bind.getCenterX.call(this._handle)
    return _ret.asBoolean()
  }

  fun getCenterY(): Boolean {
    val _ret = __method_bind.getCenterY.call(this._handle)
    return _ret.asBoolean()
  }

  fun getCenterZ(): Boolean {
    val _ret = __method_bind.getCenterZ.call(this._handle)
    return _ret.asBoolean()
  }

  fun getCollisionLayer(): Int {
    val _ret = __method_bind.getCollisionLayer.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.getCollisionLayerBit.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.getCollisionMask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.getCollisionMaskBit.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getMeshLibrary(): MeshLibrary {
    val _ret = __method_bind.getMeshLibrary.call(this._handle)
    return _ret.asObject(::MeshLibrary)!!
  }

  fun getMeshes(): VariantArray {
    val _ret = __method_bind.getMeshes.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getOctantSize(): Int {
    val _ret = __method_bind.getOctantSize.call(this._handle)
    return _ret.asInt()
  }

  fun getTheme(): MeshLibrary {
    val _ret = __method_bind.getTheme.call(this._handle)
    return _ret.asObject(::MeshLibrary)!!
  }

  fun getUsedCells(): VariantArray {
    val _ret = __method_bind.getUsedCells.call(this._handle)
    return _ret.asVariantArray()
  }

  fun makeBakedMeshes(genLightmapUv: Boolean, lightmapUvTexelSize: Float) {
    val _args = VariantArray.new()
    _args.append(genLightmapUv)
    _args.append(lightmapUvTexelSize)
    __method_bind.makeBakedMeshes.call(this._handle, _args.toVariant(), 2)
  }

  fun mapToWorld(
    x: Int,
    y: Int,
    z: Int
  ): Vector3 {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    _args.append(z)
    val _ret = __method_bind.mapToWorld.call(this._handle, _args.toVariant(), 3)
    return _ret.asVector3()
  }

  fun resourceChanged(resource: Resource) {
    val _arg = Variant.new(resource)
    __method_bind.resourceChanged.call(this._handle, _arg, 1)
  }

  fun setCellItem(
    x: Int,
    y: Int,
    z: Int,
    item: Int,
    orientation: Int
  ) {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    _args.append(z)
    _args.append(item)
    _args.append(orientation)
    __method_bind.setCellItem.call(this._handle, _args.toVariant(), 5)
  }

  fun setCellScale(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.setCellScale.call(this._handle, _arg, 1)
  }

  fun setCellSize(size: Vector3) {
    val _arg = Variant.new(size)
    __method_bind.setCellSize.call(this._handle, _arg, 1)
  }

  fun setCenterX(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setCenterX.call(this._handle, _arg, 1)
  }

  fun setCenterY(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setCenterY.call(this._handle, _arg, 1)
  }

  fun setCenterZ(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setCenterZ.call(this._handle, _arg, 1)
  }

  fun setClip(
    enabled: Boolean,
    clipabove: Boolean,
    floor: Int,
    axis: Int
  ) {
    val _args = VariantArray.new()
    _args.append(enabled)
    _args.append(clipabove)
    _args.append(floor)
    _args.append(axis)
    __method_bind.setClip.call(this._handle, _args.toVariant(), 4)
  }

  fun setCollisionLayer(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.setCollisionLayer.call(this._handle, _arg, 1)
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.setCollisionLayerBit.call(this._handle, _args.toVariant(), 2)
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setCollisionMask.call(this._handle, _arg, 1)
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.setCollisionMaskBit.call(this._handle, _args.toVariant(), 2)
  }

  fun setMeshLibrary(meshLibrary: MeshLibrary) {
    val _arg = Variant.new(meshLibrary)
    __method_bind.setMeshLibrary.call(this._handle, _arg, 1)
  }

  fun setOctantSize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.setOctantSize.call(this._handle, _arg, 1)
  }

  fun setTheme(theme: MeshLibrary) {
    val _arg = Variant.new(theme)
    __method_bind.setTheme.call(this._handle, _arg, 1)
  }

  fun worldToMap(pos: Vector3): Vector3 {
    val _arg = Variant.new(pos)
    val _ret = __method_bind.worldToMap.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  companion object {
    val INVALID_CELL_ITEM: Int = -1

    fun new(): GridMap = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GridMap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GridMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GridMap(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): GridMap = GridMap(ptr)
    /**
     * Container for method_bind pointers for GridMap
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val clearBakedMeshes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "clearBakedMeshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearBakedMeshes" }
        }
      val getBakeMeshInstance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getBakeMeshInstance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBakeMeshInstance" }
        }
      val getBakeMeshes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getBakeMeshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBakeMeshes" }
        }
      val getCellItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getCellItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCellItem" }
        }
      val getCellItemOrientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getCellItemOrientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCellItemOrientation" }
        }
      val getCellScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getCellScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCellScale" }
        }
      val getCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getCellSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCellSize" }
        }
      val getCenterX: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getCenterX".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCenterX" }
        }
      val getCenterY: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getCenterY".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCenterY" }
        }
      val getCenterZ: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getCenterZ".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCenterZ" }
        }
      val getCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getCollisionLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionLayer" }
        }
      val getCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getCollisionLayerBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionLayerBit" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMaskBit" }
        }
      val getMeshLibrary: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getMeshLibrary".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMeshLibrary" }
        }
      val getMeshes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getMeshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMeshes" }
        }
      val getOctantSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getOctantSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOctantSize" }
        }
      val getTheme: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getTheme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTheme" }
        }
      val getUsedCells: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "getUsedCells".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUsedCells" }
        }
      val makeBakedMeshes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "makeBakedMeshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method makeBakedMeshes" }
        }
      val mapToWorld: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "mapToWorld".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mapToWorld" }
        }
      val resourceChanged: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "resourceChanged".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resourceChanged" }
        }
      val setCellItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "setCellItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCellItem" }
        }
      val setCellScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "setCellScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCellScale" }
        }
      val setCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "setCellSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCellSize" }
        }
      val setCenterX: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "setCenterX".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCenterX" }
        }
      val setCenterY: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "setCenterY".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCenterY" }
        }
      val setCenterZ: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "setCenterZ".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCenterZ" }
        }
      val setClip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "setClip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setClip" }
        }
      val setCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "setCollisionLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionLayer" }
        }
      val setCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "setCollisionLayerBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionLayerBit" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "setCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "setCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMaskBit" }
        }
      val setMeshLibrary: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "setMeshLibrary".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMeshLibrary" }
        }
      val setOctantSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "setOctantSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOctantSize" }
        }
      val setTheme: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "setTheme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTheme" }
        }
      val worldToMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "worldToMap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method worldToMap" }
        }}
  }
}
