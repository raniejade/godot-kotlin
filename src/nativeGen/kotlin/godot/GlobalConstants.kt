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

open class GlobalConstants internal constructor(
  internal val _handle: COpaquePointer
) {
  companion object {
    val Instance: GlobalConstants = memScoped {
          val handle =
            checkNotNull(Godot.gdnative.godot_global_get_singleton)("GlobalConstants".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton GlobalConstants" }
          GlobalConstants(
            handle
          )
        }

    val BUTTON_LEFT: Int = 1

    val BUTTON_MASK_LEFT: Int = 1

    val BUTTON_MASK_MIDDLE: Int = 4

    val BUTTON_MASK_RIGHT: Int = 2

    val BUTTON_MASK_XBUTTON1: Int = 128

    val BUTTON_MASK_XBUTTON2: Int = 256

    val BUTTON_MIDDLE: Int = 3

    val BUTTON_RIGHT: Int = 2

    val BUTTON_WHEEL_DOWN: Int = 5

    val BUTTON_WHEEL_LEFT: Int = 6

    val BUTTON_WHEEL_RIGHT: Int = 7

    val BUTTON_WHEEL_UP: Int = 4

    val BUTTON_XBUTTON1: Int = 8

    val BUTTON_XBUTTON2: Int = 9

    val CORNER_BOTTOM_LEFT: Int = 3

    val CORNER_BOTTOM_RIGHT: Int = 2

    val CORNER_TOP_LEFT: Int = 0

    val CORNER_TOP_RIGHT: Int = 1

    val ERR_ALREADY_EXISTS: Int = 32

    val ERR_ALREADY_IN_USE: Int = 22

    val ERR_BUG: Int = 47

    val ERR_BUSY: Int = 44

    val ERR_CANT_ACQUIRE_RESOURCE: Int = 28

    val ERR_CANT_CREATE: Int = 20

    val ERR_CANT_OPEN: Int = 19

    val ERR_COMPILATION_FAILED: Int = 36

    val ERR_CYCLIC_LINK: Int = 40

    val ERR_DATABASE_CANT_READ: Int = 34

    val ERR_DATABASE_CANT_WRITE: Int = 35

    val ERR_DOES_NOT_EXIST: Int = 33

    val ERR_FILE_ALREADY_IN_USE: Int = 11

    val ERR_FILE_BAD_DRIVE: Int = 8

    val ERR_FILE_BAD_PATH: Int = 9

    val ERR_FILE_CANT_OPEN: Int = 12

    val ERR_FILE_CANT_READ: Int = 14

    val ERR_FILE_CANT_WRITE: Int = 13

    val ERR_FILE_CORRUPT: Int = 16

    val ERR_FILE_EOF: Int = 18

    val ERR_FILE_MISSING_DEPENDENCIES: Int = 17

    val ERR_FILE_NOT_FOUND: Int = 7

    val ERR_FILE_NO_PERMISSION: Int = 10

    val ERR_FILE_UNRECOGNIZED: Int = 15

    val ERR_HELP: Int = 46

    val ERR_INVALID_DATA: Int = 30

    val ERR_INVALID_PARAMETER: Int = 31

    val ERR_LINK_FAILED: Int = 38

    val ERR_LOCKED: Int = 23

    val ERR_METHOD_NOT_FOUND: Int = 37

    val ERR_OUT_OF_MEMORY: Int = 6

    val ERR_PARAMETER_RANGE_ERROR: Int = 5

    val ERR_PARSE_ERROR: Int = 43

    val ERR_QUERY_FAILED: Int = 21

    val ERR_SCRIPT_FAILED: Int = 39

    val ERR_TIMEOUT: Int = 24

    val ERR_UNAUTHORIZED: Int = 4

    val ERR_UNAVAILABLE: Int = 2

    val ERR_UNCONFIGURED: Int = 3

    val FAILED: Int = 1

    val HALIGN_CENTER: Int = 1

    val HALIGN_LEFT: Int = 0

    val HALIGN_RIGHT: Int = 2

    val HORIZONTAL: Int = 0

    val JOY_ANALOG_L2: Int = 6

    val JOY_ANALOG_LX: Int = 0

    val JOY_ANALOG_LY: Int = 1

    val JOY_ANALOG_R2: Int = 7

    val JOY_ANALOG_RX: Int = 2

    val JOY_ANALOG_RY: Int = 3

    val JOY_AXIS_0: Int = 0

    val JOY_AXIS_1: Int = 1

    val JOY_AXIS_2: Int = 2

    val JOY_AXIS_3: Int = 3

    val JOY_AXIS_4: Int = 4

    val JOY_AXIS_5: Int = 5

    val JOY_AXIS_6: Int = 6

    val JOY_AXIS_7: Int = 7

    val JOY_AXIS_8: Int = 8

    val JOY_AXIS_9: Int = 9

    val JOY_AXIS_MAX: Int = 10

    val JOY_BUTTON_0: Int = 0

    val JOY_BUTTON_1: Int = 1

    val JOY_BUTTON_10: Int = 10

    val JOY_BUTTON_11: Int = 11

    val JOY_BUTTON_12: Int = 12

    val JOY_BUTTON_13: Int = 13

    val JOY_BUTTON_14: Int = 14

    val JOY_BUTTON_15: Int = 15

    val JOY_BUTTON_2: Int = 2

    val JOY_BUTTON_3: Int = 3

    val JOY_BUTTON_4: Int = 4

    val JOY_BUTTON_5: Int = 5

    val JOY_BUTTON_6: Int = 6

    val JOY_BUTTON_7: Int = 7

    val JOY_BUTTON_8: Int = 8

    val JOY_BUTTON_9: Int = 9

    val JOY_BUTTON_MAX: Int = 16

    val JOY_DPAD_DOWN: Int = 13

    val JOY_DPAD_LEFT: Int = 14

    val JOY_DPAD_RIGHT: Int = 15

    val JOY_DPAD_UP: Int = 12

    val JOY_DS_A: Int = 1

    val JOY_DS_B: Int = 0

    val JOY_DS_X: Int = 3

    val JOY_DS_Y: Int = 2

    val JOY_L: Int = 4

    val JOY_L2: Int = 6

    val JOY_L3: Int = 8

    val JOY_OCULUS_AX: Int = 7

    val JOY_OCULUS_BY: Int = 1

    val JOY_OCULUS_MENU: Int = 3

    val JOY_OPENVR_MENU: Int = 1

    val JOY_OPENVR_TOUCHPADX: Int = 0

    val JOY_OPENVR_TOUCHPADY: Int = 1

    val JOY_R: Int = 5

    val JOY_R2: Int = 7

    val JOY_R3: Int = 9

    val JOY_SELECT: Int = 10

    val JOY_SONY_CIRCLE: Int = 1

    val JOY_SONY_SQUARE: Int = 2

    val JOY_SONY_TRIANGLE: Int = 3

    val JOY_SONY_X: Int = 0

    val JOY_START: Int = 11

    val JOY_VR_ANALOG_GRIP: Int = 4

    val JOY_VR_ANALOG_TRIGGER: Int = 2

    val JOY_VR_GRIP: Int = 2

    val JOY_VR_PAD: Int = 14

    val JOY_VR_TRIGGER: Int = 15

    val JOY_XBOX_A: Int = 0

    val JOY_XBOX_B: Int = 1

    val JOY_XBOX_X: Int = 2

    val JOY_XBOX_Y: Int = 3

    val KEY_0: Int = 48

    val KEY_1: Int = 49

    val KEY_2: Int = 50

    val KEY_3: Int = 51

    val KEY_4: Int = 52

    val KEY_5: Int = 53

    val KEY_6: Int = 54

    val KEY_7: Int = 55

    val KEY_8: Int = 56

    val KEY_9: Int = 57

    val KEY_A: Int = 65

    val KEY_AACUTE: Int = 193

    val KEY_ACIRCUMFLEX: Int = 194

    val KEY_ACUTE: Int = 180

    val KEY_ADIAERESIS: Int = 196

    val KEY_AE: Int = 198

    val KEY_AGRAVE: Int = 192

    val KEY_ALT: Int = 16777240

    val KEY_AMPERSAND: Int = 38

    val KEY_APOSTROPHE: Int = 39

    val KEY_ARING: Int = 197

    val KEY_ASCIICIRCUM: Int = 94

    val KEY_ASCIITILDE: Int = 126

    val KEY_ASTERISK: Int = 42

    val KEY_AT: Int = 64

    val KEY_ATILDE: Int = 195

    val KEY_B: Int = 66

    val KEY_BACK: Int = 16777280

    val KEY_BACKSLASH: Int = 92

    val KEY_BACKSPACE: Int = 16777220

    val KEY_BACKTAB: Int = 16777219

    val KEY_BAR: Int = 124

    val KEY_BASSBOOST: Int = 16777287

    val KEY_BASSDOWN: Int = 16777289

    val KEY_BASSUP: Int = 16777288

    val KEY_BRACELEFT: Int = 123

    val KEY_BRACERIGHT: Int = 125

    val KEY_BRACKETLEFT: Int = 91

    val KEY_BRACKETRIGHT: Int = 93

    val KEY_BROKENBAR: Int = 166

    val KEY_C: Int = 67

    val KEY_CAPSLOCK: Int = 16777241

    val KEY_CCEDILLA: Int = 199

    val KEY_CEDILLA: Int = 184

    val KEY_CENT: Int = 162

    val KEY_CLEAR: Int = 16777228

    val KEY_CODE_MASK: Int = 33554431

    val KEY_COLON: Int = 58

    val KEY_COMMA: Int = 44

    val KEY_CONTROL: Int = 16777238

    val KEY_COPYRIGHT: Int = 169

    val KEY_CURRENCY: Int = 164

    val KEY_D: Int = 68

    val KEY_DEGREE: Int = 176

    val KEY_DELETE: Int = 16777224

    val KEY_DIAERESIS: Int = 168

    val KEY_DIRECTION_L: Int = 16777266

    val KEY_DIRECTION_R: Int = 16777267

    val KEY_DIVISION: Int = 247

    val KEY_DOLLAR: Int = 36

    val KEY_DOWN: Int = 16777234

    val KEY_E: Int = 69

    val KEY_EACUTE: Int = 201

    val KEY_ECIRCUMFLEX: Int = 202

    val KEY_EDIAERESIS: Int = 203

    val KEY_EGRAVE: Int = 200

    val KEY_END: Int = 16777230

    val KEY_ENTER: Int = 16777221

    val KEY_EQUAL: Int = 61

    val KEY_ESCAPE: Int = 16777217

    val KEY_ETH: Int = 208

    val KEY_EXCLAM: Int = 33

    val KEY_EXCLAMDOWN: Int = 161

    val KEY_F: Int = 70

    val KEY_F1: Int = 16777244

    val KEY_F10: Int = 16777253

    val KEY_F11: Int = 16777254

    val KEY_F12: Int = 16777255

    val KEY_F13: Int = 16777256

    val KEY_F14: Int = 16777257

    val KEY_F15: Int = 16777258

    val KEY_F16: Int = 16777259

    val KEY_F2: Int = 16777245

    val KEY_F3: Int = 16777246

    val KEY_F4: Int = 16777247

    val KEY_F5: Int = 16777248

    val KEY_F6: Int = 16777249

    val KEY_F7: Int = 16777250

    val KEY_F8: Int = 16777251

    val KEY_F9: Int = 16777252

    val KEY_FAVORITES: Int = 16777298

    val KEY_FORWARD: Int = 16777281

    val KEY_G: Int = 71

    val KEY_GREATER: Int = 62

    val KEY_GUILLEMOTLEFT: Int = 171

    val KEY_GUILLEMOTRIGHT: Int = 187

    val KEY_H: Int = 72

    val KEY_HELP: Int = 16777265

    val KEY_HOME: Int = 16777229

    val KEY_HOMEPAGE: Int = 16777297

    val KEY_HYPER_L: Int = 16777263

    val KEY_HYPER_R: Int = 16777264

    val KEY_HYPHEN: Int = 173

    val KEY_I: Int = 73

    val KEY_IACUTE: Int = 205

    val KEY_ICIRCUMFLEX: Int = 206

    val KEY_IDIAERESIS: Int = 207

    val KEY_IGRAVE: Int = 204

    val KEY_INSERT: Int = 16777223

    val KEY_J: Int = 74

    val KEY_K: Int = 75

    val KEY_KP_0: Int = 16777350

    val KEY_KP_1: Int = 16777351

    val KEY_KP_2: Int = 16777352

    val KEY_KP_3: Int = 16777353

    val KEY_KP_4: Int = 16777354

    val KEY_KP_5: Int = 16777355

    val KEY_KP_6: Int = 16777356

    val KEY_KP_7: Int = 16777357

    val KEY_KP_8: Int = 16777358

    val KEY_KP_9: Int = 16777359

    val KEY_KP_ADD: Int = 16777349

    val KEY_KP_DIVIDE: Int = 16777346

    val KEY_KP_ENTER: Int = 16777222

    val KEY_KP_MULTIPLY: Int = 16777345

    val KEY_KP_PERIOD: Int = 16777348

    val KEY_KP_SUBTRACT: Int = 16777347

    val KEY_L: Int = 76

    val KEY_LAUNCH0: Int = 16777304

    val KEY_LAUNCH1: Int = 16777305

    val KEY_LAUNCH2: Int = 16777306

    val KEY_LAUNCH3: Int = 16777307

    val KEY_LAUNCH4: Int = 16777308

    val KEY_LAUNCH5: Int = 16777309

    val KEY_LAUNCH6: Int = 16777310

    val KEY_LAUNCH7: Int = 16777311

    val KEY_LAUNCH8: Int = 16777312

    val KEY_LAUNCH9: Int = 16777313

    val KEY_LAUNCHA: Int = 16777314

    val KEY_LAUNCHB: Int = 16777315

    val KEY_LAUNCHC: Int = 16777316

    val KEY_LAUNCHD: Int = 16777317

    val KEY_LAUNCHE: Int = 16777318

    val KEY_LAUNCHF: Int = 16777319

    val KEY_LAUNCHMAIL: Int = 16777302

    val KEY_LAUNCHMEDIA: Int = 16777303

    val KEY_LEFT: Int = 16777231

    val KEY_LESS: Int = 60

    val KEY_M: Int = 77

    val KEY_MACRON: Int = 175

    val KEY_MASCULINE: Int = 186

    val KEY_MASK_ALT: Int = 67108864

    val KEY_MASK_CMD: Int = 268435456

    val KEY_MASK_CTRL: Int = 268435456

    val KEY_MASK_GROUP_SWITCH: Int = 1073741824

    val KEY_MASK_KPAD: Int = 536870912

    val KEY_MASK_META: Int = 134217728

    val KEY_MASK_SHIFT: Int = 33554432

    val KEY_MEDIANEXT: Int = 16777295

    val KEY_MEDIAPLAY: Int = 16777292

    val KEY_MEDIAPREVIOUS: Int = 16777294

    val KEY_MEDIARECORD: Int = 16777296

    val KEY_MEDIASTOP: Int = 16777293

    val KEY_MENU: Int = 16777262

    val KEY_META: Int = 16777239

    val KEY_MINUS: Int = 45

    val KEY_MODIFIER_MASK: Int = -16777216

    val KEY_MU: Int = 181

    val KEY_MULTIPLY: Int = 215

    val KEY_N: Int = 78

    val KEY_NOBREAKSPACE: Int = 160

    val KEY_NOTSIGN: Int = 172

    val KEY_NTILDE: Int = 209

    val KEY_NUMBERSIGN: Int = 35

    val KEY_NUMLOCK: Int = 16777242

    val KEY_O: Int = 79

    val KEY_OACUTE: Int = 211

    val KEY_OCIRCUMFLEX: Int = 212

    val KEY_ODIAERESIS: Int = 214

    val KEY_OGRAVE: Int = 210

    val KEY_ONEHALF: Int = 189

    val KEY_ONEQUARTER: Int = 188

    val KEY_ONESUPERIOR: Int = 185

    val KEY_OOBLIQUE: Int = 216

    val KEY_OPENURL: Int = 16777301

    val KEY_ORDFEMININE: Int = 170

    val KEY_OTILDE: Int = 213

    val KEY_P: Int = 80

    val KEY_PAGEDOWN: Int = 16777236

    val KEY_PAGEUP: Int = 16777235

    val KEY_PARAGRAPH: Int = 182

    val KEY_PARENLEFT: Int = 40

    val KEY_PARENRIGHT: Int = 41

    val KEY_PAUSE: Int = 16777225

    val KEY_PERCENT: Int = 37

    val KEY_PERIOD: Int = 46

    val KEY_PERIODCENTERED: Int = 183

    val KEY_PLUS: Int = 43

    val KEY_PLUSMINUS: Int = 177

    val KEY_PRINT: Int = 16777226

    val KEY_Q: Int = 81

    val KEY_QUESTION: Int = 63

    val KEY_QUESTIONDOWN: Int = 191

    val KEY_QUOTEDBL: Int = 34

    val KEY_QUOTELEFT: Int = 96

    val KEY_R: Int = 82

    val KEY_REFRESH: Int = 16777283

    val KEY_REGISTERED: Int = 174

    val KEY_RIGHT: Int = 16777233

    val KEY_S: Int = 83

    val KEY_SCROLLLOCK: Int = 16777243

    val KEY_SEARCH: Int = 16777299

    val KEY_SECTION: Int = 167

    val KEY_SEMICOLON: Int = 59

    val KEY_SHIFT: Int = 16777237

    val KEY_SLASH: Int = 47

    val KEY_SPACE: Int = 32

    val KEY_SSHARP: Int = 223

    val KEY_STANDBY: Int = 16777300

    val KEY_STERLING: Int = 163

    val KEY_STOP: Int = 16777282

    val KEY_SUPER_L: Int = 16777260

    val KEY_SUPER_R: Int = 16777261

    val KEY_SYSREQ: Int = 16777227

    val KEY_T: Int = 84

    val KEY_TAB: Int = 16777218

    val KEY_THORN: Int = 222

    val KEY_THREEQUARTERS: Int = 190

    val KEY_THREESUPERIOR: Int = 179

    val KEY_TREBLEDOWN: Int = 16777291

    val KEY_TREBLEUP: Int = 16777290

    val KEY_TWOSUPERIOR: Int = 178

    val KEY_U: Int = 85

    val KEY_UACUTE: Int = 218

    val KEY_UCIRCUMFLEX: Int = 219

    val KEY_UDIAERESIS: Int = 220

    val KEY_UGRAVE: Int = 217

    val KEY_UNDERSCORE: Int = 95

    val KEY_UNKNOWN: Int = 33554431

    val KEY_UP: Int = 16777232

    val KEY_V: Int = 86

    val KEY_VOLUMEDOWN: Int = 16777284

    val KEY_VOLUMEMUTE: Int = 16777285

    val KEY_VOLUMEUP: Int = 16777286

    val KEY_W: Int = 87

    val KEY_X: Int = 88

    val KEY_Y: Int = 89

    val KEY_YACUTE: Int = 221

    val KEY_YDIAERESIS: Int = 255

    val KEY_YEN: Int = 165

    val KEY_Z: Int = 90

    val MARGIN_BOTTOM: Int = 3

    val MARGIN_LEFT: Int = 0

    val MARGIN_RIGHT: Int = 2

    val MARGIN_TOP: Int = 1

    val METHOD_FLAGS_DEFAULT: Int = 1

    val METHOD_FLAG_CONST: Int = 8

    val METHOD_FLAG_EDITOR: Int = 2

    val METHOD_FLAG_FROM_SCRIPT: Int = 64

    val METHOD_FLAG_NORMAL: Int = 1

    val METHOD_FLAG_NOSCRIPT: Int = 4

    val METHOD_FLAG_REVERSE: Int = 16

    val METHOD_FLAG_VIRTUAL: Int = 32

    val MIDI_MESSAGE_AFTERTOUCH: Int = 10

    val MIDI_MESSAGE_CHANNEL_PRESSURE: Int = 13

    val MIDI_MESSAGE_CONTROL_CHANGE: Int = 11

    val MIDI_MESSAGE_NOTE_OFF: Int = 8

    val MIDI_MESSAGE_NOTE_ON: Int = 9

    val MIDI_MESSAGE_PITCH_BEND: Int = 14

    val MIDI_MESSAGE_PROGRAM_CHANGE: Int = 12

    val OK: Int = 0

    val OP_ADD: Int = 6

    val OP_AND: Int = 20

    val OP_BIT_AND: Int = 16

    val OP_BIT_NEGATE: Int = 19

    val OP_BIT_OR: Int = 17

    val OP_BIT_XOR: Int = 18

    val OP_DIVIDE: Int = 9

    val OP_EQUAL: Int = 0

    val OP_GREATER: Int = 4

    val OP_GREATER_EQUAL: Int = 5

    val OP_IN: Int = 24

    val OP_LESS: Int = 2

    val OP_LESS_EQUAL: Int = 3

    val OP_MAX: Int = 25

    val OP_MODULE: Int = 12

    val OP_MULTIPLY: Int = 8

    val OP_NEGATE: Int = 10

    val OP_NOT: Int = 23

    val OP_NOT_EQUAL: Int = 1

    val OP_OR: Int = 21

    val OP_POSITIVE: Int = 11

    val OP_SHIFT_LEFT: Int = 14

    val OP_SHIFT_RIGHT: Int = 15

    val OP_STRING_CONCAT: Int = 13

    val OP_SUBTRACT: Int = 7

    val OP_XOR: Int = 22

    val PROPERTY_HINT_COLOR_NO_ALPHA: Int = 20

    val PROPERTY_HINT_DIR: Int = 14

    val PROPERTY_HINT_ENUM: Int = 3

    val PROPERTY_HINT_EXP_EASING: Int = 4

    val PROPERTY_HINT_EXP_RANGE: Int = 2

    val PROPERTY_HINT_FILE: Int = 13

    val PROPERTY_HINT_FLAGS: Int = 8

    val PROPERTY_HINT_GLOBAL_DIR: Int = 16

    val PROPERTY_HINT_GLOBAL_FILE: Int = 15

    val PROPERTY_HINT_IMAGE_COMPRESS_LOSSLESS: Int = 22

    val PROPERTY_HINT_IMAGE_COMPRESS_LOSSY: Int = 21

    val PROPERTY_HINT_KEY_ACCEL: Int = 7

    val PROPERTY_HINT_LAYERS_2D_PHYSICS: Int = 10

    val PROPERTY_HINT_LAYERS_2D_RENDER: Int = 9

    val PROPERTY_HINT_LAYERS_3D_PHYSICS: Int = 12

    val PROPERTY_HINT_LAYERS_3D_RENDER: Int = 11

    val PROPERTY_HINT_LENGTH: Int = 5

    val PROPERTY_HINT_MULTILINE_TEXT: Int = 18

    val PROPERTY_HINT_NONE: Int = 0

    val PROPERTY_HINT_PLACEHOLDER_TEXT: Int = 19

    val PROPERTY_HINT_RANGE: Int = 1

    val PROPERTY_HINT_RESOURCE_TYPE: Int = 17

    val PROPERTY_USAGE_CATEGORY: Int = 256

    val PROPERTY_USAGE_CHECKABLE: Int = 16

    val PROPERTY_USAGE_CHECKED: Int = 32

    val PROPERTY_USAGE_DEFAULT: Int = 7

    val PROPERTY_USAGE_DEFAULT_INTL: Int = 71

    val PROPERTY_USAGE_EDITOR: Int = 2

    val PROPERTY_USAGE_EDITOR_HELPER: Int = 8

    val PROPERTY_USAGE_GROUP: Int = 128

    val PROPERTY_USAGE_INTERNATIONALIZED: Int = 64

    val PROPERTY_USAGE_NETWORK: Int = 4

    val PROPERTY_USAGE_NOEDITOR: Int = 5

    val PROPERTY_USAGE_NO_INSTANCE_STATE: Int = 2048

    val PROPERTY_USAGE_RESTART_IF_CHANGED: Int = 4096

    val PROPERTY_USAGE_SCRIPT_VARIABLE: Int = 8192

    val PROPERTY_USAGE_STORAGE: Int = 1

    val SPKEY: Int = 16777216

    val TYPE_AABB: Int = 11

    val TYPE_ARRAY: Int = 19

    val TYPE_BASIS: Int = 12

    val TYPE_BOOL: Int = 1

    val TYPE_COLOR: Int = 14

    val TYPE_COLOR_ARRAY: Int = 26

    val TYPE_DICTIONARY: Int = 18

    val TYPE_INT: Int = 2

    val TYPE_INT_ARRAY: Int = 21

    val TYPE_MAX: Int = 27

    val TYPE_NIL: Int = 0

    val TYPE_NODE_PATH: Int = 15

    val TYPE_OBJECT: Int = 17

    val TYPE_PLANE: Int = 9

    val TYPE_QUAT: Int = 10

    val TYPE_RAW_ARRAY: Int = 20

    val TYPE_REAL: Int = 3

    val TYPE_REAL_ARRAY: Int = 22

    val TYPE_RECT2: Int = 6

    val TYPE_RID: Int = 16

    val TYPE_STRING: Int = 4

    val TYPE_STRING_ARRAY: Int = 23

    val TYPE_TRANSFORM: Int = 13

    val TYPE_TRANSFORM2D: Int = 8

    val TYPE_VECTOR2: Int = 5

    val TYPE_VECTOR2_ARRAY: Int = 24

    val TYPE_VECTOR3: Int = 7

    val TYPE_VECTOR3_ARRAY: Int = 25

    val VALIGN_BOTTOM: Int = 2

    val VALIGN_CENTER: Int = 1

    val VALIGN_TOP: Int = 0

    val VERTICAL: Int = 1
  }
}
