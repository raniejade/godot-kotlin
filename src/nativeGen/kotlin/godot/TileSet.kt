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

open class TileSet internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun autotileClearBitmaskMap(id: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.autotile_clear_bitmask_map.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun autotileGetBitmask(id: Int, coord: Vector2): Int {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotile_get_bitmask.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun autotileGetBitmaskMode(id: Int): BitmaskMode {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.autotile_get_bitmask_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun autotileGetIconCoordinate(id: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.autotile_get_icon_coordinate.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun autotileGetLightOccluder(id: Int, coord: Vector2): OccluderPolygon2D {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotile_get_light_occluder.call(this.toVariant(), _args.toVariant(),
        2)
    TODO()
  }

  fun autotileGetNavigationPolygon(id: Int, coord: Vector2): NavigationPolygon {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotile_get_navigation_polygon.call(this.toVariant(),
        _args.toVariant(), 2)
    TODO()
  }

  fun autotileGetSize(id: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.autotile_get_size.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun autotileGetSpacing(id: Int): Int {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.autotile_get_spacing.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun autotileGetSubtilePriority(id: Int, coord: Vector2): Int {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotile_get_subtile_priority.call(this.toVariant(), _args.toVariant(),
        2)
    TODO()
  }

  fun autotileGetZIndex(id: Int, coord: Vector2): Int {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotile_get_z_index.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
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
    val _ret = __method_bind.autotile_set_bitmask.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun autotileSetBitmaskMode(id: Int, mode: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(mode)
    val _ret = __method_bind.autotile_set_bitmask_mode.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun autotileSetIconCoordinate(id: Int, coord: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotile_set_icon_coordinate.call(this.toVariant(), _args.toVariant(),
        2)
    TODO()
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
    val _ret = __method_bind.autotile_set_light_occluder.call(this.toVariant(), _args.toVariant(),
        3)
    TODO()
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
    val _ret = __method_bind.autotile_set_navigation_polygon.call(this.toVariant(),
        _args.toVariant(), 3)
    TODO()
  }

  fun autotileSetSize(id: Int, size: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(size)
    val _ret = __method_bind.autotile_set_size.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun autotileSetSpacing(id: Int, spacing: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(spacing)
    val _ret = __method_bind.autotile_set_spacing.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
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
    val _ret = __method_bind.autotile_set_subtile_priority.call(this.toVariant(), _args.toVariant(),
        3)
    TODO()
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
    val _ret = __method_bind.autotile_set_z_index.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun clear() {
    val _ret = __method_bind.clear.call(this.toVariant())
    TODO()
  }

  fun createTile(id: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.create_tile.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun findTileByName(name: String): Int {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.find_tile_by_name.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getLastUnusedTileId(): Int {
    val _ret = __method_bind.get_last_unused_tile_id.call(this.toVariant())
    TODO()
  }

  fun getTilesIds(): VariantArray {
    val _ret = __method_bind.get_tiles_ids.call(this.toVariant())
    TODO()
  }

  fun removeTile(id: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.remove_tile.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
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
    val _ret = __method_bind.tile_add_shape.call(this.toVariant(), _args.toVariant(), 5)
    TODO()
  }

  fun tileGetLightOccluder(id: Int): OccluderPolygon2D {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.tile_get_light_occluder.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun tileGetMaterial(id: Int): ShaderMaterial {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.tile_get_material.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun tileGetModulate(id: Int): Color {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.tile_get_modulate.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun tileGetName(id: Int): String {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.tile_get_name.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun tileGetNavigationPolygon(id: Int): NavigationPolygon {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.tile_get_navigation_polygon.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun tileGetNavigationPolygonOffset(id: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.tile_get_navigation_polygon_offset.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  fun tileGetNormalMap(id: Int): Texture {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.tile_get_normal_map.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun tileGetOccluderOffset(id: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.tile_get_occluder_offset.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun tileGetRegion(id: Int): Rect2 {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.tile_get_region.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun tileGetShape(id: Int, shapeId: Int): Shape2D {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    val _ret = __method_bind.tile_get_shape.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun tileGetShapeCount(id: Int): Int {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.tile_get_shape_count.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun tileGetShapeOffset(id: Int, shapeId: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    val _ret = __method_bind.tile_get_shape_offset.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun tileGetShapeOneWay(id: Int, shapeId: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    val _ret = __method_bind.tile_get_shape_one_way.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun tileGetShapeOneWayMargin(id: Int, shapeId: Int): Float {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    val _ret = __method_bind.tile_get_shape_one_way_margin.call(this.toVariant(), _args.toVariant(),
        2)
    TODO()
  }

  fun tileGetShapeTransform(id: Int, shapeId: Int): Transform2D {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    val _ret = __method_bind.tile_get_shape_transform.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun tileGetShapes(id: Int): VariantArray {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.tile_get_shapes.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun tileGetTexture(id: Int): Texture {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.tile_get_texture.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun tileGetTextureOffset(id: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.tile_get_texture_offset.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun tileGetTileMode(id: Int): TileMode {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.tile_get_tile_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun tileGetZIndex(id: Int): Int {
    val _args = VariantArray.new()
    _args.append(id)
    val _ret = __method_bind.tile_get_z_index.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun tileSetLightOccluder(id: Int, lightOccluder: OccluderPolygon2D) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(lightOccluder)
    val _ret = __method_bind.tile_set_light_occluder.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun tileSetMaterial(id: Int, material: ShaderMaterial) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(material)
    val _ret = __method_bind.tile_set_material.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun tileSetModulate(id: Int, color: Color) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(color)
    val _ret = __method_bind.tile_set_modulate.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun tileSetName(id: Int, name: String) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(name)
    val _ret = __method_bind.tile_set_name.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun tileSetNavigationPolygon(id: Int, navigationPolygon: NavigationPolygon) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(navigationPolygon)
    val _ret = __method_bind.tile_set_navigation_polygon.call(this.toVariant(), _args.toVariant(),
        2)
    TODO()
  }

  fun tileSetNavigationPolygonOffset(id: Int, navigationPolygonOffset: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(navigationPolygonOffset)
    val _ret = __method_bind.tile_set_navigation_polygon_offset.call(this.toVariant(),
        _args.toVariant(), 2)
    TODO()
  }

  fun tileSetNormalMap(id: Int, normalMap: Texture) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(normalMap)
    val _ret = __method_bind.tile_set_normal_map.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun tileSetOccluderOffset(id: Int, occluderOffset: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(occluderOffset)
    val _ret = __method_bind.tile_set_occluder_offset.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun tileSetRegion(id: Int, region: Rect2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(region)
    val _ret = __method_bind.tile_set_region.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
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
    val _ret = __method_bind.tile_set_shape.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
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
    val _ret = __method_bind.tile_set_shape_offset.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
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
    val _ret = __method_bind.tile_set_shape_one_way.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
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
    val _ret = __method_bind.tile_set_shape_one_way_margin.call(this.toVariant(), _args.toVariant(),
        3)
    TODO()
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
    val _ret = __method_bind.tile_set_shape_transform.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun tileSetShapes(id: Int, shapes: VariantArray) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapes)
    val _ret = __method_bind.tile_set_shapes.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun tileSetTexture(id: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(texture)
    val _ret = __method_bind.tile_set_texture.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun tileSetTextureOffset(id: Int, textureOffset: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(textureOffset)
    val _ret = __method_bind.tile_set_texture_offset.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun tileSetTileMode(id: Int, tilemode: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(tilemode)
    val _ret = __method_bind.tile_set_tile_mode.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun tileSetZIndex(id: Int, zIndex: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(zIndex)
    val _ret = __method_bind.tile_set_z_index.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
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
      requireNotNull(fnPtr) { "No instance found for singleton TileSet" }
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
      val autotile_clear_bitmask_map: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_clear_bitmask_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_clear_bitmask_map" }
            }
          }

      val autotile_get_bitmask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_get_bitmask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_get_bitmask" }
            }
          }

      val autotile_get_bitmask_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_get_bitmask_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_get_bitmask_mode" }
            }
          }

      val autotile_get_icon_coordinate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_get_icon_coordinate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_get_icon_coordinate" }
            }
          }

      val autotile_get_light_occluder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_get_light_occluder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_get_light_occluder" }
            }
          }

      val autotile_get_navigation_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_get_navigation_polygon".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method autotile_get_navigation_polygon" }
            }
          }

      val autotile_get_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_get_size" }
            }
          }

      val autotile_get_spacing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_get_spacing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_get_spacing" }
            }
          }

      val autotile_get_subtile_priority: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_get_subtile_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_get_subtile_priority"
              }
            }
          }

      val autotile_get_z_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_get_z_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_get_z_index" }
            }
          }

      val autotile_set_bitmask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_set_bitmask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_set_bitmask" }
            }
          }

      val autotile_set_bitmask_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_set_bitmask_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_set_bitmask_mode" }
            }
          }

      val autotile_set_icon_coordinate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_set_icon_coordinate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_set_icon_coordinate" }
            }
          }

      val autotile_set_light_occluder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_set_light_occluder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_set_light_occluder" }
            }
          }

      val autotile_set_navigation_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_set_navigation_polygon".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method autotile_set_navigation_polygon" }
            }
          }

      val autotile_set_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_set_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_set_size" }
            }
          }

      val autotile_set_spacing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_set_spacing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_set_spacing" }
            }
          }

      val autotile_set_subtile_priority: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_set_subtile_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_set_subtile_priority"
              }
            }
          }

      val autotile_set_z_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "autotile_set_z_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method autotile_set_z_index" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val create_tile: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "create_tile".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_tile" }
            }
          }

      val find_tile_by_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "find_tile_by_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_tile_by_name" }
            }
          }

      val get_last_unused_tile_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "get_last_unused_tile_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_last_unused_tile_id" }
            }
          }

      val get_tiles_ids: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "get_tiles_ids".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tiles_ids" }
            }
          }

      val remove_tile: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "remove_tile".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_tile" }
            }
          }

      val tile_add_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_add_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_add_shape" }
            }
          }

      val tile_get_light_occluder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_light_occluder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_light_occluder" }
            }
          }

      val tile_get_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_material" }
            }
          }

      val tile_get_modulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_modulate" }
            }
          }

      val tile_get_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_name" }
            }
          }

      val tile_get_navigation_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_navigation_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_navigation_polygon" }
            }
          }

      val tile_get_navigation_polygon_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_navigation_polygon_offset".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method tile_get_navigation_polygon_offset" }
            }
          }

      val tile_get_normal_map: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_normal_map" }
            }
          }

      val tile_get_occluder_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_occluder_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_occluder_offset" }
            }
          }

      val tile_get_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_region" }
            }
          }

      val tile_get_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_shape" }
            }
          }

      val tile_get_shape_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_shape_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_shape_count" }
            }
          }

      val tile_get_shape_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_shape_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_shape_offset" }
            }
          }

      val tile_get_shape_one_way: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_shape_one_way".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_shape_one_way" }
            }
          }

      val tile_get_shape_one_way_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_shape_one_way_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_shape_one_way_margin"
              }
            }
          }

      val tile_get_shape_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_shape_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_shape_transform" }
            }
          }

      val tile_get_shapes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_shapes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_shapes" }
            }
          }

      val tile_get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_texture" }
            }
          }

      val tile_get_texture_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_texture_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_texture_offset" }
            }
          }

      val tile_get_tile_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_tile_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_tile_mode" }
            }
          }

      val tile_get_z_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_get_z_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_get_z_index" }
            }
          }

      val tile_set_light_occluder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_light_occluder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_light_occluder" }
            }
          }

      val tile_set_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_material" }
            }
          }

      val tile_set_modulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_modulate" }
            }
          }

      val tile_set_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_name" }
            }
          }

      val tile_set_navigation_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_navigation_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_navigation_polygon" }
            }
          }

      val tile_set_navigation_polygon_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_navigation_polygon_offset".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method tile_set_navigation_polygon_offset" }
            }
          }

      val tile_set_normal_map: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_normal_map" }
            }
          }

      val tile_set_occluder_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_occluder_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_occluder_offset" }
            }
          }

      val tile_set_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_region" }
            }
          }

      val tile_set_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_shape" }
            }
          }

      val tile_set_shape_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_shape_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_shape_offset" }
            }
          }

      val tile_set_shape_one_way: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_shape_one_way".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_shape_one_way" }
            }
          }

      val tile_set_shape_one_way_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_shape_one_way_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_shape_one_way_margin"
              }
            }
          }

      val tile_set_shape_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_shape_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_shape_transform" }
            }
          }

      val tile_set_shapes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_shapes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_shapes" }
            }
          }

      val tile_set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_texture" }
            }
          }

      val tile_set_texture_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_texture_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_texture_offset" }
            }
          }

      val tile_set_tile_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_tile_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_tile_mode" }
            }
          }

      val tile_set_z_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "tile_set_z_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method tile_set_z_index" }
            }
          }
    }
  }
}
