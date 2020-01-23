package godot

import gdnative.godot_string
import kotlinx.cinterop.*

class GDString(
  value: CValue<godot_string>
): Primitive<godot_string>(value), Iterable<Char> {
  fun beginsWith(str: GDString): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_begins_with)(_value.ptr, str._value.ptr)
    }
  }

  fun beginsWith(str: String): Boolean {
    return beginsWith(new(str))
  }

  fun bigrams(): PoolStringArray {
    return memScoped {
      PoolStringArray.new(
        GDArray(checkNotNull(Godot.gdnative.godot_string_bigrams)(_value.ptr))
      )
    }
  }

  fun cEscape(): GDString {
    return memScoped {
      GDString(checkNotNull(Godot.gdnative.godot_string_c_escape)(_value.ptr))
    }
  }

  fun cUnEscape(): GDString {
    return memScoped {
      GDString(checkNotNull(Godot.gdnative.godot_string_c_unescape)(_value.ptr))
    }
  }

  fun capitalize(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_capitalize)(_value.ptr)
      )
    }
  }

  fun caseCmpTo(to: GDString): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_casecmp_to)(_value.ptr, to._value.ptr).toInt()
    }
  }

  fun caseCmpTo(to: String): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_casecmp_to)(_value.ptr, new(to)._value.ptr).toInt()
    }
  }

  fun dedent(): GDString {
    return memScoped {
      GDString(checkNotNull(Godot.gdnative11.godot_string_dedent)(_value.ptr))
    }
  }

  fun empty(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_empty)(_value.ptr)
    }
  }

  fun endsWith(str: GDString): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_ends_with)(_value.ptr, str._value.ptr)
    }
  }

  fun endsWith(str: String): Boolean {
    return endsWith(new(str))
  }

  fun erase(position: Int, count: Int) {
    _value = memScoped {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_string_erase)(ptr, position, count)
      ptr.pointed.readValue()
    }
  }

  fun find(str: GDString, from: Int = 0): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_find_from)(_value.ptr, str._value, from)
    }
  }

  fun find(str: String, from: Int = 0): Int {
    return find(new(str), from)
  }

  fun findLast(str: GDString): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_find_last)(_value.ptr, str._value)
    }
  }

  fun findLast(str: String): Int {
    return findLast(new(str))
  }

  fun findN(str: GDString, from: Int = 0): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_findn_from)(_value.ptr, str._value, from)
    }
  }

  fun findN(str: String, from: Int = 0): Int {
    return findN(new(str), from)
  }

  fun format(values: Variant): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_format)(_value.ptr, values._value.ptr)
      )
    }
  }

  fun format(values: Variant, placeholder: String): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_format_with_custom_placeholder)(_value.ptr, values._value.ptr, placeholder.cstr.ptr)
      )
    }
  }

  fun getBaseDir(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_get_base_dir)(_value.ptr)
      )
    }
  }

  fun getBaseName(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_get_basename)(_value.ptr)
      )
    }
  }

  fun getExtension(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_get_extension)(_value.ptr)
      )
    }
  }

  fun getFile(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_get_file)(_value.ptr)
      )
    }
  }

  // TODO: pass UINT?
  fun hash(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_hash)(_value.ptr).toInt()
    }
  }

  fun hexToInt(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_hex_to_int)(_value.ptr)
    }
  }

  fun insert(position: Int, str: GDString): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_insert)(_value.ptr, position, str._value)
      )
    }
  }

  fun insert(position: Int, str: String): GDString {
    return insert(position, new(str))
  }

  fun isAbsPath(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_is_abs_path)(_value.ptr)
    }
  }

  fun isRelPath(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_is_rel_path)(_value.ptr)
    }
  }

  fun isSubsequenceOf(str: GDString): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_is_subsequence_of)(_value.ptr, str._value.ptr)
    }
  }

  fun isSubsequenceOf(str: String): Boolean {
    return isSubsequenceOf(new(str))
  }

  fun isSubsequenceOfI(str: GDString): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_is_subsequence_ofi)(_value.ptr, str._value.ptr)
    }
  }

  fun isSubsequenceOfI(str: String): Boolean {
    return isSubsequenceOfI(new(str))
  }

  fun isValidFloat(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_is_valid_float)(_value.ptr)
    }
  }

  fun isValidHexNumber(withPrefix: Boolean = false): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_is_valid_hex_number)(_value.ptr, withPrefix)
    }
  }

  fun isValidHtmlColor(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_is_valid_html_color)(_value.ptr)
    }
  }

  fun isValidIdentifier(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_is_valid_identifier)(_value.ptr)
    }
  }

  fun isValidInteger(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_is_valid_integer)(_value.ptr)
    }
  }

  fun isValidIpAddress(): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_is_valid_ip_address)(_value.ptr)
    }
  }

  fun jsonEscape(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_json_escape)(_value.ptr)
      )
    }
  }

  fun left(position: Int): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_left)(_value.ptr, position)
      )
    }
  }

  fun length(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_length)(_value.ptr)
    }
  }

  fun match(expr: GDString): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_match)(_value.ptr, expr._value.ptr)
    }
  }

  fun match(expr: String): Boolean {
    return match(new(expr))
  }

  fun matchN(expr: GDString): Boolean {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_matchn)(_value.ptr, expr._value.ptr)
    }
  }

  fun matchN(expr: String): Boolean {
    return matchN(new(expr))
  }

  fun md5Buffer(): PoolByteArray {
    return memScoped {
      PoolByteArray(
        checkNotNull(Godot.gdnative.godot_string_md5_buffer)(_value.ptr)
      )
    }
  }

  fun md5Text(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_md5_text)(_value.ptr)
      )
    }
  }

  fun noCaseCmpTo(str: GDString): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_nocasecmp_to)(_value.ptr, str._value.ptr).toInt()
    }
  }

  fun ordAt(position: Int): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_ord_at)(_value.ptr, position)
    }
  }

  fun padDecimals(digits: Int): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_pad_decimals)(_value.ptr, digits)
      )
    }
  }

  fun padZeros(digits: Int): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_pad_zeros)(_value.ptr, digits)
      )
    }
  }

  fun percentDecode(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_percent_decode)(_value.ptr)
      )
    }
  }

  fun percentEncode(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_percent_encode)(_value.ptr)
      )
    }
  }

  fun plusFile(file: GDString): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_plus_file)(_value.ptr, file._value.ptr)
      )
    }
  }

  fun plusFile(file: String): GDString {
    return plusFile(new(file))
  }

  fun replace(what: GDString, with: GDString): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_replace)(_value.ptr, what._value, with._value)
      )
    }
  }

  fun replace(what: String, with: String): GDString {
    return replace(new(what), new(with))
  }

  fun replaceN(what: GDString, with: GDString): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_replacen)(_value.ptr, what._value, with._value)
      )
    }
  }

  fun replaceN(what: String, with: String): GDString {
    return replaceN(new(what), new(with))
  }

  fun rFind(str: GDString, from: Int = -1): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_rfind_from)(_value.ptr, str._value, from)
    }
  }

  fun rFind(str: String, from: Int = -1): Int {
    return rFind(new(str), from)
  }

  fun right(position: Int): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_right)(_value.ptr, position)
      )
    }
  }

  fun rSplit(delimiter: GDString, allowEmpty: Boolean = true, maxSplit: Int = 0): PoolStringArray {
    return memScoped {
      PoolStringArray(
        checkNotNull(Godot.gdnative11.godot_string_rsplit)(_value.ptr, delimiter._value.ptr, allowEmpty, maxSplit)
      )
    }
  }

  fun rSplit(delimiter: String, allowEmpty: Boolean = true, maxSplit: Int = 0): PoolStringArray {
    return rSplit(new(delimiter), allowEmpty, maxSplit)
  }

  fun rStrip(str: GDString): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative11.godot_string_rstrip)(_value.ptr, str._value.ptr)
      )
    }
  }

  fun rStrip(str: String): GDString {
    return rStrip(new(str))
  }

  fun sha256Buffer(): PoolByteArray {
    return memScoped {
      PoolByteArray(
        checkNotNull(Godot.gdnative.godot_string_sha256_buffer)(_value.ptr)
      )
    }
  }

  fun sha256Text(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_sha256_text)(_value.ptr)
      )
    }
  }

  fun similarity(str: GDString): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_similarity)(_value.ptr, str._value.ptr)
    }
  }

  fun similarity(str: String): Float {
    return similarity(new(str))
  }

  // TODO: split, splitFloats (

  fun stripEdges(left: Boolean = true, right: Boolean = true): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_strip_edges)(_value.ptr, left, right)
      )
    }
  }

  fun subStr(from: Int, length: Int): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_substr)(_value.ptr, from, length)
      )
    }
  }

  fun toFloat(): Float {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_to_float)(_value.ptr)
    }
  }

  fun toInt(): Int {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_to_int)(_value.ptr)
    }
  }

  fun toUpper(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_to_upper)(_value.ptr)
      )
    }
  }

  fun toLower(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_to_lower)(_value.ptr)
      )
    }
  }

  fun trimPrefix(prefix: GDString): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative11.godot_string_trim_prefix)(_value.ptr, prefix._value.ptr)
      )
    }
  }

  fun trimPrefix(prefix: String): GDString {
    return trimPrefix(new(prefix))
  }

  fun trimSuffix(suffix: GDString): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative11.godot_string_trim_suffix)(_value.ptr, suffix._value.ptr)
      )
    }
  }

  fun trimSuffix(suffix: String): GDString {
    return trimSuffix(new(suffix))
  }

  fun xmlEscape(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_xml_escape)(_value.ptr)
      )
    }
  }

  fun xmlUnEscape(): GDString {
    return memScoped {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_xml_unescape)(_value.ptr)
      )
    }
  }

  override fun equals(other: Any?): Boolean {
    if (other == null) {
      return false
    }

    val eq = checkNotNull(Godot.gdnative.godot_string_operator_equal)

    return memScoped {
      when(other) {
        is GDString -> eq(_value.ptr, other._value.ptr)
        is String -> eq(_value.ptr, new(other)._value.ptr)
        else -> false
      }
    }
  }

  operator fun get(position: Int): Char {
    return memScoped {
      checkNotNull(Godot.gdnative.godot_string_operator_index_const)(_value.ptr, position).toChar()
    }
  }

  override fun iterator(): Iterator<Char> {
    return object: Iterator<Char> {
      val length = length()
      var index = 0
      override fun hasNext(): Boolean {
        return index < length
      }

      override fun next(): Char {
        return get(index++)
      }
    }
  }

  override fun hashCode(): Int {
    return hash()
  }

  companion object {
    fun new(): GDString {
      val value = memScoped {
        val tmp = alloc<godot_string>()
        checkNotNull(Godot.gdnative.godot_string_new)(tmp.ptr)
        tmp.readValue()
      }
      return GDString(value)
    }

    fun new(str: String): GDString{
      val value = memScoped {
        val tmp = alloc<godot_string>()
        checkNotNull(Godot.gdnative.godot_string_parse_utf8)(tmp.ptr, str.cstr.ptr)
        tmp.readValue()
      }
      return GDString(value)
    }

    fun new(str: String, len: Int): GDString {
      val value = memScoped {
        val tmp = alloc<godot_string>()
        checkNotNull(Godot.gdnative.godot_string_parse_utf8_with_len)(tmp.ptr, str.cstr.ptr, len)
        tmp.readValue()
      }
      return GDString(value)
    }
  }
}
