package godot

import gdnative.*
import kotlinx.cinterop.*
import kotlin.native.concurrent.AtomicReference


class NativeScriptApi(private val handle: COpaquePointer) {
    // TODO: register_class
}

object Godot {
    private val _gdnative =  AtomicReference<CPointer<godot_gdnative_core_api_struct>?>(null)
    private val _nativescript =  AtomicReference<CPointer<godot_gdnative_ext_nativescript_api_struct>?>(null)

    internal val gdnative: godot_gdnative_core_api_struct
        get() = checkNotNull(_gdnative.value).pointed

    internal val nativescript: godot_gdnative_ext_nativescript_api_struct
        get() = checkNotNull(_nativescript.value).pointed

    fun init(options: godot_gdnative_init_options) {
        val gdnative = checkNotNull(options.api_struct)
        val extensionCount = gdnative.pointed.num_extensions.toInt()
        val extensions = checkNotNull(gdnative.pointed.extensions)
        lateinit var nativescript: CPointer<godot_gdnative_ext_nativescript_api_struct>
        (0..extensionCount).forEach { i ->
            val extension = checkNotNull(extensions[i])
            when (extension.pointed.type) {
                GDNATIVE_API_TYPES.GDNATIVE_EXT_NATIVESCRIPT.value -> {
                    nativescript = extension.reinterpret()
                }
                else -> {}
            }
        }

        _gdnative.compareAndSwap(null, gdnative)
        _nativescript.compareAndSwap(null, nativescript)
    }

    fun terminate(options: godot_gdnative_terminate_options) {
        _gdnative.compareAndSwap(_gdnative.value, null)
        _nativescript.compareAndSwap(_nativescript.value, null)
    }

    fun nativescriptInit(handle: COpaquePointer, setup: NativeScriptApi.() -> Unit) {
        setup(NativeScriptApi(handle))
    }

    fun print(msg: String) {
        safeCall(Godot.gdnative.godot_print)(GDString.new(msg)._handle.ptr)
    }
}