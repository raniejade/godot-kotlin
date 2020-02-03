package godot.core

import gdnative.godot_error
import godot.GlobalConstants

enum class Margin(val value: Int) {
  LEFT(GlobalConstants.MARGIN_LEFT),
  TOP(GlobalConstants.MARGIN_TOP),
  RIGHT(GlobalConstants.MARGIN_RIGHT),
  BOTTOM(GlobalConstants.MARGIN_BOTTOM);

  companion object {
    fun from(value: Int) = values().first { it.value == value }
  }
}

enum class Corner(val value: Int) {
  TOP_LEFT(GlobalConstants.CORNER_TOP_LEFT),
  TOP_RIGHT(GlobalConstants.CORNER_TOP_RIGHT),
  BOTTOM_LEFT(GlobalConstants.CORNER_BOTTOM_LEFT),
  BOTTOM_RIGHT(GlobalConstants.CORNER_BOTTOM_RIGHT);

  companion object {
    fun from(value: Int) = values().first { it.value == value }
  }
}

enum class Orientation(val value: Int) {
  VERTICAL(GlobalConstants.VERTICAL),
  HORIZONTAL(GlobalConstants.HORIZONTAL);

  companion object {
    fun from(value: Int) = values().first { it.value == value }
  }
}

enum class HAlign(val value: Int) {
  LEFT(GlobalConstants.HALIGN_LEFT),
  CENTER(GlobalConstants.HALIGN_CENTER),
  RIGHT(GlobalConstants.HALIGN_RIGHT);

  companion object {
    fun from(value: Int) = values().first { it.value == value }
  }
}

enum class VAlign(val value: Int) {
  TOP(GlobalConstants.VALIGN_TOP),
  CENTER(GlobalConstants.VALIGN_CENTER),
  BOTTOM(GlobalConstants.VALIGN_BOTTOM);

  companion object {
    fun from(value: Int) = values().first { it.value == value }
  }
}

