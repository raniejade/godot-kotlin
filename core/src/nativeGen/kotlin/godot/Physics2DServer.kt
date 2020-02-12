// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class Physics2DServerInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun areaAddShape(
    area: RID,
    shape: RID,
    transform: Transform2D = Transform2D(Vector2(1, 0), Vector2(0, 1), Vector2(0, 0)),
    disabled: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(shape)
      _args.add(transform)
      _args.add(disabled)
      __method_bind.areaAddShape.call(self._handle, _args, null)
    }
  }

  fun areaAttachCanvasInstanceId(area: RID, id: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(id)
      __method_bind.areaAttachCanvasInstanceId.call(self._handle, _args, null)
    }
  }

  fun areaAttachObjectInstanceId(area: RID, id: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(id)
      __method_bind.areaAttachObjectInstanceId.call(self._handle, _args, null)
    }
  }

  fun areaClearShapes(area: RID) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.areaClearShapes.call(self._handle, listOf(area), null)
    }
  }

  fun areaCreate(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.areaCreate.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun areaGetCanvasInstanceId(area: RID): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.areaGetCanvasInstanceId.call(self._handle, listOf(area), _retPtr)
      _ret.value
    }
  }

  fun areaGetObjectInstanceId(area: RID): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.areaGetObjectInstanceId.call(self._handle, listOf(area), _retPtr)
      _ret.value
    }
  }

  fun areaGetParam(area: RID, param: Int): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(param)
      __method_bind.areaGetParam.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun areaGetShape(area: RID, shapeIdx: Int): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(shapeIdx)
      __method_bind.areaGetShape.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun areaGetShapeCount(area: RID): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.areaGetShapeCount.call(self._handle, listOf(area), _retPtr)
      _ret.value
    }
  }

  fun areaGetShapeTransform(area: RID, shapeIdx: Int): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(shapeIdx)
      __method_bind.areaGetShapeTransform.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun areaGetSpace(area: RID): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.areaGetSpace.call(self._handle, listOf(area), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun areaGetSpaceOverrideMode(area: RID): Physics2DServer.AreaSpaceOverrideMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.areaGetSpaceOverrideMode.call(self._handle, listOf(area), _retPtr)
      Physics2DServer.AreaSpaceOverrideMode.from(_ret.value)
    }
  }

  fun areaGetTransform(area: RID): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.areaGetTransform.call(self._handle, listOf(area), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun areaRemoveShape(area: RID, shapeIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(shapeIdx)
      __method_bind.areaRemoveShape.call(self._handle, _args, null)
    }
  }

  fun areaSetAreaMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(receiver)
      _args.add(method)
      __method_bind.areaSetAreaMonitorCallback.call(self._handle, _args, null)
    }
  }

  fun areaSetCollisionLayer(area: RID, layer: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(layer)
      __method_bind.areaSetCollisionLayer.call(self._handle, _args, null)
    }
  }

  fun areaSetCollisionMask(area: RID, mask: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(mask)
      __method_bind.areaSetCollisionMask.call(self._handle, _args, null)
    }
  }

  fun areaSetMonitorCallback(
    area: RID,
    receiver: Object,
    method: String
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(receiver)
      _args.add(method)
      __method_bind.areaSetMonitorCallback.call(self._handle, _args, null)
    }
  }

  fun areaSetMonitorable(area: RID, monitorable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(monitorable)
      __method_bind.areaSetMonitorable.call(self._handle, _args, null)
    }
  }

  fun areaSetParam(
    area: RID,
    param: Int,
    value: Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(param)
      _args.add(value)
      __method_bind.areaSetParam.call(self._handle, _args, null)
    }
  }

  fun areaSetShape(
    area: RID,
    shapeIdx: Int,
    shape: RID
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(shapeIdx)
      _args.add(shape)
      __method_bind.areaSetShape.call(self._handle, _args, null)
    }
  }

  fun areaSetShapeDisabled(
    area: RID,
    shapeIdx: Int,
    disabled: Boolean
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(shapeIdx)
      _args.add(disabled)
      __method_bind.areaSetShapeDisabled.call(self._handle, _args, null)
    }
  }

  fun areaSetShapeTransform(
    area: RID,
    shapeIdx: Int,
    transform: Transform2D
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(shapeIdx)
      _args.add(transform)
      __method_bind.areaSetShapeTransform.call(self._handle, _args, null)
    }
  }

  fun areaSetSpace(area: RID, space: RID) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(space)
      __method_bind.areaSetSpace.call(self._handle, _args, null)
    }
  }

  fun areaSetSpaceOverrideMode(area: RID, mode: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(mode)
      __method_bind.areaSetSpaceOverrideMode.call(self._handle, _args, null)
    }
  }

  fun areaSetTransform(area: RID, transform: Transform2D) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(area)
      _args.add(transform)
      __method_bind.areaSetTransform.call(self._handle, _args, null)
    }
  }

  fun bodyAddCentralForce(body: RID, force: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(force)
      __method_bind.bodyAddCentralForce.call(self._handle, _args, null)
    }
  }

  fun bodyAddCollisionException(body: RID, exceptedBody: RID) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(exceptedBody)
      __method_bind.bodyAddCollisionException.call(self._handle, _args, null)
    }
  }

  fun bodyAddForce(
    body: RID,
    offset: Vector2,
    force: Vector2
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(offset)
      _args.add(force)
      __method_bind.bodyAddForce.call(self._handle, _args, null)
    }
  }

  fun bodyAddShape(
    body: RID,
    shape: RID,
    transform: Transform2D = Transform2D(Vector2(1, 0), Vector2(0, 1), Vector2(0, 0)),
    disabled: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(shape)
      _args.add(transform)
      _args.add(disabled)
      __method_bind.bodyAddShape.call(self._handle, _args, null)
    }
  }

  fun bodyAddTorque(body: RID, torque: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(torque)
      __method_bind.bodyAddTorque.call(self._handle, _args, null)
    }
  }

  fun bodyApplyCentralImpulse(body: RID, impulse: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(impulse)
      __method_bind.bodyApplyCentralImpulse.call(self._handle, _args, null)
    }
  }

  fun bodyApplyImpulse(
    body: RID,
    position: Vector2,
    impulse: Vector2
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(position)
      _args.add(impulse)
      __method_bind.bodyApplyImpulse.call(self._handle, _args, null)
    }
  }

  fun bodyApplyTorqueImpulse(body: RID, impulse: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(impulse)
      __method_bind.bodyApplyTorqueImpulse.call(self._handle, _args, null)
    }
  }

  fun bodyAttachCanvasInstanceId(body: RID, id: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(id)
      __method_bind.bodyAttachCanvasInstanceId.call(self._handle, _args, null)
    }
  }

  fun bodyAttachObjectInstanceId(body: RID, id: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(id)
      __method_bind.bodyAttachObjectInstanceId.call(self._handle, _args, null)
    }
  }

  fun bodyClearShapes(body: RID) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.bodyClearShapes.call(self._handle, listOf(body), null)
    }
  }

  fun bodyCreate(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.bodyCreate.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun bodyGetCanvasInstanceId(body: RID): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.bodyGetCanvasInstanceId.call(self._handle, listOf(body), _retPtr)
      _ret.value
    }
  }

  fun bodyGetCollisionLayer(body: RID): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.bodyGetCollisionLayer.call(self._handle, listOf(body), _retPtr)
      _ret.value
    }
  }

  fun bodyGetCollisionMask(body: RID): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.bodyGetCollisionMask.call(self._handle, listOf(body), _retPtr)
      _ret.value
    }
  }

  fun bodyGetContinuousCollisionDetectionMode(body: RID): Physics2DServer.CCDMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.bodyGetContinuousCollisionDetectionMode.call(self._handle, listOf(body),
          _retPtr)
      Physics2DServer.CCDMode.from(_ret.value)
    }
  }

  fun bodyGetDirectState(body: RID): Physics2DDirectBodyState {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Physics2DDirectBodyState
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.bodyGetDirectState.call(self._handle, listOf(body), _retPtr)
      _ret = objectToType<Physics2DDirectBodyState>(_tmp.value!!)
      _ret
    }
  }

  fun bodyGetMaxContactsReported(body: RID): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.bodyGetMaxContactsReported.call(self._handle, listOf(body), _retPtr)
      _ret.value
    }
  }

  fun bodyGetMode(body: RID): Physics2DServer.BodyMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.bodyGetMode.call(self._handle, listOf(body), _retPtr)
      Physics2DServer.BodyMode.from(_ret.value)
    }
  }

  fun bodyGetObjectInstanceId(body: RID): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.bodyGetObjectInstanceId.call(self._handle, listOf(body), _retPtr)
      _ret.value
    }
  }

  fun bodyGetParam(body: RID, param: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(param)
      __method_bind.bodyGetParam.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun bodyGetShape(body: RID, shapeIdx: Int): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(shapeIdx)
      __method_bind.bodyGetShape.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun bodyGetShapeCount(body: RID): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.bodyGetShapeCount.call(self._handle, listOf(body), _retPtr)
      _ret.value
    }
  }

  fun bodyGetShapeMetadata(body: RID, shapeIdx: Int): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(shapeIdx)
      __method_bind.bodyGetShapeMetadata.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun bodyGetShapeTransform(body: RID, shapeIdx: Int): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(shapeIdx)
      __method_bind.bodyGetShapeTransform.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun bodyGetSpace(body: RID): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.bodyGetSpace.call(self._handle, listOf(body), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun bodyGetState(body: RID, state: Int): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(state)
      __method_bind.bodyGetState.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun bodyIsOmittingForceIntegration(body: RID): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.bodyIsOmittingForceIntegration.call(self._handle, listOf(body), _retPtr)
      _ret.value
    }
  }

  fun bodyRemoveCollisionException(body: RID, exceptedBody: RID) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(exceptedBody)
      __method_bind.bodyRemoveCollisionException.call(self._handle, _args, null)
    }
  }

  fun bodyRemoveShape(body: RID, shapeIdx: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(shapeIdx)
      __method_bind.bodyRemoveShape.call(self._handle, _args, null)
    }
  }

  fun bodySetAxisVelocity(body: RID, axisVelocity: Vector2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(axisVelocity)
      __method_bind.bodySetAxisVelocity.call(self._handle, _args, null)
    }
  }

  fun bodySetCollisionLayer(body: RID, layer: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(layer)
      __method_bind.bodySetCollisionLayer.call(self._handle, _args, null)
    }
  }

  fun bodySetCollisionMask(body: RID, mask: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(mask)
      __method_bind.bodySetCollisionMask.call(self._handle, _args, null)
    }
  }

  fun bodySetContinuousCollisionDetectionMode(body: RID, mode: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(mode)
      __method_bind.bodySetContinuousCollisionDetectionMode.call(self._handle, _args, null)
    }
  }

  fun bodySetForceIntegrationCallback(
    body: RID,
    receiver: Object,
    method: String,
    userdata: Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(receiver)
      _args.add(method)
      _args.add(userdata)
      __method_bind.bodySetForceIntegrationCallback.call(self._handle, _args, null)
    }
  }

  fun bodySetMaxContactsReported(body: RID, amount: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(amount)
      __method_bind.bodySetMaxContactsReported.call(self._handle, _args, null)
    }
  }

  fun bodySetMode(body: RID, mode: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(mode)
      __method_bind.bodySetMode.call(self._handle, _args, null)
    }
  }

  fun bodySetOmitForceIntegration(body: RID, enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(enable)
      __method_bind.bodySetOmitForceIntegration.call(self._handle, _args, null)
    }
  }

  fun bodySetParam(
    body: RID,
    param: Int,
    value: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(param)
      _args.add(value)
      __method_bind.bodySetParam.call(self._handle, _args, null)
    }
  }

  fun bodySetShape(
    body: RID,
    shapeIdx: Int,
    shape: RID
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(shapeIdx)
      _args.add(shape)
      __method_bind.bodySetShape.call(self._handle, _args, null)
    }
  }

  fun bodySetShapeAsOneWayCollision(
    body: RID,
    shapeIdx: Int,
    enable: Boolean,
    margin: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(shapeIdx)
      _args.add(enable)
      _args.add(margin)
      __method_bind.bodySetShapeAsOneWayCollision.call(self._handle, _args, null)
    }
  }

  fun bodySetShapeDisabled(
    body: RID,
    shapeIdx: Int,
    disabled: Boolean
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(shapeIdx)
      _args.add(disabled)
      __method_bind.bodySetShapeDisabled.call(self._handle, _args, null)
    }
  }

  fun bodySetShapeMetadata(
    body: RID,
    shapeIdx: Int,
    metadata: Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(shapeIdx)
      _args.add(metadata)
      __method_bind.bodySetShapeMetadata.call(self._handle, _args, null)
    }
  }

  fun bodySetShapeTransform(
    body: RID,
    shapeIdx: Int,
    transform: Transform2D
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(shapeIdx)
      _args.add(transform)
      __method_bind.bodySetShapeTransform.call(self._handle, _args, null)
    }
  }

  fun bodySetSpace(body: RID, space: RID) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(space)
      __method_bind.bodySetSpace.call(self._handle, _args, null)
    }
  }

  fun bodySetState(
    body: RID,
    state: Int,
    value: Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(state)
      _args.add(value)
      __method_bind.bodySetState.call(self._handle, _args, null)
    }
  }

  fun bodyTestMotion(
    body: RID,
    from: Transform2D,
    motion: Vector2,
    infiniteInertia: Boolean,
    margin: Float = 0.08f,
    result: Physics2DTestMotionResult
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(body)
      _args.add(from)
      _args.add(motion)
      _args.add(infiniteInertia)
      _args.add(margin)
      _args.add(result)
      __method_bind.bodyTestMotion.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun capsuleShapeCreate(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.capsuleShapeCreate.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun circleShapeCreate(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.circleShapeCreate.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun concavePolygonShapeCreate(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.concavePolygonShapeCreate.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun convexPolygonShapeCreate(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.convexPolygonShapeCreate.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun dampedSpringJointCreate(
    anchorA: Vector2,
    anchorB: Vector2,
    bodyA: RID,
    bodyB: RID
  ): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(anchorA)
      _args.add(anchorB)
      _args.add(bodyA)
      _args.add(bodyB)
      __method_bind.dampedSpringJointCreate.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun dampedStringJointGetParam(joint: RID, param: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(joint)
      _args.add(param)
      __method_bind.dampedStringJointGetParam.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun dampedStringJointSetParam(
    joint: RID,
    param: Int,
    value: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(joint)
      _args.add(param)
      _args.add(value)
      __method_bind.dampedStringJointSetParam.call(self._handle, _args, null)
    }
  }

  fun freeRid(rid: RID) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.freeRid.call(self._handle, listOf(rid), null)
    }
  }

  fun getProcessInfo(processInfo: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getProcessInfo.call(self._handle, listOf(processInfo), _retPtr)
      _ret.value
    }
  }

  fun grooveJointCreate(
    groove1A: Vector2,
    groove2A: Vector2,
    anchorB: Vector2,
    bodyA: RID,
    bodyB: RID
  ): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(groove1A)
      _args.add(groove2A)
      _args.add(anchorB)
      _args.add(bodyA)
      _args.add(bodyB)
      __method_bind.grooveJointCreate.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun jointGetParam(joint: RID, param: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(joint)
      _args.add(param)
      __method_bind.jointGetParam.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun jointGetType(joint: RID): Physics2DServer.JointType {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.jointGetType.call(self._handle, listOf(joint), _retPtr)
      Physics2DServer.JointType.from(_ret.value)
    }
  }

  fun jointSetParam(
    joint: RID,
    param: Int,
    value: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(joint)
      _args.add(param)
      _args.add(value)
      __method_bind.jointSetParam.call(self._handle, _args, null)
    }
  }

  fun lineShapeCreate(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.lineShapeCreate.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun pinJointCreate(
    anchor: Vector2,
    bodyA: RID,
    bodyB: RID
  ): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(anchor)
      _args.add(bodyA)
      _args.add(bodyB)
      __method_bind.pinJointCreate.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun rayShapeCreate(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.rayShapeCreate.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun rectangleShapeCreate(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.rectangleShapeCreate.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun segmentShapeCreate(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.segmentShapeCreate.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setActive(active: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setActive.call(self._handle, listOf(active), null)
    }
  }

  fun shapeGetData(shape: RID): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.shapeGetData.call(self._handle, listOf(shape), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun shapeGetType(shape: RID): Physics2DServer.ShapeType {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.shapeGetType.call(self._handle, listOf(shape), _retPtr)
      Physics2DServer.ShapeType.from(_ret.value)
    }
  }

  fun shapeSetData(shape: RID, data: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(shape)
      _args.add(data)
      __method_bind.shapeSetData.call(self._handle, _args, null)
    }
  }

  fun spaceCreate(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.spaceCreate.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun spaceGetDirectState(space: RID): Physics2DDirectSpaceState {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Physics2DDirectSpaceState
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.spaceGetDirectState.call(self._handle, listOf(space), _retPtr)
      _ret = objectToType<Physics2DDirectSpaceState>(_tmp.value!!)
      _ret
    }
  }

  fun spaceGetParam(space: RID, param: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(space)
      _args.add(param)
      __method_bind.spaceGetParam.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun spaceIsActive(space: RID): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.spaceIsActive.call(self._handle, listOf(space), _retPtr)
      _ret.value
    }
  }

  fun spaceSetActive(space: RID, active: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(space)
      _args.add(active)
      __method_bind.spaceSetActive.call(self._handle, _args, null)
    }
  }

  fun spaceSetParam(
    space: RID,
    param: Int,
    value: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(space)
      _args.add(param)
      _args.add(value)
      __method_bind.spaceSetParam.call(self._handle, _args, null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for Physics2DServer
     */
    private object __method_bind {
      val areaAddShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_add_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_add_shape" }
        }
      val areaAttachCanvasInstanceId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_attach_canvas_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_attach_canvas_instance_id" }
        }
      val areaAttachObjectInstanceId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_attach_object_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_attach_object_instance_id" }
        }
      val areaClearShapes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_clear_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_clear_shapes" }
        }
      val areaCreate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_create" }
        }
      val areaGetCanvasInstanceId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_canvas_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_canvas_instance_id" }
        }
      val areaGetObjectInstanceId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_object_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_object_instance_id" }
        }
      val areaGetParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_param" }
        }
      val areaGetShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_shape" }
        }
      val areaGetShapeCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_shape_count" }
        }
      val areaGetShapeTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_shape_transform" }
        }
      val areaGetSpace: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_space" }
        }
      val areaGetSpaceOverrideMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_space_override_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_space_override_mode" }
        }
      val areaGetTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_get_transform" }
        }
      val areaRemoveShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_remove_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_remove_shape" }
        }
      val areaSetAreaMonitorCallback: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_area_monitor_callback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_area_monitor_callback" }
        }
      val areaSetCollisionLayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_collision_layer" }
        }
      val areaSetCollisionMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_collision_mask" }
        }
      val areaSetMonitorCallback: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_monitor_callback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_monitor_callback" }
        }
      val areaSetMonitorable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_monitorable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_monitorable" }
        }
      val areaSetParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_param" }
        }
      val areaSetShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_shape" }
        }
      val areaSetShapeDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_shape_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_shape_disabled" }
        }
      val areaSetShapeTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_shape_transform" }
        }
      val areaSetSpace: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_space" }
        }
      val areaSetSpaceOverrideMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_space_override_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_space_override_mode" }
        }
      val areaSetTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "area_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method area_set_transform" }
        }
      val bodyAddCentralForce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_add_central_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_add_central_force" }
        }
      val bodyAddCollisionException: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_add_collision_exception".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_add_collision_exception" }
        }
      val bodyAddForce: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_add_force".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_add_force" }
        }
      val bodyAddShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_add_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_add_shape" }
        }
      val bodyAddTorque: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_add_torque".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_add_torque" }
        }
      val bodyApplyCentralImpulse: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_apply_central_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_apply_central_impulse" }
        }
      val bodyApplyImpulse: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_apply_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_apply_impulse" }
        }
      val bodyApplyTorqueImpulse: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_apply_torque_impulse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_apply_torque_impulse" }
        }
      val bodyAttachCanvasInstanceId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_attach_canvas_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_attach_canvas_instance_id" }
        }
      val bodyAttachObjectInstanceId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_attach_object_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_attach_object_instance_id" }
        }
      val bodyClearShapes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_clear_shapes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_clear_shapes" }
        }
      val bodyCreate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_create" }
        }
      val bodyGetCanvasInstanceId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_canvas_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_canvas_instance_id" }
        }
      val bodyGetCollisionLayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_collision_layer" }
        }
      val bodyGetCollisionMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_collision_mask" }
        }
      val bodyGetContinuousCollisionDetectionMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_continuous_collision_detection_mode".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method body_get_continuous_collision_detection_mode" }
        }
      val bodyGetDirectState: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_direct_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_direct_state" }
        }
      val bodyGetMaxContactsReported: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_max_contacts_reported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_max_contacts_reported" }
        }
      val bodyGetMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_mode" }
        }
      val bodyGetObjectInstanceId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_object_instance_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_object_instance_id" }
        }
      val bodyGetParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_param" }
        }
      val bodyGetShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_shape" }
        }
      val bodyGetShapeCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_shape_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_shape_count" }
        }
      val bodyGetShapeMetadata: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_shape_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_shape_metadata" }
        }
      val bodyGetShapeTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_shape_transform" }
        }
      val bodyGetSpace: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_space" }
        }
      val bodyGetState: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_get_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_get_state" }
        }
      val bodyIsOmittingForceIntegration: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_is_omitting_force_integration".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_is_omitting_force_integration"
            }
        }
      val bodyRemoveCollisionException: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_remove_collision_exception".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_remove_collision_exception" }
        }
      val bodyRemoveShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_remove_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_remove_shape" }
        }
      val bodySetAxisVelocity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_axis_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_axis_velocity" }
        }
      val bodySetCollisionLayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_collision_layer" }
        }
      val bodySetCollisionMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_collision_mask" }
        }
      val bodySetContinuousCollisionDetectionMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_continuous_collision_detection_mode".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method body_set_continuous_collision_detection_mode" }
        }
      val bodySetForceIntegrationCallback: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_force_integration_callback".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method body_set_force_integration_callback" }
        }
      val bodySetMaxContactsReported: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_max_contacts_reported".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_max_contacts_reported" }
        }
      val bodySetMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_mode" }
        }
      val bodySetOmitForceIntegration: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_omit_force_integration".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_omit_force_integration" }
        }
      val bodySetParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_param" }
        }
      val bodySetShape: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_shape" }
        }
      val bodySetShapeAsOneWayCollision: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_shape_as_one_way_collision".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method body_set_shape_as_one_way_collision" }
        }
      val bodySetShapeDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_shape_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_shape_disabled" }
        }
      val bodySetShapeMetadata: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_shape_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_shape_metadata" }
        }
      val bodySetShapeTransform: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_shape_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_shape_transform" }
        }
      val bodySetSpace: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_space" }
        }
      val bodySetState: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_set_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_set_state" }
        }
      val bodyTestMotion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "body_test_motion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method body_test_motion" }
        }
      val capsuleShapeCreate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "capsule_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method capsule_shape_create" }
        }
      val circleShapeCreate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "circle_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method circle_shape_create" }
        }
      val concavePolygonShapeCreate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "concave_polygon_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method concave_polygon_shape_create" }
        }
      val convexPolygonShapeCreate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "convex_polygon_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method convex_polygon_shape_create" }
        }
      val dampedSpringJointCreate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "damped_spring_joint_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method damped_spring_joint_create" }
        }
      val dampedStringJointGetParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "damped_string_joint_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method damped_string_joint_get_param" }
        }
      val dampedStringJointSetParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "damped_string_joint_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method damped_string_joint_set_param" }
        }
      val freeRid: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "free_rid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method free_rid" }
        }
      val getProcessInfo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "get_process_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_info" }
        }
      val grooveJointCreate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "groove_joint_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method groove_joint_create" }
        }
      val jointGetParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "joint_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method joint_get_param" }
        }
      val jointGetType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "joint_get_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method joint_get_type" }
        }
      val jointSetParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "joint_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method joint_set_param" }
        }
      val lineShapeCreate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "line_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method line_shape_create" }
        }
      val pinJointCreate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "pin_joint_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pin_joint_create" }
        }
      val rayShapeCreate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "ray_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ray_shape_create" }
        }
      val rectangleShapeCreate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "rectangle_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rectangle_shape_create" }
        }
      val segmentShapeCreate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "segment_shape_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method segment_shape_create" }
        }
      val setActive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "set_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_active" }
        }
      val shapeGetData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "shape_get_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_get_data" }
        }
      val shapeGetType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "shape_get_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_get_type" }
        }
      val shapeSetData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "shape_set_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shape_set_data" }
        }
      val spaceCreate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "space_create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_create" }
        }
      val spaceGetDirectState: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "space_get_direct_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_get_direct_state" }
        }
      val spaceGetParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "space_get_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_get_param" }
        }
      val spaceIsActive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "space_is_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_is_active" }
        }
      val spaceSetActive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "space_set_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_set_active" }
        }
      val spaceSetParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Physics2DServer".cstr.ptr,
            "space_set_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method space_set_param" }
        }}
  }
}

