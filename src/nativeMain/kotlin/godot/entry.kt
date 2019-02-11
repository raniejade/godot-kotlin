package godot

import gdnative.*
import kotlinx.cinterop.*
import kotlin.native.concurrent.AtomicReference
import kotlin.native.concurrent.freeze
import kotlin.native.ref.WeakReference

private val _gdnative =  AtomicReference<CPointer<godot_gdnative_core_api_struct>?>(null)
private val _nativescript =  AtomicReference<CPointer<godot_gdnative_ext_nativescript_api_struct>?>(null)

internal interface GDObject {
    fun free()
}

internal fun<T: GDObject> T.track(): T {
    Godot.track(this)
    return this
}

internal object Godot {
    val gdnative: godot_gdnative_core_api_struct
        get() = checkNotNull(_gdnative.value).pointed

    val nativescript: godot_gdnative_ext_nativescript_api_struct
        get() = checkNotNull(_nativescript.value).pointed


    private val refs = AtomicReference<List<WeakReference<out GDObject>>>(listOf())

    fun<T: GDObject> track(obj: T): T {
        val weakRef = WeakReference(obj)
        val oldVal = refs.value
        val newVal = mutableListOf<WeakReference<out GDObject>>()
        newVal.addAll(oldVal)
        newVal.add(weakRef)
        newVal.freeze()
        refs.compareAndSwap(oldVal, newVal)
        return obj
    }
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
    print("$v")
}
