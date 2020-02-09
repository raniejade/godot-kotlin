package godot

import godot.core.Godot
import kotlinx.cinterop.*
import kotlin.native.concurrent.AtomicInt
import kotlin.native.concurrent.AtomicReference
import kotlin.native.concurrent.freeze

@PublishedApi
internal object TagDB {
  private var nextTag = AtomicInt(0)
  private val tags = AtomicReference(mutableMapOf<COpaquePointer, () -> Object>().freeze())

  fun registerType(handle: COpaquePointer, className: String, factory: () -> Object): COpaquePointer {
    val tag = createAndRegisterTag(factory)
    memScoped {
      checkNotNull(Godot.nativescript11.godot_nativescript_set_type_tag)(handle, className.cstr.ptr, tag)
    }
    return tag
  }

  fun registerGlobalType(className: String, factory: () -> Object): COpaquePointer {
    val tag = createAndRegisterTag(factory)
    memScoped {
      checkNotNull(Godot.nativescript11.godot_nativescript_set_global_type_tag)(Godot.languageIndex, className.cstr.ptr, tag)
    }
    return tag
  }

  fun newInstance(tag: COpaquePointer): Object {
    return checkNotNull(tags.value[tag])()
  }

  fun terminate() {
    tags.value.keys.forEach {
      it.asStableRef<Int>().dispose()
    }
  }

  private fun createAndRegisterTag(factory: () -> Object): COpaquePointer {
    val tag = StableRef.create(nextTag.addAndGet(1)).asCPointer()
    val copy = mutableMapOf<COpaquePointer, () -> Object>()
    copy.putAll(tags.value)
    copy[tag] = factory
    tags.compareAndSet(tags.value, copy.freeze())
    return tag
  }
}

class Wrapped(
  val owner: COpaquePointer,
  val tag: COpaquePointer
)