// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Sky internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getRadianceSize(): RadianceSize {
    val _ret = __method_bind.get_radiance_size.call(this.toVariant())
    TODO()
  }

  fun setRadianceSize(size: Int) {
    val _args = VariantArray.new()
    _args.append(size)
    val _ret = __method_bind.set_radiance_size.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  enum class RadianceSize(
    val value: Int
  ) {
    RADIANCE_SIZE_32(0),

    RADIANCE_SIZE_64(1),

    RADIANCE_SIZE_128(2),

    RADIANCE_SIZE_256(3),

    RADIANCE_SIZE_512(4),

    RADIANCE_SIZE_1024(5),

    RADIANCE_SIZE_2048(6),

    RADIANCE_SIZE_MAX(7);

    companion object {
      fun from(value: Int): RadianceSize {
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
    val RADIANCE_SIZE_1024: Int = 5

    val RADIANCE_SIZE_128: Int = 2

    val RADIANCE_SIZE_2048: Int = 6

    val RADIANCE_SIZE_256: Int = 3

    val RADIANCE_SIZE_32: Int = 0

    val RADIANCE_SIZE_512: Int = 4

    val RADIANCE_SIZE_64: Int = 1

    val RADIANCE_SIZE_MAX: Int = 7

    /**
     * Container for method_bind pointers for Sky
     */
    private object __method_bind {
      val get_radiance_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sky".cstr.ptr,
              "get_radiance_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_radiance_size" }
            }
          }

      val set_radiance_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Sky".cstr.ptr,
              "set_radiance_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_radiance_size" }
            }
          }
    }
  }
}
