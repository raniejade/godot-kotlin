// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Basis
import godot.core.Color
import godot.core.Godot
import godot.core.Plane
import godot.core.PoolByteArray
import godot.core.PoolColorArray
import godot.core.PoolFloatArray
import godot.core.PoolIntArray
import godot.core.PoolVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualServerInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  /**
   * VisualServer::frame_post_draw signal
   */
  val signalFramePostDraw: Signal0 = Signal0("frame_post_draw")

  /**
   * VisualServer::frame_pre_draw signal
   */
  val signalFramePreDraw: Signal0 = Signal0("frame_pre_draw")

  fun blackBarsSetImages(
    left: RID,
    top: RID,
    right: RID,
    bottom: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(left))
    _args.add(Variant.fromAny(top))
    _args.add(Variant.fromAny(right))
    _args.add(Variant.fromAny(bottom))
    __method_bind.blackBarsSetImages.call(this._handle, _args)
  }

  fun blackBarsSetMargins(
    left: Int,
    top: Int,
    right: Int,
    bottom: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(left))
    _args.add(Variant.fromAny(top))
    _args.add(Variant.fromAny(right))
    _args.add(Variant.fromAny(bottom))
    __method_bind.blackBarsSetMargins.call(this._handle, _args)
  }

  fun cameraCreate(): RID {
    val _ret = __method_bind.cameraCreate.call(this._handle)
    return _ret.asRID()
  }

  fun cameraSetCullMask(camera: RID, layers: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(camera))
    _args.add(Variant.fromAny(layers))
    __method_bind.cameraSetCullMask.call(this._handle, _args)
  }

  fun cameraSetEnvironment(camera: RID, env: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(camera))
    _args.add(Variant.fromAny(env))
    __method_bind.cameraSetEnvironment.call(this._handle, _args)
  }

  fun cameraSetFrustum(
    camera: RID,
    size: Float,
    offset: Vector2,
    zNear: Float,
    zFar: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(camera))
    _args.add(Variant.fromAny(size))
    _args.add(Variant.fromAny(offset))
    _args.add(Variant.fromAny(zNear))
    _args.add(Variant.fromAny(zFar))
    __method_bind.cameraSetFrustum.call(this._handle, _args)
  }

  fun cameraSetOrthogonal(
    camera: RID,
    size: Float,
    zNear: Float,
    zFar: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(camera))
    _args.add(Variant.fromAny(size))
    _args.add(Variant.fromAny(zNear))
    _args.add(Variant.fromAny(zFar))
    __method_bind.cameraSetOrthogonal.call(this._handle, _args)
  }

  fun cameraSetPerspective(
    camera: RID,
    fovyDegrees: Float,
    zNear: Float,
    zFar: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(camera))
    _args.add(Variant.fromAny(fovyDegrees))
    _args.add(Variant.fromAny(zNear))
    _args.add(Variant.fromAny(zFar))
    __method_bind.cameraSetPerspective.call(this._handle, _args)
  }

  fun cameraSetTransform(camera: RID, transform: Transform) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(camera))
    _args.add(Variant.fromAny(transform))
    __method_bind.cameraSetTransform.call(this._handle, _args)
  }

  fun cameraSetUseVerticalAspect(camera: RID, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(camera))
    _args.add(Variant.fromAny(enable))
    __method_bind.cameraSetUseVerticalAspect.call(this._handle, _args)
  }

  fun canvasCreate(): RID {
    val _ret = __method_bind.canvasCreate.call(this._handle)
    return _ret.asRID()
  }

  fun canvasItemAddCircle(
    item: RID,
    pos: Vector2,
    radius: Float,
    color: Color
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(pos))
    _args.add(Variant.fromAny(radius))
    _args.add(Variant.fromAny(color))
    __method_bind.canvasItemAddCircle.call(this._handle, _args)
  }

  fun canvasItemAddClipIgnore(item: RID, ignore: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(ignore))
    __method_bind.canvasItemAddClipIgnore.call(this._handle, _args)
  }

  fun canvasItemAddLine(
    item: RID,
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    _args.add(Variant.fromAny(color))
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(antialiased))
    __method_bind.canvasItemAddLine.call(this._handle, _args)
  }

  fun canvasItemAddMesh(
    item: RID,
    mesh: RID,
    transform: Transform2D = Transform2D(Vector2(1, 0), Vector2(0, 1), Vector2(0, 0)),
    modulate: Color = Color(1,1,1,1),
    texture: RID,
    normalMap: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(transform))
    _args.add(Variant.fromAny(modulate))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(normalMap))
    __method_bind.canvasItemAddMesh.call(this._handle, _args)
  }

  fun canvasItemAddMultimesh(
    item: RID,
    mesh: RID,
    texture: RID,
    normalMap: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(normalMap))
    __method_bind.canvasItemAddMultimesh.call(this._handle, _args)
  }

  fun canvasItemAddNinePatch(
    item: RID,
    rect: Rect2,
    source: Rect2,
    texture: RID,
    topleft: Vector2,
    bottomright: Vector2,
    xAxisMode: Int = 0,
    yAxisMode: Int = 0,
    drawCenter: Boolean = true,
    modulate: Color = Color(1,1,1,1),
    normalMap: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(rect))
    _args.add(Variant.fromAny(source))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(topleft))
    _args.add(Variant.fromAny(bottomright))
    _args.add(Variant.fromAny(xAxisMode))
    _args.add(Variant.fromAny(yAxisMode))
    _args.add(Variant.fromAny(drawCenter))
    _args.add(Variant.fromAny(modulate))
    _args.add(Variant.fromAny(normalMap))
    __method_bind.canvasItemAddNinePatch.call(this._handle, _args)
  }

  fun canvasItemAddParticles(
    item: RID,
    particles: RID,
    texture: RID,
    normalMap: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(normalMap))
    __method_bind.canvasItemAddParticles.call(this._handle, _args)
  }

  fun canvasItemAddPolygon(
    item: RID,
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: RID,
    normalMap: RID,
    antialiased: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(points))
    _args.add(Variant.fromAny(colors))
    _args.add(Variant.fromAny(uvs))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(normalMap))
    _args.add(Variant.fromAny(antialiased))
    __method_bind.canvasItemAddPolygon.call(this._handle, _args)
  }

  fun canvasItemAddPolyline(
    item: RID,
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Float = 1.0f,
    antialiased: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(points))
    _args.add(Variant.fromAny(colors))
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(antialiased))
    __method_bind.canvasItemAddPolyline.call(this._handle, _args)
  }

  fun canvasItemAddPrimitive(
    item: RID,
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: RID,
    width: Float = 1.0f,
    normalMap: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(points))
    _args.add(Variant.fromAny(colors))
    _args.add(Variant.fromAny(uvs))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(normalMap))
    __method_bind.canvasItemAddPrimitive.call(this._handle, _args)
  }

  fun canvasItemAddRect(
    item: RID,
    rect: Rect2,
    color: Color
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(rect))
    _args.add(Variant.fromAny(color))
    __method_bind.canvasItemAddRect.call(this._handle, _args)
  }

  fun canvasItemAddSetTransform(item: RID, transform: Transform2D) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(transform))
    __method_bind.canvasItemAddSetTransform.call(this._handle, _args)
  }

  fun canvasItemAddTextureRect(
    item: RID,
    rect: Rect2,
    texture: RID,
    tile: Boolean = false,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(rect))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(tile))
    _args.add(Variant.fromAny(modulate))
    _args.add(Variant.fromAny(transpose))
    _args.add(Variant.fromAny(normalMap))
    __method_bind.canvasItemAddTextureRect.call(this._handle, _args)
  }

  fun canvasItemAddTextureRectRegion(
    item: RID,
    rect: Rect2,
    texture: RID,
    srcRect: Rect2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: RID,
    clipUv: Boolean = true
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(rect))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(srcRect))
    _args.add(Variant.fromAny(modulate))
    _args.add(Variant.fromAny(transpose))
    _args.add(Variant.fromAny(normalMap))
    _args.add(Variant.fromAny(clipUv))
    __method_bind.canvasItemAddTextureRectRegion.call(this._handle, _args)
  }

  fun canvasItemAddTriangleArray(
    item: RID,
    indices: PoolIntArray,
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    bones: PoolIntArray,
    weights: PoolFloatArray,
    texture: RID,
    count: Int = -1,
    normalMap: RID,
    antialiased: Boolean = false,
    antialiasingUseIndices: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(indices))
    _args.add(Variant.fromAny(points))
    _args.add(Variant.fromAny(colors))
    _args.add(Variant.fromAny(uvs))
    _args.add(Variant.fromAny(bones))
    _args.add(Variant.fromAny(weights))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(count))
    _args.add(Variant.fromAny(normalMap))
    _args.add(Variant.fromAny(antialiased))
    _args.add(Variant.fromAny(antialiasingUseIndices))
    __method_bind.canvasItemAddTriangleArray.call(this._handle, _args)
  }

  fun canvasItemClear(item: RID) {
    val _arg = Variant(item)
    __method_bind.canvasItemClear.call(this._handle, listOf(_arg))
  }

  fun canvasItemCreate(): RID {
    val _ret = __method_bind.canvasItemCreate.call(this._handle)
    return _ret.asRID()
  }

  fun canvasItemSetClip(item: RID, clip: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(clip))
    __method_bind.canvasItemSetClip.call(this._handle, _args)
  }

  fun canvasItemSetCopyToBackbuffer(
    item: RID,
    enabled: Boolean,
    rect: Rect2
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(enabled))
    _args.add(Variant.fromAny(rect))
    __method_bind.canvasItemSetCopyToBackbuffer.call(this._handle, _args)
  }

  fun canvasItemSetCustomRect(
    item: RID,
    useCustomRect: Boolean,
    rect: Rect2
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(useCustomRect))
    _args.add(Variant.fromAny(rect))
    __method_bind.canvasItemSetCustomRect.call(this._handle, _args)
  }

  fun canvasItemSetDistanceFieldMode(item: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(enabled))
    __method_bind.canvasItemSetDistanceFieldMode.call(this._handle, _args)
  }

  fun canvasItemSetDrawBehindParent(item: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(enabled))
    __method_bind.canvasItemSetDrawBehindParent.call(this._handle, _args)
  }

  fun canvasItemSetDrawIndex(item: RID, index: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(index))
    __method_bind.canvasItemSetDrawIndex.call(this._handle, _args)
  }

  fun canvasItemSetLightMask(item: RID, mask: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(mask))
    __method_bind.canvasItemSetLightMask.call(this._handle, _args)
  }

  fun canvasItemSetMaterial(item: RID, material: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(material))
    __method_bind.canvasItemSetMaterial.call(this._handle, _args)
  }

  fun canvasItemSetModulate(item: RID, color: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(color))
    __method_bind.canvasItemSetModulate.call(this._handle, _args)
  }

  fun canvasItemSetParent(item: RID, parent: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(parent))
    __method_bind.canvasItemSetParent.call(this._handle, _args)
  }

  fun canvasItemSetSelfModulate(item: RID, color: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(color))
    __method_bind.canvasItemSetSelfModulate.call(this._handle, _args)
  }

  fun canvasItemSetSortChildrenByY(item: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(enabled))
    __method_bind.canvasItemSetSortChildrenByY.call(this._handle, _args)
  }

  fun canvasItemSetTransform(item: RID, transform: Transform2D) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(transform))
    __method_bind.canvasItemSetTransform.call(this._handle, _args)
  }

  fun canvasItemSetUseParentMaterial(item: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(enabled))
    __method_bind.canvasItemSetUseParentMaterial.call(this._handle, _args)
  }

  fun canvasItemSetVisible(item: RID, visible: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(visible))
    __method_bind.canvasItemSetVisible.call(this._handle, _args)
  }

  fun canvasItemSetZAsRelativeToParent(item: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(enabled))
    __method_bind.canvasItemSetZAsRelativeToParent.call(this._handle, _args)
  }

  fun canvasItemSetZIndex(item: RID, zIndex: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(zIndex))
    __method_bind.canvasItemSetZIndex.call(this._handle, _args)
  }

  fun canvasLightAttachToCanvas(light: RID, canvas: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(canvas))
    __method_bind.canvasLightAttachToCanvas.call(this._handle, _args)
  }

  fun canvasLightCreate(): RID {
    val _ret = __method_bind.canvasLightCreate.call(this._handle)
    return _ret.asRID()
  }

  fun canvasLightOccluderAttachToCanvas(occluder: RID, canvas: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(occluder))
    _args.add(Variant.fromAny(canvas))
    __method_bind.canvasLightOccluderAttachToCanvas.call(this._handle, _args)
  }

  fun canvasLightOccluderCreate(): RID {
    val _ret = __method_bind.canvasLightOccluderCreate.call(this._handle)
    return _ret.asRID()
  }

  fun canvasLightOccluderSetEnabled(occluder: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(occluder))
    _args.add(Variant.fromAny(enabled))
    __method_bind.canvasLightOccluderSetEnabled.call(this._handle, _args)
  }

  fun canvasLightOccluderSetLightMask(occluder: RID, mask: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(occluder))
    _args.add(Variant.fromAny(mask))
    __method_bind.canvasLightOccluderSetLightMask.call(this._handle, _args)
  }

  fun canvasLightOccluderSetPolygon(occluder: RID, polygon: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(occluder))
    _args.add(Variant.fromAny(polygon))
    __method_bind.canvasLightOccluderSetPolygon.call(this._handle, _args)
  }

  fun canvasLightOccluderSetTransform(occluder: RID, transform: Transform2D) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(occluder))
    _args.add(Variant.fromAny(transform))
    __method_bind.canvasLightOccluderSetTransform.call(this._handle, _args)
  }

  fun canvasLightSetColor(light: RID, color: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(color))
    __method_bind.canvasLightSetColor.call(this._handle, _args)
  }

  fun canvasLightSetEnabled(light: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(enabled))
    __method_bind.canvasLightSetEnabled.call(this._handle, _args)
  }

  fun canvasLightSetEnergy(light: RID, energy: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(energy))
    __method_bind.canvasLightSetEnergy.call(this._handle, _args)
  }

  fun canvasLightSetHeight(light: RID, height: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(height))
    __method_bind.canvasLightSetHeight.call(this._handle, _args)
  }

  fun canvasLightSetItemCullMask(light: RID, mask: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(mask))
    __method_bind.canvasLightSetItemCullMask.call(this._handle, _args)
  }

  fun canvasLightSetItemShadowCullMask(light: RID, mask: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(mask))
    __method_bind.canvasLightSetItemShadowCullMask.call(this._handle, _args)
  }

  fun canvasLightSetLayerRange(
    light: RID,
    minLayer: Int,
    maxLayer: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(minLayer))
    _args.add(Variant.fromAny(maxLayer))
    __method_bind.canvasLightSetLayerRange.call(this._handle, _args)
  }

  fun canvasLightSetMode(light: RID, mode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(mode))
    __method_bind.canvasLightSetMode.call(this._handle, _args)
  }

  fun canvasLightSetScale(light: RID, scale: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(scale))
    __method_bind.canvasLightSetScale.call(this._handle, _args)
  }

  fun canvasLightSetShadowBufferSize(light: RID, size: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(size))
    __method_bind.canvasLightSetShadowBufferSize.call(this._handle, _args)
  }

  fun canvasLightSetShadowColor(light: RID, color: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(color))
    __method_bind.canvasLightSetShadowColor.call(this._handle, _args)
  }

  fun canvasLightSetShadowEnabled(light: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(enabled))
    __method_bind.canvasLightSetShadowEnabled.call(this._handle, _args)
  }

  fun canvasLightSetShadowFilter(light: RID, filter: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(filter))
    __method_bind.canvasLightSetShadowFilter.call(this._handle, _args)
  }

  fun canvasLightSetShadowGradientLength(light: RID, length: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(length))
    __method_bind.canvasLightSetShadowGradientLength.call(this._handle, _args)
  }

  fun canvasLightSetShadowSmooth(light: RID, smooth: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(smooth))
    __method_bind.canvasLightSetShadowSmooth.call(this._handle, _args)
  }

  fun canvasLightSetTexture(light: RID, texture: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(texture))
    __method_bind.canvasLightSetTexture.call(this._handle, _args)
  }

  fun canvasLightSetTextureOffset(light: RID, offset: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(offset))
    __method_bind.canvasLightSetTextureOffset.call(this._handle, _args)
  }

  fun canvasLightSetTransform(light: RID, transform: Transform2D) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(transform))
    __method_bind.canvasLightSetTransform.call(this._handle, _args)
  }

  fun canvasLightSetZRange(
    light: RID,
    minZ: Int,
    maxZ: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(minZ))
    _args.add(Variant.fromAny(maxZ))
    __method_bind.canvasLightSetZRange.call(this._handle, _args)
  }

  fun canvasOccluderPolygonCreate(): RID {
    val _ret = __method_bind.canvasOccluderPolygonCreate.call(this._handle)
    return _ret.asRID()
  }

  fun canvasOccluderPolygonSetCullMode(occluderPolygon: RID, mode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(occluderPolygon))
    _args.add(Variant.fromAny(mode))
    __method_bind.canvasOccluderPolygonSetCullMode.call(this._handle, _args)
  }

  fun canvasOccluderPolygonSetShape(
    occluderPolygon: RID,
    shape: PoolVector2Array,
    closed: Boolean
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(occluderPolygon))
    _args.add(Variant.fromAny(shape))
    _args.add(Variant.fromAny(closed))
    __method_bind.canvasOccluderPolygonSetShape.call(this._handle, _args)
  }

  fun canvasOccluderPolygonSetShapeAsLines(occluderPolygon: RID, shape: PoolVector2Array) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(occluderPolygon))
    _args.add(Variant.fromAny(shape))
    __method_bind.canvasOccluderPolygonSetShapeAsLines.call(this._handle, _args)
  }

  fun canvasSetItemMirroring(
    canvas: RID,
    item: RID,
    mirroring: Vector2
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(canvas))
    _args.add(Variant.fromAny(item))
    _args.add(Variant.fromAny(mirroring))
    __method_bind.canvasSetItemMirroring.call(this._handle, _args)
  }

  fun canvasSetModulate(canvas: RID, color: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(canvas))
    _args.add(Variant.fromAny(color))
    __method_bind.canvasSetModulate.call(this._handle, _args)
  }

  fun directionalLightCreate(): RID {
    val _ret = __method_bind.directionalLightCreate.call(this._handle)
    return _ret.asRID()
  }

  fun draw(swapBuffers: Boolean = true, frameStep: Float = 0.0f) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(swapBuffers))
    _args.add(Variant.fromAny(frameStep))
    __method_bind.draw.call(this._handle, _args)
  }

  fun environmentCreate(): RID {
    val _ret = __method_bind.environmentCreate.call(this._handle)
    return _ret.asRID()
  }

  fun environmentSetAdjustment(
    env: RID,
    enable: Boolean,
    brightness: Float,
    contrast: Float,
    saturation: Float,
    ramp: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(enable))
    _args.add(Variant.fromAny(brightness))
    _args.add(Variant.fromAny(contrast))
    _args.add(Variant.fromAny(saturation))
    _args.add(Variant.fromAny(ramp))
    __method_bind.environmentSetAdjustment.call(this._handle, _args)
  }

  fun environmentSetAmbientLight(
    env: RID,
    color: Color,
    energy: Float = 1.0f,
    skyContibution: Float = 0.0f
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(color))
    _args.add(Variant.fromAny(energy))
    _args.add(Variant.fromAny(skyContibution))
    __method_bind.environmentSetAmbientLight.call(this._handle, _args)
  }

  fun environmentSetBackground(env: RID, bg: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(bg))
    __method_bind.environmentSetBackground.call(this._handle, _args)
  }

  fun environmentSetBgColor(env: RID, color: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(color))
    __method_bind.environmentSetBgColor.call(this._handle, _args)
  }

  fun environmentSetBgEnergy(env: RID, energy: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(energy))
    __method_bind.environmentSetBgEnergy.call(this._handle, _args)
  }

  fun environmentSetCanvasMaxLayer(env: RID, maxLayer: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(maxLayer))
    __method_bind.environmentSetCanvasMaxLayer.call(this._handle, _args)
  }

  fun environmentSetDofBlurFar(
    env: RID,
    enable: Boolean,
    distance: Float,
    transition: Float,
    farAmount: Float,
    quality: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(enable))
    _args.add(Variant.fromAny(distance))
    _args.add(Variant.fromAny(transition))
    _args.add(Variant.fromAny(farAmount))
    _args.add(Variant.fromAny(quality))
    __method_bind.environmentSetDofBlurFar.call(this._handle, _args)
  }

  fun environmentSetDofBlurNear(
    env: RID,
    enable: Boolean,
    distance: Float,
    transition: Float,
    farAmount: Float,
    quality: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(enable))
    _args.add(Variant.fromAny(distance))
    _args.add(Variant.fromAny(transition))
    _args.add(Variant.fromAny(farAmount))
    _args.add(Variant.fromAny(quality))
    __method_bind.environmentSetDofBlurNear.call(this._handle, _args)
  }

  fun environmentSetFog(
    env: RID,
    enable: Boolean,
    color: Color,
    sunColor: Color,
    sunAmount: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(enable))
    _args.add(Variant.fromAny(color))
    _args.add(Variant.fromAny(sunColor))
    _args.add(Variant.fromAny(sunAmount))
    __method_bind.environmentSetFog.call(this._handle, _args)
  }

  fun environmentSetFogDepth(
    env: RID,
    enable: Boolean,
    depthBegin: Float,
    depthEnd: Float,
    depthCurve: Float,
    transmit: Boolean,
    transmitCurve: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(enable))
    _args.add(Variant.fromAny(depthBegin))
    _args.add(Variant.fromAny(depthEnd))
    _args.add(Variant.fromAny(depthCurve))
    _args.add(Variant.fromAny(transmit))
    _args.add(Variant.fromAny(transmitCurve))
    __method_bind.environmentSetFogDepth.call(this._handle, _args)
  }

  fun environmentSetFogHeight(
    env: RID,
    enable: Boolean,
    minHeight: Float,
    maxHeight: Float,
    heightCurve: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(enable))
    _args.add(Variant.fromAny(minHeight))
    _args.add(Variant.fromAny(maxHeight))
    _args.add(Variant.fromAny(heightCurve))
    __method_bind.environmentSetFogHeight.call(this._handle, _args)
  }

  fun environmentSetGlow(
    env: RID,
    enable: Boolean,
    levelFlags: Int,
    intensity: Float,
    strength: Float,
    bloomThreshold: Float,
    blendMode: Int,
    hdrBleedThreshold: Float,
    hdrBleedScale: Float,
    hdrLuminanceCap: Float,
    bicubicUpscale: Boolean
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(enable))
    _args.add(Variant.fromAny(levelFlags))
    _args.add(Variant.fromAny(intensity))
    _args.add(Variant.fromAny(strength))
    _args.add(Variant.fromAny(bloomThreshold))
    _args.add(Variant.fromAny(blendMode))
    _args.add(Variant.fromAny(hdrBleedThreshold))
    _args.add(Variant.fromAny(hdrBleedScale))
    _args.add(Variant.fromAny(hdrLuminanceCap))
    _args.add(Variant.fromAny(bicubicUpscale))
    __method_bind.environmentSetGlow.call(this._handle, _args)
  }

  fun environmentSetSky(env: RID, sky: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(sky))
    __method_bind.environmentSetSky.call(this._handle, _args)
  }

  fun environmentSetSkyCustomFov(env: RID, scale: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(scale))
    __method_bind.environmentSetSkyCustomFov.call(this._handle, _args)
  }

  fun environmentSetSkyOrientation(env: RID, orientation: Basis) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(orientation))
    __method_bind.environmentSetSkyOrientation.call(this._handle, _args)
  }

  fun environmentSetSsao(
    env: RID,
    enable: Boolean,
    radius: Float,
    intensity: Float,
    radius2: Float,
    intensity2: Float,
    bias: Float,
    lightAffect: Float,
    aoChannelAffect: Float,
    color: Color,
    quality: Int,
    blur: Int,
    bilateralSharpness: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(enable))
    _args.add(Variant.fromAny(radius))
    _args.add(Variant.fromAny(intensity))
    _args.add(Variant.fromAny(radius2))
    _args.add(Variant.fromAny(intensity2))
    _args.add(Variant.fromAny(bias))
    _args.add(Variant.fromAny(lightAffect))
    _args.add(Variant.fromAny(aoChannelAffect))
    _args.add(Variant.fromAny(color))
    _args.add(Variant.fromAny(quality))
    _args.add(Variant.fromAny(blur))
    _args.add(Variant.fromAny(bilateralSharpness))
    __method_bind.environmentSetSsao.call(this._handle, _args)
  }

  fun environmentSetSsr(
    env: RID,
    enable: Boolean,
    maxSteps: Int,
    fadeIn: Float,
    fadeOut: Float,
    depthTolerance: Float,
    roughness: Boolean
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(enable))
    _args.add(Variant.fromAny(maxSteps))
    _args.add(Variant.fromAny(fadeIn))
    _args.add(Variant.fromAny(fadeOut))
    _args.add(Variant.fromAny(depthTolerance))
    _args.add(Variant.fromAny(roughness))
    __method_bind.environmentSetSsr.call(this._handle, _args)
  }

  fun environmentSetTonemap(
    env: RID,
    toneMapper: Int,
    exposure: Float,
    white: Float,
    autoExposure: Boolean,
    minLuminance: Float,
    maxLuminance: Float,
    autoExpSpeed: Float,
    autoExpGrey: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(env))
    _args.add(Variant.fromAny(toneMapper))
    _args.add(Variant.fromAny(exposure))
    _args.add(Variant.fromAny(white))
    _args.add(Variant.fromAny(autoExposure))
    _args.add(Variant.fromAny(minLuminance))
    _args.add(Variant.fromAny(maxLuminance))
    _args.add(Variant.fromAny(autoExpSpeed))
    _args.add(Variant.fromAny(autoExpGrey))
    __method_bind.environmentSetTonemap.call(this._handle, _args)
  }

  fun finish() {
    __method_bind.finish.call(this._handle)
  }

  fun forceDraw(swapBuffers: Boolean = true, frameStep: Float = 0.0f) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(swapBuffers))
    _args.add(Variant.fromAny(frameStep))
    __method_bind.forceDraw.call(this._handle, _args)
  }

  fun forceSync() {
    __method_bind.forceSync.call(this._handle)
  }

  fun freeRid(rid: RID) {
    val _arg = Variant(rid)
    __method_bind.freeRid.call(this._handle, listOf(_arg))
  }

  fun getRenderInfo(info: Int): Int {
    val _arg = Variant(info)
    val _ret = __method_bind.getRenderInfo.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getTestCube(): RID {
    val _ret = __method_bind.getTestCube.call(this._handle)
    return _ret.asRID()
  }

  fun getTestTexture(): RID {
    val _ret = __method_bind.getTestTexture.call(this._handle)
    return _ret.asRID()
  }

  fun getVideoAdapterName(): String {
    val _ret = __method_bind.getVideoAdapterName.call(this._handle)
    return _ret.asString()
  }

  fun getVideoAdapterVendor(): String {
    val _ret = __method_bind.getVideoAdapterVendor.call(this._handle)
    return _ret.asString()
  }

  fun getWhiteTexture(): RID {
    val _ret = __method_bind.getWhiteTexture.call(this._handle)
    return _ret.asRID()
  }

  fun giProbeCreate(): RID {
    val _ret = __method_bind.giProbeCreate.call(this._handle)
    return _ret.asRID()
  }

  fun giProbeGetBias(probe: RID): Float {
    val _arg = Variant(probe)
    val _ret = __method_bind.giProbeGetBias.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun giProbeGetBounds(probe: RID): AABB {
    val _arg = Variant(probe)
    val _ret = __method_bind.giProbeGetBounds.call(this._handle, listOf(_arg))
    return _ret.asAABB()
  }

  fun giProbeGetCellSize(probe: RID): Float {
    val _arg = Variant(probe)
    val _ret = __method_bind.giProbeGetCellSize.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun giProbeGetDynamicData(probe: RID): PoolIntArray {
    val _arg = Variant(probe)
    val _ret = __method_bind.giProbeGetDynamicData.call(this._handle, listOf(_arg))
    return _ret.asPoolIntArray()
  }

  fun giProbeGetDynamicRange(probe: RID): Int {
    val _arg = Variant(probe)
    val _ret = __method_bind.giProbeGetDynamicRange.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun giProbeGetEnergy(probe: RID): Float {
    val _arg = Variant(probe)
    val _ret = __method_bind.giProbeGetEnergy.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun giProbeGetNormalBias(probe: RID): Float {
    val _arg = Variant(probe)
    val _ret = __method_bind.giProbeGetNormalBias.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun giProbeGetPropagation(probe: RID): Float {
    val _arg = Variant(probe)
    val _ret = __method_bind.giProbeGetPropagation.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun giProbeGetToCellXform(probe: RID): Transform {
    val _arg = Variant(probe)
    val _ret = __method_bind.giProbeGetToCellXform.call(this._handle, listOf(_arg))
    return _ret.asTransform()
  }

  fun giProbeIsCompressed(probe: RID): Boolean {
    val _arg = Variant(probe)
    val _ret = __method_bind.giProbeIsCompressed.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun giProbeIsInterior(probe: RID): Boolean {
    val _arg = Variant(probe)
    val _ret = __method_bind.giProbeIsInterior.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun giProbeSetBias(probe: RID, bias: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(bias))
    __method_bind.giProbeSetBias.call(this._handle, _args)
  }

  fun giProbeSetBounds(probe: RID, bounds: AABB) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(bounds))
    __method_bind.giProbeSetBounds.call(this._handle, _args)
  }

  fun giProbeSetCellSize(probe: RID, range: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(range))
    __method_bind.giProbeSetCellSize.call(this._handle, _args)
  }

  fun giProbeSetCompress(probe: RID, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(enable))
    __method_bind.giProbeSetCompress.call(this._handle, _args)
  }

  fun giProbeSetDynamicData(probe: RID, data: PoolIntArray) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(data))
    __method_bind.giProbeSetDynamicData.call(this._handle, _args)
  }

  fun giProbeSetDynamicRange(probe: RID, range: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(range))
    __method_bind.giProbeSetDynamicRange.call(this._handle, _args)
  }

  fun giProbeSetEnergy(probe: RID, energy: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(energy))
    __method_bind.giProbeSetEnergy.call(this._handle, _args)
  }

  fun giProbeSetInterior(probe: RID, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(enable))
    __method_bind.giProbeSetInterior.call(this._handle, _args)
  }

  fun giProbeSetNormalBias(probe: RID, bias: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(bias))
    __method_bind.giProbeSetNormalBias.call(this._handle, _args)
  }

  fun giProbeSetPropagation(probe: RID, propagation: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(propagation))
    __method_bind.giProbeSetPropagation.call(this._handle, _args)
  }

  fun giProbeSetToCellXform(probe: RID, xform: Transform) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(xform))
    __method_bind.giProbeSetToCellXform.call(this._handle, _args)
  }

  fun hasChanged(): Boolean {
    val _ret = __method_bind.hasChanged.call(this._handle)
    return _ret.asBoolean()
  }

  fun hasFeature(feature: Int): Boolean {
    val _arg = Variant(feature)
    val _ret = __method_bind.hasFeature.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun hasOsFeature(feature: String): Boolean {
    val _arg = Variant(feature)
    val _ret = __method_bind.hasOsFeature.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun immediateBegin(
    immediate: RID,
    primitive: Int,
    texture: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(immediate))
    _args.add(Variant.fromAny(primitive))
    _args.add(Variant.fromAny(texture))
    __method_bind.immediateBegin.call(this._handle, _args)
  }

  fun immediateClear(immediate: RID) {
    val _arg = Variant(immediate)
    __method_bind.immediateClear.call(this._handle, listOf(_arg))
  }

  fun immediateColor(immediate: RID, color: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(immediate))
    _args.add(Variant.fromAny(color))
    __method_bind.immediateColor.call(this._handle, _args)
  }

  fun immediateCreate(): RID {
    val _ret = __method_bind.immediateCreate.call(this._handle)
    return _ret.asRID()
  }

  fun immediateEnd(immediate: RID) {
    val _arg = Variant(immediate)
    __method_bind.immediateEnd.call(this._handle, listOf(_arg))
  }

  fun immediateGetMaterial(immediate: RID): RID {
    val _arg = Variant(immediate)
    val _ret = __method_bind.immediateGetMaterial.call(this._handle, listOf(_arg))
    return _ret.asRID()
  }

  fun immediateNormal(immediate: RID, normal: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(immediate))
    _args.add(Variant.fromAny(normal))
    __method_bind.immediateNormal.call(this._handle, _args)
  }

  fun immediateSetMaterial(immediate: RID, material: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(immediate))
    _args.add(Variant.fromAny(material))
    __method_bind.immediateSetMaterial.call(this._handle, _args)
  }

  fun immediateTangent(immediate: RID, tangent: Plane) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(immediate))
    _args.add(Variant.fromAny(tangent))
    __method_bind.immediateTangent.call(this._handle, _args)
  }

  fun immediateUv(immediate: RID, texUv: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(immediate))
    _args.add(Variant.fromAny(texUv))
    __method_bind.immediateUv.call(this._handle, _args)
  }

  fun immediateUv2(immediate: RID, texUv: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(immediate))
    _args.add(Variant.fromAny(texUv))
    __method_bind.immediateUv2.call(this._handle, _args)
  }

  fun immediateVertex(immediate: RID, vertex: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(immediate))
    _args.add(Variant.fromAny(vertex))
    __method_bind.immediateVertex.call(this._handle, _args)
  }

  fun immediateVertex2d(immediate: RID, vertex: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(immediate))
    _args.add(Variant.fromAny(vertex))
    __method_bind.immediateVertex2d.call(this._handle, _args)
  }

  fun init() {
    __method_bind.init.call(this._handle)
  }

  fun instanceAttachObjectInstanceId(instance: RID, id: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(id))
    __method_bind.instanceAttachObjectInstanceId.call(this._handle, _args)
  }

  fun instanceAttachSkeleton(instance: RID, skeleton: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(skeleton))
    __method_bind.instanceAttachSkeleton.call(this._handle, _args)
  }

  fun instanceCreate(): RID {
    val _ret = __method_bind.instanceCreate.call(this._handle)
    return _ret.asRID()
  }

  fun instanceCreate2(base: RID, scenario: RID): RID {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(base))
    _args.add(Variant.fromAny(scenario))
    val _ret = __method_bind.instanceCreate2.call(this._handle, _args)
    return _ret.asRID()
  }

  fun instanceGeometrySetAsInstanceLod(instance: RID, asLodOfInstance: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(asLodOfInstance))
    __method_bind.instanceGeometrySetAsInstanceLod.call(this._handle, _args)
  }

  fun instanceGeometrySetCastShadowsSetting(instance: RID, shadowCastingSetting: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(shadowCastingSetting))
    __method_bind.instanceGeometrySetCastShadowsSetting.call(this._handle, _args)
  }

  fun instanceGeometrySetDrawRange(
    instance: RID,
    min: Float,
    max: Float,
    minMargin: Float,
    maxMargin: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(min))
    _args.add(Variant.fromAny(max))
    _args.add(Variant.fromAny(minMargin))
    _args.add(Variant.fromAny(maxMargin))
    __method_bind.instanceGeometrySetDrawRange.call(this._handle, _args)
  }

  fun instanceGeometrySetFlag(
    instance: RID,
    flag: Int,
    enabled: Boolean
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(flag))
    _args.add(Variant.fromAny(enabled))
    __method_bind.instanceGeometrySetFlag.call(this._handle, _args)
  }

  fun instanceGeometrySetMaterialOverride(instance: RID, material: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(material))
    __method_bind.instanceGeometrySetMaterialOverride.call(this._handle, _args)
  }

  fun instanceSetBase(instance: RID, base: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(base))
    __method_bind.instanceSetBase.call(this._handle, _args)
  }

  fun instanceSetBlendShapeWeight(
    instance: RID,
    shape: Int,
    weight: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(shape))
    _args.add(Variant.fromAny(weight))
    __method_bind.instanceSetBlendShapeWeight.call(this._handle, _args)
  }

  fun instanceSetCustomAabb(instance: RID, aabb: AABB) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(aabb))
    __method_bind.instanceSetCustomAabb.call(this._handle, _args)
  }

  fun instanceSetExterior(instance: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(enabled))
    __method_bind.instanceSetExterior.call(this._handle, _args)
  }

  fun instanceSetExtraVisibilityMargin(instance: RID, margin: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(margin))
    __method_bind.instanceSetExtraVisibilityMargin.call(this._handle, _args)
  }

  fun instanceSetLayerMask(instance: RID, mask: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(mask))
    __method_bind.instanceSetLayerMask.call(this._handle, _args)
  }

  fun instanceSetScenario(instance: RID, scenario: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(scenario))
    __method_bind.instanceSetScenario.call(this._handle, _args)
  }

  fun instanceSetSurfaceMaterial(
    instance: RID,
    surface: Int,
    material: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(surface))
    _args.add(Variant.fromAny(material))
    __method_bind.instanceSetSurfaceMaterial.call(this._handle, _args)
  }

  fun instanceSetTransform(instance: RID, transform: Transform) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(transform))
    __method_bind.instanceSetTransform.call(this._handle, _args)
  }

  fun instanceSetUseLightmap(
    instance: RID,
    lightmapInstance: RID,
    lightmap: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(lightmapInstance))
    _args.add(Variant.fromAny(lightmap))
    __method_bind.instanceSetUseLightmap.call(this._handle, _args)
  }

  fun instanceSetVisible(instance: RID, visible: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(instance))
    _args.add(Variant.fromAny(visible))
    __method_bind.instanceSetVisible.call(this._handle, _args)
  }

  fun instancesCullAabb(aabb: AABB, scenario: RID): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(aabb))
    _args.add(Variant.fromAny(scenario))
    val _ret = __method_bind.instancesCullAabb.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun instancesCullConvex(convex: VariantArray, scenario: RID): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(convex))
    _args.add(Variant.fromAny(scenario))
    val _ret = __method_bind.instancesCullConvex.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun instancesCullRay(
    from: Vector3,
    to: Vector3,
    scenario: RID
  ): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(from))
    _args.add(Variant.fromAny(to))
    _args.add(Variant.fromAny(scenario))
    val _ret = __method_bind.instancesCullRay.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun lightDirectionalSetBlendSplits(light: RID, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(enable))
    __method_bind.lightDirectionalSetBlendSplits.call(this._handle, _args)
  }

  fun lightDirectionalSetShadowDepthRangeMode(light: RID, rangeMode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(rangeMode))
    __method_bind.lightDirectionalSetShadowDepthRangeMode.call(this._handle, _args)
  }

  fun lightDirectionalSetShadowMode(light: RID, mode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(mode))
    __method_bind.lightDirectionalSetShadowMode.call(this._handle, _args)
  }

  fun lightOmniSetShadowDetail(light: RID, detail: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(detail))
    __method_bind.lightOmniSetShadowDetail.call(this._handle, _args)
  }

  fun lightOmniSetShadowMode(light: RID, mode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(mode))
    __method_bind.lightOmniSetShadowMode.call(this._handle, _args)
  }

  fun lightSetColor(light: RID, color: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(color))
    __method_bind.lightSetColor.call(this._handle, _args)
  }

  fun lightSetCullMask(light: RID, mask: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(mask))
    __method_bind.lightSetCullMask.call(this._handle, _args)
  }

  fun lightSetNegative(light: RID, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(enable))
    __method_bind.lightSetNegative.call(this._handle, _args)
  }

  fun lightSetParam(
    light: RID,
    param: Int,
    value: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.lightSetParam.call(this._handle, _args)
  }

  fun lightSetProjector(light: RID, texture: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(texture))
    __method_bind.lightSetProjector.call(this._handle, _args)
  }

  fun lightSetReverseCullFaceMode(light: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(enabled))
    __method_bind.lightSetReverseCullFaceMode.call(this._handle, _args)
  }

  fun lightSetShadow(light: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(enabled))
    __method_bind.lightSetShadow.call(this._handle, _args)
  }

  fun lightSetShadowColor(light: RID, color: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(color))
    __method_bind.lightSetShadowColor.call(this._handle, _args)
  }

  fun lightSetUseGi(light: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(light))
    _args.add(Variant.fromAny(enabled))
    __method_bind.lightSetUseGi.call(this._handle, _args)
  }

  fun lightmapCaptureCreate(): RID {
    val _ret = __method_bind.lightmapCaptureCreate.call(this._handle)
    return _ret.asRID()
  }

  fun lightmapCaptureGetBounds(capture: RID): AABB {
    val _arg = Variant(capture)
    val _ret = __method_bind.lightmapCaptureGetBounds.call(this._handle, listOf(_arg))
    return _ret.asAABB()
  }

  fun lightmapCaptureGetEnergy(capture: RID): Float {
    val _arg = Variant(capture)
    val _ret = __method_bind.lightmapCaptureGetEnergy.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun lightmapCaptureGetOctree(capture: RID): PoolByteArray {
    val _arg = Variant(capture)
    val _ret = __method_bind.lightmapCaptureGetOctree.call(this._handle, listOf(_arg))
    return _ret.asPoolByteArray()
  }

  fun lightmapCaptureGetOctreeCellSubdiv(capture: RID): Int {
    val _arg = Variant(capture)
    val _ret = __method_bind.lightmapCaptureGetOctreeCellSubdiv.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun lightmapCaptureGetOctreeCellTransform(capture: RID): Transform {
    val _arg = Variant(capture)
    val _ret = __method_bind.lightmapCaptureGetOctreeCellTransform.call(this._handle, listOf(_arg))
    return _ret.asTransform()
  }

  fun lightmapCaptureSetBounds(capture: RID, bounds: AABB) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(capture))
    _args.add(Variant.fromAny(bounds))
    __method_bind.lightmapCaptureSetBounds.call(this._handle, _args)
  }

  fun lightmapCaptureSetEnergy(capture: RID, energy: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(capture))
    _args.add(Variant.fromAny(energy))
    __method_bind.lightmapCaptureSetEnergy.call(this._handle, _args)
  }

  fun lightmapCaptureSetOctree(capture: RID, octree: PoolByteArray) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(capture))
    _args.add(Variant.fromAny(octree))
    __method_bind.lightmapCaptureSetOctree.call(this._handle, _args)
  }

  fun lightmapCaptureSetOctreeCellSubdiv(capture: RID, subdiv: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(capture))
    _args.add(Variant.fromAny(subdiv))
    __method_bind.lightmapCaptureSetOctreeCellSubdiv.call(this._handle, _args)
  }

  fun lightmapCaptureSetOctreeCellTransform(capture: RID, xform: Transform) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(capture))
    _args.add(Variant.fromAny(xform))
    __method_bind.lightmapCaptureSetOctreeCellTransform.call(this._handle, _args)
  }

  fun makeSphereMesh(
    latitudes: Int,
    longitudes: Int,
    radius: Float
  ): RID {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(latitudes))
    _args.add(Variant.fromAny(longitudes))
    _args.add(Variant.fromAny(radius))
    val _ret = __method_bind.makeSphereMesh.call(this._handle, _args)
    return _ret.asRID()
  }

  fun materialCreate(): RID {
    val _ret = __method_bind.materialCreate.call(this._handle)
    return _ret.asRID()
  }

  fun materialGetParam(material: RID, parameter: String): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(material))
    _args.add(Variant.fromAny(parameter))
    val _ret = __method_bind.materialGetParam.call(this._handle, _args)
    return _ret
  }

  fun materialGetParamDefault(material: RID, parameter: String): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(material))
    _args.add(Variant.fromAny(parameter))
    val _ret = __method_bind.materialGetParamDefault.call(this._handle, _args)
    return _ret
  }

  fun materialGetShader(shaderMaterial: RID): RID {
    val _arg = Variant(shaderMaterial)
    val _ret = __method_bind.materialGetShader.call(this._handle, listOf(_arg))
    return _ret.asRID()
  }

  fun materialSetLineWidth(material: RID, width: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(material))
    _args.add(Variant.fromAny(width))
    __method_bind.materialSetLineWidth.call(this._handle, _args)
  }

  fun materialSetNextPass(material: RID, nextMaterial: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(material))
    _args.add(Variant.fromAny(nextMaterial))
    __method_bind.materialSetNextPass.call(this._handle, _args)
  }

  fun materialSetParam(
    material: RID,
    parameter: String,
    value: Variant
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(material))
    _args.add(Variant.fromAny(parameter))
    _args.add(Variant.fromAny(value))
    __method_bind.materialSetParam.call(this._handle, _args)
  }

  fun materialSetRenderPriority(material: RID, priority: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(material))
    _args.add(Variant.fromAny(priority))
    __method_bind.materialSetRenderPriority.call(this._handle, _args)
  }

  fun materialSetShader(shaderMaterial: RID, shader: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(shaderMaterial))
    _args.add(Variant.fromAny(shader))
    __method_bind.materialSetShader.call(this._handle, _args)
  }

  fun meshAddSurfaceFromArrays(
    mesh: RID,
    primitive: Int,
    arrays: VariantArray,
    blendShapes: VariantArray,
    compressFormat: Int = 97280
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(primitive))
    _args.add(Variant.fromAny(arrays))
    _args.add(Variant.fromAny(blendShapes))
    _args.add(Variant.fromAny(compressFormat))
    __method_bind.meshAddSurfaceFromArrays.call(this._handle, _args)
  }

  fun meshClear(mesh: RID) {
    val _arg = Variant(mesh)
    __method_bind.meshClear.call(this._handle, listOf(_arg))
  }

  fun meshCreate(): RID {
    val _ret = __method_bind.meshCreate.call(this._handle)
    return _ret.asRID()
  }

  fun meshGetBlendShapeCount(mesh: RID): Int {
    val _arg = Variant(mesh)
    val _ret = __method_bind.meshGetBlendShapeCount.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun meshGetBlendShapeMode(mesh: RID): VisualServer.BlendShapeMode {
    val _arg = Variant(mesh)
    val _ret = __method_bind.meshGetBlendShapeMode.call(this._handle, listOf(_arg))
    return VisualServer.BlendShapeMode.from(_ret.asInt())
  }

  fun meshGetCustomAabb(mesh: RID): AABB {
    val _arg = Variant(mesh)
    val _ret = __method_bind.meshGetCustomAabb.call(this._handle, listOf(_arg))
    return _ret.asAABB()
  }

  fun meshGetSurfaceCount(mesh: RID): Int {
    val _arg = Variant(mesh)
    val _ret = __method_bind.meshGetSurfaceCount.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun meshRemoveSurface(mesh: RID, index: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(index))
    __method_bind.meshRemoveSurface.call(this._handle, _args)
  }

  fun meshSetBlendShapeCount(mesh: RID, amount: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(amount))
    __method_bind.meshSetBlendShapeCount.call(this._handle, _args)
  }

  fun meshSetBlendShapeMode(mesh: RID, mode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(mode))
    __method_bind.meshSetBlendShapeMode.call(this._handle, _args)
  }

  fun meshSetCustomAabb(mesh: RID, aabb: AABB) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(aabb))
    __method_bind.meshSetCustomAabb.call(this._handle, _args)
  }

  fun meshSurfaceGetAabb(mesh: RID, surface: Int): AABB {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(surface))
    val _ret = __method_bind.meshSurfaceGetAabb.call(this._handle, _args)
    return _ret.asAABB()
  }

  fun meshSurfaceGetArray(mesh: RID, surface: Int): PoolByteArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(surface))
    val _ret = __method_bind.meshSurfaceGetArray.call(this._handle, _args)
    return _ret.asPoolByteArray()
  }

  fun meshSurfaceGetArrayIndexLen(mesh: RID, surface: Int): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(surface))
    val _ret = __method_bind.meshSurfaceGetArrayIndexLen.call(this._handle, _args)
    return _ret.asInt()
  }

  fun meshSurfaceGetArrayLen(mesh: RID, surface: Int): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(surface))
    val _ret = __method_bind.meshSurfaceGetArrayLen.call(this._handle, _args)
    return _ret.asInt()
  }

  fun meshSurfaceGetArrays(mesh: RID, surface: Int): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(surface))
    val _ret = __method_bind.meshSurfaceGetArrays.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun meshSurfaceGetBlendShapeArrays(mesh: RID, surface: Int): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(surface))
    val _ret = __method_bind.meshSurfaceGetBlendShapeArrays.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun meshSurfaceGetFormat(mesh: RID, surface: Int): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(surface))
    val _ret = __method_bind.meshSurfaceGetFormat.call(this._handle, _args)
    return _ret.asInt()
  }

  fun meshSurfaceGetFormatOffset(
    format: Int,
    vertexLen: Int,
    indexLen: Int,
    arrayIndex: Int
  ): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(format))
    _args.add(Variant.fromAny(vertexLen))
    _args.add(Variant.fromAny(indexLen))
    _args.add(Variant.fromAny(arrayIndex))
    val _ret = __method_bind.meshSurfaceGetFormatOffset.call(this._handle, _args)
    return _ret.asInt()
  }

  fun meshSurfaceGetFormatStride(
    format: Int,
    vertexLen: Int,
    indexLen: Int
  ): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(format))
    _args.add(Variant.fromAny(vertexLen))
    _args.add(Variant.fromAny(indexLen))
    val _ret = __method_bind.meshSurfaceGetFormatStride.call(this._handle, _args)
    return _ret.asInt()
  }

  fun meshSurfaceGetIndexArray(mesh: RID, surface: Int): PoolByteArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(surface))
    val _ret = __method_bind.meshSurfaceGetIndexArray.call(this._handle, _args)
    return _ret.asPoolByteArray()
  }

  fun meshSurfaceGetMaterial(mesh: RID, surface: Int): RID {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(surface))
    val _ret = __method_bind.meshSurfaceGetMaterial.call(this._handle, _args)
    return _ret.asRID()
  }

  fun meshSurfaceGetPrimitiveType(mesh: RID, surface: Int): VisualServer.PrimitiveType {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(surface))
    val _ret = __method_bind.meshSurfaceGetPrimitiveType.call(this._handle, _args)
    return VisualServer.PrimitiveType.from(_ret.asInt())
  }

  fun meshSurfaceGetSkeletonAabb(mesh: RID, surface: Int): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(surface))
    val _ret = __method_bind.meshSurfaceGetSkeletonAabb.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun meshSurfaceSetMaterial(
    mesh: RID,
    surface: Int,
    material: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(surface))
    _args.add(Variant.fromAny(material))
    __method_bind.meshSurfaceSetMaterial.call(this._handle, _args)
  }

  fun meshSurfaceUpdateRegion(
    mesh: RID,
    surface: Int,
    offset: Int,
    data: PoolByteArray
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mesh))
    _args.add(Variant.fromAny(surface))
    _args.add(Variant.fromAny(offset))
    _args.add(Variant.fromAny(data))
    __method_bind.meshSurfaceUpdateRegion.call(this._handle, _args)
  }

  fun multimeshAllocate(
    multimesh: RID,
    instances: Int,
    transformFormat: Int,
    colorFormat: Int,
    customDataFormat: Int = 0
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(multimesh))
    _args.add(Variant.fromAny(instances))
    _args.add(Variant.fromAny(transformFormat))
    _args.add(Variant.fromAny(colorFormat))
    _args.add(Variant.fromAny(customDataFormat))
    __method_bind.multimeshAllocate.call(this._handle, _args)
  }

  fun multimeshCreate(): RID {
    val _ret = __method_bind.multimeshCreate.call(this._handle)
    return _ret.asRID()
  }

  fun multimeshGetAabb(multimesh: RID): AABB {
    val _arg = Variant(multimesh)
    val _ret = __method_bind.multimeshGetAabb.call(this._handle, listOf(_arg))
    return _ret.asAABB()
  }

  fun multimeshGetInstanceCount(multimesh: RID): Int {
    val _arg = Variant(multimesh)
    val _ret = __method_bind.multimeshGetInstanceCount.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun multimeshGetMesh(multimesh: RID): RID {
    val _arg = Variant(multimesh)
    val _ret = __method_bind.multimeshGetMesh.call(this._handle, listOf(_arg))
    return _ret.asRID()
  }

  fun multimeshGetVisibleInstances(multimesh: RID): Int {
    val _arg = Variant(multimesh)
    val _ret = __method_bind.multimeshGetVisibleInstances.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun multimeshInstanceGetColor(multimesh: RID, index: Int): Color {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(multimesh))
    _args.add(Variant.fromAny(index))
    val _ret = __method_bind.multimeshInstanceGetColor.call(this._handle, _args)
    return _ret.asColor()
  }

  fun multimeshInstanceGetCustomData(multimesh: RID, index: Int): Color {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(multimesh))
    _args.add(Variant.fromAny(index))
    val _ret = __method_bind.multimeshInstanceGetCustomData.call(this._handle, _args)
    return _ret.asColor()
  }

  fun multimeshInstanceGetTransform(multimesh: RID, index: Int): Transform {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(multimesh))
    _args.add(Variant.fromAny(index))
    val _ret = __method_bind.multimeshInstanceGetTransform.call(this._handle, _args)
    return _ret.asTransform()
  }

  fun multimeshInstanceGetTransform2d(multimesh: RID, index: Int): Transform2D {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(multimesh))
    _args.add(Variant.fromAny(index))
    val _ret = __method_bind.multimeshInstanceGetTransform2d.call(this._handle, _args)
    return _ret.asTransform2D()
  }

  fun multimeshInstanceSetColor(
    multimesh: RID,
    index: Int,
    color: Color
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(multimesh))
    _args.add(Variant.fromAny(index))
    _args.add(Variant.fromAny(color))
    __method_bind.multimeshInstanceSetColor.call(this._handle, _args)
  }

  fun multimeshInstanceSetCustomData(
    multimesh: RID,
    index: Int,
    customData: Color
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(multimesh))
    _args.add(Variant.fromAny(index))
    _args.add(Variant.fromAny(customData))
    __method_bind.multimeshInstanceSetCustomData.call(this._handle, _args)
  }

  fun multimeshInstanceSetTransform(
    multimesh: RID,
    index: Int,
    transform: Transform
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(multimesh))
    _args.add(Variant.fromAny(index))
    _args.add(Variant.fromAny(transform))
    __method_bind.multimeshInstanceSetTransform.call(this._handle, _args)
  }

  fun multimeshInstanceSetTransform2d(
    multimesh: RID,
    index: Int,
    transform: Transform2D
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(multimesh))
    _args.add(Variant.fromAny(index))
    _args.add(Variant.fromAny(transform))
    __method_bind.multimeshInstanceSetTransform2d.call(this._handle, _args)
  }

  fun multimeshSetAsBulkArray(multimesh: RID, array: PoolFloatArray) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(multimesh))
    _args.add(Variant.fromAny(array))
    __method_bind.multimeshSetAsBulkArray.call(this._handle, _args)
  }

  fun multimeshSetMesh(multimesh: RID, mesh: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(multimesh))
    _args.add(Variant.fromAny(mesh))
    __method_bind.multimeshSetMesh.call(this._handle, _args)
  }

  fun multimeshSetVisibleInstances(multimesh: RID, visible: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(multimesh))
    _args.add(Variant.fromAny(visible))
    __method_bind.multimeshSetVisibleInstances.call(this._handle, _args)
  }

  fun omniLightCreate(): RID {
    val _ret = __method_bind.omniLightCreate.call(this._handle)
    return _ret.asRID()
  }

  fun particlesCreate(): RID {
    val _ret = __method_bind.particlesCreate.call(this._handle)
    return _ret.asRID()
  }

  fun particlesGetCurrentAabb(particles: RID): AABB {
    val _arg = Variant(particles)
    val _ret = __method_bind.particlesGetCurrentAabb.call(this._handle, listOf(_arg))
    return _ret.asAABB()
  }

  fun particlesGetEmitting(particles: RID): Boolean {
    val _arg = Variant(particles)
    val _ret = __method_bind.particlesGetEmitting.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun particlesIsInactive(particles: RID): Boolean {
    val _arg = Variant(particles)
    val _ret = __method_bind.particlesIsInactive.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun particlesRequestProcess(particles: RID) {
    val _arg = Variant(particles)
    __method_bind.particlesRequestProcess.call(this._handle, listOf(_arg))
  }

  fun particlesRestart(particles: RID) {
    val _arg = Variant(particles)
    __method_bind.particlesRestart.call(this._handle, listOf(_arg))
  }

  fun particlesSetAmount(particles: RID, amount: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(amount))
    __method_bind.particlesSetAmount.call(this._handle, _args)
  }

  fun particlesSetCustomAabb(particles: RID, aabb: AABB) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(aabb))
    __method_bind.particlesSetCustomAabb.call(this._handle, _args)
  }

  fun particlesSetDrawOrder(particles: RID, order: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(order))
    __method_bind.particlesSetDrawOrder.call(this._handle, _args)
  }

  fun particlesSetDrawPassMesh(
    particles: RID,
    pass: Int,
    mesh: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(pass))
    _args.add(Variant.fromAny(mesh))
    __method_bind.particlesSetDrawPassMesh.call(this._handle, _args)
  }

  fun particlesSetDrawPasses(particles: RID, count: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(count))
    __method_bind.particlesSetDrawPasses.call(this._handle, _args)
  }

  fun particlesSetEmissionTransform(particles: RID, transform: Transform) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(transform))
    __method_bind.particlesSetEmissionTransform.call(this._handle, _args)
  }

  fun particlesSetEmitting(particles: RID, emitting: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(emitting))
    __method_bind.particlesSetEmitting.call(this._handle, _args)
  }

  fun particlesSetExplosivenessRatio(particles: RID, ratio: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(ratio))
    __method_bind.particlesSetExplosivenessRatio.call(this._handle, _args)
  }

  fun particlesSetFixedFps(particles: RID, fps: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(fps))
    __method_bind.particlesSetFixedFps.call(this._handle, _args)
  }

  fun particlesSetFractionalDelta(particles: RID, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(enable))
    __method_bind.particlesSetFractionalDelta.call(this._handle, _args)
  }

  fun particlesSetLifetime(particles: RID, lifetime: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(lifetime))
    __method_bind.particlesSetLifetime.call(this._handle, _args)
  }

  fun particlesSetOneShot(particles: RID, oneShot: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(oneShot))
    __method_bind.particlesSetOneShot.call(this._handle, _args)
  }

  fun particlesSetPreProcessTime(particles: RID, time: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(time))
    __method_bind.particlesSetPreProcessTime.call(this._handle, _args)
  }

  fun particlesSetProcessMaterial(particles: RID, material: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(material))
    __method_bind.particlesSetProcessMaterial.call(this._handle, _args)
  }

  fun particlesSetRandomnessRatio(particles: RID, ratio: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(ratio))
    __method_bind.particlesSetRandomnessRatio.call(this._handle, _args)
  }

  fun particlesSetSpeedScale(particles: RID, scale: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(scale))
    __method_bind.particlesSetSpeedScale.call(this._handle, _args)
  }

  fun particlesSetUseLocalCoordinates(particles: RID, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(particles))
    _args.add(Variant.fromAny(enable))
    __method_bind.particlesSetUseLocalCoordinates.call(this._handle, _args)
  }

  fun reflectionProbeCreate(): RID {
    val _ret = __method_bind.reflectionProbeCreate.call(this._handle)
    return _ret.asRID()
  }

  fun reflectionProbeSetAsInterior(probe: RID, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(enable))
    __method_bind.reflectionProbeSetAsInterior.call(this._handle, _args)
  }

  fun reflectionProbeSetCullMask(probe: RID, layers: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(layers))
    __method_bind.reflectionProbeSetCullMask.call(this._handle, _args)
  }

  fun reflectionProbeSetEnableBoxProjection(probe: RID, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(enable))
    __method_bind.reflectionProbeSetEnableBoxProjection.call(this._handle, _args)
  }

  fun reflectionProbeSetEnableShadows(probe: RID, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(enable))
    __method_bind.reflectionProbeSetEnableShadows.call(this._handle, _args)
  }

  fun reflectionProbeSetExtents(probe: RID, extents: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(extents))
    __method_bind.reflectionProbeSetExtents.call(this._handle, _args)
  }

  fun reflectionProbeSetIntensity(probe: RID, intensity: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(intensity))
    __method_bind.reflectionProbeSetIntensity.call(this._handle, _args)
  }

  fun reflectionProbeSetInteriorAmbient(probe: RID, color: Color) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(color))
    __method_bind.reflectionProbeSetInteriorAmbient.call(this._handle, _args)
  }

  fun reflectionProbeSetInteriorAmbientEnergy(probe: RID, energy: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(energy))
    __method_bind.reflectionProbeSetInteriorAmbientEnergy.call(this._handle, _args)
  }

  fun reflectionProbeSetInteriorAmbientProbeContribution(probe: RID, contrib: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(contrib))
    __method_bind.reflectionProbeSetInteriorAmbientProbeContribution.call(this._handle, _args)
  }

  fun reflectionProbeSetMaxDistance(probe: RID, distance: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(distance))
    __method_bind.reflectionProbeSetMaxDistance.call(this._handle, _args)
  }

  fun reflectionProbeSetOriginOffset(probe: RID, offset: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(offset))
    __method_bind.reflectionProbeSetOriginOffset.call(this._handle, _args)
  }

  fun reflectionProbeSetUpdateMode(probe: RID, mode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(probe))
    _args.add(Variant.fromAny(mode))
    __method_bind.reflectionProbeSetUpdateMode.call(this._handle, _args)
  }

  fun requestFrameDrawnCallback(
    where: Object,
    method: String,
    userdata: Variant
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(where))
    _args.add(Variant.fromAny(method))
    _args.add(Variant.fromAny(userdata))
    __method_bind.requestFrameDrawnCallback.call(this._handle, _args)
  }

  fun scenarioCreate(): RID {
    val _ret = __method_bind.scenarioCreate.call(this._handle)
    return _ret.asRID()
  }

  fun scenarioSetDebug(scenario: RID, debugMode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(scenario))
    _args.add(Variant.fromAny(debugMode))
    __method_bind.scenarioSetDebug.call(this._handle, _args)
  }

  fun scenarioSetEnvironment(scenario: RID, environment: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(scenario))
    _args.add(Variant.fromAny(environment))
    __method_bind.scenarioSetEnvironment.call(this._handle, _args)
  }

  fun scenarioSetFallbackEnvironment(scenario: RID, environment: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(scenario))
    _args.add(Variant.fromAny(environment))
    __method_bind.scenarioSetFallbackEnvironment.call(this._handle, _args)
  }

  fun scenarioSetReflectionAtlasSize(
    scenario: RID,
    size: Int,
    subdiv: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(scenario))
    _args.add(Variant.fromAny(size))
    _args.add(Variant.fromAny(subdiv))
    __method_bind.scenarioSetReflectionAtlasSize.call(this._handle, _args)
  }

  fun setBootImage(
    image: Image,
    color: Color,
    scale: Boolean,
    useFilter: Boolean = true
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(image))
    _args.add(Variant.fromAny(color))
    _args.add(Variant.fromAny(scale))
    _args.add(Variant.fromAny(useFilter))
    __method_bind.setBootImage.call(this._handle, _args)
  }

  fun setDebugGenerateWireframes(generate: Boolean) {
    val _arg = Variant(generate)
    __method_bind.setDebugGenerateWireframes.call(this._handle, listOf(_arg))
  }

  fun setDefaultClearColor(color: Color) {
    val _arg = Variant(color)
    __method_bind.setDefaultClearColor.call(this._handle, listOf(_arg))
  }

  fun shaderCreate(): RID {
    val _ret = __method_bind.shaderCreate.call(this._handle)
    return _ret.asRID()
  }

  fun shaderGetCode(shader: RID): String {
    val _arg = Variant(shader)
    val _ret = __method_bind.shaderGetCode.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun shaderGetDefaultTextureParam(shader: RID, name: String): RID {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(shader))
    _args.add(Variant.fromAny(name))
    val _ret = __method_bind.shaderGetDefaultTextureParam.call(this._handle, _args)
    return _ret.asRID()
  }

  fun shaderGetParamList(shader: RID): VariantArray {
    val _arg = Variant(shader)
    val _ret = __method_bind.shaderGetParamList.call(this._handle, listOf(_arg))
    return _ret.asVariantArray()
  }

  fun shaderSetCode(shader: RID, code: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(shader))
    _args.add(Variant.fromAny(code))
    __method_bind.shaderSetCode.call(this._handle, _args)
  }

  fun shaderSetDefaultTextureParam(
    shader: RID,
    name: String,
    texture: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(shader))
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(texture))
    __method_bind.shaderSetDefaultTextureParam.call(this._handle, _args)
  }

  fun skeletonAllocate(
    skeleton: RID,
    bones: Int,
    is2dSkeleton: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(skeleton))
    _args.add(Variant.fromAny(bones))
    _args.add(Variant.fromAny(is2dSkeleton))
    __method_bind.skeletonAllocate.call(this._handle, _args)
  }

  fun skeletonBoneGetTransform(skeleton: RID, bone: Int): Transform {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(skeleton))
    _args.add(Variant.fromAny(bone))
    val _ret = __method_bind.skeletonBoneGetTransform.call(this._handle, _args)
    return _ret.asTransform()
  }

  fun skeletonBoneGetTransform2d(skeleton: RID, bone: Int): Transform2D {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(skeleton))
    _args.add(Variant.fromAny(bone))
    val _ret = __method_bind.skeletonBoneGetTransform2d.call(this._handle, _args)
    return _ret.asTransform2D()
  }

  fun skeletonBoneSetTransform(
    skeleton: RID,
    bone: Int,
    transform: Transform
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(skeleton))
    _args.add(Variant.fromAny(bone))
    _args.add(Variant.fromAny(transform))
    __method_bind.skeletonBoneSetTransform.call(this._handle, _args)
  }

  fun skeletonBoneSetTransform2d(
    skeleton: RID,
    bone: Int,
    transform: Transform2D
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(skeleton))
    _args.add(Variant.fromAny(bone))
    _args.add(Variant.fromAny(transform))
    __method_bind.skeletonBoneSetTransform2d.call(this._handle, _args)
  }

  fun skeletonCreate(): RID {
    val _ret = __method_bind.skeletonCreate.call(this._handle)
    return _ret.asRID()
  }

  fun skeletonGetBoneCount(skeleton: RID): Int {
    val _arg = Variant(skeleton)
    val _ret = __method_bind.skeletonGetBoneCount.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun skyCreate(): RID {
    val _ret = __method_bind.skyCreate.call(this._handle)
    return _ret.asRID()
  }

  fun skySetTexture(
    sky: RID,
    cubeMap: RID,
    radianceSize: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(sky))
    _args.add(Variant.fromAny(cubeMap))
    _args.add(Variant.fromAny(radianceSize))
    __method_bind.skySetTexture.call(this._handle, _args)
  }

  fun spotLightCreate(): RID {
    val _ret = __method_bind.spotLightCreate.call(this._handle)
    return _ret.asRID()
  }

  fun sync() {
    __method_bind.sync.call(this._handle)
  }

  fun textureAllocate(
    texture: RID,
    width: Int,
    height: Int,
    depth3d: Int,
    format: Int,
    type: Int,
    flags: Int = 7
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(height))
    _args.add(Variant.fromAny(depth3d))
    _args.add(Variant.fromAny(format))
    _args.add(Variant.fromAny(type))
    _args.add(Variant.fromAny(flags))
    __method_bind.textureAllocate.call(this._handle, _args)
  }

  fun textureBind(texture: RID, number: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(number))
    __method_bind.textureBind.call(this._handle, _args)
  }

  fun textureCreate(): RID {
    val _ret = __method_bind.textureCreate.call(this._handle)
    return _ret.asRID()
  }

  fun textureCreateFromImage(image: Image, flags: Int = 7): RID {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(image))
    _args.add(Variant.fromAny(flags))
    val _ret = __method_bind.textureCreateFromImage.call(this._handle, _args)
    return _ret.asRID()
  }

  fun textureDebugUsage(): VariantArray {
    val _ret = __method_bind.textureDebugUsage.call(this._handle)
    return _ret.asVariantArray()
  }

  fun textureGetData(texture: RID, cubeSide: Int = 0): Image {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(cubeSide))
    val _ret = __method_bind.textureGetData.call(this._handle, _args)
    return _ret.toAny() as Image
  }

  fun textureGetDepth(texture: RID): Int {
    val _arg = Variant(texture)
    val _ret = __method_bind.textureGetDepth.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun textureGetFlags(texture: RID): Int {
    val _arg = Variant(texture)
    val _ret = __method_bind.textureGetFlags.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun textureGetFormat(texture: RID): Image.Format {
    val _arg = Variant(texture)
    val _ret = __method_bind.textureGetFormat.call(this._handle, listOf(_arg))
    return Image.Format.from(_ret.asInt())
  }

  fun textureGetHeight(texture: RID): Int {
    val _arg = Variant(texture)
    val _ret = __method_bind.textureGetHeight.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun textureGetPath(texture: RID): String {
    val _arg = Variant(texture)
    val _ret = __method_bind.textureGetPath.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun textureGetTexid(texture: RID): Int {
    val _arg = Variant(texture)
    val _ret = __method_bind.textureGetTexid.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun textureGetType(texture: RID): VisualServer.TextureType {
    val _arg = Variant(texture)
    val _ret = __method_bind.textureGetType.call(this._handle, listOf(_arg))
    return VisualServer.TextureType.from(_ret.asInt())
  }

  fun textureGetWidth(texture: RID): Int {
    val _arg = Variant(texture)
    val _ret = __method_bind.textureGetWidth.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun textureSetData(
    texture: RID,
    image: Image,
    layer: Int = 0
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(image))
    _args.add(Variant.fromAny(layer))
    __method_bind.textureSetData.call(this._handle, _args)
  }

  fun textureSetDataPartial(
    texture: RID,
    image: Image,
    srcX: Int,
    srcY: Int,
    srcW: Int,
    srcH: Int,
    dstX: Int,
    dstY: Int,
    dstMip: Int,
    layer: Int = 0
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(image))
    _args.add(Variant.fromAny(srcX))
    _args.add(Variant.fromAny(srcY))
    _args.add(Variant.fromAny(srcW))
    _args.add(Variant.fromAny(srcH))
    _args.add(Variant.fromAny(dstX))
    _args.add(Variant.fromAny(dstY))
    _args.add(Variant.fromAny(dstMip))
    _args.add(Variant.fromAny(layer))
    __method_bind.textureSetDataPartial.call(this._handle, _args)
  }

  fun textureSetFlags(texture: RID, flags: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(flags))
    __method_bind.textureSetFlags.call(this._handle, _args)
  }

  fun textureSetPath(texture: RID, path: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(path))
    __method_bind.textureSetPath.call(this._handle, _args)
  }

  fun textureSetShrinkAllX2OnSetData(shrink: Boolean) {
    val _arg = Variant(shrink)
    __method_bind.textureSetShrinkAllX2OnSetData.call(this._handle, listOf(_arg))
  }

  fun textureSetSizeOverride(
    texture: RID,
    width: Int,
    height: Int,
    depth: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(height))
    _args.add(Variant.fromAny(depth))
    __method_bind.textureSetSizeOverride.call(this._handle, _args)
  }

  fun texturesKeepOriginal(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.texturesKeepOriginal.call(this._handle, listOf(_arg))
  }

  fun viewportAttachCamera(viewport: RID, camera: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(camera))
    __method_bind.viewportAttachCamera.call(this._handle, _args)
  }

  fun viewportAttachCanvas(viewport: RID, canvas: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(canvas))
    __method_bind.viewportAttachCanvas.call(this._handle, _args)
  }

  fun viewportAttachToScreen(
    viewport: RID,
    rect: Rect2,
    screen: Int = 0
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(rect))
    _args.add(Variant.fromAny(screen))
    __method_bind.viewportAttachToScreen.call(this._handle, _args)
  }

  fun viewportCreate(): RID {
    val _ret = __method_bind.viewportCreate.call(this._handle)
    return _ret.asRID()
  }

  fun viewportDetach(viewport: RID) {
    val _arg = Variant(viewport)
    __method_bind.viewportDetach.call(this._handle, listOf(_arg))
  }

  fun viewportGetRenderInfo(viewport: RID, info: Int): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(info))
    val _ret = __method_bind.viewportGetRenderInfo.call(this._handle, _args)
    return _ret.asInt()
  }

  fun viewportGetTexture(viewport: RID): RID {
    val _arg = Variant(viewport)
    val _ret = __method_bind.viewportGetTexture.call(this._handle, listOf(_arg))
    return _ret.asRID()
  }

  fun viewportRemoveCanvas(viewport: RID, canvas: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(canvas))
    __method_bind.viewportRemoveCanvas.call(this._handle, _args)
  }

  fun viewportSetActive(viewport: RID, active: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(active))
    __method_bind.viewportSetActive.call(this._handle, _args)
  }

  fun viewportSetCanvasStacking(
    viewport: RID,
    canvas: RID,
    layer: Int,
    sublayer: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(canvas))
    _args.add(Variant.fromAny(layer))
    _args.add(Variant.fromAny(sublayer))
    __method_bind.viewportSetCanvasStacking.call(this._handle, _args)
  }

  fun viewportSetCanvasTransform(
    viewport: RID,
    canvas: RID,
    offset: Transform2D
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(canvas))
    _args.add(Variant.fromAny(offset))
    __method_bind.viewportSetCanvasTransform.call(this._handle, _args)
  }

  fun viewportSetClearMode(viewport: RID, clearMode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(clearMode))
    __method_bind.viewportSetClearMode.call(this._handle, _args)
  }

  fun viewportSetDebugDraw(viewport: RID, draw: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(draw))
    __method_bind.viewportSetDebugDraw.call(this._handle, _args)
  }

  fun viewportSetDisable3d(viewport: RID, disabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(disabled))
    __method_bind.viewportSetDisable3d.call(this._handle, _args)
  }

  fun viewportSetDisableEnvironment(viewport: RID, disabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(disabled))
    __method_bind.viewportSetDisableEnvironment.call(this._handle, _args)
  }

  fun viewportSetGlobalCanvasTransform(viewport: RID, transform: Transform2D) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(transform))
    __method_bind.viewportSetGlobalCanvasTransform.call(this._handle, _args)
  }

  fun viewportSetHdr(viewport: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(enabled))
    __method_bind.viewportSetHdr.call(this._handle, _args)
  }

  fun viewportSetHideCanvas(viewport: RID, hidden: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(hidden))
    __method_bind.viewportSetHideCanvas.call(this._handle, _args)
  }

  fun viewportSetHideScenario(viewport: RID, hidden: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(hidden))
    __method_bind.viewportSetHideScenario.call(this._handle, _args)
  }

  fun viewportSetMsaa(viewport: RID, msaa: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(msaa))
    __method_bind.viewportSetMsaa.call(this._handle, _args)
  }

  fun viewportSetParentViewport(viewport: RID, parentViewport: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(parentViewport))
    __method_bind.viewportSetParentViewport.call(this._handle, _args)
  }

  fun viewportSetRenderDirectToScreen(viewport: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(enabled))
    __method_bind.viewportSetRenderDirectToScreen.call(this._handle, _args)
  }

  fun viewportSetScenario(viewport: RID, scenario: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(scenario))
    __method_bind.viewportSetScenario.call(this._handle, _args)
  }

  fun viewportSetShadowAtlasQuadrantSubdivision(
    viewport: RID,
    quadrant: Int,
    subdivision: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(quadrant))
    _args.add(Variant.fromAny(subdivision))
    __method_bind.viewportSetShadowAtlasQuadrantSubdivision.call(this._handle, _args)
  }

  fun viewportSetShadowAtlasSize(viewport: RID, size: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(size))
    __method_bind.viewportSetShadowAtlasSize.call(this._handle, _args)
  }

  fun viewportSetSize(
    viewport: RID,
    width: Int,
    height: Int
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(height))
    __method_bind.viewportSetSize.call(this._handle, _args)
  }

  fun viewportSetTransparentBackground(viewport: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(enabled))
    __method_bind.viewportSetTransparentBackground.call(this._handle, _args)
  }

  fun viewportSetUpdateMode(viewport: RID, updateMode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(updateMode))
    __method_bind.viewportSetUpdateMode.call(this._handle, _args)
  }

  fun viewportSetUsage(viewport: RID, usage: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(usage))
    __method_bind.viewportSetUsage.call(this._handle, _args)
  }

  fun viewportSetUseArvr(viewport: RID, useArvr: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(useArvr))
    __method_bind.viewportSetUseArvr.call(this._handle, _args)
  }

  fun viewportSetVflip(viewport: RID, enabled: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(viewport))
    _args.add(Variant.fromAny(enabled))
    __method_bind.viewportSetVflip.call(this._handle, _args)
  }

  companion object {
    val ARRAY_WEIGHTS_SIZE: Int = 4

    val CANVAS_ITEM_Z_MAX: Int = 4096

    val CANVAS_ITEM_Z_MIN: Int = -4096

    val MATERIAL_RENDER_PRIORITY_MAX: Int = 127

    val MATERIAL_RENDER_PRIORITY_MIN: Int = -128

    val MAX_CURSORS: Int = 8

    val MAX_GLOW_LEVELS: Int = 7

    val NO_INDEX_ARRAY: Int = -1

    /**
     * Container for method_bind pointers for VisualServer
     */
    private object __method_bind {
      val blackBarsSetImages: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "black_bars_set_images".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method black_bars_set_images" }
        }
      val blackBarsSetMargins: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "black_bars_set_margins".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method black_bars_set_margins" }
        }
      val cameraCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "camera_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method camera_create" }
        }
      val cameraSetCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "camera_set_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method camera_set_cull_mask" }
        }
      val cameraSetEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "camera_set_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method camera_set_environment" }
        }
      val cameraSetFrustum: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "camera_set_frustum".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method camera_set_frustum" }
        }
      val cameraSetOrthogonal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "camera_set_orthogonal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method camera_set_orthogonal" }
        }
      val cameraSetPerspective: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "camera_set_perspective".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method camera_set_perspective" }
        }
      val cameraSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "camera_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method camera_set_transform" }
        }
      val cameraSetUseVerticalAspect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "camera_set_use_vertical_aspect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method camera_set_use_vertical_aspect" }
        }
      val canvasCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_create" }
        }
      val canvasItemAddCircle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_add_circle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_add_circle" }
        }
      val canvasItemAddClipIgnore: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_add_clip_ignore".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_add_clip_ignore" }
        }
      val canvasItemAddLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_add_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_add_line" }
        }
      val canvasItemAddMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_add_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_add_mesh" }
        }
      val canvasItemAddMultimesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_add_multimesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_add_multimesh" }
        }
      val canvasItemAddNinePatch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_add_nine_patch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_add_nine_patch" }
        }
      val canvasItemAddParticles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_add_particles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_add_particles" }
        }
      val canvasItemAddPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_add_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_add_polygon" }
        }
      val canvasItemAddPolyline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_add_polyline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_add_polyline" }
        }
      val canvasItemAddPrimitive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_add_primitive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_add_primitive" }
        }
      val canvasItemAddRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_add_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_add_rect" }
        }
      val canvasItemAddSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_add_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_add_set_transform" }
        }
      val canvasItemAddTextureRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_add_texture_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_add_texture_rect" }
        }
      val canvasItemAddTextureRectRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_add_texture_rect_region".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method canvas_item_add_texture_rect_region" }
        }
      val canvasItemAddTriangleArray: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_add_triangle_array".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_add_triangle_array" }
        }
      val canvasItemClear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_clear" }
        }
      val canvasItemCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_create" }
        }
      val canvasItemSetClip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_clip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_set_clip" }
        }
      val canvasItemSetCopyToBackbuffer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_copy_to_backbuffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_set_copy_to_backbuffer"
            }
        }
      val canvasItemSetCustomRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_custom_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_set_custom_rect" }
        }
      val canvasItemSetDistanceFieldMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_distance_field_mode".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method canvas_item_set_distance_field_mode" }
        }
      val canvasItemSetDrawBehindParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_draw_behind_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_set_draw_behind_parent"
            }
        }
      val canvasItemSetDrawIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_draw_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_set_draw_index" }
        }
      val canvasItemSetLightMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_light_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_set_light_mask" }
        }
      val canvasItemSetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_set_material" }
        }
      val canvasItemSetModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_set_modulate" }
        }
      val canvasItemSetParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_set_parent" }
        }
      val canvasItemSetSelfModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_self_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_set_self_modulate" }
        }
      val canvasItemSetSortChildrenByY: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_sort_children_by_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_set_sort_children_by_y"
            }
        }
      val canvasItemSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_set_transform" }
        }
      val canvasItemSetUseParentMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_use_parent_material".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method canvas_item_set_use_parent_material" }
        }
      val canvasItemSetVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_set_visible" }
        }
      val canvasItemSetZAsRelativeToParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_z_as_relative_to_parent".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method canvas_item_set_z_as_relative_to_parent" }
        }
      val canvasItemSetZIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_item_set_z_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_item_set_z_index" }
        }
      val canvasLightAttachToCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_attach_to_canvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_attach_to_canvas" }
        }
      val canvasLightCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_create" }
        }
      val canvasLightOccluderAttachToCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_occluder_attach_to_canvas".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method canvas_light_occluder_attach_to_canvas" }
        }
      val canvasLightOccluderCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_occluder_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_occluder_create" }
        }
      val canvasLightOccluderSetEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_occluder_set_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_occluder_set_enabled"
            }
        }
      val canvasLightOccluderSetLightMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_occluder_set_light_mask".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method canvas_light_occluder_set_light_mask" }
        }
      val canvasLightOccluderSetPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_occluder_set_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_occluder_set_polygon"
            }
        }
      val canvasLightOccluderSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_occluder_set_transform".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method canvas_light_occluder_set_transform" }
        }
      val canvasLightSetColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_color" }
        }
      val canvasLightSetEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_enabled" }
        }
      val canvasLightSetEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_energy" }
        }
      val canvasLightSetHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_height" }
        }
      val canvasLightSetItemCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_item_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_item_cull_mask" }
        }
      val canvasLightSetItemShadowCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_item_shadow_cull_mask".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method canvas_light_set_item_shadow_cull_mask" }
        }
      val canvasLightSetLayerRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_layer_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_layer_range" }
        }
      val canvasLightSetMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_mode" }
        }
      val canvasLightSetScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_scale" }
        }
      val canvasLightSetShadowBufferSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_shadow_buffer_size".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method canvas_light_set_shadow_buffer_size" }
        }
      val canvasLightSetShadowColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_shadow_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_shadow_color" }
        }
      val canvasLightSetShadowEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_shadow_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_shadow_enabled" }
        }
      val canvasLightSetShadowFilter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_shadow_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_shadow_filter" }
        }
      val canvasLightSetShadowGradientLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_shadow_gradient_length".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method canvas_light_set_shadow_gradient_length" }
        }
      val canvasLightSetShadowSmooth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_shadow_smooth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_shadow_smooth" }
        }
      val canvasLightSetTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_texture" }
        }
      val canvasLightSetTextureOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_texture_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_texture_offset" }
        }
      val canvasLightSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_transform" }
        }
      val canvasLightSetZRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_light_set_z_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_light_set_z_range" }
        }
      val canvasOccluderPolygonCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_occluder_polygon_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_occluder_polygon_create" }
        }
      val canvasOccluderPolygonSetCullMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_occluder_polygon_set_cull_mode".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method canvas_occluder_polygon_set_cull_mode" }
        }
      val canvasOccluderPolygonSetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_occluder_polygon_set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_occluder_polygon_set_shape"
            }
        }
      val canvasOccluderPolygonSetShapeAsLines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_occluder_polygon_set_shape_as_lines".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method canvas_occluder_polygon_set_shape_as_lines" }
        }
      val canvasSetItemMirroring: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_set_item_mirroring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_set_item_mirroring" }
        }
      val canvasSetModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvas_set_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvas_set_modulate" }
        }
      val directionalLightCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "directional_light_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method directional_light_create" }
        }
      val draw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "draw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw" }
        }
      val environmentCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_create" }
        }
      val environmentSetAdjustment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_adjustment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_adjustment" }
        }
      val environmentSetAmbientLight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_ambient_light".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_ambient_light" }
        }
      val environmentSetBackground: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_background".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_background" }
        }
      val environmentSetBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_bg_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_bg_color" }
        }
      val environmentSetBgEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_bg_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_bg_energy" }
        }
      val environmentSetCanvasMaxLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_canvas_max_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_canvas_max_layer" }
        }
      val environmentSetDofBlurFar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_dof_blur_far".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_dof_blur_far" }
        }
      val environmentSetDofBlurNear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_dof_blur_near".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_dof_blur_near" }
        }
      val environmentSetFog: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_fog".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_fog" }
        }
      val environmentSetFogDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_fog_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_fog_depth" }
        }
      val environmentSetFogHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_fog_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_fog_height" }
        }
      val environmentSetGlow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_glow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_glow" }
        }
      val environmentSetSky: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_sky".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_sky" }
        }
      val environmentSetSkyCustomFov: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_sky_custom_fov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_sky_custom_fov" }
        }
      val environmentSetSkyOrientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_sky_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_sky_orientation" }
        }
      val environmentSetSsao: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_ssao".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_ssao" }
        }
      val environmentSetSsr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_ssr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_ssr" }
        }
      val environmentSetTonemap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environment_set_tonemap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environment_set_tonemap" }
        }
      val finish: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "finish".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method finish" }
        }
      val forceDraw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "force_draw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method force_draw" }
        }
      val forceSync: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "force_sync".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method force_sync" }
        }
      val freeRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "free_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method free_rid" }
        }
      val getRenderInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "get_render_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_render_info" }
        }
      val getTestCube: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "get_test_cube".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_test_cube" }
        }
      val getTestTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "get_test_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_test_texture" }
        }
      val getVideoAdapterName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "get_video_adapter_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_video_adapter_name" }
        }
      val getVideoAdapterVendor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "get_video_adapter_vendor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_video_adapter_vendor" }
        }
      val getWhiteTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "get_white_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_white_texture" }
        }
      val giProbeCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_create" }
        }
      val giProbeGetBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_get_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_get_bias" }
        }
      val giProbeGetBounds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_get_bounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_get_bounds" }
        }
      val giProbeGetCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_get_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_get_cell_size" }
        }
      val giProbeGetDynamicData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_get_dynamic_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_get_dynamic_data" }
        }
      val giProbeGetDynamicRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_get_dynamic_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_get_dynamic_range" }
        }
      val giProbeGetEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_get_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_get_energy" }
        }
      val giProbeGetNormalBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_get_normal_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_get_normal_bias" }
        }
      val giProbeGetPropagation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_get_propagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_get_propagation" }
        }
      val giProbeGetToCellXform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_get_to_cell_xform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_get_to_cell_xform" }
        }
      val giProbeIsCompressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_is_compressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_is_compressed" }
        }
      val giProbeIsInterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_is_interior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_is_interior" }
        }
      val giProbeSetBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_set_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_set_bias" }
        }
      val giProbeSetBounds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_set_bounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_set_bounds" }
        }
      val giProbeSetCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_set_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_set_cell_size" }
        }
      val giProbeSetCompress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_set_compress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_set_compress" }
        }
      val giProbeSetDynamicData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_set_dynamic_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_set_dynamic_data" }
        }
      val giProbeSetDynamicRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_set_dynamic_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_set_dynamic_range" }
        }
      val giProbeSetEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_set_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_set_energy" }
        }
      val giProbeSetInterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_set_interior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_set_interior" }
        }
      val giProbeSetNormalBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_set_normal_bias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_set_normal_bias" }
        }
      val giProbeSetPropagation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_set_propagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_set_propagation" }
        }
      val giProbeSetToCellXform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "gi_probe_set_to_cell_xform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method gi_probe_set_to_cell_xform" }
        }
      val hasChanged: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "has_changed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_changed" }
        }
      val hasFeature: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "has_feature".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_feature" }
        }
      val hasOsFeature: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "has_os_feature".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_os_feature" }
        }
      val immediateBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediate_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediate_begin" }
        }
      val immediateClear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediate_clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediate_clear" }
        }
      val immediateColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediate_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediate_color" }
        }
      val immediateCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediate_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediate_create" }
        }
      val immediateEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediate_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediate_end" }
        }
      val immediateGetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediate_get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediate_get_material" }
        }
      val immediateNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediate_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediate_normal" }
        }
      val immediateSetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediate_set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediate_set_material" }
        }
      val immediateTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediate_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediate_tangent" }
        }
      val immediateUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediate_uv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediate_uv" }
        }
      val immediateUv2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediate_uv2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediate_uv2" }
        }
      val immediateVertex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediate_vertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediate_vertex" }
        }
      val immediateVertex2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediate_vertex_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediate_vertex_2d" }
        }
      val init: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "init".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method init" }
        }
      val instanceAttachObjectInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_attach_object_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_attach_object_instance_id"
            }
        }
      val instanceAttachSkeleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_attach_skeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_attach_skeleton" }
        }
      val instanceCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_create" }
        }
      val instanceCreate2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_create2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_create2" }
        }
      val instanceGeometrySetAsInstanceLod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_geometry_set_as_instance_lod".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method instance_geometry_set_as_instance_lod" }
        }
      val instanceGeometrySetCastShadowsSetting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_geometry_set_cast_shadows_setting".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method instance_geometry_set_cast_shadows_setting" }
        }
      val instanceGeometrySetDrawRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_geometry_set_draw_range".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_geometry_set_draw_range" }
        }
      val instanceGeometrySetFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_geometry_set_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_geometry_set_flag" }
        }
      val instanceGeometrySetMaterialOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_geometry_set_material_override".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method instance_geometry_set_material_override" }
        }
      val instanceSetBase: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_set_base".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_set_base" }
        }
      val instanceSetBlendShapeWeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_set_blend_shape_weight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_set_blend_shape_weight" }
        }
      val instanceSetCustomAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_set_custom_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_set_custom_aabb" }
        }
      val instanceSetExterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_set_exterior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_set_exterior" }
        }
      val instanceSetExtraVisibilityMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_set_extra_visibility_margin".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method instance_set_extra_visibility_margin" }
        }
      val instanceSetLayerMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_set_layer_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_set_layer_mask" }
        }
      val instanceSetScenario: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_set_scenario".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_set_scenario" }
        }
      val instanceSetSurfaceMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_set_surface_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_set_surface_material" }
        }
      val instanceSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_set_transform" }
        }
      val instanceSetUseLightmap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_set_use_lightmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_set_use_lightmap" }
        }
      val instanceSetVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instance_set_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_set_visible" }
        }
      val instancesCullAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instances_cull_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instances_cull_aabb" }
        }
      val instancesCullConvex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instances_cull_convex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instances_cull_convex" }
        }
      val instancesCullRay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instances_cull_ray".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instances_cull_ray" }
        }
      val lightDirectionalSetBlendSplits: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "light_directional_set_blend_splits".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method light_directional_set_blend_splits"
            }
        }
      val lightDirectionalSetShadowDepthRangeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "light_directional_set_shadow_depth_range_mode".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method light_directional_set_shadow_depth_range_mode" }
        }
      val lightDirectionalSetShadowMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "light_directional_set_shadow_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method light_directional_set_shadow_mode"
            }
        }
      val lightOmniSetShadowDetail: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "light_omni_set_shadow_detail".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method light_omni_set_shadow_detail" }
        }
      val lightOmniSetShadowMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "light_omni_set_shadow_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method light_omni_set_shadow_mode" }
        }
      val lightSetColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "light_set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method light_set_color" }
        }
      val lightSetCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "light_set_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method light_set_cull_mask" }
        }
      val lightSetNegative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "light_set_negative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method light_set_negative" }
        }
      val lightSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "light_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method light_set_param" }
        }
      val lightSetProjector: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "light_set_projector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method light_set_projector" }
        }
      val lightSetReverseCullFaceMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "light_set_reverse_cull_face_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method light_set_reverse_cull_face_mode" }
        }
      val lightSetShadow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "light_set_shadow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method light_set_shadow" }
        }
      val lightSetShadowColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "light_set_shadow_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method light_set_shadow_color" }
        }
      val lightSetUseGi: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "light_set_use_gi".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method light_set_use_gi" }
        }
      val lightmapCaptureCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmap_capture_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmap_capture_create" }
        }
      val lightmapCaptureGetBounds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmap_capture_get_bounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmap_capture_get_bounds" }
        }
      val lightmapCaptureGetEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmap_capture_get_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmap_capture_get_energy" }
        }
      val lightmapCaptureGetOctree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmap_capture_get_octree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmap_capture_get_octree" }
        }
      val lightmapCaptureGetOctreeCellSubdiv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmap_capture_get_octree_cell_subdiv".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method lightmap_capture_get_octree_cell_subdiv" }
        }
      val lightmapCaptureGetOctreeCellTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmap_capture_get_octree_cell_transform".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method lightmap_capture_get_octree_cell_transform" }
        }
      val lightmapCaptureSetBounds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmap_capture_set_bounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmap_capture_set_bounds" }
        }
      val lightmapCaptureSetEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmap_capture_set_energy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmap_capture_set_energy" }
        }
      val lightmapCaptureSetOctree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmap_capture_set_octree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmap_capture_set_octree" }
        }
      val lightmapCaptureSetOctreeCellSubdiv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmap_capture_set_octree_cell_subdiv".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method lightmap_capture_set_octree_cell_subdiv" }
        }
      val lightmapCaptureSetOctreeCellTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmap_capture_set_octree_cell_transform".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method lightmap_capture_set_octree_cell_transform" }
        }
      val makeSphereMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "make_sphere_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_sphere_mesh" }
        }
      val materialCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "material_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method material_create" }
        }
      val materialGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "material_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method material_get_param" }
        }
      val materialGetParamDefault: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "material_get_param_default".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method material_get_param_default" }
        }
      val materialGetShader: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "material_get_shader".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method material_get_shader" }
        }
      val materialSetLineWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "material_set_line_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method material_set_line_width" }
        }
      val materialSetNextPass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "material_set_next_pass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method material_set_next_pass" }
        }
      val materialSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "material_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method material_set_param" }
        }
      val materialSetRenderPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "material_set_render_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method material_set_render_priority" }
        }
      val materialSetShader: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "material_set_shader".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method material_set_shader" }
        }
      val meshAddSurfaceFromArrays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_add_surface_from_arrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_add_surface_from_arrays" }
        }
      val meshClear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_clear" }
        }
      val meshCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_create" }
        }
      val meshGetBlendShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_get_blend_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_get_blend_shape_count" }
        }
      val meshGetBlendShapeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_get_blend_shape_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_get_blend_shape_mode" }
        }
      val meshGetCustomAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_get_custom_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_get_custom_aabb" }
        }
      val meshGetSurfaceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_get_surface_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_get_surface_count" }
        }
      val meshRemoveSurface: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_remove_surface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_remove_surface" }
        }
      val meshSetBlendShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_set_blend_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_set_blend_shape_count" }
        }
      val meshSetBlendShapeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_set_blend_shape_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_set_blend_shape_mode" }
        }
      val meshSetCustomAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_set_custom_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_set_custom_aabb" }
        }
      val meshSurfaceGetAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_surface_get_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_aabb" }
        }
      val meshSurfaceGetArray: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_surface_get_array".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_array" }
        }
      val meshSurfaceGetArrayIndexLen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_surface_get_array_index_len".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_array_index_len" }
        }
      val meshSurfaceGetArrayLen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_surface_get_array_len".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_array_len" }
        }
      val meshSurfaceGetArrays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_surface_get_arrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_arrays" }
        }
      val meshSurfaceGetBlendShapeArrays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_surface_get_blend_shape_arrays".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method mesh_surface_get_blend_shape_arrays" }
        }
      val meshSurfaceGetFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_surface_get_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_format" }
        }
      val meshSurfaceGetFormatOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_surface_get_format_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_format_offset" }
        }
      val meshSurfaceGetFormatStride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_surface_get_format_stride".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_format_stride" }
        }
      val meshSurfaceGetIndexArray: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_surface_get_index_array".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_index_array" }
        }
      val meshSurfaceGetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_surface_get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_material" }
        }
      val meshSurfaceGetPrimitiveType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_surface_get_primitive_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_primitive_type" }
        }
      val meshSurfaceGetSkeletonAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_surface_get_skeleton_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_surface_get_skeleton_aabb" }
        }
      val meshSurfaceSetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_surface_set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_surface_set_material" }
        }
      val meshSurfaceUpdateRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "mesh_surface_update_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method mesh_surface_update_region" }
        }
      val multimeshAllocate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_allocate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimesh_allocate" }
        }
      val multimeshCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimesh_create" }
        }
      val multimeshGetAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_get_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimesh_get_aabb" }
        }
      val multimeshGetInstanceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_get_instance_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimesh_get_instance_count" }
        }
      val multimeshGetMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_get_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimesh_get_mesh" }
        }
      val multimeshGetVisibleInstances: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_get_visible_instances".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimesh_get_visible_instances" }
        }
      val multimeshInstanceGetColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_instance_get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimesh_instance_get_color" }
        }
      val multimeshInstanceGetCustomData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_instance_get_custom_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimesh_instance_get_custom_data"
            }
        }
      val multimeshInstanceGetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_instance_get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimesh_instance_get_transform" }
        }
      val multimeshInstanceGetTransform2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_instance_get_transform_2d".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method multimesh_instance_get_transform_2d" }
        }
      val multimeshInstanceSetColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_instance_set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimesh_instance_set_color" }
        }
      val multimeshInstanceSetCustomData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_instance_set_custom_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimesh_instance_set_custom_data"
            }
        }
      val multimeshInstanceSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_instance_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimesh_instance_set_transform" }
        }
      val multimeshInstanceSetTransform2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_instance_set_transform_2d".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method multimesh_instance_set_transform_2d" }
        }
      val multimeshSetAsBulkArray: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_set_as_bulk_array".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimesh_set_as_bulk_array" }
        }
      val multimeshSetMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_set_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimesh_set_mesh" }
        }
      val multimeshSetVisibleInstances: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimesh_set_visible_instances".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimesh_set_visible_instances" }
        }
      val omniLightCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "omni_light_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method omni_light_create" }
        }
      val particlesCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_create" }
        }
      val particlesGetCurrentAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_get_current_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_get_current_aabb" }
        }
      val particlesGetEmitting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_get_emitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_get_emitting" }
        }
      val particlesIsInactive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_is_inactive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_is_inactive" }
        }
      val particlesRequestProcess: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_request_process".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_request_process" }
        }
      val particlesRestart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_restart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_restart" }
        }
      val particlesSetAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_amount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_amount" }
        }
      val particlesSetCustomAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_custom_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_custom_aabb" }
        }
      val particlesSetDrawOrder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_draw_order".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_draw_order" }
        }
      val particlesSetDrawPassMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_draw_pass_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_draw_pass_mesh" }
        }
      val particlesSetDrawPasses: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_draw_passes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_draw_passes" }
        }
      val particlesSetEmissionTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_emission_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_emission_transform" }
        }
      val particlesSetEmitting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_emitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_emitting" }
        }
      val particlesSetExplosivenessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_explosiveness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_explosiveness_ratio"
            }
        }
      val particlesSetFixedFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_fixed_fps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_fixed_fps" }
        }
      val particlesSetFractionalDelta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_fractional_delta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_fractional_delta" }
        }
      val particlesSetLifetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_lifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_lifetime" }
        }
      val particlesSetOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_one_shot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_one_shot" }
        }
      val particlesSetPreProcessTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_pre_process_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_pre_process_time" }
        }
      val particlesSetProcessMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_process_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_process_material" }
        }
      val particlesSetRandomnessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_randomness_ratio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_randomness_ratio" }
        }
      val particlesSetSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_speed_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particles_set_speed_scale" }
        }
      val particlesSetUseLocalCoordinates: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particles_set_use_local_coordinates".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method particles_set_use_local_coordinates" }
        }
      val reflectionProbeCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflection_probe_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflection_probe_create" }
        }
      val reflectionProbeSetAsInterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflection_probe_set_as_interior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflection_probe_set_as_interior" }
        }
      val reflectionProbeSetCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflection_probe_set_cull_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflection_probe_set_cull_mask" }
        }
      val reflectionProbeSetEnableBoxProjection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflection_probe_set_enable_box_projection".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method reflection_probe_set_enable_box_projection" }
        }
      val reflectionProbeSetEnableShadows: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflection_probe_set_enable_shadows".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method reflection_probe_set_enable_shadows" }
        }
      val reflectionProbeSetExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflection_probe_set_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflection_probe_set_extents" }
        }
      val reflectionProbeSetIntensity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflection_probe_set_intensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflection_probe_set_intensity" }
        }
      val reflectionProbeSetInteriorAmbient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflection_probe_set_interior_ambient".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method reflection_probe_set_interior_ambient" }
        }
      val reflectionProbeSetInteriorAmbientEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflection_probe_set_interior_ambient_energy".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method reflection_probe_set_interior_ambient_energy" }
        }
      val reflectionProbeSetInteriorAmbientProbeContribution: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflection_probe_set_interior_ambient_probe_contribution".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method reflection_probe_set_interior_ambient_probe_contribution"
            }
        }
      val reflectionProbeSetMaxDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflection_probe_set_max_distance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflection_probe_set_max_distance"
            }
        }
      val reflectionProbeSetOriginOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflection_probe_set_origin_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflection_probe_set_origin_offset"
            }
        }
      val reflectionProbeSetUpdateMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflection_probe_set_update_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflection_probe_set_update_mode" }
        }
      val requestFrameDrawnCallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "request_frame_drawn_callback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method request_frame_drawn_callback" }
        }
      val scenarioCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "scenario_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scenario_create" }
        }
      val scenarioSetDebug: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "scenario_set_debug".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scenario_set_debug" }
        }
      val scenarioSetEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "scenario_set_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scenario_set_environment" }
        }
      val scenarioSetFallbackEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "scenario_set_fallback_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scenario_set_fallback_environment"
            }
        }
      val scenarioSetReflectionAtlasSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "scenario_set_reflection_atlas_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scenario_set_reflection_atlas_size"
            }
        }
      val setBootImage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "set_boot_image".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_boot_image" }
        }
      val setDebugGenerateWireframes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "set_debug_generate_wireframes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_debug_generate_wireframes" }
        }
      val setDefaultClearColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "set_default_clear_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_clear_color" }
        }
      val shaderCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "shader_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shader_create" }
        }
      val shaderGetCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "shader_get_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shader_get_code" }
        }
      val shaderGetDefaultTextureParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "shader_get_default_texture_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shader_get_default_texture_param" }
        }
      val shaderGetParamList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "shader_get_param_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shader_get_param_list" }
        }
      val shaderSetCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "shader_set_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shader_set_code" }
        }
      val shaderSetDefaultTextureParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "shader_set_default_texture_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shader_set_default_texture_param" }
        }
      val skeletonAllocate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skeleton_allocate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skeleton_allocate" }
        }
      val skeletonBoneGetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skeleton_bone_get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skeleton_bone_get_transform" }
        }
      val skeletonBoneGetTransform2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skeleton_bone_get_transform_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skeleton_bone_get_transform_2d" }
        }
      val skeletonBoneSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skeleton_bone_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skeleton_bone_set_transform" }
        }
      val skeletonBoneSetTransform2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skeleton_bone_set_transform_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skeleton_bone_set_transform_2d" }
        }
      val skeletonCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skeleton_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skeleton_create" }
        }
      val skeletonGetBoneCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skeleton_get_bone_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skeleton_get_bone_count" }
        }
      val skyCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "sky_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method sky_create" }
        }
      val skySetTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "sky_set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method sky_set_texture" }
        }
      val spotLightCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "spot_light_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method spot_light_create" }
        }
      val sync: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "sync".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method sync" }
        }
      val textureAllocate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_allocate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_allocate" }
        }
      val textureBind: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_bind".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_bind" }
        }
      val textureCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_create" }
        }
      val textureCreateFromImage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_create_from_image".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_create_from_image" }
        }
      val textureDebugUsage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_debug_usage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_debug_usage" }
        }
      val textureGetData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_get_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_get_data" }
        }
      val textureGetDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_get_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_get_depth" }
        }
      val textureGetFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_get_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_get_flags" }
        }
      val textureGetFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_get_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_get_format" }
        }
      val textureGetHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_get_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_get_height" }
        }
      val textureGetPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_get_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_get_path" }
        }
      val textureGetTexid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_get_texid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_get_texid" }
        }
      val textureGetType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_get_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_get_type" }
        }
      val textureGetWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_get_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_get_width" }
        }
      val textureSetData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_set_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_set_data" }
        }
      val textureSetDataPartial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_set_data_partial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_set_data_partial" }
        }
      val textureSetFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_set_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_set_flags" }
        }
      val textureSetPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_set_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_set_path" }
        }
      val textureSetShrinkAllX2OnSetData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_set_shrink_all_x2_on_set_data".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method texture_set_shrink_all_x2_on_set_data" }
        }
      val textureSetSizeOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texture_set_size_override".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texture_set_size_override" }
        }
      val texturesKeepOriginal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textures_keep_original".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textures_keep_original" }
        }
      val viewportAttachCamera: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_attach_camera".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_attach_camera" }
        }
      val viewportAttachCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_attach_canvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_attach_canvas" }
        }
      val viewportAttachToScreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_attach_to_screen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_attach_to_screen" }
        }
      val viewportCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_create" }
        }
      val viewportDetach: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_detach".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_detach" }
        }
      val viewportGetRenderInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_get_render_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_get_render_info" }
        }
      val viewportGetTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_get_texture" }
        }
      val viewportRemoveCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_remove_canvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_remove_canvas" }
        }
      val viewportSetActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_active" }
        }
      val viewportSetCanvasStacking: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_canvas_stacking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_canvas_stacking" }
        }
      val viewportSetCanvasTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_canvas_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_canvas_transform" }
        }
      val viewportSetClearMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_clear_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_clear_mode" }
        }
      val viewportSetDebugDraw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_debug_draw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_debug_draw" }
        }
      val viewportSetDisable3d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_disable_3d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_disable_3d" }
        }
      val viewportSetDisableEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_disable_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_disable_environment" }
        }
      val viewportSetGlobalCanvasTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_global_canvas_transform".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method viewport_set_global_canvas_transform" }
        }
      val viewportSetHdr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_hdr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_hdr" }
        }
      val viewportSetHideCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_hide_canvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_hide_canvas" }
        }
      val viewportSetHideScenario: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_hide_scenario".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_hide_scenario" }
        }
      val viewportSetMsaa: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_msaa".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_msaa" }
        }
      val viewportSetParentViewport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_parent_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_parent_viewport" }
        }
      val viewportSetRenderDirectToScreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_render_direct_to_screen".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method viewport_set_render_direct_to_screen" }
        }
      val viewportSetScenario: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_scenario".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_scenario" }
        }
      val viewportSetShadowAtlasQuadrantSubdivision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_shadow_atlas_quadrant_subdivision".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method viewport_set_shadow_atlas_quadrant_subdivision" }
        }
      val viewportSetShadowAtlasSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_shadow_atlas_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_shadow_atlas_size" }
        }
      val viewportSetSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_size" }
        }
      val viewportSetTransparentBackground: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_transparent_background".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method viewport_set_transparent_background" }
        }
      val viewportSetUpdateMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_update_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_update_mode" }
        }
      val viewportSetUsage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_usage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_usage" }
        }
      val viewportSetUseArvr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_use_arvr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_use_arvr" }
        }
      val viewportSetVflip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewport_set_vflip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewport_set_vflip" }
        }}
  }
}

