// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolColorArray
import godot.core.PoolVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CanvasItem(
  _handle: COpaquePointer
) : Node(_handle) {
  var lightMask: Int
    get() {
       return getLightMask() 
    }
    set(value) {
      setLightMask(value)
    }

  var material: `ShaderMaterial,CanvasItemMaterial`
    get() {
       return getMaterial() 
    }
    set(value) {
      setMaterial(value)
    }

  var modulate: Color
    get() {
       return getModulate() 
    }
    set(value) {
      setModulate(value)
    }

  var selfModulate: Color
    get() {
       return getSelfModulate() 
    }
    set(value) {
      setSelfModulate(value)
    }

  var showBehindParent: Boolean
    get() {
       return isDrawBehindParentEnabled() 
    }
    set(value) {
      setDrawBehindParent(value)
    }

  var showOnTop: Boolean
    get() {
       return _isOnTop() 
    }
    set(value) {
      _setOnTop(value)
    }

  var useParentMaterial: Boolean
    get() {
       return getUseParentMaterial() 
    }
    set(value) {
      setUseParentMaterial(value)
    }

  var visible: Boolean
    get() {
       return isVisible() 
    }
    set(value) {
      setVisible(value)
    }

  fun drawChar(
    font: Font,
    position: Vector2,
    char: String,
    next: String,
    modulate: Color
  ): Float {
    val _args = VariantArray.new()
    _args.append(font)
    _args.append(position)
    _args.append(char)
    _args.append(next)
    _args.append(modulate)
    val _ret = __method_bind.drawChar.call(this._handle, _args.toVariant(), 5)
    return _ret.asFloat()
  }

  fun drawCircle(
    position: Vector2,
    radius: Float,
    color: Color
  ) {
    val _args = VariantArray.new()
    _args.append(position)
    _args.append(radius)
    _args.append(color)
    __method_bind.drawCircle.call(this._handle, _args.toVariant(), 3)
  }

  fun drawColoredPolygon(
    points: PoolVector2Array,
    color: Color,
    uvs: PoolVector2Array,
    texture: Texture,
    normalMap: Texture,
    antialiased: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(points)
    _args.append(color)
    _args.append(uvs)
    _args.append(texture)
    _args.append(normalMap)
    _args.append(antialiased)
    __method_bind.drawColoredPolygon.call(this._handle, _args.toVariant(), 6)
  }

  fun drawLine(
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Float,
    antialiased: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(to)
    _args.append(color)
    _args.append(width)
    _args.append(antialiased)
    __method_bind.drawLine.call(this._handle, _args.toVariant(), 5)
  }

  fun drawMesh(
    mesh: Mesh,
    texture: Texture,
    normalMap: Texture,
    transform: Transform2D,
    modulate: Color
  ) {
    val _args = VariantArray.new()
    _args.append(mesh)
    _args.append(texture)
    _args.append(normalMap)
    _args.append(transform)
    _args.append(modulate)
    __method_bind.drawMesh.call(this._handle, _args.toVariant(), 5)
  }

  fun drawMultiline(
    points: PoolVector2Array,
    color: Color,
    width: Float,
    antialiased: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(points)
    _args.append(color)
    _args.append(width)
    _args.append(antialiased)
    __method_bind.drawMultiline.call(this._handle, _args.toVariant(), 4)
  }

  fun drawMultilineColors(
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Float,
    antialiased: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(points)
    _args.append(colors)
    _args.append(width)
    _args.append(antialiased)
    __method_bind.drawMultilineColors.call(this._handle, _args.toVariant(), 4)
  }

  fun drawMultimesh(
    multimesh: MultiMesh,
    texture: Texture,
    normalMap: Texture
  ) {
    val _args = VariantArray.new()
    _args.append(multimesh)
    _args.append(texture)
    _args.append(normalMap)
    __method_bind.drawMultimesh.call(this._handle, _args.toVariant(), 3)
  }

  fun drawPolygon(
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: Texture,
    normalMap: Texture,
    antialiased: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(points)
    _args.append(colors)
    _args.append(uvs)
    _args.append(texture)
    _args.append(normalMap)
    _args.append(antialiased)
    __method_bind.drawPolygon.call(this._handle, _args.toVariant(), 6)
  }

  fun drawPolyline(
    points: PoolVector2Array,
    color: Color,
    width: Float,
    antialiased: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(points)
    _args.append(color)
    _args.append(width)
    _args.append(antialiased)
    __method_bind.drawPolyline.call(this._handle, _args.toVariant(), 4)
  }

  fun drawPolylineColors(
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Float,
    antialiased: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(points)
    _args.append(colors)
    _args.append(width)
    _args.append(antialiased)
    __method_bind.drawPolylineColors.call(this._handle, _args.toVariant(), 4)
  }

  fun drawPrimitive(
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: Texture,
    width: Float,
    normalMap: Texture
  ) {
    val _args = VariantArray.new()
    _args.append(points)
    _args.append(colors)
    _args.append(uvs)
    _args.append(texture)
    _args.append(width)
    _args.append(normalMap)
    __method_bind.drawPrimitive.call(this._handle, _args.toVariant(), 6)
  }

  fun drawRect(
    rect: Rect2,
    color: Color,
    filled: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(rect)
    _args.append(color)
    _args.append(filled)
    __method_bind.drawRect.call(this._handle, _args.toVariant(), 3)
  }

  fun drawSetTransform(
    position: Vector2,
    rotation: Float,
    scale: Vector2
  ) {
    val _args = VariantArray.new()
    _args.append(position)
    _args.append(rotation)
    _args.append(scale)
    __method_bind.drawSetTransform.call(this._handle, _args.toVariant(), 3)
  }

  fun drawSetTransformMatrix(xform: Transform2D) {
    val _arg = Variant.new(xform)
    __method_bind.drawSetTransformMatrix.call(this._handle, _arg, 1)
  }

  fun drawString(
    font: Font,
    position: Vector2,
    text: String,
    modulate: Color,
    clipW: Int
  ) {
    val _args = VariantArray.new()
    _args.append(font)
    _args.append(position)
    _args.append(text)
    _args.append(modulate)
    _args.append(clipW)
    __method_bind.drawString.call(this._handle, _args.toVariant(), 5)
  }

  fun drawStyleBox(styleBox: StyleBox, rect: Rect2) {
    val _args = VariantArray.new()
    _args.append(styleBox)
    _args.append(rect)
    __method_bind.drawStyleBox.call(this._handle, _args.toVariant(), 2)
  }

  fun drawTexture(
    texture: Texture,
    position: Vector2,
    modulate: Color,
    normalMap: Texture
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(position)
    _args.append(modulate)
    _args.append(normalMap)
    __method_bind.drawTexture.call(this._handle, _args.toVariant(), 4)
  }

  fun drawTextureRect(
    texture: Texture,
    rect: Rect2,
    tile: Boolean,
    modulate: Color,
    transpose: Boolean,
    normalMap: Texture
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(rect)
    _args.append(tile)
    _args.append(modulate)
    _args.append(transpose)
    _args.append(normalMap)
    __method_bind.drawTextureRect.call(this._handle, _args.toVariant(), 6)
  }

  fun drawTextureRectRegion(
    texture: Texture,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color,
    transpose: Boolean,
    normalMap: Texture,
    clipUv: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(texture)
    _args.append(rect)
    _args.append(srcRect)
    _args.append(modulate)
    _args.append(transpose)
    _args.append(normalMap)
    _args.append(clipUv)
    __method_bind.drawTextureRectRegion.call(this._handle, _args.toVariant(), 7)
  }

  fun forceUpdateTransform() {
    __method_bind.forceUpdateTransform.call(this._handle)
  }

  fun getCanvas(): RID {
    val _ret = __method_bind.getCanvas.call(this._handle)
    return _ret.asRID()
  }

  fun getCanvasItem(): RID {
    val _ret = __method_bind.getCanvasItem.call(this._handle)
    return _ret.asRID()
  }

  fun getCanvasTransform(): Transform2D {
    val _ret = __method_bind.getCanvasTransform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getGlobalMousePosition(): Vector2 {
    val _ret = __method_bind.getGlobalMousePosition.call(this._handle)
    return _ret.asVector2()
  }

  fun getGlobalTransform(): Transform2D {
    val _ret = __method_bind.getGlobalTransform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getGlobalTransformWithCanvas(): Transform2D {
    val _ret = __method_bind.getGlobalTransformWithCanvas.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getLightMask(): Int {
    val _ret = __method_bind.getLightMask.call(this._handle)
    return _ret.asInt()
  }

  fun getLocalMousePosition(): Vector2 {
    val _ret = __method_bind.getLocalMousePosition.call(this._handle)
    return _ret.asVector2()
  }

  fun getMaterial(): Material {
    val _ret = __method_bind.getMaterial.call(this._handle)
    return _ret.asObject(::Material)!!
  }

  fun getModulate(): Color {
    val _ret = __method_bind.getModulate.call(this._handle)
    return _ret.asColor()
  }

  fun getSelfModulate(): Color {
    val _ret = __method_bind.getSelfModulate.call(this._handle)
    return _ret.asColor()
  }

  fun getTransform(): Transform2D {
    val _ret = __method_bind.getTransform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getUseParentMaterial(): Boolean {
    val _ret = __method_bind.getUseParentMaterial.call(this._handle)
    return _ret.asBoolean()
  }

  fun getViewportRect(): Rect2 {
    val _ret = __method_bind.getViewportRect.call(this._handle)
    return _ret.asRect2()
  }

  fun getViewportTransform(): Transform2D {
    val _ret = __method_bind.getViewportTransform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getWorld2d(): World2D {
    val _ret = __method_bind.getWorld2d.call(this._handle)
    return _ret.asObject(::World2D)!!
  }

  fun hide() {
    __method_bind.hide.call(this._handle)
  }

  fun isDrawBehindParentEnabled(): Boolean {
    val _ret = __method_bind.isDrawBehindParentEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isLocalTransformNotificationEnabled(): Boolean {
    val _ret = __method_bind.isLocalTransformNotificationEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isSetAsToplevel(): Boolean {
    val _ret = __method_bind.isSetAsToplevel.call(this._handle)
    return _ret.asBoolean()
  }

  fun isTransformNotificationEnabled(): Boolean {
    val _ret = __method_bind.isTransformNotificationEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isVisible(): Boolean {
    val _ret = __method_bind.isVisible.call(this._handle)
    return _ret.asBoolean()
  }

  fun isVisibleInTree(): Boolean {
    val _ret = __method_bind.isVisibleInTree.call(this._handle)
    return _ret.asBoolean()
  }

  fun makeCanvasPositionLocal(screenPoint: Vector2): Vector2 {
    val _arg = Variant.new(screenPoint)
    val _ret = __method_bind.makeCanvasPositionLocal.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun makeInputLocal(event: InputEvent): InputEvent {
    val _arg = Variant.new(event)
    val _ret = __method_bind.makeInputLocal.call(this._handle, _arg, 1)
    return _ret.asObject(::InputEvent)!!
  }

  fun setAsToplevel(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAsToplevel.call(this._handle, _arg, 1)
  }

  fun setDrawBehindParent(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setDrawBehindParent.call(this._handle, _arg, 1)
  }

  fun setLightMask(lightMask: Int) {
    val _arg = Variant.new(lightMask)
    __method_bind.setLightMask.call(this._handle, _arg, 1)
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.setMaterial.call(this._handle, _arg, 1)
  }

  fun setModulate(modulate: Color) {
    val _arg = Variant.new(modulate)
    __method_bind.setModulate.call(this._handle, _arg, 1)
  }

  fun setNotifyLocalTransform(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setNotifyLocalTransform.call(this._handle, _arg, 1)
  }

  fun setNotifyTransform(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setNotifyTransform.call(this._handle, _arg, 1)
  }

  fun setSelfModulate(selfModulate: Color) {
    val _arg = Variant.new(selfModulate)
    __method_bind.setSelfModulate.call(this._handle, _arg, 1)
  }

  fun setUseParentMaterial(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseParentMaterial.call(this._handle, _arg, 1)
  }

  fun setVisible(visible: Boolean) {
    val _arg = Variant.new(visible)
    __method_bind.setVisible.call(this._handle, _arg, 1)
  }

  fun show() {
    __method_bind.show.call(this._handle)
  }

  fun update() {
    __method_bind.update.call(this._handle)
  }

  enum class BlendMode(
    val value: Int
  ) {
    BLEND_MODE_MIX(0),

    BLEND_MODE_ADD(1),

    BLEND_MODE_SUB(2),

    BLEND_MODE_MUL(3),

    BLEND_MODE_PREMULT_ALPHA(4),

    BLEND_MODE_DISABLED(5);

    companion object {
      fun from(value: Int): BlendMode {
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
    val BLEND_MODE_ADD: Int = 1

    val BLEND_MODE_DISABLED: Int = 5

    val BLEND_MODE_MIX: Int = 0

    val BLEND_MODE_MUL: Int = 3

    val BLEND_MODE_PREMULT_ALPHA: Int = 4

    val BLEND_MODE_SUB: Int = 2

    val NOTIFICATION_DRAW: Int = 30

    val NOTIFICATION_ENTER_CANVAS: Int = 32

    val NOTIFICATION_EXIT_CANVAS: Int = 33

    val NOTIFICATION_TRANSFORM_CHANGED: Int = 2000

    val NOTIFICATION_VISIBILITY_CHANGED: Int = 31

    /**
     * Container for method_bind pointers for CanvasItem
     */
    private object __method_bind {
      val drawChar: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawChar".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawChar" }
        }
      val drawCircle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawCircle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawCircle" }
        }
      val drawColoredPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawColoredPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawColoredPolygon" }
        }
      val drawLine: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawLine".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawLine" }
        }
      val drawMesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawMesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawMesh" }
        }
      val drawMultiline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawMultiline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawMultiline" }
        }
      val drawMultilineColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawMultilineColors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawMultilineColors" }
        }
      val drawMultimesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawMultimesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawMultimesh" }
        }
      val drawPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawPolygon" }
        }
      val drawPolyline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawPolyline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawPolyline" }
        }
      val drawPolylineColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawPolylineColors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawPolylineColors" }
        }
      val drawPrimitive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawPrimitive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawPrimitive" }
        }
      val drawRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawRect" }
        }
      val drawSetTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawSetTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawSetTransform" }
        }
      val drawSetTransformMatrix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawSetTransformMatrix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawSetTransformMatrix" }
        }
      val drawString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawString".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawString" }
        }
      val drawStyleBox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawStyleBox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawStyleBox" }
        }
      val drawTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawTexture" }
        }
      val drawTextureRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawTextureRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawTextureRect" }
        }
      val drawTextureRectRegion: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "drawTextureRectRegion".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method drawTextureRectRegion" }
        }
      val forceUpdateTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "forceUpdateTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method forceUpdateTransform" }
        }
      val getCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getCanvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCanvas" }
        }
      val getCanvasItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getCanvasItem".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCanvasItem" }
        }
      val getCanvasTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getCanvasTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCanvasTransform" }
        }
      val getGlobalMousePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getGlobalMousePosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlobalMousePosition" }
        }
      val getGlobalTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getGlobalTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlobalTransform" }
        }
      val getGlobalTransformWithCanvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getGlobalTransformWithCanvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGlobalTransformWithCanvas" }
        }
      val getLightMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getLightMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLightMask" }
        }
      val getLocalMousePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getLocalMousePosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLocalMousePosition" }
        }
      val getMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaterial" }
        }
      val getModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getModulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getModulate" }
        }
      val getSelfModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getSelfModulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSelfModulate" }
        }
      val getTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTransform" }
        }
      val getUseParentMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getUseParentMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUseParentMaterial" }
        }
      val getViewportRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getViewportRect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getViewportRect" }
        }
      val getViewportTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getViewportTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getViewportTransform" }
        }
      val getWorld2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "getWorld2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWorld2d" }
        }
      val hide: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "hide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hide" }
        }
      val isDrawBehindParentEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "isDrawBehindParentEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDrawBehindParentEnabled" }
        }
      val isLocalTransformNotificationEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "isLocalTransformNotificationEnabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method isLocalTransformNotificationEnabled" }
        }
      val isSetAsToplevel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "isSetAsToplevel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isSetAsToplevel" }
        }
      val isTransformNotificationEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "isTransformNotificationEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isTransformNotificationEnabled" }
        }
      val isVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "isVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isVisible" }
        }
      val isVisibleInTree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "isVisibleInTree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isVisibleInTree" }
        }
      val makeCanvasPositionLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "makeCanvasPositionLocal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method makeCanvasPositionLocal" }
        }
      val makeInputLocal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "makeInputLocal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method makeInputLocal" }
        }
      val setAsToplevel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "setAsToplevel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAsToplevel" }
        }
      val setDrawBehindParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "setDrawBehindParent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDrawBehindParent" }
        }
      val setLightMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "setLightMask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLightMask" }
        }
      val setMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "setMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaterial" }
        }
      val setModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "setModulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setModulate" }
        }
      val setNotifyLocalTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "setNotifyLocalTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNotifyLocalTransform" }
        }
      val setNotifyTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "setNotifyTransform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNotifyTransform" }
        }
      val setSelfModulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "setSelfModulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSelfModulate" }
        }
      val setUseParentMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "setUseParentMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseParentMaterial" }
        }
      val setVisible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "setVisible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVisible" }
        }
      val show: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "show".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method show" }
        }
      val update: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "update".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update" }
        }}
  }
}
