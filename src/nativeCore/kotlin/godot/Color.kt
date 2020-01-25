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

  override fun toGDString(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_color_as_string)(_value.ptr)
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
    val Gray = rgb(0.75f, 0.75f, 0.75f)
    val AliceBlue = rgb(0.94f, 0.97f, 1f)
    val AntiqueWhite = rgb(0.98f, 0.92f, 0.84f)
    val Aqua = rgb(0f, 1f, 1f)
    val Aquamarine = rgb(0.5f, 1f, 0.83f)
    val Azure = rgb(0.94f, 1f, 1f)
    val Beige = rgb(0.96f, 0.96f, 0.86f)
    val Bisque = rgb(1f, 0.89f, 0.77f)
    val Black = rgb(0f, 0f, 0f)
    val BlanchedAlmond = rgb(1f, 0.92f, 0.8f)
    val Blue = rgb(0f, 0f, 1f)
    val BlueViolet = rgb(0.54f, 0.17f, 0.89f)
    val Brown = rgb(0.65f, 0.16f, 0.16f)
    val Burlywood = rgb(0.87f, 0.72f, 0.53f)
    val CadetBlue = rgb(0.37f, 0.62f, 0.63f)
    val Chartreuse = rgb(0.5f, 1f, 0f)
    val Chocolate = rgb(0.82f, 0.41f, 0.12f)
    val Coral = rgb(1f, 0.5f, 0.31f)
    val CornFlower = rgb(0.39f, 0.58f, 0.93f)
    val CornSilk = rgb(1f, 0.97f, 0.86f)
    val Crimson = rgb(0.86f, 0.08f, 0.24f)
    val Cyan = rgb(0f, 1f, 1f)
    val DarkBlue = rgb(0f, 0f, 0.55f)
    val DarkCyan = rgb(0f, 0.55f, 0.55f)
    val DarkGoldenRod = rgb(0.72f, 0.53f, 0.04f)
    val DarkGray = rgb(0.66f, 0.66f, 0.66f)
    val DarkGreen = rgb(0f, 0.39f, 0f)
    val DarkKhaki = rgb(0.74f, 0.72f, 0.42f)
    val DarkMagenta = rgb(0.55f, 0f, 0.55f)
    val DarkOliveGreen = rgb(0.33f, 0.42f, 0.18f)
    val DarkOrange = rgb(1f, 0.55f, 0f)
    val DarkOrchid = rgb(0.6f, 0.2f, 0.8f)
    val DarkRed = rgb(0.55f, 0f, 0f)
    val DarkSalmon = rgb(0.91f, 0.59f, 0.48f)
    val DarkSeaGreen = rgb(0.56f, 0.74f, 0.56f)
    val DarkSlateBlue = rgb(0.28f, 0.24f, 0.55f)
    val DarkSlateGray = rgb(0.18f, 0.31f, 0.31f)
    val DarkTurquoise = rgb(0f, 0.81f, 0.82f)
    val DarkViolet = rgb(0.58f, 0f, 0.83f)
    val DeepPink = rgb(1f, 0.08f, 0.58f)
    val DeepSkyBlue = rgb(0f, 0.75f, 1f)
    val DimGray = rgb(0.41f, 0.41f, 0.41f)
    val DodgerBlue = rgb(0.12f, 0.56f, 1f)
    val FireBrick = rgb(0.7f, 0.13f, 0.13f)
    val FloralWhite = rgb(1f, 0.98f, 0.94f)
    val ForestGreen = rgb(0.13f, 0.55f, 0.13f)
    val Fuchsia = rgb(1f, 0f, 1f)
    val Gainsboro = rgb(0.86f, 0.86f, 0.86f)
    val GhostWhite = rgb(0.97f, 0.97f, 1f)
    val Gold = rgb(1f, 0.84f, 0f)
    val GoldenRod = rgb(0.85f, 0.65f, 0.13f)
    val Green = rgb(0f, 1f, 0f)
    val GreenYellow = rgb(0.68f, 1f, 0.18f)
    val HoneyDew = rgb(0.94f, 1f, 0.94f)
    val HotPink = rgb(1f, 0.41f, 0.71f)
    val IndianRed = rgb(0.8f, 0.36f, 0.36f)
    val Indigo = rgb(0.29f, 0f, 0.51f)
    val Ivory = rgb(1f, 1f, 0.94f)
    val Khaki = rgb(0.94f, 0.9f, 0.55f)
    val Lavender = rgb(0.9f, 0.9f, 0.98f)
    val LavenderBlush = rgb(1f, 0.94f, 0.96f)
    val LawnGreen = rgb(0.49f, 0.99f, 0f)
    val LemonChiffon = rgb(1f, 0.98f, 0.8f)
    val LightBlue = rgb(0.68f, 0.85f, 0.9f)
    val LightCoral = rgb(0.94f, 0.5f, 0.5f)
    val LightCyan = rgb(0.88f, 1f, 1f)
    val LightGoldenRod = rgb(0.98f, 0.98f, 0.82f)
    val LightGray = rgb(0.83f, 0.83f, 0.83f)
    val LightGreen = rgb(0.56f, 0.93f, 0.56f)
    val LightPink = rgb(1f, 0.71f, 0.76f)
    val LightSalmon = rgb(1f, 0.63f, 0.48f)
    val LightSeaGreen = rgb(0.13f, 0.7f, 0.67f)
    val LightSkyBlue = rgb(0.53f, 0.81f, 0.98f)
    val LightSlateGray = rgb(0.47f, 0.53f, 0.6f)
    val LightSteelBlue = rgb(0.69f, 0.77f, 0.87f)
    val LightYellow = rgb(1f, 1f, 0.88f)
    val Lime = rgb(0f, 1f, 0f)
    val LimeGreen = rgb(0.2f, 0.8f, 0.2f)
    val Linen = rgb(0.98f, 0.94f, 0.9f)
    val Magenta = rgb(1f, 0f, 1f)
    val Maroon = rgb(0.69f, 0.19f, 0.38f)
    val MediumAquamarine = rgb(0.4f, 0.8f, 0.67f)
    val MediumBlue = rgb(0f, 0f, 0.8f)
    val MediumOrchid = rgb(0.73f, 0.33f, 0.83f)
    val MediumPurple = rgb(0.58f, 0.44f, 0.86f)
    val MediumSeaGreen = rgb(0.24f, 0.7f, 0.44f)
    val MediumSlateBlue = rgb(0.48f, 0.41f, 0.93f)
    val MediumSpringGreen = rgb(0f, 0.98f, 0.6f)
    val MediumTurquoise = rgb(0.28f, 0.82f, 0.8f)
    val MediumVioletRed = rgb(0.78f, 0.08f, 0.52f)
    val MidnightBlue = rgb(0.1f, 0.1f, 0.44f)
    val MintCream = rgb(0.96f, 1f, 0.98f)
    val MistyRose = rgb(1f, 0.89f, 0.88f)
    val Moccasin = rgb(1f, 0.89f, 0.71f)
    val NavajoWhite = rgb(1f, 0.87f, 0.68f)
    val NavyBlue = rgb(0f, 0f, 0.5f)
    val OldLace = rgb(0.99f, 0.96f, 0.9f)
    val Olive = rgb(0.5f, 0.5f, 0f)
    val OliveDrab = rgb(0.42f, 0.56f, 0.14f)
    val Orange = rgb(1f, 0.65f, 0f)
    val OrangeRed = rgb(1f, 0.27f, 0f)
    val Orchid = rgb(0.85f, 0.44f, 0.84f)
    val PaleGoldenRod = rgb(0.93f, 0.91f, 0.67f)
    val PaleGreen = rgb(0.6f, 0.98f, 0.6f)
    val PaleTurquoise = rgb(0.69f, 0.93f, 0.93f)
    val PaleVioletRed = rgb(0.86f, 0.44f, 0.58f)
    val PapayaWhip = rgb(1f, 0.94f, 0.84f)
    val PeachPuff = rgb(1f, 0.85f, 0.73f)
    val Peru = rgb(0.8f, 0.52f, 0.25f)
    val Pink = rgb(1f, 0.75f, 0.8f)
    val Plum = rgb(0.87f, 0.63f, 0.87f)
    val PowderBlue = rgb(0.69f, 0.88f, 0.9f)
    val Purple = rgb(0.63f, 0.13f, 0.94f)
    val RebeccaPurple = rgb(0.4f, 0.2f, 0.6f)
    val Red = rgb(1f, 0f, 0f)
    val RosyBrown = rgb(0.74f, 0.56f, 0.56f)
    val RoyalBlue = rgb(0.25f, 0.41f, 0.88f)
    val SaddleBrown = rgb(0.55f, 0.27f, 0.07f)
    val Salmon = rgb(0.98f, 0.5f, 0.45f)
    val SandyBrown = rgb(0.96f, 0.64f, 0.38f)
    val SeaGreen = rgb(0.18f, 0.55f, 0.34f)
    val Seashell = rgb(1f, 0.96f, 0.93f)
    val Sienna = rgb(0.63f, 0.32f, 0.18f)
    val Silver = rgb(0.75f, 0.75f, 0.75f)
    val SkyBlue = rgb(0.53f, 0.81f, 0.92f)
    val SlateBlue = rgb(0.42f, 0.35f, 0.8f)
    val SlateGray = rgb(0.44f, 0.5f, 0.56f)
    val Snow = rgb(1f, 0.98f, 0.98f)
    val SpringGreen = rgb(0f, 1f, 0.5f)
    val SteelBlue = rgb(0.27f, 0.51f, 0.71f)
    val Tan = rgb(0.82f, 0.71f, 0.55f)
    val Teal = rgb(0f, 0.5f, 0.5f)
    val Thistle = rgb(0.85f, 0.75f, 0.85f)
    val Tomato = rgb(1f, 0.39f, 0.28f)
    val Turquoise = rgb(0.25f, 0.88f, 0.82f)
    val Violet = rgb(0.93f, 0.51f, 0.93f)
    val WebGray = rgb(0.5f, 0.5f, 0.5f)
    val WebGreen = rgb(0f, 0.5f, 0f)
    val WebMaroon = rgb(0.5f, 0f, 0f)
    val WebPurple = rgb(0.5f, 0f, 0.5f)
    val Wheat = rgb(0.96f, 0.87f, 0.7f)
    val White = rgb(1f, 1f, 1f)
    val WhiteSmoke = rgb(0.96f, 0.96f, 0.96f)
    val Yellow = rgb(1f, 1f, 0f)
    val YellowGreen = rgb(0.6f, 0.8f, 0.2f)
  }
}