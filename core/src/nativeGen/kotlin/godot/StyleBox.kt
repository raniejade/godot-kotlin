// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
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

open class StyleBox(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var contentMarginBottom: Float
    get() {
       return getDefaultMargin(3) 
    }
    set(value) {
      setDefaultMargin(3, value)
    }

  var contentMarginLeft: Float
    get() {
       return getDefaultMargin(0) 
    }
    set(value) {
      setDefaultMargin(0, value)
    }

  var contentMarginRight: Float
    get() {
       return getDefaultMargin(2) 
    }
    set(value) {
      setDefaultMargin(2, value)
    }

  var contentMarginTop: Float
    get() {
       return getDefaultMargin(1) 
    }
    set(value) {
      setDefaultMargin(1, value)
    }

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun draw(canvasItem: RID, rect: Rect2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(canvasItem)
      _args.add(rect)
      __method_bind.draw.call(self._handle, _args, null)
    }
  }

  fun getCenterSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getCenterSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCurrentItemDrawn(): CanvasItem {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: CanvasItem
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getCurrentItemDrawn.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<CanvasItem>(_tmp.value!!)
      _ret
    }
  }

  fun getDefaultMargin(margin: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDefaultMargin.call(self._handle, listOf(margin), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMargin(margin: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMargin.call(self._handle, listOf(margin), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMinimumSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getMinimumSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getOffset(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getOffset.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setDefaultMargin(margin: Int, offset: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(margin)
      _args.add(offset)
      __method_bind.setDefaultMargin.call(self._handle, _args, null)
    }
  }

  fun testMask(point: Vector2, rect: Rect2): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(point)
      _args.add(rect)
      __method_bind.testMask.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for StyleBox
     */
    private object __method_bind {
      val draw: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "draw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw" }
        }
      val getCenterSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "get_center_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_center_size" }
        }
      val getCurrentItemDrawn: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "get_current_item_drawn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_item_drawn" }
        }
      val getDefaultMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "get_default_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_margin" }
        }
      val getMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "get_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_margin" }
        }
      val getMinimumSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "get_minimum_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_minimum_size" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val setDefaultMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "set_default_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_margin" }
        }
      val testMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
            "test_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method test_mask" }
        }}
  }
}
