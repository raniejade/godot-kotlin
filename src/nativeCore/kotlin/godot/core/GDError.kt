package godot.core

import gdnative.godot_error

enum class GDError(private val value: godot_error) {
  OK(godot_error.GODOT_OK),
  FAILED(godot_error.GODOT_FAILED),
  ERR_UNAVAILABLE(godot_error.GODOT_ERR_UNAVAILABLE),
  ERR_UNCONFIGURED(godot_error.GODOT_ERR_UNCONFIGURED),
  ERR_UNAUTHORIZED(godot_error.GODOT_ERR_UNAUTHORIZED),
  ERR_PARAMETER_RANGE_ERROR(godot_error.GODOT_ERR_PARAMETER_RANGE_ERROR),
  ERR_OUT_OF_MEMORY(godot_error.GODOT_ERR_OUT_OF_MEMORY),
  ERR_FILE_NOT_FOUND(godot_error.GODOT_ERR_FILE_NOT_FOUND),
  ERR_FILE_BAD_DRIVE(godot_error.GODOT_ERR_FILE_BAD_DRIVE),
  ERR_FILE_BAD_PATH(godot_error.GODOT_ERR_FILE_BAD_PATH),
  ERR_FILE_NO_PERMISSION(godot_error.GODOT_ERR_FILE_NO_PERMISSION),
  ERR_FILE_ALREADY_IN_USE(godot_error.GODOT_ERR_FILE_ALREADY_IN_USE),
  ERR_FILE_CANT_OPEN(godot_error.GODOT_ERR_FILE_CANT_OPEN),
  ERR_FILE_CANT_WRITE(godot_error.GODOT_ERR_FILE_CANT_WRITE),
  ERR_FILE_CANT_READ(godot_error.GODOT_ERR_FILE_CANT_READ),
  ERR_FILE_UNRECOGNIZED(godot_error.GODOT_ERR_FILE_UNRECOGNIZED),
  ERR_FILE_CORRUPT(godot_error.GODOT_ERR_FILE_CORRUPT),
  ERR_FILE_MISSING_DEPENDENCIES(godot_error.GODOT_ERR_FILE_MISSING_DEPENDENCIES),
  ERR_FILE_EOF(godot_error.GODOT_ERR_FILE_EOF),
  ERR_CANT_OPEN(godot_error.GODOT_ERR_CANT_OPEN),
  ERR_CANT_CREATE(godot_error.GODOT_ERR_CANT_CREATE),
  ERR_QUERY_FAILED(godot_error.GODOT_ERR_QUERY_FAILED),
  ERR_ALREADY_IN_USE(godot_error.GODOT_ERR_ALREADY_IN_USE),
  ERR_LOCKED(godot_error.GODOT_ERR_LOCKED),
  ERR_TIMEOUT(godot_error.GODOT_ERR_TIMEOUT),
  ERR_CANT_CONNECT(godot_error.GODOT_ERR_CANT_CONNECT),
  ERR_CANT_RESOLVE(godot_error.GODOT_ERR_CANT_RESOLVE),
  ERR_CONNECTION_ERROR(godot_error.GODOT_ERR_CONNECTION_ERROR),
  ERR_CANT_ACQUIRE_RESOURCE(godot_error.GODOT_ERR_CANT_ACQUIRE_RESOURCE),
  ERR_CANT_FORK(godot_error.GODOT_ERR_CANT_FORK),
  ERR_INVALID_DATA(godot_error.GODOT_ERR_INVALID_DATA),
  ERR_INVALID_PARAMETER(godot_error.GODOT_ERR_INVALID_PARAMETER),
  ERR_ALREADY_EXISTS(godot_error.GODOT_ERR_ALREADY_EXISTS),
  ERR_DOES_NOT_EXIST(godot_error.GODOT_ERR_DOES_NOT_EXIST),
  ERR_DATABASE_CANT_READ(godot_error.GODOT_ERR_DATABASE_CANT_READ),
  ERR_DATABASE_CANT_WRITE(godot_error.GODOT_ERR_DATABASE_CANT_WRITE),
  ERR_COMPILATION_FAILED(godot_error.GODOT_ERR_COMPILATION_FAILED),
  ERR_METHOD_NOT_FOUND(godot_error.GODOT_ERR_METHOD_NOT_FOUND),
  ERR_LINK_FAILED(godot_error.GODOT_ERR_LINK_FAILED),
  ERR_SCRIPT_FAILED(godot_error.GODOT_ERR_SCRIPT_FAILED),
  ERR_CYCLIC_LINK(godot_error.GODOT_ERR_CYCLIC_LINK),
  ERR_INVALID_DECLARATION(godot_error.GODOT_ERR_INVALID_DECLARATION),
  ERR_DUPLICATE_SYMBOL(godot_error.GODOT_ERR_DUPLICATE_SYMBOL),
  ERR_PARSE_ERROR(godot_error.GODOT_ERR_PARSE_ERROR),
  ERR_BUSY(godot_error.GODOT_ERR_BUSY),
  ERR_SKIP(godot_error.GODOT_ERR_SKIP),
  ERR_HELP(godot_error.GODOT_ERR_HELP),
  ERR_BUG(godot_error.GODOT_ERR_BUG),
  ERR_PRINTER_ON_FIRE(godot_error.GODOT_ERR_PRINTER_ON_FIRE);

  companion object {
    fun from(value: godot_error): GDError {
      for (enumValue in values()) {
        if (enumValue.value == value) {
          return enumValue
        }
      }
      throw IllegalArgumentException("Unknown value $godot_error")
    }
    fun from(value: Int): GDError {
      for (enumValue in values()) {
        if (enumValue.value.value == value.toUInt()) {
          return enumValue
        }
      }
      throw IllegalArgumentException("Unknown value $godot_error")
    }
  }
}