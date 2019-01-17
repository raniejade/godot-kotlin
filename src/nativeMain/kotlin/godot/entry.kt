package godot

import gdnative.*
import godot.core.Vector2
import kotlinx.cinterop.*
import kotlin.native.concurrent.AtomicReference

private val _gdnative =  AtomicReference<CPointer<godot_gdnative_core_api_struct>?>(null)
private val _nativescript =  AtomicReference<CPointer<godot_gdnative_ext_nativescript_api_struct>?>(null)

internal object Godot {
    val gdnative: godot_gdnative_core_api_struct
        get() = checkNotNull(_gdnative.value).pointed

    val nativescript: godot_gdnative_ext_nativescript_api_struct
        get() = checkNotNull(_nativescript.value).pointed
}

fun gdnative_init(options: godot_gdnative_init_options) {
    val gdnative = checkNotNull(options.api_struct)
    val extensionCount = gdnative.pointed.num_extensions.toInt()
    val extensions = checkNotNull(gdnative.pointed.extensions)
    lateinit var nativescript: CPointer<godot_gdnative_ext_nativescript_api_struct>
    (0..extensionCount).forEach { i ->
        val extension = checkNotNull(extensions[i])
        when (extension.pointed.type) {
            GDNATIVE_API_TYPES.GDNATIVE_EXT_NATIVESCRIPT.value -> nativescript = extension.reinterpret()
        }
    }

    _gdnative.compareAndSwap(null, gdnative)
    _nativescript.compareAndSwap(null, nativescript)
}

fun gdnative_terminate(options: godot_gdnative_terminate_options) {
    _gdnative.compareAndSwap(_gdnative.value, null)
    _nativescript.compareAndSwap(_nativescript.value, null)
}

fun nativescript_init(handle: COpaquePointer) {
    val v = Vector2.new()
    godot.core.print("$v")
}
