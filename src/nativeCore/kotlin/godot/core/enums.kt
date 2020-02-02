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
  // TODO
  ;
  companion object {
    fun from(value: Int) = values().first { it.value == value }
  }
}

enum class KeyModifierMask(val value: Int) {
  // TODO
  ;
  companion object {
    fun from(value: Int) = values().first { it.value == value }
  }
}

enum class ButtonList(val value: Int) {
  // TODO
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