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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class OpenSimplexNoise(
  _handle: COpaquePointer
) : Resource(_handle) {
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

  fun getImage(width: Int, height: Int): Image {
    val _args = VariantArray.new()
    _args.append(width)
    _args.append(height)
    val _ret = __method_bind.getImage.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Image)!!
  }

  fun getLacunarity(): Float {
    val _ret = __method_bind.getLacunarity.call(this._handle)
    return _ret.asFloat()
  }

  fun getNoise1d(x: Float): Float {
    val _arg = Variant.new(x)
    val _ret = __method_bind.getNoise1d.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getNoise2d(x: Float, y: Float): Float {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    val _ret = __method_bind.getNoise2d.call(this._handle, _args.toVariant(), 2)
    return _ret.asFloat()
  }

  fun getNoise2dv(pos: Vector2): Float {
    val _arg = Variant.new(pos)
    val _ret = __method_bind.getNoise2dv.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getNoise3d(
    x: Float,
    y: Float,
    z: Float
  ): Float {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    _args.append(z)
    val _ret = __method_bind.getNoise3d.call(this._handle, _args.toVariant(), 3)
    return _ret.asFloat()
  }

  fun getNoise3dv(pos: Vector3): Float {
    val _arg = Variant.new(pos)
    val _ret = __method_bind.getNoise3dv.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getNoise4d(
    x: Float,
    y: Float,
    z: Float,
    w: Float
  ): Float {
    val _args = VariantArray.new()
    _args.append(x)
    _args.append(y)
    _args.append(z)
    _args.append(w)
    val _ret = __method_bind.getNoise4d.call(this._handle, _args.toVariant(), 4)
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
    val _arg = Variant.new(size)
    val _ret = __method_bind.getSeamlessImage.call(this._handle, _arg, 1)
    return _ret.asObject(::Image)!!
  }

  fun getSeed(): Int {
    val _ret = __method_bind.getSeed.call(this._handle)
    return _ret.asInt()
  }

  fun setLacunarity(lacunarity: Float) {
    val _arg = Variant.new(lacunarity)
    __method_bind.setLacunarity.call(this._handle, _arg, 1)
  }

  fun setOctaves(octaveCount: Int) {
    val _arg = Variant.new(octaveCount)
    __method_bind.setOctaves.call(this._handle, _arg, 1)
  }

  fun setPeriod(period: Float) {
    val _arg = Variant.new(period)
    __method_bind.setPeriod.call(this._handle, _arg, 1)
  }

  fun setPersistence(persistence: Float) {
    val _arg = Variant.new(persistence)
    __method_bind.setPersistence.call(this._handle, _arg, 1)
  }

  fun setSeed(seed: Int) {
    val _arg = Variant.new(seed)
    __method_bind.setSeed.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): OpenSimplexNoise = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("OpenSimplexNoise".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for OpenSimplexNoise" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      OpenSimplexNoise(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): OpenSimplexNoise = OpenSimplexNoise(ptr)
    /**
     * Container for method_bind pointers for OpenSimplexNoise
     */
    private object __method_bind {
      val getImage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "getImage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getImage" }
        }
      val getLacunarity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "getLacunarity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLacunarity" }
        }
      val getNoise1d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "getNoise1d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNoise1d" }
        }
      val getNoise2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "getNoise2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNoise2d" }
        }
      val getNoise2dv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "getNoise2dv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNoise2dv" }
        }
      val getNoise3d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "getNoise3d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNoise3d" }
        }
      val getNoise3dv: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "getNoise3dv".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNoise3dv" }
        }
      val getNoise4d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "getNoise4d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNoise4d" }
        }
      val getOctaves: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "getOctaves".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOctaves" }
        }
      val getPeriod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "getPeriod".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPeriod" }
        }
      val getPersistence: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "getPersistence".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPersistence" }
        }
      val getSeamlessImage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "getSeamlessImage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSeamlessImage" }
        }
      val getSeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "getSeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSeed" }
        }
      val setLacunarity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "setLacunarity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLacunarity" }
        }
      val setOctaves: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "setOctaves".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOctaves" }
        }
      val setPeriod: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "setPeriod".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPeriod" }
        }
      val setPersistence: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "setPersistence".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPersistence" }
        }
      val setSeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("OpenSimplexNoise".cstr.ptr,
            "setSeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSeed" }
        }}
  }
}
