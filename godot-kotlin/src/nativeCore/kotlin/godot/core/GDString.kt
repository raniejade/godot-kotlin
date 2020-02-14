package godot.core

import gdnative.godot_string
import kotlinx.cinterop.*

internal class GDString(
  value: CValue<godot_string>
): CoreType<godot_string>(value), Iterable<Char> {
  constructor(): this(__new())
  constructor(str: String): this(__new(str))

  fun beginsWith(str: GDString): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_begins_with)(_value.ptr, str._value.ptr)
    }
  }

  fun destroy() {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_destroy)(_value.ptr)
    }
  }

  fun beginsWith(str: String): Boolean {
    return beginsWith(GDString(str))
  }

  fun bigrams(): PoolStringArray {
    return Allocator.allocationScope {
      PoolStringArray(
        VariantArray(checkNotNull(Godot.gdnative.godot_string_bigrams)(_value.ptr))
      )
    }
  }

  fun cEscape(): GDString {
    return Allocator.allocationScope {
      GDString(checkNotNull(Godot.gdnative.godot_string_c_escape)(_value.ptr))
    }
  }

  fun cUnEscape(): GDString {
    return Allocator.allocationScope {
      GDString(checkNotNull(Godot.gdnative.godot_string_c_unescape)(_value.ptr))
    }
  }

  fun capitalize(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_capitalize)(_value.ptr)
      )
    }
  }

  fun caseCmpTo(to: GDString): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_casecmp_to)(_value.ptr, to._value.ptr).toInt()
    }
  }

  fun caseCmpTo(to: String): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_casecmp_to)(_value.ptr, GDString(to)._value.ptr).toInt()
    }
  }

  fun dedent(): GDString {
    return Allocator.allocationScope {
      GDString(checkNotNull(Godot.gdnative11.godot_string_dedent)(_value.ptr))
    }
  }

  fun isEmpty(): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_empty)(_value.ptr)
    }
  }

  fun endsWith(str: GDString): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_ends_with)(_value.ptr, str._value.ptr)
    }
  }

  fun endsWith(str: String): Boolean {
    return endsWith(GDString(str))
  }

  fun erase(position: Int, count: Int) {
    _value = Allocator.allocationScope {
      val ptr = _value.ptr
      checkNotNull(Godot.gdnative.godot_string_erase)(ptr, position, count)
      ptr.pointed.readValue()
    }
  }

  fun find(str: GDString, from: Int = 0): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_find_from)(_value.ptr, str._value, from)
    }
  }

  fun find(str: String, from: Int = 0): Int {
    return find(GDString(str), from)
  }

  fun findLast(str: GDString): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_find_last)(_value.ptr, str._value)
    }
  }

  fun findLast(str: String): Int {
    return findLast(GDString(str))
  }

  fun findN(str: GDString, from: Int = 0): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_findn_from)(_value.ptr, str._value, from)
    }
  }

  fun findN(str: String, from: Int = 0): Int {
    return findN(GDString(str), from)
  }

  fun format(values: Variant): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_format)(_value.ptr, values._value.ptr)
      )
    }
  }

  fun format(values: Variant, placeholder: String): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_format_with_custom_placeholder)(_value.ptr, values._value.ptr, placeholder.cstr.ptr)
      )
    }
  }

  fun getBaseDir(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_get_base_dir)(_value.ptr)
      )
    }
  }

  fun getBaseName(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_get_basename)(_value.ptr)
      )
    }
  }

  fun getExtension(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_get_extension)(_value.ptr)
      )
    }
  }

  fun getFile(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_get_file)(_value.ptr)
      )
    }
  }

  // TODO: pass UINT?
  fun hash(): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_hash)(_value.ptr).toInt()
    }
  }

  fun hexToInt(): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_hex_to_int)(_value.ptr)
    }
  }

  fun insert(position: Int, str: GDString): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_insert)(_value.ptr, position, str._value)
      )
    }
  }

  fun insert(position: Int, str: String): GDString {
    return insert(position, GDString(str))
  }

  fun isAbsPath(): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_is_abs_path)(_value.ptr)
    }
  }

  fun isRelPath(): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_is_rel_path)(_value.ptr)
    }
  }

  fun isSubsequenceOf(str: GDString): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_is_subsequence_of)(_value.ptr, str._value.ptr)
    }
  }

  fun isSubsequenceOf(str: String): Boolean {
    return isSubsequenceOf(GDString(str))
  }

  fun isSubsequenceOfI(str: GDString): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_is_subsequence_ofi)(_value.ptr, str._value.ptr)
    }
  }

  fun isSubsequenceOfI(str: String): Boolean {
    return isSubsequenceOfI(GDString(str))
  }

  fun isValidFloat(): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_is_valid_float)(_value.ptr)
    }
  }

  fun isValidHexNumber(withPrefix: Boolean = false): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_is_valid_hex_number)(_value.ptr, withPrefix)
    }
  }

  fun isValidHtmlColor(): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_is_valid_html_color)(_value.ptr)
    }
  }

  fun isValidIdentifier(): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_is_valid_identifier)(_value.ptr)
    }
  }

  fun isValidInteger(): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_is_valid_integer)(_value.ptr)
    }
  }

  fun isValidIpAddress(): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_is_valid_ip_address)(_value.ptr)
    }
  }

  fun jsonEscape(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_json_escape)(_value.ptr)
      )
    }
  }

  fun left(position: Int): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_left)(_value.ptr, position)
      )
    }
  }

  fun length(): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_length)(_value.ptr)
    }
  }

  fun match(expr: GDString): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_match)(_value.ptr, expr._value.ptr)
    }
  }

  fun match(expr: String): Boolean {
    return match(GDString(expr))
  }

  fun matchN(expr: GDString): Boolean {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_matchn)(_value.ptr, expr._value.ptr)
    }
  }

  fun matchN(expr: String): Boolean {
    return matchN(GDString(expr))
  }

  fun md5Buffer(): PoolByteArray {
    return Allocator.allocationScope {
      PoolByteArray(
        checkNotNull(Godot.gdnative.godot_string_md5_buffer)(_value.ptr)
      )
    }
  }

  fun md5Text(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_md5_text)(_value.ptr)
      )
    }
  }

  fun noCaseCmpTo(str: GDString): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_nocasecmp_to)(_value.ptr, str._value.ptr).toInt()
    }
  }

  fun ordAt(position: Int): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_ord_at)(_value.ptr, position).toInt()
    }
  }

  fun padDecimals(digits: Int): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_pad_decimals)(_value.ptr, digits)
      )
    }
  }

  fun padZeros(digits: Int): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_pad_zeros)(_value.ptr, digits)
      )
    }
  }

  fun percentDecode(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_percent_decode)(_value.ptr)
      )
    }
  }

  fun percentEncode(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_percent_encode)(_value.ptr)
      )
    }
  }

  fun plusFile(file: GDString): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_plus_file)(_value.ptr, file._value.ptr)
      )
    }
  }

  fun plusFile(file: String): GDString {
    return plusFile(GDString(file))
  }

  fun replace(what: GDString, with: GDString): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_replace)(_value.ptr, what._value, with._value)
      )
    }
  }

  fun replace(what: String, with: String): GDString {
    return replace(GDString(what), GDString(with))
  }

  fun replaceN(what: GDString, with: GDString): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_replacen)(_value.ptr, what._value, with._value)
      )
    }
  }

  fun replaceN(what: String, with: String): GDString {
    return replaceN(GDString(what), GDString(with))
  }

  fun rFind(str: GDString, from: Int = -1): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_rfind_from)(_value.ptr, str._value, from)
    }
  }

  fun rFind(str: String, from: Int = -1): Int {
    return rFind(GDString(str), from)
  }

  fun right(position: Int): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_right)(_value.ptr, position)
      )
    }
  }

  fun rSplit(delimiter: GDString, allowEmpty: Boolean = true, maxSplit: Int = 0): PoolStringArray {
    return Allocator.allocationScope {
      PoolStringArray(
        checkNotNull(Godot.gdnative11.godot_string_rsplit)(_value.ptr, delimiter._value.ptr, allowEmpty, maxSplit)
      )
    }
  }

  fun rSplit(delimiter: String, allowEmpty: Boolean = true, maxSplit: Int = 0): PoolStringArray {
    return rSplit(GDString(delimiter), allowEmpty, maxSplit)
  }

  fun rStrip(str: GDString): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative11.godot_string_rstrip)(_value.ptr, str._value.ptr)
      )
    }
  }

  fun rStrip(str: String): GDString {
    return rStrip(GDString(str))
  }

  fun sha256Buffer(): PoolByteArray {
    return Allocator.allocationScope {
      PoolByteArray(
        checkNotNull(Godot.gdnative.godot_string_sha256_buffer)(_value.ptr)
      )
    }
  }

  fun sha256Text(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_sha256_text)(_value.ptr)
      )
    }
  }

  fun similarity(str: GDString): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_similarity)(_value.ptr, str._value.ptr)
    }
  }

  fun similarity(str: String): Float {
    return similarity(GDString(str))
  }

  // TODO: split, splitFloats (

  fun stripEdges(left: Boolean = true, right: Boolean = true): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_strip_edges)(_value.ptr, left, right)
      )
    }
  }

  fun subStr(from: Int, length: Int): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_substr)(_value.ptr, from, length)
      )
    }
  }

  fun toFloat(): Float {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_to_float)(_value.ptr)
    }
  }

  fun toInt(): Int {
    return Allocator.allocationScope {
      checkNotNull(Godot.gdnative.godot_string_to_int)(_value.ptr)
    }
  }

  fun toUpper(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_to_upper)(_value.ptr)
      )
    }
  }

  fun toLower(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_to_lower)(_value.ptr)
      )
    }
  }

  fun trimPrefix(prefix: GDString): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative11.godot_string_trim_prefix)(_value.ptr, prefix._value.ptr)
      )
    }
  }

  fun trimPrefix(prefix: String): GDString {
    return trimPrefix(GDString(prefix))
  }

  fun trimSuffix(suffix: GDString): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative11.godot_string_trim_suffix)(_value.ptr, suffix._value.ptr)
      )
    }
  }

  fun trimSuffix(suffix: String): GDString {
    return trimSuffix(GDString(suffix))
  }

  fun xmlEscape(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_xml_escape)(_value.ptr)
      )
    }
  }

  fun xmlUnEscape(): GDString {
    return Allocator.allocationScope {
      GDString(
        checkNotNull(Godot.gdnative.godot_string_xml_unescape)(_value.ptr)
      )
    }
  }

  override fun toVariant(): Variant {
    throw UnsupportedOperationException()
  }

  override fun toGDString(): GDString {
    return this
  }

  fun toKString(): String {
    return Allocator.allocationScope {
      val ptr = checkNotNull(Godot.gdnative.godot_string_wide_str)(_value.ptr)!!
      // drop the trailing \0
      // DO NOT CHANGE!
      ptr.reinterpret<IntVar>().toKStringFromUtf32().dropLast(1)
    }
  }

  override fun equals(other: Any?): Boolean {
    if (other == null) {
      return false
    }

    val eq = checkNotNull(Godot.gdnative.godot_string_operator_equal)

    return Allocator.allocationScope {
      when(other) {
        is GDString -> eq(_value.ptr, other._value.ptr)
        is String -> eq(_value.ptr, GDString(other)._value.ptr)
        else -> false
      }
    }
  }

  operator fun get(position: Int): Char {
    return Allocator.allocationScope {
      val ptr = checkNotNull(Godot.gdnative.godot_string_operator_index_const)(_value.ptr, position)
      ptr.toInt().toChar()
    }
  }

  override fun iterator(): Iterator<Char> {
    return IndexedIterator(length(), this::get)
  }

  override fun hashCode(): Int {
    return hash()
  }

  companion object {
    internal fun from(str: String, cb: (GDString) -> Unit) {
      val gdString = GDString(str)
      cb(gdString)
      gdString.destroy()
    }

    internal fun __new() = allocType2<godot_string> {
      checkNotNull(Godot.gdnative.godot_string_new)(it)
    }

    internal fun __new(str: String) = allocType2<godot_string> {
      checkNotNull(Godot.gdnative.godot_string_parse_utf8)(it, str.cstr.ptr)
    }
  }
}
