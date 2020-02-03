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
import kotlin.reflect.KCallable
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
    __method_bind.autotileClearBitmaskMap.call(this._handle, listOf(_arg))
  }

  fun autotileGetBitmask(id: Int, coord: Vector2): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(coord))
    val _ret = __method_bind.autotileGetBitmask.call(this._handle, _args)
    return _ret.asInt()
  }

  fun autotileGetBitmaskMode(id: Int): BitmaskMode {
    val _arg = Variant.new(id)
    val _ret = __method_bind.autotileGetBitmaskMode.call(this._handle, listOf(_arg))
    return TileSet.BitmaskMode.from(_ret.asInt())
  }

  fun autotileGetIconCoordinate(id: Int): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.autotileGetIconCoordinate.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun autotileGetLightOccluder(id: Int, coord: Vector2): OccluderPolygon2D {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(coord))
    val _ret = __method_bind.autotileGetLightOccluder.call(this._handle, _args)
    return _ret.asObject(::OccluderPolygon2D)!!
  }

  fun autotileGetNavigationPolygon(id: Int, coord: Vector2): NavigationPolygon {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(coord))
    val _ret = __method_bind.autotileGetNavigationPolygon.call(this._handle, _args)
    return _ret.asObject(::NavigationPolygon)!!
  }

  fun autotileGetSize(id: Int): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.autotileGetSize.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun autotileGetSpacing(id: Int): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.autotileGetSpacing.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun autotileGetSubtilePriority(id: Int, coord: Vector2): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(coord))
    val _ret = __method_bind.autotileGetSubtilePriority.call(this._handle, _args)
    return _ret.asInt()
  }

  fun autotileGetZIndex(id: Int, coord: Vector2): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(coord))
    val _ret = __method_bind.autotileGetZIndex.call(this._handle, _args)
    return _ret.asInt()
  }

  fun autotileSetBitmask(
    id: Int,
    bitmask: Vector2,
    flag: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(bitmask))
    _args.add(Variant.fromAny(flag))
    __method_bind.autotileSetBitmask.call(this._handle, _args)
  }

  fun autotileSetBitmaskMode(id: Int, mode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(mode))
    __method_bind.autotileSetBitmaskMode.call(this._handle, _args)
  }

  fun autotileSetIconCoordinate(id: Int, coord: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(coord))
    __method_bind.autotileSetIconCoordinate.call(this._handle, _args)
  }

  fun autotileSetLightOccluder(
    id: Int,
    lightOccluder: OccluderPolygon2D,
    coord: Vector2
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(lightOccluder))
    _args.add(Variant.fromAny(coord))
    __method_bind.autotileSetLightOccluder.call(this._handle, _args)
  }

  fun autotileSetNavigationPolygon(
    id: Int,
    navigationPolygon: NavigationPolygon,
    coord: Vector2
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(navigationPolygon))
    _args.add(Variant.fromAny(coord))
    __method_bind.autotileSetNavigationPolygon.call(this._handle, _args)
  }

  fun autotileSetSize(id: Int, size: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(size))
    __method_bind.autotileSetSize.call(this._handle, _args)
  }

  fun autotileSetSpacing(id: Int, spacing: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(spacing))
    __method_bind.autotileSetSpacing.call(this._handle, _args)
  }

  fun autotileSetSubtilePriority(
    id: Int,
    coord: Vector2,
    priority: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(coord))
    _args.add(Variant.fromAny(priority))
    __method_bind.autotileSetSubtilePriority.call(this._handle, _args)
  }

  fun autotileSetZIndex(
    id: Int,
    coord: Vector2,
    zIndex: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(coord))
    _args.add(Variant.fromAny(zIndex))
    __method_bind.autotileSetZIndex.call(this._handle, _args)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun createTile(id: Int) {
    val _arg = Variant.new(id)
    __method_bind.createTile.call(this._handle, listOf(_arg))
  }

  fun findTileByName(name: String): Int {
    val _arg = Variant.new(name)
    val _ret = __method_bind.findTileByName.call(this._handle, listOf(_arg))
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
    __method_bind.removeTile.call(this._handle, listOf(_arg))
  }

  fun tileAddShape(
    id: Int,
    shape: Shape2D,
    shapeTransform: Transform2D,
    oneWay: Boolean = false,
    autotileCoord: Vector2 = Vector2.new(0, 0)
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(shape))
    _args.add(Variant.fromAny(shapeTransform))
    _args.add(Variant.fromAny(oneWay))
    _args.add(Variant.fromAny(autotileCoord))
    __method_bind.tileAddShape.call(this._handle, _args)
  }

  fun tileGetLightOccluder(id: Int): OccluderPolygon2D {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetLightOccluder.call(this._handle, listOf(_arg))
    return _ret.asObject(::OccluderPolygon2D)!!
  }

  fun tileGetMaterial(id: Int): ShaderMaterial {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetMaterial.call(this._handle, listOf(_arg))
    return _ret.asObject(::ShaderMaterial)!!
  }

  fun tileGetModulate(id: Int): Color {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetModulate.call(this._handle, listOf(_arg))
    return _ret.asColor()
  }

  fun tileGetName(id: Int): String {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetName.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun tileGetNavigationPolygon(id: Int): NavigationPolygon {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetNavigationPolygon.call(this._handle, listOf(_arg))
    return _ret.asObject(::NavigationPolygon)!!
  }

  fun tileGetNavigationPolygonOffset(id: Int): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetNavigationPolygonOffset.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun tileGetNormalMap(id: Int): Texture {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetNormalMap.call(this._handle, listOf(_arg))
    return _ret.asObject(::Texture)!!
  }

  fun tileGetOccluderOffset(id: Int): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetOccluderOffset.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun tileGetRegion(id: Int): Rect2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetRegion.call(this._handle, listOf(_arg))
    return _ret.asRect2()
  }

  fun tileGetShape(id: Int, shapeId: Int): Shape2D {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(shapeId))
    val _ret = __method_bind.tileGetShape.call(this._handle, _args)
    return _ret.asObject(::Shape2D)!!
  }

  fun tileGetShapeCount(id: Int): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetShapeCount.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun tileGetShapeOffset(id: Int, shapeId: Int): Vector2 {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(shapeId))
    val _ret = __method_bind.tileGetShapeOffset.call(this._handle, _args)
    return _ret.asVector2()
  }

  fun tileGetShapeOneWay(id: Int, shapeId: Int): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(shapeId))
    val _ret = __method_bind.tileGetShapeOneWay.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun tileGetShapeOneWayMargin(id: Int, shapeId: Int): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(shapeId))
    val _ret = __method_bind.tileGetShapeOneWayMargin.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun tileGetShapeTransform(id: Int, shapeId: Int): Transform2D {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(shapeId))
    val _ret = __method_bind.tileGetShapeTransform.call(this._handle, _args)
    return _ret.asTransform2D()
  }

  fun tileGetShapes(id: Int): VariantArray {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetShapes.call(this._handle, listOf(_arg))
    return _ret.asVariantArray()
  }

  fun tileGetTexture(id: Int): Texture {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetTexture.call(this._handle, listOf(_arg))
    return _ret.asObject(::Texture)!!
  }

  fun tileGetTextureOffset(id: Int): Vector2 {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetTextureOffset.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun tileGetTileMode(id: Int): TileMode {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetTileMode.call(this._handle, listOf(_arg))
    return TileSet.TileMode.from(_ret.asInt())
  }

  fun tileGetZIndex(id: Int): Int {
    val _arg = Variant.new(id)
    val _ret = __method_bind.tileGetZIndex.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun tileSetLightOccluder(id: Int, lightOccluder: OccluderPolygon2D) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(lightOccluder))
    __method_bind.tileSetLightOccluder.call(this._handle, _args)
  }

  fun tileSetMaterial(id: Int, material: ShaderMaterial) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(material))
    __method_bind.tileSetMaterial.call(this._handle, _args)
  }

  fun tileSetModulate(id: Int, color: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(color))
    __method_bind.tileSetModulate.call(this._handle, _args)
  }

  fun tileSetName(id: Int, name: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(name))
    __method_bind.tileSetName.call(this._handle, _args)
  }

  fun tileSetNavigationPolygon(id: Int, navigationPolygon: NavigationPolygon) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(navigationPolygon))
    __method_bind.tileSetNavigationPolygon.call(this._handle, _args)
  }

  fun tileSetNavigationPolygonOffset(id: Int, navigationPolygonOffset: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(navigationPolygonOffset))
    __method_bind.tileSetNavigationPolygonOffset.call(this._handle, _args)
  }

  fun tileSetNormalMap(id: Int, normalMap: Texture) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(normalMap))
    __method_bind.tileSetNormalMap.call(this._handle, _args)
  }

  fun tileSetOccluderOffset(id: Int, occluderOffset: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(occluderOffset))
    __method_bind.tileSetOccluderOffset.call(this._handle, _args)
  }

  fun tileSetRegion(id: Int, region: Rect2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(region))
    __method_bind.tileSetRegion.call(this._handle, _args)
  }

  fun tileSetShape(
    id: Int,
    shapeId: Int,
    shape: Shape2D
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(shapeId))
    _args.add(Variant.fromAny(shape))
    __method_bind.tileSetShape.call(this._handle, _args)
  }

  fun tileSetShapeOffset(
    id: Int,
    shapeId: Int,
    shapeOffset: Vector2
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(shapeId))
    _args.add(Variant.fromAny(shapeOffset))
    __method_bind.tileSetShapeOffset.call(this._handle, _args)
  }

  fun tileSetShapeOneWay(
    id: Int,
    shapeId: Int,
    oneWay: Boolean
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(shapeId))
    _args.add(Variant.fromAny(oneWay))
    __method_bind.tileSetShapeOneWay.call(this._handle, _args)
  }

  fun tileSetShapeOneWayMargin(
    id: Int,
    shapeId: Int,
    oneWay: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(shapeId))
    _args.add(Variant.fromAny(oneWay))
    __method_bind.tileSetShapeOneWayMargin.call(this._handle, _args)
  }

  fun tileSetShapeTransform(
    id: Int,
    shapeId: Int,
    shapeTransform: Transform2D
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(shapeId))
    _args.add(Variant.fromAny(shapeTransform))
    __method_bind.tileSetShapeTransform.call(this._handle, _args)
  }

  fun tileSetShapes(id: Int, shapes: VariantArray) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(shapes))
    __method_bind.tileSetShapes.call(this._handle, _args)
  }

  fun tileSetTexture(id: Int, texture: Texture) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(texture))
    __method_bind.tileSetTexture.call(this._handle, _args)
  }

  fun tileSetTextureOffset(id: Int, textureOffset: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(textureOffset))
    __method_bind.tileSetTextureOffset.call(this._handle, _args)
  }

  fun tileSetTileMode(id: Int, tilemode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(tilemode))
    __method_bind.tileSetTileMode.call(this._handle, _args)
  }

  fun tileSetZIndex(id: Int, zIndex: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(zIndex))
    __method_bind.tileSetZIndex.call(this._handle, _args)
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
            "autotile_clear_bitmask_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_clear_bitmask_map" }
        }
      val autotileGetBitmask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_bitmask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_bitmask" }
        }
      val autotileGetBitmaskMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_bitmask_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_bitmask_mode" }
        }
      val autotileGetIconCoordinate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_icon_coordinate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_icon_coordinate" }
        }
      val autotileGetLightOccluder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_light_occluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_light_occluder" }
        }
      val autotileGetNavigationPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_navigation_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_navigation_polygon" }
        }
      val autotileGetSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_size" }
        }
      val autotileGetSpacing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_spacing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_spacing" }
        }
      val autotileGetSubtilePriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_subtile_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_subtile_priority" }
        }
      val autotileGetZIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_get_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_get_z_index" }
        }
      val autotileSetBitmask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_bitmask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_bitmask" }
        }
      val autotileSetBitmaskMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_bitmask_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_bitmask_mode" }
        }
      val autotileSetIconCoordinate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_icon_coordinate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_icon_coordinate" }
        }
      val autotileSetLightOccluder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_light_occluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_light_occluder" }
        }
      val autotileSetNavigationPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_navigation_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_navigation_polygon" }
        }
      val autotileSetSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_size" }
        }
      val autotileSetSpacing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_spacing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_spacing" }
        }
      val autotileSetSubtilePriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "autotile_set_subtile_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method autotile_set_subtile_priority" }
        }
      val autotileSetZIndex: CPointer<godot_method_bind>
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
      val createTile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "create_tile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_tile" }
        }
      val findTileByName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "find_tile_by_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_tile_by_name" }
        }
      val getLastUnusedTileId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "get_last_unused_tile_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_last_unused_tile_id" }
        }
      val getTilesIds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "get_tiles_ids".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tiles_ids" }
        }
      val removeTile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "remove_tile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_tile" }
        }
      val tileAddShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_add_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_add_shape" }
        }
      val tileGetLightOccluder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_light_occluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_light_occluder" }
        }
      val tileGetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_material" }
        }
      val tileGetModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_modulate" }
        }
      val tileGetName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_name" }
        }
      val tileGetNavigationPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_navigation_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_navigation_polygon" }
        }
      val tileGetNavigationPolygonOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_navigation_polygon_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_navigation_polygon_offset"
            }
        }
      val tileGetNormalMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_normal_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_normal_map" }
        }
      val tileGetOccluderOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_occluder_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_occluder_offset" }
        }
      val tileGetRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_region" }
        }
      val tileGetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape" }
        }
      val tileGetShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape_count" }
        }
      val tileGetShapeOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape_offset" }
        }
      val tileGetShapeOneWay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape_one_way".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape_one_way" }
        }
      val tileGetShapeOneWayMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape_one_way_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape_one_way_margin" }
        }
      val tileGetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shape_transform" }
        }
      val tileGetShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_shapes" }
        }
      val tileGetTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_texture" }
        }
      val tileGetTextureOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_texture_offset" }
        }
      val tileGetTileMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_tile_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_tile_mode" }
        }
      val tileGetZIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_get_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_get_z_index" }
        }
      val tileSetLightOccluder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_light_occluder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_light_occluder" }
        }
      val tileSetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_material" }
        }
      val tileSetModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_modulate" }
        }
      val tileSetName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_name" }
        }
      val tileSetNavigationPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_navigation_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_navigation_polygon" }
        }
      val tileSetNavigationPolygonOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_navigation_polygon_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_navigation_polygon_offset"
            }
        }
      val tileSetNormalMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_normal_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_normal_map" }
        }
      val tileSetOccluderOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_occluder_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_occluder_offset" }
        }
      val tileSetRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_region" }
        }
      val tileSetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shape" }
        }
      val tileSetShapeOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shape_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shape_offset" }
        }
      val tileSetShapeOneWay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shape_one_way".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shape_one_way" }
        }
      val tileSetShapeOneWayMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shape_one_way_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shape_one_way_margin" }
        }
      val tileSetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shape_transform" }
        }
      val tileSetShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_shapes" }
        }
      val tileSetTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_texture" }
        }
      val tileSetTextureOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_texture_offset" }
        }
      val tileSetTileMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_tile_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_tile_mode" }
        }
      val tileSetZIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TileSet".cstr.ptr,
            "tile_set_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method tile_set_z_index" }
        }}
  }
}
