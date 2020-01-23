package godot

import gdnative.godot_color
import kotlinx.cinterop.*

class Color(
  value: CValue<godot_color>
) : Primitive<godot_color>(value) {
  val r: Float
    get() {
      return memScoped { checkNotNull(Godot.gdnative.godot_color_get_r)(_value.ptr) }
    }
  val g: Float
    get() {
      return memScoped { checkNotNull(Godot.gdnative.godot_color_get_g)(_value.ptr) }
    }
  val b: Float
    get() {
      return memScoped { checkNotNull(Godot.gdnative.godot_color_get_b)(_value.ptr) }
    }

  val h: Float
    get() {
      return memScoped { checkNotNull(Godot.gdnative.godot_color_get_h)(_value.ptr) }
    }
  val s: Float
    get() {
      return memScoped { checkNotNull(Godot.gdnative.godot_color_get_s)(_value.ptr) }
    }
  val v: Float
    get() {
      return memScoped { checkNotNull(Godot.gdnative.godot_color_get_v)(_value.ptr) }
    }

  val a: Float
    get() {
      return memScoped { checkNotNull(Godot.gdnative.godot_color_get_a)(_value.ptr) }
    }

  fun blend(over: Color): Color {
    return memScoped {
      Color(
        checkNotNull(Godot.gdnative.godot_color_blend)(_value.ptr, over._value.ptr)
      )
    }
  }

  fun contrasted(): Color {
    return memScoped {
      Color(
        checkNotNull(Godot.gdnative.godot_color_contrasted)(_value.ptr)
      )
    }
  }

  fun gray(): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_color_gray)(_value.ptr)
    }
  }

  fun inverted(): Color {
    return memScoped {
      Color(
        checkNotNull(Godot.gdnative.godot_color_inverted)(_value.ptr)
      )
    }
  }

  fun linearInterpolate(b: Color, t: Float): Color {
    return memScoped {
      Color(
        checkNotNull(Godot.gdnative.godot_color_linear_interpolate)(_value.ptr, b._value.ptr, t)
      )
    }
  }

  fun toABGR32(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_color_to_argb32)(_value.ptr)
    }
  }

  fun toRGBA32(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_color_to_rgba32)(_value.ptr)
    }
  }

  fun toHtml(withAlpha: Boolean = true): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_color_to_html)(_value.ptr, withAlpha)
      )
    }
  }

  companion object {
    fun rgb(r: Float, g: Float, b: Float, a: Float = 1f): Color {
      val value = memScoped {
        val tmp = alloc<godot_color>()
        checkNotNull(Godot.gdnative.godot_color_new_rgba)(tmp.ptr, r, g, b, a)
        tmp.readValue()
      }
      return Color(value)
    }

    // COLOR CONSTANTS
    val gray = rgb(0.75f, 0.75f, 0.75f)
    val aliceBlue = rgb(0.94f, 0.97f, 1f)
    val antiqueWhite = rgb(0.98f, 0.92f, 0.84f)
    val aqua = rgb(0f, 1f, 1f)
    val aquamarine = rgb(0.5f, 1f, 0.83f)
    val azure = rgb(0.94f, 1f, 1f)
    val beige = rgb(0.96f, 0.96f, 0.86f)
    val bisque = rgb(1f, 0.89f, 0.77f)
    val black = rgb(0f, 0f, 0f)
    val blanchedAlmond = rgb(1f, 0.92f, 0.8f)
    val blue = rgb(0f, 0f, 1f)
    val blueViolet = rgb(0.54f, 0.17f, 0.89f)
    val brown = rgb(0.65f, 0.16f, 0.16f)
    val burlywood = rgb(0.87f, 0.72f, 0.53f)
    val cadetBlue = rgb(0.37f, 0.62f, 0.63f)
    val chartreuse = rgb(0.5f, 1f, 0f)
    val chocolate = rgb(0.82f, 0.41f, 0.12f)
    val coral = rgb(1f, 0.5f, 0.31f)
    val cornFlower = rgb(0.39f, 0.58f, 0.93f)
    val cornSilk = rgb(1f, 0.97f, 0.86f)
    val crimson = rgb(0.86f, 0.08f, 0.24f)
    val cyan = rgb(0f, 1f, 1f)
    val darkBlue = rgb(0f, 0f, 0.55f)
    val darkCyan = rgb(0f, 0.55f, 0.55f)
    val darkGoldenRod = rgb(0.72f, 0.53f, 0.04f)
    val darkGray = rgb(0.66f, 0.66f, 0.66f)
    val darkGreen = rgb(0f, 0.39f, 0f)
    val darkKhaki = rgb(0.74f, 0.72f, 0.42f)
    val darkMagenta = rgb(0.55f, 0f, 0.55f)
    val darkOliveGreen = rgb(0.33f, 0.42f, 0.18f)
    val darkOrange = rgb(1f, 0.55f, 0f)
    val darkOrchid = rgb(0.6f, 0.2f, 0.8f)
    val darkRed = rgb(0.55f, 0f, 0f)
    val darkSalmon = rgb(0.91f, 0.59f, 0.48f)
    val darkSeaGreen = rgb(0.56f, 0.74f, 0.56f)
    val darkSlateBlue = rgb(0.28f, 0.24f, 0.55f)
    val darkSlateGray = rgb(0.18f, 0.31f, 0.31f)
    val darkTurquoise = rgb(0f, 0.81f, 0.82f)
    val darkViolet = rgb(0.58f, 0f, 0.83f)
    val deepPink = rgb(1f, 0.08f, 0.58f)
    val deepSkyBlue = rgb(0f, 0.75f, 1f)
    val dimGray = rgb(0.41f, 0.41f, 0.41f)
    val dodgerBlue = rgb(0.12f, 0.56f, 1f)
    val fireBrick = rgb(0.7f, 0.13f, 0.13f)
    val floralWhite = rgb(1f, 0.98f, 0.94f)
    val forestGreen = rgb(0.13f, 0.55f, 0.13f)
    val fuchsia = rgb(1f, 0f, 1f)
    val gainsboro = rgb(0.86f, 0.86f, 0.86f)
    val ghostWhite = rgb(0.97f, 0.97f, 1f)
    val gold = rgb(1f, 0.84f, 0f)
    val goldenRod = rgb(0.85f, 0.65f, 0.13f)
    val green = rgb(0f, 1f, 0f)
    val greenYellow = rgb(0.68f, 1f, 0.18f)
    val honeyDew = rgb(0.94f, 1f, 0.94f)
    val hotPink = rgb(1f, 0.41f, 0.71f)
    val indianRed = rgb(0.8f, 0.36f, 0.36f)
    val indigo = rgb(0.29f, 0f, 0.51f)
    val ivory = rgb(1f, 1f, 0.94f)
    val khaki = rgb(0.94f, 0.9f, 0.55f)
    val lavender = rgb(0.9f, 0.9f, 0.98f)
    val lavenderBlush = rgb(1f, 0.94f, 0.96f)
    val lawnGreen = rgb(0.49f, 0.99f, 0f)
    val lemonChiffon = rgb(1f, 0.98f, 0.8f)
    val lightBlue = rgb(0.68f, 0.85f, 0.9f)
    val lightCoral = rgb(0.94f, 0.5f, 0.5f)
    val lightCyan = rgb(0.88f, 1f, 1f)
    val lightGoldenRod = rgb(0.98f, 0.98f, 0.82f)
    val lightGray = rgb(0.83f, 0.83f, 0.83f)
    val lightGreen = rgb(0.56f, 0.93f, 0.56f)
    val lightPink = rgb(1f, 0.71f, 0.76f)
    val lightSalmon = rgb(1f, 0.63f, 0.48f)
    val lightSeaGreen = rgb(0.13f, 0.7f, 0.67f)
    val lightSkyBlue = rgb(0.53f, 0.81f, 0.98f)
    val lightSlateGray = rgb(0.47f, 0.53f, 0.6f)
    val lightSteelBlue = rgb(0.69f, 0.77f, 0.87f)
    val lightYellow = rgb(1f, 1f, 0.88f)
    val lime = rgb(0f, 1f, 0f)
    val limeGreen = rgb(0.2f, 0.8f, 0.2f)
    val linen = rgb(0.98f, 0.94f, 0.9f)
    val magenta = rgb(1f, 0f, 1f)
    val maroon = rgb(0.69f, 0.19f, 0.38f)
    val mediumAquamarine = rgb(0.4f, 0.8f, 0.67f)
    val mediumBlue = rgb(0f, 0f, 0.8f)
    val mediumOrchid = rgb(0.73f, 0.33f, 0.83f)
    val mediumPurple = rgb(0.58f, 0.44f, 0.86f)
    val mediumSeaGreen = rgb(0.24f, 0.7f, 0.44f)
    val mediumSlateBlue = rgb(0.48f, 0.41f, 0.93f)
    val mediumSpringGreen = rgb(0f, 0.98f, 0.6f)
    val mediumTurquoise = rgb(0.28f, 0.82f, 0.8f)
    val mediumVioletRed = rgb(0.78f, 0.08f, 0.52f)
    val midnightBlue = rgb(0.1f, 0.1f, 0.44f)
    val mintCream = rgb(0.96f, 1f, 0.98f)
    val mistyRose = rgb(1f, 0.89f, 0.88f)
    val moccasin = rgb(1f, 0.89f, 0.71f)
    val navajoWhite = rgb(1f, 0.87f, 0.68f)
    val navyBlue = rgb(0f, 0f, 0.5f)
    val oldLace = rgb(0.99f, 0.96f, 0.9f)
    val olive = rgb(0.5f, 0.5f, 0f)
    val oliveDrab = rgb(0.42f, 0.56f, 0.14f)
    val orange = rgb(1f, 0.65f, 0f)
    val orangeRed = rgb(1f, 0.27f, 0f)
    val orchid = rgb(0.85f, 0.44f, 0.84f)
    val paleGoldenRod = rgb(0.93f, 0.91f, 0.67f)
    val paleGreen = rgb(0.6f, 0.98f, 0.6f)
    val paleTurquoise = rgb(0.69f, 0.93f, 0.93f)
    val paleVioletRed = rgb(0.86f, 0.44f, 0.58f)
    val papayaWhip = rgb(1f, 0.94f, 0.84f)
    val peachPuff = rgb(1f, 0.85f, 0.73f)
    val peru = rgb(0.8f, 0.52f, 0.25f)
    val pink = rgb(1f, 0.75f, 0.8f)
    val plum = rgb(0.87f, 0.63f, 0.87f)
    val powderBlue = rgb(0.69f, 0.88f, 0.9f)
    val purple = rgb(0.63f, 0.13f, 0.94f)
    val rebeccaPurple = rgb(0.4f, 0.2f, 0.6f)
    val red = rgb(1f, 0f, 0f)
    val rosyBrown = rgb(0.74f, 0.56f, 0.56f)
    val royalBlue = rgb(0.25f, 0.41f, 0.88f)
    val saddleBrown = rgb(0.55f, 0.27f, 0.07f)
    val salmon = rgb(0.98f, 0.5f, 0.45f)
    val sandyBrown = rgb(0.96f, 0.64f, 0.38f)
    val seaGreen = rgb(0.18f, 0.55f, 0.34f)
    val seashell = rgb(1f, 0.96f, 0.93f)
    val sienna = rgb(0.63f, 0.32f, 0.18f)
    val silver = rgb(0.75f, 0.75f, 0.75f)
    val skyBlue = rgb(0.53f, 0.81f, 0.92f)
    val slateBlue = rgb(0.42f, 0.35f, 0.8f)
    val slateGray = rgb(0.44f, 0.5f, 0.56f)
    val snow = rgb(1f, 0.98f, 0.98f)
    val springGreen = rgb(0f, 1f, 0.5f)
    val steelBlue = rgb(0.27f, 0.51f, 0.71f)
    val tan = rgb(0.82f, 0.71f, 0.55f)
    val teal = rgb(0f, 0.5f, 0.5f)
    val thistle = rgb(0.85f, 0.75f, 0.85f)
    val tomato = rgb(1f, 0.39f, 0.28f)
    val turquoise = rgb(0.25f, 0.88f, 0.82f)
    val violet = rgb(0.93f, 0.51f, 0.93f)
    val webGray = rgb(0.5f, 0.5f, 0.5f)
    val webGreen = rgb(0f, 0.5f, 0f)
    val webMaroon = rgb(0.5f, 0f, 0f)
    val webPurple = rgb(0.5f, 0f, 0.5f)
    val wheat = rgb(0.96f, 0.87f, 0.7f)
    val white = rgb(1f, 1f, 1f)
    val whiteSmoke = rgb(0.96f, 0.96f, 0.96f)
    val yellow = rgb(1f, 1f, 0f)
    val yellowGreen = rgb(0.6f, 0.8f, 0.2f)
  }
}