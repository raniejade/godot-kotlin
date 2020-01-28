// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNode(
  _handle: COpaquePointer
) : Resource(_handle) {
  var filterEnabled: Boolean
    get() {
       return isFilterEnabled() 
    }
    set(value) {
      setFilterEnabled(value)
    }

  var filters: VariantArray
    get() {
       return _getFilters() 
    }
    set(value) {
      _setFilters(value)
    }

  fun addInput(name: String) {
    val _arg = Variant.new(name)
    __method_bind.addInput.call(this._handle, _arg, 1)
  }

  fun blendAnimation(
    animation: String,
    time: Float,
    delta: Float,
    seeked: Boolean,
    blend: Float
  ) {
    val _args = VariantArray.new()
    _args.append(animation)
    _args.append(time)
    _args.append(delta)
    _args.append(seeked)
    _args.append(blend)
    __method_bind.blendAnimation.call(this._handle, _args.toVariant(), 5)
  }

  fun blendInput(
    inputIndex: Int,
    time: Float,
    seek: Boolean,
    blend: Float,
    filter: Int,
    optimize: Boolean
  ): Float {
    val _args = VariantArray.new()
    _args.append(inputIndex)
    _args.append(time)
    _args.append(seek)
    _args.append(blend)
    _args.append(filter)
    _args.append(optimize)
    val _ret = __method_bind.blendInput.call(this._handle, _args.toVariant(), 6)
    return _ret.asFloat()
  }

  fun blendNode(
    name: String,
    node: AnimationNode,
    time: Float,
    seek: Boolean,
    blend: Float,
    filter: Int,
    optimize: Boolean
  ): Float {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(node)
    _args.append(time)
    _args.append(seek)
    _args.append(blend)
    _args.append(filter)
    _args.append(optimize)
    val _ret = __method_bind.blendNode.call(this._handle, _args.toVariant(), 7)
    return _ret.asFloat()
  }

  fun getInputCount(): Int {
    val _ret = __method_bind.getInputCount.call(this._handle)
    return _ret.asInt()
  }

  fun getInputName(input: Int): String {
    val _arg = Variant.new(input)
    val _ret = __method_bind.getInputName.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getParameter(name: String): Variant {
    val _arg = Variant.new(name)
    val _ret = __method_bind.getParameter.call(this._handle, _arg, 1)
    return _ret
  }

  fun isFilterEnabled(): Boolean {
    val _ret = __method_bind.isFilterEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPathFiltered(path: NodePath): Boolean {
    val _arg = Variant.new(path)
    val _ret = __method_bind.isPathFiltered.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun removeInput(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.removeInput.call(this._handle, _arg, 1)
  }

  fun setFilterEnabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setFilterEnabled.call(this._handle, _arg, 1)
  }

  fun setFilterPath(path: NodePath, enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(enable)
    __method_bind.setFilterPath.call(this._handle, _args.toVariant(), 2)
  }

  fun setParameter(name: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(name)
    _args.append(value)
    __method_bind.setParameter.call(this._handle, _args.toVariant(), 2)
  }

  enum class FilterAction(
    val value: Int
  ) {
    FILTER_IGNORE(0),

    FILTER_PASS(1),

    FILTER_STOP(2),

    FILTER_BLEND(3);

    companion object {
      fun from(value: Int): FilterAction {
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
    val FILTER_BLEND: Int = 3

    val FILTER_IGNORE: Int = 0

    val FILTER_PASS: Int = 1

    val FILTER_STOP: Int = 2

    fun new(): AnimationNode = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNode".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNode" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNode(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNode = AnimationNode(ptr)
    /**
     * Container for method_bind pointers for AnimationNode
     */
    private object __method_bind {
      val addInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "addInput".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addInput" }
        }
      val blendAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "blendAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blendAnimation" }
        }
      val blendInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "blendInput".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blendInput" }
        }
      val blendNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "blendNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method blendNode" }
        }
      val getInputCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "getInputCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInputCount" }
        }
      val getInputName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "getInputName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInputName" }
        }
      val getParameter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "getParameter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParameter" }
        }
      val isFilterEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "isFilterEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isFilterEnabled" }
        }
      val isPathFiltered: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "isPathFiltered".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPathFiltered" }
        }
      val removeInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "removeInput".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeInput" }
        }
      val setFilterEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "setFilterEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFilterEnabled" }
        }
      val setFilterPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "setFilterPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFilterPath" }
        }
      val setParameter: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNode".cstr.ptr,
            "setParameter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setParameter" }
        }}
  }
}
