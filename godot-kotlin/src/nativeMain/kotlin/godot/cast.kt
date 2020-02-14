package godot

import godot.core.Allocator
import godot.core.Godot
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke

fun <T: Object> objectToType(ptr: COpaquePointer): T {
  return ptrToObject(ptr) as T
}

fun ptrToObject(ptr: COpaquePointer): Object {
  return Allocator.allocationScope {
    val obj = Godot.noInitZone { Object() }
    obj._handle = ptr
    val className = obj.getClass()
    // binding defined type
    // this should be first otherwise casting to a user defined type won't work!
    var tag = checkNotNull(Godot.nativescript11.godot_nativescript_get_type_tag)(ptr)
    // engine type
    if (tag == null) {
      tag = checkNotNull(Godot.nativescript11.godot_nativescript_get_global_type_tag)(Godot.languageIndex, className.cstr.ptr)
    }
    // parent class of an engine type (this is here for types not exposed by gdnative)
    if (tag == null) {
      var parentClass = ClassDB.getParentClass(className)
      while (parentClass.isNotEmpty()) {
        tag = checkNotNull(Godot.nativescript11.godot_nativescript_get_global_type_tag)(Godot.languageIndex, parentClass.cstr.ptr)
        if (tag != null) {
          break
        }
        parentClass = ClassDB.getParentClass(parentClass)
      }
    }
    if (tag != null) {
      val cast = Godot.noInitZone {
        TagDB.newInstance(tag)
      }
      cast._handle = ptr
      cast
    } else {
      throw UnsupportedOperationException("Unknown type.")
    }
  }
}