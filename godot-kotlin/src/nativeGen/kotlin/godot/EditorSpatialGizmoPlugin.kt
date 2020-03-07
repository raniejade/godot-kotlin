// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
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

open class EditorSpatialGizmoPlugin(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addMaterial(name: String, material: SpatialMaterial) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(material)
      __method_bind.addMaterial.call(self._handle, _args, null)
    }
  }

  open fun can_be_hidden(): Boolean {
    TODO()
  }

  open fun commit_handle(
    gizmo: EditorSpatialGizmo,
    index: Int,
    restore: Variant,
    cancel: Boolean
  ) {
    TODO()
  }

  open fun create_gizmo(spatial: Spatial): EditorSpatialGizmo {
    TODO()
  }

  fun createHandleMaterial(name: String, billboard: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(billboard)
      __method_bind.createHandleMaterial.call(self._handle, _args, null)
    }
  }

  fun createIconMaterial(
    name: String,
    texture: Texture,
    onTop: Boolean = false,
    color: Color = Color(1,1,1,1)
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(texture)
      _args.add(onTop)
      _args.add(color)
      __method_bind.createIconMaterial.call(self._handle, _args, null)
    }
  }

  fun createMaterial(
    name: String,
    color: Color,
    billboard: Boolean = false,
    onTop: Boolean = false,
    useVertexColor: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(color)
      _args.add(billboard)
      _args.add(onTop)
      _args.add(useVertexColor)
      __method_bind.createMaterial.call(self._handle, _args, null)
    }
  }

  open fun get_handle_name(gizmo: EditorSpatialGizmo, index: Int): String {
    TODO()
  }

  open fun get_handle_value(gizmo: EditorSpatialGizmo, index: Int): Variant {
    TODO()
  }

  fun getMaterial(name: String, gizmo: EditorSpatialGizmo): SpatialMaterial {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: SpatialMaterial
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(gizmo)
      __method_bind.getMaterial.call(self._handle, _args, _retPtr)
      _ret = objectToType<SpatialMaterial>(_tmp.value!!)
      _ret
    }
  }

  open fun get_priority(): String {
    TODO()
  }

  open fun has_gizmo(spatial: Spatial): Boolean {
    TODO()
  }

  open fun is_handle_highlighted(gizmo: EditorSpatialGizmo, index: Int): Boolean {
    TODO()
  }

  open fun is_selectable_when_hidden(): Boolean {
    TODO()
  }

  open fun redraw(gizmo: EditorSpatialGizmo) {
    TODO()
  }

  open fun set_handle(
    gizmo: EditorSpatialGizmo,
    index: Int,
    camera: Camera,
    point: Vector2
  ) {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorSpatialGizmoPlugin
     */
    private object __method_bind {
      val addMaterial: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "add_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_material" }
            }
          }

      val createHandleMaterial: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "create_handle_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_handle_material" }
            }
          }

      val createIconMaterial: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "create_icon_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_icon_material" }
            }
          }

      val createMaterial: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "create_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_material" }
            }
          }

      val getMaterial: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
              "get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_material" }
            }
          }
    }
  }
}
