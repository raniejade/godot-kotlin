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
import kotlin.Unit
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

  /**
   * Specialized setter for cellSize
   */
  fun cellSize(cb: Vector3.() -> Unit) {
    val _p = cellSize
    cb(_p)
    cellSize = _p
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun clearBakedMeshes() {
    __method_bind.clearBakedMeshes.call(this._handle)
  }

  fun getBakeMeshInstance(idx: Int): RID {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getBakeMeshInstance.call(this._handle, listOf(_arg))
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
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(x))
    _args.add(Variant.fromAny(y))
    _args.add(Variant.fromAny(z))
    val _ret = __method_bind.getCellItem.call(this._handle, _args)
    return _ret.asInt()
  }

  fun getCellItemOrientation(
    x: Int,
    y: Int,
    z: Int
  ): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(x))
    _args.add(Variant.fromAny(y))
    _args.add(Variant.fromAny(z))
    val _ret = __method_bind.getCellItemOrientation.call(this._handle, _args)
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
    val _ret = __method_bind.getCollisionLayerBit.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.getCollisionMask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.getCollisionMaskBit.call(this._handle, listOf(_arg))
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

  fun getUsedCells(): VariantArray {
    val _ret = __method_bind.getUsedCells.call(this._handle)
    return _ret.asVariantArray()
  }

  fun makeBakedMeshes(genLightmapUv: Boolean = false, lightmapUvTexelSize: Float = 0.1f) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(genLightmapUv))
    _args.add(Variant.fromAny(lightmapUvTexelSize))
    __method_bind.makeBakedMeshes.call(this._handle, _args)
  }

  fun mapToWorld(
    x: Int,
    y: Int,
    z: Int
  ): Vector3 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(x))
    _args.add(Variant.fromAny(y))
    _args.add(Variant.fromAny(z))
    val _ret = __method_bind.mapToWorld.call(this._handle, _args)
    return _ret.asVector3()
  }

  fun resourceChanged(resource: Resource) {
    val _arg = Variant.new(resource)
    __method_bind.resourceChanged.call(this._handle, listOf(_arg))
  }

  fun setCellItem(
    x: Int,
    y: Int,
    z: Int,
    item: Int,
    orientation: Int = 0
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(x))
    _args.add(Variant.fromAny(y))
    _args.add(Variant.fromAny(z))
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(orientation))
    __method_bind.setCellItem.call(this._handle, _args)
  }

  fun setCellScale(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.setCellScale.call(this._handle, listOf(_arg))
  }

  fun setCellSize(size: Vector3) {
    val _arg = Variant.new(size)
    __method_bind.setCellSize.call(this._handle, listOf(_arg))
  }

  fun setCenterX(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setCenterX.call(this._handle, listOf(_arg))
  }

  fun setCenterY(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setCenterY.call(this._handle, listOf(_arg))
  }

  fun setCenterZ(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setCenterZ.call(this._handle, listOf(_arg))
  }

  fun setClip(
    enabled: Boolean,
    clipabove: Boolean = true,
    floor: Int = 0,
    axis: Int = 0
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(enabled))
    _args.add(Variant.fromAny(clipabove))
    _args.add(Variant.fromAny(floor))
    _args.add(Variant.fromAny(axis))
    __method_bind.setClip.call(this._handle, _args)
  }

  fun setCollisionLayer(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.setCollisionLayer.call(this._handle, listOf(_arg))
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bit))
    _args.add(Variant.fromAny(value))
    __method_bind.setCollisionLayerBit.call(this._handle, _args)
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setCollisionMask.call(this._handle, listOf(_arg))
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bit))
    _args.add(Variant.fromAny(value))
    __method_bind.setCollisionMaskBit.call(this._handle, _args)
  }

  fun setMeshLibrary(meshLibrary: MeshLibrary) {
    val _arg = Variant.new(meshLibrary)
    __method_bind.setMeshLibrary.call(this._handle, listOf(_arg))
  }

  fun setOctantSize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.setOctantSize.call(this._handle, listOf(_arg))
  }

  fun worldToMap(pos: Vector3): Vector3 {
    val _arg = Variant.new(pos)
    val _ret = __method_bind.worldToMap.call(this._handle, listOf(_arg))
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
            "clear_baked_meshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_baked_meshes" }
        }
      val getBakeMeshInstance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_bake_mesh_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_mesh_instance" }
        }
      val getBakeMeshes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_bake_meshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_meshes" }
        }
      val getCellItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_cell_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_item" }
        }
      val getCellItemOrientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_cell_item_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_item_orientation" }
        }
      val getCellScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_cell_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_scale" }
        }
      val getCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_size" }
        }
      val getCenterX: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_center_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_center_x" }
        }
      val getCenterY: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_center_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_center_y" }
        }
      val getCenterZ: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_center_z".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_center_z" }
        }
      val getCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
        }
      val getCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val getMeshLibrary: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_mesh_library".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mesh_library" }
        }
      val getMeshes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_meshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_meshes" }
        }
      val getOctantSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_octant_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_octant_size" }
        }
      val getUsedCells: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_used_cells".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_used_cells" }
        }
      val makeBakedMeshes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "make_baked_meshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_baked_meshes" }
        }
      val mapToWorld: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "map_to_world".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method map_to_world" }
        }
      val resourceChanged: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "resource_changed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resource_changed" }
        }
      val setCellItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_cell_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_item" }
        }
      val setCellScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_cell_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_scale" }
        }
      val setCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_size" }
        }
      val setCenterX: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_center_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_center_x" }
        }
      val setCenterY: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_center_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_center_y" }
        }
      val setCenterZ: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_center_z".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_center_z" }
        }
      val setClip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_clip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clip" }
        }
      val setCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
        }
      val setCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val setMeshLibrary: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_mesh_library".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mesh_library" }
        }
      val setOctantSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_octant_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_octant_size" }
        }
      val worldToMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "world_to_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method world_to_map" }
        }}
  }
}
