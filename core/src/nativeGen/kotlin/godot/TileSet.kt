// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
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

open class TileSet(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun autotileClearBitmaskMap(id: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.autotileClearBitmaskMap.call(self._handle, listOf(id), null)
    }
  }

  fun autotileGetBitmask(id: Int, coord: Vector2): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(coord)
      __method_bind.autotileGetBitmask.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun autotileGetBitmaskMode(id: Int): BitmaskMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.autotileGetBitmaskMode.call(self._handle, listOf(id), _retPtr)
      TileSet.BitmaskMode.from(_ret.value)
    }
  }

  fun autotileGetIconCoordinate(id: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.autotileGetIconCoordinate.call(self._handle, listOf(id), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun autotileGetLightOccluder(id: Int, coord: Vector2): OccluderPolygon2D {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: OccluderPolygon2D
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(coord)
      __method_bind.autotileGetLightOccluder.call(self._handle, _args, _retPtr)
      _ret = objectToType<OccluderPolygon2D>(_tmp.value!!)
      _ret
    }
  }

  fun autotileGetNavigationPolygon(id: Int, coord: Vector2): NavigationPolygon {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: NavigationPolygon
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(coord)
      __method_bind.autotileGetNavigationPolygon.call(self._handle, _args, _retPtr)
      _ret = objectToType<NavigationPolygon>(_tmp.value!!)
      _ret
    }
  }

  fun autotileGetSize(id: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.autotileGetSize.call(self._handle, listOf(id), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun autotileGetSpacing(id: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.autotileGetSpacing.call(self._handle, listOf(id), _retPtr)
      _ret.value
    }
  }

  fun autotileGetSubtilePriority(id: Int, coord: Vector2): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(coord)
      __method_bind.autotileGetSubtilePriority.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun autotileGetZIndex(id: Int, coord: Vector2): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(coord)
      __method_bind.autotileGetZIndex.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun autotileSetBitmask(
    id: Int,
    bitmask: Vector2,
    flag: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(bitmask)
      _args.add(flag)
      __method_bind.autotileSetBitmask.call(self._handle, _args, null)
    }
  }

  fun autotileSetBitmaskMode(id: Int, mode: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(mode)
      __method_bind.autotileSetBitmaskMode.call(self._handle, _args, null)
    }
  }

  fun autotileSetIconCoordinate(id: Int, coord: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(coord)
      __method_bind.autotileSetIconCoordinate.call(self._handle, _args, null)
    }
  }

  fun autotileSetLightOccluder(
    id: Int,
    lightOccluder: OccluderPolygon2D,
    coord: Vector2
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(lightOccluder)
      _args.add(coord)
      __method_bind.autotileSetLightOccluder.call(self._handle, _args, null)
    }
  }

  fun autotileSetNavigationPolygon(
    id: Int,
    navigationPolygon: NavigationPolygon,
    coord: Vector2
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(navigationPolygon)
      _args.add(coord)
      __method_bind.autotileSetNavigationPolygon.call(self._handle, _args, null)
    }
  }

  fun autotileSetSize(id: Int, size: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(size)
      __method_bind.autotileSetSize.call(self._handle, _args, null)
    }
  }

  fun autotileSetSpacing(id: Int, spacing: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(spacing)
      __method_bind.autotileSetSpacing.call(self._handle, _args, null)
    }
  }

  fun autotileSetSubtilePriority(
    id: Int,
    coord: Vector2,
    priority: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(coord)
      _args.add(priority)
      __method_bind.autotileSetSubtilePriority.call(self._handle, _args, null)
    }
  }

  fun autotileSetZIndex(
    id: Int,
    coord: Vector2,
    zIndex: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(coord)
      _args.add(zIndex)
      __method_bind.autotileSetZIndex.call(self._handle, _args, null)
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun createTile(id: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.createTile.call(self._handle, listOf(id), null)
    }
  }

  fun findTileByName(name: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.findTileByName.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun getLastUnusedTileId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLastUnusedTileId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTilesIds(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getTilesIds.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun removeTile(id: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeTile.call(self._handle, listOf(id), null)
    }
  }

  fun tileAddShape(
    id: Int,
    shape: Shape2D,
    shapeTransform: Transform2D,
    oneWay: Boolean = false,
    autotileCoord: Vector2 = Vector2(0, 0)
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(shape)
      _args.add(shapeTransform)
      _args.add(oneWay)
      _args.add(autotileCoord)
      __method_bind.tileAddShape.call(self._handle, _args, null)
    }
  }

  fun tileGetLightOccluder(id: Int): OccluderPolygon2D {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: OccluderPolygon2D
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.tileGetLightOccluder.call(self._handle, listOf(id), _retPtr)
      _ret = objectToType<OccluderPolygon2D>(_tmp.value!!)
      _ret
    }
  }

  fun tileGetMaterial(id: Int): ShaderMaterial {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: ShaderMaterial
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.tileGetMaterial.call(self._handle, listOf(id), _retPtr)
      _ret = objectToType<ShaderMaterial>(_tmp.value!!)
      _ret
    }
  }

  fun tileGetModulate(id: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.tileGetModulate.call(self._handle, listOf(id), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun tileGetName(id: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.tileGetName.call(self._handle, listOf(id), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun tileGetNavigationPolygon(id: Int): NavigationPolygon {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: NavigationPolygon
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.tileGetNavigationPolygon.call(self._handle, listOf(id), _retPtr)
      _ret = objectToType<NavigationPolygon>(_tmp.value!!)
      _ret
    }
  }

  fun tileGetNavigationPolygonOffset(id: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.tileGetNavigationPolygonOffset.call(self._handle, listOf(id), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun tileGetNormalMap(id: Int): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.tileGetNormalMap.call(self._handle, listOf(id), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun tileGetOccluderOffset(id: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.tileGetOccluderOffset.call(self._handle, listOf(id), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun tileGetRegion(id: Int): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.tileGetRegion.call(self._handle, listOf(id), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun tileGetShape(id: Int, shapeId: Int): Shape2D {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Shape2D
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(shapeId)
      __method_bind.tileGetShape.call(self._handle, _args, _retPtr)
      _ret = objectToType<Shape2D>(_tmp.value!!)
      _ret
    }
  }

  fun tileGetShapeCount(id: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.tileGetShapeCount.call(self._handle, listOf(id), _retPtr)
      _ret.value
    }
  }

  fun tileGetShapeOffset(id: Int, shapeId: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(shapeId)
      __method_bind.tileGetShapeOffset.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun tileGetShapeOneWay(id: Int, shapeId: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(shapeId)
      __method_bind.tileGetShapeOneWay.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun tileGetShapeOneWayMargin(id: Int, shapeId: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(shapeId)
      __method_bind.tileGetShapeOneWayMargin.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun tileGetShapeTransform(id: Int, shapeId: Int): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(shapeId)
      __method_bind.tileGetShapeTransform.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun tileGetShapes(id: Int): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.tileGetShapes.call(self._handle, listOf(id), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun tileGetTexture(id: Int): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.tileGetTexture.call(self._handle, listOf(id), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun tileGetTextureOffset(id: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.tileGetTextureOffset.call(self._handle, listOf(id), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun tileGetTileMode(id: Int): TileMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.tileGetTileMode.call(self._handle, listOf(id), _retPtr)
      TileSet.TileMode.from(_ret.value)
    }
  }

  fun tileGetZIndex(id: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.tileGetZIndex.call(self._handle, listOf(id), _retPtr)
      _ret.value
    }
  }

  fun tileSetLightOccluder(id: Int, lightOccluder: OccluderPolygon2D) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(lightOccluder)
      __method_bind.tileSetLightOccluder.call(self._handle, _args, null)
    }
  }

  fun tileSetMaterial(id: Int, material: ShaderMaterial) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(material)
      __method_bind.tileSetMaterial.call(self._handle, _args, null)
    }
  }

  fun tileSetModulate(id: Int, color: Color) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(color)
      __method_bind.tileSetModulate.call(self._handle, _args, null)
    }
  }

  fun tileSetName(id: Int, name: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(name)
      __method_bind.tileSetName.call(self._handle, _args, null)
    }
  }

  fun tileSetNavigationPolygon(id: Int, navigationPolygon: NavigationPolygon) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(navigationPolygon)
      __method_bind.tileSetNavigationPolygon.call(self._handle, _args, null)
    }
  }

  fun tileSetNavigationPolygonOffset(id: Int, navigationPolygonOffset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(navigationPolygonOffset)
      __method_bind.tileSetNavigationPolygonOffset.call(self._handle, _args, null)
    }
  }

  fun tileSetNormalMap(id: Int, normalMap: Texture) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(normalMap)
      __method_bind.tileSetNormalMap.call(self._handle, _args, null)
    }
  }

  fun tileSetOccluderOffset(id: Int, occluderOffset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(occluderOffset)
      __method_bind.tileSetOccluderOffset.call(self._handle, _args, null)
    }
  }

  fun tileSetRegion(id: Int, region: Rect2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(region)
      __method_bind.tileSetRegion.call(self._handle, _args, null)
    }
  }

  fun tileSetShape(
    id: Int,
    shapeId: Int,
    shape: Shape2D
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(shapeId)
      _args.add(shape)
      __method_bind.tileSetShape.call(self._handle, _args, null)
    }
  }

  fun tileSetShapeOffset(
    id: Int,
    shapeId: Int,
    shapeOffset: Vector2
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(shapeId)
      _args.add(shapeOffset)
      __method_bind.tileSetShapeOffset.call(self._handle, _args, null)
    }
  }

  fun tileSetShapeOneWay(
    id: Int,
    shapeId: Int,
    oneWay: Boolean
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(shapeId)
      _args.add(oneWay)
      __method_bind.tileSetShapeOneWay.call(self._handle, _args, null)
    }
  }

  fun tileSetShapeOneWayMargin(
    id: Int,
    shapeId: Int,
    oneWay: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(shapeId)
      _args.add(oneWay)
      __method_bind.tileSetShapeOneWayMargin.call(self._handle, _args, null)
    }
  }

  fun tileSetShapeTransform(
    id: Int,
    shapeId: Int,
    shapeTransform: Transform2D
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(shapeId)
      _args.add(shapeTransform)
      __method_bind.tileSetShapeTransform.call(self._handle, _args, null)
    }
  }

  fun tileSetShapes(id: Int, shapes: VariantArray) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(shapes)
      __method_bind.tileSetShapes.call(self._handle, _args, null)
    }
  }

  fun tileSetTexture(id: Int, texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(texture)
      __method_bind.tileSetTexture.call(self._handle, _args, null)
    }
  }

  fun tileSetTextureOffset(id: Int, textureOffset: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(textureOffset)
      __method_bind.tileSetTextureOffset.call(self._handle, _args, null)
    }
  }

  fun tileSetTileMode(id: Int, tilemode: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(tilemode)
      __method_bind.tileSetTileMode.call(self._handle, _args, null)
    }
  }

  fun tileSetZIndex(id: Int, zIndex: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(zIndex)
      __method_bind.tileSetZIndex.call(self._handle, _args, null)
    }
  }

  enum class TileMode(
    val value: Int
  ) {
    SINGLE_TILE(0),

    AUTO_TILE(1),

    ATLAS_TILE(2);

    companion object {
      fun from(value: Int): TileMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class AutotileBindings(
    val value: Int
  ) {
    BIND_TOPLEFT(1),

    BIND_TOP(2),

    BIND_TOPRIGHT(4),

    BIND_LEFT(8),

    BIND_CENTER(16),

    BIND_RIGHT(32),

    BIND_BOTTOMLEFT(64),

    BIND_BOTTOM(128),

    BIND_BOTTOMRIGHT(256);

    companion object {
      fun from(value: Int): AutotileBindings {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class BitmaskMode(
    val value: Int
  ) {
    `2X2`(0),

    `3X3_MINIMAL`(1),

    `3X3`(2);

    companion object {
      fun from(value: Int): BitmaskMode {
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TileSet".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TileSet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for TileSet
     */
    private object __method_bind {
      val autotileClearBitmaskMap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_clear_bitmask_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_clear_bitmask_map" }
        }
      val autotileGetBitmask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_bitmask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_bitmask" }
        }
      val autotileGetBitmaskMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_bitmask_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_bitmask_mode" }
        }
      val autotileGetIconCoordinate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_icon_coordinate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_icon_coordinate" }
        }
      val autotileGetLightOccluder: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_light_occluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_light_occluder" }
        }
      val autotileGetNavigationPolygon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_navigation_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_navigation_polygon" }
        }
      val autotileGetSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_size" }
        }
      val autotileGetSpacing: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_spacing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_spacing" }
        }
      val autotileGetSubtilePriority: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_subtile_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_subtile_priority" }
        }
      val autotileGetZIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_z_index" }
        }
      val autotileSetBitmask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_bitmask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_bitmask" }
        }
      val autotileSetBitmaskMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_bitmask_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_bitmask_mode" }
        }
      val autotileSetIconCoordinate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_icon_coordinate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_icon_coordinate" }
        }
      val autotileSetLightOccluder: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_light_occluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_light_occluder" }
        }
      val autotileSetNavigationPolygon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_navigation_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_navigation_polygon" }
        }
      val autotileSetSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_size" }
        }
      val autotileSetSpacing: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_spacing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_spacing" }
        }
      val autotileSetSubtilePriority: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_subtile_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_subtile_priority" }
        }
      val autotileSetZIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_z_index" }
        }
      val clear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val createTile: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "create_tile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_tile" }
        }
      val findTileByName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "find_tile_by_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_tile_by_name" }
        }
      val getLastUnusedTileId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "get_last_unused_tile_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_last_unused_tile_id" }
        }
      val getTilesIds: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "get_tiles_ids".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tiles_ids" }
        }
      val removeTile: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "remove_tile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_tile" }
        }
      val tileAddShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_add_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_add_shape" }
        }
      val tileGetLightOccluder: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_light_occluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_light_occluder" }
        }
      val tileGetMaterial: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_material" }
        }
      val tileGetModulate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_modulate" }
        }
      val tileGetName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_name" }
        }
      val tileGetNavigationPolygon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_navigation_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_navigation_polygon" }
        }
      val tileGetNavigationPolygonOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_navigation_polygon_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_navigation_polygon_offset"
            }
        }
      val tileGetNormalMap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_normal_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_normal_map" }
        }
      val tileGetOccluderOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_occluder_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_occluder_offset" }
        }
      val tileGetRegion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_region" }
        }
      val tileGetShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape" }
        }
      val tileGetShapeCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape_count" }
        }
      val tileGetShapeOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape_offset" }
        }
      val tileGetShapeOneWay: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape_one_way".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape_one_way" }
        }
      val tileGetShapeOneWayMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape_one_way_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape_one_way_margin" }
        }
      val tileGetShapeTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape_transform" }
        }
      val tileGetShapes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shapes" }
        }
      val tileGetTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_texture" }
        }
      val tileGetTextureOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_texture_offset" }
        }
      val tileGetTileMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_tile_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_tile_mode" }
        }
      val tileGetZIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_z_index" }
        }
      val tileSetLightOccluder: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_light_occluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_light_occluder" }
        }
      val tileSetMaterial: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_material" }
        }
      val tileSetModulate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_modulate" }
        }
      val tileSetName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_name" }
        }
      val tileSetNavigationPolygon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_navigation_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_navigation_polygon" }
        }
      val tileSetNavigationPolygonOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_navigation_polygon_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_navigation_polygon_offset"
            }
        }
      val tileSetNormalMap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_normal_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_normal_map" }
        }
      val tileSetOccluderOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_occluder_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_occluder_offset" }
        }
      val tileSetRegion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_region" }
        }
      val tileSetShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shape" }
        }
      val tileSetShapeOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shape_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shape_offset" }
        }
      val tileSetShapeOneWay: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shape_one_way".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shape_one_way" }
        }
      val tileSetShapeOneWayMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shape_one_way_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shape_one_way_margin" }
        }
      val tileSetShapeTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shape_transform" }
        }
      val tileSetShapes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shapes" }
        }
      val tileSetTexture: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_texture" }
        }
      val tileSetTextureOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_texture_offset" }
        }
      val tileSetTileMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_tile_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_tile_mode" }
        }
      val tileSetZIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_z_index" }
        }}
  }
}
