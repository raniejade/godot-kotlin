// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
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

open class PhysicsServer(
  _handle: COpaquePointer
) : Object(_handle) {
  fun areaAddShape(
    area: RID,
    shape: RID,
    transform: Transform,
    disabled: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(shape)
    _args.append(transform)
    _args.append(disabled)
    __method_bind.areaAddShape.call(this._handle, _args.toVariant(), 4)
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

  fun areaGetShapeTransform(area: RID, shapeIdx: Int): Transform {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(shapeIdx)
    val _ret = __method_bind.areaGetShapeTransform.call(this._handle, _args.toVariant(), 2)
    return _ret.asTransform()
  }

  fun areaGetSpace(area: RID): RID {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaGetSpace.call(this._handle, _arg, 1)
    return _ret.asRID()
  }

  fun areaGetSpaceOverrideMode(area: RID): AreaSpaceOverrideMode {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaGetSpaceOverrideMode.call(this._handle, _arg, 1)
    return PhysicsServer.AreaSpaceOverrideMode.from(_ret.asInt())
  }

  fun areaGetTransform(area: RID): Transform {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaGetTransform.call(this._handle, _arg, 1)
    return _ret.asTransform()
  }

  fun areaIsRayPickable(area: RID): Boolean {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaIsRayPickable.call(this._handle, _arg, 1)
    return _ret.asBoolean()
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

  fun areaSetRayPickable(area: RID, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(enable)
    __method_bind.areaSetRayPickable.call(this._handle, _args.toVariant(), 2)
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
    transform: Transform
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

  fun areaSetTransform(area: RID, transform: Transform) {
    val _args = VariantArray.new()
    _args.append(area)
    _args.append(transform)
    __method_bind.areaSetTransform.call(this._handle, _args.toVariant(), 2)
  }

  fun bodyAddCentralForce(body: RID, force: Vector3) {
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
    force: Vector3,
    position: Vector3
  ) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(force)
    _args.append(position)
    __method_bind.bodyAddForce.call(this._handle, _args.toVariant(), 3)
  }

  fun bodyAddShape(
    body: RID,
    shape: RID,
    transform: Transform,
    disabled: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(shape)
    _args.append(transform)
    _args.append(disabled)
    __method_bind.bodyAddShape.call(this._handle, _args.toVariant(), 4)
  }

  fun bodyAddTorque(body: RID, torque: Vector3) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(torque)
    __method_bind.bodyAddTorque.call(this._handle, _args.toVariant(), 2)
  }

  fun bodyApplyCentralImpulse(body: RID, impulse: Vector3) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(impulse)
    __method_bind.bodyApplyCentralImpulse.call(this._handle, _args.toVariant(), 2)
  }

  fun bodyApplyImpulse(
    body: RID,
    position: Vector3,
    impulse: Vector3
  ) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(position)
    _args.append(impulse)
    __method_bind.bodyApplyImpulse.call(this._handle, _args.toVariant(), 3)
  }

  fun bodyApplyTorqueImpulse(body: RID, impulse: Vector3) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(impulse)
    __method_bind.bodyApplyTorqueImpulse.call(this._handle, _args.toVariant(), 2)
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

  fun bodyCreate(mode: Int, initSleeping: Boolean): RID {
    val _args = VariantArray.new()
    _args.append(mode)
    _args.append(initSleeping)
    val _ret = __method_bind.bodyCreate.call(this._handle, _args.toVariant(), 2)
    return _ret.asRID()
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

  fun bodyGetDirectState(body: RID): PhysicsDirectBodyState {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetDirectState.call(this._handle, _arg, 1)
    return _ret.asObject(::PhysicsDirectBodyState)!!
  }

  fun bodyGetKinematicSafeMargin(body: RID): Float {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetKinematicSafeMargin.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun bodyGetMaxContactsReported(body: RID): Int {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetMaxContactsReported.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun bodyGetMode(body: RID): BodyMode {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetMode.call(this._handle, _arg, 1)
    return PhysicsServer.BodyMode.from(_ret.asInt())
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

  fun bodyGetShapeTransform(body: RID, shapeIdx: Int): Transform {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(shapeIdx)
    val _ret = __method_bind.bodyGetShapeTransform.call(this._handle, _args.toVariant(), 2)
    return _ret.asTransform()
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

  fun bodyIsAxisLocked(body: RID, axis: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(axis)
    val _ret = __method_bind.bodyIsAxisLocked.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun bodyIsContinuousCollisionDetectionEnabled(body: RID): Boolean {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyIsContinuousCollisionDetectionEnabled.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun bodyIsOmittingForceIntegration(body: RID): Boolean {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyIsOmittingForceIntegration.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun bodyIsRayPickable(body: RID): Boolean {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyIsRayPickable.call(this._handle, _arg, 1)
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

  fun bodySetAxisLock(
    body: RID,
    axis: Int,
    lock: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(axis)
    _args.append(lock)
    __method_bind.bodySetAxisLock.call(this._handle, _args.toVariant(), 3)
  }

  fun bodySetAxisVelocity(body: RID, axisVelocity: Vector3) {
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

  fun bodySetEnableContinuousCollisionDetection(body: RID, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(enable)
    __method_bind.bodySetEnableContinuousCollisionDetection.call(this._handle, _args.toVariant(), 2)
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

  fun bodySetKinematicSafeMargin(body: RID, margin: Float) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(margin)
    __method_bind.bodySetKinematicSafeMargin.call(this._handle, _args.toVariant(), 2)
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

  fun bodySetRayPickable(body: RID, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(body)
    _args.append(enable)
    __method_bind.bodySetRayPickable.call(this._handle, _args.toVariant(), 2)
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

  fun bodySetShapeTransform(
    body: RID,
    shapeIdx: Int,
    transform: Transform
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

  fun coneTwistJointGetParam(joint: RID, param: Int): Float {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(param)
    val _ret = __method_bind.coneTwistJointGetParam.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun coneTwistJointSetParam(
    joint: RID,
    param: Int,
    value: Float
  ) {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(param)
    _args.append(value)
    __method_bind.coneTwistJointSetParam.call(this._handle, _args.toVariant(), 3)
  }

  fun freeRid(rid: RID) {
    val _arg = Variant.new(rid)
    __method_bind.freeRid.call(this._handle, _arg, 1)
  }

  fun generic6dofJointGetFlag(
    joint: RID,
    axis: Int,
    flag: Int
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(axis)
    _args.append(flag)
    val _ret = __method_bind.generic6dofJointGetFlag.call(this._handle, _args.toVariant(), 3)
    return _ret.asBoolean()
  }

  fun generic6dofJointGetParam(
    joint: RID,
    axis: Int,
    param: Int
  ): Float {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(axis)
    _args.append(param)
    val _ret = __method_bind.generic6dofJointGetParam.call(this._handle, _args.toVariant(), 3)
    return _ret.asFloat()
  }

  fun generic6dofJointSetFlag(
    joint: RID,
    axis: Int,
    flag: Int,
    enable: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(axis)
    _args.append(flag)
    _args.append(enable)
    __method_bind.generic6dofJointSetFlag.call(this._handle, _args.toVariant(), 4)
  }

  fun generic6dofJointSetParam(
    joint: RID,
    axis: Int,
    param: Int,
    value: Float
  ) {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(axis)
    _args.append(param)
    _args.append(value)
    __method_bind.generic6dofJointSetParam.call(this._handle, _args.toVariant(), 4)
  }

  fun getProcessInfo(processInfo: Int): Int {
    val _arg = Variant.new(processInfo)
    val _ret = __method_bind.getProcessInfo.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun hingeJointGetFlag(joint: RID, flag: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(flag)
    val _ret = __method_bind.hingeJointGetFlag.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun hingeJointGetParam(joint: RID, param: Int): Float {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(param)
    val _ret = __method_bind.hingeJointGetParam.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun hingeJointSetFlag(
    joint: RID,
    flag: Int,
    enabled: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(flag)
    _args.append(enabled)
    __method_bind.hingeJointSetFlag.call(this._handle, _args.toVariant(), 3)
  }

  fun hingeJointSetParam(
    joint: RID,
    param: Int,
    value: Float
  ) {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(param)
    _args.append(value)
    __method_bind.hingeJointSetParam.call(this._handle, _args.toVariant(), 3)
  }

  fun jointCreateConeTwist(
    bodyA: RID,
    localRefA: Transform,
    bodyB: RID,
    localRefB: Transform
  ): RID {
    val _args = VariantArray.new()
    _args.append(bodyA)
    _args.append(localRefA)
    _args.append(bodyB)
    _args.append(localRefB)
    val _ret = __method_bind.jointCreateConeTwist.call(this._handle, _args.toVariant(), 4)
    return _ret.asRID()
  }

  fun jointCreateGeneric6dof(
    bodyA: RID,
    localRefA: Transform,
    bodyB: RID,
    localRefB: Transform
  ): RID {
    val _args = VariantArray.new()
    _args.append(bodyA)
    _args.append(localRefA)
    _args.append(bodyB)
    _args.append(localRefB)
    val _ret = __method_bind.jointCreateGeneric6dof.call(this._handle, _args.toVariant(), 4)
    return _ret.asRID()
  }

  fun jointCreateHinge(
    bodyA: RID,
    hingeA: Transform,
    bodyB: RID,
    hingeB: Transform
  ): RID {
    val _args = VariantArray.new()
    _args.append(bodyA)
    _args.append(hingeA)
    _args.append(bodyB)
    _args.append(hingeB)
    val _ret = __method_bind.jointCreateHinge.call(this._handle, _args.toVariant(), 4)
    return _ret.asRID()
  }

  fun jointCreatePin(
    bodyA: RID,
    localA: Vector3,
    bodyB: RID,
    localB: Vector3
  ): RID {
    val _args = VariantArray.new()
    _args.append(bodyA)
    _args.append(localA)
    _args.append(bodyB)
    _args.append(localB)
    val _ret = __method_bind.jointCreatePin.call(this._handle, _args.toVariant(), 4)
    return _ret.asRID()
  }

  fun jointCreateSlider(
    bodyA: RID,
    localRefA: Transform,
    bodyB: RID,
    localRefB: Transform
  ): RID {
    val _args = VariantArray.new()
    _args.append(bodyA)
    _args.append(localRefA)
    _args.append(bodyB)
    _args.append(localRefB)
    val _ret = __method_bind.jointCreateSlider.call(this._handle, _args.toVariant(), 4)
    return _ret.asRID()
  }

  fun jointGetSolverPriority(joint: RID): Int {
    val _arg = Variant.new(joint)
    val _ret = __method_bind.jointGetSolverPriority.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun jointGetType(joint: RID): JointType {
    val _arg = Variant.new(joint)
    val _ret = __method_bind.jointGetType.call(this._handle, _arg, 1)
    return PhysicsServer.JointType.from(_ret.asInt())
  }

  fun jointSetSolverPriority(joint: RID, priority: Int) {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(priority)
    __method_bind.jointSetSolverPriority.call(this._handle, _args.toVariant(), 2)
  }

  fun pinJointGetLocalA(joint: RID): Vector3 {
    val _arg = Variant.new(joint)
    val _ret = __method_bind.pinJointGetLocalA.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun pinJointGetLocalB(joint: RID): Vector3 {
    val _arg = Variant.new(joint)
    val _ret = __method_bind.pinJointGetLocalB.call(this._handle, _arg, 1)
    return _ret.asVector3()
  }

  fun pinJointGetParam(joint: RID, param: Int): Float {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(param)
    val _ret = __method_bind.pinJointGetParam.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun pinJointSetLocalA(joint: RID, localA: Vector3) {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(localA)
    __method_bind.pinJointSetLocalA.call(this._handle, _args.toVariant(), 2)
  }

  fun pinJointSetLocalB(joint: RID, localB: Vector3) {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(localB)
    __method_bind.pinJointSetLocalB.call(this._handle, _args.toVariant(), 2)
  }

  fun pinJointSetParam(
    joint: RID,
    param: Int,
    value: Float
  ) {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(param)
    _args.append(value)
    __method_bind.pinJointSetParam.call(this._handle, _args.toVariant(), 3)
  }

  fun setActive(active: Boolean) {
    val _arg = Variant.new(active)
    __method_bind.setActive.call(this._handle, _arg, 1)
  }

  fun shapeCreate(type: Int): RID {
    val _arg = Variant.new(type)
    val _ret = __method_bind.shapeCreate.call(this._handle, _arg, 1)
    return _ret.asRID()
  }

  fun shapeGetData(shape: RID): Variant {
    val _arg = Variant.new(shape)
    val _ret = __method_bind.shapeGetData.call(this._handle, _arg, 1)
    return _ret
  }

  fun shapeGetType(shape: RID): ShapeType {
    val _arg = Variant.new(shape)
    val _ret = __method_bind.shapeGetType.call(this._handle, _arg, 1)
    return PhysicsServer.ShapeType.from(_ret.asInt())
  }

  fun shapeSetData(shape: RID, data: Variant) {
    val _args = VariantArray.new()
    _args.append(shape)
    _args.append(data)
    __method_bind.shapeSetData.call(this._handle, _args.toVariant(), 2)
  }

  fun sliderJointGetParam(joint: RID, param: Int): Float {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(param)
    val _ret = __method_bind.sliderJointGetParam.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun sliderJointSetParam(
    joint: RID,
    param: Int,
    value: Float
  ) {
    val _args = VariantArray.new()
    _args.append(joint)
    _args.append(param)
    _args.append(value)
    __method_bind.sliderJointSetParam.call(this._handle, _args.toVariant(), 3)
  }

  fun spaceCreate(): RID {
    val _ret = __method_bind.spaceCreate.call(this._handle)
    return _ret.asRID()
  }

  fun spaceGetDirectState(space: RID): PhysicsDirectSpaceState {
    val _arg = Variant.new(space)
    val _ret = __method_bind.spaceGetDirectState.call(this._handle, _arg, 1)
    return _ret.asObject(::PhysicsDirectSpaceState)!!
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

  enum class BodyAxis(
    val value: Int
  ) {
    BODY_AXIS_LINEAR_X(1),

    BODY_AXIS_LINEAR_Y(2),

    BODY_AXIS_LINEAR_Z(4),

    BODY_AXIS_ANGULAR_X(8),

    BODY_AXIS_ANGULAR_Y(16),

    BODY_AXIS_ANGULAR_Z(32);

    companion object {
      fun from(value: Int): BodyAxis {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
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
    SHAPE_PLANE(0),

    SHAPE_RAY(1),

    SHAPE_SPHERE(2),

    SHAPE_BOX(3),

    SHAPE_CAPSULE(4),

    SHAPE_CYLINDER(5),

    SHAPE_CONVEX_POLYGON(6),

    SHAPE_CONCAVE_POLYGON(7),

    SHAPE_HEIGHTMAP(8),

    SHAPE_CUSTOM(9);

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

  enum class PinJointParam(
    val value: Int
  ) {
    PIN_JOINT_BIAS(0),

    PIN_JOINT_DAMPING(1),

    PIN_JOINT_IMPULSE_CLAMP(2);

    companion object {
      fun from(value: Int): PinJointParam {
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

    SPACE_PARAM_BODY_ANGULAR_VELOCITY_DAMP_RATIO(6),

    SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS(7),

    SPACE_PARAM_TEST_MOTION_MIN_CONTACT_DEPTH(8);

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

  enum class ConeTwistJointParam(
    val value: Int
  ) {
    CONE_TWIST_JOINT_SWING_SPAN(0),

    CONE_TWIST_JOINT_TWIST_SPAN(1),

    CONE_TWIST_JOINT_BIAS(2),

    CONE_TWIST_JOINT_SOFTNESS(3),

    CONE_TWIST_JOINT_RELAXATION(4);

    companion object {
      fun from(value: Int): ConeTwistJointParam {
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

    JOINT_HINGE(1),

    JOINT_SLIDER(2),

    JOINT_CONE_TWIST(3),

    JOINT_6DOF(4);

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

    BODY_PARAM_GRAVITY_SCALE(3),

    BODY_PARAM_LINEAR_DAMP(4),

    BODY_PARAM_ANGULAR_DAMP(5),

    BODY_PARAM_MAX(6);

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

  enum class G6DOFJointAxisParam(
    val value: Int
  ) {
    G6DOF_JOINT_LINEAR_LOWER_LIMIT(0),

    G6DOF_JOINT_LINEAR_UPPER_LIMIT(1),

    G6DOF_JOINT_LINEAR_LIMIT_SOFTNESS(2),

    G6DOF_JOINT_LINEAR_RESTITUTION(3),

    G6DOF_JOINT_LINEAR_DAMPING(4),

    G6DOF_JOINT_LINEAR_MOTOR_TARGET_VELOCITY(5),

    G6DOF_JOINT_LINEAR_MOTOR_FORCE_LIMIT(6),

    G6DOF_JOINT_ANGULAR_LOWER_LIMIT(10),

    G6DOF_JOINT_ANGULAR_UPPER_LIMIT(11),

    G6DOF_JOINT_ANGULAR_LIMIT_SOFTNESS(12),

    G6DOF_JOINT_ANGULAR_DAMPING(13),

    G6DOF_JOINT_ANGULAR_RESTITUTION(14),

    G6DOF_JOINT_ANGULAR_FORCE_LIMIT(15),

    G6DOF_JOINT_ANGULAR_ERP(16),

    G6DOF_JOINT_ANGULAR_MOTOR_TARGET_VELOCITY(17),

    G6DOF_JOINT_ANGULAR_MOTOR_FORCE_LIMIT(18);

    companion object {
      fun from(value: Int): G6DOFJointAxisParam {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class SliderJointParam(
    val value: Int
  ) {
    SLIDER_JOINT_LINEAR_LIMIT_UPPER(0),

    SLIDER_JOINT_LINEAR_LIMIT_LOWER(1),

    SLIDER_JOINT_LINEAR_LIMIT_SOFTNESS(2),

    SLIDER_JOINT_LINEAR_LIMIT_RESTITUTION(3),

    SLIDER_JOINT_LINEAR_LIMIT_DAMPING(4),

    SLIDER_JOINT_LINEAR_MOTION_SOFTNESS(5),

    SLIDER_JOINT_LINEAR_MOTION_RESTITUTION(6),

    SLIDER_JOINT_LINEAR_MOTION_DAMPING(7),

    SLIDER_JOINT_LINEAR_ORTHOGONAL_SOFTNESS(8),

    SLIDER_JOINT_LINEAR_ORTHOGONAL_RESTITUTION(9),

    SLIDER_JOINT_LINEAR_ORTHOGONAL_DAMPING(10),

    SLIDER_JOINT_ANGULAR_LIMIT_UPPER(11),

    SLIDER_JOINT_ANGULAR_LIMIT_LOWER(12),

    SLIDER_JOINT_ANGULAR_LIMIT_SOFTNESS(13),

    SLIDER_JOINT_ANGULAR_LIMIT_RESTITUTION(14),

    SLIDER_JOINT_ANGULAR_LIMIT_DAMPING(15),

    SLIDER_JOINT_ANGULAR_MOTION_SOFTNESS(16),

    SLIDER_JOINT_ANGULAR_MOTION_RESTITUTION(17),

    SLIDER_JOINT_ANGULAR_MOTION_DAMPING(18),

    SLIDER_JOINT_ANGULAR_ORTHOGONAL_SOFTNESS(19),

    SLIDER_JOINT_ANGULAR_ORTHOGONAL_RESTITUTION(20),

    SLIDER_JOINT_ANGULAR_ORTHOGONAL_DAMPING(21),

    SLIDER_JOINT_MAX(22);

    companion object {
      fun from(value: Int): SliderJointParam {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class HingeJointParam(
    val value: Int
  ) {
    HINGE_JOINT_BIAS(0),

    HINGE_JOINT_LIMIT_UPPER(1),

    HINGE_JOINT_LIMIT_LOWER(2),

    HINGE_JOINT_LIMIT_BIAS(3),

    HINGE_JOINT_LIMIT_SOFTNESS(4),

    HINGE_JOINT_LIMIT_RELAXATION(5),

    HINGE_JOINT_MOTOR_TARGET_VELOCITY(6),

    HINGE_JOINT_MOTOR_MAX_IMPULSE(7);

    companion object {
      fun from(value: Int): HingeJointParam {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class G6DOFJointAxisFlag(
    val value: Int
  ) {
    G6DOF_JOINT_FLAG_ENABLE_LINEAR_LIMIT(0),

    G6DOF_JOINT_FLAG_ENABLE_ANGULAR_LIMIT(1),

    G6DOF_JOINT_FLAG_ENABLE_MOTOR(4),

    G6DOF_JOINT_FLAG_ENABLE_LINEAR_MOTOR(5);

    companion object {
      fun from(value: Int): G6DOFJointAxisFlag {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class HingeJointFlag(
    val value: Int
  ) {
    HINGE_JOINT_FLAG_USE_LIMIT(0),

    HINGE_JOINT_FLAG_ENABLE_MOTOR(1);

    companion object {
      fun from(value: Int): HingeJointFlag {
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
    val Instance: PhysicsServer
      get() = memScoped {
        val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("PhysicsServer".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton PhysicsServer" }
        PhysicsServer(
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

    val BODY_AXIS_ANGULAR_X: Int = 8

    val BODY_AXIS_ANGULAR_Y: Int = 16

    val BODY_AXIS_ANGULAR_Z: Int = 32

    val BODY_AXIS_LINEAR_X: Int = 1

    val BODY_AXIS_LINEAR_Y: Int = 2

    val BODY_AXIS_LINEAR_Z: Int = 4

    val BODY_MODE_CHARACTER: Int = 3

    val BODY_MODE_KINEMATIC: Int = 1

    val BODY_MODE_RIGID: Int = 2

    val BODY_MODE_STATIC: Int = 0

    val BODY_PARAM_ANGULAR_DAMP: Int = 5

    val BODY_PARAM_BOUNCE: Int = 0

    val BODY_PARAM_FRICTION: Int = 1

    val BODY_PARAM_GRAVITY_SCALE: Int = 3

    val BODY_PARAM_LINEAR_DAMP: Int = 4

    val BODY_PARAM_MASS: Int = 2

    val BODY_PARAM_MAX: Int = 6

    val BODY_STATE_ANGULAR_VELOCITY: Int = 2

    val BODY_STATE_CAN_SLEEP: Int = 4

    val BODY_STATE_LINEAR_VELOCITY: Int = 1

    val BODY_STATE_SLEEPING: Int = 3

    val BODY_STATE_TRANSFORM: Int = 0

    val CONE_TWIST_JOINT_BIAS: Int = 2

    val CONE_TWIST_JOINT_RELAXATION: Int = 4

    val CONE_TWIST_JOINT_SOFTNESS: Int = 3

    val CONE_TWIST_JOINT_SWING_SPAN: Int = 0

    val CONE_TWIST_JOINT_TWIST_SPAN: Int = 1

    val G6DOF_JOINT_ANGULAR_DAMPING: Int = 13

    val G6DOF_JOINT_ANGULAR_ERP: Int = 16

    val G6DOF_JOINT_ANGULAR_FORCE_LIMIT: Int = 15

    val G6DOF_JOINT_ANGULAR_LIMIT_SOFTNESS: Int = 12

    val G6DOF_JOINT_ANGULAR_LOWER_LIMIT: Int = 10

    val G6DOF_JOINT_ANGULAR_MOTOR_FORCE_LIMIT: Int = 18

    val G6DOF_JOINT_ANGULAR_MOTOR_TARGET_VELOCITY: Int = 17

    val G6DOF_JOINT_ANGULAR_RESTITUTION: Int = 14

    val G6DOF_JOINT_ANGULAR_UPPER_LIMIT: Int = 11

    val G6DOF_JOINT_FLAG_ENABLE_ANGULAR_LIMIT: Int = 1

    val G6DOF_JOINT_FLAG_ENABLE_LINEAR_LIMIT: Int = 0

    val G6DOF_JOINT_FLAG_ENABLE_LINEAR_MOTOR: Int = 5

    val G6DOF_JOINT_FLAG_ENABLE_MOTOR: Int = 4

    val G6DOF_JOINT_LINEAR_DAMPING: Int = 4

    val G6DOF_JOINT_LINEAR_LIMIT_SOFTNESS: Int = 2

    val G6DOF_JOINT_LINEAR_LOWER_LIMIT: Int = 0

    val G6DOF_JOINT_LINEAR_MOTOR_FORCE_LIMIT: Int = 6

    val G6DOF_JOINT_LINEAR_MOTOR_TARGET_VELOCITY: Int = 5

    val G6DOF_JOINT_LINEAR_RESTITUTION: Int = 3

    val G6DOF_JOINT_LINEAR_UPPER_LIMIT: Int = 1

    val HINGE_JOINT_BIAS: Int = 0

    val HINGE_JOINT_FLAG_ENABLE_MOTOR: Int = 1

    val HINGE_JOINT_FLAG_USE_LIMIT: Int = 0

    val HINGE_JOINT_LIMIT_BIAS: Int = 3

    val HINGE_JOINT_LIMIT_LOWER: Int = 2

    val HINGE_JOINT_LIMIT_RELAXATION: Int = 5

    val HINGE_JOINT_LIMIT_SOFTNESS: Int = 4

    val HINGE_JOINT_LIMIT_UPPER: Int = 1

    val HINGE_JOINT_MOTOR_MAX_IMPULSE: Int = 7

    val HINGE_JOINT_MOTOR_TARGET_VELOCITY: Int = 6

    val INFO_ACTIVE_OBJECTS: Int = 0

    val INFO_COLLISION_PAIRS: Int = 1

    val INFO_ISLAND_COUNT: Int = 2

    val JOINT_6DOF: Int = 4

    val JOINT_CONE_TWIST: Int = 3

    val JOINT_HINGE: Int = 1

    val JOINT_PIN: Int = 0

    val JOINT_SLIDER: Int = 2

    val PIN_JOINT_BIAS: Int = 0

    val PIN_JOINT_DAMPING: Int = 1

    val PIN_JOINT_IMPULSE_CLAMP: Int = 2

    val SHAPE_BOX: Int = 3

    val SHAPE_CAPSULE: Int = 4

    val SHAPE_CONCAVE_POLYGON: Int = 7

    val SHAPE_CONVEX_POLYGON: Int = 6

    val SHAPE_CUSTOM: Int = 9

    val SHAPE_CYLINDER: Int = 5

    val SHAPE_HEIGHTMAP: Int = 8

    val SHAPE_PLANE: Int = 0

    val SHAPE_RAY: Int = 1

    val SHAPE_SPHERE: Int = 2

    val SLIDER_JOINT_ANGULAR_LIMIT_DAMPING: Int = 15

    val SLIDER_JOINT_ANGULAR_LIMIT_LOWER: Int = 12

    val SLIDER_JOINT_ANGULAR_LIMIT_RESTITUTION: Int = 14

    val SLIDER_JOINT_ANGULAR_LIMIT_SOFTNESS: Int = 13

    val SLIDER_JOINT_ANGULAR_LIMIT_UPPER: Int = 11

    val SLIDER_JOINT_ANGULAR_MOTION_DAMPING: Int = 18

    val SLIDER_JOINT_ANGULAR_MOTION_RESTITUTION: Int = 17

    val SLIDER_JOINT_ANGULAR_MOTION_SOFTNESS: Int = 16

    val SLIDER_JOINT_ANGULAR_ORTHOGONAL_DAMPING: Int = 21

    val SLIDER_JOINT_ANGULAR_ORTHOGONAL_RESTITUTION: Int = 20

    val SLIDER_JOINT_ANGULAR_ORTHOGONAL_SOFTNESS: Int = 19

    val SLIDER_JOINT_LINEAR_LIMIT_DAMPING: Int = 4

    val SLIDER_JOINT_LINEAR_LIMIT_LOWER: Int = 1

    val SLIDER_JOINT_LINEAR_LIMIT_RESTITUTION: Int = 3

    val SLIDER_JOINT_LINEAR_LIMIT_SOFTNESS: Int = 2

    val SLIDER_JOINT_LINEAR_LIMIT_UPPER: Int = 0

    val SLIDER_JOINT_LINEAR_MOTION_DAMPING: Int = 7

    val SLIDER_JOINT_LINEAR_MOTION_RESTITUTION: Int = 6

    val SLIDER_JOINT_LINEAR_MOTION_SOFTNESS: Int = 5

    val SLIDER_JOINT_LINEAR_ORTHOGONAL_DAMPING: Int = 10

    val SLIDER_JOINT_LINEAR_ORTHOGONAL_RESTITUTION: Int = 9

    val SLIDER_JOINT_LINEAR_ORTHOGONAL_SOFTNESS: Int = 8

    val SLIDER_JOINT_MAX: Int = 22

    val SPACE_PARAM_BODY_ANGULAR_VELOCITY_DAMP_RATIO: Int = 6

    val SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD: Int = 4

    val SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD: Int = 3

    val SPACE_PARAM_BODY_MAX_ALLOWED_PENETRATION: Int = 2

    val SPACE_PARAM_BODY_TIME_TO_SLEEP: Int = 5

    val SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS: Int = 7

    val SPACE_PARAM_CONTACT_MAX_SEPARATION: Int = 1

    val SPACE_PARAM_CONTACT_RECYCLE_RADIUS: Int = 0

    val SPACE_PARAM_TEST_MOTION_MIN_CONTACT_DEPTH: Int = 8

    /**
     * Container for method_bind pointers for PhysicsServer
     */
    private object __method_bind {
      val areaAddShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaAddShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaAddShape" }
        }
      val areaAttachObjectInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaAttachObjectInstanceId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaAttachObjectInstanceId" }
        }
      val areaClearShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaClearShapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaClearShapes" }
        }
      val areaCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaCreate" }
        }
      val areaGetObjectInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaGetObjectInstanceId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaGetObjectInstanceId" }
        }
      val areaGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaGetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaGetParam" }
        }
      val areaGetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaGetShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaGetShape" }
        }
      val areaGetShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaGetShapeCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaGetShapeCount" }
        }
      val areaGetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaGetShapeTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaGetShapeTransform" }
        }
      val areaGetSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaGetSpace".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaGetSpace" }
        }
      val areaGetSpaceOverrideMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaGetSpaceOverrideMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaGetSpaceOverrideMode" }
        }
      val areaGetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaGetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaGetTransform" }
        }
      val areaIsRayPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaIsRayPickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaIsRayPickable" }
        }
      val areaRemoveShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaRemoveShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaRemoveShape" }
        }
      val areaSetAreaMonitorCallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaSetAreaMonitorCallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaSetAreaMonitorCallback" }
        }
      val areaSetCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaSetCollisionLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaSetCollisionLayer" }
        }
      val areaSetCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaSetCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaSetCollisionMask" }
        }
      val areaSetMonitorCallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaSetMonitorCallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaSetMonitorCallback" }
        }
      val areaSetMonitorable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaSetMonitorable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaSetMonitorable" }
        }
      val areaSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaSetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaSetParam" }
        }
      val areaSetRayPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaSetRayPickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaSetRayPickable" }
        }
      val areaSetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaSetShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaSetShape" }
        }
      val areaSetShapeDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaSetShapeDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaSetShapeDisabled" }
        }
      val areaSetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaSetShapeTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaSetShapeTransform" }
        }
      val areaSetSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaSetSpace".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaSetSpace" }
        }
      val areaSetSpaceOverrideMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaSetSpaceOverrideMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaSetSpaceOverrideMode" }
        }
      val areaSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "areaSetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method areaSetTransform" }
        }
      val bodyAddCentralForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyAddCentralForce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyAddCentralForce" }
        }
      val bodyAddCollisionException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyAddCollisionException".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyAddCollisionException" }
        }
      val bodyAddForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyAddForce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyAddForce" }
        }
      val bodyAddShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyAddShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyAddShape" }
        }
      val bodyAddTorque: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyAddTorque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyAddTorque" }
        }
      val bodyApplyCentralImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyApplyCentralImpulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyApplyCentralImpulse" }
        }
      val bodyApplyImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyApplyImpulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyApplyImpulse" }
        }
      val bodyApplyTorqueImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyApplyTorqueImpulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyApplyTorqueImpulse" }
        }
      val bodyAttachObjectInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyAttachObjectInstanceId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyAttachObjectInstanceId" }
        }
      val bodyClearShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyClearShapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyClearShapes" }
        }
      val bodyCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyCreate" }
        }
      val bodyGetCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyGetCollisionLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyGetCollisionLayer" }
        }
      val bodyGetCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyGetCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyGetCollisionMask" }
        }
      val bodyGetDirectState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyGetDirectState".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyGetDirectState" }
        }
      val bodyGetKinematicSafeMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyGetKinematicSafeMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyGetKinematicSafeMargin" }
        }
      val bodyGetMaxContactsReported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyGetMaxContactsReported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyGetMaxContactsReported" }
        }
      val bodyGetMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyGetMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyGetMode" }
        }
      val bodyGetObjectInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyGetObjectInstanceId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyGetObjectInstanceId" }
        }
      val bodyGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyGetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyGetParam" }
        }
      val bodyGetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyGetShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyGetShape" }
        }
      val bodyGetShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyGetShapeCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyGetShapeCount" }
        }
      val bodyGetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyGetShapeTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyGetShapeTransform" }
        }
      val bodyGetSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyGetSpace".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyGetSpace" }
        }
      val bodyGetState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyGetState".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyGetState" }
        }
      val bodyIsAxisLocked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyIsAxisLocked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyIsAxisLocked" }
        }
      val bodyIsContinuousCollisionDetectionEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyIsContinuousCollisionDetectionEnabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method bodyIsContinuousCollisionDetectionEnabled" }
        }
      val bodyIsOmittingForceIntegration: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyIsOmittingForceIntegration".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyIsOmittingForceIntegration" }
        }
      val bodyIsRayPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyIsRayPickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyIsRayPickable" }
        }
      val bodyRemoveCollisionException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyRemoveCollisionException".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyRemoveCollisionException" }
        }
      val bodyRemoveShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodyRemoveShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodyRemoveShape" }
        }
      val bodySetAxisLock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetAxisLock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetAxisLock" }
        }
      val bodySetAxisVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetAxisVelocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetAxisVelocity" }
        }
      val bodySetCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetCollisionLayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetCollisionLayer" }
        }
      val bodySetCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetCollisionMask" }
        }
      val bodySetEnableContinuousCollisionDetection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetEnableContinuousCollisionDetection".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method bodySetEnableContinuousCollisionDetection" }
        }
      val bodySetForceIntegrationCallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetForceIntegrationCallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetForceIntegrationCallback" }
        }
      val bodySetKinematicSafeMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetKinematicSafeMargin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetKinematicSafeMargin" }
        }
      val bodySetMaxContactsReported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetMaxContactsReported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetMaxContactsReported" }
        }
      val bodySetMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetMode" }
        }
      val bodySetOmitForceIntegration: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetOmitForceIntegration".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetOmitForceIntegration" }
        }
      val bodySetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetParam" }
        }
      val bodySetRayPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetRayPickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetRayPickable" }
        }
      val bodySetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetShape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetShape" }
        }
      val bodySetShapeDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetShapeDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetShapeDisabled" }
        }
      val bodySetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetShapeTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetShapeTransform" }
        }
      val bodySetSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetSpace".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetSpace" }
        }
      val bodySetState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "bodySetState".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bodySetState" }
        }
      val coneTwistJointGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "coneTwistJointGetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method coneTwistJointGetParam" }
        }
      val coneTwistJointSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "coneTwistJointSetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method coneTwistJointSetParam" }
        }
      val freeRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "freeRid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method freeRid" }
        }
      val generic6dofJointGetFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "generic6dofJointGetFlag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generic6dofJointGetFlag" }
        }
      val generic6dofJointGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "generic6dofJointGetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generic6dofJointGetParam" }
        }
      val generic6dofJointSetFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "generic6dofJointSetFlag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generic6dofJointSetFlag" }
        }
      val generic6dofJointSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "generic6dofJointSetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generic6dofJointSetParam" }
        }
      val getProcessInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "getProcessInfo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getProcessInfo" }
        }
      val hingeJointGetFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "hingeJointGetFlag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hingeJointGetFlag" }
        }
      val hingeJointGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "hingeJointGetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hingeJointGetParam" }
        }
      val hingeJointSetFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "hingeJointSetFlag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hingeJointSetFlag" }
        }
      val hingeJointSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "hingeJointSetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hingeJointSetParam" }
        }
      val jointCreateConeTwist: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "jointCreateConeTwist".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method jointCreateConeTwist" }
        }
      val jointCreateGeneric6dof: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "jointCreateGeneric6dof".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method jointCreateGeneric6dof" }
        }
      val jointCreateHinge: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "jointCreateHinge".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method jointCreateHinge" }
        }
      val jointCreatePin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "jointCreatePin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method jointCreatePin" }
        }
      val jointCreateSlider: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "jointCreateSlider".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method jointCreateSlider" }
        }
      val jointGetSolverPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "jointGetSolverPriority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method jointGetSolverPriority" }
        }
      val jointGetType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "jointGetType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method jointGetType" }
        }
      val jointSetSolverPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "jointSetSolverPriority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method jointSetSolverPriority" }
        }
      val pinJointGetLocalA: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "pinJointGetLocalA".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pinJointGetLocalA" }
        }
      val pinJointGetLocalB: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "pinJointGetLocalB".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pinJointGetLocalB" }
        }
      val pinJointGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "pinJointGetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pinJointGetParam" }
        }
      val pinJointSetLocalA: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "pinJointSetLocalA".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pinJointSetLocalA" }
        }
      val pinJointSetLocalB: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "pinJointSetLocalB".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pinJointSetLocalB" }
        }
      val pinJointSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "pinJointSetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pinJointSetParam" }
        }
      val setActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "setActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setActive" }
        }
      val shapeCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "shapeCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeCreate" }
        }
      val shapeGetData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "shapeGetData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeGetData" }
        }
      val shapeGetType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "shapeGetType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeGetType" }
        }
      val shapeSetData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "shapeSetData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shapeSetData" }
        }
      val sliderJointGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "sliderJointGetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method sliderJointGetParam" }
        }
      val sliderJointSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "sliderJointSetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method sliderJointSetParam" }
        }
      val spaceCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "spaceCreate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method spaceCreate" }
        }
      val spaceGetDirectState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "spaceGetDirectState".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method spaceGetDirectState" }
        }
      val spaceGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "spaceGetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method spaceGetParam" }
        }
      val spaceIsActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "spaceIsActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method spaceIsActive" }
        }
      val spaceSetActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "spaceSetActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method spaceSetActive" }
        }
      val spaceSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "spaceSetParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method spaceSetParam" }
        }}
  }
}
