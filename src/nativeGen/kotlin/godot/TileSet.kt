// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TileSet(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun autotileClearBitmaskMap(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.autotileClearBitmaskMap.call(this._handle, _arg, 1)
  }

  fun autotileGetBitmask(id: Int, coord: Vector2): Int {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotileGetBitmask.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun autotileGetBitmaskMode(id: Int): BitmaskMode {
    val _arg = Variant.new(id)
    val _ret = __method_bind.autotileGetBitmaskMode.call(this._handle, _arg, 1)
    return TileSet.BitmaskMode.from(_ret.asInt())
  }

  fun autotileGetIconCoordinate(id: Int): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.autotileGetIconCoordinate.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun autotileGetLightOccluder(id: Int, coord: Vector2): OccluderPolygon2D {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotileGetLightOccluder.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::OccluderPolygon2D)!!
  }

  fun autotileGetNavigationPolygon(id: Int, coord: Vector2): NavigationPolygon {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotileGetNavigationPolygon.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::NavigationPolygon)!!
  }

  fun autotileGetSize(id: Int): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.autotileGetSize.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun autotileGetSpacing(id: Int): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.autotileGetSpacing.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun autotileGetSubtilePriority(id: Int, coord: Vector2): Int {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotileGetSubtilePriority.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun autotileGetZIndex(id: Int, coord: Vector2): Int {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotileGetZIndex.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun autotileSetBitmask(
    id: Int,
    bitmask: Vector2,
    flag: Int
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(bitmask)
    _args.append(flag)
    __method_bind.autotileSetBitmask.call(this._handle, _args.toVariant(), 3)
  }

  fun autotileSetBitmaskMode(id: Int, mode: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(mode)
    __method_bind.autotileSetBitmaskMode.call(this._handle, _args.toVariant(), 2)
  }

  fun autotileSetIconCoordinate(id: Int, coord: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    __method_bind.autotileSetIconCoordinate.call(this._handle, _args.toVariant(), 2)
  }

  fun autotileSetLightOccluder(
    id: Int,
    lightOccluder: OccluderPolygon2D,
    coord: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(lightOccluder)
    _args.append(coord)
    __method_bind.autotileSetLightOccluder.call(this._handle, _args.toVariant(), 3)
  }

  fun autotileSetNavigationPolygon(
    id: Int,
    navigationPolygon: NavigationPolygon,
    coord: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(navigationPolygon)
    _args.append(coord)
    __method_bind.autotileSetNavigationPolygon.call(this._handle, _args.toVariant(), 3)
  }

  fun autotileSetSize(id: Int, size: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(size)
    __method_bind.autotileSetSize.call(this._handle, _args.toVariant(), 2)
  }

  fun autotileSetSpacing(id: Int, spacing: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(spacing)
    __method_bind.autotileSetSpacing.call(this._handle, _args.toVariant(), 2)
  }

  fun autotileSetSubtilePriority(
    id: Int,
    coord: Vector2,
    priority: Int
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    _args.append(priority)
    __method_bind.autotileSetSubtilePriority.call(this._handle, _args.toVariant(), 3)
  }

  fun autotileSetZIndex(
    id: Int,
    coord: Vector2,
    zIndex: Int
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    _args.append(zIndex)
    __method_bind.autotileSetZIndex.call(this._handle, _args.toVariant(), 3)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun createTile(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.createTile.call(this._handle, _arg, 1)
  }

  fun findTileByName(name: String): Int {
    val _arg = Variant.new(name)
    val _ret = __method_bind.findTileByName.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getLastUnusedTileId(): Int {
    val _ret = __method_bind.getLastUnusedTileId.call(this._handle)
    return _ret.asInt()
  }

  fun getTilesIds(): VariantArray {
    val _ret = __method_bind.getTilesIds.call(this._handle)
    return _ret.asVariantArray()
  }

  fun removeTile(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.removeTile.call(this._handle, _arg, 1)
  }

  fun tileAddShape(
    id: Int,
    shape: Shape2D,
    shapeTransform: Transform2D,
    oneWay: Boolean,
    autotileCoord: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shape)
    _args.append(shapeTransform)
    _args.append(oneWay)
    _args.append(autotileCoord)
    __method_bind.tileAddShape.call(this._handle, _args.toVariant(), 5)
  }

  fun tileGetLightOccluder(id: Int): OccluderPolygon2D {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetLightOccluder.call(this._handle, _arg, 1)
    return _ret.asObject(::OccluderPolygon2D)!!
  }

  fun tileGetMaterial(id: Int): ShaderMaterial {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetMaterial.call(this._handle, _arg, 1)
    return _ret.asObject(::ShaderMaterial)!!
  }

  fun tileGetModulate(id: Int): Color {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetModulate.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun tileGetName(id: Int): String {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetName.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun tileGetNavigationPolygon(id: Int): NavigationPolygon {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetNavigationPolygon.call(this._handle, _arg, 1)
    return _ret.asObject(::NavigationPolygon)!!
  }

  fun tileGetNavigationPolygonOffset(id: Int): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetNavigationPolygonOffset.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun tileGetNormalMap(id: Int): Texture {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetNormalMap.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun tileGetOccluderOffset(id: Int): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetOccluderOffset.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun tileGetRegion(id: Int): Rect2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetRegion.call(this._handle, _arg, 1)
    return _ret.asRect2()
  }

  fun tileGetShape(id: Int, shapeId: Int): Shape2D {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    val _ret = __method_bind.tileGetShape.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Shape2D)!!
  }

  fun tileGetShapeCount(id: Int): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetShapeCount.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun tileGetShapeOffset(id: Int, shapeId: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    val _ret = __method_bind.tileGetShapeOffset.call(this._handle, _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun tileGetShapeOneWay(id: Int, shapeId: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    val _ret = __method_bind.tileGetShapeOneWay.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun tileGetShapeOneWayMargin(id: Int, shapeId: Int): Float {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    val _ret = __method_bind.tileGetShapeOneWayMargin.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun tileGetShapeTransform(id: Int, shapeId: Int): Transform2D {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    val _ret = __method_bind.tileGetShapeTransform.call(this._handle, _args.toVariant(), 2)
    return _ret.asTransform2D()
  }

  fun tileGetShapes(id: Int): VariantArray {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetShapes.call(this._handle, _arg, 1)
    return _ret.asVariantArray()
  }

  fun tileGetTexture(id: Int): Texture {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetTexture.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun tileGetTextureOffset(id: Int): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetTextureOffset.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun tileGetTileMode(id: Int): TileMode {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetTileMode.call(this._handle, _arg, 1)
    return TileSet.TileMode.from(_ret.asInt())
  }

  fun tileGetZIndex(id: Int): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetZIndex.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun tileSetLightOccluder(id: Int, lightOccluder: OccluderPolygon2D) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(lightOccluder)
    __method_bind.tileSetLightOccluder.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetMaterial(id: Int, material: ShaderMaterial) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(material)
    __method_bind.tileSetMaterial.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetModulate(id: Int, color: Color) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(color)
    __method_bind.tileSetModulate.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetName(id: Int, name: String) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(name)
    __method_bind.tileSetName.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetNavigationPolygon(id: Int, navigationPolygon: NavigationPolygon) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(navigationPolygon)
    __method_bind.tileSetNavigationPolygon.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetNavigationPolygonOffset(id: Int, navigationPolygonOffset: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(navigationPolygonOffset)
    __method_bind.tileSetNavigationPolygonOffset.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetNormalMap(id: Int, normalMap: Texture) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(normalMap)
    __method_bind.tileSetNormalMap.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetOccluderOffset(id: Int, occluderOffset: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(occluderOffset)
    __method_bind.tileSetOccluderOffset.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetRegion(id: Int, region: Rect2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(region)
    __method_bind.tileSetRegion.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetShape(
    id: Int,
    shapeId: Int,
    shape: Shape2D
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    _args.append(shape)
    __method_bind.tileSetShape.call(this._handle, _args.toVariant(), 3)
  }

  fun tileSetShapeOffset(
    id: Int,
    shapeId: Int,
    shapeOffset: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    _args.append(shapeOffset)
    __method_bind.tileSetShapeOffset.call(this._handle, _args.toVariant(), 3)
  }

  fun tileSetShapeOneWay(
    id: Int,
    shapeId: Int,
    oneWay: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    _args.append(oneWay)
    __method_bind.tileSetShapeOneWay.call(this._handle, _args.toVariant(), 3)
  }

  fun tileSetShapeOneWayMargin(
    id: Int,
    shapeId: Int,
    oneWay: Float
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    _args.append(oneWay)
    __method_bind.tileSetShapeOneWayMargin.call(this._handle, _args.toVariant(), 3)
  }

  fun tileSetShapeTransform(
    id: Int,
    shapeId: Int,
    shapeTransform: Transform2D
  ) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    _args.append(shapeTransform)
    __method_bind.tileSetShapeTransform.call(this._handle, _args.toVariant(), 3)
  }

  fun tileSetShapes(id: Int, shapes: VariantArray) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapes)
    __method_bind.tileSetShapes.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetTexture(id: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(texture)
    __method_bind.tileSetTexture.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetTextureOffset(id: Int, textureOffset: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(textureOffset)
    __method_bind.tileSetTextureOffset.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetTileMode(id: Int, tilemode: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(tilemode)
    __method_bind.tileSetTileMode.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetZIndex(id: Int, zIndex: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(zIndex)
    __method_bind.tileSetZIndex.call(this._handle, _args.toVariant(), 2)
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
    BITMASK_2X2(0),

    BITMASK_3X3_MINIMAL(1),

    BITMASK_3X3(2);

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
    val ATLAS_TILE: Int = 2

    val AUTO_TILE: Int = 1

    val BIND_BOTTOM: Int = 128

    val BIND_BOTTOMLEFT: Int = 64

    val BIND_BOTTOMRIGHT: Int = 256

    val BIND_LEFT: Int = 8

    val BIND_RIGHT: Int = 32

    val BIND_TOP: Int = 2

    val BIND_TOPLEFT: Int = 1

    val BIND_TOPRIGHT: Int = 4

    val BITMASK_2X2: Int = 0

    val BITMASK_3X3: Int = 2

    val BITMASK_3X3_MINIMAL: Int = 1

    val SINGLE_TILE: Int = 0

    fun new(): TileSet = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TileSet".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for TileSet" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TileSet(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): TileSet = TileSet(ptr)
    /**
     * Container for method_bind pointers for TileSet
     */
    private object __method_bind {
      val autotileClearBitmaskMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileClearBitmaskMap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileClearBitmaskMap" }
        }
      val autotileGetBitmask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileGetBitmask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileGetBitmask" }
        }
      val autotileGetBitmaskMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileGetBitmaskMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileGetBitmaskMode" }
        }
      val autotileGetIconCoordinate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileGetIconCoordinate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileGetIconCoordinate" }
        }
      val autotileGetLightOccluder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileGetLightOccluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileGetLightOccluder" }
        }
      val autotileGetNavigationPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileGetNavigationPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileGetNavigationPolygon" }
        }
      val autotileGetSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileGetSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileGetSize" }
        }
      val autotileGetSpacing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileGetSpacing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileGetSpacing" }
        }
      val autotileGetSubtilePriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileGetSubtilePriority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileGetSubtilePriority" }
        }
      val autotileGetZIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileGetZIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileGetZIndex" }
        }
      val autotileSetBitmask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileSetBitmask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileSetBitmask" }
        }
      val autotileSetBitmaskMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileSetBitmaskMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileSetBitmaskMode" }
        }
      val autotileSetIconCoordinate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileSetIconCoordinate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileSetIconCoordinate" }
        }
      val autotileSetLightOccluder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileSetLightOccluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileSetLightOccluder" }
        }
      val autotileSetNavigationPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileSetNavigationPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileSetNavigationPolygon" }
        }
      val autotileSetSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileSetSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileSetSize" }
        }
      val autotileSetSpacing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileSetSpacing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileSetSpacing" }
        }
      val autotileSetSubtilePriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileSetSubtilePriority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileSetSubtilePriority" }
        }
      val autotileSetZIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotileSetZIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotileSetZIndex" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val createTile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "createTile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createTile" }
        }
      val findTileByName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "findTileByName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method findTileByName" }
        }
      val getLastUnusedTileId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "getLastUnusedTileId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLastUnusedTileId" }
        }
      val getTilesIds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "getTilesIds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTilesIds" }
        }
      val removeTile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "removeTile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeTile" }
        }
      val tileAddShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileAddShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileAddShape" }
        }
      val tileGetLightOccluder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetLightOccluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetLightOccluder" }
        }
      val tileGetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetMaterial" }
        }
      val tileGetModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetModulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetModulate" }
        }
      val tileGetName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetName" }
        }
      val tileGetNavigationPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetNavigationPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetNavigationPolygon" }
        }
      val tileGetNavigationPolygonOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetNavigationPolygonOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetNavigationPolygonOffset" }
        }
      val tileGetNormalMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetNormalMap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetNormalMap" }
        }
      val tileGetOccluderOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetOccluderOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetOccluderOffset" }
        }
      val tileGetRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetRegion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetRegion" }
        }
      val tileGetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetShape" }
        }
      val tileGetShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetShapeCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetShapeCount" }
        }
      val tileGetShapeOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetShapeOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetShapeOffset" }
        }
      val tileGetShapeOneWay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetShapeOneWay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetShapeOneWay" }
        }
      val tileGetShapeOneWayMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetShapeOneWayMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetShapeOneWayMargin" }
        }
      val tileGetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetShapeTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetShapeTransform" }
        }
      val tileGetShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetShapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetShapes" }
        }
      val tileGetTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetTexture" }
        }
      val tileGetTextureOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetTextureOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetTextureOffset" }
        }
      val tileGetTileMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetTileMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetTileMode" }
        }
      val tileGetZIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileGetZIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileGetZIndex" }
        }
      val tileSetLightOccluder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetLightOccluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetLightOccluder" }
        }
      val tileSetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetMaterial" }
        }
      val tileSetModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetModulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetModulate" }
        }
      val tileSetName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetName" }
        }
      val tileSetNavigationPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetNavigationPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetNavigationPolygon" }
        }
      val tileSetNavigationPolygonOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetNavigationPolygonOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetNavigationPolygonOffset" }
        }
      val tileSetNormalMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetNormalMap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetNormalMap" }
        }
      val tileSetOccluderOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetOccluderOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetOccluderOffset" }
        }
      val tileSetRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetRegion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetRegion" }
        }
      val tileSetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetShape" }
        }
      val tileSetShapeOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetShapeOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetShapeOffset" }
        }
      val tileSetShapeOneWay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetShapeOneWay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetShapeOneWay" }
        }
      val tileSetShapeOneWayMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetShapeOneWayMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetShapeOneWayMargin" }
        }
      val tileSetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetShapeTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetShapeTransform" }
        }
      val tileSetShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetShapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetShapes" }
        }
      val tileSetTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetTexture" }
        }
      val tileSetTextureOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetTextureOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetTextureOffset" }
        }
      val tileSetTileMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetTileMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetTileMode" }
        }
      val tileSetZIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tileSetZIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tileSetZIndex" }
        }}
  }
}
