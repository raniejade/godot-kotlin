package godot.core

import gdnative.godot_color
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

class Color(
  value: CValue<godot_color>
) : CoreType<godot_color>(value) {
  constructor(r: Float, g: Float, b: Float, a: Float = 1f): this(__new(r, g, b, a))
  constructor(r: Int, g: Int, b: Int, a: Int): this(__new(r, g, b, a))

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

  fun toHtml(withAlpha: Boolean = true): String {
    return memScoped {
      val gdString = GDString(
        checkNotNull(Godot.gdnative.godot_color_to_html)(_value.ptr, withAlpha)
      )
      val ret = gdString.toKString()
      gdString.destroy()
      ret
    }
  }

  override fun toVariant(): Variant {
    return Variant(this)
  }

  override fun toGDString(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_color_as_string)(_value.ptr)
      )
    }
  }

  companion object {
    internal fun __new(r: Float, g: Float, b: Float, a: Float) = allocType2<godot_color> {
      checkNotNull(Godot.gdnative.godot_color_new_rgba)(it, r, g, b, a)
    }

    internal fun __new(r: Int, g: Int, b: Int, a: Int) = __new(r.toFloat(), g.toFloat(), b.toFloat(), a.toFloat())

    // COLOR CONSTANTS
    val GRAY: Color
      get() = Color(0.75f, 0.75f, 0.75f)
    val ALICE_BLUE: Color
      get() = Color(0.94f, 0.97f, 1f)
    val ANTIQUE_WHITE: Color
      get() = Color(0.98f, 0.92f, 0.84f)
    val AQUA: Color
      get() = Color(0f, 1f, 1f)
    val AQUAMARINE: Color
      get() = Color(0.5f, 1f, 0.83f)
    val AZURE: Color
      get() = Color(0.94f, 1f, 1f)
    val BEIGE: Color
      get() = Color(0.96f, 0.96f, 0.86f)
    val BISQUE: Color
      get() = Color(1f, 0.89f, 0.77f)
    val BLACK: Color
      get() = Color(0f, 0f, 0f)
    val BLANCHED_ALMOND: Color
      get() = Color(1f, 0.92f, 0.8f)
    val BLUE: Color
      get() = Color(0f, 0f, 1f)
    val BLUE_VIOLET: Color
      get() = Color(0.54f, 0.17f, 0.89f)
    val BROWN: Color
      get() = Color(0.65f, 0.16f, 0.16f)
    val BURLYWOOD: Color
      get() = Color(0.87f, 0.72f, 0.53f)
    val CADET_BLUE: Color
      get() = Color(0.37f, 0.62f, 0.63f)
    val CHARTREUSE: Color
      get() = Color(0.5f, 1f, 0f)
    val CHOCOLATE: Color
      get() = Color(0.82f, 0.41f, 0.12f)
    val CORAL: Color
      get() = Color(1f, 0.5f, 0.31f)
    val CORN_FLOWER: Color
      get() = Color(0.39f, 0.58f, 0.93f)
    val CORN_SILK: Color
      get() = Color(1f, 0.97f, 0.86f)
    val CRIMSON: Color
      get() = Color(0.86f, 0.08f, 0.24f)
    val CYAN: Color
      get() = Color(0f, 1f, 1f)
    val DARK_BLUE: Color
      get() = Color(0f, 0f, 0.55f)
    val DARK_CYAN: Color
      get() = Color(0f, 0.55f, 0.55f)
    val DARK_GOLDEN_ROD: Color
      get() = Color(0.72f, 0.53f, 0.04f)
    val DARK_GRAY: Color
      get() = Color(0.66f, 0.66f, 0.66f)
    val DARK_GREEN: Color
      get() = Color(0f, 0.39f, 0f)
    val DARK_KHAKI: Color
      get() = Color(0.74f, 0.72f, 0.42f)
    val DARK_MAGENTA: Color
      get() = Color(0.55f, 0f, 0.55f)
    val DARK_OLIVE_GREEN: Color
      get() = Color(0.33f, 0.42f, 0.18f)
    val DARK_ORANGE: Color
      get() = Color(1f, 0.55f, 0f)
    val DARK_ORCHID: Color
      get() = Color(0.6f, 0.2f, 0.8f)
    val DARK_RED: Color
      get() = Color(0.55f, 0f, 0f)
    val DARK_SALMON: Color
      get() = Color(0.91f, 0.59f, 0.48f)
    val DARK_SEA_GREEN: Color
      get() = Color(0.56f, 0.74f, 0.56f)
    val DARK_SLATE_BLUE: Color
      get() = Color(0.28f, 0.24f, 0.55f)
    val DARK_SLATE_GRAY: Color
      get() = Color(0.18f, 0.31f, 0.31f)
    val DARK_TURQUOISE: Color
      get() = Color(0f, 0.81f, 0.82f)
    val DARK_VIOLET: Color
      get() = Color(0.58f, 0f, 0.83f)
    val DEEP_PINK: Color
      get() = Color(1f, 0.08f, 0.58f)
    val DEEP_SKY_BLUE: Color
      get() = Color(0f, 0.75f, 1f)
    val DIM_GRAY: Color
      get() = Color(0.41f, 0.41f, 0.41f)
    val DODGER_BLUE: Color
      get() = Color(0.12f, 0.56f, 1f)
    val FIRE_BRICK: Color
      get() = Color(0.7f, 0.13f, 0.13f)
    val FLORAL_WHITE: Color
      get() = Color(1f, 0.98f, 0.94f)
    val FOREST_GREEN: Color
      get() = Color(0.13f, 0.55f, 0.13f)
    val FUCHSIA: Color
      get() = Color(1f, 0f, 1f)
    val GAINSBORO: Color
      get() = Color(0.86f, 0.86f, 0.86f)
    val GHOST_WHITE: Color
      get() = Color(0.97f, 0.97f, 1f)
    val GOLD: Color
      get() = Color(1f, 0.84f, 0f)
    val GOLDEN_ROD: Color
      get() = Color(0.85f, 0.65f, 0.13f)
    val GREEN: Color
      get() = Color(0f, 1f, 0f)
    val GREEN_YELLOW: Color
      get() = Color(0.68f, 1f, 0.18f)
    val HONEY_DEW: Color
      get() = Color(0.94f, 1f, 0.94f)
    val HOT_PINK: Color
      get() = Color(1f, 0.41f, 0.71f)
    val INDIAN_RED: Color
      get() = Color(0.8f, 0.36f, 0.36f)
    val INDIGO: Color
      get() = Color(0.29f, 0f, 0.51f)
    val IVORY: Color
      get() = Color(1f, 1f, 0.94f)
    val KHAKI: Color
      get() = Color(0.94f, 0.9f, 0.55f)
    val LAVENDER: Color
      get() = Color(0.9f, 0.9f, 0.98f)
    val LAVENDER_BLUSH: Color
      get() = Color(1f, 0.94f, 0.96f)
    val LAWN_GREEN: Color
      get() = Color(0.49f, 0.99f, 0f)
    val LEMON_CHIFFON: Color
      get() = Color(1f, 0.98f, 0.8f)
    val LIGHT_BLUE: Color
      get() = Color(0.68f, 0.85f, 0.9f)
    val LIGHT_CORAL: Color
      get() = Color(0.94f, 0.5f, 0.5f)
    val LIGHT_CYAN: Color
      get() = Color(0.88f, 1f, 1f)
    val LIGHT_GOLDEN_ROD: Color
      get() = Color(0.98f, 0.98f, 0.82f)
    val LIGHT_GRAY: Color
      get() = Color(0.83f, 0.83f, 0.83f)
    val LIGHT_GREEN: Color
      get() = Color(0.56f, 0.93f, 0.56f)
    val LIGHT_PINK: Color
      get() = Color(1f, 0.71f, 0.76f)
    val LIGHT_SALMON: Color
      get() = Color(1f, 0.63f, 0.48f)
    val LIGHT_SEA_GREEN: Color
      get() = Color(0.13f, 0.7f, 0.67f)
    val LIGHT_SKY_BLUE: Color
      get() = Color(0.53f, 0.81f, 0.98f)
    val LIGHT_SLATE_GRAY: Color
      get() = Color(0.47f, 0.53f, 0.6f)
    val LIGHT_STEEL_BLUE: Color
      get() = Color(0.69f, 0.77f, 0.87f)
    val LIGHT_YELLOW: Color
      get() = Color(1f, 1f, 0.88f)
    val LIME: Color
      get() = Color(0f, 1f, 0f)
    val LIME_GREEN: Color
      get() = Color(0.2f, 0.8f, 0.2f)
    val LINEN: Color
      get() = Color(0.98f, 0.94f, 0.9f)
    val MAGENTA: Color
      get() = Color(1f, 0f, 1f)
    val MAROON: Color
      get() = Color(0.69f, 0.19f, 0.38f)
    val MEDIUM_AQUAMARINE: Color
      get() = Color(0.4f, 0.8f, 0.67f)
    val MEDIUM_BLUE: Color
      get() = Color(0f, 0f, 0.8f)
    val MEDIUM_ORCHID: Color
      get() = Color(0.73f, 0.33f, 0.83f)
    val MEDIUM_PURPLE: Color
      get() = Color(0.58f, 0.44f, 0.86f)
    val MEDIUM_SEA_GREEN: Color
      get() = Color(0.24f, 0.7f, 0.44f)
    val MEDIUM_SLATE_BLUE: Color
      get() = Color(0.48f, 0.41f, 0.93f)
    val MEDIUM_SPRING_GREEN: Color
      get() = Color(0f, 0.98f, 0.6f)
    val MEDIUM_TURQUOISE: Color
      get() = Color(0.28f, 0.82f, 0.8f)
    val MEDIUM_VIOLET_RED: Color
      get() = Color(0.78f, 0.08f, 0.52f)
    val MIDNIGHT_BLUE: Color
      get() = Color(0.1f, 0.1f, 0.44f)
    val MINT_CREAM: Color
      get() = Color(0.96f, 1f, 0.98f)
    val MISTY_ROSE: Color
      get() = Color(1f, 0.89f, 0.88f)
    val MOCCASIN: Color
      get() = Color(1f, 0.89f, 0.71f)
    val NAVAJO_WHITE: Color
      get() = Color(1f, 0.87f, 0.68f)
    val NAVY_BLUE: Color
      get() = Color(0f, 0f, 0.5f)
    val OLD_LACE: Color
      get() = Color(0.99f, 0.96f, 0.9f)
    val OLIVE: Color
      get() = Color(0.5f, 0.5f, 0f)
    val OLIVE_DRAB: Color
      get() = Color(0.42f, 0.56f, 0.14f)
    val ORANGE: Color
      get() = Color(1f, 0.65f, 0f)
    val ORANGE_RED: Color
      get() = Color(1f, 0.27f, 0f)
    val ORCHID: Color
      get() = Color(0.85f, 0.44f, 0.84f)
    val PALE_GOLDEN_ROD: Color
      get() = Color(0.93f, 0.91f, 0.67f)
    val PALE_GREEN: Color
      get() = Color(0.6f, 0.98f, 0.6f)
    val PALE_TURQUOISE: Color
      get() = Color(0.69f, 0.93f, 0.93f)
    val PALE_VIOLET_RED: Color
      get() = Color(0.86f, 0.44f, 0.58f)
    val PAPAYA_WHIP: Color
      get() = Color(1f, 0.94f, 0.84f)
    val PEACH_PUFF: Color
      get() = Color(1f, 0.85f, 0.73f)
    val PERU: Color
      get() = Color(0.8f, 0.52f, 0.25f)
    val PINK: Color
      get() = Color(1f, 0.75f, 0.8f)
    val PLUM: Color
      get() = Color(0.87f, 0.63f, 0.87f)
    val POWDER_BLUE: Color
      get() = Color(0.69f, 0.88f, 0.9f)
    val PURPLE: Color
      get() = Color(0.63f, 0.13f, 0.94f)
    val REBECCA_PURPLE: Color
      get() = Color(0.4f, 0.2f, 0.6f)
    val RED: Color
      get() = Color(1f, 0f, 0f)
    val ROSY_BROWN: Color
      get() = Color(0.74f, 0.56f, 0.56f)
    val ROYAL_BLUE: Color
      get() = Color(0.25f, 0.41f, 0.88f)
    val SADDLE_BROWN: Color
      get() = Color(0.55f, 0.27f, 0.07f)
    val SALMON: Color
      get() = Color(0.98f, 0.5f, 0.45f)
    val SANDY_BROWN: Color
      get() = Color(0.96f, 0.64f, 0.38f)
    val SEA_GREEN: Color
      get() = Color(0.18f, 0.55f, 0.34f)
    val SEASHELL: Color
      get() = Color(1f, 0.96f, 0.93f)
    val SIENNA: Color
      get() = Color(0.63f, 0.32f, 0.18f)
    val SILVER: Color
      get() = Color(0.75f, 0.75f, 0.75f)
    val SKY_BLUE: Color
      get() = Color(0.53f, 0.81f, 0.92f)
    val SLATE_BLUE: Color
      get() = Color(0.42f, 0.35f, 0.8f)
    val SLATE_GRAY: Color
      get() = Color(0.44f, 0.5f, 0.56f)
    val SNOW: Color
      get() = Color(1f, 0.98f, 0.98f)
    val SPRING_GREEN: Color
      get() = Color(0f, 1f, 0.5f)
    val STEEL_BLUE: Color
      get() = Color(0.27f, 0.51f, 0.71f)
    val TAN: Color
      get() = Color(0.82f, 0.71f, 0.55f)
    val TEAL: Color
      get() = Color(0f, 0.5f, 0.5f)
    val THISTLE: Color
      get() = Color(0.85f, 0.75f, 0.85f)
    val TOMATO: Color
      get() = Color(1f, 0.39f, 0.28f)
    val TURQUOISE: Color
      get() = Color(0.25f, 0.88f, 0.82f)
    val VIOLET: Color
      get() = Color(0.93f, 0.51f, 0.93f)
    val WEB_GRAY: Color
      get() = Color(0.5f, 0.5f, 0.5f)
    val WEB_GREEN: Color
      get() = Color(0f, 0.5f, 0f)
    val WEB_MAROON: Color
      get() = Color(0.5f, 0f, 0f)
    val WEB_PURPLE: Color
      get() = Color(0.5f, 0f, 0.5f)
    val WHEAT: Color
      get() = Color(0.96f, 0.87f, 0.7f)
    val WHITE: Color
      get() = Color(1f, 1f, 1f)
    val WHITE_SMOKE: Color
      get() = Color(0.96f, 0.96f, 0.96f)
    val YELLOW: Color
      get() = Color(1f, 1f, 0f)
    val YELLOW_GREEN: Color
      get() = Color(0.6f, 0.8f, 0.2f)
  }
}