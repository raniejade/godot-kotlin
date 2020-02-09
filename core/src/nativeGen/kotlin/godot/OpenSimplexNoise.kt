// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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
    _handle = __new()
  }

  fun getImage(width: Int, height: Int): Image {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(height))
    val _ret = __method_bind.getImage.call(this._handle, _args)
    return _ret.toAny() as Image
  }

  fun getLacunarity(): Float {
    val _ret = __method_bind.getLacunarity.call(this._handle)
    return _ret.asFloat()
  }

  fun getNoise1d(x: Float): Float {
    val _arg = Variant(x)
    val _ret = __method_bind.getNoise1d.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getNoise2d(x: Float, y: Float): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(x))
    _args.add(Variant.fromAny(y))
    val _ret = __method_bind.getNoise2d.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun getNoise2dv(pos: Vector2): Float {
    val _arg = Variant(pos)
    val _ret = __method_bind.getNoise2dv.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getNoise3d(
    x: Float,
    y: Float,
    z: Float
  ): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(x))
    _args.add(Variant.fromAny(y))
    _args.add(Variant.fromAny(z))
    val _ret = __method_bind.getNoise3d.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun getNoise3dv(pos: Vector3): Float {
    val _arg = Variant(pos)
    val _ret = __method_bind.getNoise3dv.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getNoise4d(
    x: Float,
    y: Float,
    z: Float,
    w: Float
  ): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(x))
    _args.add(Variant.fromAny(y))
    _args.add(Variant.fromAny(z))
    _args.add(Variant.fromAny(w))
    val _ret = __method_bind.getNoise4d.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun getOctaves(): Int {
    val _ret = __method_bind.getOctaves.call(this._handle)
    return _ret.asInt()
  }

  fun getPeriod(): Float {
    val _ret = __method_bind.getPeriod.call(this._handle)
    return _ret.asFloat()
  }

  fun getPersistence(): Float {
    val _ret = __method_bind.getPersistence.call(this._handle)
    return _ret.asFloat()
  }

  fun getSeamlessImage(size: Int): Image {
    val _arg = Variant(size)
    val _ret = __method_bind.getSeamlessImage.call(this._handle, listOf(_arg))
    return _ret.toAny() as Image
  }

  fun getSeed(): Int {
    val _ret = __method_bind.getSeed.call(this._handle)
    return _ret.asInt()
  }

  fun setLacunarity(lacunarity: Float) {
    val _arg = Variant(lacunarity)
    __method_bind.setLacunarity.call(this._handle, listOf(_arg))
  }

  fun setOctaves(octaveCount: Int) {
    val _arg = Variant(octaveCount)
    __method_bind.setOctaves.call(this._handle, listOf(_arg))
  }

  fun setPeriod(period: Float) {
    val _arg = Variant(period)
    __method_bind.setPeriod.call(this._handle, listOf(_arg))
  }

  fun setPersistence(persistence: Float) {
    val _arg = Variant(persistence)
    __method_bind.setPersistence.call(this._handle, listOf(_arg))
  }

  fun setSeed(seed: Int) {
    val _arg = Variant(seed)
    __method_bind.setSeed.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
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
      val getImage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "get_image".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_image" }
        }
      val getLacunarity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "get_lacunarity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_lacunarity" }
        }
      val getNoise1d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "get_noise_1d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_noise_1d" }
        }
      val getNoise2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "get_noise_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_noise_2d" }
        }
      val getNoise2dv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "get_noise_2dv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_noise_2dv" }
        }
      val getNoise3d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "get_noise_3d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_noise_3d" }
        }
      val getNoise3dv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "get_noise_3dv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_noise_3dv" }
        }
      val getNoise4d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "get_noise_4d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_noise_4d" }
        }
      val getOctaves: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "get_octaves".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_octaves" }
        }
      val getPeriod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "get_period".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_period" }
        }
      val getPersistence: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "get_persistence".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_persistence" }
        }
      val getSeamlessImage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "get_seamless_image".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_seamless_image" }
        }
      val getSeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "get_seed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_seed" }
        }
      val setLacunarity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "set_lacunarity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_lacunarity" }
        }
      val setOctaves: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "set_octaves".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_octaves" }
        }
      val setPeriod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "set_period".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_period" }
        }
      val setPersistence: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "set_persistence".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_persistence" }
        }
      val setSeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "set_seed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_seed" }
        }}
  }
}
