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
    val _arg = Variant.new(id)
    __method_bind.autotile_clear_bitmask_map.call(this._handle, _arg, 1)
  }

  fun autotileGetBitmask(id: Int, coord: Vector2): Int {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotile_get_bitmask.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun autotileGetBitmaskMode(id: Int): BitmaskMode {
    val _arg = Variant.new(id)
    val _ret = __method_bind.autotile_get_bitmask_mode.call(this._handle, _arg, 1)
    return TileSet.BitmaskMode.from(_ret.asInt())
  }

  fun autotileGetIconCoordinate(id: Int): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.autotile_get_icon_coordinate.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun autotileGetLightOccluder(id: Int, coord: Vector2): OccluderPolygon2D {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotile_get_light_occluder.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::OccluderPolygon2D)!!
  }

  fun autotileGetNavigationPolygon(id: Int, coord: Vector2): NavigationPolygon {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotile_get_navigation_polygon.call(this._handle, _args.toVariant(),
        2)
    return _ret.asObject(::NavigationPolygon)!!
  }

  fun autotileGetSize(id: Int): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.autotile_get_size.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun autotileGetSpacing(id: Int): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.autotile_get_spacing.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun autotileGetSubtilePriority(id: Int, coord: Vector2): Int {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotile_get_subtile_priority.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun autotileGetZIndex(id: Int, coord: Vector2): Int {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    val _ret = __method_bind.autotile_get_z_index.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.autotile_set_bitmask.call(this._handle, _args.toVariant(), 3)
  }

  fun autotileSetBitmaskMode(id: Int, mode: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(mode)
    __method_bind.autotile_set_bitmask_mode.call(this._handle, _args.toVariant(), 2)
  }

  fun autotileSetIconCoordinate(id: Int, coord: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(coord)
    __method_bind.autotile_set_icon_coordinate.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.autotile_set_light_occluder.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.autotile_set_navigation_polygon.call(this._handle, _args.toVariant(), 3)
  }

  fun autotileSetSize(id: Int, size: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(size)
    __method_bind.autotile_set_size.call(this._handle, _args.toVariant(), 2)
  }

  fun autotileSetSpacing(id: Int, spacing: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(spacing)
    __method_bind.autotile_set_spacing.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.autotile_set_subtile_priority.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.autotile_set_z_index.call(this._handle, _args.toVariant(), 3)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun createTile(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.create_tile.call(this._handle, _arg, 1)
  }

  fun findTileByName(name: String): Int {
    val _arg = Variant.new(name)
    val _ret = __method_bind.find_tile_by_name.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getLastUnusedTileId(): Int {
    val _ret = __method_bind.get_last_unused_tile_id.call(this._handle)
    return _ret.asInt()
  }

  fun getTilesIds(): VariantArray {
    val _ret = __method_bind.get_tiles_ids.call(this._handle)
    return _ret.asArray()
  }

  fun removeTile(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.remove_tile.call(this._handle, _arg, 1)
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
    __method_bind.tile_add_shape.call(this._handle, _args.toVariant(), 5)
  }

  fun tileGetLightOccluder(id: Int): OccluderPolygon2D {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tile_get_light_occluder.call(this._handle, _arg, 1)
    return _ret.asObject(::OccluderPolygon2D)!!
  }

  fun tileGetMaterial(id: Int): ShaderMaterial {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tile_get_material.call(this._handle, _arg, 1)
    return _ret.asObject(::ShaderMaterial)!!
  }

  fun tileGetModulate(id: Int): Color {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tile_get_modulate.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun tileGetName(id: Int): String {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tile_get_name.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun tileGetNavigationPolygon(id: Int): NavigationPolygon {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tile_get_navigation_polygon.call(this._handle, _arg, 1)
    return _ret.asObject(::NavigationPolygon)!!
  }

  fun tileGetNavigationPolygonOffset(id: Int): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tile_get_navigation_polygon_offset.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun tileGetNormalMap(id: Int): Texture {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tile_get_normal_map.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun tileGetOccluderOffset(id: Int): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tile_get_occluder_offset.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun tileGetRegion(id: Int): Rect2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tile_get_region.call(this._handle, _arg, 1)
    return _ret.asRect2()
  }

  fun tileGetShape(id: Int, shapeId: Int): Shape2D {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    val _ret = __method_bind.tile_get_shape.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Shape2D)!!
  }

  fun tileGetShapeCount(id: Int): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tile_get_shape_count.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun tileGetShapeOffset(id: Int, shapeId: Int): Vector2 {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    val _ret = __method_bind.tile_get_shape_offset.call(this._handle, _args.toVariant(), 2)
    return _ret.asVector2()
  }

  fun tileGetShapeOneWay(id: Int, shapeId: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    val _ret = __method_bind.tile_get_shape_one_way.call(this._handle, _args.toVariant(), 2)
    return _ret.asBool()
  }

  fun tileGetShapeOneWayMargin(id: Int, shapeId: Int): Float {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    val _ret = __method_bind.tile_get_shape_one_way_margin.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun tileGetShapeTransform(id: Int, shapeId: Int): Transform2D {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapeId)
    val _ret = __method_bind.tile_get_shape_transform.call(this._handle, _args.toVariant(), 2)
    return _ret.asTransform2D()
  }

  fun tileGetShapes(id: Int): VariantArray {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tile_get_shapes.call(this._handle, _arg, 1)
    return _ret.asArray()
  }

  fun tileGetTexture(id: Int): Texture {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tile_get_texture.call(this._handle, _arg, 1)
    return _ret.asObject(::Texture)!!
  }

  fun tileGetTextureOffset(id: Int): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tile_get_texture_offset.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun tileGetTileMode(id: Int): TileMode {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tile_get_tile_mode.call(this._handle, _arg, 1)
    return TileSet.TileMode.from(_ret.asInt())
  }

  fun tileGetZIndex(id: Int): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tile_get_z_index.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun tileSetLightOccluder(id: Int, lightOccluder: OccluderPolygon2D) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(lightOccluder)
    __method_bind.tile_set_light_occluder.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetMaterial(id: Int, material: ShaderMaterial) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(material)
    __method_bind.tile_set_material.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetModulate(id: Int, color: Color) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(color)
    __method_bind.tile_set_modulate.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetName(id: Int, name: String) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(name)
    __method_bind.tile_set_name.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetNavigationPolygon(id: Int, navigationPolygon: NavigationPolygon) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(navigationPolygon)
    __method_bind.tile_set_navigation_polygon.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetNavigationPolygonOffset(id: Int, navigationPolygonOffset: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(navigationPolygonOffset)
    __method_bind.tile_set_navigation_polygon_offset.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetNormalMap(id: Int, normalMap: Texture) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(normalMap)
    __method_bind.tile_set_normal_map.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetOccluderOffset(id: Int, occluderOffset: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(occluderOffset)
    __method_bind.tile_set_occluder_offset.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetRegion(id: Int, region: Rect2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(region)
    __method_bind.tile_set_region.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.tile_set_shape.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.tile_set_shape_offset.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.tile_set_shape_one_way.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.tile_set_shape_one_way_margin.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.tile_set_shape_transform.call(this._handle, _args.toVariant(), 3)
  }

  fun tileSetShapes(id: Int, shapes: VariantArray) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(shapes)
    __method_bind.tile_set_shapes.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetTexture(id: Int, texture: Texture) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(texture)
    __method_bind.tile_set_texture.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetTextureOffset(id: Int, textureOffset: Vector2) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(textureOffset)
    __method_bind.tile_set_texture_offset.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetTileMode(id: Int, tilemode: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(tilemode)
    __method_bind.tile_set_tile_mode.call(this._handle, _args.toVariant(), 2)
  }

  fun tileSetZIndex(id: Int, zIndex: Int) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(zIndex)
    __method_bind.tile_set_z_index.call(this._handle, _args.toVariant(), 2)
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
      val autotile_clear_bitmask_map: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_clear_bitmask_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_clear_bitmask_map" }
        }
      val autotile_get_bitmask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_bitmask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_bitmask" }
        }
      val autotile_get_bitmask_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_bitmask_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_bitmask_mode" }
        }
      val autotile_get_icon_coordinate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_icon_coordinate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_icon_coordinate" }
        }
      val autotile_get_light_occluder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_light_occluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_light_occluder" }
        }
      val autotile_get_navigation_polygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_navigation_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_navigation_polygon" }
        }
      val autotile_get_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_size" }
        }
      val autotile_get_spacing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_spacing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_spacing" }
        }
      val autotile_get_subtile_priority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_subtile_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_subtile_priority" }
        }
      val autotile_get_z_index: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_z_index" }
        }
      val autotile_set_bitmask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_bitmask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_bitmask" }
        }
      val autotile_set_bitmask_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_bitmask_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_bitmask_mode" }
        }
      val autotile_set_icon_coordinate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_icon_coordinate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_icon_coordinate" }
        }
      val autotile_set_light_occluder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_light_occluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_light_occluder" }
        }
      val autotile_set_navigation_polygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_navigation_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_navigation_polygon" }
        }
      val autotile_set_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_size" }
        }
      val autotile_set_spacing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_spacing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_spacing" }
        }
      val autotile_set_subtile_priority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_subtile_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_subtile_priority" }
        }
      val autotile_set_z_index: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_z_index" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val create_tile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "create_tile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_tile" }
        }
      val find_tile_by_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "find_tile_by_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_tile_by_name" }
        }
      val get_last_unused_tile_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "get_last_unused_tile_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_last_unused_tile_id" }
        }
      val get_tiles_ids: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "get_tiles_ids".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tiles_ids" }
        }
      val remove_tile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "remove_tile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_tile" }
        }
      val tile_add_shape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_add_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_add_shape" }
        }
      val tile_get_light_occluder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_light_occluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_light_occluder" }
        }
      val tile_get_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_material" }
        }
      val tile_get_modulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_modulate" }
        }
      val tile_get_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_name" }
        }
      val tile_get_navigation_polygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_navigation_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_navigation_polygon" }
        }
      val tile_get_navigation_polygon_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_navigation_polygon_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_navigation_polygon_offset"
            }
        }
      val tile_get_normal_map: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_normal_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_normal_map" }
        }
      val tile_get_occluder_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_occluder_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_occluder_offset" }
        }
      val tile_get_region: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_region" }
        }
      val tile_get_shape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape" }
        }
      val tile_get_shape_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape_count" }
        }
      val tile_get_shape_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape_offset" }
        }
      val tile_get_shape_one_way: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape_one_way".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape_one_way" }
        }
      val tile_get_shape_one_way_margin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape_one_way_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape_one_way_margin" }
        }
      val tile_get_shape_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape_transform" }
        }
      val tile_get_shapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shapes" }
        }
      val tile_get_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_texture" }
        }
      val tile_get_texture_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_texture_offset" }
        }
      val tile_get_tile_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_tile_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_tile_mode" }
        }
      val tile_get_z_index: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_z_index" }
        }
      val tile_set_light_occluder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_light_occluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_light_occluder" }
        }
      val tile_set_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_material" }
        }
      val tile_set_modulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_modulate" }
        }
      val tile_set_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_name" }
        }
      val tile_set_navigation_polygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_navigation_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_navigation_polygon" }
        }
      val tile_set_navigation_polygon_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_navigation_polygon_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_navigation_polygon_offset"
            }
        }
      val tile_set_normal_map: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_normal_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_normal_map" }
        }
      val tile_set_occluder_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_occluder_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_occluder_offset" }
        }
      val tile_set_region: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_region" }
        }
      val tile_set_shape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shape" }
        }
      val tile_set_shape_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shape_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shape_offset" }
        }
      val tile_set_shape_one_way: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shape_one_way".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shape_one_way" }
        }
      val tile_set_shape_one_way_margin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shape_one_way_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shape_one_way_margin" }
        }
      val tile_set_shape_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shape_transform" }
        }
      val tile_set_shapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shapes" }
        }
      val tile_set_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_texture" }
        }
      val tile_set_texture_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_texture_offset" }
        }
      val tile_set_tile_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_tile_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_tile_mode" }
        }
      val tile_set_z_index: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_z_index" }
        }}
  }
}