object VisualServer : VisualServerInternal(null) {
  init {
    memScoped {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("VisualServer".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton VisualServer" }
      _handle = handle
    }
  }

  val ARRAY_WEIGHTS_SIZE: Int = 4

  val CANVAS_ITEM_Z_MAX: Int = 4096

  val CANVAS_ITEM_Z_MIN: Int = -4096

  val MATERIAL_RENDER_PRIORITY_MAX: Int = 127

  val MATERIAL_RENDER_PRIORITY_MIN: Int = -128

  val MAX_CURSORS: Int = 8

  val MAX_GLOW_LEVELS: Int = 7

  val NO_INDEX_ARRAY: Int = -1

  enum class ReflectionProbeUpdateMode(
    val value: Int
  ) {
    ONCE(0),

    ALWAYS(1);

    companion object {
      fun from(value: Int): ReflectionProbeUpdateMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class LightDirectionalShadowDepthRangeMode(
    val value: Int
  ) {
    STABLE(0),

    OPTIMIZED(1);

    companion object {
      fun from(value: Int): LightDirectionalShadowDepthRangeMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class BlendShapeMode(
    val value: Int
  ) {
    NORMALIZED(0),

    RELATIVE(1);

    companion object {
      fun from(value: Int): BlendShapeMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class PrimitiveType(
    val value: Int
  ) {
    POINTS(0),

    LINES(1),

    LINE_STRIP(2),

    LINE_LOOP(3),

    TRIANGLES(4),

    TRIANGLE_STRIP(5),

    TRIANGLE_FAN(6),

    MAX(7);

    companion object {
      fun from(value: Int): PrimitiveType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class TextureType(
    val value: Int
  ) {
    `2D`(0),

    CUBEMAP(1),

    `2D_ARRAY`(2),

    `3D`(3);

    companion object {
      fun from(value: Int): TextureType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class EnvironmentSSAOQuality(
    val value: Int
  ) {
    ENV_SSAO_QUALITY_LOW(0),

    ENV_SSAO_QUALITY_MEDIUM(1),

    ENV_SSAO_QUALITY_HIGH(2);

    companion object {
      fun from(value: Int): EnvironmentSSAOQuality {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class EnvironmentDOFBlurQuality(
    val value: Int
  ) {
    ENV_DOF_BLUR_QUALITY_LOW(0),

    ENV_DOF_BLUR_QUALITY_MEDIUM(1),

    ENV_DOF_BLUR_QUALITY_HIGH(2);

    companion object {
      fun from(value: Int): EnvironmentDOFBlurQuality {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class RenderInfo(
    val value: Int
  ) {
    INFO_OBJECTS_IN_FRAME(0),

    INFO_VERTICES_IN_FRAME(1),

    INFO_MATERIAL_CHANGES_IN_FRAME(2),

    INFO_SHADER_CHANGES_IN_FRAME(3),

    INFO_SURFACE_CHANGES_IN_FRAME(4),

    INFO_DRAW_CALLS_IN_FRAME(5),

    INFO_USAGE_VIDEO_MEM_TOTAL(6),

    INFO_VIDEO_MEM_USED(7),

    INFO_TEXTURE_MEM_USED(8),

    INFO_VERTEX_MEM_USED(9);

    companion object {
      fun from(value: Int): RenderInfo {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class NinePatchAxisMode(
    val value: Int
  ) {
    STRETCH(0),

    TILE(1),

    TILE_FIT(2);

    companion object {
      fun from(value: Int): NinePatchAxisMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ViewportRenderInfo(
    val value: Int
  ) {
    OBJECTS_IN_FRAME(0),

    VERTICES_IN_FRAME(1),

    MATERIAL_CHANGES_IN_FRAME(2),

    SHADER_CHANGES_IN_FRAME(3),

    SURFACE_CHANGES_IN_FRAME(4),

    DRAW_CALLS_IN_FRAME(5),

    MAX(6);

    companion object {
      fun from(value: Int): ViewportRenderInfo {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ViewportClearMode(
    val value: Int
  ) {
    ALWAYS(0),

    NEVER(1),

    ONLY_NEXT_FRAME(2);

    companion object {
      fun from(value: Int): ViewportClearMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class LightOmniShadowDetail(
    val value: Int
  ) {
    VERTICAL(0),

    HORIZONTAL(1);

    companion object {
      fun from(value: Int): LightOmniShadowDetail {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ShaderMode(
    val value: Int
  ) {
    SPATIAL(0),

    CANVAS_ITEM(1),

    PARTICLES(2),

    MAX(3);

    companion object {
      fun from(value: Int): ShaderMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class MultimeshTransformFormat(
    val value: Int
  ) {
    `2D`(0),

    `3D`(1);

    companion object {
      fun from(value: Int): MultimeshTransformFormat {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ShadowCastingSetting(
    val value: Int
  ) {
    OFF(0),

    ON(1),

    DOUBLE_SIDED(2),

    SHADOWS_ONLY(3);

    companion object {
      fun from(value: Int): ShadowCastingSetting {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ViewportDebugDraw(
    val value: Int
  ) {
    DISABLED(0),

    UNSHADED(1),

    OVERDRAW(2),

    WIREFRAME(3);

    companion object {
      fun from(value: Int): ViewportDebugDraw {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ViewportUsage(
    val value: Int
  ) {
    `2D`(0),

    `2D_NO_SAMPLING`(1),

    `3D`(2),

    `3D_NO_EFFECTS`(3);

    companion object {
      fun from(value: Int): ViewportUsage {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class EnvironmentBG(
    val value: Int
  ) {
    ENV_BG_CLEAR_COLOR(0),

    ENV_BG_COLOR(1),

    ENV_BG_SKY(2),

    ENV_BG_COLOR_SKY(3),

    ENV_BG_CANVAS(4),

    ENV_BG_KEEP(5),

    ENV_BG_MAX(7);

    companion object {
      fun from(value: Int): EnvironmentBG {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class MultimeshCustomDataFormat(
    val value: Int
  ) {
    NONE(0),

    `8BIT`(1),

    FLOAT(2);

    companion object {
      fun from(value: Int): MultimeshCustomDataFormat {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class LightOmniShadowMode(
    val value: Int
  ) {
    DUAL_PARABOLOID(0),

    CUBE(1);

    companion object {
      fun from(value: Int): LightOmniShadowMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class TextureFlags(
    val value: Int
  ) {
    FLAG_MIPMAPS(1),

    FLAG_REPEAT(2),

    FLAG_FILTER(4),

    DEFAULT(7),

    FLAG_ANISOTROPIC_FILTER(8),

    FLAG_CONVERT_TO_LINEAR(16),

    FLAG_MIRRORED_REPEAT(32),

    FLAG_USED_FOR_STREAMING(2048);

    companion object {
      fun from(value: Int): TextureFlags {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Features(
    val value: Int
  ) {
    FEATURE_SHADERS(0),

    FEATURE_MULTITHREADED(1);

    companion object {
      fun from(value: Int): Features {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class InstanceType(
    val value: Int
  ) {
    NONE(0),

    MESH(1),

    MULTIMESH(2),

    IMMEDIATE(3),

    PARTICLES(4),

    LIGHT(5),

    REFLECTION_PROBE(6),

    GI_PROBE(7),

    LIGHTMAP_CAPTURE(8),

    MAX(9),

    GEOMETRY_MASK(30);

    companion object {
      fun from(value: Int): InstanceType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class EnvironmentSSAOBlur(
    val value: Int
  ) {
    ENV_SSAO_BLUR_DISABLED(0),

    ENV_SSAO_BLUR_1x1(1),

    ENV_SSAO_BLUR_2x2(2),

    ENV_SSAO_BLUR_3x3(3);

    companion object {
      fun from(value: Int): EnvironmentSSAOBlur {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class EnvironmentToneMapper(
    val value: Int
  ) {
    ENV_TONE_MAPPER_LINEAR(0),

    ENV_TONE_MAPPER_REINHARD(1),

    ENV_TONE_MAPPER_FILMIC(2),

    ENV_TONE_MAPPER_ACES(3);

    companion object {
      fun from(value: Int): EnvironmentToneMapper {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class EnvironmentGlowBlendMode(
    val value: Int
  ) {
    GLOW_BLEND_MODE_ADDITIVE(0),

    GLOW_BLEND_MODE_SCREEN(1),

    GLOW_BLEND_MODE_SOFTLIGHT(2),

    GLOW_BLEND_MODE_REPLACE(3);

    companion object {
      fun from(value: Int): EnvironmentGlowBlendMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class MultimeshColorFormat(
    val value: Int
  ) {
    NONE(0),

    `8BIT`(1),

    FLOAT(2);

    companion object {
      fun from(value: Int): MultimeshColorFormat {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class CanvasLightShadowFilter(
    val value: Int
  ) {
    FILTER_NONE(0),

    FILTER_PCF3(1),

    FILTER_PCF5(2),

    FILTER_PCF7(3),

    FILTER_PCF9(4),

    FILTER_PCF13(5);

    companion object {
      fun from(value: Int): CanvasLightShadowFilter {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ScenarioDebugMode(
    val value: Int
  ) {
    DISABLED(0),

    WIREFRAME(1),

    OVERDRAW(2),

    SHADELESS(3);

    companion object {
      fun from(value: Int): ScenarioDebugMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ViewportUpdateMode(
    val value: Int
  ) {
    DISABLED(0),

    ONCE(1),

    WHEN_VISIBLE(2),

    ALWAYS(3);

    companion object {
      fun from(value: Int): ViewportUpdateMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ArrayFormat(
    val value: Int
  ) {
    VERTEX(1),

    NORMAL(2),

    TANGENT(4),

    COLOR(8),

    TEX_UV(16),

    TEX_UV2(32),

    BONES(64),

    WEIGHTS(128),

    INDEX(256),

    COMPRESS_VERTEX(512),

    COMPRESS_NORMAL(1024),

    COMPRESS_TANGENT(2048),

    COMPRESS_COLOR(4096),

    COMPRESS_TEX_UV(8192),

    COMPRESS_TEX_UV2(16384),

    COMPRESS_BONES(32768),

    COMPRESS_WEIGHTS(65536),

    COMPRESS_DEFAULT(97280),

    COMPRESS_INDEX(131072),

    FLAG_USE_2D_VERTICES(262144),

    FLAG_USE_16_BIT_BONES(524288);

    companion object {
      fun from(value: Int): ArrayFormat {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ParticlesDrawOrder(
    val value: Int
  ) {
    INDEX(0),

    LIFETIME(1),

    VIEW_DEPTH(2);

    companion object {
      fun from(value: Int): ParticlesDrawOrder {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class CanvasLightMode(
    val value: Int
  ) {
    ADD(0),

    SUB(1),

    MIX(2),

    MASK(3);

    companion object {
      fun from(value: Int): CanvasLightMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class LightDirectionalShadowMode(
    val value: Int
  ) {
    ORTHOGONAL(0),

    PARALLEL_2_SPLITS(1),

    PARALLEL_4_SPLITS(2);

    companion object {
      fun from(value: Int): LightDirectionalShadowMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class LightParam(
    val value: Int
  ) {
    ENERGY(0),

    SPECULAR(2),

    RANGE(3),

    ATTENUATION(4),

    SPOT_ANGLE(5),

    SPOT_ATTENUATION(6),

    CONTACT_SHADOW_SIZE(7),

    SHADOW_MAX_DISTANCE(8),

    SHADOW_SPLIT_1_OFFSET(9),

    SHADOW_SPLIT_2_OFFSET(10),

    SHADOW_SPLIT_3_OFFSET(11),

    SHADOW_NORMAL_BIAS(12),

    SHADOW_BIAS(13),

    SHADOW_BIAS_SPLIT_SCALE(14),

    MAX(15);

    companion object {
      fun from(value: Int): LightParam {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ArrayType(
    val value: Int
  ) {
    VERTEX(0),

    NORMAL(1),

    TANGENT(2),

    COLOR(3),

    TEX_UV(4),

    TEX_UV2(5),

    BONES(6),

    WEIGHTS(7),

    INDEX(8),

    MAX(9);

    companion object {
      fun from(value: Int): ArrayType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class CanvasOccluderPolygonCullMode(
    val value: Int
  ) {
    DISABLED(0),

    CLOCKWISE(1),

    COUNTER_CLOCKWISE(2);

    companion object {
      fun from(value: Int): CanvasOccluderPolygonCullMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class InstanceFlags(
    val value: Int
  ) {
    FLAG_USE_BAKED_LIGHT(0),

    FLAG_DRAW_NEXT_FRAME_IF_VISIBLE(1),

    FLAG_MAX(2);

    companion object {
      fun from(value: Int): InstanceFlags {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ViewportMSAA(
    val value: Int
  ) {
    DISABLED(0),

    `2X`(1),

    `4X`(2),

    `8X`(3),

    `16X`(4),

    EXT_2X(5),

    EXT_4X(6);

    companion object {
      fun from(value: Int): ViewportMSAA {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class LightType(
    val value: Int
  ) {
    DIRECTIONAL(0),

    OMNI(1),

    SPOT(2);

    companion object {
      fun from(value: Int): LightType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class CubeMapSide(
    val value: Int
  ) {
    CUBEMAP_LEFT(0),

    CUBEMAP_RIGHT(1),

    CUBEMAP_BOTTOM(2),

    CUBEMAP_TOP(3),

    CUBEMAP_FRONT(4),

    CUBEMAP_BACK(5);

    companion object {
      fun from(value: Int): CubeMapSide {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }
}
