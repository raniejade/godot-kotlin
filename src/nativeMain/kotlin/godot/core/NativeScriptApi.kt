package godot.core

import gdnative.godot_instance_create_func
import gdnative.godot_instance_destroy_func
import godot.Object
import kotlinx.cinterop.*
import kotlin.reflect.KCallable

class NativeScriptApi(val handle: COpaquePointer) {
  // TODO: registerClass, etc...
  inline fun <reified S: Object, reified T: S> registerClass(info: GodotClass<T>) {
    val className = T::class.simpleName!!
    val superClassName = S::class.simpleName!!
    val classHandle = ClassHandle(info)
    info.init()
//    memScoped {
//      val create = cValue<godot_instance_create_func> {
//        create_func = staticCFunction(::createInstance)
//      }
//
//      val destroy = cValue<godot_instance_destroy_func> {
//        destroy_func = staticCFunction(::destroyInstance)
//      }
//
//      checkNotNull(Godot.nativescript.godot_nativescript_register_class)(
//        handle,
//        className.cstr.ptr,
//        superClassName.cstr.ptr,
//        create,
//        destroy
//      )
//    }
  }
}
@PublishedApi
internal class ClassHandle<T: Object>(private val info: GodotClass<T>) {
}

fun createInstance(instance: COpaquePointer?, data: COpaquePointer?): COpaquePointer? {
  val classInfo = checkNotNull(data).asStableRef<GodotClass<Object>>()
    .get()
  val kotlinInstance = classInfo.factory(checkNotNull(instance))
  val stableRef = StableRef.create(kotlinInstance)
  return stableRef.asCPointer()
}

fun destroyInstance(instance: COpaquePointer?, data: COpaquePointer?, classData: COpaquePointer?) {
  val classInfo = checkNotNull(data).asStableRef<GodotClass<Object>>()
    .get()
  val kotlinInstance = checkNotNull(classData).asStableRef<Object>()
    .get()
  kotlinInstance.free()
}

abstract class GodotClass<T>(
  val factory: (COpaquePointer) -> T
) {
  open fun init() {}

  protected inline fun <reified K: (T) -> Unit> registerMethod(method: K) {
    println((method as KCallable<Unit>).name)
  }
}