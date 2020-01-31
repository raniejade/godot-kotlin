package godot.core

import gdnative.godot_property_hint
import godot.Resource

class PropertyHint<T>(
  val hint: godot_property_hint = godot_property_hint.GODOT_PROPERTY_HINT_NONE,
  val hintString: String = ""
) {
  companion object {
    fun <T: Any> none() = PropertyHint<T>()
    fun range(start: Int, end: Int) = PropertyHint<Int>(
      godot_property_hint.GODOT_PROPERTY_HINT_RANGE,
      "$start, $end"
    )
    fun range(end: Int) = range(0, end)
    fun range(start: Float, end: Float, step: Float = 0.1f) = PropertyHint<Float>(
      godot_property_hint.GODOT_PROPERTY_HINT_RANGE,
      "$start, $end, $step"
    )
    fun ease() = PropertyHint<Float>(godot_property_hint.GODOT_PROPERTY_HINT_EXP_EASING)
    fun exp(start: Float, end: Float, step: Float = 1f) = PropertyHint<Float>(
      godot_property_hint.GODOT_PROPERTY_HINT_EXP_EASING,
      "$start, $end, $step"
    )
    fun rgb() = PropertyHint<Color>(godot_property_hint.GODOT_PROPERTY_HINT_COLOR_NO_ALPHA)
    fun rgba() = PropertyHint<Color>()
    fun multiline() = PropertyHint<String>(
      godot_property_hint.GODOT_PROPERTY_HINT_MULTILINE_TEXT
    )
    fun file(global: Boolean = false, filter: String = "*.*") = PropertyHint<String>(
      if (global) godot_property_hint.GODOT_PROPERTY_HINT_GLOBAL_FILE else godot_property_hint.GODOT_PROPERTY_HINT_FILE,
      filter
    )
    fun directory(global: Boolean = false) = PropertyHint<String>(
      if (global) godot_property_hint.GODOT_PROPERTY_HINT_GLOBAL_DIR else godot_property_hint.GODOT_PROPERTY_HINT_DIR
    )
    inline fun <reified R: Resource> resource() = PropertyHint<R>(
      godot_property_hint.GODOT_PROPERTY_HINT_RESOURCE_TYPE,
      checkNotNull(R::class.simpleName)
    )
  }
}