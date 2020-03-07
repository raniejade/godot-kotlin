// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
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

open class BakedLightmap(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualInstance(null) {
  var bakeCellSize: Float
    get() {
       return getBakeCellSize() 
    }
    set(value) {
      setBakeCellSize(value)
    }

  var bakeDefaultTexelsPerUnit: Float
    get() {
       return getBakeDefaultTexelsPerUnit() 
    }
    set(value) {
      setBakeDefaultTexelsPerUnit(value)
    }

  var bakeEnergy: Float
    get() {
       return getEnergy() 
    }
    set(value) {
      setEnergy(value)
    }

  var bakeExtents: Vector3
    get() {
       return getExtents() 
    }
    set(value) {
      setExtents(value)
    }

  var bakeHdr: Boolean
    get() {
       return isHdr() 
    }
    set(value) {
      setHdr(value)
    }

  var bakeMode: BakeMode
    get() {
       return getBakeMode() 
    }
    set(value) {
      setBakeMode(value.value)
    }

  var bakePropagation: Float
    get() {
       return getPropagation() 
    }
    set(value) {
      setPropagation(value)
    }

  var bakeQuality: BakeQuality
    get() {
       return getBakeQuality() 
    }
    set(value) {
      setBakeQuality(value.value)
    }

  var captureCellSize: Float
    get() {
       return getCaptureCellSize() 
    }
    set(value) {
      setCaptureCellSize(value)
    }

  var imagePath: String
    get() {
       return getImagePath() 
    }
    set(value) {
      setImagePath(value)
    }

  var lightData: BakedLightmapData
    get() {
       return getLightData() 
    }
    set(value) {
      setLightData(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for bakeExtents
   */
  fun bakeExtents(cb: Vector3.() -> Unit) {
    val _p = bakeExtents
    cb(_p)
    bakeExtents = _p
  }

  fun bake(fromNode: Node, createVisualDebug: Boolean = false): BakeError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(fromNode)
      _args.add(createVisualDebug)
      __method_bind.bake.call(self._handle, _args, _retPtr)
      BakedLightmap.BakeError.from(_ret.value)
    }
  }

  fun debugBake() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.debugBake.call(self._handle, emptyList(), null)
    }
  }

  fun getBakeCellSize(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBakeCellSize.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getBakeDefaultTexelsPerUnit(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBakeDefaultTexelsPerUnit.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getBakeMode(): BakeMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBakeMode.call(self._handle, emptyList(), _retPtr)
      BakedLightmap.BakeMode.from(_ret.value)
    }
  }

  fun getBakeQuality(): BakeQuality {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBakeQuality.call(self._handle, emptyList(), _retPtr)
      BakedLightmap.BakeQuality.from(_ret.value)
    }
  }

  fun getCaptureCellSize(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCaptureCellSize.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getEnergy(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getEnergy.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getExtents(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getExtents.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getImagePath(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getImagePath.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getLightData(): BakedLightmapData {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: BakedLightmapData
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getLightData.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<BakedLightmapData>(_tmp.value!!)
      _ret
    }
  }

  fun getPropagation(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPropagation.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun isHdr(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isHdr.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setBakeCellSize(bakeCellSize: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBakeCellSize.call(self._handle, listOf(bakeCellSize), null)
    }
  }

  fun setBakeDefaultTexelsPerUnit(texels: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBakeDefaultTexelsPerUnit.call(self._handle, listOf(texels), null)
    }
  }

  fun setBakeMode(bakeMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBakeMode.call(self._handle, listOf(bakeMode), null)
    }
  }

  fun setBakeQuality(bakeQuality: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBakeQuality.call(self._handle, listOf(bakeQuality), null)
    }
  }

  fun setCaptureCellSize(captureCellSize: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCaptureCellSize.call(self._handle, listOf(captureCellSize), null)
    }
  }

  fun setEnergy(energy: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnergy.call(self._handle, listOf(energy), null)
    }
  }

  fun setExtents(extents: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExtents.call(self._handle, listOf(extents), null)
    }
  }

  fun setHdr(hdr: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHdr.call(self._handle, listOf(hdr), null)
    }
  }

  fun setImagePath(imagePath: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setImagePath.call(self._handle, listOf(imagePath), null)
    }
  }

  fun setLightData(data: BakedLightmapData) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLightData.call(self._handle, listOf(data), null)
    }
  }

  fun setPropagation(propagation: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPropagation.call(self._handle, listOf(propagation), null)
    }
  }

  enum class BakeQuality(
    val value: Int
  ) {
    LOW(0),

    MEDIUM(1),

    HIGH(2);

    companion object {
      fun from(value: Int): BakeQuality {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class BakeError(
    val value: Int
  ) {
    OK(0),

    NO_SAVE_PATH(1),

    NO_MESHES(2),

    CANT_CREATE_IMAGE(3),

    USER_ABORTED(4);

    companion object {
      fun from(value: Int): BakeError {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class BakeMode(
    val value: Int
  ) {
    CONE_TRACE(0),

    RAY_TRACE(1);

    companion object {
      fun from(value: Int): BakeMode {
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("BakedLightmap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for BakedLightmap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for BakedLightmap
     */
    private object __method_bind {
      val bake: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "bake".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method bake" }
            }
          }

      val debugBake: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "debug_bake".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method debug_bake" }
            }
          }

      val getBakeCellSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_bake_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bake_cell_size" }
            }
          }

      val getBakeDefaultTexelsPerUnit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_bake_default_texels_per_unit".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_bake_default_texels_per_unit" }
            }
          }

      val getBakeMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_bake_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bake_mode" }
            }
          }

      val getBakeQuality: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_bake_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bake_quality" }
            }
          }

      val getCaptureCellSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_capture_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_capture_cell_size" }
            }
          }

      val getEnergy: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_energy" }
            }
          }

      val getExtents: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_extents" }
            }
          }

      val getImagePath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_image_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_image_path" }
            }
          }

      val getLightData: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_light_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_light_data" }
            }
          }

      val getPropagation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "get_propagation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_propagation" }
            }
          }

      val isHdr: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "is_hdr".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_hdr" }
            }
          }

      val setBakeCellSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_bake_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bake_cell_size" }
            }
          }

      val setBakeDefaultTexelsPerUnit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_bake_default_texels_per_unit".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_bake_default_texels_per_unit" }
            }
          }

      val setBakeMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_bake_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bake_mode" }
            }
          }

      val setBakeQuality: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_bake_quality".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bake_quality" }
            }
          }

      val setCaptureCellSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_capture_cell_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_capture_cell_size" }
            }
          }

      val setEnergy: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_energy" }
            }
          }

      val setExtents: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_extents" }
            }
          }

      val setHdr: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_hdr".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hdr" }
            }
          }

      val setImagePath: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_image_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_image_path" }
            }
          }

      val setLightData: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_light_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_light_data" }
            }
          }

      val setPropagation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BakedLightmap".cstr.ptr,
              "set_propagation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_propagation" }
            }
          }
    }
  }
}
