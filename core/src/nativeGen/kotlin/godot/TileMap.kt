// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun fixInvalidTiles() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.fixInvalidTiles.call(self._handle, emptyList(), null)
    }
  }

  fun getCell(x: Int, y: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(x)
      _args.add(y)
      __method_bind.getCell.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun getCellAutotileCoord(x: Int, y: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(x)
      _args.add(y)
      __method_bind.getCellAutotileCoord.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCellSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getCellSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCellv(position: Vector2): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCellv.call(self._handle, listOf(position), _retPtr)
      _ret.value
    }
  }

  fun getClipUv(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getClipUv.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCollisionBounce(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionBounce.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getCollisionFriction(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionFriction.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getCollisionLayer(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionLayer.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionLayerBit.call(self._handle, listOf(bit), _retPtr)
      _ret.value
    }
  }

  fun getCollisionMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionMaskBit.call(self._handle, listOf(bit), _retPtr)
      _ret.value
    }
  }

  fun getCollisionUseKinematic(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionUseKinematic.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCollisionUseParent(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionUseParent.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCustomTransform(): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.getCustomTransform.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getHalfOffset(): HalfOffset {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHalfOffset.call(self._handle, emptyList(), _retPtr)
      TileMap.HalfOffset.from(_ret.value)
    }
  }

  fun getMode(): Mode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMode.call(self._handle, emptyList(), _retPtr)
      TileMap.Mode.from(_ret.value)
    }
  }

  fun getOccluderLightMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOccluderLightMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getQuadrantSize(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getQuadrantSize.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTileOrigin(): TileOrigin {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTileOrigin.call(self._handle, emptyList(), _retPtr)
      TileMap.TileOrigin.from(_ret.value)
    }
  }

  fun getTileset(): TileSet {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: TileSet
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTileset.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<TileSet>(_tmp.value!!)
      _ret
    }
  }

  fun getUsedCells(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getUsedCells.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUsedCellsById(id: Int): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getUsedCellsById.call(self._handle, listOf(id), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUsedRect(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getUsedRect.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isCellTransposed(x: Int, y: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(x)
      _args.add(y)
      __method_bind.isCellTransposed.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun isCellXFlipped(x: Int, y: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(x)
      _args.add(y)
      __method_bind.isCellXFlipped.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun isCellYFlipped(x: Int, y: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(x)
      _args.add(y)
      __method_bind.isCellYFlipped.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun isCenteredTexturesEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCenteredTexturesEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isCompatibilityModeEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCompatibilityModeEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isYSortModeEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isYSortModeEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun mapToWorld(mapPosition: Vector2, ignoreHalfOfs: Boolean = false): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(mapPosition)
      _args.add(ignoreHalfOfs)
      __method_bind.mapToWorld.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
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
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(x)
      _args.add(y)
      _args.add(tile)
      _args.add(flipX)
      _args.add(flipY)
      _args.add(transpose)
      _args.add(autotileCoord)
      __method_bind.setCell.call(self._handle, _args, null)
    }
  }

  fun setCellSize(size: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCellSize.call(self._handle, listOf(size), null)
    }
  }

  fun setCellv(
    position: Vector2,
    tile: Int,
    flipX: Boolean = false,
    flipY: Boolean = false,
    transpose: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(position)
      _args.add(tile)
      _args.add(flipX)
      _args.add(flipY)
      _args.add(transpose)
      __method_bind.setCellv.call(self._handle, _args, null)
    }
  }

  fun setCenteredTextures(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCenteredTextures.call(self._handle, listOf(enable), null)
    }
  }

  fun setClipUv(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setClipUv.call(self._handle, listOf(enable), null)
    }
  }

  fun setCollisionBounce(value: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionBounce.call(self._handle, listOf(value), null)
    }
  }

  fun setCollisionFriction(value: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionFriction.call(self._handle, listOf(value), null)
    }
  }

  fun setCollisionLayer(layer: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionLayer.call(self._handle, listOf(layer), null)
    }
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(bit)
      _args.add(value)
      __method_bind.setCollisionLayerBit.call(self._handle, _args, null)
    }
  }

  fun setCollisionMask(mask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionMask.call(self._handle, listOf(mask), null)
    }
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(bit)
      _args.add(value)
      __method_bind.setCollisionMaskBit.call(self._handle, _args, null)
    }
  }

  fun setCollisionUseKinematic(useKinematic: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionUseKinematic.call(self._handle, listOf(useKinematic), null)
    }
  }

  fun setCollisionUseParent(useParent: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionUseParent.call(self._handle, listOf(useParent), null)
    }
  }

  fun setCompatibilityMode(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCompatibilityMode.call(self._handle, listOf(enable), null)
    }
  }

  fun setCustomTransform(customTransform: Transform2D) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCustomTransform.call(self._handle, listOf(customTransform), null)
    }
  }

  fun setHalfOffset(halfOffset: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHalfOffset.call(self._handle, listOf(halfOffset), null)
    }
  }

  fun setMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setOccluderLightMask(mask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOccluderLightMask.call(self._handle, listOf(mask), null)
    }
  }

  fun setQuadrantSize(size: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setQuadrantSize.call(self._handle, listOf(size), null)
    }
  }

  fun setTileOrigin(origin: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTileOrigin.call(self._handle, listOf(origin), null)
    }
  }

  fun setTileset(tileset: TileSet) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTileset.call(self._handle, listOf(tileset), null)
    }
  }

  fun setYSortMode(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setYSortMode.call(self._handle, listOf(enable), null)
    }
  }

  fun updateBitmaskArea(position: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.updateBitmaskArea.call(self._handle, listOf(position), null)
    }
  }

  fun updateBitmaskRegion(start: Vector2 = Vector2(0, 0), end: Vector2 = Vector2(0, 0)) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(start)
      _args.add(end)
      __method_bind.updateBitmaskRegion.call(self._handle, _args, null)
    }
  }

  fun updateDirtyQuadrants() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.updateDirtyQuadrants.call(self._handle, emptyList(), null)
    }
  }

  fun worldToMap(worldPosition: Vector2): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.worldToMap.call(self._handle, listOf(worldPosition), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
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

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val fixInvalidTiles: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "fix_invalid_tiles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method fix_invalid_tiles" }
        }
      val getCell: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_cell".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell" }
        }
      val getCellAutotileCoord: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_cell_autotile_coord".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_autotile_coord" }
        }
      val getCellSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_size" }
        }
      val getCellv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_cellv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cellv" }
        }
      val getClipUv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_clip_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_clip_uv" }
        }
      val getCollisionBounce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_bounce" }
        }
      val getCollisionFriction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_friction" }
        }
      val getCollisionLayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
        }
      val getCollisionLayerBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val getCollisionUseKinematic: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_use_kinematic".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_use_kinematic" }
        }
      val getCollisionUseParent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_collision_use_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_use_parent" }
        }
      val getCustomTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_custom_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_transform" }
        }
      val getHalfOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_half_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_half_offset" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val getOccluderLightMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_occluder_light_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_occluder_light_mask" }
        }
      val getQuadrantSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_quadrant_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_quadrant_size" }
        }
      val getTileOrigin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_tile_origin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tile_origin" }
        }
      val getTileset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_tileset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tileset" }
        }
      val getUsedCells: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_used_cells".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_used_cells" }
        }
      val getUsedCellsById: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_used_cells_by_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_used_cells_by_id" }
        }
      val getUsedRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "get_used_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_used_rect" }
        }
      val isCellTransposed: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_cell_transposed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_cell_transposed" }
        }
      val isCellXFlipped: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_cell_x_flipped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_cell_x_flipped" }
        }
      val isCellYFlipped: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_cell_y_flipped".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_cell_y_flipped" }
        }
      val isCenteredTexturesEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_centered_textures_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_centered_textures_enabled" }
        }
      val isCompatibilityModeEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_compatibility_mode_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_compatibility_mode_enabled" }
        }
      val isYSortModeEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "is_y_sort_mode_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_y_sort_mode_enabled" }
        }
      val mapToWorld: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "map_to_world".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method map_to_world" }
        }
      val setCell: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_cell".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell" }
        }
      val setCellSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_size" }
        }
      val setCellv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_cellv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cellv" }
        }
      val setCenteredTextures: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_centered_textures".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_centered_textures" }
        }
      val setClipUv: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_clip_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clip_uv" }
        }
      val setCollisionBounce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_bounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_bounce" }
        }
      val setCollisionFriction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_friction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_friction" }
        }
      val setCollisionLayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
        }
      val setCollisionLayerBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val setCollisionUseKinematic: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_use_kinematic".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_use_kinematic" }
        }
      val setCollisionUseParent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_collision_use_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_use_parent" }
        }
      val setCompatibilityMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_compatibility_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_compatibility_mode" }
        }
      val setCustomTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_custom_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_transform" }
        }
      val setHalfOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_half_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_half_offset" }
        }
      val setMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mode" }
        }
      val setOccluderLightMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_occluder_light_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_occluder_light_mask" }
        }
      val setQuadrantSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_quadrant_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_quadrant_size" }
        }
      val setTileOrigin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_tile_origin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tile_origin" }
        }
      val setTileset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_tileset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_tileset" }
        }
      val setYSortMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "set_y_sort_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_y_sort_mode" }
        }
      val updateBitmaskArea: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "update_bitmask_area".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_bitmask_area" }
        }
      val updateBitmaskRegion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "update_bitmask_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_bitmask_region" }
        }
      val updateDirtyQuadrants: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "update_dirty_quadrants".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_dirty_quadrants" }
        }
      val worldToMap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileMap".cstr.ptr,
            "world_to_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method world_to_map" }
        }}
  }
}