enum class KeyList(val value: Int) {
  `0`(GlobalConstants.KEY_0),
  `1`(GlobalConstants.KEY_1),
  `2`(GlobalConstants.KEY_2),
  `3`(GlobalConstants.KEY_3),
  `4`(GlobalConstants.KEY_4),
  `5`(GlobalConstants.KEY_5),
  `6`(GlobalConstants.KEY_6),
  `7`(GlobalConstants.KEY_7),
  `8`(GlobalConstants.KEY_8),
  `9`(GlobalConstants.KEY_9),
  A(GlobalConstants.KEY_A),
  AACUTE(GlobalConstants.KEY_AACUTE),
  ACIRCUMFLEX(GlobalConstants.KEY_ACIRCUMFLEX),
  ACUTE(GlobalConstants.KEY_ACUTE),
  ADIAERESIS(GlobalConstants.KEY_ADIAERESIS),
  AE(GlobalConstants.KEY_AE),
  AGRAVE(GlobalConstants.KEY_AGRAVE),
  ALT(GlobalConstants.KEY_ALT),
  AMPERSAND(GlobalConstants.KEY_AMPERSAND),
  APOSTROPHE(GlobalConstants.KEY_APOSTROPHE),
  ARING(GlobalConstants.KEY_ARING),
  ASCIICIRCUM(GlobalConstants.KEY_ASCIICIRCUM),
  ASCIITILDE(GlobalConstants.KEY_ASCIITILDE),
  ASTERISK(GlobalConstants.KEY_ASTERISK),
  AT(GlobalConstants.KEY_AT),
  ATILDE(GlobalConstants.KEY_ATILDE),
  B(GlobalConstants.KEY_B),
  BACK(GlobalConstants.KEY_BACK),
  BACKSLASH(GlobalConstants.KEY_BACKSLASH),
  BACKSPACE(GlobalConstants.KEY_BACKSPACE),
  BACKTAB(GlobalConstants.KEY_BACKTAB),
  BAR(GlobalConstants.KEY_BAR),
  BASSBOOST(GlobalConstants.KEY_BASSBOOST),
  BASSDOWN(GlobalConstants.KEY_BASSDOWN),
  BASSUP(GlobalConstants.KEY_BASSUP),
  BRACELEFT(GlobalConstants.KEY_BRACELEFT),
  BRACERIGHT(GlobalConstants.KEY_BRACERIGHT),
  BRACKETLEFT(GlobalConstants.KEY_BRACKETLEFT),
  BRACKETRIGHT(GlobalConstants.KEY_BRACKETRIGHT),
  BROKENBAR(GlobalConstants.KEY_BROKENBAR),
  C(GlobalConstants.KEY_C),
  CAPSLOCK(GlobalConstants.KEY_CAPSLOCK),
  CCEDILLA(GlobalConstants.KEY_CCEDILLA),
  CEDILLA(GlobalConstants.KEY_CEDILLA),
  CENT(GlobalConstants.KEY_CENT),
  CLEAR(GlobalConstants.KEY_CLEAR),
  COLON(GlobalConstants.KEY_COLON),
  COMMA(GlobalConstants.KEY_COMMA),
  CONTROL(GlobalConstants.KEY_CONTROL),
  COPYRIGHT(GlobalConstants.KEY_COPYRIGHT),
  CURRENCY(GlobalConstants.KEY_CURRENCY),
  D(GlobalConstants.KEY_D),
  DEGREE(GlobalConstants.KEY_DEGREE),
  DELETE(GlobalConstants.KEY_DELETE),
  DIAERESIS(GlobalConstants.KEY_DIAERESIS),
  DIRECTION_L(GlobalConstants.KEY_DIRECTION_L),
  DIRECTION_R(GlobalConstants.KEY_DIRECTION_R),
  DIVISION(GlobalConstants.KEY_DIVISION),
  DOLLAR(GlobalConstants.KEY_DOLLAR),
  DOWN(GlobalConstants.KEY_DOWN),
  E(GlobalConstants.KEY_E),
  EACUTE(GlobalConstants.KEY_EACUTE),
  ECIRCUMFLEX(GlobalConstants.KEY_ECIRCUMFLEX),
  EDIAERESIS(GlobalConstants.KEY_EDIAERESIS),
  EGRAVE(GlobalConstants.KEY_EGRAVE),
  END(GlobalConstants.KEY_END),
  ENTER(GlobalConstants.KEY_ENTER),
  EQUAL(GlobalConstants.KEY_EQUAL),
  ESCAPE(GlobalConstants.KEY_ESCAPE),
  ETH(GlobalConstants.KEY_ETH),
  EXCLAM(GlobalConstants.KEY_EXCLAM),
  EXCLAMDOWN(GlobalConstants.KEY_EXCLAMDOWN),
  F(GlobalConstants.KEY_F),
  F1(GlobalConstants.KEY_F1),
  F10(GlobalConstants.KEY_F10),
  F11(GlobalConstants.KEY_F11),
  F12(GlobalConstants.KEY_F12),
  F13(GlobalConstants.KEY_F13),
  F14(GlobalConstants.KEY_F14),
  F15(GlobalConstants.KEY_F15),
  F16(GlobalConstants.KEY_F16),
  F2(GlobalConstants.KEY_F2),
  F3(GlobalConstants.KEY_F3),
  F4(GlobalConstants.KEY_F4),
  F5(GlobalConstants.KEY_F5),
  F6(GlobalConstants.KEY_F6),
  F7(GlobalConstants.KEY_F7),
  F8(GlobalConstants.KEY_F8),
  F9(GlobalConstants.KEY_F9),
  FAVORITES(GlobalConstants.KEY_FAVORITES),
  FORWARD(GlobalConstants.KEY_FORWARD),
  G(GlobalConstants.KEY_G),
  GREATER(GlobalConstants.KEY_GREATER),
  GUILLEMOTLEFT(GlobalConstants.KEY_GUILLEMOTLEFT),
  GUILLEMOTRIGHT(GlobalConstants.KEY_GUILLEMOTRIGHT),
  H(GlobalConstants.KEY_H),
  HELP(GlobalConstants.KEY_HELP),
  HOME(GlobalConstants.KEY_HOME),
  HOMEPAGE(GlobalConstants.KEY_HOMEPAGE),
  HYPER_L(GlobalConstants.KEY_HYPER_L),
  HYPER_R(GlobalConstants.KEY_HYPER_R),
  HYPHEN(GlobalConstants.KEY_HYPHEN),
  I(GlobalConstants.KEY_I),
  IACUTE(GlobalConstants.KEY_IACUTE),
  ICIRCUMFLEX(GlobalConstants.KEY_ICIRCUMFLEX),
  IDIAERESIS(GlobalConstants.KEY_IDIAERESIS),
  IGRAVE(GlobalConstants.KEY_IGRAVE),
  INSERT(GlobalConstants.KEY_INSERT),
  J(GlobalConstants.KEY_J),
  K(GlobalConstants.KEY_K),
  KP_0(GlobalConstants.KEY_KP_0),
  KP_1(GlobalConstants.KEY_KP_1),
  KP_2(GlobalConstants.KEY_KP_2),
  KP_3(GlobalConstants.KEY_KP_3),
  KP_4(GlobalConstants.KEY_KP_4),
  KP_5(GlobalConstants.KEY_KP_5),
  KP_6(GlobalConstants.KEY_KP_6),
  KP_7(GlobalConstants.KEY_KP_7),
  KP_8(GlobalConstants.KEY_KP_8),
  KP_9(GlobalConstants.KEY_KP_9),
  KP_ADD(GlobalConstants.KEY_KP_ADD),
  KP_DIVIDE(GlobalConstants.KEY_KP_DIVIDE),
  KP_ENTER(GlobalConstants.KEY_KP_ENTER),
  KP_MULTIPLY(GlobalConstants.KEY_KP_MULTIPLY),
  KP_PERIOD(GlobalConstants.KEY_KP_PERIOD),
  KP_SUBTRACT(GlobalConstants.KEY_KP_SUBTRACT),
  L(GlobalConstants.KEY_L),
  LAUNCH0(GlobalConstants.KEY_LAUNCH0),
  LAUNCH1(GlobalConstants.KEY_LAUNCH1),
  LAUNCH2(GlobalConstants.KEY_LAUNCH2),
  LAUNCH3(GlobalConstants.KEY_LAUNCH3),
  LAUNCH4(GlobalConstants.KEY_LAUNCH4),
  LAUNCH5(GlobalConstants.KEY_LAUNCH5),
  LAUNCH6(GlobalConstants.KEY_LAUNCH6),
  LAUNCH7(GlobalConstants.KEY_LAUNCH7),
  LAUNCH8(GlobalConstants.KEY_LAUNCH8),
  LAUNCH9(GlobalConstants.KEY_LAUNCH9),
  LAUNCHA(GlobalConstants.KEY_LAUNCHA),
  LAUNCHB(GlobalConstants.KEY_LAUNCHB),
  LAUNCHC(GlobalConstants.KEY_LAUNCHC),
  LAUNCHD(GlobalConstants.KEY_LAUNCHD),
  LAUNCHE(GlobalConstants.KEY_LAUNCHE),
  LAUNCHF(GlobalConstants.KEY_LAUNCHF),
  LAUNCHMAIL(GlobalConstants.KEY_LAUNCHMAIL),
  LAUNCHMEDIA(GlobalConstants.KEY_LAUNCHMEDIA),
  LEFT(GlobalConstants.KEY_LEFT),
  LESS(GlobalConstants.KEY_LESS),
  M(GlobalConstants.KEY_M),
  MACRON(GlobalConstants.KEY_MACRON),
  MASCULINE(GlobalConstants.KEY_MASCULINE),
  MEDIANEXT(GlobalConstants.KEY_MEDIANEXT),
  MEDIAPLAY(GlobalConstants.KEY_MEDIAPLAY),
  MEDIAPREVIOUS(GlobalConstants.KEY_MEDIAPREVIOUS),
  MEDIARECORD(GlobalConstants.KEY_MEDIARECORD),
  MEDIASTOP(GlobalConstants.KEY_MEDIASTOP),
  MENU(GlobalConstants.KEY_MENU),
  META(GlobalConstants.KEY_META),
  MINUS(GlobalConstants.KEY_MINUS),
  MU(GlobalConstants.KEY_MU),
  MULTIPLY(GlobalConstants.KEY_MULTIPLY),
  N(GlobalConstants.KEY_N),
  NOBREAKSPACE(GlobalConstants.KEY_NOBREAKSPACE),
  NOTSIGN(GlobalConstants.KEY_NOTSIGN),
  NTILDE(GlobalConstants.KEY_NTILDE),
  NUMBERSIGN(GlobalConstants.KEY_NUMBERSIGN),
  NUMLOCK(GlobalConstants.KEY_NUMLOCK),
  O(GlobalConstants.KEY_O),
  OACUTE(GlobalConstants.KEY_OACUTE),
  OCIRCUMFLEX(GlobalConstants.KEY_OCIRCUMFLEX),
  ODIAERESIS(GlobalConstants.KEY_ODIAERESIS),
  OGRAVE(GlobalConstants.KEY_OGRAVE),
  ONEHALF(GlobalConstants.KEY_ONEHALF),
  ONEQUARTER(GlobalConstants.KEY_ONEQUARTER),
  ONESUPERIOR(GlobalConstants.KEY_ONESUPERIOR),
  OOBLIQUE(GlobalConstants.KEY_OOBLIQUE),
  OPENURL(GlobalConstants.KEY_OPENURL),
  ORDFEMININE(GlobalConstants.KEY_ORDFEMININE),
  OTILDE(GlobalConstants.KEY_OTILDE),
  P(GlobalConstants.KEY_P),
  PAGEDOWN(GlobalConstants.KEY_PAGEDOWN),
  PAGEUP(GlobalConstants.KEY_PAGEUP),
  PARAGRAPH(GlobalConstants.KEY_PARAGRAPH),
  PARENLEFT(GlobalConstants.KEY_PARENLEFT),
  PARENRIGHT(GlobalConstants.KEY_PARENRIGHT),
  PAUSE(GlobalConstants.KEY_PAUSE),
  PERCENT(GlobalConstants.KEY_PERCENT),
  PERIOD(GlobalConstants.KEY_PERIOD),
  PERIODCENTERED(GlobalConstants.KEY_PERIODCENTERED),
  PLUS(GlobalConstants.KEY_PLUS),
  PLUSMINUS(GlobalConstants.KEY_PLUSMINUS),
  PRINT(GlobalConstants.KEY_PRINT),
  Q(GlobalConstants.KEY_Q),
  QUESTION(GlobalConstants.KEY_QUESTION),
  QUESTIONDOWN(GlobalConstants.KEY_QUESTIONDOWN),
  QUOTEDBL(GlobalConstants.KEY_QUOTEDBL),
  QUOTELEFT(GlobalConstants.KEY_QUOTELEFT),
  R(GlobalConstants.KEY_R),
  REFRESH(GlobalConstants.KEY_REFRESH),
  REGISTERED(GlobalConstants.KEY_REGISTERED),
  RIGHT(GlobalConstants.KEY_RIGHT),
  S(GlobalConstants.KEY_S),
  SCROLLLOCK(GlobalConstants.KEY_SCROLLLOCK),
  SEARCH(GlobalConstants.KEY_SEARCH),
  SECTION(GlobalConstants.KEY_SECTION),
  SEMICOLON(GlobalConstants.KEY_SEMICOLON),
  SHIFT(GlobalConstants.KEY_SHIFT),
  SLASH(GlobalConstants.KEY_SLASH),
  SPACE(GlobalConstants.KEY_SPACE),
  SSHARP(GlobalConstants.KEY_SSHARP),
  STANDBY(GlobalConstants.KEY_STANDBY),
  STERLING(GlobalConstants.KEY_STERLING),
  STOP(GlobalConstants.KEY_STOP),
  SUPER_L(GlobalConstants.KEY_SUPER_L),
  SUPER_R(GlobalConstants.KEY_SUPER_R),
  SYSREQ(GlobalConstants.KEY_SYSREQ),
  T(GlobalConstants.KEY_T),
  TAB(GlobalConstants.KEY_TAB),
  THORN(GlobalConstants.KEY_THORN),
  THREEQUARTERS(GlobalConstants.KEY_THREEQUARTERS),
  THREESUPERIOR(GlobalConstants.KEY_THREESUPERIOR),
  TREBLEDOWN(GlobalConstants.KEY_TREBLEDOWN),
  TREBLEUP(GlobalConstants.KEY_TREBLEUP),
  TWOSUPERIOR(GlobalConstants.KEY_TWOSUPERIOR),
  U(GlobalConstants.KEY_U),
  UACUTE(GlobalConstants.KEY_UACUTE),
  UCIRCUMFLEX(GlobalConstants.KEY_UCIRCUMFLEX),
  UDIAERESIS(GlobalConstants.KEY_UDIAERESIS),
  UGRAVE(GlobalConstants.KEY_UGRAVE),
  UNDERSCORE(GlobalConstants.KEY_UNDERSCORE),
  UNKNOWN(GlobalConstants.KEY_UNKNOWN),
  UP(GlobalConstants.KEY_UP),
  V(GlobalConstants.KEY_V),
  VOLUMEDOWN(GlobalConstants.KEY_VOLUMEDOWN),
  VOLUMEMUTE(GlobalConstants.KEY_VOLUMEMUTE),
  VOLUMEUP(GlobalConstants.KEY_VOLUMEUP),
  W(GlobalConstants.KEY_W),
  X(GlobalConstants.KEY_X),
  Y(GlobalConstants.KEY_Y),
  YACUTE(GlobalConstants.KEY_YACUTE),
  YDIAERESIS(GlobalConstants.KEY_YDIAERESIS),
  YEN(GlobalConstants.KEY_YEN),
  Z(GlobalConstants.KEY_Z)
  ;
  companion object {
    fun from(value: Int) = values().first { it.value == value }
  }
}

