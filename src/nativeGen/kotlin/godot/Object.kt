// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import kotlin.Int
import kotlinx.cinterop.COpaquePointer

open class Object internal constructor(
  internal val _handle: COpaquePointer
) {
  companion object {
    val ConnectDeferred: Int = 1

    val ConnectOneshot: Int = 4

    val ConnectPersist: Int = 2

    val ConnectReferenceCounted: Int = 8

    val NotificationPostinitialize: Int = 0

    val NotificationPredelete: Int = 1

    fun new(): Object {
      TODO()
    }
  }
}
