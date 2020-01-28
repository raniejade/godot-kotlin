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

  var cellHalfOffset: Int
    get() {
       return TileMap.HalfOffset.from(getHalfOffset()) 
    }
    set(value) {
      setHalfOffset(TileMap.HalfOffset.from(value))
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

  var cellTileOrigin: Int
    get() {
       return TileMap.TileOrigin.from(getTileOrigin()) 
    }
    set(value) {
      setTileOrigin(TileMap.TileOrigin.from(value))
    }

  var cellYSort: Boolean
    get() {
       return isYSortModeEnabled() 
    }
    set(value) {
      setYSortMode(value)
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

  var mode: Int
    get() {
       return TileMap.Mode.from(getMode()) 
    }
    set(value) {
      setMode(TileMap.Mode.from(value))
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

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun fixInvalidTiles() {
    __method_bind.fixInvalidTiles.call(this._handle)
  }

  fun getCell(x: Int, y: Int): Int {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    val _ret = __method_bind.getCell.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun getCellAutotileCoord(x: Int, y: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    val _ret = __method_bind.getCellAutotileCoord.call(this._handle, _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun getCellSize(): Vector2 {
    val _ret = __method_bind.getCellSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getCellv(position: Vector2): Int {
    val _arg = Variant.new(position)
    val _ret = __method_bind.getCellv.call(this._handle, _arg, 1)
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

  fun getCollisionUseKinematic(): Boolean {
    val _ret = __method_bind.getCollisionUseKinematic.call(this._handle)
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
    val _arg = Variant.new(id)
    val _ret = __method_bind.getUsedCellsById.call(this._handle, _arg, 1)
    return _ret.asVariantArray()
  }

  fun getUsedRect(): Rect2 {
    val _ret = __method_bind.getUsedRect.call(this._handle)
    return _ret.asRect2()
  }

  fun isCellTransposed(x: Int, y: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    val _ret = __method_bind.isCellTransposed.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun isCellXFlipped(x: Int, y: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    val _ret = __method_bind.isCellXFlipped.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun isCellYFlipped(x: Int, y: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    val _ret = __method_bind.isCellYFlipped.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun isYSortModeEnabled(): Boolean {
    val _ret = __method_bind.isYSortModeEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun mapToWorld(mapPosition: Vector2, ignoreHalfOfs: Boolean): Vector2 {
    val _args = VariantArray.new()
    _args.append(mapPosition)
    _args.append(ignoreHalfOfs)
    val _ret = __method_bind.mapToWorld.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.setCell.call(this._handle, _args.toVariant(), 7)
  }

  fun setCellSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setCellSize.call(this._handle, _arg, 1)
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
    __method_bind.setCellv.call(this._handle, _args.toVariant(), 5)
  }

  fun setClipUv(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setClipUv.call(this._handle, _arg, 1)
  }

  fun setCollisionBounce(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.setCollisionBounce.call(this._handle, _arg, 1)
  }

  fun setCollisionFriction(value: Float) {
    val _arg = Variant.new(value)
    __method_bind.setCollisionFriction.call(this._handle, _arg, 1)
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

  fun setCollisionUseKinematic(useKinematic: Boolean) {
    val _arg = Variant.new(useKinematic)
    __method_bind.setCollisionUseKinematic.call(this._handle, _arg, 1)
  }

  fun setCustomTransform(customTransform: Transform2D) {
    val _arg = Variant.new(customTransform)
    __method_bind.setCustomTransform.call(this._handle, _arg, 1)
  }

  fun setHalfOffset(halfOffset: Int) {
    val _arg = Variant.new(halfOffset)
    __method_bind.setHalfOffset.call(this._handle, _arg, 1)
  }

  fun setMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setMode.call(this._handle, _arg, 1)
  }

  fun setOccluderLightMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setOccluderLightMask.call(this._handle, _arg, 1)
  }

  fun setQuadrantSize(size: Int) {
    val _arg = Variant.new(size)
    __method_bind.setQuadrantSize.call(this._handle, _arg, 1)
  }

  fun setTileOrigin(origin: Int) {
    val _arg = Variant.new(origin)
    __method_bind.setTileOrigin.call(this._handle, _arg, 1)
  }

  fun setTileset(tileset: TileSet) {
    val _arg = Variant.new(tileset)
    __method_bind.setTileset.call(this._handle, _arg, 1)
  }

  fun setYSortMode(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setYSortMode.call(this._handle, _arg, 1)
  }

  fun updateBitmaskArea(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.updateBitmaskArea.call(this._handle, _arg, 1)
  }

  fun updateBitmaskRegion(start: Vector2, end: Vector2) {
    val _args = VariantArray.new()
    _args.append(start)
    _args.append(end)
    __method_bind.updateBitmaskRegion.call(this._handle, _args.toVariant(), 2)
  }

  fun updateDirtyQuadrants() {
    __method_bind.updateDirtyQuadrants.call(this._handle)
  }

  fun worldToMap(worldPosition: Vector2): Vector2 {
    val _arg = Variant.new(worldPosition)
    val _ret = __method_bind.worldToMap.call(this._handle, _arg, 1)
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
      val fixInvalidTiles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "fixInvalidTiles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method fixInvalidTiles" }
        }
      val getCell: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getCell".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCell" }
        }
      val getCellAutotileCoord: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getCellAutotileCoord".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCellAutotileCoord" }
        }
      val getCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getCellSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCellSize" }
        }
      val getCellv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getCellv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCellv" }
        }
      val getClipUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getClipUv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClipUv" }
        }
      val getCollisionBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getCollisionBounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionBounce" }
        }
      val getCollisionFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getCollisionFriction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionFriction" }
        }
      val getCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getCollisionLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionLayer" }
        }
      val getCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getCollisionLayerBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionLayerBit" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMaskBit" }
        }
      val getCollisionUseKinematic: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getCollisionUseKinematic".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionUseKinematic" }
        }
      val getCustomTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getCustomTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCustomTransform" }
        }
      val getHalfOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getHalfOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHalfOffset" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMode" }
        }
      val getOccluderLightMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getOccluderLightMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOccluderLightMask" }
        }
      val getQuadrantSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getQuadrantSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getQuadrantSize" }
        }
      val getTileOrigin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getTileOrigin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTileOrigin" }
        }
      val getTileset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getTileset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTileset" }
        }
      val getUsedCells: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getUsedCells".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUsedCells" }
        }
      val getUsedCellsById: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getUsedCellsById".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUsedCellsById" }
        }
      val getUsedRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "getUsedRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUsedRect" }
        }
      val isCellTransposed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "isCellTransposed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCellTransposed" }
        }
      val isCellXFlipped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "isCellXFlipped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCellXFlipped" }
        }
      val isCellYFlipped: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "isCellYFlipped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCellYFlipped" }
        }
      val isYSortModeEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "isYSortModeEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isYSortModeEnabled" }
        }
      val mapToWorld: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "mapToWorld".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mapToWorld" }
        }
      val setCell: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setCell".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCell" }
        }
      val setCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setCellSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCellSize" }
        }
      val setCellv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setCellv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCellv" }
        }
      val setClipUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setClipUv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setClipUv" }
        }
      val setCollisionBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setCollisionBounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionBounce" }
        }
      val setCollisionFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setCollisionFriction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionFriction" }
        }
      val setCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setCollisionLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionLayer" }
        }
      val setCollisionLayerBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setCollisionLayerBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionLayerBit" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMaskBit" }
        }
      val setCollisionUseKinematic: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setCollisionUseKinematic".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionUseKinematic" }
        }
      val setCustomTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setCustomTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCustomTransform" }
        }
      val setHalfOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setHalfOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHalfOffset" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMode" }
        }
      val setOccluderLightMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setOccluderLightMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOccluderLightMask" }
        }
      val setQuadrantSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setQuadrantSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setQuadrantSize" }
        }
      val setTileOrigin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setTileOrigin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTileOrigin" }
        }
      val setTileset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setTileset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTileset" }
        }
      val setYSortMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "setYSortMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setYSortMode" }
        }
      val updateBitmaskArea: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "updateBitmaskArea".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method updateBitmaskArea" }
        }
      val updateBitmaskRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "updateBitmaskRegion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method updateBitmaskRegion" }
        }
      val updateDirtyQuadrants: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "updateDirtyQuadrants".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method updateDirtyQuadrants" }
        }
      val worldToMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "worldToMap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method worldToMap" }
        }}
  }
}
