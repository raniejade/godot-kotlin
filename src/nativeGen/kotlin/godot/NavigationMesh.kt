// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.PoolVector3Array
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class NavigationMesh(
  _handle: COpaquePointer
) : Resource(_handle) {
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

  var polygonVertsPerPoly: Float
    get() {
       return getVertsPerPoly() 
    }
    set(value) {
      setVertsPerPoly(value)
    }

  var polygons: VariantArray
    get() {
       return _getPolygons() 
    }
    set(value) {
      _setPolygons(value)
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

  fun addPolygon(polygon: PoolIntArray) {
    val _arg = Variant.new(polygon)
    __method_bind.addPolygon.call(this._handle, _arg, 1)
  }

  fun clearPolygons() {
    __method_bind.clearPolygons.call(this._handle)
  }

  fun createFromMesh(mesh: Mesh) {
    val _arg = Variant.new(mesh)
    __method_bind.createFromMesh.call(this._handle, _arg, 1)
  }

  fun getAgentHeight(): Float {
    val _ret = __method_bind.getAgentHeight.call(this._handle)
    return _ret.asFloat()
  }

  fun getAgentMaxClimb(): Float {
    val _ret = __method_bind.getAgentMaxClimb.call(this._handle)
    return _ret.asFloat()
  }

  fun getAgentMaxSlope(): Float {
    val _ret = __method_bind.getAgentMaxSlope.call(this._handle)
    return _ret.asFloat()
  }

  fun getAgentRadius(): Float {
    val _ret = __method_bind.getAgentRadius.call(this._handle)
    return _ret.asFloat()
  }

  fun getCellHeight(): Float {
    val _ret = __method_bind.getCellHeight.call(this._handle)
    return _ret.asFloat()
  }

  fun getCellSize(): Float {
    val _ret = __method_bind.getCellSize.call(this._handle)
    return _ret.asFloat()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.getCollisionMask.call(this._handle)
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.getCollisionMaskBit.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getDetailSampleDistance(): Float {
    val _ret = __method_bind.getDetailSampleDistance.call(this._handle)
    return _ret.asFloat()
  }

  fun getDetailSampleMaxError(): Float {
    val _ret = __method_bind.getDetailSampleMaxError.call(this._handle)
    return _ret.asFloat()
  }

  fun getEdgeMaxError(): Float {
    val _ret = __method_bind.getEdgeMaxError.call(this._handle)
    return _ret.asFloat()
  }

  fun getEdgeMaxLength(): Float {
    val _ret = __method_bind.getEdgeMaxLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getFilterLedgeSpans(): Boolean {
    val _ret = __method_bind.getFilterLedgeSpans.call(this._handle)
    return _ret.asBoolean()
  }

  fun getFilterLowHangingObstacles(): Boolean {
    val _ret = __method_bind.getFilterLowHangingObstacles.call(this._handle)
    return _ret.asBoolean()
  }

  fun getFilterWalkableLowHeightSpans(): Boolean {
    val _ret = __method_bind.getFilterWalkableLowHeightSpans.call(this._handle)
    return _ret.asBoolean()
  }

  fun getParsedGeometryType(): Int {
    val _ret = __method_bind.getParsedGeometryType.call(this._handle)
    return _ret.asInt()
  }

  fun getPolygon(idx: Int): PoolIntArray {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getPolygon.call(this._handle, _arg, 1)
    return _ret.asPoolIntArray()
  }

  fun getPolygonCount(): Int {
    val _ret = __method_bind.getPolygonCount.call(this._handle)
    return _ret.asInt()
  }

  fun getRegionMergeSize(): Float {
    val _ret = __method_bind.getRegionMergeSize.call(this._handle)
    return _ret.asFloat()
  }

  fun getRegionMinSize(): Float {
    val _ret = __method_bind.getRegionMinSize.call(this._handle)
    return _ret.asFloat()
  }

  fun getSamplePartitionType(): Int {
    val _ret = __method_bind.getSamplePartitionType.call(this._handle)
    return _ret.asInt()
  }

  fun getVertices(): PoolVector3Array {
    val _ret = __method_bind.getVertices.call(this._handle)
    return _ret.asPoolVector3Array()
  }

  fun getVertsPerPoly(): Float {
    val _ret = __method_bind.getVertsPerPoly.call(this._handle)
    return _ret.asFloat()
  }

  fun setAgentHeight(agentHeight: Float) {
    val _arg = Variant.new(agentHeight)
    __method_bind.setAgentHeight.call(this._handle, _arg, 1)
  }

  fun setAgentMaxClimb(agentMaxClimb: Float) {
    val _arg = Variant.new(agentMaxClimb)
    __method_bind.setAgentMaxClimb.call(this._handle, _arg, 1)
  }

  fun setAgentMaxSlope(agentMaxSlope: Float) {
    val _arg = Variant.new(agentMaxSlope)
    __method_bind.setAgentMaxSlope.call(this._handle, _arg, 1)
  }

  fun setAgentRadius(agentRadius: Float) {
    val _arg = Variant.new(agentRadius)
    __method_bind.setAgentRadius.call(this._handle, _arg, 1)
  }

  fun setCellHeight(cellHeight: Float) {
    val _arg = Variant.new(cellHeight)
    __method_bind.setCellHeight.call(this._handle, _arg, 1)
  }

  fun setCellSize(cellSize: Float) {
    val _arg = Variant.new(cellSize)
    __method_bind.setCellSize.call(this._handle, _arg, 1)
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setCollisionMask.call(this._handle, _arg, 1)
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.setCollisionMaskBit.call(this._handle, _args.toVariant(), 2)
  }

  fun setDetailSampleDistance(detailSampleDist: Float) {
    val _arg = Variant.new(detailSampleDist)
    __method_bind.setDetailSampleDistance.call(this._handle, _arg, 1)
  }

  fun setDetailSampleMaxError(detailSampleMaxError: Float) {
    val _arg = Variant.new(detailSampleMaxError)
    __method_bind.setDetailSampleMaxError.call(this._handle, _arg, 1)
  }

  fun setEdgeMaxError(edgeMaxError: Float) {
    val _arg = Variant.new(edgeMaxError)
    __method_bind.setEdgeMaxError.call(this._handle, _arg, 1)
  }

  fun setEdgeMaxLength(edgeMaxLength: Float) {
    val _arg = Variant.new(edgeMaxLength)
    __method_bind.setEdgeMaxLength.call(this._handle, _arg, 1)
  }

  fun setFilterLedgeSpans(filterLedgeSpans: Boolean) {
    val _arg = Variant.new(filterLedgeSpans)
    __method_bind.setFilterLedgeSpans.call(this._handle, _arg, 1)
  }

  fun setFilterLowHangingObstacles(filterLowHangingObstacles: Boolean) {
    val _arg = Variant.new(filterLowHangingObstacles)
    __method_bind.setFilterLowHangingObstacles.call(this._handle, _arg, 1)
  }

  fun setFilterWalkableLowHeightSpans(filterWalkableLowHeightSpans: Boolean) {
    val _arg = Variant.new(filterWalkableLowHeightSpans)
    __method_bind.setFilterWalkableLowHeightSpans.call(this._handle, _arg, 1)
  }

  fun setParsedGeometryType(geometryType: Int) {
    val _arg = Variant.new(geometryType)
    __method_bind.setParsedGeometryType.call(this._handle, _arg, 1)
  }

  fun setRegionMergeSize(regionMergeSize: Float) {
    val _arg = Variant.new(regionMergeSize)
    __method_bind.setRegionMergeSize.call(this._handle, _arg, 1)
  }

  fun setRegionMinSize(regionMinSize: Float) {
    val _arg = Variant.new(regionMinSize)
    __method_bind.setRegionMinSize.call(this._handle, _arg, 1)
  }

  fun setSamplePartitionType(samplePartitionType: Int) {
    val _arg = Variant.new(samplePartitionType)
    __method_bind.setSamplePartitionType.call(this._handle, _arg, 1)
  }

  fun setVertices(vertices: PoolVector3Array) {
    val _arg = Variant.new(vertices)
    __method_bind.setVertices.call(this._handle, _arg, 1)
  }

  fun setVertsPerPoly(vertsPerPoly: Float) {
    val _arg = Variant.new(vertsPerPoly)
    __method_bind.setVertsPerPoly.call(this._handle, _arg, 1)
  }

  companion object {
    val PARSED_GEOMETRY_BOTH: Int = 2

    val PARSED_GEOMETRY_MESH_INSTANCES: Int = 0

    val PARSED_GEOMETRY_STATIC_COLLIDERS: Int = 1

    val SAMPLE_PARTITION_LAYERS: Int = 2

    val SAMPLE_PARTITION_MONOTONE: Int = 1

    val SAMPLE_PARTITION_WATERSHED: Int = 0

    fun new(): NavigationMesh = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NavigationMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NavigationMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): NavigationMesh = NavigationMesh(ptr)
    /**
     * Container for method_bind pointers for NavigationMesh
     */
    private object __method_bind {
      val addPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "addPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addPolygon" }
        }
      val clearPolygons: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "clearPolygons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearPolygons" }
        }
      val createFromMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "createFromMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method createFromMesh" }
        }
      val getAgentHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getAgentHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAgentHeight" }
        }
      val getAgentMaxClimb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getAgentMaxClimb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAgentMaxClimb" }
        }
      val getAgentMaxSlope: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getAgentMaxSlope".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAgentMaxSlope" }
        }
      val getAgentRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getAgentRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAgentRadius" }
        }
      val getCellHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getCellHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCellHeight" }
        }
      val getCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getCellSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCellSize" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCollisionMaskBit" }
        }
      val getDetailSampleDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getDetailSampleDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDetailSampleDistance" }
        }
      val getDetailSampleMaxError: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getDetailSampleMaxError".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDetailSampleMaxError" }
        }
      val getEdgeMaxError: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getEdgeMaxError".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEdgeMaxError" }
        }
      val getEdgeMaxLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getEdgeMaxLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEdgeMaxLength" }
        }
      val getFilterLedgeSpans: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getFilterLedgeSpans".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFilterLedgeSpans" }
        }
      val getFilterLowHangingObstacles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getFilterLowHangingObstacles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFilterLowHangingObstacles" }
        }
      val getFilterWalkableLowHeightSpans: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getFilterWalkableLowHeightSpans".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFilterWalkableLowHeightSpans" }
        }
      val getParsedGeometryType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getParsedGeometryType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParsedGeometryType" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPolygon" }
        }
      val getPolygonCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getPolygonCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPolygonCount" }
        }
      val getRegionMergeSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getRegionMergeSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRegionMergeSize" }
        }
      val getRegionMinSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getRegionMinSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRegionMinSize" }
        }
      val getSamplePartitionType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getSamplePartitionType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSamplePartitionType" }
        }
      val getVertices: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getVertices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertices" }
        }
      val getVertsPerPoly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "getVertsPerPoly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVertsPerPoly" }
        }
      val setAgentHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setAgentHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAgentHeight" }
        }
      val setAgentMaxClimb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setAgentMaxClimb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAgentMaxClimb" }
        }
      val setAgentMaxSlope: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setAgentMaxSlope".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAgentMaxSlope" }
        }
      val setAgentRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setAgentRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAgentRadius" }
        }
      val setCellHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setCellHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCellHeight" }
        }
      val setCellSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setCellSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCellSize" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setCollisionMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setCollisionMaskBit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCollisionMaskBit" }
        }
      val setDetailSampleDistance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setDetailSampleDistance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDetailSampleDistance" }
        }
      val setDetailSampleMaxError: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setDetailSampleMaxError".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDetailSampleMaxError" }
        }
      val setEdgeMaxError: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setEdgeMaxError".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEdgeMaxError" }
        }
      val setEdgeMaxLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setEdgeMaxLength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEdgeMaxLength" }
        }
      val setFilterLedgeSpans: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setFilterLedgeSpans".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFilterLedgeSpans" }
        }
      val setFilterLowHangingObstacles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setFilterLowHangingObstacles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFilterLowHangingObstacles" }
        }
      val setFilterWalkableLowHeightSpans: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setFilterWalkableLowHeightSpans".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFilterWalkableLowHeightSpans" }
        }
      val setParsedGeometryType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setParsedGeometryType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setParsedGeometryType" }
        }
      val setRegionMergeSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setRegionMergeSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRegionMergeSize" }
        }
      val setRegionMinSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setRegionMinSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRegionMinSize" }
        }
      val setSamplePartitionType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setSamplePartitionType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSamplePartitionType" }
        }
      val setVertices: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setVertices".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVertices" }
        }
      val setVertsPerPoly: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
            "setVertsPerPoly".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVertsPerPoly" }
        }}
  }
}
