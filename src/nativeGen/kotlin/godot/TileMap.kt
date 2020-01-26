// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.Vector2
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

open class TileMap internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun clear() {
    TODO()
  }

  fun fixInvalidTiles() {
    TODO()
  }

  fun getCell(x: Int, y: Int): Int {
    TODO()
  }

  fun getCellAutotileCoord(x: Int, y: Int): Vector2 {
    TODO()
  }

  fun getCellSize(): Vector2 {
    TODO()
  }

  fun getCellv(position: Vector2): Int {
    TODO()
  }

  fun getClipUv(): Boolean {
    TODO()
  }

  fun getCollisionBounce(): Float {
    TODO()
  }

  fun getCollisionFriction(): Float {
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

  fun getCollisionUseKinematic(): Boolean {
    TODO()
  }

  fun getCustomTransform(): Transform2D {
    TODO()
  }

  fun getHalfOffset(): HalfOffset {
    TODO()
  }

  fun getMode(): Mode {
    TODO()
  }

  fun getOccluderLightMask(): Int {
    TODO()
  }

  fun getQuadrantSize(): Int {
    TODO()
  }

  fun getTileOrigin(): TileOrigin {
    TODO()
  }

  fun getTileset(): TileSet {
    TODO()
  }

  fun getUsedCells(): VariantArray {
    TODO()
  }

  fun getUsedCellsById(id: Int): VariantArray {
    TODO()
  }

  fun getUsedRect(): Rect2 {
    TODO()
  }

  fun isCellTransposed(x: Int, y: Int): Boolean {
    TODO()
  }

  fun isCellXFlipped(x: Int, y: Int): Boolean {
    TODO()
  }

  fun isCellYFlipped(x: Int, y: Int): Boolean {
    TODO()
  }

  fun isYSortModeEnabled(): Boolean {
    TODO()
  }

  fun mapToWorld(map_position: Vector2, ignore_half_ofs: Boolean): Vector2 {
    TODO()
  }

  fun setCell(
    x: Int,
    y: Int,
    tile: Int,
    flip_x: Boolean,
    flip_y: Boolean,
    transpose: Boolean,
    autotile_coord: Vector2
  ) {
    TODO()
  }

  fun setCellSize(size: Vector2) {
    TODO()
  }

  fun setCellv(
    position: Vector2,
    tile: Int,
    flip_x: Boolean,
    flip_y: Boolean,
    transpose: Boolean
  ) {
    TODO()
  }

  fun setClipUv(enable: Boolean) {
    TODO()
  }

  fun setCollisionBounce(value: Float) {
    TODO()
  }

  fun setCollisionFriction(value: Float) {
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

  fun setCollisionUseKinematic(use_kinematic: Boolean) {
    TODO()
  }

  fun setCustomTransform(custom_transform: Transform2D) {
    TODO()
  }

  fun setHalfOffset(half_offset: Int) {
    TODO()
  }

  fun setMode(mode: Int) {
    TODO()
  }

  fun setOccluderLightMask(mask: Int) {
    TODO()
  }

  fun setQuadrantSize(size: Int) {
    TODO()
  }

  fun setTileOrigin(origin: Int) {
    TODO()
  }

  fun setTileset(tileset: TileSet) {
    TODO()
  }

  fun setYSortMode(enable: Boolean) {
    TODO()
  }

  fun updateBitmaskArea(position: Vector2) {
    TODO()
  }

  fun updateBitmaskRegion(start: Vector2, end: Vector2) {
    TODO()
  }

  fun updateDirtyQuadrants() {
    TODO()
  }

  fun worldToMap(world_position: Vector2): Vector2 {
    TODO()
  }

  enum class Mode(
    val value: Int
  ) {
    MODE_SQUARE(0),

    MODE_ISOMETRIC(1),

    MODE_CUSTOM(2);
  }

  enum class TileOrigin(
    val value: Int
  ) {
    TILE_ORIGIN_TOP_LEFT(0),

    TILE_ORIGIN_CENTER(1),

    TILE_ORIGIN_BOTTOM_LEFT(2);
  }

  enum class HalfOffset(
    val value: Int
  ) {
    HALF_OFFSET_X(0),

    HALF_OFFSET_Y(1),

    HALF_OFFSET_DISABLED(2),

    HALF_OFFSET_NEGATIVE_X(3),

    HALF_OFFSET_NEGATIVE_Y(4);
  }

  companion object {
    val HALF_OFFSET_DISABLED: Int = 2

    val HALF_OFFSET_NEGATIVE_X: Int = 3

    val HALF_OFFSET_NEGATIVE_Y: Int = 4

    val HALF_OFFSET_X: Int = 0

    val HALF_OFFSET_Y: Int = 1

    val INVALID_CELL: Int = -1

    val MODE_CUSTOM: Int = 2

    val MODE_ISOMETRIC: Int = 1

    val MODE_SQUARE: Int = 0

    val TILE_ORIGIN_BOTTOM_LEFT: Int = 2

    val TILE_ORIGIN_CENTER: Int = 1

    val TILE_ORIGIN_TOP_LEFT: Int = 0

    fun new(): TileMap = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TileMap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton TileMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TileMap(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for TileMap
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val fix_invalid_tiles: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "fix_invalid_tiles".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method fix_invalid_tiles" }
            }
          }

      val get_cell: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_cell".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell" }
            }
          }

      val get_cell_autotile_coord: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_cell_autotile_coord".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell_autotile_coord" }
            }
          }

      val get_cell_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell_size" }
            }
          }

      val get_cellv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_cellv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cellv" }
            }
          }

      val get_clip_uv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_clip_uv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_clip_uv" }
            }
          }

      val get_collision_bounce: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_collision_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_bounce" }
            }
          }

      val get_collision_friction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_collision_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_friction" }
            }
          }

      val get_collision_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_collision_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
            }
          }

      val get_collision_layer_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_collision_layer_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
            }
          }

      val get_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
            }
          }

      val get_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
            }
          }

      val get_collision_use_kinematic: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_collision_use_kinematic".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_use_kinematic" }
            }
          }

      val get_custom_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_custom_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_transform" }
            }
          }

      val get_half_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_half_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_half_offset" }
            }
          }

      val get_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mode" }
            }
          }

      val get_occluder_light_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_occluder_light_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_occluder_light_mask" }
            }
          }

      val get_quadrant_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_quadrant_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_quadrant_size" }
            }
          }

      val get_tile_origin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_tile_origin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tile_origin" }
            }
          }

      val get_tileset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_tileset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tileset" }
            }
          }

      val get_used_cells: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_used_cells".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_used_cells" }
            }
          }

      val get_used_cells_by_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_used_cells_by_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_used_cells_by_id" }
            }
          }

      val get_used_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "get_used_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_used_rect" }
            }
          }

      val is_cell_transposed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "is_cell_transposed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_cell_transposed" }
            }
          }

      val is_cell_x_flipped: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "is_cell_x_flipped".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_cell_x_flipped" }
            }
          }

      val is_cell_y_flipped: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "is_cell_y_flipped".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_cell_y_flipped" }
            }
          }

      val is_y_sort_mode_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "is_y_sort_mode_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_y_sort_mode_enabled" }
            }
          }

      val map_to_world: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "map_to_world".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method map_to_world" }
            }
          }

      val set_cell: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_cell".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cell" }
            }
          }

      val set_cell_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cell_size" }
            }
          }

      val set_cellv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_cellv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cellv" }
            }
          }

      val set_clip_uv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_clip_uv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_clip_uv" }
            }
          }

      val set_collision_bounce: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_collision_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_bounce" }
            }
          }

      val set_collision_friction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_collision_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_friction" }
            }
          }

      val set_collision_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_collision_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
            }
          }

      val set_collision_layer_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_collision_layer_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
            }
          }

      val set_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
            }
          }

      val set_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
            }
          }

      val set_collision_use_kinematic: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_collision_use_kinematic".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_use_kinematic" }
            }
          }

      val set_custom_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_custom_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_transform" }
            }
          }

      val set_half_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_half_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_half_offset" }
            }
          }

      val set_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mode" }
            }
          }

      val set_occluder_light_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_occluder_light_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_occluder_light_mask" }
            }
          }

      val set_quadrant_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_quadrant_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_quadrant_size" }
            }
          }

      val set_tile_origin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_tile_origin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tile_origin" }
            }
          }

      val set_tileset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_tileset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tileset" }
            }
          }

      val set_y_sort_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "set_y_sort_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_y_sort_mode" }
            }
          }

      val update_bitmask_area: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "update_bitmask_area".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method update_bitmask_area" }
            }
          }

      val update_bitmask_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "update_bitmask_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method update_bitmask_region" }
            }
          }

      val update_dirty_quadrants: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "update_dirty_quadrants".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method update_dirty_quadrants" }
            }
          }

      val world_to_map: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
              "world_to_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method world_to_map" }
            }
          }
    }
  }
}
