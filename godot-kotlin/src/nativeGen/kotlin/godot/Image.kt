// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Dictionary
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class Image(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _get_data(): Dictionary {
    TODO()
  }

  open fun _set_data(data: Dictionary) {
    TODO()
  }

  fun blendRect(
    src: Image,
    srcRect: Rect2,
    dst: Vector2
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(src)
      _args.add(srcRect)
      _args.add(dst)
      __method_bind.blendRect.call(self._handle, _args, null)
    }
  }

  fun blendRectMask(
    src: Image,
    mask: Image,
    srcRect: Rect2,
    dst: Vector2
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(src)
      _args.add(mask)
      _args.add(srcRect)
      _args.add(dst)
      __method_bind.blendRectMask.call(self._handle, _args, null)
    }
  }

  fun blitRect(
    src: Image,
    srcRect: Rect2,
    dst: Vector2
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(src)
      _args.add(srcRect)
      _args.add(dst)
      __method_bind.blitRect.call(self._handle, _args, null)
    }
  }

  fun blitRectMask(
    src: Image,
    mask: Image,
    srcRect: Rect2,
    dst: Vector2
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(src)
      _args.add(mask)
      _args.add(srcRect)
      _args.add(dst)
      __method_bind.blitRectMask.call(self._handle, _args, null)
    }
  }

  fun bumpmapToNormalmap(bumpScale: Float = 1.0f) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.bumpmapToNormalmap.call(self._handle, listOf(bumpScale), null)
    }
  }

  fun clearMipmaps() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearMipmaps.call(self._handle, emptyList(), null)
    }
  }

  fun compress(
    mode: Int,
    source: Int,
    lossyQuality: Float
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(mode)
      _args.add(source)
      _args.add(lossyQuality)
      __method_bind.compress.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun convert(format: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.convert.call(self._handle, listOf(format), null)
    }
  }

  fun copyFrom(src: Image) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.copyFrom.call(self._handle, listOf(src), null)
    }
  }

  fun create(
    width: Int,
    height: Int,
    useMipmaps: Boolean,
    format: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(width)
      _args.add(height)
      _args.add(useMipmaps)
      _args.add(format)
      __method_bind.create.call(self._handle, _args, null)
    }
  }

  fun createFromData(
    width: Int,
    height: Int,
    useMipmaps: Boolean,
    format: Int,
    data: PoolByteArray
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(width)
      _args.add(height)
      _args.add(useMipmaps)
      _args.add(format)
      _args.add(data)
      __method_bind.createFromData.call(self._handle, _args, null)
    }
  }

  fun crop(width: Int, height: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(width)
      _args.add(height)
      __method_bind.crop.call(self._handle, _args, null)
    }
  }

  fun decompress(): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.decompress.call(self._handle, emptyList(), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun detectAlpha(): AlphaMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.detectAlpha.call(self._handle, emptyList(), _retPtr)
      Image.AlphaMode.from(_ret.value)
    }
  }

  fun expandX2Hq2x() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.expandX2Hq2x.call(self._handle, emptyList(), null)
    }
  }

  fun fill(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.fill.call(self._handle, listOf(color), null)
    }
  }

  fun fixAlphaEdges() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.fixAlphaEdges.call(self._handle, emptyList(), null)
    }
  }

  fun flipX() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.flipX.call(self._handle, emptyList(), null)
    }
  }

  fun flipY() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.flipY.call(self._handle, emptyList(), null)
    }
  }

  fun generateMipmaps(renormalize: Boolean = false): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.generateMipmaps.call(self._handle, listOf(renormalize), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun getData(): PoolByteArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolByteArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getData.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFormat(): Format {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFormat.call(self._handle, emptyList(), _retPtr)
      Image.Format.from(_ret.value)
    }
  }

  fun getHeight(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMipmapOffset(mipmap: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMipmapOffset.call(self._handle, listOf(mipmap), _retPtr)
      _ret.value
    }
  }

  fun getPixel(x: Int, y: Int): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(x)
      _args.add(y)
      __method_bind.getPixel.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPixelv(src: Vector2): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getPixelv.call(self._handle, listOf(src), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRect(rect: Rect2): Image {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Image
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getRect.call(self._handle, listOf(rect), _retPtr)
      _ret = objectToType<Image>(_tmp.value!!)
      _ret
    }
  }

  fun getSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUsedRect(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getUsedRect.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getWidth(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getWidth.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun hasMipmaps(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasMipmaps.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isCompressed(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCompressed.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isEmpty(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEmpty.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isInvisible(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isInvisible.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun load(path: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.load.call(self._handle, listOf(path), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun loadJpgFromBuffer(buffer: PoolByteArray): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.loadJpgFromBuffer.call(self._handle, listOf(buffer), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun loadPngFromBuffer(buffer: PoolByteArray): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.loadPngFromBuffer.call(self._handle, listOf(buffer), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun loadWebpFromBuffer(buffer: PoolByteArray): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.loadWebpFromBuffer.call(self._handle, listOf(buffer), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun lock() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.lock.call(self._handle, emptyList(), null)
    }
  }

  fun normalmapToXy() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.normalmapToXy.call(self._handle, emptyList(), null)
    }
  }

  fun premultiplyAlpha() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.premultiplyAlpha.call(self._handle, emptyList(), null)
    }
  }

  fun resize(
    width: Int,
    height: Int,
    interpolation: Int = 1
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(width)
      _args.add(height)
      _args.add(interpolation)
      __method_bind.resize.call(self._handle, _args, null)
    }
  }

  fun resizeToPo2(square: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.resizeToPo2.call(self._handle, listOf(square), null)
    }
  }

  fun rgbeToSrgb(): Image {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Image
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.rgbeToSrgb.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Image>(_tmp.value!!)
      _ret
    }
  }

  fun saveExr(path: String, grayscale: Boolean = false): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(grayscale)
      __method_bind.saveExr.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun savePng(path: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.savePng.call(self._handle, listOf(path), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setPixel(
    x: Int,
    y: Int,
    color: Color
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(x)
      _args.add(y)
      _args.add(color)
      __method_bind.setPixel.call(self._handle, _args, null)
    }
  }

  fun setPixelv(dst: Vector2, color: Color) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(dst)
      _args.add(color)
      __method_bind.setPixelv.call(self._handle, _args, null)
    }
  }

  fun shrinkX2() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.shrinkX2.call(self._handle, emptyList(), null)
    }
  }

  fun srgbToLinear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.srgbToLinear.call(self._handle, emptyList(), null)
    }
  }

  fun unlock() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.unlock.call(self._handle, emptyList(), null)
    }
  }

  enum class AlphaMode(
    val value: Int
  ) {
    NONE(0),

    BIT(1),

    BLEND(2);

    companion object {
      fun from(value: Int): AlphaMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class CompressSource(
    val value: Int
  ) {
    GENERIC(0),

    SRGB(1),

    NORMAL(2);

    companion object {
      fun from(value: Int): CompressSource {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Interpolation(
    val value: Int
  ) {
    INTERPOLATE_NEAREST(0),

    INTERPOLATE_BILINEAR(1),

    INTERPOLATE_CUBIC(2),

    INTERPOLATE_TRILINEAR(3),

    INTERPOLATE_LANCZOS(4);

    companion object {
      fun from(value: Int): Interpolation {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class CompressMode(
    val value: Int
  ) {
    S3TC(0),

    PVRTC2(1),

    PVRTC4(2),

    ETC(3),

    ETC2(4);

    companion object {
      fun from(value: Int): CompressMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Format(
    val value: Int
  ) {
    L8(0),

    LA8(1),

    R8(2),

    RG8(3),

    RGB8(4),

    RGBA8(5),

    RGBA4444(6),

    RGBA5551(7),

    RF(8),

    RGF(9),

    RGBF(10),

    RGBAF(11),

    RH(12),

    RGH(13),

    RGBH(14),

    RGBAH(15),

    RGBE9995(16),

    DXT1(17),

    DXT3(18),

    DXT5(19),

    RGTC_R(20),

    RGTC_RG(21),

    BPTC_RGBA(22),

    BPTC_RGBF(23),

    BPTC_RGBFU(24),

    PVRTC2(25),

    PVRTC2A(26),

    PVRTC4(27),

    PVRTC4A(28),

    ETC(29),

    ETC2_R11(30),

    ETC2_R11S(31),

    ETC2_RG11(32),

    ETC2_RG11S(33),

    ETC2_RGB8(34),

    ETC2_RGBA8(35),

    ETC2_RGB8A1(36),

    MAX(37);

    companion object {
      fun from(value: Int): Format {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val MAX_HEIGHT: Int = 16384

    val MAX_WIDTH: Int = 16384

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Image".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Image" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Image
     */
    private object __method_bind {
      val blendRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "blend_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend_rect" }
            }
          }

      val blendRectMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "blend_rect_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blend_rect_mask" }
            }
          }

      val blitRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "blit_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blit_rect" }
            }
          }

      val blitRectMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "blit_rect_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method blit_rect_mask" }
            }
          }

      val bumpmapToNormalmap: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "bumpmap_to_normalmap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method bumpmap_to_normalmap" }
            }
          }

      val clearMipmaps: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "clear_mipmaps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_mipmaps" }
            }
          }

      val compress: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "compress".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method compress" }
            }
          }

      val convert: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "convert".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method convert" }
            }
          }

      val copyFrom: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "copy_from".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method copy_from" }
            }
          }

      val create: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create" }
            }
          }

      val createFromData: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "create_from_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_from_data" }
            }
          }

      val crop: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "crop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method crop" }
            }
          }

      val decompress: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "decompress".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method decompress" }
            }
          }

      val detectAlpha: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "detect_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method detect_alpha" }
            }
          }

      val expandX2Hq2x: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "expand_x2_hq2x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method expand_x2_hq2x" }
            }
          }

      val fill: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "fill".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method fill" }
            }
          }

      val fixAlphaEdges: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "fix_alpha_edges".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method fix_alpha_edges" }
            }
          }

      val flipX: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "flip_x".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method flip_x" }
            }
          }

      val flipY: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "flip_y".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method flip_y" }
            }
          }

      val generateMipmaps: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "generate_mipmaps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method generate_mipmaps" }
            }
          }

      val getData: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_data" }
            }
          }

      val getFormat: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_format" }
            }
          }

      val getHeight: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val getMipmapOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_mipmap_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mipmap_offset" }
            }
          }

      val getPixel: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_pixel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pixel" }
            }
          }

      val getPixelv: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_pixelv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pixelv" }
            }
          }

      val getRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rect" }
            }
          }

      val getSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val getUsedRect: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_used_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_used_rect" }
            }
          }

      val getWidth: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "get_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_width" }
            }
          }

      val hasMipmaps: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "has_mipmaps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_mipmaps" }
            }
          }

      val isCompressed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "is_compressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_compressed" }
            }
          }

      val isEmpty: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "is_empty".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_empty" }
            }
          }

      val isInvisible: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "is_invisible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_invisible" }
            }
          }

      val load: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "load".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load" }
            }
          }

      val loadJpgFromBuffer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "load_jpg_from_buffer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load_jpg_from_buffer" }
            }
          }

      val loadPngFromBuffer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "load_png_from_buffer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load_png_from_buffer" }
            }
          }

      val loadWebpFromBuffer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "load_webp_from_buffer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load_webp_from_buffer" }
            }
          }

      val lock: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "lock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method lock" }
            }
          }

      val normalmapToXy: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "normalmap_to_xy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method normalmap_to_xy" }
            }
          }

      val premultiplyAlpha: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "premultiply_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method premultiply_alpha" }
            }
          }

      val resize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "resize".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resize" }
            }
          }

      val resizeToPo2: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "resize_to_po2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resize_to_po2" }
            }
          }

      val rgbeToSrgb: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "rgbe_to_srgb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rgbe_to_srgb" }
            }
          }

      val saveExr: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "save_exr".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save_exr" }
            }
          }

      val savePng: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "save_png".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save_png" }
            }
          }

      val setPixel: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "set_pixel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pixel" }
            }
          }

      val setPixelv: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "set_pixelv".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pixelv" }
            }
          }

      val shrinkX2: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "shrink_x2".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method shrink_x2" }
            }
          }

      val srgbToLinear: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "srgb_to_linear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method srgb_to_linear" }
            }
          }

      val unlock: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Image".cstr.ptr,
              "unlock".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unlock" }
            }
          }
    }
  }
}
