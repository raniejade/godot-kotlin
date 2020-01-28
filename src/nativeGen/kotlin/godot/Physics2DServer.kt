// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
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

open class Physics2DServer(
  _handle: COpaquePointer
) : Object(_handle) {
  fun areaAddShape(
    area: RID,
    shape: RID,
    transform: Transform2D,
    disabled: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(shape)
    _args.append(transform)
    _args.append(disabled)
    __method_bind.areaAddShape.call(this._handle, _args.toVariant(), 4)
  }

  fun areaAttachCanvasInstanceId(area: RID, id: Int) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(id)
    __method_bind.areaAttachCanvasInstanceId.call(this._handle, _args.toVariant(), 2)
  }

  fun areaAttachObjectInstanceId(area: RID, id: Int) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(id)
    __method_bind.areaAttachObjectInstanceId.call(this._handle, _args.toVariant(), 2)
  }

  fun areaClearShapes(area: RID) {
    val _arg = Variant.new(area)
    __method_bind.areaClearShapes.call(this._handle, _arg, 1)
  }

  fun areaCreate(): RID {
    val _ret = __method_bind.areaCreate.call(this._handle)
    return _ret.asRID()
  }

  fun areaGetCanvasInstanceId(area: RID): Int {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaGetCanvasInstanceId.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun areaGetObjectInstanceId(area: RID): Int {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaGetObjectInstanceId.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun areaGetParam(area: RID, param: Int): Variant {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(param)
    val _ret = __method_bind.areaGetParam.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun areaGetShape(area: RID, shapeIdx: Int): RID {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(shapeIdx)
    val _ret = __method_bind.areaGetShape.call(this._handle, _args.toVariant(), 2)
    return _ret.asRID()
  }

  fun areaGetShapeCount(area: RID): Int {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaGetShapeCount.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun areaGetShapeTransform(area: RID, shapeIdx: Int): Transform2D {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(shapeIdx)
    val _ret = __method_bind.areaGetShapeTransform.call(this._handle, _args.toVariant(), 2)
    return _ret.asTransform2D()
  }

  fun areaGetSpace(area: RID): RID {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaGetSpace.call(this._handle, _arg, 1)
    return _ret.asRID()
  }

  fun areaGetSpaceOverrideMode(area: RID): AreaSpaceOverrideMode {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaGetSpaceOverrideMode.call(this._handle, _arg, 1)
    return Physics2DServer.AreaSpaceOverrideMode.from(_ret.asInt())
  }

  fun areaGetTransform(area: RID): Transform2D {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaGetTransform.call(this._handle, _arg, 1)
    return _ret.asTransform2D()
  }

  fun areaRemoveShape(area: RID, shapeIdx: Int) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(shapeIdx)
    __method_bind.areaRemoveShape.call(this._handle, _args.toVariant(), 2)
  }

  fun areaSetAreaMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(receiver)
    _args.append(method)
    __method_bind.areaSetAreaMonitorCallback.call(this._handle, _args.toVariant(), 3)
  }

  fun areaSetCollisionLayer(area: RID, layer: Int) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(layer)
    __method_bind.areaSetCollisionLayer.call(this._handle, _args.toVariant(), 2)
  }

  fun areaSetCollisionMask(area: RID, mask: Int) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(mask)
    __method_bind.areaSetCollisionMask.call(this._handle, _args.toVariant(), 2)
  }

  fun areaSetMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(receiver)
    _args.append(method)
    __method_bind.areaSetMonitorCallback.call(this._handle, _args.toVariant(), 3)
  }

  fun areaSetMonitorable(area: RID, monitorable: Boolean) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(monitorable)
    __method_bind.areaSetMonitorable.call(this._handle, _args.toVariant(), 2)
  }

  fun areaSetParam(
    area: RID,
    param: Int,
    value: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(param)
    _args.append(value)
    __method_bind.areaSetParam.call(this._handle, _args.toVariant(), 3)
  }

  fun areaSetShape(
    area: RID,
    shapeIdx: Int,
    shape: RID
  ) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(shapeIdx)
    _args.append(shape)
    __method_bind.areaSetShape.call(this._handle, _args.toVariant(), 3)
  }

  fun areaSetShapeDisabled(
    area: RID,
    shapeIdx: Int,
    disabled: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(shapeIdx)
    _args.append(disabled)
    __method_bind.areaSetShapeDisabled.call(this._handle, _args.toVariant(), 3)
  }

  fun areaSetShapeTransform(
    area: RID,
    shapeIdx: Int,
    transform: Transform2D
  ) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(shapeIdx)
    _args.append(transform)
    __method_bind.areaSetShapeTransform.call(this._handle, _args.toVariant(), 3)
  }

  fun areaSetSpace(area: RID, space: RID) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(space)
    __method_bind.areaSetSpace.call(this._handle, _args.toVariant(), 2)
  }

  fun areaSetSpaceOverrideMode(area: RID, mode: Int) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(mode)
    __method_bind.areaSetSpaceOverrideMode.call(this._handle, _args.toVariant(), 2)
  }

  fun areaSetTransform(area: RID, transform: Transform2D) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(transform)
    __method_bind.areaSetTransform.call(this._handle, _args.toVariant(), 2)
  }

  fun bodyAddCentralForce(body: RID, force: Vector2) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(force)
    __method_bind.bodyAddCentralForce.call(this._handle, _args.toVariant(), 2)
  }

  fun bodyAddCollisionException(body: RID, exceptedBody: RID) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(exceptedBody)
    __method_bind.bodyAddCollisionException.call(this._handle, _args.toVariant(), 2)
  }

  fun bodyAddForce(
    body: RID,
    offset: Vector2,
    force: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(offset)
    _args.append(force)
    __method_bind.bodyAddForce.call(this._handle, _args.toVariant(), 3)
  }

  fun bodyAddShape(
    body: RID,
    shape: RID,
    transform: Transform2D,
    disabled: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(shape)
    _args.append(transform)
    _args.append(disabled)
    __method_bind.bodyAddShape.call(this._handle, _args.toVariant(), 4)
  }

  fun bodyAddTorque(body: RID, torque: Float) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(torque)
    __method_bind.bodyAddTorque.call(this._handle, _args.toVariant(), 2)
  }

  fun bodyApplyCentralImpulse(body: RID, impulse: Vector2) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(impulse)
    __method_bind.bodyApplyCentralImpulse.call(this._handle, _args.toVariant(), 2)
  }

  fun bodyApplyImpulse(
    body: RID,
    position: Vector2,
    impulse: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(position)
    _args.append(impulse)
    __method_bind.bodyApplyImpulse.call(this._handle, _args.toVariant(), 3)
  }

  fun bodyApplyTorqueImpulse(body: RID, impulse: Float) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(impulse)
    __method_bind.bodyApplyTorqueImpulse.call(this._handle, _args.toVariant(), 2)
  }

  fun bodyAttachCanvasInstanceId(body: RID, id: Int) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(id)
    __method_bind.bodyAttachCanvasInstanceId.call(this._handle, _args.toVariant(), 2)
  }

  fun bodyAttachObjectInstanceId(body: RID, id: Int) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(id)
    __method_bind.bodyAttachObjectInstanceId.call(this._handle, _args.toVariant(), 2)
  }

  fun bodyClearShapes(body: RID) {
    val _arg = Variant.new(body)
    __method_bind.bodyClearShapes.call(this._handle, _arg, 1)
  }

  fun bodyCreate(): RID {
    val _ret = __method_bind.bodyCreate.call(this._handle)
    return _ret.asRID()
  }

  fun bodyGetCanvasInstanceId(body: RID): Int {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetCanvasInstanceId.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun bodyGetCollisionLayer(body: RID): Int {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetCollisionLayer.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun bodyGetCollisionMask(body: RID): Int {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetCollisionMask.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun bodyGetContinuousCollisionDetectionMode(body: RID): CCDMode {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetContinuousCollisionDetectionMode.call(this._handle, _arg, 1)
    return Physics2DServer.CCDMode.from(_ret.asInt())
  }

  fun bodyGetDirectState(body: RID): Physics2DDirectBodyState {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetDirectState.call(this._handle, _arg, 1)
    return _ret.asObject(::Physics2DDirectBodyState)!!
  }

  fun bodyGetMaxContactsReported(body: RID): Int {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetMaxContactsReported.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun bodyGetMode(body: RID): BodyMode {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetMode.call(this._handle, _arg, 1)
    return Physics2DServer.BodyMode.from(_ret.asInt())
  }

  fun bodyGetObjectInstanceId(body: RID): Int {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetObjectInstanceId.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun bodyGetParam(body: RID, param: Int): Float {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(param)
    val _ret = __method_bind.bodyGetParam.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun bodyGetShape(body: RID, shapeIdx: Int): RID {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(shapeIdx)
    val _ret = __method_bind.bodyGetShape.call(this._handle, _args.toVariant(), 2)
    return _ret.asRID()
  }

  fun bodyGetShapeCount(body: RID): Int {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetShapeCount.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun bodyGetShapeMetadata(body: RID, shapeIdx: Int): Variant {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(shapeIdx)
    val _ret = __method_bind.bodyGetShapeMetadata.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun bodyGetShapeTransform(body: RID, shapeIdx: Int): Transform2D {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(shapeIdx)
    val _ret = __method_bind.bodyGetShapeTransform.call(this._handle, _args.toVariant(), 2)
    return _ret.asTransform2D()
  }

  fun bodyGetSpace(body: RID): RID {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetSpace.call(this._handle, _arg, 1)
    return _ret.asRID()
  }

  fun bodyGetState(body: RID, state: Int): Variant {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(state)
    val _ret = __method_bind.bodyGetState.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun bodyIsOmittingForceIntegration(body: RID): Boolean {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyIsOmittingForceIntegration.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun bodyRemoveCollisionException(body: RID, exceptedBody: RID) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(exceptedBody)
    __method_bind.bodyRemoveCollisionException.call(this._handle, _args.toVariant(), 2)
  }

  fun bodyRemoveShape(body: RID, shapeIdx: Int) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(shapeIdx)
    __method_bind.bodyRemoveShape.call(this._handle, _args.toVariant(), 2)
  }

  fun bodySetAxisVelocity(body: RID, axisVelocity: Vector2) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(axisVelocity)
    __method_bind.bodySetAxisVelocity.call(this._handle, _args.toVariant(), 2)
  }

  fun bodySetCollisionLayer(body: RID, layer: Int) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(layer)
    __method_bind.bodySetCollisionLayer.call(this._handle, _args.toVariant(), 2)
  }

  fun bodySetCollisionMask(body: RID, mask: Int) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(mask)
    __method_bind.bodySetCollisionMask.call(this._handle, _args.toVariant(), 2)
  }

  fun bodySetContinuousCollisionDetectionMode(body: RID, mode: Int) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(mode)
    __method_bind.bodySetContinuousCollisionDetectionMode.call(this._handle, _args.toVariant(), 2)
  }

  fun bodySetForceIntegrationCallback(
    body: RID,
    receiver: Object,
    method: String,
    userdata: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(receiver)
    _args.append(method)
    _args.append(userdata)
    __method_bind.bodySetForceIntegrationCallback.call(this._handle, _args.toVariant(), 4)
  }

  fun bodySetMaxContactsReported(body: RID, amount: Int) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(amount)
    __method_bind.bodySetMaxContactsReported.call(this._handle, _args.toVariant(), 2)
  }

  fun bodySetMode(body: RID, mode: Int) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(mode)
    __method_bind.bodySetMode.call(this._handle, _args.toVariant(), 2)
  }

  fun bodySetOmitForceIntegration(body: RID, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(enable)
    __method_bind.bodySetOmitForceIntegration.call(this._handle, _args.toVariant(), 2)
  }

  fun bodySetParam(
    body: RID,
    param: Int,
    value: Float
  ) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(param)
    _args.append(value)
    __method_bind.bodySetParam.call(this._handle, _args.toVariant(), 3)
  }

  fun bodySetShape(
    body: RID,
    shapeIdx: Int,
    shape: RID
  ) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(shapeIdx)
    _args.append(shape)
    __method_bind.bodySetShape.call(this._handle, _args.toVariant(), 3)
  }

  fun bodySetShapeAsOneWayCollision(
    body: RID,
    shapeIdx: Int,
    enable: Boolean,
    margin: Float
  ) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(shapeIdx)
    _args.append(enable)
    _args.append(margin)
    __method_bind.bodySetShapeAsOneWayCollision.call(this._handle, _args.toVariant(), 4)
  }

  fun bodySetShapeDisabled(
    body: RID,
    shapeIdx: Int,
    disabled: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(shapeIdx)
    _args.append(disabled)
    __method_bind.bodySetShapeDisabled.call(this._handle, _args.toVariant(), 3)
  }

  fun bodySetShapeMetadata(
    body: RID,
    shapeIdx: Int,
    metadata: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(shapeIdx)
    _args.append(metadata)
    __method_bind.bodySetShapeMetadata.call(this._handle, _args.toVariant(), 3)
  }

  fun bodySetShapeTransform(
    body: RID,
    shapeIdx: Int,
    transform: Transform2D
  ) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(shapeIdx)
    _args.append(transform)
    __method_bind.bodySetShapeTransform.call(this._handle, _args.toVariant(), 3)
  }

  fun bodySetSpace(body: RID, space: RID) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(space)
    __method_bind.bodySetSpace.call(this._handle, _args.toVariant(), 2)
  }

  fun bodySetState(
    body: RID,
    state: Int,
    value: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(state)
    _args.append(value)
    __method_bind.bodySetState.call(this._handle, _args.toVariant(), 3)
  }

  fun bodyTestMotion(
    body: RID,
    from: Transform2D,
    motion: Vector2,
    infiniteInertia: Boolean,
    margin: Float,
    result: Physics2DTestMotionResult
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(from)
    _args.append(motion)
    _args.append(infiniteInertia)
    _args.append(margin)
    _args.append(result)
    val _ret = __method_bind.bodyTestMotion.call(this._handle, _args.toVariant(), 6)
    return _ret.asBoolean()
  }

  fun capsuleShapeCreate(): RID {
    val _ret = __method_bind.capsuleShapeCreate.call(this._handle)
    return _ret.asRID()
  }

  fun circleShapeCreate(): RID {
    val _ret = __method_bind.circleShapeCreate.call(this._handle)
    return _ret.asRID()
  }

  fun concavePolygonShapeCreate(): RID {
    val _ret = __method_bind.concavePolygonShapeCreate.call(this._handle)
    return _ret.asRID()
  }

  fun convexPolygonShapeCreate(): RID {
    val _ret = __method_bind.convexPolygonShapeCreate.call(this._handle)
    return _ret.asRID()
  }

  fun dampedSpringJointCreate(
    anchorA: Vector2,
    anchorB: Vector2,
    bodyA: RID,
    bodyB: RID
  ): RID {
    val _args = VariantArray.new()
    _args.append(anchorA)
    _args.append(anchorB)
    _args.append(bodyA)
    _args.append(bodyB)
    val _ret = __method_bind.dampedSpringJointCreate.call(this._handle, _args.toVariant(), 4)
    return _ret.asRID()
  }

  fun dampedStringJointGetParam(joint: RID, param: Int): Float {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(param)
    val _ret = __method_bind.dampedStringJointGetParam.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun dampedStringJointSetParam(
    joint: RID,
    param: Int,
    value: Float
  ) {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(param)
    _args.append(value)
    __method_bind.dampedStringJointSetParam.call(this._handle, _args.toVariant(), 3)
  }

  fun freeRid(rid: RID) {
    val _arg = Variant.new(rid)
    __method_bind.freeRid.call(this._handle, _arg, 1)
  }

  fun getProcessInfo(processInfo: Int): Int {
    val _arg = Variant.new(processInfo)
    val _ret = __method_bind.getProcessInfo.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun grooveJointCreate(
    groove1A: Vector2,
    groove2A: Vector2,
    anchorB: Vector2,
    bodyA: RID,
    bodyB: RID
  ): RID {
    val _args = VariantArray.new()
    _args.append(groove1A)
    _args.append(groove2A)
    _args.append(anchorB)
    _args.append(bodyA)
    _args.append(bodyB)
    val _ret = __method_bind.grooveJointCreate.call(this._handle, _args.toVariant(), 5)
    return _ret.asRID()
  }

  fun jointGetParam(joint: RID, param: Int): Float {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(param)
    val _ret = __method_bind.jointGetParam.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun jointGetType(joint: RID): JointType {
    val _arg = Variant.new(joint)
    val _ret = __method_bind.jointGetType.call(this._handle, _arg, 1)
    return Physics2DServer.JointType.from(_ret.asInt())
  }

  fun jointSetParam(
    joint: RID,
    param: Int,
    value: Float
  ) {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(param)
    _args.append(value)
    __method_bind.jointSetParam.call(this._handle, _args.toVariant(), 3)
  }

  fun lineShapeCreate(): RID {
    val _ret = __method_bind.lineShapeCreate.call(this._handle)
    return _ret.asRID()
  }

  fun pinJointCreate(
    anchor: Vector2,
    bodyA: RID,
    bodyB: RID
  ): RID {
    val _args = VariantArray.new()
    _args.append(anchor)
    _args.append(bodyA)
    _args.append(bodyB)
    val _ret = __method_bind.pinJointCreate.call(this._handle, _args.toVariant(), 3)
    return _ret.asRID()
  }

  fun rayShapeCreate(): RID {
    val _ret = __method_bind.rayShapeCreate.call(this._handle)
    return _ret.asRID()
  }

  fun rectangleShapeCreate(): RID {
    val _ret = __method_bind.rectangleShapeCreate.call(this._handle)
    return _ret.asRID()
  }

  fun segmentShapeCreate(): RID {
    val _ret = __method_bind.segmentShapeCreate.call(this._handle)
    return _ret.asRID()
  }

  fun setActive(active: Boolean) {
    val _arg = Variant.new(active)
    __method_bind.setActive.call(this._handle, _arg, 1)
  }

  fun shapeGetData(shape: RID): Variant {
    val _arg = Variant.new(shape)
    val _ret = __method_bind.shapeGetData.call(this._handle, _arg, 1)
    return _ret
  }

  fun shapeGetType(shape: RID): ShapeType {
    val _arg = Variant.new(shape)
    val _ret = __method_bind.shapeGetType.call(this._handle, _arg, 1)
    return Physics2DServer.ShapeType.from(_ret.asInt())
  }

  fun shapeSetData(shape: RID, data: Variant) {
    val _args = VariantArray.new()
    _args.append(shape)
    _args.append(data)
    __method_bind.shapeSetData.call(this._handle, _args.toVariant(), 2)
  }

  fun spaceCreate(): RID {
    val _ret = __method_bind.spaceCreate.call(this._handle)
    return _ret.asRID()
  }

  fun spaceGetDirectState(space: RID): Physics2DDirectSpaceState {
    val _arg = Variant.new(space)
    val _ret = __method_bind.spaceGetDirectState.call(this._handle, _arg, 1)
    return _ret.asObject(::Physics2DDirectSpaceState)!!
  }

  fun spaceGetParam(space: RID, param: Int): Float {
    val _args = VariantArray.new()
    _args.append(space)
    _args.append(param)
    val _ret = __method_bind.spaceGetParam.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun spaceIsActive(space: RID): Boolean {
    val _arg = Variant.new(space)
    val _ret = __method_bind.spaceIsActive.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun spaceSetActive(space: RID, active: Boolean) {
    val _args = VariantArray.new()
    _args.append(space)
    _args.append(active)
    __method_bind.spaceSetActive.call(this._handle, _args.toVariant(), 2)
  }

  fun spaceSetParam(
    space: RID,
    param: Int,
    value: Float
  ) {
    val _args = VariantArray.new()
    _args.append(space)
    _args.append(param)
    _args.append(value)
    __method_bind.spaceSetParam.call(this._handle, _args.toVariant(), 3)
  }

  enum class ProcessInfo(
    val value: Int
  ) {
    INFO_ACTIVE_OBJECTS(0),

    INFO_COLLISION_PAIRS(1),

    INFO_ISLAND_COUNT(2);

    companion object {
      fun from(value: Int): ProcessInfo {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class AreaBodyStatus(
    val value: Int
  ) {
    AREA_BODY_ADDED(0),

    AREA_BODY_REMOVED(1);

    companion object {
      fun from(value: Int): AreaBodyStatus {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DampedStringParam(
    val value: Int
  ) {
    DAMPED_STRING_REST_LENGTH(0),

    DAMPED_STRING_STIFFNESS(1),

    DAMPED_STRING_DAMPING(2);

    companion object {
      fun from(value: Int): DampedStringParam {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class BodyMode(
    val value: Int
  ) {
    BODY_MODE_STATIC(0),

    BODY_MODE_KINEMATIC(1),

    BODY_MODE_RIGID(2),

    BODY_MODE_CHARACTER(3);

    companion object {
      fun from(value: Int): BodyMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ShapeType(
    val value: Int
  ) {
    SHAPE_LINE(0),

    SHAPE_RAY(1),

    SHAPE_SEGMENT(2),

    SHAPE_CIRCLE(3),

    SHAPE_RECTANGLE(4),

    SHAPE_CAPSULE(5),

    SHAPE_CONVEX_POLYGON(6),

    SHAPE_CONCAVE_POLYGON(7),

    SHAPE_CUSTOM(8);

    companion object {
      fun from(value: Int): ShapeType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class JointParam(
    val value: Int
  ) {
    JOINT_PARAM_BIAS(0),

    JOINT_PARAM_MAX_BIAS(1),

    JOINT_PARAM_MAX_FORCE(2);

    companion object {
      fun from(value: Int): JointParam {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class SpaceParameter(
    val value: Int
  ) {
    SPACE_PARAM_CONTACT_RECYCLE_RADIUS(0),

    SPACE_PARAM_CONTACT_MAX_SEPARATION(1),

    SPACE_PARAM_BODY_MAX_ALLOWED_PENETRATION(2),

    SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD(3),

    SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD(4),

    SPACE_PARAM_BODY_TIME_TO_SLEEP(5),

    SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS(6),

    SPACE_PARAM_TEST_MOTION_MIN_CONTACT_DEPTH(7);

    companion object {
      fun from(value: Int): SpaceParameter {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class JointType(
    val value: Int
  ) {
    JOINT_PIN(0),

    JOINT_GROOVE(1),

    JOINT_DAMPED_SPRING(2);

    companion object {
      fun from(value: Int): JointType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class CCDMode(
    val value: Int
  ) {
    CCD_MODE_DISABLED(0),

    CCD_MODE_CAST_RAY(1),

    CCD_MODE_CAST_SHAPE(2);

    companion object {
      fun from(value: Int): CCDMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class BodyState(
    val value: Int
  ) {
    BODY_STATE_TRANSFORM(0),

    BODY_STATE_LINEAR_VELOCITY(1),

    BODY_STATE_ANGULAR_VELOCITY(2),

    BODY_STATE_SLEEPING(3),

    BODY_STATE_CAN_SLEEP(4);

    companion object {
      fun from(value: Int): BodyState {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class BodyParameter(
    val value: Int
  ) {
    BODY_PARAM_BOUNCE(0),

    BODY_PARAM_FRICTION(1),

    BODY_PARAM_MASS(2),

    BODY_PARAM_INERTIA(3),

    BODY_PARAM_GRAVITY_SCALE(4),

    BODY_PARAM_LINEAR_DAMP(5),

    BODY_PARAM_ANGULAR_DAMP(6),

    BODY_PARAM_MAX(7);

    companion object {
      fun from(value: Int): BodyParameter {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class AreaSpaceOverrideMode(
    val value: Int
  ) {
    AREA_SPACE_OVERRIDE_DISABLED(0),

    AREA_SPACE_OVERRIDE_COMBINE(1),

    AREA_SPACE_OVERRIDE_COMBINE_REPLACE(2),

    AREA_SPACE_OVERRIDE_REPLACE(3),

    AREA_SPACE_OVERRIDE_REPLACE_COMBINE(4);

    companion object {
      fun from(value: Int): AreaSpaceOverrideMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class AreaParameter(
    val value: Int
  ) {
    AREA_PARAM_GRAVITY(0),

    AREA_PARAM_GRAVITY_VECTOR(1),

    AREA_PARAM_GRAVITY_IS_POINT(2),

    AREA_PARAM_GRAVITY_DISTANCE_SCALE(3),

    AREA_PARAM_GRAVITY_POINT_ATTENUATION(4),

    AREA_PARAM_LINEAR_DAMP(5),

    AREA_PARAM_ANGULAR_DAMP(6),

    AREA_PARAM_PRIORITY(7);

    companion object {
      fun from(value: Int): AreaParameter {
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
    val Instance: Physics2DServer
      get() = memScoped {
        val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("Physics2DServer".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton Physics2DServer" }
        Physics2DServer(
          handle
        )
      }
    val AREA_BODY_ADDED: Int = 0

    val AREA_BODY_REMOVED: Int = 1

    val AREA_PARAM_ANGULAR_DAMP: Int = 6

    val AREA_PARAM_GRAVITY: Int = 0

    val AREA_PARAM_GRAVITY_DISTANCE_SCALE: Int = 3

    val AREA_PARAM_GRAVITY_IS_POINT: Int = 2

    val AREA_PARAM_GRAVITY_POINT_ATTENUATION: Int = 4

    val AREA_PARAM_GRAVITY_VECTOR: Int = 1

    val AREA_PARAM_LINEAR_DAMP: Int = 5

    val AREA_PARAM_PRIORITY: Int = 7

    val AREA_SPACE_OVERRIDE_COMBINE: Int = 1

    val AREA_SPACE_OVERRIDE_COMBINE_REPLACE: Int = 2

    val AREA_SPACE_OVERRIDE_DISABLED: Int = 0

    val AREA_SPACE_OVERRIDE_REPLACE: Int = 3

    val AREA_SPACE_OVERRIDE_REPLACE_COMBINE: Int = 4

    val BODY_MODE_CHARACTER: Int = 3

    val BODY_MODE_KINEMATIC: Int = 1

    val BODY_MODE_RIGID: Int = 2

    val BODY_MODE_STATIC: Int = 0

    val BODY_PARAM_ANGULAR_DAMP: Int = 6

    val BODY_PARAM_BOUNCE: Int = 0

    val BODY_PARAM_FRICTION: Int = 1

    val BODY_PARAM_GRAVITY_SCALE: Int = 4

    val BODY_PARAM_INERTIA: Int = 3

    val BODY_PARAM_LINEAR_DAMP: Int = 5

    val BODY_PARAM_MASS: Int = 2

    val BODY_PARAM_MAX: Int = 7

    val BODY_STATE_ANGULAR_VELOCITY: Int = 2

    val BODY_STATE_CAN_SLEEP: Int = 4

    val BODY_STATE_LINEAR_VELOCITY: Int = 1

    val BODY_STATE_SLEEPING: Int = 3

    val BODY_STATE_TRANSFORM: Int = 0

    val CCD_MODE_CAST_RAY: Int = 1

    val CCD_MODE_CAST_SHAPE: Int = 2

    val CCD_MODE_DISABLED: Int = 0

    val DAMPED_STRING_DAMPING: Int = 2

    val DAMPED_STRING_REST_LENGTH: Int = 0

    val DAMPED_STRING_STIFFNESS: Int = 1

    val INFO_ACTIVE_OBJECTS: Int = 0

    val INFO_COLLISION_PAIRS: Int = 1

    val INFO_ISLAND_COUNT: Int = 2

    val JOINT_DAMPED_SPRING: Int = 2

    val JOINT_GROOVE: Int = 1

    val JOINT_PARAM_BIAS: Int = 0

    val JOINT_PARAM_MAX_BIAS: Int = 1

    val JOINT_PARAM_MAX_FORCE: Int = 2

    val JOINT_PIN: Int = 0

    val SHAPE_CAPSULE: Int = 5

    val SHAPE_CIRCLE: Int = 3

    val SHAPE_CONCAVE_POLYGON: Int = 7

    val SHAPE_CONVEX_POLYGON: Int = 6

    val SHAPE_CUSTOM: Int = 8

    val SHAPE_LINE: Int = 0

    val SHAPE_RAY: Int = 1

    val SHAPE_RECTANGLE: Int = 4

    val SHAPE_SEGMENT: Int = 2

    val SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD: Int = 4

    val SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD: Int = 3

    val SPACE_PARAM_BODY_MAX_ALLOWED_PENETRATION: Int = 2

    val SPACE_PARAM_BODY_TIME_TO_SLEEP: Int = 5

    val SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS: Int = 6

    val SPACE_PARAM_CONTACT_MAX_SEPARATION: Int = 1

    val SPACE_PARAM_CONTACT_RECYCLE_RADIUS: Int = 0

    val SPACE_PARAM_TEST_MOTION_MIN_CONTACT_DEPTH: Int = 7

    /**
     * Container for method_bind pointers for Physics2DServer
     */
    private object __method_bind {
      val areaAddShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_add_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_add_shape" }
        }
      val areaAttachCanvasInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_attach_canvas_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_attach_canvas_instance_id" }
        }
      val areaAttachObjectInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_attach_object_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_attach_object_instance_id" }
        }
      val areaClearShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_clear_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_clear_shapes" }
        }
      val areaCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_create" }
        }
      val areaGetCanvasInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_canvas_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_canvas_instance_id" }
        }
      val areaGetObjectInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_object_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_object_instance_id" }
        }
      val areaGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_param" }
        }
      val areaGetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_shape" }
        }
      val areaGetShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_shape_count" }
        }
      val areaGetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_shape_transform" }
        }
      val areaGetSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_space" }
        }
      val areaGetSpaceOverrideMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_space_override_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_space_override_mode" }
        }
      val areaGetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_transform" }
        }
      val areaRemoveShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_remove_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_remove_shape" }
        }
      val areaSetAreaMonitorCallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_area_monitor_callback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_area_monitor_callback" }
        }
      val areaSetCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_collision_layer" }
        }
      val areaSetCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_collision_mask" }
        }
      val areaSetMonitorCallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_monitor_callback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_monitor_callback" }
        }
      val areaSetMonitorable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_monitorable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_monitorable" }
        }
      val areaSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_param" }
        }
      val areaSetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_shape" }
        }
      val areaSetShapeDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_shape_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_shape_disabled" }
        }
      val areaSetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_shape_transform" }
        }
      val areaSetSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_space" }
        }
      val areaSetSpaceOverrideMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_space_override_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_space_override_mode" }
        }
      val areaSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_transform" }
        }
      val bodyAddCentralForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_add_central_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_add_central_force" }
        }
      val bodyAddCollisionException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_add_collision_exception".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_add_collision_exception" }
        }
      val bodyAddForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_add_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_add_force" }
        }
      val bodyAddShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_add_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_add_shape" }
        }
      val bodyAddTorque: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_add_torque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_add_torque" }
        }
      val bodyApplyCentralImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_apply_central_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_apply_central_impulse" }
        }
      val bodyApplyImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_apply_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_apply_impulse" }
        }
      val bodyApplyTorqueImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_apply_torque_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_apply_torque_impulse" }
        }
      val bodyAttachCanvasInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_attach_canvas_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_attach_canvas_instance_id" }
        }
      val bodyAttachObjectInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_attach_object_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_attach_object_instance_id" }
        }
      val bodyClearShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_clear_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_clear_shapes" }
        }
      val bodyCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_create" }
        }
      val bodyGetCanvasInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_canvas_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_canvas_instance_id" }
        }
      val bodyGetCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_collision_layer" }
        }
      val bodyGetCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_collision_mask" }
        }
      val bodyGetContinuousCollisionDetectionMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_continuous_collision_detection_mode".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method body_get_continuous_collision_detection_mode" }
        }
      val bodyGetDirectState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_direct_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_direct_state" }
        }
      val bodyGetMaxContactsReported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_max_contacts_reported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_max_contacts_reported" }
        }
      val bodyGetMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_mode" }
        }
      val bodyGetObjectInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_object_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_object_instance_id" }
        }
      val bodyGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_param" }
        }
      val bodyGetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_shape" }
        }
      val bodyGetShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_shape_count" }
        }
      val bodyGetShapeMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_shape_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_shape_metadata" }
        }
      val bodyGetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_shape_transform" }
        }
      val bodyGetSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_space" }
        }
      val bodyGetState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_state" }
        }
      val bodyIsOmittingForceIntegration: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_is_omitting_force_integration".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_is_omitting_force_integration"
            }
        }
      val bodyRemoveCollisionException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_remove_collision_exception".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_remove_collision_exception" }
        }
      val bodyRemoveShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_remove_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_remove_shape" }
        }
      val bodySetAxisVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_axis_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_axis_velocity" }
        }
      val bodySetCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_collision_layer" }
        }
      val bodySetCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_collision_mask" }
        }
      val bodySetContinuousCollisionDetectionMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_continuous_collision_detection_mode".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method body_set_continuous_collision_detection_mode" }
        }
      val bodySetForceIntegrationCallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_force_integration_callback".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method body_set_force_integration_callback" }
        }
      val bodySetMaxContactsReported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_max_contacts_reported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_max_contacts_reported" }
        }
      val bodySetMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_mode" }
        }
      val bodySetOmitForceIntegration: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_omit_force_integration".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_omit_force_integration" }
        }
      val bodySetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_param" }
        }
      val bodySetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_shape" }
        }
      val bodySetShapeAsOneWayCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_shape_as_one_way_collision".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method body_set_shape_as_one_way_collision" }
        }
      val bodySetShapeDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_shape_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_shape_disabled" }
        }
      val bodySetShapeMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_shape_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_shape_metadata" }
        }
      val bodySetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_shape_transform" }
        }
      val bodySetSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_space" }
        }
      val bodySetState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_state" }
        }
      val bodyTestMotion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_test_motion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_test_motion" }
        }
      val capsuleShapeCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "capsule_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method capsule_shape_create" }
        }
      val circleShapeCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "circle_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method circle_shape_create" }
        }
      val concavePolygonShapeCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "concave_polygon_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method concave_polygon_shape_create" }
        }
      val convexPolygonShapeCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "convex_polygon_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method convex_polygon_shape_create" }
        }
      val dampedSpringJointCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "damped_spring_joint_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method damped_spring_joint_create" }
        }
      val dampedStringJointGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "damped_string_joint_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method damped_string_joint_get_param" }
        }
      val dampedStringJointSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "damped_string_joint_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method damped_string_joint_set_param" }
        }
      val freeRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "free_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method free_rid" }
        }
      val getProcessInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "get_process_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_info" }
        }
      val grooveJointCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "groove_joint_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method groove_joint_create" }
        }
      val jointGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "joint_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method joint_get_param" }
        }
      val jointGetType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "joint_get_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method joint_get_type" }
        }
      val jointSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "joint_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method joint_set_param" }
        }
      val lineShapeCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "line_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method line_shape_create" }
        }
      val pinJointCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "pin_joint_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pin_joint_create" }
        }
      val rayShapeCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "ray_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ray_shape_create" }
        }
      val rectangleShapeCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "rectangle_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rectangle_shape_create" }
        }
      val segmentShapeCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "segment_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method segment_shape_create" }
        }
      val setActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "set_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_active" }
        }
      val shapeGetData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "shape_get_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_get_data" }
        }
      val shapeGetType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "shape_get_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_get_type" }
        }
      val shapeSetData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "shape_set_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_set_data" }
        }
      val spaceCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "space_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_create" }
        }
      val spaceGetDirectState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "space_get_direct_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_get_direct_state" }
        }
      val spaceGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "space_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_get_param" }
        }
      val spaceIsActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "space_is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_is_active" }
        }
      val spaceSetActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "space_set_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_set_active" }
        }
      val spaceSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "space_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_set_param" }
        }}
  }
}
