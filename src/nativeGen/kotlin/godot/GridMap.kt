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

open class GridMap internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun clear() {
    val _ret = __method_bind.clear.call(this.toVariant())
    TODO()
  }

  fun clearBakedMeshes() {
    val _ret = __method_bind.clear_baked_meshes.call(this.toVariant())
    TODO()
  }

  fun getBakeMeshInstance(idx: Int): RID {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_bake_mesh_instance.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getBakeMeshes(): VariantArray {
    val _ret = __method_bind.get_bake_meshes.call(this.toVariant())
    TODO()
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
    val _ret = __method_bind.get_cell_item.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
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
    val _ret = __method_bind.get_cell_item_orientation.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun getCellScale(): Float {
    val _ret = __method_bind.get_cell_scale.call(this.toVariant())
    TODO()
  }

  fun getCellSize(): Vector3 {
    val _ret = __method_bind.get_cell_size.call(this.toVariant())
    TODO()
  }

  fun getCenterX(): Boolean {
    val _ret = __method_bind.get_center_x.call(this.toVariant())
    TODO()
  }

  fun getCenterY(): Boolean {
    val _ret = __method_bind.get_center_y.call(this.toVariant())
    TODO()
  }

  fun getCenterZ(): Boolean {
    val _ret = __method_bind.get_center_z.call(this.toVariant())
    TODO()
  }

  fun getCollisionLayer(): Int {
    val _ret = __method_bind.get_collision_layer.call(this.toVariant())
    TODO()
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(bit)
    val _ret = __method_bind.get_collision_layer_bit.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.get_collision_mask.call(this.toVariant())
    TODO()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(bit)
    val _ret = __method_bind.get_collision_mask_bit.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getMeshLibrary(): MeshLibrary {
    val _ret = __method_bind.get_mesh_library.call(this.toVariant())
    TODO()
  }

  fun getMeshes(): VariantArray {
    val _ret = __method_bind.get_meshes.call(this.toVariant())
    TODO()
  }

  fun getOctantSize(): Int {
    val _ret = __method_bind.get_octant_size.call(this.toVariant())
    TODO()
  }

  fun getTheme(): MeshLibrary {
    val _ret = __method_bind.get_theme.call(this.toVariant())
    TODO()
  }

  fun getUsedCells(): VariantArray {
    val _ret = __method_bind.get_used_cells.call(this.toVariant())
    TODO()
  }

  fun makeBakedMeshes(genLightmapUv: Boolean, lightmapUvTexelSize: Float) {
    val _args = VariantArray.new()
    _args.append(genLightmapUv)
    _args.append(lightmapUvTexelSize)
    val _ret = __method_bind.make_baked_meshes.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
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
    val _ret = __method_bind.map_to_world.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun resourceChanged(resource: Resource) {
    val _args = VariantArray.new()
    _args.append(resource)
    val _ret = __method_bind.resource_changed.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
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
    val _ret = __method_bind.set_cell_item.call(this.toVariant(), _args.toVariant(), 5)
    TODO()
  }

  fun setCellScale(scale: Float) {
    val _args = VariantArray.new()
    _args.append(scale)
    val _ret = __method_bind.set_cell_scale.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCellSize(size: Vector3) {
    val _args = VariantArray.new()
    _args.append(size)
    val _ret = __method_bind.set_cell_size.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCenterX(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_center_x.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCenterY(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_center_y.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCenterZ(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_center_z.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
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
    val _ret = __method_bind.set_clip.call(this.toVariant(), _args.toVariant(), 4)
    TODO()
  }

  fun setCollisionLayer(layer: Int) {
    val _args = VariantArray.new()
    _args.append(layer)
    val _ret = __method_bind.set_collision_layer.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    val _ret = __method_bind.set_collision_layer_bit.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setCollisionMask(mask: Int) {
    val _args = VariantArray.new()
    _args.append(mask)
    val _ret = __method_bind.set_collision_mask.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    val _ret = __method_bind.set_collision_mask_bit.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setMeshLibrary(meshLibrary: MeshLibrary) {
    val _args = VariantArray.new()
    _args.append(meshLibrary)
    val _ret = __method_bind.set_mesh_library.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setOctantSize(size: Int) {
    val _args = VariantArray.new()
    _args.append(size)
    val _ret = __method_bind.set_octant_size.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setTheme(theme: MeshLibrary) {
    val _args = VariantArray.new()
    _args.append(theme)
    val _ret = __method_bind.set_theme.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun worldToMap(pos: Vector3): Vector3 {
    val _args = VariantArray.new()
    _args.append(pos)
    val _ret = __method_bind.world_to_map.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    val INVALID_CELL_ITEM: Int = -1

    fun new(): GridMap = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GridMap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton GridMap" }
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
      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val clear_baked_meshes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "clear_baked_meshes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_baked_meshes" }
            }
          }

      val get_bake_mesh_instance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_bake_mesh_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bake_mesh_instance" }
            }
          }

      val get_bake_meshes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_bake_meshes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bake_meshes" }
            }
          }

      val get_cell_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_cell_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell_item" }
            }
          }

      val get_cell_item_orientation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_cell_item_orientation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell_item_orientation" }
            }
          }

      val get_cell_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_cell_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell_scale" }
            }
          }

      val get_cell_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell_size" }
            }
          }

      val get_center_x: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_center_x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_center_x" }
            }
          }

      val get_center_y: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_center_y".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_center_y" }
            }
          }

      val get_center_z: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_center_z".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_center_z" }
            }
          }

      val get_collision_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_collision_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
            }
          }

      val get_collision_layer_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_collision_layer_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
            }
          }

      val get_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
            }
          }

      val get_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
            }
          }

      val get_mesh_library: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_mesh_library".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mesh_library" }
            }
          }

      val get_meshes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_meshes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_meshes" }
            }
          }

      val get_octant_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_octant_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_octant_size" }
            }
          }

      val get_theme: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_theme".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_theme" }
            }
          }

      val get_used_cells: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "get_used_cells".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_used_cells" }
            }
          }

      val make_baked_meshes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "make_baked_meshes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_baked_meshes" }
            }
          }

      val map_to_world: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "map_to_world".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method map_to_world" }
            }
          }

      val resource_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "resource_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resource_changed" }
            }
          }

      val set_cell_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "set_cell_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cell_item" }
            }
          }

      val set_cell_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "set_cell_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cell_scale" }
            }
          }

      val set_cell_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "set_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cell_size" }
            }
          }

      val set_center_x: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "set_center_x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_center_x" }
            }
          }

      val set_center_y: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "set_center_y".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_center_y" }
            }
          }

      val set_center_z: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "set_center_z".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_center_z" }
            }
          }

      val set_clip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "set_clip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_clip" }
            }
          }

      val set_collision_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "set_collision_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
            }
          }

      val set_collision_layer_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "set_collision_layer_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
            }
          }

      val set_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "set_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
            }
          }

      val set_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "set_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
            }
          }

      val set_mesh_library: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "set_mesh_library".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mesh_library" }
            }
          }

      val set_octant_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "set_octant_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_octant_size" }
            }
          }

      val set_theme: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "set_theme".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_theme" }
            }
          }

      val world_to_map: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
              "world_to_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method world_to_map" }
            }
          }
    }
  }
}
