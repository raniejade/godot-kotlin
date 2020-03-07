// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.PoolVector3Array
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

open class EditorSpatialGizmo(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : SpatialGizmo(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addCollisionSegments(segments: PoolVector3Array) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addCollisionSegments.call(self._handle, listOf(segments), null)
    }
  }

  fun addCollisionTriangles(triangles: TriangleMesh) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addCollisionTriangles.call(self._handle, listOf(triangles), null)
    }
  }

  fun addHandles(
    handles: PoolVector3Array,
    material: Material,
    billboard: Boolean = false,
    secondary: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(handles)
      _args.add(material)
      _args.add(billboard)
      _args.add(secondary)
      __method_bind.addHandles.call(self._handle, _args, null)
    }
  }

  fun addLines(
    lines: PoolVector3Array,
    material: Material,
    billboard: Boolean = false,
    modulate: Color = Color(1,1,1,1)
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(lines)
      _args.add(material)
      _args.add(billboard)
      _args.add(modulate)
      __method_bind.addLines.call(self._handle, _args, null)
    }
  }

  fun addMesh(
    mesh: ArrayMesh,
    billboard: Boolean = false,
    skeleton: SkinReference,
    material: Material
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(mesh)
      _args.add(billboard)
      _args.add(skeleton)
      _args.add(material)
      __method_bind.addMesh.call(self._handle, _args, null)
    }
  }

  fun addUnscaledBillboard(
    material: Material,
    defaultScale: Float = 1.0f,
    modulate: Color = Color(1,1,1,1)
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(material)
      _args.add(defaultScale)
      _args.add(modulate)
      __method_bind.addUnscaledBillboard.call(self._handle, _args, null)
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  open fun commit_handle(
    index: Int,
    restore: Variant,
    cancel: Boolean
  ) {
    TODO()
  }

  open fun get_handle_name(index: Int): String {
    TODO()
  }

  open fun get_handle_value(index: Int): Variant {
    TODO()
  }

  fun getPlugin(): EditorSpatialGizmoPlugin {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: EditorSpatialGizmoPlugin
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getPlugin.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<EditorSpatialGizmoPlugin>(_tmp.value!!)
      _ret
    }
  }

  fun getSpatialNode(): Spatial {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Spatial
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getSpatialNode.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Spatial>(_tmp.value!!)
      _ret
    }
  }

  open fun is_handle_highlighted(index: Int): Boolean {
    TODO()
  }

  open fun redraw() {
    TODO()
  }

  open fun set_handle(
    index: Int,
    camera: Camera,
    point: Vector2
  ) {
    TODO()
  }

  fun setHidden(hidden: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHidden.call(self._handle, listOf(hidden), null)
    }
  }

  fun setSpatialNode(node: Node) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSpatialNode.call(self._handle, listOf(node), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorSpatialGizmo
     */
    private object __method_bind {
      val addCollisionSegments: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "add_collision_segments".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_collision_segments" }
            }
          }

      val addCollisionTriangles: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "add_collision_triangles".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_collision_triangles" }
            }
          }

      val addHandles: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "add_handles".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_handles" }
            }
          }

      val addLines: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "add_lines".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_lines" }
            }
          }

      val addMesh: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "add_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_mesh" }
            }
          }

      val addUnscaledBillboard: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "add_unscaled_billboard".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_unscaled_billboard" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val getPlugin: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "get_plugin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_plugin" }
            }
          }

      val getSpatialNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "get_spatial_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_spatial_node" }
            }
          }

      val setHidden: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "set_hidden".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hidden" }
            }
          }

      val setSpatialNode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorSpatialGizmo".cstr.ptr,
              "set_spatial_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_spatial_node" }
            }
          }
    }
  }
}