object Physics2DServer : Physics2DServerInternal(null) {
  init {
    Allocator.allocationScope {
      val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("Physics2DServer".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton Physics2DServer" }
      _handle = handle
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
    ADDED(0),

    REMOVED(1);

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
    REST_LENGTH(0),

    STIFFNESS(1),

    DAMPING(2);

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
    STATIC(0),

    KINEMATIC(1),

    RIGID(2),

    CHARACTER(3);

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
    LINE(0),

    RAY(1),

    SEGMENT(2),

    CIRCLE(3),

    RECTANGLE(4),

    CAPSULE(5),

    CONVEX_POLYGON(6),

    CONCAVE_POLYGON(7),

    CUSTOM(8);

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
    BIAS(0),

    MAX_BIAS(1),

    MAX_FORCE(2);

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
    PARAM_CONTACT_RECYCLE_RADIUS(0),

    PARAM_CONTACT_MAX_SEPARATION(1),

    PARAM_BODY_MAX_ALLOWED_PENETRATION(2),

    PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD(3),

    PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD(4),

    PARAM_BODY_TIME_TO_SLEEP(5),

    PARAM_CONSTRAINT_DEFAULT_BIAS(6),

    PARAM_TEST_MOTION_MIN_CONTACT_DEPTH(7);

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
    PIN(0),

    GROOVE(1),

    DAMPED_SPRING(2);

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
    TRANSFORM(0),

    LINEAR_VELOCITY(1),

    ANGULAR_VELOCITY(2),

    SLEEPING(3),

    CAN_SLEEP(4);

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
    PARAM_BOUNCE(0),

    PARAM_FRICTION(1),

    PARAM_MASS(2),

    PARAM_INERTIA(3),

    PARAM_GRAVITY_SCALE(4),

    PARAM_LINEAR_DAMP(5),

    PARAM_ANGULAR_DAMP(6),

    PARAM_MAX(7);

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
    DISABLED(0),

    COMBINE(1),

    COMBINE_REPLACE(2),

    REPLACE(3),

    REPLACE_COMBINE(4);

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
    PARAM_GRAVITY(0),

    PARAM_GRAVITY_VECTOR(1),

    PARAM_GRAVITY_IS_POINT(2),

    PARAM_GRAVITY_DISTANCE_SCALE(3),

    PARAM_GRAVITY_POINT_ATTENUATION(4),

    PARAM_LINEAR_DAMP(5),

    PARAM_ANGULAR_DAMP(6),

    PARAM_PRIORITY(7);

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
}
