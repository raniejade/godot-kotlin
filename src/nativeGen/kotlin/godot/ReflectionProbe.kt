// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ReflectionProbe internal constructor(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
  fun areShadowsEnabled(): Boolean {
    TODO()
  }

  fun getCullMask(): Int {
    TODO()
  }

  fun getExtents(): Vector3 {
    TODO()
  }

  fun getIntensity(): Float {
    TODO()
  }

  fun getInteriorAmbient(): Color {
    TODO()
  }

  fun getInteriorAmbientEnergy(): Float {
    TODO()
  }

  fun getInteriorAmbientProbeContribution(): Float {
    TODO()
  }

  fun getMaxDistance(): Float {
    TODO()
  }

  fun getOriginOffset(): Vector3 {
    TODO()
  }

  fun getUpdateMode(): UpdateMode {
    TODO()
  }

  fun isBoxProjectionEnabled(): Boolean {
    TODO()
  }

  fun isSetAsInterior(): Boolean {
    TODO()
  }

  fun setAsInterior(enable: Boolean) {
    TODO()
  }

  fun setCullMask(layers: Int) {
    TODO()
  }

  fun setEnableBoxProjection(enable: Boolean) {
    TODO()
  }

  fun setEnableShadows(enable: Boolean) {
    TODO()
  }

  fun setExtents(extents: Vector3) {
    TODO()
  }

  fun setIntensity(intensity: Float) {
    TODO()
  }

  fun setInteriorAmbient(ambient: Color) {
    TODO()
  }

  fun setInteriorAmbientEnergy(ambient_energy: Float) {
    TODO()
  }

  fun setInteriorAmbientProbeContribution(ambient_probe_contribution: Float) {
    TODO()
  }

  fun setMaxDistance(max_distance: Float) {
    TODO()
  }

  fun setOriginOffset(origin_offset: Vector3) {
    TODO()
  }

  fun setUpdateMode(mode: Int) {
    TODO()
  }

  enum class UpdateMode(
    val value: Int
  ) {
    UPDATE_ONCE(0),

    UPDATE_ALWAYS(1);

    companion object {
      fun from(value: Int): UpdateMode {
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
    val UPDATE_ALWAYS: Int = 1

    val UPDATE_ONCE: Int = 0

    fun new(): ReflectionProbe = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ReflectionProbe".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ReflectionProbe" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ReflectionProbe(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ReflectionProbe = ReflectionProbe(ptr)
    /**
     * Container for method_bind pointers for ReflectionProbe
     */
    private object __method_bind {
      val are_shadows_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "are_shadows_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method are_shadows_enabled" }
            }
          }

      val get_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cull_mask" }
            }
          }

      val get_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_extents" }
            }
          }

      val get_intensity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_intensity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_intensity" }
            }
          }

      val get_interior_ambient: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_interior_ambient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_interior_ambient" }
            }
          }

      val get_interior_ambient_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_interior_ambient_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_interior_ambient_energy" }
            }
          }

      val get_interior_ambient_probe_contribution: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_interior_ambient_probe_contribution".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_interior_ambient_probe_contribution" }
            }
          }

      val get_max_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_max_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_distance" }
            }
          }

      val get_origin_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_origin_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_origin_offset" }
            }
          }

      val get_update_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "get_update_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_update_mode" }
            }
          }

      val is_box_projection_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "is_box_projection_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_box_projection_enabled" }
            }
          }

      val is_set_as_interior: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "is_set_as_interior".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_set_as_interior" }
            }
          }

      val set_as_interior: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_as_interior".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_as_interior" }
            }
          }

      val set_cull_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_cull_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cull_mask" }
            }
          }

      val set_enable_box_projection: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_enable_box_projection".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enable_box_projection" }
            }
          }

      val set_enable_shadows: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_enable_shadows".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enable_shadows" }
            }
          }

      val set_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_extents" }
            }
          }

      val set_intensity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_intensity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_intensity" }
            }
          }

      val set_interior_ambient: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_interior_ambient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_interior_ambient" }
            }
          }

      val set_interior_ambient_energy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_interior_ambient_energy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_interior_ambient_energy" }
            }
          }

      val set_interior_ambient_probe_contribution: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_interior_ambient_probe_contribution".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_interior_ambient_probe_contribution" }
            }
          }

      val set_max_distance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_max_distance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_distance" }
            }
          }

      val set_origin_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_origin_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_origin_offset" }
            }
          }

      val set_update_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ReflectionProbe".cstr.ptr,
              "set_update_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_update_mode" }
            }
          }
    }
  }
}
