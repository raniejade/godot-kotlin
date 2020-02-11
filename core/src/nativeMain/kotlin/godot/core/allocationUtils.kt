package godot.core

import kotlinx.cinterop.*

internal inline fun <reified K: CStructVar> allocType2(noinline cb: MemScope.(CPointer<K>) -> Unit): CValue<K> {
  return Allocator.allocationScope {
    val instance = alloc<K>()
    cb(this, instance.ptr)
    instance.readValue()
  }
}

// TODO: make runtime configurable
@ThreadLocal
object Allocator {
  private var currentScope = mutableListOf<MemScope>()

  internal fun <T> pushContext(cb: () -> T): T {
//    return memScoped {
//      currentScope.add(0, this)
//      val ret = cb()
//      currentScope.removeAt(0)
//      ret
//    }
    return cb()
  }

  internal fun <T> allocationScope(cb: MemScope.() -> T): T {
    // return allocationScopeDeferred(cb)
    return allocationScopeImmediate(cb)
  }

  // de-allocate early when the scope exits
  private fun <T> allocationScopeImmediate(cb: MemScope.() -> T): T {
    return memScoped(cb)
  }

  // de-allocate everything last
  internal fun <T> allocationScopeDeferred(cb: MemScope.() -> T): T {
    return cb(currentScope.first())
  }
}