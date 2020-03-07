// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.PoolVector3Array
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class NavigationMesh(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var agentHeight: Float
    get() {
       return getAgentHeight() 
    }
    set(value) {
      setAgentHeight(value)
    }

  var agentMaxClimb: Float
    get() {
       return getAgentMaxClimb() 
    }
    set(value) {
      setAgentMaxClimb(value)
    }

  var agentMaxSlope: Float
    get() {
       return getAgentMaxSlope() 
    }
    set(value) {
      setAgentMaxSlope(value)
    }

  var agentRadius: Float
    get() {
       return getAgentRadius() 
    }
    set(value) {
      setAgentRadius(value)
    }

  var cellHeight: Float
    get() {
       return getCellHeight() 
    }
    set(value) {
      setCellHeight(value)
    }

  var cellSize: Float
    get() {
       return getCellSize() 
    }
    set(value) {
      setCellSize(value)
    }

  var detailSampleDistance: Float
    get() {
       return getDetailSampleDistance() 
    }
    set(value) {
      setDetailSampleDistance(value)
    }

  var detailSampleMaxError: Float
    get() {
       return getDetailSampleMaxError() 
    }
    set(value) {
      setDetailSampleMaxError(value)
    }

  var edgeMaxError: Float
    get() {
       return getEdgeMaxError() 
    }
    set(value) {
      setEdgeMaxError(value)
    }

  var edgeMaxLength: Float
    get() {
       return getEdgeMaxLength() 
    }
    set(value) {
      setEdgeMaxLength(value)
    }

  var filterFilterWalkableLowHeightSpans: Boolean
    get() {
       return getFilterWalkableLowHeightSpans() 
    }
    set(value) {
      setFilterWalkableLowHeightSpans(value)
    }

  var filterLedgeSpans: Boolean
    get() {
       return getFilterLedgeSpans() 
    }
    set(value) {
      setFilterLedgeSpans(value)
    }

  var filterLowHangingObstacles: Boolean
    get() {
       return getFilterLowHangingObstacles() 
    }
    set(value) {
      setFilterLowHangingObstacles(value)
    }

  var geometryCollisionMask: Int
    get() {
       return getCollisionMask() 
    }
    set(value) {
      setCollisionMask(value)
    }

  var geometryParsedGeometryType: Int
    get() {
       return getParsedGeometryType() 
    }
    set(value) {
      setParsedGeometryType(value)
    }

  var geometrySourceGeometryMode: Int
    get() {
       return getSourceGeometryMode() 
    }
    set(value) {
      setSourceGeometryMode(value)
    }

  var geometrySourceGroupName: String
    get() {
       return getSourceGroupName() 
    }
    set(value) {
      setSourceGroupName(value)
    }

  var polygonVertsPerPoly: Float
    get() {
       return getVertsPerPoly() 
    }
    set(value) {
      setVertsPerPoly(value)
    }

  var regionMergeSize: Float
    get() {
       return getRegionMergeSize() 
    }
    set(value) {
      setRegionMergeSize(value)
    }

  var regionMinSize: Float
    get() {
       return getRegionMinSize() 
    }
    set(value) {
      setRegionMinSize(value)
    }

  var samplePartitionTypeSamplePartitionType: Int
    get() {
       return getSamplePartitionType() 
    }
    set(value) {
      setSamplePartitionType(value)
    }

  var vertices: PoolVector3Array
    get() {
       return getVertices() 
    }
    set(value) {
      setVertices(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for vertices
   */
  fun vertices(cb: PoolVector3Array.() -> Unit) {
    val _p = vertices
    cb(_p)
    vertices = _p
  }

  open fun _get_polygons(): VariantArray {
    TODO()
  }

  open fun _set_polygons(polygons: VariantArray) {
    TODO()
  }

  fun addPolygon(polygon: PoolIntArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addPolygon.call(self._handle, listOf(polygon), null)
    }
  }

  fun clearPolygons() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearPolygons.call(self._handle, emptyList(), null)
    }
  }

  fun createFromMesh(mesh: Mesh) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.createFromMesh.call(self._handle, listOf(mesh), null)
    }
  }

  fun getAgentHeight(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAgentHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getAgentMaxClimb(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAgentMaxClimb.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getAgentMaxSlope(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAgentMaxSlope.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getAgentRadius(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAgentRadius.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getCellHeight(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCellHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getCellSize(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCellSize.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getCollisionMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionMaskBit.call(self._handle, listOf(bit), _retPtr)
      _ret.value
    }
  }

  fun getDetailSampleDistance(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDetailSampleDistance.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDetailSampleMaxError(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDetailSampleMaxError.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getEdgeMaxError(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEdgeMaxError.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getEdgeMaxLength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEdgeMaxLength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFilterLedgeSpans(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFilterLedgeSpans.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getFilterLowHangingObstacles(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFilterLowHangingObstacles.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getFilterWalkableLowHeightSpans(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFilterWalkableLowHeightSpans.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getParsedGeometryType(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getParsedGeometryType.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPolygon(idx: Int): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getPolygon.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPolygonCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPolygonCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getRegionMergeSize(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRegionMergeSize.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRegionMinSize(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRegionMinSize.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSamplePartitionType(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSamplePartitionType.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSourceGeometryMode(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSourceGeometryMode.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSourceGroupName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getSourceGroupName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getVertices(): PoolVector3Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector3Array()
      val _retPtr = _ret._value.ptr
      __method_bind.getVertices.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVertsPerPoly(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVertsPerPoly.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setAgentHeight(agentHeight: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAgentHeight.call(self._handle, listOf(agentHeight), null)
    }
  }

  fun setAgentMaxClimb(agentMaxClimb: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAgentMaxClimb.call(self._handle, listOf(agentMaxClimb), null)
    }
  }

  fun setAgentMaxSlope(agentMaxSlope: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAgentMaxSlope.call(self._handle, listOf(agentMaxSlope), null)
    }
  }

  fun setAgentRadius(agentRadius: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAgentRadius.call(self._handle, listOf(agentRadius), null)
    }
  }

  fun setCellHeight(cellHeight: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCellHeight.call(self._handle, listOf(cellHeight), null)
    }
  }

  fun setCellSize(cellSize: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCellSize.call(self._handle, listOf(cellSize), null)
    }
  }

  fun setCollisionMask(mask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionMask.call(self._handle, listOf(mask), null)
    }
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(bit)
      _args.add(value)
      __method_bind.setCollisionMaskBit.call(self._handle, _args, null)
    }
  }

  fun setDetailSampleDistance(detailSampleDist: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDetailSampleDistance.call(self._handle, listOf(detailSampleDist), null)
    }
  }

  fun setDetailSampleMaxError(detailSampleMaxError: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDetailSampleMaxError.call(self._handle, listOf(detailSampleMaxError), null)
    }
  }

  fun setEdgeMaxError(edgeMaxError: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEdgeMaxError.call(self._handle, listOf(edgeMaxError), null)
    }
  }

  fun setEdgeMaxLength(edgeMaxLength: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEdgeMaxLength.call(self._handle, listOf(edgeMaxLength), null)
    }
  }

  fun setFilterLedgeSpans(filterLedgeSpans: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFilterLedgeSpans.call(self._handle, listOf(filterLedgeSpans), null)
    }
  }

  fun setFilterLowHangingObstacles(filterLowHangingObstacles: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFilterLowHangingObstacles.call(self._handle,
          listOf(filterLowHangingObstacles), null)
    }
  }

  fun setFilterWalkableLowHeightSpans(filterWalkableLowHeightSpans: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFilterWalkableLowHeightSpans.call(self._handle,
          listOf(filterWalkableLowHeightSpans), null)
    }
  }

  fun setParsedGeometryType(geometryType: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setParsedGeometryType.call(self._handle, listOf(geometryType), null)
    }
  }

  fun setRegionMergeSize(regionMergeSize: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRegionMergeSize.call(self._handle, listOf(regionMergeSize), null)
    }
  }

  fun setRegionMinSize(regionMinSize: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRegionMinSize.call(self._handle, listOf(regionMinSize), null)
    }
  }

  fun setSamplePartitionType(samplePartitionType: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSamplePartitionType.call(self._handle, listOf(samplePartitionType), null)
    }
  }

  fun setSourceGeometryMode(mask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSourceGeometryMode.call(self._handle, listOf(mask), null)
    }
  }

  fun setSourceGroupName(mask: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSourceGroupName.call(self._handle, listOf(mask), null)
    }
  }

  fun setVertices(vertices: PoolVector3Array) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVertices.call(self._handle, listOf(vertices), null)
    }
  }

  fun setVertsPerPoly(vertsPerPoly: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVertsPerPoly.call(self._handle, listOf(vertsPerPoly), null)
    }
  }

  companion object {
    val PARSED_GEOMETRY_BOTH: Int = 2

    val PARSED_GEOMETRY_MESH_INSTANCES: Int = 0

    val PARSED_GEOMETRY_STATIC_COLLIDERS: Int = 1

    val SAMPLE_PARTITION_LAYERS: Int = 2

    val SAMPLE_PARTITION_MONOTONE: Int = 1

    val SAMPLE_PARTITION_WATERSHED: Int = 0

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NavigationMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for NavigationMesh
     */
    private object __method_bind {
      val addPolygon: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "add_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_polygon" }
            }
          }

      val clearPolygons: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "clear_polygons".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_polygons" }
            }
          }

      val createFromMesh: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "create_from_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_from_mesh" }
            }
          }

      val getAgentHeight: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_agent_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_agent_height" }
            }
          }

      val getAgentMaxClimb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_agent_max_climb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_agent_max_climb" }
            }
          }

      val getAgentMaxSlope: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_agent_max_slope".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_agent_max_slope" }
            }
          }

      val getAgentRadius: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_agent_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_agent_radius" }
            }
          }

      val getCellHeight: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_cell_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell_height" }
            }
          }

      val getCellSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell_size" }
            }
          }

      val getCollisionMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
            }
          }

      val getCollisionMaskBit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
            }
          }

      val getDetailSampleDistance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_detail_sample_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_detail_sample_distance" }
            }
          }

      val getDetailSampleMaxError: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_detail_sample_max_error".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_detail_sample_max_error" }
            }
          }

      val getEdgeMaxError: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_edge_max_error".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edge_max_error" }
            }
          }

      val getEdgeMaxLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_edge_max_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edge_max_length" }
            }
          }

      val getFilterLedgeSpans: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_filter_ledge_spans".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_filter_ledge_spans" }
            }
          }

      val getFilterLowHangingObstacles: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_filter_low_hanging_obstacles".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_filter_low_hanging_obstacles" }
            }
          }

      val getFilterWalkableLowHeightSpans: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_filter_walkable_low_height_spans".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_filter_walkable_low_height_spans" }
            }
          }

      val getParsedGeometryType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_parsed_geometry_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parsed_geometry_type" }
            }
          }

      val getPolygon: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_polygon" }
            }
          }

      val getPolygonCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_polygon_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_polygon_count" }
            }
          }

      val getRegionMergeSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_region_merge_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_region_merge_size" }
            }
          }

      val getRegionMinSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_region_min_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_region_min_size" }
            }
          }

      val getSamplePartitionType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_sample_partition_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sample_partition_type" }
            }
          }

      val getSourceGeometryMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_source_geometry_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_source_geometry_mode" }
            }
          }

      val getSourceGroupName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_source_group_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_source_group_name" }
            }
          }

      val getVertices: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_vertices".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertices" }
            }
          }

      val getVertsPerPoly: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_verts_per_poly".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_verts_per_poly" }
            }
          }

      val setAgentHeight: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_agent_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_agent_height" }
            }
          }

      val setAgentMaxClimb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_agent_max_climb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_agent_max_climb" }
            }
          }

      val setAgentMaxSlope: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_agent_max_slope".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_agent_max_slope" }
            }
          }

      val setAgentRadius: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_agent_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_agent_radius" }
            }
          }

      val setCellHeight: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_cell_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cell_height" }
            }
          }

      val setCellSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cell_size" }
            }
          }

      val setCollisionMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
            }
          }

      val setCollisionMaskBit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
            }
          }

      val setDetailSampleDistance: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_detail_sample_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_detail_sample_distance" }
            }
          }

      val setDetailSampleMaxError: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_detail_sample_max_error".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_detail_sample_max_error" }
            }
          }

      val setEdgeMaxError: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_edge_max_error".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_edge_max_error" }
            }
          }

      val setEdgeMaxLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_edge_max_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_edge_max_length" }
            }
          }

      val setFilterLedgeSpans: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_filter_ledge_spans".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_filter_ledge_spans" }
            }
          }

      val setFilterLowHangingObstacles: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_filter_low_hanging_obstacles".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_filter_low_hanging_obstacles" }
            }
          }

      val setFilterWalkableLowHeightSpans: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_filter_walkable_low_height_spans".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_filter_walkable_low_height_spans" }
            }
          }

      val setParsedGeometryType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_parsed_geometry_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_parsed_geometry_type" }
            }
          }

      val setRegionMergeSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_region_merge_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region_merge_size" }
            }
          }

      val setRegionMinSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_region_min_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region_min_size" }
            }
          }

      val setSamplePartitionType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_sample_partition_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sample_partition_type" }
            }
          }

      val setSourceGeometryMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_source_geometry_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_source_geometry_mode" }
            }
          }

      val setSourceGroupName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_source_group_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_source_group_name" }
            }
          }

      val setVertices: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_vertices".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vertices" }
            }
          }

      val setVertsPerPoly: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_verts_per_poly".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_verts_per_poly" }
            }
          }
    }
  }
}
