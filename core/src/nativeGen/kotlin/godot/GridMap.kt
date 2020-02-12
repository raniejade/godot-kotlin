// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
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

open class GridMap(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var cellCenterX: Boolean
    get() {
       return getCenterX() 
    }
    set(value) {
      setCenterX(value)
    }

  var cellCenterY: Boolean
    get() {
       return getCenterY() 
    }
    set(value) {
      setCenterY(value)
    }

  var cellCenterZ: Boolean
    get() {
       return getCenterZ() 
    }
    set(value) {
      setCenterZ(value)
    }

  var cellOctantSize: Int
    get() {
       return getOctantSize() 
    }
    set(value) {
      setOctantSize(value)
    }

  var cellScale: Float
    get() {
       return getCellScale() 
    }
    set(value) {
      setCellScale(value)
    }

  var cellSize: Vector3
    get() {
       return getCellSize() 
    }
    set(value) {
      setCellSize(value)
    }

  var collisionLayer: Int
    get() {
       return getCollisionLayer() 
    }
    set(value) {
      setCollisionLayer(value)
    }

  var collisionMask: Int
    get() {
       return getCollisionMask() 
    }
    set(value) {
      setCollisionMask(value)
    }

  var meshLibrary: MeshLibrary
    get() {
       return getMeshLibrary() 
    }
    set(value) {
      setMeshLibrary(value)
    }

  /**
   * GridMap::cell_size_changed signal
   */
  val signalCellSizeChanged: Signal1<Vector3> = Signal1("cell_size_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for cellSize
   */
  fun cellSize(cb: Vector3.() -> Unit) {
    val _p = cellSize
    cb(_p)
    cellSize = _p
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun clearBakedMeshes() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearBakedMeshes.call(self._handle, emptyList(), null)
    }
  }

  fun getBakeMeshInstance(idx: Int): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getBakeMeshInstance.call(self._handle, listOf(idx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBakeMeshes(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getBakeMeshes.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCellItem(
    x: Int,
    y: Int,
    z: Int
  ): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(x)
      _args.add(y)
      _args.add(z)
      __method_bind.getCellItem.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun getCellItemOrientation(
    x: Int,
    y: Int,
    z: Int
  ): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(x)
      _args.add(y)
      _args.add(z)
      __method_bind.getCellItemOrientation.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun getCellScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCellScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getCellSize(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getCellSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCenterX(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCenterX.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCenterY(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCenterY.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCenterZ(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCenterZ.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCollisionLayer(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionLayer.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCollisionLayerBit.call(self._handle, listOf(bit), _retPtr)
      _ret.value
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

  fun getMeshLibrary(): MeshLibrary {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: MeshLibrary
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMeshLibrary.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<MeshLibrary>(_tmp.value!!)
      _ret
    }
  }

  fun getMeshes(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getMeshes.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getOctantSize(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOctantSize.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getUsedCells(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getUsedCells.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun makeBakedMeshes(genLightmapUv: Boolean = false, lightmapUvTexelSize: Float = 0.1f) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(genLightmapUv)
      _args.add(lightmapUvTexelSize)
      __method_bind.makeBakedMeshes.call(self._handle, _args, null)
    }
  }

  fun mapToWorld(
    x: Int,
    y: Int,
    z: Int
  ): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(x)
      _args.add(y)
      _args.add(z)
      __method_bind.mapToWorld.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun resourceChanged(resource: Resource) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.resourceChanged.call(self._handle, listOf(resource), null)
    }
  }

  fun setCellItem(
    x: Int,
    y: Int,
    z: Int,
    item: Int,
    orientation: Int = 0
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(x)
      _args.add(y)
      _args.add(z)
      _args.add(item)
      _args.add(orientation)
      __method_bind.setCellItem.call(self._handle, _args, null)
    }
  }

  fun setCellScale(scale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCellScale.call(self._handle, listOf(scale), null)
    }
  }

  fun setCellSize(size: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCellSize.call(self._handle, listOf(size), null)
    }
  }

  fun setCenterX(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCenterX.call(self._handle, listOf(enable), null)
    }
  }

  fun setCenterY(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCenterY.call(self._handle, listOf(enable), null)
    }
  }

  fun setCenterZ(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCenterZ.call(self._handle, listOf(enable), null)
    }
  }

  fun setClip(
    enabled: Boolean,
    clipabove: Boolean = true,
    floor: Int = 0,
    axis: Int = 0
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(enabled)
      _args.add(clipabove)
      _args.add(floor)
      _args.add(axis)
      __method_bind.setClip.call(self._handle, _args, null)
    }
  }

  fun setCollisionLayer(layer: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollisionLayer.call(self._handle, listOf(layer), null)
    }
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(bit)
      _args.add(value)
      __method_bind.setCollisionLayerBit.call(self._handle, _args, null)
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

  fun setMeshLibrary(meshLibrary: MeshLibrary) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMeshLibrary.call(self._handle, listOf(meshLibrary), null)
    }
  }

  fun setOctantSize(size: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOctantSize.call(self._handle, listOf(size), null)
    }
  }

  fun worldToMap(pos: Vector3): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.worldToMap.call(self._handle, listOf(pos), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  companion object {
    val INVALID_CELL_ITEM: Int = -1

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GridMap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GridMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for GridMap
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val clearBakedMeshes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "clear_baked_meshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_baked_meshes" }
        }
      val getBakeMeshInstance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_bake_mesh_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_mesh_instance" }
        }
      val getBakeMeshes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_bake_meshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_meshes" }
        }
      val getCellItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_cell_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_item" }
        }
      val getCellItemOrientation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_cell_item_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_item_orientation" }
        }
      val getCellScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_cell_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_scale" }
        }
      val getCellSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cell_size" }
        }
      val getCenterX: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_center_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_center_x" }
        }
      val getCenterY: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_center_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_center_y" }
        }
      val getCenterZ: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_center_z".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_center_z" }
        }
      val getCollisionLayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
        }
      val getCollisionLayerBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
        }
      val getCollisionMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
        }
      val getCollisionMaskBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
        }
      val getMeshLibrary: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_mesh_library".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mesh_library" }
        }
      val getMeshes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_meshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_meshes" }
        }
      val getOctantSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_octant_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_octant_size" }
        }
      val getUsedCells: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "get_used_cells".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_used_cells" }
        }
      val makeBakedMeshes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "make_baked_meshes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_baked_meshes" }
        }
      val mapToWorld: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "map_to_world".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method map_to_world" }
        }
      val resourceChanged: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "resource_changed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resource_changed" }
        }
      val setCellItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_cell_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_item" }
        }
      val setCellScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_cell_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_scale" }
        }
      val setCellSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_cell_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cell_size" }
        }
      val setCenterX: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_center_x".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_center_x" }
        }
      val setCenterY: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_center_y".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_center_y" }
        }
      val setCenterZ: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_center_z".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_center_z" }
        }
      val setClip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_clip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clip" }
        }
      val setCollisionLayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_collision_layer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
        }
      val setCollisionLayerBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_collision_layer_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
        }
      val setCollisionMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_collision_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
        }
      val setCollisionMaskBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_collision_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
        }
      val setMeshLibrary: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_mesh_library".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mesh_library" }
        }
      val setOctantSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "set_octant_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_octant_size" }
        }
      val worldToMap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GridMap".cstr.ptr,
            "world_to_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method world_to_map" }
        }}
  }
}
