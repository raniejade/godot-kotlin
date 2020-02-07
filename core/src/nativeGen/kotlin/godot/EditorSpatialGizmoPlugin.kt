// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class EditorSpatialGizmoPlugin(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun addMaterial(name: String, material: SpatialMaterial) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(material))
    __method_bind.addMaterial.call(this._handle, _args)
  }

  fun createHandleMaterial(name: String, billboard: Boolean = false) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(billboard))
    __method_bind.createHandleMaterial.call(this._handle, _args)
  }

  fun createIconMaterial(
    name: String,
    texture: Texture,
    onTop: Boolean = false,
    color: Color = Color(1,1,1,1)
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(texture))
    _args.add(Variant.fromAny(onTop))
    _args.add(Variant.fromAny(color))
    __method_bind.createIconMaterial.call(this._handle, _args)
  }

  fun createMaterial(
    name: String,
    color: Color,
    billboard: Boolean = false,
    onTop: Boolean = false,
    useVertexColor: Boolean = false
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(color))
    _args.add(Variant.fromAny(billboard))
    _args.add(Variant.fromAny(onTop))
    _args.add(Variant.fromAny(useVertexColor))
    __method_bind.createMaterial.call(this._handle, _args)
  }

  fun getMaterial(name: String, gizmo: EditorSpatialGizmo): SpatialMaterial {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(gizmo))
    val _ret = __method_bind.getMaterial.call(this._handle, _args)
    return _ret.asObject(::SpatialMaterial)!!
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorSpatialGizmoPlugin
     */
    private object __method_bind {
      val addMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
            "add_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_material" }
        }
      val createHandleMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
            "create_handle_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_handle_material" }
        }
      val createIconMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
            "create_icon_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_icon_material" }
        }
      val createMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
            "create_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_material" }
        }
      val getMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmoPlugin".cstr.ptr,
            "get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_material" }
        }}
  }
}