enum class KeyModifierMask(val value: Int) {
  CODE_MASK(GlobalConstants.KEY_CODE_MASK),
  MASK(GlobalConstants.KEY_MODIFIER_MASK),
  ALT(GlobalConstants.KEY_MASK_ALT),
  CMD(GlobalConstants.KEY_MASK_CMD),
  CTRL(GlobalConstants.KEY_MASK_CTRL),
  GROUP_SWITCH(GlobalConstants.KEY_MASK_GROUP_SWITCH),
  KPAD(GlobalConstants.KEY_MASK_KPAD),
  META(GlobalConstants.KEY_MASK_META),
  SHIFT(GlobalConstants.KEY_MASK_SHIFT),
  ;
  companion object {
    fun from(value: Int) = values().first { it.value == value }
  }
}

enum class ButtonList(val value: Int) {
  LEFT(GlobalConstants.BUTTON_LEFT),
  MASK_LEFT(GlobalConstants.BUTTON_MASK_LEFT),
  MASK_MIDDLE(GlobalConstants.BUTTON_MASK_MIDDLE),
  MASK_RIGHT(GlobalConstants.BUTTON_MASK_RIGHT),
  MASK_XBUTTON1(GlobalConstants.BUTTON_MASK_XBUTTON1),
  MASK_XBUTTON2(GlobalConstants.BUTTON_MASK_XBUTTON2),
  MIDDLE(GlobalConstants.BUTTON_MIDDLE),
  RIGHT(GlobalConstants.BUTTON_RIGHT),
  WHEEL_DOWN(GlobalConstants.BUTTON_WHEEL_DOWN),
  WHEEL_LEFT(GlobalConstants.BUTTON_WHEEL_LEFT),
  WHEEL_RIGHT(GlobalConstants.BUTTON_WHEEL_RIGHT),
  WHEEL_UP(GlobalConstants.BUTTON_WHEEL_UP),
  XBUTTON1(GlobalConstants.BUTTON_XBUTTON1),
  XBUTTON2(GlobalConstants.BUTTON_XBUTTON2)
  ;

