// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ParallaxBackground(
  _handle: COpaquePointer
) : CanvasLayer(_handle) {
  var scrollBaseOffset: Vector2
    get() {
       return getScrollBaseOffset() 
    }
    set(value) {
      setScrollBaseOffset(value)
    }

  var scrollBaseScale: Vector2
    get() {
       return getScrollBaseScale() 
    }
    set(value) {
      setScrollBaseScale(value)
    }

  var scrollIgnoreCameraZoom: Boolean
    get() {
       return isIgnoreCameraZoom() 
    }
    set(value) {
      setIgnoreCameraZoom(value)
    }

  var scrollLimitBegin: Vector2
    get() {
       return getLimitBegin() 
    }
    set(value) {
      setLimitBegin(value)
    }

  var scrollLimitEnd: Vector2
    get() {
       return getLimitEnd() 
    }
    set(value) {
      setLimitEnd(value)
    }

  var scrollOffset: Vector2
    get() {
       return getScrollOffset() 
    }
    set(value) {
      setScrollOffset(value)
    }

  fun getLimitBegin(): Vector2 {
    val _ret = __method_bind.getLimitBegin.call(this._handle)
    return _ret.asVector2()
  }

  fun getLimitEnd(): Vector2 {
    val _ret = __method_bind.getLimitEnd.call(this._handle)
    return _ret.asVector2()
  }

  fun getScrollBaseOffset(): Vector2 {
    val _ret = __method_bind.getScrollBaseOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun getScrollBaseScale(): Vector2 {
    val _ret = __method_bind.getScrollBaseScale.call(this._handle)
    return _ret.asVector2()
  }

  fun getScrollOffset(): Vector2 {
    val _ret = __method_bind.getScrollOffset.call(this._handle)
    return _ret.asVector2()
  }

  fun isIgnoreCameraZoom(): Boolean {
    val _ret = __method_bind.isIgnoreCameraZoom.call(this._handle)
    return _ret.asBoolean()
  }

  fun setIgnoreCameraZoom(ignore: Boolean) {
    val _arg = Variant.new(ignore)
    __method_bind.setIgnoreCameraZoom.call(this._handle, _arg, 1)
  }

  fun setLimitBegin(ofs: Vector2) {
    val _arg = Variant.new(ofs)
    __method_bind.setLimitBegin.call(this._handle, _arg, 1)
  }

  fun setLimitEnd(ofs: Vector2) {
    val _arg = Variant.new(ofs)
    __method_bind.setLimitEnd.call(this._handle, _arg, 1)
  }

  fun setScrollBaseOffset(ofs: Vector2) {
    val _arg = Variant.new(ofs)
    __method_bind.setScrollBaseOffset.call(this._handle, _arg, 1)
  }

  fun setScrollBaseScale(scale: Vector2) {
    val _arg = Variant.new(scale)
    __method_bind.setScrollBaseScale.call(this._handle, _arg, 1)
  }

  fun setScrollOffset(ofs: Vector2) {
    val _arg = Variant.new(ofs)
    __method_bind.setScrollOffset.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): ParallaxBackground = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ParallaxBackground".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ParallaxBackground" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ParallaxBackground(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ParallaxBackground = ParallaxBackground(ptr)
    /**
     * Container for method_bind pointers for ParallaxBackground
     */
    private object __method_bind {
      val getLimitBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "getLimitBegin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLimitBegin" }
        }
      val getLimitEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "getLimitEnd".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLimitEnd" }
        }
      val getScrollBaseOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "getScrollBaseOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScrollBaseOffset" }
        }
      val getScrollBaseScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "getScrollBaseScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScrollBaseScale" }
        }
      val getScrollOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "getScrollOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScrollOffset" }
        }
      val isIgnoreCameraZoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "isIgnoreCameraZoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isIgnoreCameraZoom" }
        }
      val setIgnoreCameraZoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "setIgnoreCameraZoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIgnoreCameraZoom" }
        }
      val setLimitBegin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "setLimitBegin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLimitBegin" }
        }
      val setLimitEnd: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "setLimitEnd".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLimitEnd" }
        }
      val setScrollBaseOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "setScrollBaseOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setScrollBaseOffset" }
        }
      val setScrollBaseScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "setScrollBaseScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setScrollBaseScale" }
        }
      val setScrollOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxBackground".cstr.ptr,
            "setScrollOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setScrollOffset" }
        }}
  }
}
