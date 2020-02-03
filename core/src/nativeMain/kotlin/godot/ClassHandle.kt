package godot

import gdnative.godot_instance_create_func
import gdnative.godot_instance_destroy_func
import godot.core.Godot
import kotlinx.cinterop.*

class ClassHandle<S: Object, T: S>(
  handle: COpaquePointer,
  className: String,
  val superClassName: String,
  val info: GodotClass<S, T>
) : ClassMemberRegistry<T>(handle, className) {
  fun create(instance: COpaquePointer): T {
    return info.factory(instance)
  }

  fun init() {
    memScoped {
      val methodData = StableRef.create(this@ClassHandle).asCPointer()
      // register constructor and destructor
      val create = cValue<godot_instance_create_func> {
        create_func = staticCFunction(::createInstance)
        method_data = methodData
      }
      val destroy = cValue<godot_instance_destroy_func> {
        destroy_func = staticCFunction(::destroyInstance)
        method_data = methodData
      }
      checkNotNull(Godot.nativescript.godot_nativescript_register_class)(
        handle,
        className.cstr.ptr,
        superClassName.cstr.ptr,
        create,
        destroy
      )
    }

    info.setup(this)
  }
}