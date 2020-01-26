// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
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
    TODO()
  }

  fun clearBakedMeshes() {
    TODO()
  }

  fun getBakeMeshInstance(idx: Int): RID {
    TODO()
  }

  fun getBakeMeshes(): VariantArray {
    TODO()
  }

  fun getCellItem(
    x: Int,
    y: Int,
    z: Int
  ): Int {
    TODO()
  }

  fun getCellItemOrientation(
    x: Int,
    y: Int,
    z: Int
  ): Int {
    TODO()
  }

  fun getCellScale(): Float {
    TODO()
  }

  fun getCellSize(): Vector3 {
    TODO()
  }

  fun getCenterX(): Boolean {
    TODO()
  }

  fun getCenterY(): Boolean {
    TODO()
  }

  fun getCenterZ(): Boolean {
    TODO()
  }

  fun getCollisionLayer(): Int {
    TODO()
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    TODO()
  }

  fun getCollisionMask(): Int {
    TODO()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    TODO()
  }

  fun getMeshLibrary(): MeshLibrary {
    TODO()
  }

  fun getMeshes(): VariantArray {
    TODO()
  }

  fun getOctantSize(): Int {
    TODO()
  }

  fun getTheme(): MeshLibrary {
    TODO()
  }

  fun getUsedCells(): VariantArray {
    TODO()
  }

  fun makeBakedMeshes(gen_lightmap_uv: Boolean, lightmap_uv_texel_size: Float) {
    TODO()
  }

  fun mapToWorld(
    x: Int,
    y: Int,
    z: Int
  ): Vector3 {
    TODO()
  }

  fun resourceChanged(resource: Resource) {
    TODO()
  }

  fun setCellItem(
    x: Int,
    y: Int,
    z: Int,
    item: Int,
    orientation: Int
  ) {
    TODO()
  }

  fun setCellScale(scale: Float) {
    TODO()
  }

  fun setCellSize(size: Vector3) {
    TODO()
  }

  fun setCenterX(enable: Boolean) {
    TODO()
  }

  fun setCenterY(enable: Boolean) {
    TODO()
  }

  fun setCenterZ(enable: Boolean) {
    TODO()
  }

  fun setClip(
    enabled: Boolean,
    clipabove: Boolean,
    floor: Int,
    axis: Int
  ) {
    TODO()
  }

  fun setCollisionLayer(layer: Int) {
    TODO()
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    TODO()
  }

  fun setCollisionMask(mask: Int) {
    TODO()
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    TODO()
  }

  fun setMeshLibrary(mesh_library: MeshLibrary) {
    TODO()
  }

  fun setOctantSize(size: Int) {
    TODO()
  }

  fun setTheme(theme: MeshLibrary) {
    TODO()
  }

  fun worldToMap(pos: Vector3): Vector3 {
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
