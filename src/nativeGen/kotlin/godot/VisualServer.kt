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
import godot.core.PoolIntArray
import godot.core.PoolRealArray
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualServer(
  _handle: COpaquePointer
) : Object(_handle) {
  fun blackBarsSetImages(
    left: RID,
    top: RID,
    right: RID,
    bottom: RID
  ) {
    val _args = VariantArray.new()
    _args.append(left)
    _args.append(top)
    _args.append(right)
    _args.append(bottom)
    __method_bind.blackBarsSetImages.call(this._handle, _args.toVariant(), 4)
  }

  fun blackBarsSetMargins(
    left: Int,
    top: Int,
    right: Int,
    bottom: Int
  ) {
    val _args = VariantArray.new()
    _args.append(left)
    _args.append(top)
    _args.append(right)
    _args.append(bottom)
    __method_bind.blackBarsSetMargins.call(this._handle, _args.toVariant(), 4)
  }

  fun cameraCreate(): RID {
    val _ret = __method_bind.cameraCreate.call(this._handle)
    return _ret.asRID()
  }

  fun cameraSetCullMask(camera: RID, layers: Int) {
    val _args = VariantArray.new()
    _args.append(camera)
    _args.append(layers)
    __method_bind.cameraSetCullMask.call(this._handle, _args.toVariant(), 2)
  }

  fun cameraSetEnvironment(camera: RID, env: RID) {
    val _args = VariantArray.new()
    _args.append(camera)
    _args.append(env)
    __method_bind.cameraSetEnvironment.call(this._handle, _args.toVariant(), 2)
  }

  fun cameraSetFrustum(
    camera: RID,
    size: Float,
    offset: Vector2,
    zNear: Float,
    zFar: Float
  ) {
    val _args = VariantArray.new()
    _args.append(camera)
    _args.append(size)
    _args.append(offset)
    _args.append(zNear)
    _args.append(zFar)
    __method_bind.cameraSetFrustum.call(this._handle, _args.toVariant(), 5)
  }

  fun cameraSetOrthogonal(
    camera: RID,
    size: Float,
    zNear: Float,
    zFar: Float
  ) {
    val _args = VariantArray.new()
    _args.append(camera)
    _args.append(size)
    _args.append(zNear)
    _args.append(zFar)
    __method_bind.cameraSetOrthogonal.call(this._handle, _args.toVariant(), 4)
  }

  fun cameraSetPerspective(
    camera: RID,
    fovyDegrees: Float,
    zNear: Float,
    zFar: Float
  ) {
    val _args = VariantArray.new()
    _args.append(camera)
    _args.append(fovyDegrees)
    _args.append(zNear)
    _args.append(zFar)
    __method_bind.cameraSetPerspective.call(this._handle, _args.toVariant(), 4)
  }

  fun cameraSetTransform(camera: RID, transform: Transform) {
    val _args = VariantArray.new()
    _args.append(camera)
    _args.append(transform)
    __method_bind.cameraSetTransform.call(this._handle, _args.toVariant(), 2)
  }

  fun cameraSetUseVerticalAspect(camera: RID, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(camera)
    _args.append(enable)
    __method_bind.cameraSetUseVerticalAspect.call(this._handle, _args.toVariant(), 2)
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
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(pos)
    _args.append(radius)
    _args.append(color)
    __method_bind.canvasItemAddCircle.call(this._handle, _args.toVariant(), 4)
  }

  fun canvasItemAddClipIgnore(item: RID, ignore: Boolean) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(ignore)
    __method_bind.canvasItemAddClipIgnore.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemAddLine(
    item: RID,
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Float,
    antialiased: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(from)
    _args.append(to)
    _args.append(color)
    _args.append(width)
    _args.append(antialiased)
    __method_bind.canvasItemAddLine.call(this._handle, _args.toVariant(), 6)
  }

  fun canvasItemAddMesh(
    item: RID,
    mesh: RID,
    texture: Transform2D,
    normalMap: Color,
    arg4: RID,
    arg5: RID
  ) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(mesh)
    _args.append(texture)
    _args.append(normalMap)
    _args.append(arg4)
    _args.append(arg5)
    __method_bind.canvasItemAddMesh.call(this._handle, _args.toVariant(), 6)
  }

  fun canvasItemAddMultimesh(
    item: RID,
    mesh: RID,
    texture: RID,
    normalMap: RID
  ) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(mesh)
    _args.append(texture)
    _args.append(normalMap)
    __method_bind.canvasItemAddMultimesh.call(this._handle, _args.toVariant(), 4)
  }

  fun canvasItemAddNinePatch(
    item: RID,
    rect: Rect2,
    source: Rect2,
    texture: RID,
    topleft: Vector2,
    bottomright: Vector2,
    xAxisMode: Int,
    yAxisMode: Int,
    drawCenter: Boolean,
    modulate: Color,
    normalMap: RID
  ) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(rect)
    _args.append(source)
    _args.append(texture)
    _args.append(topleft)
    _args.append(bottomright)
    _args.append(xAxisMode)
    _args.append(yAxisMode)
    _args.append(drawCenter)
    _args.append(modulate)
    _args.append(normalMap)
    __method_bind.canvasItemAddNinePatch.call(this._handle, _args.toVariant(), 11)
  }

  fun canvasItemAddParticles(
    item: RID,
    particles: RID,
    texture: RID,
    normalMap: RID
  ) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(particles)
    _args.append(texture)
    _args.append(normalMap)
    __method_bind.canvasItemAddParticles.call(this._handle, _args.toVariant(), 4)
  }

  fun canvasItemAddPolygon(
    item: RID,
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: RID,
    normalMap: RID,
    antialiased: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(points)
    _args.append(colors)
    _args.append(uvs)
    _args.append(texture)
    _args.append(normalMap)
    _args.append(antialiased)
    __method_bind.canvasItemAddPolygon.call(this._handle, _args.toVariant(), 7)
  }

  fun canvasItemAddPolyline(
    item: RID,
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Float,
    antialiased: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(points)
    _args.append(colors)
    _args.append(width)
    _args.append(antialiased)
    __method_bind.canvasItemAddPolyline.call(this._handle, _args.toVariant(), 5)
  }

  fun canvasItemAddPrimitive(
    item: RID,
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: RID,
    width: Float,
    normalMap: RID
  ) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(points)
    _args.append(colors)
    _args.append(uvs)
    _args.append(texture)
    _args.append(width)
    _args.append(normalMap)
    __method_bind.canvasItemAddPrimitive.call(this._handle, _args.toVariant(), 7)
  }

  fun canvasItemAddRect(
    item: RID,
    rect: Rect2,
    color: Color
  ) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(rect)
    _args.append(color)
    __method_bind.canvasItemAddRect.call(this._handle, _args.toVariant(), 3)
  }

  fun canvasItemAddSetTransform(item: RID, transform: Transform2D) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(transform)
    __method_bind.canvasItemAddSetTransform.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemAddTextureRect(
    item: RID,
    rect: Rect2,
    texture: RID,
    tile: Boolean,
    modulate: Color,
    transpose: Boolean,
    normalMap: RID
  ) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(rect)
    _args.append(texture)
    _args.append(tile)
    _args.append(modulate)
    _args.append(transpose)
    _args.append(normalMap)
    __method_bind.canvasItemAddTextureRect.call(this._handle, _args.toVariant(), 7)
  }

  fun canvasItemAddTextureRectRegion(
    item: RID,
    rect: Rect2,
    texture: RID,
    srcRect: Rect2,
    modulate: Color,
    transpose: Boolean,
    normalMap: RID,
    clipUv: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(rect)
    _args.append(texture)
    _args.append(srcRect)
    _args.append(modulate)
    _args.append(transpose)
    _args.append(normalMap)
    _args.append(clipUv)
    __method_bind.canvasItemAddTextureRectRegion.call(this._handle, _args.toVariant(), 8)
  }

  fun canvasItemAddTriangleArray(
    item: RID,
    indices: PoolIntArray,
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    bones: PoolIntArray,
    weights: PoolRealArray,
    texture: RID,
    count: Int,
    normalMap: RID
  ) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(indices)
    _args.append(points)
    _args.append(colors)
    _args.append(uvs)
    _args.append(bones)
    _args.append(weights)
    _args.append(texture)
    _args.append(count)
    _args.append(normalMap)
    __method_bind.canvasItemAddTriangleArray.call(this._handle, _args.toVariant(), 10)
  }

  fun canvasItemClear(item: RID) {
    val _arg = Variant.new(item)
    __method_bind.canvasItemClear.call(this._handle, _arg, 1)
  }

  fun canvasItemCreate(): RID {
    val _ret = __method_bind.canvasItemCreate.call(this._handle)
    return _ret.asRID()
  }

  fun canvasItemSetClip(item: RID, clip: Boolean) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(clip)
    __method_bind.canvasItemSetClip.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemSetCopyToBackbuffer(
    item: RID,
    enabled: Boolean,
    rect: Rect2
  ) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(enabled)
    _args.append(rect)
    __method_bind.canvasItemSetCopyToBackbuffer.call(this._handle, _args.toVariant(), 3)
  }

  fun canvasItemSetCustomRect(
    item: RID,
    useCustomRect: Boolean,
    rect: Rect2
  ) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(useCustomRect)
    _args.append(rect)
    __method_bind.canvasItemSetCustomRect.call(this._handle, _args.toVariant(), 3)
  }

  fun canvasItemSetDistanceFieldMode(item: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(enabled)
    __method_bind.canvasItemSetDistanceFieldMode.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemSetDrawBehindParent(item: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(enabled)
    __method_bind.canvasItemSetDrawBehindParent.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemSetDrawIndex(item: RID, index: Int) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(index)
    __method_bind.canvasItemSetDrawIndex.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemSetLightMask(item: RID, mask: Int) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(mask)
    __method_bind.canvasItemSetLightMask.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemSetMaterial(item: RID, material: RID) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(material)
    __method_bind.canvasItemSetMaterial.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemSetModulate(item: RID, color: Color) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(color)
    __method_bind.canvasItemSetModulate.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemSetParent(item: RID, parent: RID) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(parent)
    __method_bind.canvasItemSetParent.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemSetSelfModulate(item: RID, color: Color) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(color)
    __method_bind.canvasItemSetSelfModulate.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemSetSortChildrenByY(item: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(enabled)
    __method_bind.canvasItemSetSortChildrenByY.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemSetTransform(item: RID, transform: Transform2D) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(transform)
    __method_bind.canvasItemSetTransform.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemSetUseParentMaterial(item: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(enabled)
    __method_bind.canvasItemSetUseParentMaterial.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemSetVisible(item: RID, visible: Boolean) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(visible)
    __method_bind.canvasItemSetVisible.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemSetZAsRelativeToParent(item: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(enabled)
    __method_bind.canvasItemSetZAsRelativeToParent.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasItemSetZIndex(item: RID, zIndex: Int) {
    val _args = VariantArray.new()
    _args.append(item)
    _args.append(zIndex)
    __method_bind.canvasItemSetZIndex.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightAttachToCanvas(light: RID, canvas: RID) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(canvas)
    __method_bind.canvasLightAttachToCanvas.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightCreate(): RID {
    val _ret = __method_bind.canvasLightCreate.call(this._handle)
    return _ret.asRID()
  }

  fun canvasLightOccluderAttachToCanvas(occluder: RID, canvas: RID) {
    val _args = VariantArray.new()
    _args.append(occluder)
    _args.append(canvas)
    __method_bind.canvasLightOccluderAttachToCanvas.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightOccluderCreate(): RID {
    val _ret = __method_bind.canvasLightOccluderCreate.call(this._handle)
    return _ret.asRID()
  }

  fun canvasLightOccluderSetEnabled(occluder: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(occluder)
    _args.append(enabled)
    __method_bind.canvasLightOccluderSetEnabled.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightOccluderSetLightMask(occluder: RID, mask: Int) {
    val _args = VariantArray.new()
    _args.append(occluder)
    _args.append(mask)
    __method_bind.canvasLightOccluderSetLightMask.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightOccluderSetPolygon(occluder: RID, polygon: RID) {
    val _args = VariantArray.new()
    _args.append(occluder)
    _args.append(polygon)
    __method_bind.canvasLightOccluderSetPolygon.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightOccluderSetTransform(occluder: RID, transform: Transform2D) {
    val _args = VariantArray.new()
    _args.append(occluder)
    _args.append(transform)
    __method_bind.canvasLightOccluderSetTransform.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetColor(light: RID, color: Color) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(color)
    __method_bind.canvasLightSetColor.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetEnabled(light: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(enabled)
    __method_bind.canvasLightSetEnabled.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetEnergy(light: RID, energy: Float) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(energy)
    __method_bind.canvasLightSetEnergy.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetHeight(light: RID, height: Float) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(height)
    __method_bind.canvasLightSetHeight.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetItemCullMask(light: RID, mask: Int) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(mask)
    __method_bind.canvasLightSetItemCullMask.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetItemShadowCullMask(light: RID, mask: Int) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(mask)
    __method_bind.canvasLightSetItemShadowCullMask.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetLayerRange(
    light: RID,
    minLayer: Int,
    maxLayer: Int
  ) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(minLayer)
    _args.append(maxLayer)
    __method_bind.canvasLightSetLayerRange.call(this._handle, _args.toVariant(), 3)
  }

  fun canvasLightSetMode(light: RID, mode: Int) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(mode)
    __method_bind.canvasLightSetMode.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetScale(light: RID, scale: Float) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(scale)
    __method_bind.canvasLightSetScale.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetShadowBufferSize(light: RID, size: Int) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(size)
    __method_bind.canvasLightSetShadowBufferSize.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetShadowColor(light: RID, color: Color) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(color)
    __method_bind.canvasLightSetShadowColor.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetShadowEnabled(light: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(enabled)
    __method_bind.canvasLightSetShadowEnabled.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetShadowFilter(light: RID, filter: Int) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(filter)
    __method_bind.canvasLightSetShadowFilter.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetShadowGradientLength(light: RID, length: Float) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(length)
    __method_bind.canvasLightSetShadowGradientLength.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetShadowSmooth(light: RID, smooth: Float) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(smooth)
    __method_bind.canvasLightSetShadowSmooth.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetTexture(light: RID, texture: RID) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(texture)
    __method_bind.canvasLightSetTexture.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetTextureOffset(light: RID, offset: Vector2) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(offset)
    __method_bind.canvasLightSetTextureOffset.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetTransform(light: RID, transform: Transform2D) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(transform)
    __method_bind.canvasLightSetTransform.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasLightSetZRange(
    light: RID,
    minZ: Int,
    maxZ: Int
  ) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(minZ)
    _args.append(maxZ)
    __method_bind.canvasLightSetZRange.call(this._handle, _args.toVariant(), 3)
  }

  fun canvasOccluderPolygonCreate(): RID {
    val _ret = __method_bind.canvasOccluderPolygonCreate.call(this._handle)
    return _ret.asRID()
  }

  fun canvasOccluderPolygonSetCullMode(occluderPolygon: RID, mode: Int) {
    val _args = VariantArray.new()
    _args.append(occluderPolygon)
    _args.append(mode)
    __method_bind.canvasOccluderPolygonSetCullMode.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasOccluderPolygonSetShape(
    occluderPolygon: RID,
    shape: PoolVector2Array,
    closed: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(occluderPolygon)
    _args.append(shape)
    _args.append(closed)
    __method_bind.canvasOccluderPolygonSetShape.call(this._handle, _args.toVariant(), 3)
  }

  fun canvasOccluderPolygonSetShapeAsLines(occluderPolygon: RID, shape: PoolVector2Array) {
    val _args = VariantArray.new()
    _args.append(occluderPolygon)
    _args.append(shape)
    __method_bind.canvasOccluderPolygonSetShapeAsLines.call(this._handle, _args.toVariant(), 2)
  }

  fun canvasSetItemMirroring(
    canvas: RID,
    item: RID,
    mirroring: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(canvas)
    _args.append(item)
    _args.append(mirroring)
    __method_bind.canvasSetItemMirroring.call(this._handle, _args.toVariant(), 3)
  }

  fun canvasSetModulate(canvas: RID, color: Color) {
    val _args = VariantArray.new()
    _args.append(canvas)
    _args.append(color)
    __method_bind.canvasSetModulate.call(this._handle, _args.toVariant(), 2)
  }

  fun directionalLightCreate(): RID {
    val _ret = __method_bind.directionalLightCreate.call(this._handle)
    return _ret.asRID()
  }

  fun draw(swapBuffers: Boolean, frameStep: Float) {
    val _args = VariantArray.new()
    _args.append(swapBuffers)
    _args.append(frameStep)
    __method_bind.draw.call(this._handle, _args.toVariant(), 2)
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
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(enable)
    _args.append(brightness)
    _args.append(contrast)
    _args.append(saturation)
    _args.append(ramp)
    __method_bind.environmentSetAdjustment.call(this._handle, _args.toVariant(), 6)
  }

  fun environmentSetAmbientLight(
    env: RID,
    color: Color,
    energy: Float,
    skyContibution: Float
  ) {
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(color)
    _args.append(energy)
    _args.append(skyContibution)
    __method_bind.environmentSetAmbientLight.call(this._handle, _args.toVariant(), 4)
  }

  fun environmentSetBackground(env: RID, bg: Int) {
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(bg)
    __method_bind.environmentSetBackground.call(this._handle, _args.toVariant(), 2)
  }

  fun environmentSetBgColor(env: RID, color: Color) {
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(color)
    __method_bind.environmentSetBgColor.call(this._handle, _args.toVariant(), 2)
  }

  fun environmentSetBgEnergy(env: RID, energy: Float) {
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(energy)
    __method_bind.environmentSetBgEnergy.call(this._handle, _args.toVariant(), 2)
  }

  fun environmentSetCanvasMaxLayer(env: RID, maxLayer: Int) {
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(maxLayer)
    __method_bind.environmentSetCanvasMaxLayer.call(this._handle, _args.toVariant(), 2)
  }

  fun environmentSetDofBlurFar(
    env: RID,
    enable: Boolean,
    distance: Float,
    transition: Float,
    farAmount: Float,
    quality: Int
  ) {
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(enable)
    _args.append(distance)
    _args.append(transition)
    _args.append(farAmount)
    _args.append(quality)
    __method_bind.environmentSetDofBlurFar.call(this._handle, _args.toVariant(), 6)
  }

  fun environmentSetDofBlurNear(
    env: RID,
    enable: Boolean,
    distance: Float,
    transition: Float,
    farAmount: Float,
    quality: Int
  ) {
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(enable)
    _args.append(distance)
    _args.append(transition)
    _args.append(farAmount)
    _args.append(quality)
    __method_bind.environmentSetDofBlurNear.call(this._handle, _args.toVariant(), 6)
  }

  fun environmentSetFog(
    env: RID,
    enable: Boolean,
    color: Color,
    sunColor: Color,
    sunAmount: Float
  ) {
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(enable)
    _args.append(color)
    _args.append(sunColor)
    _args.append(sunAmount)
    __method_bind.environmentSetFog.call(this._handle, _args.toVariant(), 5)
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
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(enable)
    _args.append(depthBegin)
    _args.append(depthEnd)
    _args.append(depthCurve)
    _args.append(transmit)
    _args.append(transmitCurve)
    __method_bind.environmentSetFogDepth.call(this._handle, _args.toVariant(), 7)
  }

  fun environmentSetFogHeight(
    env: RID,
    enable: Boolean,
    minHeight: Float,
    maxHeight: Float,
    heightCurve: Float
  ) {
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(enable)
    _args.append(minHeight)
    _args.append(maxHeight)
    _args.append(heightCurve)
    __method_bind.environmentSetFogHeight.call(this._handle, _args.toVariant(), 5)
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
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(enable)
    _args.append(levelFlags)
    _args.append(intensity)
    _args.append(strength)
    _args.append(bloomThreshold)
    _args.append(blendMode)
    _args.append(hdrBleedThreshold)
    _args.append(hdrBleedScale)
    _args.append(hdrLuminanceCap)
    _args.append(bicubicUpscale)
    __method_bind.environmentSetGlow.call(this._handle, _args.toVariant(), 11)
  }

  fun environmentSetSky(env: RID, sky: RID) {
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(sky)
    __method_bind.environmentSetSky.call(this._handle, _args.toVariant(), 2)
  }

  fun environmentSetSkyCustomFov(env: RID, scale: Float) {
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(scale)
    __method_bind.environmentSetSkyCustomFov.call(this._handle, _args.toVariant(), 2)
  }

  fun environmentSetSkyOrientation(env: RID, orientation: Basis) {
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(orientation)
    __method_bind.environmentSetSkyOrientation.call(this._handle, _args.toVariant(), 2)
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
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(enable)
    _args.append(radius)
    _args.append(intensity)
    _args.append(radius2)
    _args.append(intensity2)
    _args.append(bias)
    _args.append(lightAffect)
    _args.append(aoChannelAffect)
    _args.append(color)
    _args.append(quality)
    _args.append(blur)
    _args.append(bilateralSharpness)
    __method_bind.environmentSetSsao.call(this._handle, _args.toVariant(), 13)
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
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(enable)
    _args.append(maxSteps)
    _args.append(fadeIn)
    _args.append(fadeOut)
    _args.append(depthTolerance)
    _args.append(roughness)
    __method_bind.environmentSetSsr.call(this._handle, _args.toVariant(), 7)
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
    val _args = VariantArray.new()
    _args.append(env)
    _args.append(toneMapper)
    _args.append(exposure)
    _args.append(white)
    _args.append(autoExposure)
    _args.append(minLuminance)
    _args.append(maxLuminance)
    _args.append(autoExpSpeed)
    _args.append(autoExpGrey)
    __method_bind.environmentSetTonemap.call(this._handle, _args.toVariant(), 9)
  }

  fun finish() {
    __method_bind.finish.call(this._handle)
  }

  fun forceDraw(swapBuffers: Boolean, frameStep: Float) {
    val _args = VariantArray.new()
    _args.append(swapBuffers)
    _args.append(frameStep)
    __method_bind.forceDraw.call(this._handle, _args.toVariant(), 2)
  }

  fun forceSync() {
    __method_bind.forceSync.call(this._handle)
  }

  fun freeRid(rid: RID) {
    val _arg = Variant.new(rid)
    __method_bind.freeRid.call(this._handle, _arg, 1)
  }

  fun getRenderInfo(info: Int): Int {
    val _arg = Variant.new(info)
    val _ret = __method_bind.getRenderInfo.call(this._handle, _arg, 1)
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

  fun getWhiteTexture(): RID {
    val _ret = __method_bind.getWhiteTexture.call(this._handle)
    return _ret.asRID()
  }

  fun giProbeCreate(): RID {
    val _ret = __method_bind.giProbeCreate.call(this._handle)
    return _ret.asRID()
  }

  fun giProbeGetBias(probe: RID): Float {
    val _arg = Variant.new(probe)
    val _ret = __method_bind.giProbeGetBias.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun giProbeGetBounds(probe: RID): AABB {
    val _arg = Variant.new(probe)
    val _ret = __method_bind.giProbeGetBounds.call(this._handle, _arg, 1)
    return _ret.asAABB()
  }

  fun giProbeGetCellSize(probe: RID): Float {
    val _arg = Variant.new(probe)
    val _ret = __method_bind.giProbeGetCellSize.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun giProbeGetDynamicData(probe: RID): PoolIntArray {
    val _arg = Variant.new(probe)
    val _ret = __method_bind.giProbeGetDynamicData.call(this._handle, _arg, 1)
    return _ret.asPoolIntArray()
  }

  fun giProbeGetDynamicRange(probe: RID): Int {
    val _arg = Variant.new(probe)
    val _ret = __method_bind.giProbeGetDynamicRange.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun giProbeGetEnergy(probe: RID): Float {
    val _arg = Variant.new(probe)
    val _ret = __method_bind.giProbeGetEnergy.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun giProbeGetNormalBias(probe: RID): Float {
    val _arg = Variant.new(probe)
    val _ret = __method_bind.giProbeGetNormalBias.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun giProbeGetPropagation(probe: RID): Float {
    val _arg = Variant.new(probe)
    val _ret = __method_bind.giProbeGetPropagation.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun giProbeGetToCellXform(probe: RID): Transform {
    val _arg = Variant.new(probe)
    val _ret = __method_bind.giProbeGetToCellXform.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun giProbeIsCompressed(probe: RID): Boolean {
    val _arg = Variant.new(probe)
    val _ret = __method_bind.giProbeIsCompressed.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun giProbeIsInterior(probe: RID): Boolean {
    val _arg = Variant.new(probe)
    val _ret = __method_bind.giProbeIsInterior.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun giProbeSetBias(probe: RID, bias: Float) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(bias)
    __method_bind.giProbeSetBias.call(this._handle, _args.toVariant(), 2)
  }

  fun giProbeSetBounds(probe: RID, bounds: AABB) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(bounds)
    __method_bind.giProbeSetBounds.call(this._handle, _args.toVariant(), 2)
  }

  fun giProbeSetCellSize(probe: RID, range: Float) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(range)
    __method_bind.giProbeSetCellSize.call(this._handle, _args.toVariant(), 2)
  }

  fun giProbeSetCompress(probe: RID, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(enable)
    __method_bind.giProbeSetCompress.call(this._handle, _args.toVariant(), 2)
  }

  fun giProbeSetDynamicData(probe: RID, data: PoolIntArray) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(data)
    __method_bind.giProbeSetDynamicData.call(this._handle, _args.toVariant(), 2)
  }

  fun giProbeSetDynamicRange(probe: RID, range: Int) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(range)
    __method_bind.giProbeSetDynamicRange.call(this._handle, _args.toVariant(), 2)
  }

  fun giProbeSetEnergy(probe: RID, energy: Float) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(energy)
    __method_bind.giProbeSetEnergy.call(this._handle, _args.toVariant(), 2)
  }

  fun giProbeSetInterior(probe: RID, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(enable)
    __method_bind.giProbeSetInterior.call(this._handle, _args.toVariant(), 2)
  }

  fun giProbeSetNormalBias(probe: RID, bias: Float) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(bias)
    __method_bind.giProbeSetNormalBias.call(this._handle, _args.toVariant(), 2)
  }

  fun giProbeSetPropagation(probe: RID, propagation: Float) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(propagation)
    __method_bind.giProbeSetPropagation.call(this._handle, _args.toVariant(), 2)
  }

  fun giProbeSetToCellXform(probe: RID, xform: Transform) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(xform)
    __method_bind.giProbeSetToCellXform.call(this._handle, _args.toVariant(), 2)
  }

  fun hasChanged(): Boolean {
    val _ret = __method_bind.hasChanged.call(this._handle)
    return _ret.asBoolean()
  }

  fun hasFeature(feature: Int): Boolean {
    val _arg = Variant.new(feature)
    val _ret = __method_bind.hasFeature.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasOsFeature(feature: String): Boolean {
    val _arg = Variant.new(feature)
    val _ret = __method_bind.hasOsFeature.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun immediateBegin(
    immediate: RID,
    primitive: Int,
    texture: RID
  ) {
    val _args = VariantArray.new()
    _args.append(immediate)
    _args.append(primitive)
    _args.append(texture)
    __method_bind.immediateBegin.call(this._handle, _args.toVariant(), 3)
  }

  fun immediateClear(immediate: RID) {
    val _arg = Variant.new(immediate)
    __method_bind.immediateClear.call(this._handle, _arg, 1)
  }

  fun immediateColor(immediate: RID, color: Color) {
    val _args = VariantArray.new()
    _args.append(immediate)
    _args.append(color)
    __method_bind.immediateColor.call(this._handle, _args.toVariant(), 2)
  }

  fun immediateCreate(): RID {
    val _ret = __method_bind.immediateCreate.call(this._handle)
    return _ret.asRID()
  }

  fun immediateEnd(immediate: RID) {
    val _arg = Variant.new(immediate)
    __method_bind.immediateEnd.call(this._handle, _arg, 1)
  }

  fun immediateGetMaterial(immediate: RID): RID {
    val _arg = Variant.new(immediate)
    val _ret = __method_bind.immediateGetMaterial.call(this._handle, _arg, 1)
    return _ret.asRID()
  }

  fun immediateNormal(immediate: RID, normal: Vector3) {
    val _args = VariantArray.new()
    _args.append(immediate)
    _args.append(normal)
    __method_bind.immediateNormal.call(this._handle, _args.toVariant(), 2)
  }

  fun immediateSetMaterial(immediate: RID, material: RID) {
    val _args = VariantArray.new()
    _args.append(immediate)
    _args.append(material)
    __method_bind.immediateSetMaterial.call(this._handle, _args.toVariant(), 2)
  }

  fun immediateTangent(immediate: RID, tangent: Plane) {
    val _args = VariantArray.new()
    _args.append(immediate)
    _args.append(tangent)
    __method_bind.immediateTangent.call(this._handle, _args.toVariant(), 2)
  }

  fun immediateUv(immediate: RID, texUv: Vector2) {
    val _args = VariantArray.new()
    _args.append(immediate)
    _args.append(texUv)
    __method_bind.immediateUv.call(this._handle, _args.toVariant(), 2)
  }

  fun immediateUv2(immediate: RID, texUv: Vector2) {
    val _args = VariantArray.new()
    _args.append(immediate)
    _args.append(texUv)
    __method_bind.immediateUv2.call(this._handle, _args.toVariant(), 2)
  }

  fun immediateVertex(immediate: RID, vertex: Vector3) {
    val _args = VariantArray.new()
    _args.append(immediate)
    _args.append(vertex)
    __method_bind.immediateVertex.call(this._handle, _args.toVariant(), 2)
  }

  fun immediateVertex2d(immediate: RID, vertex: Vector2) {
    val _args = VariantArray.new()
    _args.append(immediate)
    _args.append(vertex)
    __method_bind.immediateVertex2d.call(this._handle, _args.toVariant(), 2)
  }

  fun init() {
    __method_bind.init.call(this._handle)
  }

  fun instanceAttachObjectInstanceId(instance: RID, id: Int) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(id)
    __method_bind.instanceAttachObjectInstanceId.call(this._handle, _args.toVariant(), 2)
  }

  fun instanceAttachSkeleton(instance: RID, skeleton: RID) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(skeleton)
    __method_bind.instanceAttachSkeleton.call(this._handle, _args.toVariant(), 2)
  }

  fun instanceCreate(): RID {
    val _ret = __method_bind.instanceCreate.call(this._handle)
    return _ret.asRID()
  }

  fun instanceCreate2(base: RID, scenario: RID): RID {
    val _args = VariantArray.new()
    _args.append(base)
    _args.append(scenario)
    val _ret = __method_bind.instanceCreate2.call(this._handle, _args.toVariant(), 2)
    return _ret.asRID()
  }

  fun instanceGeometrySetAsInstanceLod(instance: RID, asLodOfInstance: RID) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(asLodOfInstance)
    __method_bind.instanceGeometrySetAsInstanceLod.call(this._handle, _args.toVariant(), 2)
  }

  fun instanceGeometrySetCastShadowsSetting(instance: RID, shadowCastingSetting: Int) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(shadowCastingSetting)
    __method_bind.instanceGeometrySetCastShadowsSetting.call(this._handle, _args.toVariant(), 2)
  }

  fun instanceGeometrySetDrawRange(
    instance: RID,
    min: Float,
    max: Float,
    minMargin: Float,
    maxMargin: Float
  ) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(min)
    _args.append(max)
    _args.append(minMargin)
    _args.append(maxMargin)
    __method_bind.instanceGeometrySetDrawRange.call(this._handle, _args.toVariant(), 5)
  }

  fun instanceGeometrySetFlag(
    instance: RID,
    flag: Int,
    enabled: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(flag)
    _args.append(enabled)
    __method_bind.instanceGeometrySetFlag.call(this._handle, _args.toVariant(), 3)
  }

  fun instanceGeometrySetMaterialOverride(instance: RID, material: RID) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(material)
    __method_bind.instanceGeometrySetMaterialOverride.call(this._handle, _args.toVariant(), 2)
  }

  fun instanceSetBase(instance: RID, base: RID) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(base)
    __method_bind.instanceSetBase.call(this._handle, _args.toVariant(), 2)
  }

  fun instanceSetBlendShapeWeight(
    instance: RID,
    shape: Int,
    weight: Float
  ) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(shape)
    _args.append(weight)
    __method_bind.instanceSetBlendShapeWeight.call(this._handle, _args.toVariant(), 3)
  }

  fun instanceSetCustomAabb(instance: RID, aabb: AABB) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(aabb)
    __method_bind.instanceSetCustomAabb.call(this._handle, _args.toVariant(), 2)
  }

  fun instanceSetExterior(instance: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(enabled)
    __method_bind.instanceSetExterior.call(this._handle, _args.toVariant(), 2)
  }

  fun instanceSetExtraVisibilityMargin(instance: RID, margin: Float) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(margin)
    __method_bind.instanceSetExtraVisibilityMargin.call(this._handle, _args.toVariant(), 2)
  }

  fun instanceSetLayerMask(instance: RID, mask: Int) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(mask)
    __method_bind.instanceSetLayerMask.call(this._handle, _args.toVariant(), 2)
  }

  fun instanceSetScenario(instance: RID, scenario: RID) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(scenario)
    __method_bind.instanceSetScenario.call(this._handle, _args.toVariant(), 2)
  }

  fun instanceSetSurfaceMaterial(
    instance: RID,
    surface: Int,
    material: RID
  ) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(surface)
    _args.append(material)
    __method_bind.instanceSetSurfaceMaterial.call(this._handle, _args.toVariant(), 3)
  }

  fun instanceSetTransform(instance: RID, transform: Transform) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(transform)
    __method_bind.instanceSetTransform.call(this._handle, _args.toVariant(), 2)
  }

  fun instanceSetUseLightmap(
    instance: RID,
    lightmapInstance: RID,
    lightmap: RID
  ) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(lightmapInstance)
    _args.append(lightmap)
    __method_bind.instanceSetUseLightmap.call(this._handle, _args.toVariant(), 3)
  }

  fun instanceSetVisible(instance: RID, visible: Boolean) {
    val _args = VariantArray.new()
    _args.append(instance)
    _args.append(visible)
    __method_bind.instanceSetVisible.call(this._handle, _args.toVariant(), 2)
  }

  fun instancesCullAabb(aabb: AABB, scenario: RID): VariantArray {
    val _args = VariantArray.new()
    _args.append(aabb)
    _args.append(scenario)
    val _ret = __method_bind.instancesCullAabb.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  fun instancesCullConvex(convex: VariantArray, scenario: RID): VariantArray {
    val _args = VariantArray.new()
    _args.append(convex)
    _args.append(scenario)
    val _ret = __method_bind.instancesCullConvex.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  fun instancesCullRay(
    from: Vector3,
    to: Vector3,
    scenario: RID
  ): VariantArray {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    _args.append(scenario)
    val _ret = __method_bind.instancesCullRay.call(this._handle, _args.toVariant(), 3)
    return _ret.asVariantArray()
  }

  fun lightDirectionalSetBlendSplits(light: RID, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(enable)
    __method_bind.lightDirectionalSetBlendSplits.call(this._handle, _args.toVariant(), 2)
  }

  fun lightDirectionalSetShadowDepthRangeMode(light: RID, rangeMode: Int) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(rangeMode)
    __method_bind.lightDirectionalSetShadowDepthRangeMode.call(this._handle, _args.toVariant(), 2)
  }

  fun lightDirectionalSetShadowMode(light: RID, mode: Int) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(mode)
    __method_bind.lightDirectionalSetShadowMode.call(this._handle, _args.toVariant(), 2)
  }

  fun lightOmniSetShadowDetail(light: RID, detail: Int) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(detail)
    __method_bind.lightOmniSetShadowDetail.call(this._handle, _args.toVariant(), 2)
  }

  fun lightOmniSetShadowMode(light: RID, mode: Int) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(mode)
    __method_bind.lightOmniSetShadowMode.call(this._handle, _args.toVariant(), 2)
  }

  fun lightSetColor(light: RID, color: Color) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(color)
    __method_bind.lightSetColor.call(this._handle, _args.toVariant(), 2)
  }

  fun lightSetCullMask(light: RID, mask: Int) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(mask)
    __method_bind.lightSetCullMask.call(this._handle, _args.toVariant(), 2)
  }

  fun lightSetNegative(light: RID, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(enable)
    __method_bind.lightSetNegative.call(this._handle, _args.toVariant(), 2)
  }

  fun lightSetParam(
    light: RID,
    param: Int,
    value: Float
  ) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(param)
    _args.append(value)
    __method_bind.lightSetParam.call(this._handle, _args.toVariant(), 3)
  }

  fun lightSetProjector(light: RID, texture: RID) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(texture)
    __method_bind.lightSetProjector.call(this._handle, _args.toVariant(), 2)
  }

  fun lightSetReverseCullFaceMode(light: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(enabled)
    __method_bind.lightSetReverseCullFaceMode.call(this._handle, _args.toVariant(), 2)
  }

  fun lightSetShadow(light: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(enabled)
    __method_bind.lightSetShadow.call(this._handle, _args.toVariant(), 2)
  }

  fun lightSetShadowColor(light: RID, color: Color) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(color)
    __method_bind.lightSetShadowColor.call(this._handle, _args.toVariant(), 2)
  }

  fun lightSetUseGi(light: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(light)
    _args.append(enabled)
    __method_bind.lightSetUseGi.call(this._handle, _args.toVariant(), 2)
  }

  fun lightmapCaptureCreate(): RID {
    val _ret = __method_bind.lightmapCaptureCreate.call(this._handle)
    return _ret.asRID()
  }

  fun lightmapCaptureGetBounds(capture: RID): AABB {
    val _arg = Variant.new(capture)
    val _ret = __method_bind.lightmapCaptureGetBounds.call(this._handle, _arg, 1)
    return _ret.asAABB()
  }

  fun lightmapCaptureGetEnergy(capture: RID): Float {
    val _arg = Variant.new(capture)
    val _ret = __method_bind.lightmapCaptureGetEnergy.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun lightmapCaptureGetOctree(capture: RID): PoolByteArray {
    val _arg = Variant.new(capture)
    val _ret = __method_bind.lightmapCaptureGetOctree.call(this._handle, _arg, 1)
    return _ret.asPoolByteArray()
  }

  fun lightmapCaptureGetOctreeCellSubdiv(capture: RID): Int {
    val _arg = Variant.new(capture)
    val _ret = __method_bind.lightmapCaptureGetOctreeCellSubdiv.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun lightmapCaptureGetOctreeCellTransform(capture: RID): Transform {
    val _arg = Variant.new(capture)
    val _ret = __method_bind.lightmapCaptureGetOctreeCellTransform.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun lightmapCaptureSetBounds(capture: RID, bounds: AABB) {
    val _args = VariantArray.new()
    _args.append(capture)
    _args.append(bounds)
    __method_bind.lightmapCaptureSetBounds.call(this._handle, _args.toVariant(), 2)
  }

  fun lightmapCaptureSetEnergy(capture: RID, energy: Float) {
    val _args = VariantArray.new()
    _args.append(capture)
    _args.append(energy)
    __method_bind.lightmapCaptureSetEnergy.call(this._handle, _args.toVariant(), 2)
  }

  fun lightmapCaptureSetOctree(capture: RID, octree: PoolByteArray) {
    val _args = VariantArray.new()
    _args.append(capture)
    _args.append(octree)
    __method_bind.lightmapCaptureSetOctree.call(this._handle, _args.toVariant(), 2)
  }

  fun lightmapCaptureSetOctreeCellSubdiv(capture: RID, subdiv: Int) {
    val _args = VariantArray.new()
    _args.append(capture)
    _args.append(subdiv)
    __method_bind.lightmapCaptureSetOctreeCellSubdiv.call(this._handle, _args.toVariant(), 2)
  }

  fun lightmapCaptureSetOctreeCellTransform(capture: RID, xform: Transform) {
    val _args = VariantArray.new()
    _args.append(capture)
    _args.append(xform)
    __method_bind.lightmapCaptureSetOctreeCellTransform.call(this._handle, _args.toVariant(), 2)
  }

  fun makeSphereMesh(
    latitudes: Int,
    longitudes: Int,
    radius: Float
  ): RID {
    val _args = VariantArray.new()
    _args.append(latitudes)
    _args.append(longitudes)
    _args.append(radius)
    val _ret = __method_bind.makeSphereMesh.call(this._handle, _args.toVariant(), 3)
    return _ret.asRID()
  }

  fun materialCreate(): RID {
    val _ret = __method_bind.materialCreate.call(this._handle)
    return _ret.asRID()
  }

  fun materialGetParam(material: RID, parameter: String): Variant {
    val _args = VariantArray.new()
    _args.append(material)
    _args.append(parameter)
    val _ret = __method_bind.materialGetParam.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun materialGetParamDefault(material: RID, parameter: String): Variant {
    val _args = VariantArray.new()
    _args.append(material)
    _args.append(parameter)
    val _ret = __method_bind.materialGetParamDefault.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun materialGetShader(shaderMaterial: RID): RID {
    val _arg = Variant.new(shaderMaterial)
    val _ret = __method_bind.materialGetShader.call(this._handle, _arg, 1)
    return _ret.asRID()
  }

  fun materialSetLineWidth(material: RID, width: Float) {
    val _args = VariantArray.new()
    _args.append(material)
    _args.append(width)
    __method_bind.materialSetLineWidth.call(this._handle, _args.toVariant(), 2)
  }

  fun materialSetNextPass(material: RID, nextMaterial: RID) {
    val _args = VariantArray.new()
    _args.append(material)
    _args.append(nextMaterial)
    __method_bind.materialSetNextPass.call(this._handle, _args.toVariant(), 2)
  }

  fun materialSetParam(
    material: RID,
    parameter: String,
    value: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(material)
    _args.append(parameter)
    _args.append(value)
    __method_bind.materialSetParam.call(this._handle, _args.toVariant(), 3)
  }

  fun materialSetRenderPriority(material: RID, priority: Int) {
    val _args = VariantArray.new()
    _args.append(material)
    _args.append(priority)
    __method_bind.materialSetRenderPriority.call(this._handle, _args.toVariant(), 2)
  }

  fun materialSetShader(shaderMaterial: RID, shader: RID) {
    val _args = VariantArray.new()
    _args.append(shaderMaterial)
    _args.append(shader)
    __method_bind.materialSetShader.call(this._handle, _args.toVariant(), 2)
  }

  fun meshAddSurfaceFromArrays(
    mesh: RID,
    primtive: Int,
    arrays: VariantArray,
    blendShapes: VariantArray,
    compressFormat: Int
  ) {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(primtive)
    _args.append(arrays)
    _args.append(blendShapes)
    _args.append(compressFormat)
    __method_bind.meshAddSurfaceFromArrays.call(this._handle, _args.toVariant(), 5)
  }

  fun meshClear(mesh: RID) {
    val _arg = Variant.new(mesh)
    __method_bind.meshClear.call(this._handle, _arg, 1)
  }

  fun meshCreate(): RID {
    val _ret = __method_bind.meshCreate.call(this._handle)
    return _ret.asRID()
  }

  fun meshGetBlendShapeCount(mesh: RID): Int {
    val _arg = Variant.new(mesh)
    val _ret = __method_bind.meshGetBlendShapeCount.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun meshGetBlendShapeMode(mesh: RID): BlendShapeMode {
    val _arg = Variant.new(mesh)
    val _ret = __method_bind.meshGetBlendShapeMode.call(this._handle, _arg, 1)
    return VisualServer.BlendShapeMode.from(_ret.asInt())
  }

  fun meshGetCustomAabb(mesh: RID): AABB {
    val _arg = Variant.new(mesh)
    val _ret = __method_bind.meshGetCustomAabb.call(this._handle, _arg, 1)
    return _ret.asAABB()
  }

  fun meshGetSurfaceCount(mesh: RID): Int {
    val _arg = Variant.new(mesh)
    val _ret = __method_bind.meshGetSurfaceCount.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun meshRemoveSurface(mesh: RID, index: Int) {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(index)
    __method_bind.meshRemoveSurface.call(this._handle, _args.toVariant(), 2)
  }

  fun meshSetBlendShapeCount(mesh: RID, amount: Int) {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(amount)
    __method_bind.meshSetBlendShapeCount.call(this._handle, _args.toVariant(), 2)
  }

  fun meshSetBlendShapeMode(mesh: RID, mode: Int) {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(mode)
    __method_bind.meshSetBlendShapeMode.call(this._handle, _args.toVariant(), 2)
  }

  fun meshSetCustomAabb(mesh: RID, aabb: AABB) {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(aabb)
    __method_bind.meshSetCustomAabb.call(this._handle, _args.toVariant(), 2)
  }

  fun meshSurfaceGetAabb(mesh: RID, surface: Int): AABB {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(surface)
    val _ret = __method_bind.meshSurfaceGetAabb.call(this._handle, _args.toVariant(), 2)
    return _ret.asAABB()
  }

  fun meshSurfaceGetArray(mesh: RID, surface: Int): PoolByteArray {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(surface)
    val _ret = __method_bind.meshSurfaceGetArray.call(this._handle, _args.toVariant(), 2)
    return _ret.asPoolByteArray()
  }

  fun meshSurfaceGetArrayIndexLen(mesh: RID, surface: Int): Int {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(surface)
    val _ret = __method_bind.meshSurfaceGetArrayIndexLen.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun meshSurfaceGetArrayLen(mesh: RID, surface: Int): Int {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(surface)
    val _ret = __method_bind.meshSurfaceGetArrayLen.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun meshSurfaceGetArrays(mesh: RID, surface: Int): VariantArray {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(surface)
    val _ret = __method_bind.meshSurfaceGetArrays.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  fun meshSurfaceGetBlendShapeArrays(mesh: RID, surface: Int): VariantArray {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(surface)
    val _ret = __method_bind.meshSurfaceGetBlendShapeArrays.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  fun meshSurfaceGetFormat(mesh: RID, surface: Int): Int {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(surface)
    val _ret = __method_bind.meshSurfaceGetFormat.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun meshSurfaceGetFormatOffset(
    format: Int,
    vertexLen: Int,
    indexLen: Int,
    arrayIndex: Int
  ): Int {
    val _args = VariantArray.new()
    _args.append(format)
    _args.append(vertexLen)
    _args.append(indexLen)
    _args.append(arrayIndex)
    val _ret = __method_bind.meshSurfaceGetFormatOffset.call(this._handle, _args.toVariant(), 4)
    return _ret.asInt()
  }

  fun meshSurfaceGetFormatStride(
    format: Int,
    vertexLen: Int,
    indexLen: Int
  ): Int {
    val _args = VariantArray.new()
    _args.append(format)
    _args.append(vertexLen)
    _args.append(indexLen)
    val _ret = __method_bind.meshSurfaceGetFormatStride.call(this._handle, _args.toVariant(), 3)
    return _ret.asInt()
  }

  fun meshSurfaceGetIndexArray(mesh: RID, surface: Int): PoolByteArray {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(surface)
    val _ret = __method_bind.meshSurfaceGetIndexArray.call(this._handle, _args.toVariant(), 2)
    return _ret.asPoolByteArray()
  }

  fun meshSurfaceGetMaterial(mesh: RID, surface: Int): RID {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(surface)
    val _ret = __method_bind.meshSurfaceGetMaterial.call(this._handle, _args.toVariant(), 2)
    return _ret.asRID()
  }

  fun meshSurfaceGetPrimitiveType(mesh: RID, surface: Int): PrimitiveType {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(surface)
    val _ret = __method_bind.meshSurfaceGetPrimitiveType.call(this._handle, _args.toVariant(), 2)
    return VisualServer.PrimitiveType.from(_ret.asInt())
  }

  fun meshSurfaceGetSkeletonAabb(mesh: RID, surface: Int): VariantArray {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(surface)
    val _ret = __method_bind.meshSurfaceGetSkeletonAabb.call(this._handle, _args.toVariant(), 2)
    return _ret.asVariantArray()
  }

  fun meshSurfaceSetMaterial(
    mesh: RID,
    surface: Int,
    material: RID
  ) {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(surface)
    _args.append(material)
    __method_bind.meshSurfaceSetMaterial.call(this._handle, _args.toVariant(), 3)
  }

  fun meshSurfaceUpdateRegion(
    mesh: RID,
    surface: Int,
    offset: Int,
    data: PoolByteArray
  ) {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(surface)
    _args.append(offset)
    _args.append(data)
    __method_bind.meshSurfaceUpdateRegion.call(this._handle, _args.toVariant(), 4)
  }

  fun multimeshAllocate(
    multimesh: RID,
    instances: Int,
    transformFormat: Int,
    colorFormat: Int,
    customDataFormat: Int
  ) {
    val _args = VariantArray.new()
    _args.append(multimesh)
    _args.append(instances)
    _args.append(transformFormat)
    _args.append(colorFormat)
    _args.append(customDataFormat)
    __method_bind.multimeshAllocate.call(this._handle, _args.toVariant(), 5)
  }

  fun multimeshGetAabb(multimesh: RID): AABB {
    val _arg = Variant.new(multimesh)
    val _ret = __method_bind.multimeshGetAabb.call(this._handle, _arg, 1)
    return _ret.asAABB()
  }

  fun multimeshGetInstanceCount(multimesh: RID): Int {
    val _arg = Variant.new(multimesh)
    val _ret = __method_bind.multimeshGetInstanceCount.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun multimeshGetMesh(multimesh: RID): RID {
    val _arg = Variant.new(multimesh)
    val _ret = __method_bind.multimeshGetMesh.call(this._handle, _arg, 1)
    return _ret.asRID()
  }

  fun multimeshGetVisibleInstances(multimesh: RID): Int {
    val _arg = Variant.new(multimesh)
    val _ret = __method_bind.multimeshGetVisibleInstances.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun multimeshInstanceGetColor(multimesh: RID, index: Int): Color {
    val _args = VariantArray.new()
    _args.append(multimesh)
    _args.append(index)
    val _ret = __method_bind.multimeshInstanceGetColor.call(this._handle, _args.toVariant(), 2)
    return _ret.asColor()
  }

  fun multimeshInstanceGetCustomData(multimesh: RID, index: Int): Color {
    val _args = VariantArray.new()
    _args.append(multimesh)
    _args.append(index)
    val _ret = __method_bind.multimeshInstanceGetCustomData.call(this._handle, _args.toVariant(), 2)
    return _ret.asColor()
  }

  fun multimeshInstanceGetTransform(multimesh: RID, index: Int): Transform {
    val _args = VariantArray.new()
    _args.append(multimesh)
    _args.append(index)
    val _ret = __method_bind.multimeshInstanceGetTransform.call(this._handle, _args.toVariant(), 2)
    return _ret.asTransform()
  }

  fun multimeshInstanceGetTransform2d(multimesh: RID, index: Int): Transform2D {
    val _args = VariantArray.new()
    _args.append(multimesh)
    _args.append(index)
    val _ret = __method_bind.multimeshInstanceGetTransform2d.call(this._handle, _args.toVariant(),
        2)
    return _ret.asTransform2D()
  }

  fun multimeshInstanceSetColor(
    multimesh: RID,
    index: Int,
    color: Color
  ) {
    val _args = VariantArray.new()
    _args.append(multimesh)
    _args.append(index)
    _args.append(color)
    __method_bind.multimeshInstanceSetColor.call(this._handle, _args.toVariant(), 3)
  }

  fun multimeshInstanceSetCustomData(
    multimesh: RID,
    index: Int,
    customData: Color
  ) {
    val _args = VariantArray.new()
    _args.append(multimesh)
    _args.append(index)
    _args.append(customData)
    __method_bind.multimeshInstanceSetCustomData.call(this._handle, _args.toVariant(), 3)
  }

  fun multimeshInstanceSetTransform(
    multimesh: RID,
    index: Int,
    transform: Transform
  ) {
    val _args = VariantArray.new()
    _args.append(multimesh)
    _args.append(index)
    _args.append(transform)
    __method_bind.multimeshInstanceSetTransform.call(this._handle, _args.toVariant(), 3)
  }

  fun multimeshInstanceSetTransform2d(
    multimesh: RID,
    index: Int,
    transform: Transform2D
  ) {
    val _args = VariantArray.new()
    _args.append(multimesh)
    _args.append(index)
    _args.append(transform)
    __method_bind.multimeshInstanceSetTransform2d.call(this._handle, _args.toVariant(), 3)
  }

  fun multimeshSetAsBulkArray(multimesh: RID, array: PoolRealArray) {
    val _args = VariantArray.new()
    _args.append(multimesh)
    _args.append(array)
    __method_bind.multimeshSetAsBulkArray.call(this._handle, _args.toVariant(), 2)
  }

  fun multimeshSetMesh(multimesh: RID, mesh: RID) {
    val _args = VariantArray.new()
    _args.append(multimesh)
    _args.append(mesh)
    __method_bind.multimeshSetMesh.call(this._handle, _args.toVariant(), 2)
  }

  fun multimeshSetVisibleInstances(multimesh: RID, visible: Int) {
    val _args = VariantArray.new()
    _args.append(multimesh)
    _args.append(visible)
    __method_bind.multimeshSetVisibleInstances.call(this._handle, _args.toVariant(), 2)
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
    val _arg = Variant.new(particles)
    val _ret = __method_bind.particlesGetCurrentAabb.call(this._handle, _arg, 1)
    return _ret.asAABB()
  }

  fun particlesGetEmitting(particles: RID): Boolean {
    val _arg = Variant.new(particles)
    val _ret = __method_bind.particlesGetEmitting.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun particlesRestart(particles: RID) {
    val _arg = Variant.new(particles)
    __method_bind.particlesRestart.call(this._handle, _arg, 1)
  }

  fun particlesSetAmount(particles: RID, amount: Int) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(amount)
    __method_bind.particlesSetAmount.call(this._handle, _args.toVariant(), 2)
  }

  fun particlesSetCustomAabb(particles: RID, aabb: AABB) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(aabb)
    __method_bind.particlesSetCustomAabb.call(this._handle, _args.toVariant(), 2)
  }

  fun particlesSetDrawOrder(particles: RID, order: Int) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(order)
    __method_bind.particlesSetDrawOrder.call(this._handle, _args.toVariant(), 2)
  }

  fun particlesSetDrawPassMesh(
    particles: RID,
    pass: Int,
    mesh: RID
  ) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(pass)
    _args.append(mesh)
    __method_bind.particlesSetDrawPassMesh.call(this._handle, _args.toVariant(), 3)
  }

  fun particlesSetDrawPasses(particles: RID, count: Int) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(count)
    __method_bind.particlesSetDrawPasses.call(this._handle, _args.toVariant(), 2)
  }

  fun particlesSetEmissionTransform(particles: RID, transform: Transform) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(transform)
    __method_bind.particlesSetEmissionTransform.call(this._handle, _args.toVariant(), 2)
  }

  fun particlesSetEmitting(particles: RID, emitting: Boolean) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(emitting)
    __method_bind.particlesSetEmitting.call(this._handle, _args.toVariant(), 2)
  }

  fun particlesSetExplosivenessRatio(particles: RID, ratio: Float) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(ratio)
    __method_bind.particlesSetExplosivenessRatio.call(this._handle, _args.toVariant(), 2)
  }

  fun particlesSetFixedFps(particles: RID, fps: Int) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(fps)
    __method_bind.particlesSetFixedFps.call(this._handle, _args.toVariant(), 2)
  }

  fun particlesSetFractionalDelta(particles: RID, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(enable)
    __method_bind.particlesSetFractionalDelta.call(this._handle, _args.toVariant(), 2)
  }

  fun particlesSetLifetime(particles: RID, lifetime: Float) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(lifetime)
    __method_bind.particlesSetLifetime.call(this._handle, _args.toVariant(), 2)
  }

  fun particlesSetOneShot(particles: RID, oneShot: Boolean) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(oneShot)
    __method_bind.particlesSetOneShot.call(this._handle, _args.toVariant(), 2)
  }

  fun particlesSetPreProcessTime(particles: RID, time: Float) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(time)
    __method_bind.particlesSetPreProcessTime.call(this._handle, _args.toVariant(), 2)
  }

  fun particlesSetProcessMaterial(particles: RID, material: RID) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(material)
    __method_bind.particlesSetProcessMaterial.call(this._handle, _args.toVariant(), 2)
  }

  fun particlesSetRandomnessRatio(particles: RID, ratio: Float) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(ratio)
    __method_bind.particlesSetRandomnessRatio.call(this._handle, _args.toVariant(), 2)
  }

  fun particlesSetSpeedScale(particles: RID, scale: Float) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(scale)
    __method_bind.particlesSetSpeedScale.call(this._handle, _args.toVariant(), 2)
  }

  fun particlesSetUseLocalCoordinates(particles: RID, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(particles)
    _args.append(enable)
    __method_bind.particlesSetUseLocalCoordinates.call(this._handle, _args.toVariant(), 2)
  }

  fun reflectionProbeCreate(): RID {
    val _ret = __method_bind.reflectionProbeCreate.call(this._handle)
    return _ret.asRID()
  }

  fun reflectionProbeSetAsInterior(probe: RID, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(enable)
    __method_bind.reflectionProbeSetAsInterior.call(this._handle, _args.toVariant(), 2)
  }

  fun reflectionProbeSetCullMask(probe: RID, layers: Int) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(layers)
    __method_bind.reflectionProbeSetCullMask.call(this._handle, _args.toVariant(), 2)
  }

  fun reflectionProbeSetEnableBoxProjection(probe: RID, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(enable)
    __method_bind.reflectionProbeSetEnableBoxProjection.call(this._handle, _args.toVariant(), 2)
  }

  fun reflectionProbeSetEnableShadows(probe: RID, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(enable)
    __method_bind.reflectionProbeSetEnableShadows.call(this._handle, _args.toVariant(), 2)
  }

  fun reflectionProbeSetExtents(probe: RID, extents: Vector3) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(extents)
    __method_bind.reflectionProbeSetExtents.call(this._handle, _args.toVariant(), 2)
  }

  fun reflectionProbeSetIntensity(probe: RID, intensity: Float) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(intensity)
    __method_bind.reflectionProbeSetIntensity.call(this._handle, _args.toVariant(), 2)
  }

  fun reflectionProbeSetInteriorAmbient(probe: RID, color: Color) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(color)
    __method_bind.reflectionProbeSetInteriorAmbient.call(this._handle, _args.toVariant(), 2)
  }

  fun reflectionProbeSetInteriorAmbientEnergy(probe: RID, energy: Float) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(energy)
    __method_bind.reflectionProbeSetInteriorAmbientEnergy.call(this._handle, _args.toVariant(), 2)
  }

  fun reflectionProbeSetInteriorAmbientProbeContribution(probe: RID, contrib: Float) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(contrib)
    __method_bind.reflectionProbeSetInteriorAmbientProbeContribution.call(this._handle,
        _args.toVariant(), 2)
  }

  fun reflectionProbeSetMaxDistance(probe: RID, distance: Float) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(distance)
    __method_bind.reflectionProbeSetMaxDistance.call(this._handle, _args.toVariant(), 2)
  }

  fun reflectionProbeSetOriginOffset(probe: RID, offset: Vector3) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(offset)
    __method_bind.reflectionProbeSetOriginOffset.call(this._handle, _args.toVariant(), 2)
  }

  fun reflectionProbeSetUpdateMode(probe: RID, mode: Int) {
    val _args = VariantArray.new()
    _args.append(probe)
    _args.append(mode)
    __method_bind.reflectionProbeSetUpdateMode.call(this._handle, _args.toVariant(), 2)
  }

  fun requestFrameDrawnCallback(
    where: Object,
    method: String,
    userdata: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(where)
    _args.append(method)
    _args.append(userdata)
    __method_bind.requestFrameDrawnCallback.call(this._handle, _args.toVariant(), 3)
  }

  fun scenarioCreate(): RID {
    val _ret = __method_bind.scenarioCreate.call(this._handle)
    return _ret.asRID()
  }

  fun scenarioSetDebug(scenario: RID, debugMode: Int) {
    val _args = VariantArray.new()
    _args.append(scenario)
    _args.append(debugMode)
    __method_bind.scenarioSetDebug.call(this._handle, _args.toVariant(), 2)
  }

  fun scenarioSetEnvironment(scenario: RID, environment: RID) {
    val _args = VariantArray.new()
    _args.append(scenario)
    _args.append(environment)
    __method_bind.scenarioSetEnvironment.call(this._handle, _args.toVariant(), 2)
  }

  fun scenarioSetFallbackEnvironment(scenario: RID, environment: RID) {
    val _args = VariantArray.new()
    _args.append(scenario)
    _args.append(environment)
    __method_bind.scenarioSetFallbackEnvironment.call(this._handle, _args.toVariant(), 2)
  }

  fun scenarioSetReflectionAtlasSize(
    scenario: RID,
    size: Int,
    subdiv: Int
  ) {
    val _args = VariantArray.new()
    _args.append(scenario)
    _args.append(size)
    _args.append(subdiv)
    __method_bind.scenarioSetReflectionAtlasSize.call(this._handle, _args.toVariant(), 3)
  }

  fun setBootImage(
    image: Image,
    color: Color,
    scale: Boolean,
    useFilter: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(image)
    _args.append(color)
    _args.append(scale)
    _args.append(useFilter)
    __method_bind.setBootImage.call(this._handle, _args.toVariant(), 4)
  }

  fun setDebugGenerateWireframes(generate: Boolean) {
    val _arg = Variant.new(generate)
    __method_bind.setDebugGenerateWireframes.call(this._handle, _arg, 1)
  }

  fun setDefaultClearColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setDefaultClearColor.call(this._handle, _arg, 1)
  }

  fun shaderCreate(): RID {
    val _ret = __method_bind.shaderCreate.call(this._handle)
    return _ret.asRID()
  }

  fun shaderGetCode(shader: RID): String {
    val _arg = Variant.new(shader)
    val _ret = __method_bind.shaderGetCode.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun shaderGetDefaultTextureParam(shader: RID, name: String): RID {
    val _args = VariantArray.new()
    _args.append(shader)
    _args.append(name)
    val _ret = __method_bind.shaderGetDefaultTextureParam.call(this._handle, _args.toVariant(), 2)
    return _ret.asRID()
  }

  fun shaderGetParamList(shader: RID): VariantArray {
    val _arg = Variant.new(shader)
    val _ret = __method_bind.shaderGetParamList.call(this._handle, _arg, 1)
    return _ret.asVariantArray()
  }

  fun shaderSetCode(shader: RID, code: String) {
    val _args = VariantArray.new()
    _args.append(shader)
    _args.append(code)
    __method_bind.shaderSetCode.call(this._handle, _args.toVariant(), 2)
  }

  fun shaderSetDefaultTextureParam(
    shader: RID,
    name: String,
    texture: RID
  ) {
    val _args = VariantArray.new()
    _args.append(shader)
    _args.append(name)
    _args.append(texture)
    __method_bind.shaderSetDefaultTextureParam.call(this._handle, _args.toVariant(), 3)
  }

  fun skeletonAllocate(
    skeleton: RID,
    bones: Int,
    is2dSkeleton: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(skeleton)
    _args.append(bones)
    _args.append(is2dSkeleton)
    __method_bind.skeletonAllocate.call(this._handle, _args.toVariant(), 3)
  }

  fun skeletonBoneGetTransform(skeleton: RID, bone: Int): Transform {
    val _args = VariantArray.new()
    _args.append(skeleton)
    _args.append(bone)
    val _ret = __method_bind.skeletonBoneGetTransform.call(this._handle, _args.toVariant(), 2)
    return _ret.asTransform()
  }

  fun skeletonBoneGetTransform2d(skeleton: RID, bone: Int): Transform2D {
    val _args = VariantArray.new()
    _args.append(skeleton)
    _args.append(bone)
    val _ret = __method_bind.skeletonBoneGetTransform2d.call(this._handle, _args.toVariant(), 2)
    return _ret.asTransform2D()
  }

  fun skeletonBoneSetTransform(
    skeleton: RID,
    bone: Int,
    transform: Transform
  ) {
    val _args = VariantArray.new()
    _args.append(skeleton)
    _args.append(bone)
    _args.append(transform)
    __method_bind.skeletonBoneSetTransform.call(this._handle, _args.toVariant(), 3)
  }

  fun skeletonBoneSetTransform2d(
    skeleton: RID,
    bone: Int,
    transform: Transform2D
  ) {
    val _args = VariantArray.new()
    _args.append(skeleton)
    _args.append(bone)
    _args.append(transform)
    __method_bind.skeletonBoneSetTransform2d.call(this._handle, _args.toVariant(), 3)
  }

  fun skeletonCreate(): RID {
    val _ret = __method_bind.skeletonCreate.call(this._handle)
    return _ret.asRID()
  }

  fun skeletonGetBoneCount(skeleton: RID): Int {
    val _arg = Variant.new(skeleton)
    val _ret = __method_bind.skeletonGetBoneCount.call(this._handle, _arg, 1)
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
    val _args = VariantArray.new()
    _args.append(sky)
    _args.append(cubeMap)
    _args.append(radianceSize)
    __method_bind.skySetTexture.call(this._handle, _args.toVariant(), 3)
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
    flags: Int
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(width)
    _args.append(height)
    _args.append(depth3d)
    _args.append(format)
    _args.append(type)
    _args.append(flags)
    __method_bind.textureAllocate.call(this._handle, _args.toVariant(), 7)
  }

  fun textureBind(texture: RID, number: Int) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(number)
    __method_bind.textureBind.call(this._handle, _args.toVariant(), 2)
  }

  fun textureCreate(): RID {
    val _ret = __method_bind.textureCreate.call(this._handle)
    return _ret.asRID()
  }

  fun textureCreateFromImage(image: Image, flags: Int): RID {
    val _args = VariantArray.new()
    _args.append(image)
    _args.append(flags)
    val _ret = __method_bind.textureCreateFromImage.call(this._handle, _args.toVariant(), 2)
    return _ret.asRID()
  }

  fun textureDebugUsage(): VariantArray {
    val _ret = __method_bind.textureDebugUsage.call(this._handle)
    return _ret.asVariantArray()
  }

  fun textureGetData(texture: RID, cubeSide: Int): Image {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(cubeSide)
    val _ret = __method_bind.textureGetData.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Image)!!
  }

  fun textureGetDepth(texture: RID): Int {
    val _arg = Variant.new(texture)
    val _ret = __method_bind.textureGetDepth.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun textureGetFlags(texture: RID): Int {
    val _arg = Variant.new(texture)
    val _ret = __method_bind.textureGetFlags.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun textureGetFormat(texture: RID): Image.Format {
    val _arg = Variant.new(texture)
    val _ret = __method_bind.textureGetFormat.call(this._handle, _arg, 1)
    return Image.Format.from(_ret.asInt())
  }

  fun textureGetHeight(texture: RID): Int {
    val _arg = Variant.new(texture)
    val _ret = __method_bind.textureGetHeight.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun textureGetPath(texture: RID): String {
    val _arg = Variant.new(texture)
    val _ret = __method_bind.textureGetPath.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun textureGetTexid(texture: RID): Int {
    val _arg = Variant.new(texture)
    val _ret = __method_bind.textureGetTexid.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun textureGetType(texture: RID): TextureType {
    val _arg = Variant.new(texture)
    val _ret = __method_bind.textureGetType.call(this._handle, _arg, 1)
    return VisualServer.TextureType.from(_ret.asInt())
  }

  fun textureGetWidth(texture: RID): Int {
    val _arg = Variant.new(texture)
    val _ret = __method_bind.textureGetWidth.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun textureSetData(
    texture: RID,
    image: Image,
    layer: Int
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(image)
    _args.append(layer)
    __method_bind.textureSetData.call(this._handle, _args.toVariant(), 3)
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
    layer: Int
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(image)
    _args.append(srcX)
    _args.append(srcY)
    _args.append(srcW)
    _args.append(srcH)
    _args.append(dstX)
    _args.append(dstY)
    _args.append(dstMip)
    _args.append(layer)
    __method_bind.textureSetDataPartial.call(this._handle, _args.toVariant(), 10)
  }

  fun textureSetFlags(texture: RID, flags: Int) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(flags)
    __method_bind.textureSetFlags.call(this._handle, _args.toVariant(), 2)
  }

  fun textureSetPath(texture: RID, path: String) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(path)
    __method_bind.textureSetPath.call(this._handle, _args.toVariant(), 2)
  }

  fun textureSetShrinkAllX2OnSetData(shrink: Boolean) {
    val _arg = Variant.new(shrink)
    __method_bind.textureSetShrinkAllX2OnSetData.call(this._handle, _arg, 1)
  }

  fun textureSetSizeOverride(
    texture: RID,
    width: Int,
    height: Int,
    depth: Int
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(width)
    _args.append(height)
    _args.append(depth)
    __method_bind.textureSetSizeOverride.call(this._handle, _args.toVariant(), 4)
  }

  fun texturesKeepOriginal(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.texturesKeepOriginal.call(this._handle, _arg, 1)
  }

  fun viewportAttachCamera(viewport: RID, camera: RID) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(camera)
    __method_bind.viewportAttachCamera.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportAttachCanvas(viewport: RID, canvas: RID) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(canvas)
    __method_bind.viewportAttachCanvas.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportAttachToScreen(
    viewport: RID,
    rect: Rect2,
    screen: Int
  ) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(rect)
    _args.append(screen)
    __method_bind.viewportAttachToScreen.call(this._handle, _args.toVariant(), 3)
  }

  fun viewportCreate(): RID {
    val _ret = __method_bind.viewportCreate.call(this._handle)
    return _ret.asRID()
  }

  fun viewportDetach(viewport: RID) {
    val _arg = Variant.new(viewport)
    __method_bind.viewportDetach.call(this._handle, _arg, 1)
  }

  fun viewportGetRenderInfo(viewport: RID, info: Int): Int {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(info)
    val _ret = __method_bind.viewportGetRenderInfo.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun viewportGetTexture(viewport: RID): RID {
    val _arg = Variant.new(viewport)
    val _ret = __method_bind.viewportGetTexture.call(this._handle, _arg, 1)
    return _ret.asRID()
  }

  fun viewportRemoveCanvas(viewport: RID, canvas: RID) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(canvas)
    __method_bind.viewportRemoveCanvas.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetActive(viewport: RID, active: Boolean) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(active)
    __method_bind.viewportSetActive.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetCanvasStacking(
    viewport: RID,
    canvas: RID,
    layer: Int,
    sublayer: Int
  ) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(canvas)
    _args.append(layer)
    _args.append(sublayer)
    __method_bind.viewportSetCanvasStacking.call(this._handle, _args.toVariant(), 4)
  }

  fun viewportSetCanvasTransform(
    viewport: RID,
    canvas: RID,
    offset: Transform2D
  ) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(canvas)
    _args.append(offset)
    __method_bind.viewportSetCanvasTransform.call(this._handle, _args.toVariant(), 3)
  }

  fun viewportSetClearMode(viewport: RID, clearMode: Int) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(clearMode)
    __method_bind.viewportSetClearMode.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetDebugDraw(viewport: RID, draw: Int) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(draw)
    __method_bind.viewportSetDebugDraw.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetDisable3d(viewport: RID, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(disabled)
    __method_bind.viewportSetDisable3d.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetDisableEnvironment(viewport: RID, disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(disabled)
    __method_bind.viewportSetDisableEnvironment.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetGlobalCanvasTransform(viewport: RID, transform: Transform2D) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(transform)
    __method_bind.viewportSetGlobalCanvasTransform.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetHdr(viewport: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(enabled)
    __method_bind.viewportSetHdr.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetHideCanvas(viewport: RID, hidden: Boolean) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(hidden)
    __method_bind.viewportSetHideCanvas.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetHideScenario(viewport: RID, hidden: Boolean) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(hidden)
    __method_bind.viewportSetHideScenario.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetMsaa(viewport: RID, msaa: Int) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(msaa)
    __method_bind.viewportSetMsaa.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetParentViewport(viewport: RID, parentViewport: RID) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(parentViewport)
    __method_bind.viewportSetParentViewport.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetRenderDirectToScreen(viewport: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(enabled)
    __method_bind.viewportSetRenderDirectToScreen.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetScenario(viewport: RID, scenario: RID) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(scenario)
    __method_bind.viewportSetScenario.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetShadowAtlasQuadrantSubdivision(
    viewport: RID,
    quadrant: Int,
    subdivision: Int
  ) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(quadrant)
    _args.append(subdivision)
    __method_bind.viewportSetShadowAtlasQuadrantSubdivision.call(this._handle, _args.toVariant(), 3)
  }

  fun viewportSetShadowAtlasSize(viewport: RID, size: Int) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(size)
    __method_bind.viewportSetShadowAtlasSize.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetSize(
    viewport: RID,
    width: Int,
    height: Int
  ) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(width)
    _args.append(height)
    __method_bind.viewportSetSize.call(this._handle, _args.toVariant(), 3)
  }

  fun viewportSetTransparentBackground(viewport: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(enabled)
    __method_bind.viewportSetTransparentBackground.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetUpdateMode(viewport: RID, updateMode: Int) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(updateMode)
    __method_bind.viewportSetUpdateMode.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetUsage(viewport: RID, usage: Int) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(usage)
    __method_bind.viewportSetUsage.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetUseArvr(viewport: RID, useArvr: Boolean) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(useArvr)
    __method_bind.viewportSetUseArvr.call(this._handle, _args.toVariant(), 2)
  }

  fun viewportSetVflip(viewport: RID, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(viewport)
    _args.append(enabled)
    __method_bind.viewportSetVflip.call(this._handle, _args.toVariant(), 2)
  }

  enum class ReflectionProbeUpdateMode(
    val value: Int
  ) {
    REFLECTION_PROBE_UPDATE_ONCE(0),

    REFLECTION_PROBE_UPDATE_ALWAYS(1);

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
    LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_STABLE(0),

    LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_OPTIMIZED(1);

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
    BLEND_SHAPE_MODE_NORMALIZED(0),

    BLEND_SHAPE_MODE_RELATIVE(1);

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
    PRIMITIVE_POINTS(0),

    PRIMITIVE_LINES(1),

    PRIMITIVE_LINE_STRIP(2),

    PRIMITIVE_LINE_LOOP(3),

    PRIMITIVE_TRIANGLES(4),

    PRIMITIVE_TRIANGLE_STRIP(5),

    PRIMITIVE_TRIANGLE_FAN(6),

    PRIMITIVE_MAX(7);

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
    TEXTURE_TYPE_2D(0),

    TEXTURE_TYPE_CUBEMAP(1),

    TEXTURE_TYPE_2D_ARRAY(2),

    TEXTURE_TYPE_3D(3);

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
    NINE_PATCH_STRETCH(0),

    NINE_PATCH_TILE(1),

    NINE_PATCH_TILE_FIT(2);

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
    VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME(0),

    VIEWPORT_RENDER_INFO_VERTICES_IN_FRAME(1),

    VIEWPORT_RENDER_INFO_MATERIAL_CHANGES_IN_FRAME(2),

    VIEWPORT_RENDER_INFO_SHADER_CHANGES_IN_FRAME(3),

    VIEWPORT_RENDER_INFO_SURFACE_CHANGES_IN_FRAME(4),

    VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME(5),

    VIEWPORT_RENDER_INFO_MAX(6);

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
    VIEWPORT_CLEAR_ALWAYS(0),

    VIEWPORT_CLEAR_NEVER(1),

    VIEWPORT_CLEAR_ONLY_NEXT_FRAME(2);

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
    LIGHT_OMNI_SHADOW_DETAIL_VERTICAL(0),

    LIGHT_OMNI_SHADOW_DETAIL_HORIZONTAL(1);

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
    SHADER_SPATIAL(0),

    SHADER_CANVAS_ITEM(1),

    SHADER_PARTICLES(2),

    SHADER_MAX(3);

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
    MULTIMESH_TRANSFORM_2D(0),

    MULTIMESH_TRANSFORM_3D(1);

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
    SHADOW_CASTING_SETTING_OFF(0),

    SHADOW_CASTING_SETTING_ON(1),

    SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),

    SHADOW_CASTING_SETTING_SHADOWS_ONLY(3);

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
    VIEWPORT_DEBUG_DRAW_DISABLED(0),

    VIEWPORT_DEBUG_DRAW_UNSHADED(1),

    VIEWPORT_DEBUG_DRAW_OVERDRAW(2),

    VIEWPORT_DEBUG_DRAW_WIREFRAME(3);

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
    VIEWPORT_USAGE_2D(0),

    VIEWPORT_USAGE_2D_NO_SAMPLING(1),

    VIEWPORT_USAGE_3D(2),

    VIEWPORT_USAGE_3D_NO_EFFECTS(3);

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
    MULTIMESH_CUSTOM_DATA_NONE(0),

    MULTIMESH_CUSTOM_DATA_8BIT(1),

    MULTIMESH_CUSTOM_DATA_FLOAT(2);

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
    LIGHT_OMNI_SHADOW_DUAL_PARABOLOID(0),

    LIGHT_OMNI_SHADOW_CUBE(1);

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
    TEXTURE_FLAG_MIPMAPS(1),

    TEXTURE_FLAG_REPEAT(2),

    TEXTURE_FLAG_FILTER(4),

    TEXTURE_FLAGS_DEFAULT(7),

    TEXTURE_FLAG_ANISOTROPIC_FILTER(8),

    TEXTURE_FLAG_CONVERT_TO_LINEAR(16),

    TEXTURE_FLAG_MIRRORED_REPEAT(32),

    TEXTURE_FLAG_USED_FOR_STREAMING(2048);

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
    INSTANCE_NONE(0),

    INSTANCE_MESH(1),

    INSTANCE_MULTIMESH(2),

    INSTANCE_IMMEDIATE(3),

    INSTANCE_PARTICLES(4),

    INSTANCE_LIGHT(5),

    INSTANCE_REFLECTION_PROBE(6),

    INSTANCE_GI_PROBE(7),

    INSTANCE_LIGHTMAP_CAPTURE(8),

    INSTANCE_MAX(9),

    INSTANCE_GEOMETRY_MASK(30);

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
    MULTIMESH_COLOR_NONE(0),

    MULTIMESH_COLOR_8BIT(1),

    MULTIMESH_COLOR_FLOAT(2);

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
    CANVAS_LIGHT_FILTER_NONE(0),

    CANVAS_LIGHT_FILTER_PCF3(1),

    CANVAS_LIGHT_FILTER_PCF5(2),

    CANVAS_LIGHT_FILTER_PCF7(3),

    CANVAS_LIGHT_FILTER_PCF9(4),

    CANVAS_LIGHT_FILTER_PCF13(5);

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
    SCENARIO_DEBUG_DISABLED(0),

    SCENARIO_DEBUG_WIREFRAME(1),

    SCENARIO_DEBUG_OVERDRAW(2),

    SCENARIO_DEBUG_SHADELESS(3);

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
    VIEWPORT_UPDATE_DISABLED(0),

    VIEWPORT_UPDATE_ONCE(1),

    VIEWPORT_UPDATE_WHEN_VISIBLE(2),

    VIEWPORT_UPDATE_ALWAYS(3);

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
    ARRAY_FORMAT_VERTEX(1),

    ARRAY_FORMAT_NORMAL(2),

    ARRAY_FORMAT_TANGENT(4),

    ARRAY_FORMAT_COLOR(8),

    ARRAY_FORMAT_TEX_UV(16),

    ARRAY_FORMAT_TEX_UV2(32),

    ARRAY_FORMAT_BONES(64),

    ARRAY_FORMAT_WEIGHTS(128),

    ARRAY_FORMAT_INDEX(256),

    ARRAY_COMPRESS_VERTEX(512),

    ARRAY_COMPRESS_NORMAL(1024),

    ARRAY_COMPRESS_TANGENT(2048),

    ARRAY_COMPRESS_COLOR(4096),

    ARRAY_COMPRESS_TEX_UV(8192),

    ARRAY_COMPRESS_TEX_UV2(16384),

    ARRAY_COMPRESS_BONES(32768),

    ARRAY_COMPRESS_WEIGHTS(65536),

    ARRAY_COMPRESS_DEFAULT(97280),

    ARRAY_COMPRESS_INDEX(131072),

    ARRAY_FLAG_USE_2D_VERTICES(262144),

    ARRAY_FLAG_USE_16_BIT_BONES(524288);

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
    PARTICLES_DRAW_ORDER_INDEX(0),

    PARTICLES_DRAW_ORDER_LIFETIME(1),

    PARTICLES_DRAW_ORDER_VIEW_DEPTH(2);

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
    CANVAS_LIGHT_MODE_ADD(0),

    CANVAS_LIGHT_MODE_SUB(1),

    CANVAS_LIGHT_MODE_MIX(2),

    CANVAS_LIGHT_MODE_MASK(3);

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
    LIGHT_DIRECTIONAL_SHADOW_ORTHOGONAL(0),

    LIGHT_DIRECTIONAL_SHADOW_PARALLEL_2_SPLITS(1),

    LIGHT_DIRECTIONAL_SHADOW_PARALLEL_4_SPLITS(2);

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
    LIGHT_PARAM_ENERGY(0),

    LIGHT_PARAM_SPECULAR(2),

    LIGHT_PARAM_RANGE(3),

    LIGHT_PARAM_ATTENUATION(4),

    LIGHT_PARAM_SPOT_ANGLE(5),

    LIGHT_PARAM_SPOT_ATTENUATION(6),

    LIGHT_PARAM_CONTACT_SHADOW_SIZE(7),

    LIGHT_PARAM_SHADOW_MAX_DISTANCE(8),

    LIGHT_PARAM_SHADOW_SPLIT_1_OFFSET(9),

    LIGHT_PARAM_SHADOW_SPLIT_2_OFFSET(10),

    LIGHT_PARAM_SHADOW_SPLIT_3_OFFSET(11),

    LIGHT_PARAM_SHADOW_NORMAL_BIAS(12),

    LIGHT_PARAM_SHADOW_BIAS(13),

    LIGHT_PARAM_SHADOW_BIAS_SPLIT_SCALE(14),

    LIGHT_PARAM_MAX(15);

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
    ARRAY_VERTEX(0),

    ARRAY_NORMAL(1),

    ARRAY_TANGENT(2),

    ARRAY_COLOR(3),

    ARRAY_TEX_UV(4),

    ARRAY_TEX_UV2(5),

    ARRAY_BONES(6),

    ARRAY_WEIGHTS(7),

    ARRAY_INDEX(8),

    ARRAY_MAX(9);

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
    CANVAS_OCCLUDER_POLYGON_CULL_DISABLED(0),

    CANVAS_OCCLUDER_POLYGON_CULL_CLOCKWISE(1),

    CANVAS_OCCLUDER_POLYGON_CULL_COUNTER_CLOCKWISE(2);

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
    INSTANCE_FLAG_USE_BAKED_LIGHT(0),

    INSTANCE_FLAG_DRAW_NEXT_FRAME_IF_VISIBLE(1),

    INSTANCE_FLAG_MAX(2);

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
    VIEWPORT_MSAA_DISABLED(0),

    VIEWPORT_MSAA_2X(1),

    VIEWPORT_MSAA_4X(2),

    VIEWPORT_MSAA_8X(3),

    VIEWPORT_MSAA_16X(4);

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
    LIGHT_DIRECTIONAL(0),

    LIGHT_OMNI(1),

    LIGHT_SPOT(2);

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

  companion object {
    val Instance: VisualServer
      get() = memScoped {
        val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("VisualServer".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton VisualServer" }
        VisualServer(
          handle
        )
      }
    val ARRAY_BONES: Int = 6

    val ARRAY_COLOR: Int = 3

    val ARRAY_COMPRESS_BONES: Int = 32768

    val ARRAY_COMPRESS_COLOR: Int = 4096

    val ARRAY_COMPRESS_DEFAULT: Int = 97280

    val ARRAY_COMPRESS_INDEX: Int = 131072

    val ARRAY_COMPRESS_NORMAL: Int = 1024

    val ARRAY_COMPRESS_TANGENT: Int = 2048

    val ARRAY_COMPRESS_TEX_UV: Int = 8192

    val ARRAY_COMPRESS_TEX_UV2: Int = 16384

    val ARRAY_COMPRESS_VERTEX: Int = 512

    val ARRAY_COMPRESS_WEIGHTS: Int = 65536

    val ARRAY_FLAG_USE_16_BIT_BONES: Int = 524288

    val ARRAY_FLAG_USE_2D_VERTICES: Int = 262144

    val ARRAY_FORMAT_BONES: Int = 64

    val ARRAY_FORMAT_COLOR: Int = 8

    val ARRAY_FORMAT_INDEX: Int = 256

    val ARRAY_FORMAT_NORMAL: Int = 2

    val ARRAY_FORMAT_TANGENT: Int = 4

    val ARRAY_FORMAT_TEX_UV: Int = 16

    val ARRAY_FORMAT_TEX_UV2: Int = 32

    val ARRAY_FORMAT_VERTEX: Int = 1

    val ARRAY_FORMAT_WEIGHTS: Int = 128

    val ARRAY_INDEX: Int = 8

    val ARRAY_MAX: Int = 9

    val ARRAY_NORMAL: Int = 1

    val ARRAY_TANGENT: Int = 2

    val ARRAY_TEX_UV: Int = 4

    val ARRAY_TEX_UV2: Int = 5

    val ARRAY_VERTEX: Int = 0

    val ARRAY_WEIGHTS: Int = 7

    val ARRAY_WEIGHTS_SIZE: Int = 4

    val BLEND_SHAPE_MODE_NORMALIZED: Int = 0

    val BLEND_SHAPE_MODE_RELATIVE: Int = 1

    val CANVAS_ITEM_Z_MAX: Int = 4096

    val CANVAS_ITEM_Z_MIN: Int = -4096

    val CANVAS_LIGHT_FILTER_NONE: Int = 0

    val CANVAS_LIGHT_FILTER_PCF13: Int = 5

    val CANVAS_LIGHT_FILTER_PCF3: Int = 1

    val CANVAS_LIGHT_FILTER_PCF5: Int = 2

    val CANVAS_LIGHT_FILTER_PCF7: Int = 3

    val CANVAS_LIGHT_FILTER_PCF9: Int = 4

    val CANVAS_LIGHT_MODE_ADD: Int = 0

    val CANVAS_LIGHT_MODE_MASK: Int = 3

    val CANVAS_LIGHT_MODE_MIX: Int = 2

    val CANVAS_LIGHT_MODE_SUB: Int = 1

    val CANVAS_OCCLUDER_POLYGON_CULL_CLOCKWISE: Int = 1

    val CANVAS_OCCLUDER_POLYGON_CULL_COUNTER_CLOCKWISE: Int = 2

    val CANVAS_OCCLUDER_POLYGON_CULL_DISABLED: Int = 0

    val CUBEMAP_BACK: Int = 5

    val CUBEMAP_BOTTOM: Int = 2

    val CUBEMAP_FRONT: Int = 4

    val CUBEMAP_LEFT: Int = 0

    val CUBEMAP_RIGHT: Int = 1

    val CUBEMAP_TOP: Int = 3

    val ENV_BG_CANVAS: Int = 4

    val ENV_BG_CLEAR_COLOR: Int = 0

    val ENV_BG_COLOR: Int = 1

    val ENV_BG_COLOR_SKY: Int = 3

    val ENV_BG_KEEP: Int = 5

    val ENV_BG_MAX: Int = 7

    val ENV_BG_SKY: Int = 2

    val ENV_DOF_BLUR_QUALITY_HIGH: Int = 2

    val ENV_DOF_BLUR_QUALITY_LOW: Int = 0

    val ENV_DOF_BLUR_QUALITY_MEDIUM: Int = 1

    val ENV_SSAO_BLUR_1x1: Int = 1

    val ENV_SSAO_BLUR_2x2: Int = 2

    val ENV_SSAO_BLUR_3x3: Int = 3

    val ENV_SSAO_BLUR_DISABLED: Int = 0

    val ENV_SSAO_QUALITY_HIGH: Int = 2

    val ENV_SSAO_QUALITY_LOW: Int = 0

    val ENV_SSAO_QUALITY_MEDIUM: Int = 1

    val ENV_TONE_MAPPER_ACES: Int = 3

    val ENV_TONE_MAPPER_FILMIC: Int = 2

    val ENV_TONE_MAPPER_LINEAR: Int = 0

    val ENV_TONE_MAPPER_REINHARD: Int = 1

    val FEATURE_MULTITHREADED: Int = 1

    val FEATURE_SHADERS: Int = 0

    val GLOW_BLEND_MODE_ADDITIVE: Int = 0

    val GLOW_BLEND_MODE_REPLACE: Int = 3

    val GLOW_BLEND_MODE_SCREEN: Int = 1

    val GLOW_BLEND_MODE_SOFTLIGHT: Int = 2

    val INFO_DRAW_CALLS_IN_FRAME: Int = 5

    val INFO_MATERIAL_CHANGES_IN_FRAME: Int = 2

    val INFO_OBJECTS_IN_FRAME: Int = 0

    val INFO_SHADER_CHANGES_IN_FRAME: Int = 3

    val INFO_SURFACE_CHANGES_IN_FRAME: Int = 4

    val INFO_TEXTURE_MEM_USED: Int = 8

    val INFO_USAGE_VIDEO_MEM_TOTAL: Int = 6

    val INFO_VERTEX_MEM_USED: Int = 9

    val INFO_VERTICES_IN_FRAME: Int = 1

    val INFO_VIDEO_MEM_USED: Int = 7

    val INSTANCE_FLAG_DRAW_NEXT_FRAME_IF_VISIBLE: Int = 1

    val INSTANCE_FLAG_MAX: Int = 2

    val INSTANCE_FLAG_USE_BAKED_LIGHT: Int = 0

    val INSTANCE_GEOMETRY_MASK: Int = 30

    val INSTANCE_GI_PROBE: Int = 7

    val INSTANCE_IMMEDIATE: Int = 3

    val INSTANCE_LIGHT: Int = 5

    val INSTANCE_LIGHTMAP_CAPTURE: Int = 8

    val INSTANCE_MAX: Int = 9

    val INSTANCE_MESH: Int = 1

    val INSTANCE_MULTIMESH: Int = 2

    val INSTANCE_NONE: Int = 0

    val INSTANCE_PARTICLES: Int = 4

    val INSTANCE_REFLECTION_PROBE: Int = 6

    val LIGHT_DIRECTIONAL: Int = 0

    val LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_OPTIMIZED: Int = 1

    val LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_STABLE: Int = 0

    val LIGHT_DIRECTIONAL_SHADOW_ORTHOGONAL: Int = 0

    val LIGHT_DIRECTIONAL_SHADOW_PARALLEL_2_SPLITS: Int = 1

    val LIGHT_DIRECTIONAL_SHADOW_PARALLEL_4_SPLITS: Int = 2

    val LIGHT_OMNI: Int = 1

    val LIGHT_OMNI_SHADOW_CUBE: Int = 1

    val LIGHT_OMNI_SHADOW_DETAIL_HORIZONTAL: Int = 1

    val LIGHT_OMNI_SHADOW_DETAIL_VERTICAL: Int = 0

    val LIGHT_OMNI_SHADOW_DUAL_PARABOLOID: Int = 0

    val LIGHT_PARAM_ATTENUATION: Int = 4

    val LIGHT_PARAM_CONTACT_SHADOW_SIZE: Int = 7

    val LIGHT_PARAM_ENERGY: Int = 0

    val LIGHT_PARAM_MAX: Int = 15

    val LIGHT_PARAM_RANGE: Int = 3

    val LIGHT_PARAM_SHADOW_BIAS: Int = 13

    val LIGHT_PARAM_SHADOW_BIAS_SPLIT_SCALE: Int = 14

    val LIGHT_PARAM_SHADOW_MAX_DISTANCE: Int = 8

    val LIGHT_PARAM_SHADOW_NORMAL_BIAS: Int = 12

    val LIGHT_PARAM_SHADOW_SPLIT_1_OFFSET: Int = 9

    val LIGHT_PARAM_SHADOW_SPLIT_2_OFFSET: Int = 10

    val LIGHT_PARAM_SHADOW_SPLIT_3_OFFSET: Int = 11

    val LIGHT_PARAM_SPECULAR: Int = 2

    val LIGHT_PARAM_SPOT_ANGLE: Int = 5

    val LIGHT_PARAM_SPOT_ATTENUATION: Int = 6

    val LIGHT_SPOT: Int = 2

    val MATERIAL_RENDER_PRIORITY_MAX: Int = 127

    val MATERIAL_RENDER_PRIORITY_MIN: Int = -128

    val MAX_CURSORS: Int = 8

    val MAX_GLOW_LEVELS: Int = 7

    val MULTIMESH_COLOR_8BIT: Int = 1

    val MULTIMESH_COLOR_FLOAT: Int = 2

    val MULTIMESH_COLOR_NONE: Int = 0

    val MULTIMESH_CUSTOM_DATA_8BIT: Int = 1

    val MULTIMESH_CUSTOM_DATA_FLOAT: Int = 2

    val MULTIMESH_CUSTOM_DATA_NONE: Int = 0

    val MULTIMESH_TRANSFORM_2D: Int = 0

    val MULTIMESH_TRANSFORM_3D: Int = 1

    val NINE_PATCH_STRETCH: Int = 0

    val NINE_PATCH_TILE: Int = 1

    val NINE_PATCH_TILE_FIT: Int = 2

    val NO_INDEX_ARRAY: Int = -1

    val PARTICLES_DRAW_ORDER_INDEX: Int = 0

    val PARTICLES_DRAW_ORDER_LIFETIME: Int = 1

    val PARTICLES_DRAW_ORDER_VIEW_DEPTH: Int = 2

    val PRIMITIVE_LINES: Int = 1

    val PRIMITIVE_LINE_LOOP: Int = 3

    val PRIMITIVE_LINE_STRIP: Int = 2

    val PRIMITIVE_MAX: Int = 7

    val PRIMITIVE_POINTS: Int = 0

    val PRIMITIVE_TRIANGLES: Int = 4

    val PRIMITIVE_TRIANGLE_FAN: Int = 6

    val PRIMITIVE_TRIANGLE_STRIP: Int = 5

    val REFLECTION_PROBE_UPDATE_ALWAYS: Int = 1

    val REFLECTION_PROBE_UPDATE_ONCE: Int = 0

    val SCENARIO_DEBUG_DISABLED: Int = 0

    val SCENARIO_DEBUG_OVERDRAW: Int = 2

    val SCENARIO_DEBUG_SHADELESS: Int = 3

    val SCENARIO_DEBUG_WIREFRAME: Int = 1

    val SHADER_CANVAS_ITEM: Int = 1

    val SHADER_MAX: Int = 3

    val SHADER_PARTICLES: Int = 2

    val SHADER_SPATIAL: Int = 0

    val SHADOW_CASTING_SETTING_DOUBLE_SIDED: Int = 2

    val SHADOW_CASTING_SETTING_OFF: Int = 0

    val SHADOW_CASTING_SETTING_ON: Int = 1

    val SHADOW_CASTING_SETTING_SHADOWS_ONLY: Int = 3

    val TEXTURE_FLAGS_DEFAULT: Int = 7

    val TEXTURE_FLAG_ANISOTROPIC_FILTER: Int = 8

    val TEXTURE_FLAG_CONVERT_TO_LINEAR: Int = 16

    val TEXTURE_FLAG_FILTER: Int = 4

    val TEXTURE_FLAG_MIPMAPS: Int = 1

    val TEXTURE_FLAG_MIRRORED_REPEAT: Int = 32

    val TEXTURE_FLAG_REPEAT: Int = 2

    val TEXTURE_FLAG_USED_FOR_STREAMING: Int = 2048

    val TEXTURE_TYPE_2D: Int = 0

    val TEXTURE_TYPE_2D_ARRAY: Int = 2

    val TEXTURE_TYPE_3D: Int = 3

    val TEXTURE_TYPE_CUBEMAP: Int = 1

    val VIEWPORT_CLEAR_ALWAYS: Int = 0

    val VIEWPORT_CLEAR_NEVER: Int = 1

    val VIEWPORT_CLEAR_ONLY_NEXT_FRAME: Int = 2

    val VIEWPORT_DEBUG_DRAW_DISABLED: Int = 0

    val VIEWPORT_DEBUG_DRAW_OVERDRAW: Int = 2

    val VIEWPORT_DEBUG_DRAW_UNSHADED: Int = 1

    val VIEWPORT_DEBUG_DRAW_WIREFRAME: Int = 3

    val VIEWPORT_MSAA_16X: Int = 4

    val VIEWPORT_MSAA_2X: Int = 1

    val VIEWPORT_MSAA_4X: Int = 2

    val VIEWPORT_MSAA_8X: Int = 3

    val VIEWPORT_MSAA_DISABLED: Int = 0

    val VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME: Int = 5

    val VIEWPORT_RENDER_INFO_MATERIAL_CHANGES_IN_FRAME: Int = 2

    val VIEWPORT_RENDER_INFO_MAX: Int = 6

    val VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME: Int = 0

    val VIEWPORT_RENDER_INFO_SHADER_CHANGES_IN_FRAME: Int = 3

    val VIEWPORT_RENDER_INFO_SURFACE_CHANGES_IN_FRAME: Int = 4

    val VIEWPORT_RENDER_INFO_VERTICES_IN_FRAME: Int = 1

    val VIEWPORT_UPDATE_ALWAYS: Int = 3

    val VIEWPORT_UPDATE_DISABLED: Int = 0

    val VIEWPORT_UPDATE_ONCE: Int = 1

    val VIEWPORT_UPDATE_WHEN_VISIBLE: Int = 2

    val VIEWPORT_USAGE_2D: Int = 0

    val VIEWPORT_USAGE_2D_NO_SAMPLING: Int = 1

    val VIEWPORT_USAGE_3D: Int = 2

    val VIEWPORT_USAGE_3D_NO_EFFECTS: Int = 3

    /**
     * Container for method_bind pointers for VisualServer
     */
    private object __method_bind {
      val blackBarsSetImages: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "blackBarsSetImages".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blackBarsSetImages" }
        }
      val blackBarsSetMargins: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "blackBarsSetMargins".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blackBarsSetMargins" }
        }
      val cameraCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "cameraCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cameraCreate" }
        }
      val cameraSetCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "cameraSetCullMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cameraSetCullMask" }
        }
      val cameraSetEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "cameraSetEnvironment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cameraSetEnvironment" }
        }
      val cameraSetFrustum: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "cameraSetFrustum".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cameraSetFrustum" }
        }
      val cameraSetOrthogonal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "cameraSetOrthogonal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cameraSetOrthogonal" }
        }
      val cameraSetPerspective: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "cameraSetPerspective".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cameraSetPerspective" }
        }
      val cameraSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "cameraSetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cameraSetTransform" }
        }
      val cameraSetUseVerticalAspect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "cameraSetUseVerticalAspect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cameraSetUseVerticalAspect" }
        }
      val canvasCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasCreate" }
        }
      val canvasItemAddCircle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemAddCircle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemAddCircle" }
        }
      val canvasItemAddClipIgnore: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemAddClipIgnore".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemAddClipIgnore" }
        }
      val canvasItemAddLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemAddLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemAddLine" }
        }
      val canvasItemAddMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemAddMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemAddMesh" }
        }
      val canvasItemAddMultimesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemAddMultimesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemAddMultimesh" }
        }
      val canvasItemAddNinePatch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemAddNinePatch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemAddNinePatch" }
        }
      val canvasItemAddParticles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemAddParticles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemAddParticles" }
        }
      val canvasItemAddPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemAddPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemAddPolygon" }
        }
      val canvasItemAddPolyline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemAddPolyline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemAddPolyline" }
        }
      val canvasItemAddPrimitive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemAddPrimitive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemAddPrimitive" }
        }
      val canvasItemAddRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemAddRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemAddRect" }
        }
      val canvasItemAddSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemAddSetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemAddSetTransform" }
        }
      val canvasItemAddTextureRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemAddTextureRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemAddTextureRect" }
        }
      val canvasItemAddTextureRectRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemAddTextureRectRegion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemAddTextureRectRegion" }
        }
      val canvasItemAddTriangleArray: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemAddTriangleArray".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemAddTriangleArray" }
        }
      val canvasItemClear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemClear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemClear" }
        }
      val canvasItemCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemCreate" }
        }
      val canvasItemSetClip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetClip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetClip" }
        }
      val canvasItemSetCopyToBackbuffer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetCopyToBackbuffer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetCopyToBackbuffer" }
        }
      val canvasItemSetCustomRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetCustomRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetCustomRect" }
        }
      val canvasItemSetDistanceFieldMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetDistanceFieldMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetDistanceFieldMode" }
        }
      val canvasItemSetDrawBehindParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetDrawBehindParent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetDrawBehindParent" }
        }
      val canvasItemSetDrawIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetDrawIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetDrawIndex" }
        }
      val canvasItemSetLightMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetLightMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetLightMask" }
        }
      val canvasItemSetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetMaterial" }
        }
      val canvasItemSetModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetModulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetModulate" }
        }
      val canvasItemSetParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetParent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetParent" }
        }
      val canvasItemSetSelfModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetSelfModulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetSelfModulate" }
        }
      val canvasItemSetSortChildrenByY: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetSortChildrenByY".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetSortChildrenByY" }
        }
      val canvasItemSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetTransform" }
        }
      val canvasItemSetUseParentMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetUseParentMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetUseParentMaterial" }
        }
      val canvasItemSetVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetVisible" }
        }
      val canvasItemSetZAsRelativeToParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetZAsRelativeToParent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetZAsRelativeToParent" }
        }
      val canvasItemSetZIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasItemSetZIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasItemSetZIndex" }
        }
      val canvasLightAttachToCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightAttachToCanvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightAttachToCanvas" }
        }
      val canvasLightCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightCreate" }
        }
      val canvasLightOccluderAttachToCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightOccluderAttachToCanvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightOccluderAttachToCanvas"
            }
        }
      val canvasLightOccluderCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightOccluderCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightOccluderCreate" }
        }
      val canvasLightOccluderSetEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightOccluderSetEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightOccluderSetEnabled" }
        }
      val canvasLightOccluderSetLightMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightOccluderSetLightMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightOccluderSetLightMask" }
        }
      val canvasLightOccluderSetPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightOccluderSetPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightOccluderSetPolygon" }
        }
      val canvasLightOccluderSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightOccluderSetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightOccluderSetTransform" }
        }
      val canvasLightSetColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetColor" }
        }
      val canvasLightSetEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetEnabled" }
        }
      val canvasLightSetEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetEnergy" }
        }
      val canvasLightSetHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetHeight" }
        }
      val canvasLightSetItemCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetItemCullMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetItemCullMask" }
        }
      val canvasLightSetItemShadowCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetItemShadowCullMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetItemShadowCullMask" }
        }
      val canvasLightSetLayerRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetLayerRange".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetLayerRange" }
        }
      val canvasLightSetMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetMode" }
        }
      val canvasLightSetScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetScale" }
        }
      val canvasLightSetShadowBufferSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetShadowBufferSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetShadowBufferSize" }
        }
      val canvasLightSetShadowColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetShadowColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetShadowColor" }
        }
      val canvasLightSetShadowEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetShadowEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetShadowEnabled" }
        }
      val canvasLightSetShadowFilter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetShadowFilter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetShadowFilter" }
        }
      val canvasLightSetShadowGradientLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetShadowGradientLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetShadowGradientLength"
            }
        }
      val canvasLightSetShadowSmooth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetShadowSmooth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetShadowSmooth" }
        }
      val canvasLightSetTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetTexture" }
        }
      val canvasLightSetTextureOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetTextureOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetTextureOffset" }
        }
      val canvasLightSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetTransform" }
        }
      val canvasLightSetZRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasLightSetZRange".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasLightSetZRange" }
        }
      val canvasOccluderPolygonCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasOccluderPolygonCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasOccluderPolygonCreate" }
        }
      val canvasOccluderPolygonSetCullMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasOccluderPolygonSetCullMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasOccluderPolygonSetCullMode" }
        }
      val canvasOccluderPolygonSetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasOccluderPolygonSetShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasOccluderPolygonSetShape" }
        }
      val canvasOccluderPolygonSetShapeAsLines: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasOccluderPolygonSetShapeAsLines".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method canvasOccluderPolygonSetShapeAsLines" }
        }
      val canvasSetItemMirroring: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasSetItemMirroring".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasSetItemMirroring" }
        }
      val canvasSetModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "canvasSetModulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canvasSetModulate" }
        }
      val directionalLightCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "directionalLightCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method directionalLightCreate" }
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
            "environmentCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentCreate" }
        }
      val environmentSetAdjustment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetAdjustment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetAdjustment" }
        }
      val environmentSetAmbientLight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetAmbientLight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetAmbientLight" }
        }
      val environmentSetBackground: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetBackground".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetBackground" }
        }
      val environmentSetBgColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetBgColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetBgColor" }
        }
      val environmentSetBgEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetBgEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetBgEnergy" }
        }
      val environmentSetCanvasMaxLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetCanvasMaxLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetCanvasMaxLayer" }
        }
      val environmentSetDofBlurFar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetDofBlurFar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetDofBlurFar" }
        }
      val environmentSetDofBlurNear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetDofBlurNear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetDofBlurNear" }
        }
      val environmentSetFog: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetFog".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetFog" }
        }
      val environmentSetFogDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetFogDepth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetFogDepth" }
        }
      val environmentSetFogHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetFogHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetFogHeight" }
        }
      val environmentSetGlow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetGlow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetGlow" }
        }
      val environmentSetSky: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetSky".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetSky" }
        }
      val environmentSetSkyCustomFov: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetSkyCustomFov".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetSkyCustomFov" }
        }
      val environmentSetSkyOrientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetSkyOrientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetSkyOrientation" }
        }
      val environmentSetSsao: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetSsao".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetSsao" }
        }
      val environmentSetSsr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetSsr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetSsr" }
        }
      val environmentSetTonemap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "environmentSetTonemap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method environmentSetTonemap" }
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
            "forceDraw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method forceDraw" }
        }
      val forceSync: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "forceSync".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method forceSync" }
        }
      val freeRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "freeRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method freeRid" }
        }
      val getRenderInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "getRenderInfo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRenderInfo" }
        }
      val getTestCube: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "getTestCube".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTestCube" }
        }
      val getTestTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "getTestTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTestTexture" }
        }
      val getWhiteTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "getWhiteTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWhiteTexture" }
        }
      val giProbeCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeCreate" }
        }
      val giProbeGetBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeGetBias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeGetBias" }
        }
      val giProbeGetBounds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeGetBounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeGetBounds" }
        }
      val giProbeGetCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeGetCellSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeGetCellSize" }
        }
      val giProbeGetDynamicData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeGetDynamicData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeGetDynamicData" }
        }
      val giProbeGetDynamicRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeGetDynamicRange".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeGetDynamicRange" }
        }
      val giProbeGetEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeGetEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeGetEnergy" }
        }
      val giProbeGetNormalBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeGetNormalBias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeGetNormalBias" }
        }
      val giProbeGetPropagation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeGetPropagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeGetPropagation" }
        }
      val giProbeGetToCellXform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeGetToCellXform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeGetToCellXform" }
        }
      val giProbeIsCompressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeIsCompressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeIsCompressed" }
        }
      val giProbeIsInterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeIsInterior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeIsInterior" }
        }
      val giProbeSetBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeSetBias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeSetBias" }
        }
      val giProbeSetBounds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeSetBounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeSetBounds" }
        }
      val giProbeSetCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeSetCellSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeSetCellSize" }
        }
      val giProbeSetCompress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeSetCompress".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeSetCompress" }
        }
      val giProbeSetDynamicData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeSetDynamicData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeSetDynamicData" }
        }
      val giProbeSetDynamicRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeSetDynamicRange".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeSetDynamicRange" }
        }
      val giProbeSetEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeSetEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeSetEnergy" }
        }
      val giProbeSetInterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeSetInterior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeSetInterior" }
        }
      val giProbeSetNormalBias: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeSetNormalBias".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeSetNormalBias" }
        }
      val giProbeSetPropagation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeSetPropagation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeSetPropagation" }
        }
      val giProbeSetToCellXform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "giProbeSetToCellXform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method giProbeSetToCellXform" }
        }
      val hasChanged: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "hasChanged".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasChanged" }
        }
      val hasFeature: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "hasFeature".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasFeature" }
        }
      val hasOsFeature: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "hasOsFeature".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasOsFeature" }
        }
      val immediateBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediateBegin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediateBegin" }
        }
      val immediateClear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediateClear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediateClear" }
        }
      val immediateColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediateColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediateColor" }
        }
      val immediateCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediateCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediateCreate" }
        }
      val immediateEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediateEnd".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediateEnd" }
        }
      val immediateGetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediateGetMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediateGetMaterial" }
        }
      val immediateNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediateNormal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediateNormal" }
        }
      val immediateSetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediateSetMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediateSetMaterial" }
        }
      val immediateTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediateTangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediateTangent" }
        }
      val immediateUv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediateUv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediateUv" }
        }
      val immediateUv2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediateUv2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediateUv2" }
        }
      val immediateVertex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediateVertex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediateVertex" }
        }
      val immediateVertex2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "immediateVertex2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method immediateVertex2d" }
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
            "instanceAttachObjectInstanceId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceAttachObjectInstanceId" }
        }
      val instanceAttachSkeleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceAttachSkeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceAttachSkeleton" }
        }
      val instanceCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceCreate" }
        }
      val instanceCreate2: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceCreate2".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceCreate2" }
        }
      val instanceGeometrySetAsInstanceLod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceGeometrySetAsInstanceLod".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceGeometrySetAsInstanceLod" }
        }
      val instanceGeometrySetCastShadowsSetting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceGeometrySetCastShadowsSetting".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method instanceGeometrySetCastShadowsSetting" }
        }
      val instanceGeometrySetDrawRange: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceGeometrySetDrawRange".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceGeometrySetDrawRange" }
        }
      val instanceGeometrySetFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceGeometrySetFlag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceGeometrySetFlag" }
        }
      val instanceGeometrySetMaterialOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceGeometrySetMaterialOverride".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method instanceGeometrySetMaterialOverride" }
        }
      val instanceSetBase: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceSetBase".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceSetBase" }
        }
      val instanceSetBlendShapeWeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceSetBlendShapeWeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceSetBlendShapeWeight" }
        }
      val instanceSetCustomAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceSetCustomAabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceSetCustomAabb" }
        }
      val instanceSetExterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceSetExterior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceSetExterior" }
        }
      val instanceSetExtraVisibilityMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceSetExtraVisibilityMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceSetExtraVisibilityMargin" }
        }
      val instanceSetLayerMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceSetLayerMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceSetLayerMask" }
        }
      val instanceSetScenario: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceSetScenario".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceSetScenario" }
        }
      val instanceSetSurfaceMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceSetSurfaceMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceSetSurfaceMaterial" }
        }
      val instanceSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceSetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceSetTransform" }
        }
      val instanceSetUseLightmap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceSetUseLightmap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceSetUseLightmap" }
        }
      val instanceSetVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instanceSetVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instanceSetVisible" }
        }
      val instancesCullAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instancesCullAabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instancesCullAabb" }
        }
      val instancesCullConvex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instancesCullConvex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instancesCullConvex" }
        }
      val instancesCullRay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "instancesCullRay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instancesCullRay" }
        }
      val lightDirectionalSetBlendSplits: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightDirectionalSetBlendSplits".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightDirectionalSetBlendSplits" }
        }
      val lightDirectionalSetShadowDepthRangeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightDirectionalSetShadowDepthRangeMode".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method lightDirectionalSetShadowDepthRangeMode" }
        }
      val lightDirectionalSetShadowMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightDirectionalSetShadowMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightDirectionalSetShadowMode" }
        }
      val lightOmniSetShadowDetail: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightOmniSetShadowDetail".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightOmniSetShadowDetail" }
        }
      val lightOmniSetShadowMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightOmniSetShadowMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightOmniSetShadowMode" }
        }
      val lightSetColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightSetColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightSetColor" }
        }
      val lightSetCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightSetCullMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightSetCullMask" }
        }
      val lightSetNegative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightSetNegative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightSetNegative" }
        }
      val lightSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightSetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightSetParam" }
        }
      val lightSetProjector: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightSetProjector".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightSetProjector" }
        }
      val lightSetReverseCullFaceMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightSetReverseCullFaceMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightSetReverseCullFaceMode" }
        }
      val lightSetShadow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightSetShadow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightSetShadow" }
        }
      val lightSetShadowColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightSetShadowColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightSetShadowColor" }
        }
      val lightSetUseGi: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightSetUseGi".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightSetUseGi" }
        }
      val lightmapCaptureCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmapCaptureCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmapCaptureCreate" }
        }
      val lightmapCaptureGetBounds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmapCaptureGetBounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmapCaptureGetBounds" }
        }
      val lightmapCaptureGetEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmapCaptureGetEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmapCaptureGetEnergy" }
        }
      val lightmapCaptureGetOctree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmapCaptureGetOctree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmapCaptureGetOctree" }
        }
      val lightmapCaptureGetOctreeCellSubdiv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmapCaptureGetOctreeCellSubdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmapCaptureGetOctreeCellSubdiv"
            }
        }
      val lightmapCaptureGetOctreeCellTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmapCaptureGetOctreeCellTransform".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method lightmapCaptureGetOctreeCellTransform" }
        }
      val lightmapCaptureSetBounds: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmapCaptureSetBounds".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmapCaptureSetBounds" }
        }
      val lightmapCaptureSetEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmapCaptureSetEnergy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmapCaptureSetEnergy" }
        }
      val lightmapCaptureSetOctree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmapCaptureSetOctree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmapCaptureSetOctree" }
        }
      val lightmapCaptureSetOctreeCellSubdiv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmapCaptureSetOctreeCellSubdiv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method lightmapCaptureSetOctreeCellSubdiv"
            }
        }
      val lightmapCaptureSetOctreeCellTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "lightmapCaptureSetOctreeCellTransform".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method lightmapCaptureSetOctreeCellTransform" }
        }
      val makeSphereMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "makeSphereMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method makeSphereMesh" }
        }
      val materialCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "materialCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method materialCreate" }
        }
      val materialGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "materialGetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method materialGetParam" }
        }
      val materialGetParamDefault: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "materialGetParamDefault".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method materialGetParamDefault" }
        }
      val materialGetShader: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "materialGetShader".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method materialGetShader" }
        }
      val materialSetLineWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "materialSetLineWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method materialSetLineWidth" }
        }
      val materialSetNextPass: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "materialSetNextPass".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method materialSetNextPass" }
        }
      val materialSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "materialSetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method materialSetParam" }
        }
      val materialSetRenderPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "materialSetRenderPriority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method materialSetRenderPriority" }
        }
      val materialSetShader: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "materialSetShader".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method materialSetShader" }
        }
      val meshAddSurfaceFromArrays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshAddSurfaceFromArrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshAddSurfaceFromArrays" }
        }
      val meshClear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshClear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshClear" }
        }
      val meshCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshCreate" }
        }
      val meshGetBlendShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshGetBlendShapeCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshGetBlendShapeCount" }
        }
      val meshGetBlendShapeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshGetBlendShapeMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshGetBlendShapeMode" }
        }
      val meshGetCustomAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshGetCustomAabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshGetCustomAabb" }
        }
      val meshGetSurfaceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshGetSurfaceCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshGetSurfaceCount" }
        }
      val meshRemoveSurface: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshRemoveSurface".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshRemoveSurface" }
        }
      val meshSetBlendShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSetBlendShapeCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSetBlendShapeCount" }
        }
      val meshSetBlendShapeMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSetBlendShapeMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSetBlendShapeMode" }
        }
      val meshSetCustomAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSetCustomAabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSetCustomAabb" }
        }
      val meshSurfaceGetAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSurfaceGetAabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSurfaceGetAabb" }
        }
      val meshSurfaceGetArray: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSurfaceGetArray".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSurfaceGetArray" }
        }
      val meshSurfaceGetArrayIndexLen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSurfaceGetArrayIndexLen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSurfaceGetArrayIndexLen" }
        }
      val meshSurfaceGetArrayLen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSurfaceGetArrayLen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSurfaceGetArrayLen" }
        }
      val meshSurfaceGetArrays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSurfaceGetArrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSurfaceGetArrays" }
        }
      val meshSurfaceGetBlendShapeArrays: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSurfaceGetBlendShapeArrays".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSurfaceGetBlendShapeArrays" }
        }
      val meshSurfaceGetFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSurfaceGetFormat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSurfaceGetFormat" }
        }
      val meshSurfaceGetFormatOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSurfaceGetFormatOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSurfaceGetFormatOffset" }
        }
      val meshSurfaceGetFormatStride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSurfaceGetFormatStride".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSurfaceGetFormatStride" }
        }
      val meshSurfaceGetIndexArray: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSurfaceGetIndexArray".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSurfaceGetIndexArray" }
        }
      val meshSurfaceGetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSurfaceGetMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSurfaceGetMaterial" }
        }
      val meshSurfaceGetPrimitiveType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSurfaceGetPrimitiveType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSurfaceGetPrimitiveType" }
        }
      val meshSurfaceGetSkeletonAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSurfaceGetSkeletonAabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSurfaceGetSkeletonAabb" }
        }
      val meshSurfaceSetMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSurfaceSetMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSurfaceSetMaterial" }
        }
      val meshSurfaceUpdateRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "meshSurfaceUpdateRegion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method meshSurfaceUpdateRegion" }
        }
      val multimeshAllocate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshAllocate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshAllocate" }
        }
      val multimeshGetAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshGetAabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshGetAabb" }
        }
      val multimeshGetInstanceCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshGetInstanceCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshGetInstanceCount" }
        }
      val multimeshGetMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshGetMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshGetMesh" }
        }
      val multimeshGetVisibleInstances: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshGetVisibleInstances".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshGetVisibleInstances" }
        }
      val multimeshInstanceGetColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshInstanceGetColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshInstanceGetColor" }
        }
      val multimeshInstanceGetCustomData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshInstanceGetCustomData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshInstanceGetCustomData" }
        }
      val multimeshInstanceGetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshInstanceGetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshInstanceGetTransform" }
        }
      val multimeshInstanceGetTransform2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshInstanceGetTransform2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshInstanceGetTransform2d" }
        }
      val multimeshInstanceSetColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshInstanceSetColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshInstanceSetColor" }
        }
      val multimeshInstanceSetCustomData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshInstanceSetCustomData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshInstanceSetCustomData" }
        }
      val multimeshInstanceSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshInstanceSetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshInstanceSetTransform" }
        }
      val multimeshInstanceSetTransform2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshInstanceSetTransform2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshInstanceSetTransform2d" }
        }
      val multimeshSetAsBulkArray: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshSetAsBulkArray".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshSetAsBulkArray" }
        }
      val multimeshSetMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshSetMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshSetMesh" }
        }
      val multimeshSetVisibleInstances: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "multimeshSetVisibleInstances".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method multimeshSetVisibleInstances" }
        }
      val omniLightCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "omniLightCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method omniLightCreate" }
        }
      val particlesCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesCreate" }
        }
      val particlesGetCurrentAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesGetCurrentAabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesGetCurrentAabb" }
        }
      val particlesGetEmitting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesGetEmitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesGetEmitting" }
        }
      val particlesRestart: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesRestart".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesRestart" }
        }
      val particlesSetAmount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetAmount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetAmount" }
        }
      val particlesSetCustomAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetCustomAabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetCustomAabb" }
        }
      val particlesSetDrawOrder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetDrawOrder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetDrawOrder" }
        }
      val particlesSetDrawPassMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetDrawPassMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetDrawPassMesh" }
        }
      val particlesSetDrawPasses: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetDrawPasses".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetDrawPasses" }
        }
      val particlesSetEmissionTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetEmissionTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetEmissionTransform" }
        }
      val particlesSetEmitting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetEmitting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetEmitting" }
        }
      val particlesSetExplosivenessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetExplosivenessRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetExplosivenessRatio" }
        }
      val particlesSetFixedFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetFixedFps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetFixedFps" }
        }
      val particlesSetFractionalDelta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetFractionalDelta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetFractionalDelta" }
        }
      val particlesSetLifetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetLifetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetLifetime" }
        }
      val particlesSetOneShot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetOneShot".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetOneShot" }
        }
      val particlesSetPreProcessTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetPreProcessTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetPreProcessTime" }
        }
      val particlesSetProcessMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetProcessMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetProcessMaterial" }
        }
      val particlesSetRandomnessRatio: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetRandomnessRatio".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetRandomnessRatio" }
        }
      val particlesSetSpeedScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetSpeedScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetSpeedScale" }
        }
      val particlesSetUseLocalCoordinates: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "particlesSetUseLocalCoordinates".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method particlesSetUseLocalCoordinates" }
        }
      val reflectionProbeCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflectionProbeCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflectionProbeCreate" }
        }
      val reflectionProbeSetAsInterior: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflectionProbeSetAsInterior".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflectionProbeSetAsInterior" }
        }
      val reflectionProbeSetCullMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflectionProbeSetCullMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflectionProbeSetCullMask" }
        }
      val reflectionProbeSetEnableBoxProjection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflectionProbeSetEnableBoxProjection".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method reflectionProbeSetEnableBoxProjection" }
        }
      val reflectionProbeSetEnableShadows: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflectionProbeSetEnableShadows".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflectionProbeSetEnableShadows" }
        }
      val reflectionProbeSetExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflectionProbeSetExtents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflectionProbeSetExtents" }
        }
      val reflectionProbeSetIntensity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflectionProbeSetIntensity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflectionProbeSetIntensity" }
        }
      val reflectionProbeSetInteriorAmbient: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflectionProbeSetInteriorAmbient".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflectionProbeSetInteriorAmbient"
            }
        }
      val reflectionProbeSetInteriorAmbientEnergy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflectionProbeSetInteriorAmbientEnergy".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method reflectionProbeSetInteriorAmbientEnergy" }
        }
      val reflectionProbeSetInteriorAmbientProbeContribution: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflectionProbeSetInteriorAmbientProbeContribution".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method reflectionProbeSetInteriorAmbientProbeContribution" }
        }
      val reflectionProbeSetMaxDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflectionProbeSetMaxDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflectionProbeSetMaxDistance" }
        }
      val reflectionProbeSetOriginOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflectionProbeSetOriginOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflectionProbeSetOriginOffset" }
        }
      val reflectionProbeSetUpdateMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "reflectionProbeSetUpdateMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reflectionProbeSetUpdateMode" }
        }
      val requestFrameDrawnCallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "requestFrameDrawnCallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method requestFrameDrawnCallback" }
        }
      val scenarioCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "scenarioCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scenarioCreate" }
        }
      val scenarioSetDebug: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "scenarioSetDebug".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scenarioSetDebug" }
        }
      val scenarioSetEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "scenarioSetEnvironment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scenarioSetEnvironment" }
        }
      val scenarioSetFallbackEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "scenarioSetFallbackEnvironment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scenarioSetFallbackEnvironment" }
        }
      val scenarioSetReflectionAtlasSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "scenarioSetReflectionAtlasSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method scenarioSetReflectionAtlasSize" }
        }
      val setBootImage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "setBootImage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBootImage" }
        }
      val setDebugGenerateWireframes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "setDebugGenerateWireframes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDebugGenerateWireframes" }
        }
      val setDefaultClearColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "setDefaultClearColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDefaultClearColor" }
        }
      val shaderCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "shaderCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shaderCreate" }
        }
      val shaderGetCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "shaderGetCode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shaderGetCode" }
        }
      val shaderGetDefaultTextureParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "shaderGetDefaultTextureParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shaderGetDefaultTextureParam" }
        }
      val shaderGetParamList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "shaderGetParamList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shaderGetParamList" }
        }
      val shaderSetCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "shaderSetCode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shaderSetCode" }
        }
      val shaderSetDefaultTextureParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "shaderSetDefaultTextureParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shaderSetDefaultTextureParam" }
        }
      val skeletonAllocate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skeletonAllocate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skeletonAllocate" }
        }
      val skeletonBoneGetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skeletonBoneGetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skeletonBoneGetTransform" }
        }
      val skeletonBoneGetTransform2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skeletonBoneGetTransform2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skeletonBoneGetTransform2d" }
        }
      val skeletonBoneSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skeletonBoneSetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skeletonBoneSetTransform" }
        }
      val skeletonBoneSetTransform2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skeletonBoneSetTransform2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skeletonBoneSetTransform2d" }
        }
      val skeletonCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skeletonCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skeletonCreate" }
        }
      val skeletonGetBoneCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skeletonGetBoneCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skeletonGetBoneCount" }
        }
      val skyCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skyCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skyCreate" }
        }
      val skySetTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "skySetTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method skySetTexture" }
        }
      val spotLightCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "spotLightCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method spotLightCreate" }
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
            "textureAllocate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureAllocate" }
        }
      val textureBind: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureBind".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureBind" }
        }
      val textureCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureCreate" }
        }
      val textureCreateFromImage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureCreateFromImage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureCreateFromImage" }
        }
      val textureDebugUsage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureDebugUsage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureDebugUsage" }
        }
      val textureGetData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureGetData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureGetData" }
        }
      val textureGetDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureGetDepth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureGetDepth" }
        }
      val textureGetFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureGetFlags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureGetFlags" }
        }
      val textureGetFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureGetFormat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureGetFormat" }
        }
      val textureGetHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureGetHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureGetHeight" }
        }
      val textureGetPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureGetPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureGetPath" }
        }
      val textureGetTexid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureGetTexid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureGetTexid" }
        }
      val textureGetType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureGetType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureGetType" }
        }
      val textureGetWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureGetWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureGetWidth" }
        }
      val textureSetData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureSetData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureSetData" }
        }
      val textureSetDataPartial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureSetDataPartial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureSetDataPartial" }
        }
      val textureSetFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureSetFlags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureSetFlags" }
        }
      val textureSetPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureSetPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureSetPath" }
        }
      val textureSetShrinkAllX2OnSetData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureSetShrinkAllX2OnSetData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureSetShrinkAllX2OnSetData" }
        }
      val textureSetSizeOverride: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "textureSetSizeOverride".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method textureSetSizeOverride" }
        }
      val texturesKeepOriginal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "texturesKeepOriginal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method texturesKeepOriginal" }
        }
      val viewportAttachCamera: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportAttachCamera".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportAttachCamera" }
        }
      val viewportAttachCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportAttachCanvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportAttachCanvas" }
        }
      val viewportAttachToScreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportAttachToScreen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportAttachToScreen" }
        }
      val viewportCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportCreate" }
        }
      val viewportDetach: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportDetach".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportDetach" }
        }
      val viewportGetRenderInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportGetRenderInfo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportGetRenderInfo" }
        }
      val viewportGetTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportGetTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportGetTexture" }
        }
      val viewportRemoveCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportRemoveCanvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportRemoveCanvas" }
        }
      val viewportSetActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetActive" }
        }
      val viewportSetCanvasStacking: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetCanvasStacking".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetCanvasStacking" }
        }
      val viewportSetCanvasTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetCanvasTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetCanvasTransform" }
        }
      val viewportSetClearMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetClearMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetClearMode" }
        }
      val viewportSetDebugDraw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetDebugDraw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetDebugDraw" }
        }
      val viewportSetDisable3d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetDisable3d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetDisable3d" }
        }
      val viewportSetDisableEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetDisableEnvironment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetDisableEnvironment" }
        }
      val viewportSetGlobalCanvasTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetGlobalCanvasTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetGlobalCanvasTransform" }
        }
      val viewportSetHdr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetHdr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetHdr" }
        }
      val viewportSetHideCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetHideCanvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetHideCanvas" }
        }
      val viewportSetHideScenario: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetHideScenario".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetHideScenario" }
        }
      val viewportSetMsaa: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetMsaa".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetMsaa" }
        }
      val viewportSetParentViewport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetParentViewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetParentViewport" }
        }
      val viewportSetRenderDirectToScreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetRenderDirectToScreen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetRenderDirectToScreen" }
        }
      val viewportSetScenario: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetScenario".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetScenario" }
        }
      val viewportSetShadowAtlasQuadrantSubdivision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetShadowAtlasQuadrantSubdivision".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method viewportSetShadowAtlasQuadrantSubdivision" }
        }
      val viewportSetShadowAtlasSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetShadowAtlasSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetShadowAtlasSize" }
        }
      val viewportSetSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetSize" }
        }
      val viewportSetTransparentBackground: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetTransparentBackground".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetTransparentBackground" }
        }
      val viewportSetUpdateMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetUpdateMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetUpdateMode" }
        }
      val viewportSetUsage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetUsage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetUsage" }
        }
      val viewportSetUseArvr: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetUseArvr".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetUseArvr" }
        }
      val viewportSetVflip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualServer".cstr.ptr,
            "viewportSetVflip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method viewportSetVflip" }
        }}
  }
}
