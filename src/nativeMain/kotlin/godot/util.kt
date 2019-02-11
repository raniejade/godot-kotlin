package godot

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.CPointer

inline fun<T: CPointer<out CFunction<*>>> safeCall(value: T?) = checkNotNull(value)