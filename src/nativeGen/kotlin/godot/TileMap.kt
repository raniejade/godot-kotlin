// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.Variant
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

open class TileMap(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun fixInvalidTiles() {
    __method_bind.fix_invalid_tiles.call(this._handle)
  }

  fun getCell(x: Int, y: Int): Int {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    val _ret = __method_bind.get_cell.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getCellAutotileCoord(x: Int, y: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    val _ret = __method_bind.get_cell_autotile_coord.call(this._handle, _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun getCellSize(): Vector2 {
    val _ret = __method_bind.get_cell_size.call(this._handle)
    return _ret.asVector2()
  }

  fun getCellv(position: Vector2): Int {
    val _arg = Variant.new(position)
    val _ret = __method_bind.get_cellv.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getClipUv(): Boolean {
    val _ret = __method_bind.get_clip_uv.call(this._handle)
    return _ret.asBool()
  }

  fun getCollisionBounce(): Float {
    val _ret = __method_bind.get_collision_bounce.call(this._handle)
    return _ret.asFloat()
  }

  fun getCollisionFriction(): Float {
    val _ret = __method_bind.get_collision_friction.call(this._handle)
    return _ret.asFloat()
  }

  fun getCollisionLayer(): Int {
    val _ret = __method_bind.get_collision_layer.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.get_collision_layer_bit.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.get_collision_mask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.get_collision_mask_bit.call(this._handle, _arg, 1)
    return _ret.asBool()
  }

  fun getCollisionUseKinematic(): Boolean {
    val _ret = __method_bind.get_collision_use_kinematic.call(this._handle)
    return _ret.asBool()
  }

  fun getCustomTransform(): Transform2D {
    val _ret = __method_bind.get_custom_transform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getHalfOffset(): HalfOffset {
    val _ret = __method_bind.get_half_offset.call(this._handle)
    return TileMap.HalfOffset.from(_ret.asInt())
  }

  fun getMode(): Mode {
    val _ret = __method_bind.get_mode.call(this._handle)
    return TileMap.Mode.from(_ret.asInt())
  }

  fun getOccluderLightMask(): Int {
    val _ret = __method_bind.get_occluder_light_mask.call(this._handle)
    return _ret.asInt()
  }

  fun getQuadrantSize(): Int {
    val _ret = __method_bind.get_quadrant_size.call(this._handle)
    return _ret.asInt()
  }

  fun getTileOrigin(): TileOrigin {
    val _ret = __method_bind.get_tile_origin.call(this._handle)
    return TileMap.TileOrigin.from(_ret.asInt())
  }

  fun getTileset(): TileSet {
    val _ret = __method_bind.get_tileset.call(this._handle)
    return _ret.asObject(::TileSet)!!
  }

  fun getUsedCells(): VariantArray {
    val _ret = __method_bind.get_used_cells.call(this._handle)
    return _ret.asArray()
  }

  fun getUsedCellsById(id: Int): VariantArray {
    val _arg = Variant.new(id)
    val _ret = __method_bind.get_used_cells_by_id.call(this._handle, _arg, 1)
    return _ret.asArray()
  }

  fun getUsedRect(): Rect2 {
    val _ret = __method_bind.get_used_rect.call(this._handle)
    return _ret.asRect2()
  }

  fun isCellTransposed(x: Int, y: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    val _ret = __method_bind.is_cell_transposed.call(this._handle, _args.toVariant(), 2)
    return _ret.asBool()
  }

  fun isCellXFlipped(x: Int, y: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    val _ret = __method_bind.is_cell_x_flipped.call(this._handle, _args.toVariant(), 2)
    return _ret.asBool()
  }

  fun isCellYFlipped(x: Int, y: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    val _ret = __method_bind.is_cell_y_flipped.call(this._handle, _args.toVariant(), 2)
    return _ret.asBool()
  }

  fun isYSortModeEnabled(): Boolean {
    val _ret = __method_bind.is_y_sort_mode_enabled.call(this._handle)
    return _ret.asBool()
  }

  fun mapToWorld(mapPosition: Vector2, ignoreHalfOfs: Boolean): Vector2 {
    val _args = VariantArray.new()
    _args.append(mapPosition)
    _args.append(ignoreHalfOfs)
    val _ret = __method_bind.map_to_world.call(this._handle, _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun setCell(
    x: Int,
    y: Int,
    tile: Int,
    flipX: Boolean,
    flipY: Boolean,
    transpose: Boolean,
    autotileCoord: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    _args.append(tile)
    _args.append(flipX)
    _args.append(flipY)
    _args.append(transpose)
    _args.append(autotileCoord)
    __method_bind.set_cell.call(this._handle, _args.toVariant(), 7)
  }

  fun setCellSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.set_cell_size.call(this._handle, _arg, 1)
  }

  fun setCellv(
    position: Vector2,
    tile: Int,
    flipX: Boolean,
    flipY: Boolean,
    transpose: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(position)
    _args.append(tile)
    _args.append(flipX)
    _args.append(flipY)
    _args.append(transpose)
    __method_bind.set_cellv.call(this._handle, _args.toVariant(), 5)
  }

  fun setClipUv(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_clip_uv.call(this._handle, _arg, 1)
  }

  fun setCollisionBounce(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.set_collision_bounce.call(this._handle, _arg, 1)
  }

  fun setCollisionFriction(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.set_collision_friction.call(this._handle, _arg, 1)
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

  fun setCollisionUseKinematic(useKinematic: Boolean) {
    val _arg = Variant.new(useKinematic)
    __method_bind.set_collision_use_kinematic.call(this._handle, _arg, 1)
  }

  fun setCustomTransform(customTransform: Transform2D) {
    val _arg = Variant.new(customTransform)
    __method_bind.set_custom_transform.call(this._handle, _arg, 1)
  }

  fun setHalfOffset(halfOffset: Int) {
    val _arg = Variant.new(halfOffset)
    __method_bind.set_half_offset.call(this._handle, _arg, 1)
  }

  fun setMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_mode.call(this._handle, _arg, 1)
  }

  fun setOccluderLightMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.set_occluder_light_mask.call(this._handle, _arg, 1)
  }

  fun setQuadrantSize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.set_quadrant_size.call(this._handle, _arg, 1)
  }

  fun setTileOrigin(origin: Int) {
    val _arg = Variant.new(origin)
    __method_bind.set_tile_origin.call(this._handle, _arg, 1)
  }

  fun setTileset(tileset: TileSet) {
    val _arg = Variant.new(tileset)
    __method_bind.set_tileset.call(this._handle, _arg, 1)
  }

  fun setYSortMode(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_y_sort_mode.call(this._handle, _arg, 1)
  }

  fun updateBitmaskArea(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.update_bitmask_area.call(this._handle, _arg, 1)
  }

  fun updateBitmaskRegion(start: Vector2, end: Vector2) {
    val _args = VariantArray.new()
    _args.append(start)
    _args.append(end)
    __method_bind.update_bitmask_region.call(this._handle, _args.toVariant(), 2)
  }

  fun updateDirtyQuadrants() {
    __method_bind.update_dirty_quadrants.call(this._handle)
  }

  fun worldToMap(worldPosition: Vector2): Vector2 {
    val _arg = Variant.new(worldPosition)
    val _ret = __method_bind.world_to_map.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  enum class Mode(
    val value: Int
  ) {
    MODE_SQUARE(0),

    MODE_ISOMETRIC(1),

    MODE_CUSTOM(2);

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

  enum class TileOrigin(
    val value: Int
  ) {
    TILE_ORIGIN_TOP_LEFT(0),

    TILE_ORIGIN_CENTER(1),

    TILE_ORIGIN_BOTTOM_LEFT(2);

    companion object {
      fun from(value: Int): TileOrigin {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class HalfOffset(
    val value: Int
  ) {
    HALF_OFFSET_X(0),

    HALF_OFFSET_Y(1),

    HALF_OFFSET_DISABLED(2),

    HALF_OFFSET_NEGATIVE_X(3),

    HALF_OFFSET_NEGATIVE_Y(4);

    companion object {
      fun from(value: Int): HalfOffset {
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
      requireNotNull(fnPtr) { "No instance found for TileMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TileMap(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): TileMap = TileMap(ptr)
    /**
     * Container for method_bind pointers for TileMap
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val fix_invalid_tiles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "fix_invalid_tiles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method fix_invalid_tiles" }
        }
      val get_cell: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_cell".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell" }
        }
      val get_cell_autotile_coord: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_cell_autotile_coord".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_autotile_coord" }
        }
      val get_cell_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_size" }
        }
      val get_cellv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_cellv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cellv" }
        }
      val get_clip_uv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_clip_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_clip_uv" }
        }
      val get_collision_bounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_bounce" }
        }
      val get_collision_friction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_friction" }
        }
      val get_collision_layer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
        }
      val get_collision_layer_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
        }
      val get_collision_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val get_collision_mask_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val get_collision_use_kinematic: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_use_kinematic".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_use_kinematic" }
        }
      val get_custom_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_custom_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_transform" }
        }
      val get_half_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_half_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_half_offset" }
        }
      val get_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val get_occluder_light_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_occluder_light_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_occluder_light_mask" }
        }
      val get_quadrant_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_quadrant_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_quadrant_size" }
        }
      val get_tile_origin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_tile_origin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tile_origin" }
        }
      val get_tileset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_tileset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tileset" }
        }
      val get_used_cells: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_used_cells".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_used_cells" }
        }
      val get_used_cells_by_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_used_cells_by_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_used_cells_by_id" }
        }
      val get_used_rect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_used_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_used_rect" }
        }
      val is_cell_transposed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_cell_transposed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_cell_transposed" }
        }
      val is_cell_x_flipped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_cell_x_flipped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_cell_x_flipped" }
        }
      val is_cell_y_flipped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_cell_y_flipped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_cell_y_flipped" }
        }
      val is_y_sort_mode_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_y_sort_mode_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_y_sort_mode_enabled" }
        }
      val map_to_world: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "map_to_world".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method map_to_world" }
        }
      val set_cell: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_cell".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell" }
        }
      val set_cell_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_size" }
        }
      val set_cellv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_cellv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cellv" }
        }
      val set_clip_uv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_clip_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clip_uv" }
        }
      val set_collision_bounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_bounce" }
        }
      val set_collision_friction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_friction" }
        }
      val set_collision_layer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
        }
      val set_collision_layer_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
        }
      val set_collision_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val set_collision_mask_bit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val set_collision_use_kinematic: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_use_kinematic".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_use_kinematic" }
        }
      val set_custom_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_custom_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_transform" }
        }
      val set_half_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_half_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_half_offset" }
        }
      val set_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val set_occluder_light_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_occluder_light_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_occluder_light_mask" }
        }
      val set_quadrant_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_quadrant_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_quadrant_size" }
        }
      val set_tile_origin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_tile_origin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tile_origin" }
        }
      val set_tileset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_tileset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tileset" }
        }
      val set_y_sort_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_y_sort_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_y_sort_mode" }
        }
      val update_bitmask_area: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "update_bitmask_area".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_bitmask_area" }
        }
      val update_bitmask_region: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "update_bitmask_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_bitmask_region" }
        }
      val update_dirty_quadrants: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "update_dirty_quadrants".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_dirty_quadrants" }
        }
      val world_to_map: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "world_to_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method world_to_map" }
        }}
  }
}