  companion object {
    fun from(value: Int) = values().first { it.value == value }
  }
}

enum class JoystickList(val value: Int) {
  // TODO
  ;
  companion object {
    fun from(value: Int) = values().first { it.value == value }
  }
}

enum class MidiMessageList(val value: Int) {
  // TODO
  ;
  companion object {
    fun from(value: Int) = values().first { it.value == value }
  }
}

enum class GDError(val value: Int) {
  OK(godot_error.GODOT_OK.value.toInt()),
  FAILED(godot_error.GODOT_FAILED.value.toInt()),
  ERR_UNAVAILABLE(godot_error.GODOT_ERR_UNAVAILABLE.value.toInt()),
  ERR_UNCONFIGURED(godot_error.GODOT_ERR_UNCONFIGURED.value.toInt()),
  ERR_UNAUTHORIZED(godot_error.GODOT_ERR_UNAUTHORIZED.value.toInt()),
  ERR_PARAMETER_RANGE_ERROR(godot_error.GODOT_ERR_PARAMETER_RANGE_ERROR.value.toInt()),
  ERR_OUT_OF_MEMORY(godot_error.GODOT_ERR_OUT_OF_MEMORY.value.toInt()),
  ERR_FILE_NOT_FOUND(godot_error.GODOT_ERR_FILE_NOT_FOUND.value.toInt()),
  ERR_FILE_BAD_DRIVE(godot_error.GODOT_ERR_FILE_BAD_DRIVE.value.toInt()),
  ERR_FILE_BAD_PATH(godot_error.GODOT_ERR_FILE_BAD_PATH.value.toInt()),
  ERR_FILE_NO_PERMISSION(godot_error.GODOT_ERR_FILE_NO_PERMISSION.value.toInt()),
  ERR_FILE_ALREADY_IN_USE(godot_error.GODOT_ERR_FILE_ALREADY_IN_USE.value.toInt()),
  ERR_FILE_CANT_OPEN(godot_error.GODOT_ERR_FILE_CANT_OPEN.value.toInt()),
  ERR_FILE_CANT_WRITE(godot_error.GODOT_ERR_FILE_CANT_WRITE.value.toInt()),
  ERR_FILE_CANT_READ(godot_error.GODOT_ERR_FILE_CANT_READ.value.toInt()),
  ERR_FILE_UNRECOGNIZED(godot_error.GODOT_ERR_FILE_UNRECOGNIZED.value.toInt()),
  ERR_FILE_CORRUPT(godot_error.GODOT_ERR_FILE_CORRUPT.value.toInt()),
  ERR_FILE_MISSING_DEPENDENCIES(godot_error.GODOT_ERR_FILE_MISSING_DEPENDENCIES.value.toInt()),
  ERR_FILE_EOF(godot_error.GODOT_ERR_FILE_EOF.value.toInt()),
  ERR_CANT_OPEN(godot_error.GODOT_ERR_CANT_OPEN.value.toInt()),
  ERR_CANT_CREATE(godot_error.GODOT_ERR_CANT_CREATE.value.toInt()),
  ERR_QUERY_FAILED(godot_error.GODOT_ERR_QUERY_FAILED.value.toInt()),
  ERR_ALREADY_IN_USE(godot_error.GODOT_ERR_ALREADY_IN_USE.value.toInt()),
  ERR_LOCKED(godot_error.GODOT_ERR_LOCKED.value.toInt()),
  ERR_TIMEOUT(godot_error.GODOT_ERR_TIMEOUT.value.toInt()),
  ERR_CANT_CONNECT(godot_error.GODOT_ERR_CANT_CONNECT.value.toInt()),
  ERR_CANT_RESOLVE(godot_error.GODOT_ERR_CANT_RESOLVE.value.toInt()),
  ERR_CONNECTION_ERROR(godot_error.GODOT_ERR_CONNECTION_ERROR.value.toInt()),
  ERR_CANT_ACQUIRE_RESOURCE(godot_error.GODOT_ERR_CANT_ACQUIRE_RESOURCE.value.toInt()),
  ERR_CANT_FORK(godot_error.GODOT_ERR_CANT_FORK.value.toInt()),
  ERR_INVALID_DATA(godot_error.GODOT_ERR_INVALID_DATA.value.toInt()),
  ERR_INVALID_PARAMETER(godot_error.GODOT_ERR_INVALID_PARAMETER.value.toInt()),
  ERR_ALREADY_EXISTS(godot_error.GODOT_ERR_ALREADY_EXISTS.value.toInt()),
  ERR_DOES_NOT_EXIST(godot_error.GODOT_ERR_DOES_NOT_EXIST.value.toInt()),
  ERR_DATABASE_CANT_READ(godot_error.GODOT_ERR_DATABASE_CANT_READ.value.toInt()),
  ERR_DATABASE_CANT_WRITE(godot_error.GODOT_ERR_DATABASE_CANT_WRITE.value.toInt()),
  ERR_COMPILATION_FAILED(godot_error.GODOT_ERR_COMPILATION_FAILED.value.toInt()),
  ERR_METHOD_NOT_FOUND(godot_error.GODOT_ERR_METHOD_NOT_FOUND.value.toInt()),
  ERR_LINK_FAILED(godot_error.GODOT_ERR_LINK_FAILED.value.toInt()),
  ERR_SCRIPT_FAILED(godot_error.GODOT_ERR_SCRIPT_FAILED.value.toInt()),
  ERR_CYCLIC_LINK(godot_error.GODOT_ERR_CYCLIC_LINK.value.toInt()),
  ERR_INVALID_DECLARATION(godot_error.GODOT_ERR_INVALID_DECLARATION.value.toInt()),
  ERR_DUPLICATE_SYMBOL(godot_error.GODOT_ERR_DUPLICATE_SYMBOL.value.toInt()),
  ERR_PARSE_ERROR(godot_error.GODOT_ERR_PARSE_ERROR.value.toInt()),
  ERR_BUSY(godot_error.GODOT_ERR_BUSY.value.toInt()),
  ERR_SKIP(godot_error.GODOT_ERR_SKIP.value.toInt()),
  ERR_HELP(godot_error.GODOT_ERR_HELP.value.toInt()),
  ERR_BUG(godot_error.GODOT_ERR_BUG.value.toInt()),
  ERR_PRINTER_ON_FIRE(godot_error.GODOT_ERR_PRINTER_ON_FIRE.value.toInt());

  companion object {
    fun from(value: Int) = values().first { it.value == value }
  }

}