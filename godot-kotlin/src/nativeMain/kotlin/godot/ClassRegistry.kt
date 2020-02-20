package godot

import kotlinx.cinterop.COpaquePointer

class ClassRegistry(val handle: COpaquePointer) {
  inline fun <reified S: Object, reified T: S> registerClass(info: GodotClass<S, T>, isTool: Boolean = false) {
    val className = T::class.simpleName!!
    val superClassName = S::class.simpleName!!
    val classHandle = ClassHandle(handle, className, superClassName, info, isTool)
    classHandle.init()
  }
}