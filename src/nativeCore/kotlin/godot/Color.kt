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
    val gray = Color.rgb(0.75f, 0.75f, 0.75f)
    val aliceblue = Color.rgb(0.94f, 0.97f, 1f)
    val antiquewhite = Color.rgb(0.98f, 0.92f, 0.84f)
    val aqua = Color.rgb(0f, 1f, 1f)
    val aquamarine = Color.rgb(0.5f, 1f, 0.83f)
    val azure = Color.rgb(0.94f, 1f, 1f)
    val beige = Color.rgb(0.96f, 0.96f, 0.86f)
    val bisque = Color.rgb(1f, 0.89f, 0.77f)
    val black = Color.rgb(0f, 0f, 0f)
    val blanchedalmond = Color.rgb(1f, 0.92f, 0.8f)
    val blue = Color.rgb(0f, 0f, 1f)
    val blueviolet = Color.rgb(0.54f, 0.17f, 0.89f)
    val brown = Color.rgb(0.65f, 0.16f, 0.16f)
    val burlywood = Color.rgb(0.87f, 0.72f, 0.53f)
    val cadetblue = Color.rgb(0.37f, 0.62f, 0.63f)
    val chartreuse = Color.rgb(0.5f, 1f, 0f)
    val chocolate = Color.rgb(0.82f, 0.41f, 0.12f)
    val coral = Color.rgb(1f, 0.5f, 0.31f)
    val cornflower = Color.rgb(0.39f, 0.58f, 0.93f)
    val cornsilk = Color.rgb(1f, 0.97f, 0.86f)
    val crimson = Color.rgb(0.86f, 0.08f, 0.24f)
    val cyan = Color.rgb(0f, 1f, 1f)
    val darkblue = Color.rgb(0f, 0f, 0.55f)
    val darkcyan = Color.rgb(0f, 0.55f, 0.55f)
    val darkgoldenrod = Color.rgb(0.72f, 0.53f, 0.04f)
    val darkgray = Color.rgb(0.66f, 0.66f, 0.66f)
    val darkgreen = Color.rgb(0f, 0.39f, 0f)
    val darkkhaki = Color.rgb(0.74f, 0.72f, 0.42f)
    val darkmagenta = Color.rgb(0.55f, 0f, 0.55f)
    val darkolivegreen = Color.rgb(0.33f, 0.42f, 0.18f)
    val darkorange = Color.rgb(1f, 0.55f, 0f)
    val darkorchid = Color.rgb(0.6f, 0.2f, 0.8f)
    val darkred = Color.rgb(0.55f, 0f, 0f)
    val darksalmon = Color.rgb(0.91f, 0.59f, 0.48f)
    val darkseagreen = Color.rgb(0.56f, 0.74f, 0.56f)
    val darkslateblue = Color.rgb(0.28f, 0.24f, 0.55f)
    val darkslategray = Color.rgb(0.18f, 0.31f, 0.31f)
    val darkturquoise = Color.rgb(0f, 0.81f, 0.82f)
    val darkviolet = Color.rgb(0.58f, 0f, 0.83f)
    val deeppink = Color.rgb(1f, 0.08f, 0.58f)
    val deepskyblue = Color.rgb(0f, 0.75f, 1f)
    val dimgray = Color.rgb(0.41f, 0.41f, 0.41f)
    val dodgerblue = Color.rgb(0.12f, 0.56f, 1f)
    val firebrick = Color.rgb(0.7f, 0.13f, 0.13f)
    val floralwhite = Color.rgb(1f, 0.98f, 0.94f)
    val forestgreen = Color.rgb(0.13f, 0.55f, 0.13f)
    val fuchsia = Color.rgb(1f, 0f, 1f)
    val gainsboro = Color.rgb(0.86f, 0.86f, 0.86f)
    val ghostwhite = Color.rgb(0.97f, 0.97f, 1f)
    val gold = Color.rgb(1f, 0.84f, 0f)
    val goldenrod = Color.rgb(0.85f, 0.65f, 0.13f)
    val green = Color.rgb(0f, 1f, 0f)
    val greenyellow = Color.rgb(0.68f, 1f, 0.18f)
    val honeydew = Color.rgb(0.94f, 1f, 0.94f)
    val hotpink = Color.rgb(1f, 0.41f, 0.71f)
    val indianred = Color.rgb(0.8f, 0.36f, 0.36f)
    val indigo = Color.rgb(0.29f, 0f, 0.51f)
    val ivory = Color.rgb(1f, 1f, 0.94f)
    val khaki = Color.rgb(0.94f, 0.9f, 0.55f)
    val lavender = Color.rgb(0.9f, 0.9f, 0.98f)
    val lavenderblush = Color.rgb(1f, 0.94f, 0.96f)
    val lawngreen = Color.rgb(0.49f, 0.99f, 0f)
    val lemonchiffon = Color.rgb(1f, 0.98f, 0.8f)
    val lightblue = Color.rgb(0.68f, 0.85f, 0.9f)
    val lightcoral = Color.rgb(0.94f, 0.5f, 0.5f)
    val lightcyan = Color.rgb(0.88f, 1f, 1f)
    val lightgoldenrod = Color.rgb(0.98f, 0.98f, 0.82f)
    val lightgray = Color.rgb(0.83f, 0.83f, 0.83f)
    val lightgreen = Color.rgb(0.56f, 0.93f, 0.56f)
    val lightpink = Color.rgb(1f, 0.71f, 0.76f)
    val lightsalmon = Color.rgb(1f, 0.63f, 0.48f)
    val lightseagreen = Color.rgb(0.13f, 0.7f, 0.67f)
    val lightskyblue = Color.rgb(0.53f, 0.81f, 0.98f)
    val lightslategray = Color.rgb(0.47f, 0.53f, 0.6f)
    val lightsteelblue = Color.rgb(0.69f, 0.77f, 0.87f)
    val lightyellow = Color.rgb(1f, 1f, 0.88f)
    val lime = Color.rgb(0f, 1f, 0f)
    val limegreen = Color.rgb(0.2f, 0.8f, 0.2f)
    val linen = Color.rgb(0.98f, 0.94f, 0.9f)
    val magenta = Color.rgb(1f, 0f, 1f)
    val maroon = Color.rgb(0.69f, 0.19f, 0.38f)
    val mediumaquamarine = Color.rgb(0.4f, 0.8f, 0.67f)
    val mediumblue = Color.rgb(0f, 0f, 0.8f)
    val mediumorchid = Color.rgb(0.73f, 0.33f, 0.83f)
    val mediumpurple = Color.rgb(0.58f, 0.44f, 0.86f)
    val mediumseagreen = Color.rgb(0.24f, 0.7f, 0.44f)
    val mediumslateblue = Color.rgb(0.48f, 0.41f, 0.93f)
    val mediumspringgreen = Color.rgb(0f, 0.98f, 0.6f)
    val mediumturquoise = Color.rgb(0.28f, 0.82f, 0.8f)
    val mediumvioletred = Color.rgb(0.78f, 0.08f, 0.52f)
    val midnightblue = Color.rgb(0.1f, 0.1f, 0.44f)
    val mintcream = Color.rgb(0.96f, 1f, 0.98f)
    val mistyrose = Color.rgb(1f, 0.89f, 0.88f)
    val moccasin = Color.rgb(1f, 0.89f, 0.71f)
    val navajowhite = Color.rgb(1f, 0.87f, 0.68f)
    val navyblue = Color.rgb(0f, 0f, 0.5f)
    val oldlace = Color.rgb(0.99f, 0.96f, 0.9f)
    val olive = Color.rgb(0.5f, 0.5f, 0f)
    val olivedrab = Color.rgb(0.42f, 0.56f, 0.14f)
    val orange = Color.rgb(1f, 0.65f, 0f)
    val orangered = Color.rgb(1f, 0.27f, 0f)
    val orchid = Color.rgb(0.85f, 0.44f, 0.84f)
    val palegoldenrod = Color.rgb(0.93f, 0.91f, 0.67f)
    val palegreen = Color.rgb(0.6f, 0.98f, 0.6f)
    val paleturquoise = Color.rgb(0.69f, 0.93f, 0.93f)
    val palevioletred = Color.rgb(0.86f, 0.44f, 0.58f)
    val papayawhip = Color.rgb(1f, 0.94f, 0.84f)
    val peachpuff = Color.rgb(1f, 0.85f, 0.73f)
    val peru = Color.rgb(0.8f, 0.52f, 0.25f)
    val pink = Color.rgb(1f, 0.75f, 0.8f)
    val plum = Color.rgb(0.87f, 0.63f, 0.87f)
    val powderblue = Color.rgb(0.69f, 0.88f, 0.9f)
    val purple = Color.rgb(0.63f, 0.13f, 0.94f)
    val rebeccapurple = Color.rgb(0.4f, 0.2f, 0.6f)
    val red = Color.rgb(1f, 0f, 0f)
    val rosybrown = Color.rgb(0.74f, 0.56f, 0.56f)
    val royalblue = Color.rgb(0.25f, 0.41f, 0.88f)
    val saddlebrown = Color.rgb(0.55f, 0.27f, 0.07f)
    val salmon = Color.rgb(0.98f, 0.5f, 0.45f)
    val sandybrown = Color.rgb(0.96f, 0.64f, 0.38f)
    val seagreen = Color.rgb(0.18f, 0.55f, 0.34f)
    val seashell = Color.rgb(1f, 0.96f, 0.93f)
    val sienna = Color.rgb(0.63f, 0.32f, 0.18f)
    val silver = Color.rgb(0.75f, 0.75f, 0.75f)
    val skyblue = Color.rgb(0.53f, 0.81f, 0.92f)
    val slateblue = Color.rgb(0.42f, 0.35f, 0.8f)
    val slategray = Color.rgb(0.44f, 0.5f, 0.56f)
    val snow = Color.rgb(1f, 0.98f, 0.98f)
    val springgreen = Color.rgb(0f, 1f, 0.5f)
    val steelblue = Color.rgb(0.27f, 0.51f, 0.71f)
    val tan = Color.rgb(0.82f, 0.71f, 0.55f)
    val teal = Color.rgb(0f, 0.5f, 0.5f)
    val thistle = Color.rgb(0.85f, 0.75f, 0.85f)
    val tomato = Color.rgb(1f, 0.39f, 0.28f)
    val turquoise = Color.rgb(0.25f, 0.88f, 0.82f)
    val violet = Color.rgb(0.93f, 0.51f, 0.93f)
    val webgray = Color.rgb(0.5f, 0.5f, 0.5f)
    val webgreen = Color.rgb(0f, 0.5f, 0f)
    val webmaroon = Color.rgb(0.5f, 0f, 0f)
    val webpurple = Color.rgb(0.5f, 0f, 0.5f)
    val wheat = Color.rgb(0.96f, 0.87f, 0.7f)
    val white = Color.rgb(1f, 1f, 1f)
    val whitesmoke = Color.rgb(0.96f, 0.96f, 0.96f)
    val yellow = Color.rgb(1f, 1f, 0f)
    val yellowgreen = Color.rgb(0.6f, 0.8f, 0.2f)

  }
}