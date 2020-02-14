// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class AtlasTexture(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Texture(null) {
  var atlas: Texture
    get() {
       return getAtlas() 
    }
    set(value) {
      setAtlas(value)
    }

  var filterClip: Boolean
    get() {
       return hasFilterClip() 
    }
    set(value) {
      setFilterClip(value)
    }

  var margin: Rect2
    get() {
       return getMargin() 
    }
    set(value) {
      setMargin(value)
    }

  var region: Rect2
    get() {
       return getRegion() 
    }
    set(value) {
      setRegion(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for margin
   */
  fun margin(cb: Rect2.() -> Unit) {
    val _p = margin
    cb(_p)
    margin = _p
  }

  /**
   * Specialized setter for region
   */
  fun region(cb: Rect2.() -> Unit) {
    val _p = region
    cb(_p)
    region = _p
  }

  fun getAtlas(): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getAtlas.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getMargin(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getMargin.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRegion(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getRegion.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun hasFilterClip(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasFilterClip.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAtlas(atlas: Texture) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAtlas.call(self._handle, listOf(atlas), null)
    }
  }

  fun setFilterClip(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFilterClip.call(self._handle, listOf(enable), null)
    }
  }

  fun setMargin(margin: Rect2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMargin.call(self._handle, listOf(margin), null)
    }
  }

  fun setRegion(region: Rect2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRegion.call(self._handle, listOf(region), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AtlasTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AtlasTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for AtlasTexture
     */
    private object __method_bind {
      val getAtlas: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "get_atlas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_atlas" }
        }
      val getMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "get_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_margin" }
        }
      val getRegion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "get_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_region" }
        }
      val hasFilterClip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "has_filter_clip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_filter_clip" }
        }
      val setAtlas: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "set_atlas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_atlas" }
        }
      val setFilterClip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "set_filter_clip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_filter_clip" }
        }
      val setMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "set_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_margin" }
        }
      val setRegion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
            "set_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_region" }
        }}
  }
}
