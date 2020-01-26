// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Node internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  enum class PauseMode(
    val value: Int
  ) {
    PAUSE_MODE_INHERIT(0),

    PAUSE_MODE_STOP(1),

    PAUSE_MODE_PROCESS(2);
  }

  enum class DuplicateFlags(
    val value: Int
  ) {
    DUPLICATE_SIGNALS(1),

    DUPLICATE_GROUPS(2),

    DUPLICATE_SCRIPTS(4),

    DUPLICATE_USE_INSTANCING(8);
  }

  companion object {
    val DUPLICATE_GROUPS: Int = 2

    val DUPLICATE_SCRIPTS: Int = 4

    val DUPLICATE_SIGNALS: Int = 1

    val DUPLICATE_USE_INSTANCING: Int = 8

    val NOTIFICATION_CRASH: Int = 1012

    val NOTIFICATION_DRAG_BEGIN: Int = 21

    val NOTIFICATION_DRAG_END: Int = 22

    val NOTIFICATION_ENTER_TREE: Int = 10

    val NOTIFICATION_EXIT_TREE: Int = 11

    val NOTIFICATION_INSTANCED: Int = 20

    val NOTIFICATION_INTERNAL_PHYSICS_PROCESS: Int = 26

    val NOTIFICATION_INTERNAL_PROCESS: Int = 25

    val NOTIFICATION_MOVED_IN_PARENT: Int = 12

    val NOTIFICATION_OS_IME_UPDATE: Int = 1013

    val NOTIFICATION_OS_MEMORY_WARNING: Int = 1009

    val NOTIFICATION_PARENTED: Int = 18

    val NOTIFICATION_PATH_CHANGED: Int = 23

    val NOTIFICATION_PAUSED: Int = 14

    val NOTIFICATION_PHYSICS_PROCESS: Int = 16

    val NOTIFICATION_PROCESS: Int = 17

    val NOTIFICATION_READY: Int = 13

    val NOTIFICATION_TRANSLATION_CHANGED: Int = 1010

    val NOTIFICATION_UNPARENTED: Int = 19

    val NOTIFICATION_UNPAUSED: Int = 15

    val NOTIFICATION_WM_ABOUT: Int = 1011

    val NOTIFICATION_WM_FOCUS_IN: Int = 1004

    val NOTIFICATION_WM_FOCUS_OUT: Int = 1005

    val NOTIFICATION_WM_GO_BACK_REQUEST: Int = 1007

    val NOTIFICATION_WM_MOUSE_ENTER: Int = 1002

    val NOTIFICATION_WM_MOUSE_EXIT: Int = 1003

    val NOTIFICATION_WM_QUIT_REQUEST: Int = 1006

    val NOTIFICATION_WM_UNFOCUS_REQUEST: Int = 1008

    val PAUSE_MODE_INHERIT: Int = 0

    val PAUSE_MODE_PROCESS: Int = 2

    val PAUSE_MODE_STOP: Int = 1

    fun new(): Node = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Node".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Node" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Node(
        fn()
      )
    }}
}
