package godot.core

inline fun<T: Any> safe(value: T?) = checkNotNull(value)