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
import kotlin.reflect.KCallable
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
    disabled: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(shape))
    _args.add(Variant.fromAny(transform))
    _args.add(Variant.fromAny(disabled))
    __method_bind.areaAddShape.call(this._handle, _args)
  }

  fun areaAttachObjectInstanceId(area: RID, id: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(id))
    __method_bind.areaAttachObjectInstanceId.call(this._handle, _args)
  }

  fun areaClearShapes(area: RID) {
    val _arg = Variant.new(area)
    __method_bind.areaClearShapes.call(this._handle, listOf(_arg))
  }

  fun areaCreate(): RID {
    val _ret = __method_bind.areaCreate.call(this._handle)
    return _ret.asRID()
  }

  fun areaGetObjectInstanceId(area: RID): Int {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaGetObjectInstanceId.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun areaGetParam(area: RID, param: Int): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(param))
    val _ret = __method_bind.areaGetParam.call(this._handle, _args)
    return _ret
  }

  fun areaGetShape(area: RID, shapeIdx: Int): RID {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(shapeIdx))
    val _ret = __method_bind.areaGetShape.call(this._handle, _args)
    return _ret.asRID()
  }

  fun areaGetShapeCount(area: RID): Int {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaGetShapeCount.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun areaGetShapeTransform(area: RID, shapeIdx: Int): Transform {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(shapeIdx))
    val _ret = __method_bind.areaGetShapeTransform.call(this._handle, _args)
    return _ret.asTransform()
  }

  fun areaGetSpace(area: RID): RID {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaGetSpace.call(this._handle, listOf(_arg))
    return _ret.asRID()
  }

  fun areaGetSpaceOverrideMode(area: RID): AreaSpaceOverrideMode {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaGetSpaceOverrideMode.call(this._handle, listOf(_arg))
    return PhysicsServer.AreaSpaceOverrideMode.from(_ret.asInt())
  }

  fun areaGetTransform(area: RID): Transform {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaGetTransform.call(this._handle, listOf(_arg))
    return _ret.asTransform()
  }

  fun areaIsRayPickable(area: RID): Boolean {
    val _arg = Variant.new(area)
    val _ret = __method_bind.areaIsRayPickable.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun areaRemoveShape(area: RID, shapeIdx: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(shapeIdx))
    __method_bind.areaRemoveShape.call(this._handle, _args)
  }

  fun areaSetAreaMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(receiver))
    _args.add(Variant.fromAny(method))
    __method_bind.areaSetAreaMonitorCallback.call(this._handle, _args)
  }

  fun areaSetCollisionLayer(area: RID, layer: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(layer))
    __method_bind.areaSetCollisionLayer.call(this._handle, _args)
  }

  fun areaSetCollisionMask(area: RID, mask: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(mask))
    __method_bind.areaSetCollisionMask.call(this._handle, _args)
  }

  fun areaSetMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(receiver))
    _args.add(Variant.fromAny(method))
    __method_bind.areaSetMonitorCallback.call(this._handle, _args)
  }

  fun areaSetMonitorable(area: RID, monitorable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(monitorable))
    __method_bind.areaSetMonitorable.call(this._handle, _args)
  }

  fun areaSetParam(
    area: RID,
    param: Int,
    value: Variant
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.areaSetParam.call(this._handle, _args)
  }

  fun areaSetRayPickable(area: RID, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(enable))
    __method_bind.areaSetRayPickable.call(this._handle, _args)
  }

  fun areaSetShape(
    area: RID,
    shapeIdx: Int,
    shape: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(shapeIdx))
    _args.add(Variant.fromAny(shape))
    __method_bind.areaSetShape.call(this._handle, _args)
  }

  fun areaSetShapeDisabled(
    area: RID,
    shapeIdx: Int,
    disabled: Boolean
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(shapeIdx))
    _args.add(Variant.fromAny(disabled))
    __method_bind.areaSetShapeDisabled.call(this._handle, _args)
  }

  fun areaSetShapeTransform(
    area: RID,
    shapeIdx: Int,
    transform: Transform
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(shapeIdx))
    _args.add(Variant.fromAny(transform))
    __method_bind.areaSetShapeTransform.call(this._handle, _args)
  }

  fun areaSetSpace(area: RID, space: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(space))
    __method_bind.areaSetSpace.call(this._handle, _args)
  }

  fun areaSetSpaceOverrideMode(area: RID, mode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(mode))
    __method_bind.areaSetSpaceOverrideMode.call(this._handle, _args)
  }

  fun areaSetTransform(area: RID, transform: Transform) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(area))
    _args.add(Variant.fromAny(transform))
    __method_bind.areaSetTransform.call(this._handle, _args)
  }

  fun bodyAddCentralForce(body: RID, force: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(force))
    __method_bind.bodyAddCentralForce.call(this._handle, _args)
  }

  fun bodyAddCollisionException(body: RID, exceptedBody: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(exceptedBody))
    __method_bind.bodyAddCollisionException.call(this._handle, _args)
  }

  fun bodyAddForce(
    body: RID,
    force: Vector3,
    position: Vector3
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(force))
    _args.add(Variant.fromAny(position))
    __method_bind.bodyAddForce.call(this._handle, _args)
  }

  fun bodyAddShape(
    body: RID,
    shape: RID,
    transform: Transform,
    disabled: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(shape))
    _args.add(Variant.fromAny(transform))
    _args.add(Variant.fromAny(disabled))
    __method_bind.bodyAddShape.call(this._handle, _args)
  }

  fun bodyAddTorque(body: RID, torque: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(torque))
    __method_bind.bodyAddTorque.call(this._handle, _args)
  }

  fun bodyApplyCentralImpulse(body: RID, impulse: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(impulse))
    __method_bind.bodyApplyCentralImpulse.call(this._handle, _args)
  }

  fun bodyApplyImpulse(
    body: RID,
    position: Vector3,
    impulse: Vector3
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(impulse))
    __method_bind.bodyApplyImpulse.call(this._handle, _args)
  }

  fun bodyApplyTorqueImpulse(body: RID, impulse: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(impulse))
    __method_bind.bodyApplyTorqueImpulse.call(this._handle, _args)
  }

  fun bodyAttachObjectInstanceId(body: RID, id: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(id))
    __method_bind.bodyAttachObjectInstanceId.call(this._handle, _args)
  }

  fun bodyClearShapes(body: RID) {
    val _arg = Variant.new(body)
    __method_bind.bodyClearShapes.call(this._handle, listOf(_arg))
  }

  fun bodyCreate(mode: Int = 2, initSleeping: Boolean = false): RID {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mode))
    _args.add(Variant.fromAny(initSleeping))
    val _ret = __method_bind.bodyCreate.call(this._handle, _args)
    return _ret.asRID()
  }

  fun bodyGetCollisionLayer(body: RID): Int {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetCollisionLayer.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun bodyGetCollisionMask(body: RID): Int {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetCollisionMask.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun bodyGetDirectState(body: RID): PhysicsDirectBodyState {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetDirectState.call(this._handle, listOf(_arg))
    return _ret.asObject(::PhysicsDirectBodyState)!!
  }

  fun bodyGetKinematicSafeMargin(body: RID): Float {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetKinematicSafeMargin.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun bodyGetMaxContactsReported(body: RID): Int {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetMaxContactsReported.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun bodyGetMode(body: RID): BodyMode {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetMode.call(this._handle, listOf(_arg))
    return PhysicsServer.BodyMode.from(_ret.asInt())
  }

  fun bodyGetObjectInstanceId(body: RID): Int {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetObjectInstanceId.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun bodyGetParam(body: RID, param: Int): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(param))
    val _ret = __method_bind.bodyGetParam.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun bodyGetShape(body: RID, shapeIdx: Int): RID {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(shapeIdx))
    val _ret = __method_bind.bodyGetShape.call(this._handle, _args)
    return _ret.asRID()
  }

  fun bodyGetShapeCount(body: RID): Int {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetShapeCount.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun bodyGetShapeTransform(body: RID, shapeIdx: Int): Transform {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(shapeIdx))
    val _ret = __method_bind.bodyGetShapeTransform.call(this._handle, _args)
    return _ret.asTransform()
  }

  fun bodyGetSpace(body: RID): RID {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyGetSpace.call(this._handle, listOf(_arg))
    return _ret.asRID()
  }

  fun bodyGetState(body: RID, state: Int): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(state))
    val _ret = __method_bind.bodyGetState.call(this._handle, _args)
    return _ret
  }

  fun bodyIsAxisLocked(body: RID, axis: Int): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(axis))
    val _ret = __method_bind.bodyIsAxisLocked.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun bodyIsContinuousCollisionDetectionEnabled(body: RID): Boolean {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyIsContinuousCollisionDetectionEnabled.call(this._handle,
        listOf(_arg))
    return _ret.asBoolean()
  }

  fun bodyIsOmittingForceIntegration(body: RID): Boolean {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyIsOmittingForceIntegration.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun bodyIsRayPickable(body: RID): Boolean {
    val _arg = Variant.new(body)
    val _ret = __method_bind.bodyIsRayPickable.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun bodyRemoveCollisionException(body: RID, exceptedBody: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(exceptedBody))
    __method_bind.bodyRemoveCollisionException.call(this._handle, _args)
  }

  fun bodyRemoveShape(body: RID, shapeIdx: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(shapeIdx))
    __method_bind.bodyRemoveShape.call(this._handle, _args)
  }

  fun bodySetAxisLock(
    body: RID,
    axis: Int,
    lock: Boolean
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(axis))
    _args.add(Variant.fromAny(lock))
    __method_bind.bodySetAxisLock.call(this._handle, _args)
  }

  fun bodySetAxisVelocity(body: RID, axisVelocity: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(axisVelocity))
    __method_bind.bodySetAxisVelocity.call(this._handle, _args)
  }

  fun bodySetCollisionLayer(body: RID, layer: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(layer))
    __method_bind.bodySetCollisionLayer.call(this._handle, _args)
  }

  fun bodySetCollisionMask(body: RID, mask: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(mask))
    __method_bind.bodySetCollisionMask.call(this._handle, _args)
  }

  fun bodySetEnableContinuousCollisionDetection(body: RID, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(enable))
    __method_bind.bodySetEnableContinuousCollisionDetection.call(this._handle, _args)
  }

  fun bodySetForceIntegrationCallback(
    body: RID,
    receiver: Object,
    method: String,
    userdata: Variant
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(receiver))
    _args.add(Variant.fromAny(method))
    _args.add(Variant.fromAny(userdata))
    __method_bind.bodySetForceIntegrationCallback.call(this._handle, _args)
  }

  fun bodySetKinematicSafeMargin(body: RID, margin: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(margin))
    __method_bind.bodySetKinematicSafeMargin.call(this._handle, _args)
  }

  fun bodySetMaxContactsReported(body: RID, amount: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(amount))
    __method_bind.bodySetMaxContactsReported.call(this._handle, _args)
  }

  fun bodySetMode(body: RID, mode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(mode))
    __method_bind.bodySetMode.call(this._handle, _args)
  }

  fun bodySetOmitForceIntegration(body: RID, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(enable))
    __method_bind.bodySetOmitForceIntegration.call(this._handle, _args)
  }

  fun bodySetParam(
    body: RID,
    param: Int,
    value: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.bodySetParam.call(this._handle, _args)
  }

  fun bodySetRayPickable(body: RID, enable: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(enable))
    __method_bind.bodySetRayPickable.call(this._handle, _args)
  }

  fun bodySetShape(
    body: RID,
    shapeIdx: Int,
    shape: RID
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(shapeIdx))
    _args.add(Variant.fromAny(shape))
    __method_bind.bodySetShape.call(this._handle, _args)
  }

  fun bodySetShapeDisabled(
    body: RID,
    shapeIdx: Int,
    disabled: Boolean
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(shapeIdx))
    _args.add(Variant.fromAny(disabled))
    __method_bind.bodySetShapeDisabled.call(this._handle, _args)
  }

  fun bodySetShapeTransform(
    body: RID,
    shapeIdx: Int,
    transform: Transform
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(shapeIdx))
    _args.add(Variant.fromAny(transform))
    __method_bind.bodySetShapeTransform.call(this._handle, _args)
  }

  fun bodySetSpace(body: RID, space: RID) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(space))
    __method_bind.bodySetSpace.call(this._handle, _args)
  }

  fun bodySetState(
    body: RID,
    state: Int,
    value: Variant
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(body))
    _args.add(Variant.fromAny(state))
    _args.add(Variant.fromAny(value))
    __method_bind.bodySetState.call(this._handle, _args)
  }

  fun coneTwistJointGetParam(joint: RID, param: Int): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(param))
    val _ret = __method_bind.coneTwistJointGetParam.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun coneTwistJointSetParam(
    joint: RID,
    param: Int,
    value: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.coneTwistJointSetParam.call(this._handle, _args)
  }

  fun freeRid(rid: RID) {
    val _arg = Variant.new(rid)
    __method_bind.freeRid.call(this._handle, listOf(_arg))
  }

  fun generic6dofJointGetFlag(
    joint: RID,
    axis: Int,
    flag: Int
  ): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(axis))
    _args.add(Variant.fromAny(flag))
    val _ret = __method_bind.generic6dofJointGetFlag.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun generic6dofJointGetParam(
    joint: RID,
    axis: Int,
    param: Int
  ): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(axis))
    _args.add(Variant.fromAny(param))
    val _ret = __method_bind.generic6dofJointGetParam.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun generic6dofJointSetFlag(
    joint: RID,
    axis: Int,
    flag: Int,
    enable: Boolean
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(axis))
    _args.add(Variant.fromAny(flag))
    _args.add(Variant.fromAny(enable))
    __method_bind.generic6dofJointSetFlag.call(this._handle, _args)
  }

  fun generic6dofJointSetParam(
    joint: RID,
    axis: Int,
    param: Int,
    value: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(axis))
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.generic6dofJointSetParam.call(this._handle, _args)
  }

  fun getProcessInfo(processInfo: Int): Int {
    val _arg = Variant.new(processInfo)
    val _ret = __method_bind.getProcessInfo.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun hingeJointGetFlag(joint: RID, flag: Int): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(flag))
    val _ret = __method_bind.hingeJointGetFlag.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun hingeJointGetParam(joint: RID, param: Int): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(param))
    val _ret = __method_bind.hingeJointGetParam.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun hingeJointSetFlag(
    joint: RID,
    flag: Int,
    enabled: Boolean
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(flag))
    _args.add(Variant.fromAny(enabled))
    __method_bind.hingeJointSetFlag.call(this._handle, _args)
  }

  fun hingeJointSetParam(
    joint: RID,
    param: Int,
    value: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.hingeJointSetParam.call(this._handle, _args)
  }

  fun jointCreateConeTwist(
    bodyA: RID,
    localRefA: Transform,
    bodyB: RID,
    localRefB: Transform
  ): RID {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bodyA))
    _args.add(Variant.fromAny(localRefA))
    _args.add(Variant.fromAny(bodyB))
    _args.add(Variant.fromAny(localRefB))
    val _ret = __method_bind.jointCreateConeTwist.call(this._handle, _args)
    return _ret.asRID()
  }

  fun jointCreateGeneric6dof(
    bodyA: RID,
    localRefA: Transform,
    bodyB: RID,
    localRefB: Transform
  ): RID {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bodyA))
    _args.add(Variant.fromAny(localRefA))
    _args.add(Variant.fromAny(bodyB))
    _args.add(Variant.fromAny(localRefB))
    val _ret = __method_bind.jointCreateGeneric6dof.call(this._handle, _args)
    return _ret.asRID()
  }

  fun jointCreateHinge(
    bodyA: RID,
    hingeA: Transform,
    bodyB: RID,
    hingeB: Transform
  ): RID {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bodyA))
    _args.add(Variant.fromAny(hingeA))
    _args.add(Variant.fromAny(bodyB))
    _args.add(Variant.fromAny(hingeB))
    val _ret = __method_bind.jointCreateHinge.call(this._handle, _args)
    return _ret.asRID()
  }

  fun jointCreatePin(
    bodyA: RID,
    localA: Vector3,
    bodyB: RID,
    localB: Vector3
  ): RID {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bodyA))
    _args.add(Variant.fromAny(localA))
    _args.add(Variant.fromAny(bodyB))
    _args.add(Variant.fromAny(localB))
    val _ret = __method_bind.jointCreatePin.call(this._handle, _args)
    return _ret.asRID()
  }

  fun jointCreateSlider(
    bodyA: RID,
    localRefA: Transform,
    bodyB: RID,
    localRefB: Transform
  ): RID {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(bodyA))
    _args.add(Variant.fromAny(localRefA))
    _args.add(Variant.fromAny(bodyB))
    _args.add(Variant.fromAny(localRefB))
    val _ret = __method_bind.jointCreateSlider.call(this._handle, _args)
    return _ret.asRID()
  }

  fun jointGetSolverPriority(joint: RID): Int {
    val _arg = Variant.new(joint)
    val _ret = __method_bind.jointGetSolverPriority.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun jointGetType(joint: RID): JointType {
    val _arg = Variant.new(joint)
    val _ret = __method_bind.jointGetType.call(this._handle, listOf(_arg))
    return PhysicsServer.JointType.from(_ret.asInt())
  }

  fun jointSetSolverPriority(joint: RID, priority: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(priority))
    __method_bind.jointSetSolverPriority.call(this._handle, _args)
  }

  fun pinJointGetLocalA(joint: RID): Vector3 {
    val _arg = Variant.new(joint)
    val _ret = __method_bind.pinJointGetLocalA.call(this._handle, listOf(_arg))
    return _ret.asVector3()
  }

  fun pinJointGetLocalB(joint: RID): Vector3 {
    val _arg = Variant.new(joint)
    val _ret = __method_bind.pinJointGetLocalB.call(this._handle, listOf(_arg))
    return _ret.asVector3()
  }

  fun pinJointGetParam(joint: RID, param: Int): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(param))
    val _ret = __method_bind.pinJointGetParam.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun pinJointSetLocalA(joint: RID, localA: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(localA))
    __method_bind.pinJointSetLocalA.call(this._handle, _args)
  }

  fun pinJointSetLocalB(joint: RID, localB: Vector3) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(localB))
    __method_bind.pinJointSetLocalB.call(this._handle, _args)
  }

  fun pinJointSetParam(
    joint: RID,
    param: Int,
    value: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.pinJointSetParam.call(this._handle, _args)
  }

  fun setActive(active: Boolean) {
    val _arg = Variant.new(active)
    __method_bind.setActive.call(this._handle, listOf(_arg))
  }

  fun shapeCreate(type: Int): RID {
    val _arg = Variant.new(type)
    val _ret = __method_bind.shapeCreate.call(this._handle, listOf(_arg))
    return _ret.asRID()
  }

  fun shapeGetData(shape: RID): Variant {
    val _arg = Variant.new(shape)
    val _ret = __method_bind.shapeGetData.call(this._handle, listOf(_arg))
    return _ret
  }

  fun shapeGetType(shape: RID): ShapeType {
    val _arg = Variant.new(shape)
    val _ret = __method_bind.shapeGetType.call(this._handle, listOf(_arg))
    return PhysicsServer.ShapeType.from(_ret.asInt())
  }

  fun shapeSetData(shape: RID, data: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(shape))
    _args.add(Variant.fromAny(data))
    __method_bind.shapeSetData.call(this._handle, _args)
  }

  fun sliderJointGetParam(joint: RID, param: Int): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(param))
    val _ret = __method_bind.sliderJointGetParam.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun sliderJointSetParam(
    joint: RID,
    param: Int,
    value: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(joint))
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.sliderJointSetParam.call(this._handle, _args)
  }

  fun spaceCreate(): RID {
    val _ret = __method_bind.spaceCreate.call(this._handle)
    return _ret.asRID()
  }

  fun spaceGetDirectState(space: RID): PhysicsDirectSpaceState {
    val _arg = Variant.new(space)
    val _ret = __method_bind.spaceGetDirectState.call(this._handle, listOf(_arg))
    return _ret.asObject(::PhysicsDirectSpaceState)!!
  }

  fun spaceGetParam(space: RID, param: Int): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(space))
    _args.add(Variant.fromAny(param))
    val _ret = __method_bind.spaceGetParam.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun spaceIsActive(space: RID): Boolean {
    val _arg = Variant.new(space)
    val _ret = __method_bind.spaceIsActive.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun spaceSetActive(space: RID, active: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(space))
    _args.add(Variant.fromAny(active))
    __method_bind.spaceSetActive.call(this._handle, _args)
  }

  fun spaceSetParam(
    space: RID,
    param: Int,
    value: Float
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(space))
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.spaceSetParam.call(this._handle, _args)
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
            "area_add_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_add_shape" }
        }
      val areaAttachObjectInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_attach_object_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_attach_object_instance_id" }
        }
      val areaClearShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_clear_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_clear_shapes" }
        }
      val areaCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_create" }
        }
      val areaGetObjectInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_get_object_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_object_instance_id" }
        }
      val areaGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_param" }
        }
      val areaGetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_shape" }
        }
      val areaGetShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_get_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_shape_count" }
        }
      val areaGetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_get_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_shape_transform" }
        }
      val areaGetSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_get_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_space" }
        }
      val areaGetSpaceOverrideMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_get_space_override_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_space_override_mode" }
        }
      val areaGetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_transform" }
        }
      val areaIsRayPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_is_ray_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_is_ray_pickable" }
        }
      val areaRemoveShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_remove_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_remove_shape" }
        }
      val areaSetAreaMonitorCallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_set_area_monitor_callback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_area_monitor_callback" }
        }
      val areaSetCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_collision_layer" }
        }
      val areaSetCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_collision_mask" }
        }
      val areaSetMonitorCallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_set_monitor_callback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_monitor_callback" }
        }
      val areaSetMonitorable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_set_monitorable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_monitorable" }
        }
      val areaSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_param" }
        }
      val areaSetRayPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_set_ray_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_ray_pickable" }
        }
      val areaSetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_shape" }
        }
      val areaSetShapeDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_set_shape_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_shape_disabled" }
        }
      val areaSetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_set_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_shape_transform" }
        }
      val areaSetSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_set_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_space" }
        }
      val areaSetSpaceOverrideMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_set_space_override_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_space_override_mode" }
        }
      val areaSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "area_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_transform" }
        }
      val bodyAddCentralForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_add_central_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_add_central_force" }
        }
      val bodyAddCollisionException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_add_collision_exception".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_add_collision_exception" }
        }
      val bodyAddForce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_add_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_add_force" }
        }
      val bodyAddShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_add_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_add_shape" }
        }
      val bodyAddTorque: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_add_torque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_add_torque" }
        }
      val bodyApplyCentralImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_apply_central_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_apply_central_impulse" }
        }
      val bodyApplyImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_apply_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_apply_impulse" }
        }
      val bodyApplyTorqueImpulse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_apply_torque_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_apply_torque_impulse" }
        }
      val bodyAttachObjectInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_attach_object_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_attach_object_instance_id" }
        }
      val bodyClearShapes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_clear_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_clear_shapes" }
        }
      val bodyCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_create" }
        }
      val bodyGetCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_collision_layer" }
        }
      val bodyGetCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_collision_mask" }
        }
      val bodyGetDirectState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_get_direct_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_direct_state" }
        }
      val bodyGetKinematicSafeMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_get_kinematic_safe_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_kinematic_safe_margin" }
        }
      val bodyGetMaxContactsReported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_get_max_contacts_reported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_max_contacts_reported" }
        }
      val bodyGetMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_mode" }
        }
      val bodyGetObjectInstanceId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_get_object_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_object_instance_id" }
        }
      val bodyGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_param" }
        }
      val bodyGetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_shape" }
        }
      val bodyGetShapeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_get_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_shape_count" }
        }
      val bodyGetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_get_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_shape_transform" }
        }
      val bodyGetSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_get_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_space" }
        }
      val bodyGetState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_get_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_state" }
        }
      val bodyIsAxisLocked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_is_axis_locked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_is_axis_locked" }
        }
      val bodyIsContinuousCollisionDetectionEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_is_continuous_collision_detection_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method body_is_continuous_collision_detection_enabled" }
        }
      val bodyIsOmittingForceIntegration: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_is_omitting_force_integration".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_is_omitting_force_integration"
            }
        }
      val bodyIsRayPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_is_ray_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_is_ray_pickable" }
        }
      val bodyRemoveCollisionException: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_remove_collision_exception".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_remove_collision_exception" }
        }
      val bodyRemoveShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_remove_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_remove_shape" }
        }
      val bodySetAxisLock: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_axis_lock".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_axis_lock" }
        }
      val bodySetAxisVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_axis_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_axis_velocity" }
        }
      val bodySetCollisionLayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_collision_layer" }
        }
      val bodySetCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_collision_mask" }
        }
      val bodySetEnableContinuousCollisionDetection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_enable_continuous_collision_detection".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method body_set_enable_continuous_collision_detection" }
        }
      val bodySetForceIntegrationCallback: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_force_integration_callback".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method body_set_force_integration_callback" }
        }
      val bodySetKinematicSafeMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_kinematic_safe_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_kinematic_safe_margin" }
        }
      val bodySetMaxContactsReported: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_max_contacts_reported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_max_contacts_reported" }
        }
      val bodySetMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_mode" }
        }
      val bodySetOmitForceIntegration: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_omit_force_integration".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_omit_force_integration" }
        }
      val bodySetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_param" }
        }
      val bodySetRayPickable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_ray_pickable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_ray_pickable" }
        }
      val bodySetShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_shape" }
        }
      val bodySetShapeDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_shape_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_shape_disabled" }
        }
      val bodySetShapeTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_shape_transform" }
        }
      val bodySetSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_space" }
        }
      val bodySetState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "body_set_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_state" }
        }
      val coneTwistJointGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "cone_twist_joint_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cone_twist_joint_get_param" }
        }
      val coneTwistJointSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "cone_twist_joint_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cone_twist_joint_set_param" }
        }
      val freeRid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "free_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method free_rid" }
        }
      val generic6dofJointGetFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "generic_6dof_joint_get_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generic_6dof_joint_get_flag" }
        }
      val generic6dofJointGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "generic_6dof_joint_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generic_6dof_joint_get_param" }
        }
      val generic6dofJointSetFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "generic_6dof_joint_set_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generic_6dof_joint_set_flag" }
        }
      val generic6dofJointSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "generic_6dof_joint_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method generic_6dof_joint_set_param" }
        }
      val getProcessInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "get_process_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_info" }
        }
      val hingeJointGetFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "hinge_joint_get_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hinge_joint_get_flag" }
        }
      val hingeJointGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "hinge_joint_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hinge_joint_get_param" }
        }
      val hingeJointSetFlag: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "hinge_joint_set_flag".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hinge_joint_set_flag" }
        }
      val hingeJointSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "hinge_joint_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hinge_joint_set_param" }
        }
      val jointCreateConeTwist: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "joint_create_cone_twist".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method joint_create_cone_twist" }
        }
      val jointCreateGeneric6dof: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "joint_create_generic_6dof".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method joint_create_generic_6dof" }
        }
      val jointCreateHinge: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "joint_create_hinge".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method joint_create_hinge" }
        }
      val jointCreatePin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "joint_create_pin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method joint_create_pin" }
        }
      val jointCreateSlider: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "joint_create_slider".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method joint_create_slider" }
        }
      val jointGetSolverPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "joint_get_solver_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method joint_get_solver_priority" }
        }
      val jointGetType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "joint_get_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method joint_get_type" }
        }
      val jointSetSolverPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "joint_set_solver_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method joint_set_solver_priority" }
        }
      val pinJointGetLocalA: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "pin_joint_get_local_a".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pin_joint_get_local_a" }
        }
      val pinJointGetLocalB: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "pin_joint_get_local_b".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pin_joint_get_local_b" }
        }
      val pinJointGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "pin_joint_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pin_joint_get_param" }
        }
      val pinJointSetLocalA: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "pin_joint_set_local_a".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pin_joint_set_local_a" }
        }
      val pinJointSetLocalB: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "pin_joint_set_local_b".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pin_joint_set_local_b" }
        }
      val pinJointSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "pin_joint_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pin_joint_set_param" }
        }
      val setActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "set_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_active" }
        }
      val shapeCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_create" }
        }
      val shapeGetData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "shape_get_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_get_data" }
        }
      val shapeGetType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "shape_get_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_get_type" }
        }
      val shapeSetData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "shape_set_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_set_data" }
        }
      val sliderJointGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "slider_joint_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method slider_joint_get_param" }
        }
      val sliderJointSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "slider_joint_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method slider_joint_set_param" }
        }
      val spaceCreate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "space_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_create" }
        }
      val spaceGetDirectState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "space_get_direct_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_get_direct_state" }
        }
      val spaceGetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "space_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_get_param" }
        }
      val spaceIsActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "space_is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_is_active" }
        }
      val spaceSetActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "space_set_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_set_active" }
        }
      val spaceSetParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsServer".cstr.ptr,
            "space_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_set_param" }
        }}
  }
}
