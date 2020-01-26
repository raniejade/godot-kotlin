// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Rect2
import godot.core.Transform2D
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
  fun forwardAtlasSubtileSelection(): Vector2 {
    TODO()
  }

  fun forwardSubtileSelection(): Vector2 {
    TODO()
  }

  fun isTileBound(): Boolean {
    TODO()
  }

  fun autotileClearBitmaskMap() {
    TODO()
  }

  fun autotileGetBitmask(): Int {
    TODO()
  }

  fun autotileGetBitmaskMode(): TileSet.BitmaskMode {
    TODO()
  }

  fun autotileGetIconCoordinate(): Vector2 {
    TODO()
  }

  fun autotileGetLightOccluder(): OccluderPolygon2D {
    TODO()
  }

  fun autotileGetNavigationPolygon(): NavigationPolygon {
    TODO()
  }

  fun autotileGetSize(): Vector2 {
    TODO()
  }

  fun autotileGetSpacing(): Int {
    TODO()
  }

  fun autotileGetSubtilePriority(): Int {
    TODO()
  }

  fun autotileGetZIndex(): Int {
    TODO()
  }

  fun autotileSetBitmask() {
    TODO()
  }

  fun autotileSetBitmaskMode() {
    TODO()
  }

  fun autotileSetIconCoordinate() {
    TODO()
  }

  fun autotileSetLightOccluder() {
    TODO()
  }

  fun autotileSetNavigationPolygon() {
    TODO()
  }

  fun autotileSetSize() {
    TODO()
  }

  fun autotileSetSpacing() {
    TODO()
  }

  fun autotileSetSubtilePriority() {
    TODO()
  }

  fun autotileSetZIndex() {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun createTile() {
    TODO()
  }

  fun findTileByName(): Int {
    TODO()
  }

  fun getLastUnusedTileId(): Int {
    TODO()
  }

  fun getTilesIds(): VariantArray {
    TODO()
  }

  fun removeTile() {
    TODO()
  }

  fun tileAddShape() {
    TODO()
  }

  fun tileGetLightOccluder(): OccluderPolygon2D {
    TODO()
  }

  fun tileGetMaterial(): ShaderMaterial {
    TODO()
  }

  fun tileGetModulate(): Color {
    TODO()
  }

  fun tileGetName(): String {
    TODO()
  }

  fun tileGetNavigationPolygon(): NavigationPolygon {
    TODO()
  }

  fun tileGetNavigationPolygonOffset(): Vector2 {
    TODO()
  }

  fun tileGetNormalMap(): Texture {
    TODO()
  }

  fun tileGetOccluderOffset(): Vector2 {
    TODO()
  }

  fun tileGetRegion(): Rect2 {
    TODO()
  }

  fun tileGetShape(): Shape2D {
    TODO()
  }

  fun tileGetShapeCount(): Int {
    TODO()
  }

  fun tileGetShapeOffset(): Vector2 {
    TODO()
  }

  fun tileGetShapeOneWay(): Boolean {
    TODO()
  }

  fun tileGetShapeOneWayMargin(): Float {
    TODO()
  }

  fun tileGetShapeTransform(): Transform2D {
    TODO()
  }

  fun tileGetShapes(): VariantArray {
    TODO()
  }

  fun tileGetTexture(): Texture {
    TODO()
  }

  fun tileGetTextureOffset(): Vector2 {
    TODO()
  }

  fun tileGetTileMode(): TileSet.TileMode {
    TODO()
  }

  fun tileGetZIndex(): Int {
    TODO()
  }

  fun tileSetLightOccluder() {
    TODO()
  }

  fun tileSetMaterial() {
    TODO()
  }

  fun tileSetModulate() {
    TODO()
  }

  fun tileSetName() {
    TODO()
  }

  fun tileSetNavigationPolygon() {
    TODO()
  }

  fun tileSetNavigationPolygonOffset() {
    TODO()
  }

  fun tileSetNormalMap() {
    TODO()
  }

  fun tileSetOccluderOffset() {
    TODO()
  }

  fun tileSetRegion() {
    TODO()
  }

  fun tileSetShape() {
    TODO()
  }

  fun tileSetShapeOffset() {
    TODO()
  }

  fun tileSetShapeOneWay() {
    TODO()
  }

  fun tileSetShapeOneWayMargin() {
    TODO()
  }

  fun tileSetShapeTransform() {
    TODO()
  }

  fun tileSetShapes() {
    TODO()
  }

  fun tileSetTexture() {
    TODO()
  }

  fun tileSetTextureOffset() {
    TODO()
  }

  fun tileSetTileMode() {
    TODO()
  }

  fun tileSetZIndex() {
    TODO()
  }

  enum class TileMode(
    val value: Int
  ) {
    SINGLE_TILE(0),

    AUTO_TILE(1),

    ATLAS_TILE(2);
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
  }

  enum class BitmaskMode(
    val value: Int
  ) {
    BITMASK_2X2(0),

    BITMASK_3X3_MINIMAL(1),

    BITMASK_3X3(2);
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
    /**
     * Container for method_bind pointers for TileSet
     */
    private object __method_bind {
      val _forward_atlas_subtile_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "_forward_atlas_subtile_selection".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method _forward_atlas_subtile_selection" }
            }
          }

      val _forward_subtile_selection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "_forward_subtile_selection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _forward_subtile_selection" }
            }
          }

      val _is_tile_bound: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
              "_is_tile_bound".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _is_tile_bound" }
            }
          }

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
