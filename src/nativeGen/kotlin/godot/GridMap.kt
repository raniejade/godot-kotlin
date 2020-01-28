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
  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun clearBakedMeshes() {
    __method_bind.clear_baked_meshes.call(this._handle)
  }

  fun getBakeMeshInstance(idx: Int): RID {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_bake_mesh_instance.call(this._handle, _arg, 1)
    return _ret.asRID()
  }

  fun getBakeMeshes(): VariantArray {
    val _ret = __method_bind.get_bake_meshes.call(this._handle)
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
    val _ret = __method_bind.get_cell_item.call(this._handle, _args.toVariant(), 3)
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
    val _ret = __method_bind.get_cell_item_orientation.call(this._handle, _args.toVariant(), 3)
    return _ret.asInt()
  }

  fun getCellScale(): Float {
    val _ret = __method_bind.get_cell_scale.call(this._handle)
    return _ret.asFloat()
  }

  fun getCellSize(): Vector3 {
    val _ret = __method_bind.get_cell_size.call(this._handle)
    return _ret.asVector3()
  }

  fun getCenterX(): Boolean {
    val _ret = __method_bind.get_center_x.call(this._handle)
    return _ret.asBoolean()
  }

  fun getCenterY(): Boolean {
    val _ret = __method_bind.get_center_y.call(this._handle)
    return _ret.asBoolean()
  }

  fun getCenterZ(): Boolean {
    val _ret = __method_bind.get_center_z.call(this._handle)
    return _ret.asBoolean()
  }

  fun getCollisionLayer(): Int {
    val _ret = __method_bind.get_collision_layer.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.get_collision_layer_bit.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.get_collision_mask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.get_collision_mask_bit.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getMeshLibrary(): MeshLibrary {
    val _ret = __method_bind.get_mesh_library.call(this._handle)
    return _ret.asObject(::MeshLibrary)!!
  }

  fun getMeshes(): VariantArray {
    val _ret = __method_bind.get_meshes.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getOctantSize(): Int {
    val _ret = __method_bind.get_octant_size.call(this._handle)
    return _ret.asInt()
  }

  fun getTheme(): MeshLibrary {
    val _ret = __method_bind.get_theme.call(this._handle)
    return _ret.asObject(::MeshLibrary)!!
  }

  fun getUsedCells(): VariantArray {
    val _ret = __method_bind.get_used_cells.call(this._handle)
    return _ret.asVariantArray()
  }

  fun makeBakedMeshes(genLightmapUv: Boolean, lightmapUvTexelSize: Float) {
    val _args = VariantArray.new()
    _args.append(genLightmapUv)
    _args.append(lightmapUvTexelSize)
    __method_bind.make_baked_meshes.call(this._handle, _args.toVariant(), 2)
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
    val _ret = __method_bind.map_to_world.call(this._handle, _args.toVariant(), 3)
    return _ret.asVector3()
  }

  fun resourceChanged(resource: Resource) {
    val _arg = Variant.new(resource)
    __method_bind.resource_changed.call(this._handle, _arg, 1)
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
    __method_bind.set_cell_item.call(this._handle, _args.toVariant(), 5)
  }

  fun setCellScale(scale: Float) {
    val _arg = Variant.new(scale)
    __method_bind.set_cell_scale.call(this._handle, _arg, 1)
  }

  fun setCellSize(size: Vector3) {
    val _arg = Variant.new(size)
    __method_bind.set_cell_size.call(this._handle, _arg, 1)
  }

  fun setCenterX(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_center_x.call(this._handle, _arg, 1)
  }

  fun setCenterY(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_center_y.call(this._handle, _arg, 1)
  }

  fun setCenterZ(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_center_z.call(this._handle, _arg, 1)
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
    __method_bind.set_clip.call(this._handle, _args.toVariant(), 4)
  }

  fun setCollisionLayer(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.set_collision_layer.call(this._handle, _arg, 1)
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.set_collision_layer_bit.call(this._handle, _args.toVariant(), 2)
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.set_collision_mask.call(this._handle, _arg, 1)
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.set_collision_mask_bit.call(this._handle, _args.toVariant(), 2)
  }

  fun setMeshLibrary(meshLibrary: MeshLibrary) {
    val _arg = Variant.new(meshLibrary)
    __method_bind.set_mesh_library.call(this._handle, _arg, 1)
  }

  fun setOctantSize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.set_octant_size.call(this._handle, _arg, 1)
  }

  fun setTheme(theme: MeshLibrary) {
    val _arg = Variant.new(theme)
    __method_bind.set_theme.call(this._handle, _arg, 1)
  }

  fun worldToMap(pos: Vector3): Vector3 {
    val _arg = Variant.new(pos)
    val _ret = __method_bind.world_to_map.call(this._handle, _arg, 1)
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
      val clear_baked_meshes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "clear_baked_meshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_baked_meshes" }
        }
      val get_bake_mesh_instance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_bake_mesh_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_mesh_instance" }
        }
      val get_bake_meshes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_bake_meshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_meshes" }
        }
      val get_cell_item: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_cell_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_item" }
        }
      val get_cell_item_orientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_cell_item_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_item_orientation" }
        }
      val get_cell_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_cell_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_scale" }
        }
      val get_cell_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_size" }
        }
      val get_center_x: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_center_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_center_x" }
        }
      val get_center_y: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_center_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_center_y" }
        }
      val get_center_z: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_center_z".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_center_z" }
        }
      val get_collision_layer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
        }
      val get_collision_layer_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
        }
      val get_collision_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val get_collision_mask_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val get_mesh_library: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_mesh_library".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mesh_library" }
        }
      val get_meshes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_meshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_meshes" }
        }
      val get_octant_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_octant_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_octant_size" }
        }
      val get_theme: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_theme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_theme" }
        }
      val get_used_cells: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_used_cells".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_used_cells" }
        }
      val make_baked_meshes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "make_baked_meshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_baked_meshes" }
        }
      val map_to_world: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "map_to_world".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method map_to_world" }
        }
      val resource_changed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "resource_changed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resource_changed" }
        }
      val set_cell_item: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_cell_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_item" }
        }
      val set_cell_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_cell_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_scale" }
        }
      val set_cell_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_size" }
        }
      val set_center_x: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_center_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_center_x" }
        }
      val set_center_y: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_center_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_center_y" }
        }
      val set_center_z: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_center_z".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_center_z" }
        }
      val set_clip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_clip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clip" }
        }
      val set_collision_layer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
        }
      val set_collision_layer_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
        }
      val set_collision_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val set_collision_mask_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val set_mesh_library: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_mesh_library".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mesh_library" }
        }
      val set_octant_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_octant_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_octant_size" }
        }
      val set_theme: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_theme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_theme" }
        }
      val world_to_map: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "world_to_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method world_to_map" }
        }}
  }
}
