// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
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

open class OpenSimplexNoise(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var lacunarity: Float
    get() {
       return getLacunarity() 
    }
    set(value) {
      setLacunarity(value)
    }

  var octaves: Int
    get() {
       return getOctaves() 
    }
    set(value) {
      setOctaves(value)
    }

  var period: Float
    get() {
       return getPeriod() 
    }
    set(value) {
      setPeriod(value)
    }

  var persistence: Float
    get() {
       return getPersistence() 
    }
    set(value) {
      setPersistence(value)
    }

  var seed: Int
    get() {
       return getSeed() 
    }
    set(value) {
      setSeed(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getImage(width: Int, height: Int): Image {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Image
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(width)
      _args.add(height)
      __method_bind.getImage.call(self._handle, _args, _retPtr)
      _ret = objectToType<Image>(_tmp.value!!)
      _ret
    }
  }

  fun getLacunarity(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLacunarity.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getNoise1d(x: Float): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getNoise1d.call(self._handle, listOf(x), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getNoise2d(x: Float, y: Float): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(x)
      _args.add(y)
      __method_bind.getNoise2d.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getNoise2dv(pos: Vector2): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getNoise2dv.call(self._handle, listOf(pos), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getNoise3d(
    x: Float,
    y: Float,
    z: Float
  ): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(x)
      _args.add(y)
      _args.add(z)
      __method_bind.getNoise3d.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getNoise3dv(pos: Vector3): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getNoise3dv.call(self._handle, listOf(pos), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getNoise4d(
    x: Float,
    y: Float,
    z: Float,
    w: Float
  ): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(x)
      _args.add(y)
      _args.add(z)
      _args.add(w)
      __method_bind.getNoise4d.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getOctaves(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOctaves.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPeriod(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPeriod.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPersistence(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPersistence.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSeamlessImage(size: Int): Image {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Image
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getSeamlessImage.call(self._handle, listOf(size), _retPtr)
      _ret = objectToType<Image>(_tmp.value!!)
      _ret
    }
  }

  fun getSeed(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSeed.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setLacunarity(lacunarity: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLacunarity.call(self._handle, listOf(lacunarity), null)
    }
  }

  fun setOctaves(octaveCount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOctaves.call(self._handle, listOf(octaveCount), null)
    }
  }

  fun setPeriod(period: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPeriod.call(self._handle, listOf(period), null)
    }
  }

  fun setPersistence(persistence: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPersistence.call(self._handle, listOf(persistence), null)
    }
  }

  fun setSeed(seed: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSeed.call(self._handle, listOf(seed), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("OpenSimplexNoise".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for OpenSimplexNoise" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for OpenSimplexNoise
     */
    private object __method_bind {
      val getImage: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_image".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_image" }
            }
          }

      val getLacunarity: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_lacunarity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lacunarity" }
            }
          }

      val getNoise1d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_noise_1d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_noise_1d" }
            }
          }

      val getNoise2d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_noise_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_noise_2d" }
            }
          }

      val getNoise2dv: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_noise_2dv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_noise_2dv" }
            }
          }

      val getNoise3d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_noise_3d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_noise_3d" }
            }
          }

      val getNoise3dv: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_noise_3dv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_noise_3dv" }
            }
          }

      val getNoise4d: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_noise_4d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_noise_4d" }
            }
          }

      val getOctaves: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_octaves".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_octaves" }
            }
          }

      val getPeriod: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_period".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_period" }
            }
          }

      val getPersistence: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_persistence".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_persistence" }
            }
          }

      val getSeamlessImage: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_seamless_image".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_seamless_image" }
            }
          }

      val getSeed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "get_seed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_seed" }
            }
          }

      val setLacunarity: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "set_lacunarity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lacunarity" }
            }
          }

      val setOctaves: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "set_octaves".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_octaves" }
            }
          }

      val setPeriod: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "set_period".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_period" }
            }
          }

      val setPersistence: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "set_persistence".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_persistence" }
            }
          }

      val setSeed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
              "set_seed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_seed" }
            }
          }
    }
  }
}
