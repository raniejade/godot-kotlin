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

open class GeometryInstance internal constructor(
  _handle: COpaquePointer
) : VisualInstance(_handle) {
  companion object {
    val FlagMax: Int = 2

    val FlagUseBakedLight: Int = 0

    val ShadowCastingSettingDoubleSided: Int = 2

    val ShadowCastingSettingOff: Int = 0

    val ShadowCastingSettingOn: Int = 1

    val ShadowCastingSettingShadowsOnly: Int = 3
  }
}
