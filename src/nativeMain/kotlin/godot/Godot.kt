package godot

import gdnative.*
import kotlinx.cinterop.*
import kotlin.native.concurrent.AtomicReference

object Godot {
  private val gdnativeWrapper = AtomicReference<CPointer<godot_gdnative_core_api_struct>?>(null)
  private val nativescriptWrapper = AtomicReference<CPointer<godot_gdnative_ext_nativescript_api_struct>?>(null)

  internal val gdnative: godot_gdnative_core_api_struct
    get() = checkNotNull(gdnativeWrapper.value).pointed

  internal val nativescript: godot_gdnative_ext_nativescript_api_struct
    get() = checkNotNull(nativescriptWrapper.value).pointed

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
        else -> {
        }
      }
    }

    gdnativeWrapper.compareAndSwap(null, gdnative)
    nativescriptWrapper.compareAndSwap(null, nativescript)
  }

  fun terminate(options: godot_gdnative_terminate_options) {
    gdnativeWrapper.compareAndSwap(gdnativeWrapper.value, null)
    nativescriptWrapper.compareAndSwap(nativescriptWrapper.value, null)
  }

  fun nativescriptInit(handle: COpaquePointer, setup: NativeScriptApi.() -> Unit) {
    setup(NativeScriptApi(handle))
  }

  fun print(msg: String) {
    with(GDContext()) {
      val gdString = GDString.new()
      memScoped {
        checkNotNull(gdnative.godot_string_parse_utf8)(gdString.handle.ptr, msg.cstr.ptr)
      }
      checkNotNull(gdnative.godot_print)(gdString.handle.ptr)
    }
  }
}