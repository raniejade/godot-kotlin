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

open class NavigationMesh internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addPolygon(polygon: PoolIntArray) {
    val _arg = Variant.new(polygon)
    __method_bind.add_polygon.call(this.toVariant(), _arg, 1)
  }

  fun clearPolygons() {
    __method_bind.clear_polygons.call(this.toVariant())
  }

  fun createFromMesh(mesh: Mesh) {
    val _arg = Variant.new(mesh)
    __method_bind.create_from_mesh.call(this.toVariant(), _arg, 1)
  }

  fun getAgentHeight(): Float {
    val _ret = __method_bind.get_agent_height.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getAgentMaxClimb(): Float {
    val _ret = __method_bind.get_agent_max_climb.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getAgentMaxSlope(): Float {
    val _ret = __method_bind.get_agent_max_slope.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getAgentRadius(): Float {
    val _ret = __method_bind.get_agent_radius.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getCellHeight(): Float {
    val _ret = __method_bind.get_cell_height.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getCellSize(): Float {
    val _ret = __method_bind.get_cell_size.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.get_collision_mask.call(this.toVariant())
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.get_collision_mask_bit.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun getDetailSampleDistance(): Float {
    val _ret = __method_bind.get_detail_sample_distance.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getDetailSampleMaxError(): Float {
    val _ret = __method_bind.get_detail_sample_max_error.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getEdgeMaxError(): Float {
    val _ret = __method_bind.get_edge_max_error.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getEdgeMaxLength(): Float {
    val _ret = __method_bind.get_edge_max_length.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getFilterLedgeSpans(): Boolean {
    val _ret = __method_bind.get_filter_ledge_spans.call(this.toVariant())
    return _ret.asBool()
  }

  fun getFilterLowHangingObstacles(): Boolean {
    val _ret = __method_bind.get_filter_low_hanging_obstacles.call(this.toVariant())
    return _ret.asBool()
  }

  fun getFilterWalkableLowHeightSpans(): Boolean {
    val _ret = __method_bind.get_filter_walkable_low_height_spans.call(this.toVariant())
    return _ret.asBool()
  }

  fun getParsedGeometryType(): Int {
    val _ret = __method_bind.get_parsed_geometry_type.call(this.toVariant())
    return _ret.asInt()
  }

  fun getPolygon(idx: Int): PoolIntArray {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.get_polygon.call(this.toVariant(), _arg, 1)
    return _ret.asPoolIntArray()
  }

  fun getPolygonCount(): Int {
    val _ret = __method_bind.get_polygon_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getRegionMergeSize(): Float {
    val _ret = __method_bind.get_region_merge_size.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getRegionMinSize(): Float {
    val _ret = __method_bind.get_region_min_size.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSamplePartitionType(): Int {
    val _ret = __method_bind.get_sample_partition_type.call(this.toVariant())
    return _ret.asInt()
  }

  fun getVertices(): PoolVector3Array {
    val _ret = __method_bind.get_vertices.call(this.toVariant())
    return _ret.asPoolVector3Array()
  }

  fun getVertsPerPoly(): Float {
    val _ret = __method_bind.get_verts_per_poly.call(this.toVariant())
    return _ret.asFloat()
  }

  fun setAgentHeight(agentHeight: Float) {
    val _arg = Variant.new(agentHeight)
    __method_bind.set_agent_height.call(this.toVariant(), _arg, 1)
  }

  fun setAgentMaxClimb(agentMaxClimb: Float) {
    val _arg = Variant.new(agentMaxClimb)
    __method_bind.set_agent_max_climb.call(this.toVariant(), _arg, 1)
  }

  fun setAgentMaxSlope(agentMaxSlope: Float) {
    val _arg = Variant.new(agentMaxSlope)
    __method_bind.set_agent_max_slope.call(this.toVariant(), _arg, 1)
  }

  fun setAgentRadius(agentRadius: Float) {
    val _arg = Variant.new(agentRadius)
    __method_bind.set_agent_radius.call(this.toVariant(), _arg, 1)
  }

  fun setCellHeight(cellHeight: Float) {
    val _arg = Variant.new(cellHeight)
    __method_bind.set_cell_height.call(this.toVariant(), _arg, 1)
  }

  fun setCellSize(cellSize: Float) {
    val _arg = Variant.new(cellSize)
    __method_bind.set_cell_size.call(this.toVariant(), _arg, 1)
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.set_collision_mask.call(this.toVariant(), _arg, 1)
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.set_collision_mask_bit.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setDetailSampleDistance(detailSampleDist: Float) {
    val _arg = Variant.new(detailSampleDist)
    __method_bind.set_detail_sample_distance.call(this.toVariant(), _arg, 1)
  }

  fun setDetailSampleMaxError(detailSampleMaxError: Float) {
    val _arg = Variant.new(detailSampleMaxError)
    __method_bind.set_detail_sample_max_error.call(this.toVariant(), _arg, 1)
  }

  fun setEdgeMaxError(edgeMaxError: Float) {
    val _arg = Variant.new(edgeMaxError)
    __method_bind.set_edge_max_error.call(this.toVariant(), _arg, 1)
  }

  fun setEdgeMaxLength(edgeMaxLength: Float) {
    val _arg = Variant.new(edgeMaxLength)
    __method_bind.set_edge_max_length.call(this.toVariant(), _arg, 1)
  }

  fun setFilterLedgeSpans(filterLedgeSpans: Boolean) {
    val _arg = Variant.new(filterLedgeSpans)
    __method_bind.set_filter_ledge_spans.call(this.toVariant(), _arg, 1)
  }

  fun setFilterLowHangingObstacles(filterLowHangingObstacles: Boolean) {
    val _arg = Variant.new(filterLowHangingObstacles)
    __method_bind.set_filter_low_hanging_obstacles.call(this.toVariant(), _arg, 1)
  }

  fun setFilterWalkableLowHeightSpans(filterWalkableLowHeightSpans: Boolean) {
    val _arg = Variant.new(filterWalkableLowHeightSpans)
    __method_bind.set_filter_walkable_low_height_spans.call(this.toVariant(), _arg, 1)
  }

  fun setParsedGeometryType(geometryType: Int) {
    val _arg = Variant.new(geometryType)
    __method_bind.set_parsed_geometry_type.call(this.toVariant(), _arg, 1)
  }

  fun setRegionMergeSize(regionMergeSize: Float) {
    val _arg = Variant.new(regionMergeSize)
    __method_bind.set_region_merge_size.call(this.toVariant(), _arg, 1)
  }

  fun setRegionMinSize(regionMinSize: Float) {
    val _arg = Variant.new(regionMinSize)
    __method_bind.set_region_min_size.call(this.toVariant(), _arg, 1)
  }

  fun setSamplePartitionType(samplePartitionType: Int) {
    val _arg = Variant.new(samplePartitionType)
    __method_bind.set_sample_partition_type.call(this.toVariant(), _arg, 1)
  }

  fun setVertices(vertices: PoolVector3Array) {
    val _arg = Variant.new(vertices)
    __method_bind.set_vertices.call(this.toVariant(), _arg, 1)
  }

  fun setVertsPerPoly(vertsPerPoly: Float) {
    val _arg = Variant.new(vertsPerPoly)
    __method_bind.set_verts_per_poly.call(this.toVariant(), _arg, 1)
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
      val add_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "add_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_polygon" }
            }
          }

      val clear_polygons: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "clear_polygons".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_polygons" }
            }
          }

      val create_from_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "create_from_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_from_mesh" }
            }
          }

      val get_agent_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_agent_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_agent_height" }
            }
          }

      val get_agent_max_climb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_agent_max_climb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_agent_max_climb" }
            }
          }

      val get_agent_max_slope: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_agent_max_slope".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_agent_max_slope" }
            }
          }

      val get_agent_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_agent_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_agent_radius" }
            }
          }

      val get_cell_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_cell_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell_height" }
            }
          }

      val get_cell_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cell_size" }
            }
          }

      val get_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
            }
          }

      val get_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
            }
          }

      val get_detail_sample_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_detail_sample_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_detail_sample_distance" }
            }
          }

      val get_detail_sample_max_error: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_detail_sample_max_error".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_detail_sample_max_error" }
            }
          }

      val get_edge_max_error: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_edge_max_error".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edge_max_error" }
            }
          }

      val get_edge_max_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_edge_max_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edge_max_length" }
            }
          }

      val get_filter_ledge_spans: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_filter_ledge_spans".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_filter_ledge_spans" }
            }
          }

      val get_filter_low_hanging_obstacles: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_filter_low_hanging_obstacles".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_filter_low_hanging_obstacles" }
            }
          }

      val get_filter_walkable_low_height_spans: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_filter_walkable_low_height_spans".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_filter_walkable_low_height_spans" }
            }
          }

      val get_parsed_geometry_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_parsed_geometry_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parsed_geometry_type" }
            }
          }

      val get_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_polygon" }
            }
          }

      val get_polygon_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_polygon_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_polygon_count" }
            }
          }

      val get_region_merge_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_region_merge_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_region_merge_size" }
            }
          }

      val get_region_min_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_region_min_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_region_min_size" }
            }
          }

      val get_sample_partition_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_sample_partition_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sample_partition_type" }
            }
          }

      val get_vertices: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_vertices".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vertices" }
            }
          }

      val get_verts_per_poly: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "get_verts_per_poly".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_verts_per_poly" }
            }
          }

      val set_agent_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_agent_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_agent_height" }
            }
          }

      val set_agent_max_climb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_agent_max_climb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_agent_max_climb" }
            }
          }

      val set_agent_max_slope: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_agent_max_slope".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_agent_max_slope" }
            }
          }

      val set_agent_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_agent_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_agent_radius" }
            }
          }

      val set_cell_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_cell_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cell_height" }
            }
          }

      val set_cell_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cell_size" }
            }
          }

      val set_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
            }
          }

      val set_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
            }
          }

      val set_detail_sample_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_detail_sample_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_detail_sample_distance" }
            }
          }

      val set_detail_sample_max_error: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_detail_sample_max_error".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_detail_sample_max_error" }
            }
          }

      val set_edge_max_error: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_edge_max_error".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_edge_max_error" }
            }
          }

      val set_edge_max_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_edge_max_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_edge_max_length" }
            }
          }

      val set_filter_ledge_spans: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_filter_ledge_spans".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_filter_ledge_spans" }
            }
          }

      val set_filter_low_hanging_obstacles: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_filter_low_hanging_obstacles".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_filter_low_hanging_obstacles" }
            }
          }

      val set_filter_walkable_low_height_spans: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_filter_walkable_low_height_spans".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_filter_walkable_low_height_spans" }
            }
          }

      val set_parsed_geometry_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_parsed_geometry_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_parsed_geometry_type" }
            }
          }

      val set_region_merge_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_region_merge_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region_merge_size" }
            }
          }

      val set_region_min_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_region_min_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region_min_size" }
            }
          }

      val set_sample_partition_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_sample_partition_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sample_partition_type" }
            }
          }

      val set_vertices: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_vertices".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vertices" }
            }
          }

      val set_verts_per_poly: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMesh".cstr.ptr,
              "set_verts_per_poly".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_verts_per_poly" }
            }
          }
    }
  }
}
