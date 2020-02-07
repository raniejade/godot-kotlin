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

open class TileMap(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var cellClipUv: Boolean
    get() {
       return getClipUv() 
    }
    set(value) {
      setClipUv(value)
    }

  var cellCustomTransform: Transform2D
    get() {
       return getCustomTransform() 
    }
    set(value) {
      setCustomTransform(value)
    }

  var cellHalfOffset: HalfOffset
    get() {
       return getHalfOffset() 
    }
    set(value) {
      setHalfOffset(value.value)
    }

  var cellQuadrantSize: Int
    get() {
       return getQuadrantSize() 
    }
    set(value) {
      setQuadrantSize(value)
    }

  var cellSize: Vector2
    get() {
       return getCellSize() 
    }
    set(value) {
      setCellSize(value)
    }

  var cellTileOrigin: TileOrigin
    get() {
       return getTileOrigin() 
    }
    set(value) {
      setTileOrigin(value.value)
    }

  var cellYSort: Boolean
    get() {
       return isYSortModeEnabled() 
    }
    set(value) {
      setYSortMode(value)
    }

  var centeredTextures: Boolean
    get() {
       return isCenteredTexturesEnabled() 
    }
    set(value) {
      setCenteredTextures(value)
    }

  var collisionBounce: Float
    get() {
       return getCollisionBounce() 
    }
    set(value) {
      setCollisionBounce(value)
    }

  var collisionFriction: Float
    get() {
       return getCollisionFriction() 
    }
    set(value) {
      setCollisionFriction(value)
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

  var collisionUseKinematic: Boolean
    get() {
       return getCollisionUseKinematic() 
    }
    set(value) {
      setCollisionUseKinematic(value)
    }

  var collisionUseParent: Boolean
    get() {
       return getCollisionUseParent() 
    }
    set(value) {
      setCollisionUseParent(value)
    }

  var compatibilityMode: Boolean
    get() {
       return isCompatibilityModeEnabled() 
    }
    set(value) {
      setCompatibilityMode(value)
    }

  var mode: Mode
    get() {
       return getMode() 
    }
    set(value) {
      setMode(value.value)
    }

  var occluderLightMask: Int
    get() {
       return getOccluderLightMask() 
    }
    set(value) {
      setOccluderLightMask(value)
    }

  var tileSet: TileSet
    get() {
       return getTileset() 
    }
    set(value) {
      setTileset(value)
    }

  /**
   * TileMap::settings_changed signal
   */
  val signalSettingsChanged: Signal0 = Signal0("settings_changed")

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for cellCustomTransform
   */
  fun cellCustomTransform(cb: Transform2D.() -> Unit) {
    val _p = cellCustomTransform
    cb(_p)
    cellCustomTransform = _p
  }

  /**
   * Specialized setter for cellSize
   */
  fun cellSize(cb: Vector2.() -> Unit) {
    val _p = cellSize
    cb(_p)
    cellSize = _p
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun fixInvalidTiles() {
    __method_bind.fixInvalidTiles.call(this._handle)
  }

  fun getCell(x: Int, y: Int): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(x))
    _args.add(Variant.fromAny(y))
    val _ret = __method_bind.getCell.call(this._handle, _args)
    return _ret.asInt()
  }

  fun getCellAutotileCoord(x: Int, y: Int): Vector2 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(x))
    _args.add(Variant.fromAny(y))
    val _ret = __method_bind.getCellAutotileCoord.call(this._handle, _args)
    return _ret.asVector2()
  }

  fun getCellSize(): Vector2 {
    val _ret = __method_bind.getCellSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getCellv(position: Vector2): Int {
    val _arg = Variant(position)
    val _ret = __method_bind.getCellv.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getClipUv(): Boolean {
    val _ret = __method_bind.getClipUv.call(this._handle)
    return _ret.asBoolean()
  }

  fun getCollisionBounce(): Float {
    val _ret = __method_bind.getCollisionBounce.call(this._handle)
    return _ret.asFloat()
  }

  fun getCollisionFriction(): Float {
    val _ret = __method_bind.getCollisionFriction.call(this._handle)
    return _ret.asFloat()
  }

  fun getCollisionLayer(): Int {
    val _ret = __method_bind.getCollisionLayer.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val _arg = Variant(bit)
    val _ret = __method_bind.getCollisionLayerBit.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.getCollisionMask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant(bit)
    val _ret = __method_bind.getCollisionMaskBit.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getCollisionUseKinematic(): Boolean {
    val _ret = __method_bind.getCollisionUseKinematic.call(this._handle)
    return _ret.asBoolean()
  }

  fun getCollisionUseParent(): Boolean {
    val _ret = __method_bind.getCollisionUseParent.call(this._handle)
    return _ret.asBoolean()
  }

  fun getCustomTransform(): Transform2D {
    val _ret = __method_bind.getCustomTransform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getHalfOffset(): HalfOffset {
    val _ret = __method_bind.getHalfOffset.call(this._handle)
    return TileMap.HalfOffset.from(_ret.asInt())
  }

  fun getMode(): Mode {
    val _ret = __method_bind.getMode.call(this._handle)
    return TileMap.Mode.from(_ret.asInt())
  }

  fun getOccluderLightMask(): Int {
    val _ret = __method_bind.getOccluderLightMask.call(this._handle)
    return _ret.asInt()
  }

  fun getQuadrantSize(): Int {
    val _ret = __method_bind.getQuadrantSize.call(this._handle)
    return _ret.asInt()
  }

  fun getTileOrigin(): TileOrigin {
    val _ret = __method_bind.getTileOrigin.call(this._handle)
    return TileMap.TileOrigin.from(_ret.asInt())
  }

  fun getTileset(): TileSet {
    val _ret = __method_bind.getTileset.call(this._handle)
    return _ret.asObject(::TileSet)!!
  }

  fun getUsedCells(): VariantArray {
    val _ret = __method_bind.getUsedCells.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getUsedCellsById(id: Int): VariantArray {
    val _arg = Variant(id)
    val _ret = __method_bind.getUsedCellsById.call(this._handle, listOf(_arg))
    return _ret.asVariantArray()
  }

  fun getUsedRect(): Rect2 {
    val _ret = __method_bind.getUsedRect.call(this._handle)
    return _ret.asRect2()
  }

  fun isCellTransposed(x: Int, y: Int): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(x))
    _args.add(Variant.fromAny(y))
    val _ret = __method_bind.isCellTransposed.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun isCellXFlipped(x: Int, y: Int): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(x))
    _args.add(Variant.fromAny(y))
    val _ret = __method_bind.isCellXFlipped.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun isCellYFlipped(x: Int, y: Int): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(x))
    _args.add(Variant.fromAny(y))
    val _ret = __method_bind.isCellYFlipped.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun isCenteredTexturesEnabled(): Boolean {
    val _ret = __method_bind.isCenteredTexturesEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isCompatibilityModeEnabled(): Boolean {
    val _ret = __method_bind.isCompatibilityModeEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isYSortModeEnabled(): Boolean {
    val _ret = __method_bind.isYSortModeEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun mapToWorld(mapPosition: Vector2, ignoreHalfOfs: Boolean = false): Vector2 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mapPosition))
    _args.add(Variant.fromAny(ignoreHalfOfs))
    val _ret = __method_bind.mapToWorld.call(this._handle, _args)
    return _ret.asVector2()
  }

  fun setCell(
    x: Int,
    y: Int,
    tile: Int,
    flipX: Boolean = false,
    flipY: Boolean = false,
    transpose: Boolean = false,
    autotileCoord: Vector2 = Vector2(0, 0)
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(x))
    _args.add(Variant.fromAny(y))
    _args.add(Variant.fromAny(tile))
    _args.add(Variant.fromAny(flipX))
    _args.add(Variant.fromAny(flipY))
    _args.add(Variant.fromAny(transpose))
    _args.add(Variant.fromAny(autotileCoord))
    __method_bind.setCell.call(this._handle, _args)
  }

  fun setCellSize(size: Vector2) {
    val _arg = Variant(size)
    __method_bind.setCellSize.call(this._handle, listOf(_arg))
  }

  fun setCellv(
    position: Vector2,
    tile: Int,
    flipX: Boolean = false,
    flipY: Boolean = false,
    transpose: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(tile))
    _args.add(Variant.fromAny(flipX))
    _args.add(Variant.fromAny(flipY))
    _args.add(Variant.fromAny(transpose))
    __method_bind.setCellv.call(this._handle, _args)
  }

  fun setCenteredTextures(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setCenteredTextures.call(this._handle, listOf(_arg))
  }

  fun setClipUv(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setClipUv.call(this._handle, listOf(_arg))
  }

  fun setCollisionBounce(value: Float) {
    val _arg = Variant(value)
    __method_bind.setCollisionBounce.call(this._handle, listOf(_arg))
  }

  fun setCollisionFriction(value: Float) {
    val _arg = Variant(value)
    __method_bind.setCollisionFriction.call(this._handle, listOf(_arg))
  }

  fun setCollisionLayer(layer: Int) {
    val _arg = Variant(layer)
    __method_bind.setCollisionLayer.call(this._handle, listOf(_arg))
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bit))
    _args.add(Variant.fromAny(value))
    __method_bind.setCollisionLayerBit.call(this._handle, _args)
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant(mask)
    __method_bind.setCollisionMask.call(this._handle, listOf(_arg))
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bit))
    _args.add(Variant.fromAny(value))
    __method_bind.setCollisionMaskBit.call(this._handle, _args)
  }

  fun setCollisionUseKinematic(useKinematic: Boolean) {
    val _arg = Variant(useKinematic)
    __method_bind.setCollisionUseKinematic.call(this._handle, listOf(_arg))
  }

  fun setCollisionUseParent(useParent: Boolean) {
    val _arg = Variant(useParent)
    __method_bind.setCollisionUseParent.call(this._handle, listOf(_arg))
  }

  fun setCompatibilityMode(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setCompatibilityMode.call(this._handle, listOf(_arg))
  }

  fun setCustomTransform(customTransform: Transform2D) {
    val _arg = Variant(customTransform)
    __method_bind.setCustomTransform.call(this._handle, listOf(_arg))
  }

  fun setHalfOffset(halfOffset: Int) {
    val _arg = Variant(halfOffset)
    __method_bind.setHalfOffset.call(this._handle, listOf(_arg))
  }

  fun setMode(mode: Int) {
    val _arg = Variant(mode)
    __method_bind.setMode.call(this._handle, listOf(_arg))
  }

  fun setOccluderLightMask(mask: Int) {
    val _arg = Variant(mask)
    __method_bind.setOccluderLightMask.call(this._handle, listOf(_arg))
  }

  fun setQuadrantSize(size: Int) {
    val _arg = Variant(size)
    __method_bind.setQuadrantSize.call(this._handle, listOf(_arg))
  }

  fun setTileOrigin(origin: Int) {
    val _arg = Variant(origin)
    __method_bind.setTileOrigin.call(this._handle, listOf(_arg))
  }

  fun setTileset(tileset: TileSet) {
    val _arg = Variant(tileset)
    __method_bind.setTileset.call(this._handle, listOf(_arg))
  }

  fun setYSortMode(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setYSortMode.call(this._handle, listOf(_arg))
  }

  fun updateBitmaskArea(position: Vector2) {
    val _arg = Variant(position)
    __method_bind.updateBitmaskArea.call(this._handle, listOf(_arg))
  }

  fun updateBitmaskRegion(start: Vector2 = Vector2(0, 0), end: Vector2 = Vector2(0, 0)) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(start))
    _args.add(Variant.fromAny(end))
    __method_bind.updateBitmaskRegion.call(this._handle, _args)
  }

  fun updateDirtyQuadrants() {
    __method_bind.updateDirtyQuadrants.call(this._handle)
  }

  fun worldToMap(worldPosition: Vector2): Vector2 {
    val _arg = Variant(worldPosition)
    val _ret = __method_bind.worldToMap.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  enum class Mode(
    val value: Int
  ) {
    SQUARE(0),

    ISOMETRIC(1),

    CUSTOM(2);

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
    TOP_LEFT(0),

    CENTER(1),

    BOTTOM_LEFT(2);

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
    X(0),

    Y(1),

    DISABLED(2),

    NEGATIVE_X(3),

    NEGATIVE_Y(4);

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
    val INVALID_CELL: Int = -1

    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TileMap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TileMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
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
      val fixInvalidTiles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "fix_invalid_tiles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method fix_invalid_tiles" }
        }
      val getCell: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_cell".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell" }
        }
      val getCellAutotileCoord: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_cell_autotile_coord".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_autotile_coord" }
        }
      val getCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_size" }
        }
      val getCellv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_cellv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cellv" }
        }
      val getClipUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_clip_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_clip_uv" }
        }
      val getCollisionBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_bounce" }
        }
      val getCollisionFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_friction" }
        }
      val getCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
        }
      val getCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val getCollisionUseKinematic: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_use_kinematic".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_use_kinematic" }
        }
      val getCollisionUseParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_use_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_use_parent" }
        }
      val getCustomTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_custom_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_transform" }
        }
      val getHalfOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_half_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_half_offset" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val getOccluderLightMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_occluder_light_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_occluder_light_mask" }
        }
      val getQuadrantSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_quadrant_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_quadrant_size" }
        }
      val getTileOrigin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_tile_origin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tile_origin" }
        }
      val getTileset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_tileset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tileset" }
        }
      val getUsedCells: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_used_cells".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_used_cells" }
        }
      val getUsedCellsById: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_used_cells_by_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_used_cells_by_id" }
        }
      val getUsedRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_used_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_used_rect" }
        }
      val isCellTransposed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_cell_transposed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_cell_transposed" }
        }
      val isCellXFlipped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_cell_x_flipped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_cell_x_flipped" }
        }
      val isCellYFlipped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_cell_y_flipped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_cell_y_flipped" }
        }
      val isCenteredTexturesEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_centered_textures_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_centered_textures_enabled" }
        }
      val isCompatibilityModeEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_compatibility_mode_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_compatibility_mode_enabled" }
        }
      val isYSortModeEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_y_sort_mode_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_y_sort_mode_enabled" }
        }
      val mapToWorld: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "map_to_world".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method map_to_world" }
        }
      val setCell: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_cell".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell" }
        }
      val setCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_size" }
        }
      val setCellv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_cellv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cellv" }
        }
      val setCenteredTextures: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_centered_textures".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_centered_textures" }
        }
      val setClipUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_clip_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clip_uv" }
        }
      val setCollisionBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_bounce" }
        }
      val setCollisionFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_friction" }
        }
      val setCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
        }
      val setCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val setCollisionUseKinematic: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_use_kinematic".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_use_kinematic" }
        }
      val setCollisionUseParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_use_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_use_parent" }
        }
      val setCompatibilityMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_compatibility_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_compatibility_mode" }
        }
      val setCustomTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_custom_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_transform" }
        }
      val setHalfOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_half_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_half_offset" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val setOccluderLightMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_occluder_light_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_occluder_light_mask" }
        }
      val setQuadrantSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_quadrant_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_quadrant_size" }
        }
      val setTileOrigin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_tile_origin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tile_origin" }
        }
      val setTileset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_tileset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tileset" }
        }
      val setYSortMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_y_sort_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_y_sort_mode" }
        }
      val updateBitmaskArea: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "update_bitmask_area".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_bitmask_area" }
        }
      val updateBitmaskRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "update_bitmask_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_bitmask_region" }
        }
      val updateDirtyQuadrants: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "update_dirty_quadrants".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_dirty_quadrants" }
        }
      val worldToMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "world_to_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method world_to_map" }
        }}
  }
}
