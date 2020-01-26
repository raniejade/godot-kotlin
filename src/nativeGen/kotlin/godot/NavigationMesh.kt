// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.PoolVector3Array
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
    TODO()
  }

  fun clearPolygons() {
    TODO()
  }

  fun createFromMesh(mesh: Mesh) {
    TODO()
  }

  fun getAgentHeight(): Float {
    TODO()
  }

  fun getAgentMaxClimb(): Float {
    TODO()
  }

  fun getAgentMaxSlope(): Float {
    TODO()
  }

  fun getAgentRadius(): Float {
    TODO()
  }

  fun getCellHeight(): Float {
    TODO()
  }

  fun getCellSize(): Float {
    TODO()
  }

  fun getCollisionMask(): Int {
    TODO()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    TODO()
  }

  fun getDetailSampleDistance(): Float {
    TODO()
  }

  fun getDetailSampleMaxError(): Float {
    TODO()
  }

  fun getEdgeMaxError(): Float {
    TODO()
  }

  fun getEdgeMaxLength(): Float {
    TODO()
  }

  fun getFilterLedgeSpans(): Boolean {
    TODO()
  }

  fun getFilterLowHangingObstacles(): Boolean {
    TODO()
  }

  fun getFilterWalkableLowHeightSpans(): Boolean {
    TODO()
  }

  fun getParsedGeometryType(): Int {
    TODO()
  }

  fun getPolygon(idx: Int): PoolIntArray {
    TODO()
  }

  fun getPolygonCount(): Int {
    TODO()
  }

  fun getRegionMergeSize(): Float {
    TODO()
  }

  fun getRegionMinSize(): Float {
    TODO()
  }

  fun getSamplePartitionType(): Int {
    TODO()
  }

  fun getVertices(): PoolVector3Array {
    TODO()
  }

  fun getVertsPerPoly(): Float {
    TODO()
  }

  fun setAgentHeight(agent_height: Float) {
    TODO()
  }

  fun setAgentMaxClimb(agent_max_climb: Float) {
    TODO()
  }

  fun setAgentMaxSlope(agent_max_slope: Float) {
    TODO()
  }

  fun setAgentRadius(agent_radius: Float) {
    TODO()
  }

  fun setCellHeight(cell_height: Float) {
    TODO()
  }

  fun setCellSize(cell_size: Float) {
    TODO()
  }

  fun setCollisionMask(mask: Int) {
    TODO()
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    TODO()
  }

  fun setDetailSampleDistance(detail_sample_dist: Float) {
    TODO()
  }

  fun setDetailSampleMaxError(detail_sample_max_error: Float) {
    TODO()
  }

  fun setEdgeMaxError(edge_max_error: Float) {
    TODO()
  }

  fun setEdgeMaxLength(edge_max_length: Float) {
    TODO()
  }

  fun setFilterLedgeSpans(filter_ledge_spans: Boolean) {
    TODO()
  }

  fun setFilterLowHangingObstacles(filter_low_hanging_obstacles: Boolean) {
    TODO()
  }

  fun setFilterWalkableLowHeightSpans(filter_walkable_low_height_spans: Boolean) {
    TODO()
  }

  fun setParsedGeometryType(geometry_type: Int) {
    TODO()
  }

  fun setRegionMergeSize(region_merge_size: Float) {
    TODO()
  }

  fun setRegionMinSize(region_min_size: Float) {
    TODO()
  }

  fun setSamplePartitionType(sample_partition_type: Int) {
    TODO()
  }

  fun setVertices(vertices: PoolVector3Array) {
    TODO()
  }

  fun setVertsPerPoly(verts_per_poly: Float) {
    TODO()
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
      requireNotNull(fnPtr) { "No instance found for singleton NavigationMesh" }
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
