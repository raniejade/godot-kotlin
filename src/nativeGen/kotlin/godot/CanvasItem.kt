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

open class CanvasItem internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
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
    val _ret = __method_bind.draw_char.call(this._handle, _args.toVariant(), 5)
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
    __method_bind.draw_circle.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.draw_colored_polygon.call(this._handle, _args.toVariant(), 6)
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
    __method_bind.draw_line.call(this._handle, _args.toVariant(), 5)
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
    __method_bind.draw_mesh.call(this._handle, _args.toVariant(), 5)
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
    __method_bind.draw_multiline.call(this._handle, _args.toVariant(), 4)
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
    __method_bind.draw_multiline_colors.call(this._handle, _args.toVariant(), 4)
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
    __method_bind.draw_multimesh.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.draw_polygon.call(this._handle, _args.toVariant(), 6)
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
    __method_bind.draw_polyline.call(this._handle, _args.toVariant(), 4)
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
    __method_bind.draw_polyline_colors.call(this._handle, _args.toVariant(), 4)
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
    __method_bind.draw_primitive.call(this._handle, _args.toVariant(), 6)
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
    __method_bind.draw_rect.call(this._handle, _args.toVariant(), 3)
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
    __method_bind.draw_set_transform.call(this._handle, _args.toVariant(), 3)
  }

  fun drawSetTransformMatrix(xform: Transform2D) {
    val _arg = Variant.new(xform)
    __method_bind.draw_set_transform_matrix.call(this._handle, _arg, 1)
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
    __method_bind.draw_string.call(this._handle, _args.toVariant(), 5)
  }

  fun drawStyleBox(styleBox: StyleBox, rect: Rect2) {
    val _args = VariantArray.new()
    _args.append(styleBox)
    _args.append(rect)
    __method_bind.draw_style_box.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.draw_texture.call(this._handle, _args.toVariant(), 4)
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
    __method_bind.draw_texture_rect.call(this._handle, _args.toVariant(), 6)
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
    __method_bind.draw_texture_rect_region.call(this._handle, _args.toVariant(), 7)
  }

  fun forceUpdateTransform() {
    __method_bind.force_update_transform.call(this._handle)
  }

  fun getCanvas(): RID {
    val _ret = __method_bind.get_canvas.call(this._handle)
    return _ret.asRID()
  }

  fun getCanvasItem(): RID {
    val _ret = __method_bind.get_canvas_item.call(this._handle)
    return _ret.asRID()
  }

  fun getCanvasTransform(): Transform2D {
    val _ret = __method_bind.get_canvas_transform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getGlobalMousePosition(): Vector2 {
    val _ret = __method_bind.get_global_mouse_position.call(this._handle)
    return _ret.asVector2()
  }

  fun getGlobalTransform(): Transform2D {
    val _ret = __method_bind.get_global_transform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getGlobalTransformWithCanvas(): Transform2D {
    val _ret = __method_bind.get_global_transform_with_canvas.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getLightMask(): Int {
    val _ret = __method_bind.get_light_mask.call(this._handle)
    return _ret.asInt()
  }

  fun getLocalMousePosition(): Vector2 {
    val _ret = __method_bind.get_local_mouse_position.call(this._handle)
    return _ret.asVector2()
  }

  fun getMaterial(): Material {
    val _ret = __method_bind.get_material.call(this._handle)
    return _ret.asObject(::Material)!!
  }

  fun getModulate(): Color {
    val _ret = __method_bind.get_modulate.call(this._handle)
    return _ret.asColor()
  }

  fun getSelfModulate(): Color {
    val _ret = __method_bind.get_self_modulate.call(this._handle)
    return _ret.asColor()
  }

  fun getTransform(): Transform2D {
    val _ret = __method_bind.get_transform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getUseParentMaterial(): Boolean {
    val _ret = __method_bind.get_use_parent_material.call(this._handle)
    return _ret.asBool()
  }

  fun getViewportRect(): Rect2 {
    val _ret = __method_bind.get_viewport_rect.call(this._handle)
    return _ret.asRect2()
  }

  fun getViewportTransform(): Transform2D {
    val _ret = __method_bind.get_viewport_transform.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getWorld2d(): World2D {
    val _ret = __method_bind.get_world_2d.call(this._handle)
    return _ret.asObject(::World2D)!!
  }

  fun hide() {
    __method_bind.hide.call(this._handle)
  }

  fun isDrawBehindParentEnabled(): Boolean {
    val _ret = __method_bind.is_draw_behind_parent_enabled.call(this._handle)
    return _ret.asBool()
  }

  fun isLocalTransformNotificationEnabled(): Boolean {
    val _ret = __method_bind.is_local_transform_notification_enabled.call(this._handle)
    return _ret.asBool()
  }

  fun isSetAsToplevel(): Boolean {
    val _ret = __method_bind.is_set_as_toplevel.call(this._handle)
    return _ret.asBool()
  }

  fun isTransformNotificationEnabled(): Boolean {
    val _ret = __method_bind.is_transform_notification_enabled.call(this._handle)
    return _ret.asBool()
  }

  fun isVisible(): Boolean {
    val _ret = __method_bind.is_visible.call(this._handle)
    return _ret.asBool()
  }

  fun isVisibleInTree(): Boolean {
    val _ret = __method_bind.is_visible_in_tree.call(this._handle)
    return _ret.asBool()
  }

  fun makeCanvasPositionLocal(screenPoint: Vector2): Vector2 {
    val _arg = Variant.new(screenPoint)
    val _ret = __method_bind.make_canvas_position_local.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun makeInputLocal(event: InputEvent): InputEvent {
    val _arg = Variant.new(event)
    val _ret = __method_bind.make_input_local.call(this._handle, _arg, 1)
    return _ret.asObject(::InputEvent)!!
  }

  fun setAsToplevel(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_as_toplevel.call(this._handle, _arg, 1)
  }

  fun setDrawBehindParent(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_draw_behind_parent.call(this._handle, _arg, 1)
  }

  fun setLightMask(lightMask: Int) {
    val _arg = Variant.new(lightMask)
    __method_bind.set_light_mask.call(this._handle, _arg, 1)
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.set_material.call(this._handle, _arg, 1)
  }

  fun setModulate(modulate: Color) {
    val _arg = Variant.new(modulate)
    __method_bind.set_modulate.call(this._handle, _arg, 1)
  }

  fun setNotifyLocalTransform(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_notify_local_transform.call(this._handle, _arg, 1)
  }

  fun setNotifyTransform(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_notify_transform.call(this._handle, _arg, 1)
  }

  fun setSelfModulate(selfModulate: Color) {
    val _arg = Variant.new(selfModulate)
    __method_bind.set_self_modulate.call(this._handle, _arg, 1)
  }

  fun setUseParentMaterial(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_use_parent_material.call(this._handle, _arg, 1)
  }

  fun setVisible(visible: Boolean) {
    val _arg = Variant.new(visible)
    __method_bind.set_visible.call(this._handle, _arg, 1)
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
      val draw_char: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_char".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_char" }
        }
      val draw_circle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_circle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_circle" }
        }
      val draw_colored_polygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_colored_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_colored_polygon" }
        }
      val draw_line: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_line".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_line" }
        }
      val draw_mesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_mesh" }
        }
      val draw_multiline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_multiline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_multiline" }
        }
      val draw_multiline_colors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_multiline_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_multiline_colors" }
        }
      val draw_multimesh: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_multimesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_multimesh" }
        }
      val draw_polygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_polygon" }
        }
      val draw_polyline: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_polyline".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_polyline" }
        }
      val draw_polyline_colors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_polyline_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_polyline_colors" }
        }
      val draw_primitive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_primitive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_primitive" }
        }
      val draw_rect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_rect" }
        }
      val draw_set_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_set_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_set_transform" }
        }
      val draw_set_transform_matrix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_set_transform_matrix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_set_transform_matrix" }
        }
      val draw_string: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_string" }
        }
      val draw_style_box: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_style_box".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_style_box" }
        }
      val draw_texture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_texture" }
        }
      val draw_texture_rect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_texture_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_texture_rect" }
        }
      val draw_texture_rect_region: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "draw_texture_rect_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_texture_rect_region" }
        }
      val force_update_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "force_update_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method force_update_transform" }
        }
      val get_canvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_canvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_canvas" }
        }
      val get_canvas_item: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_canvas_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_canvas_item" }
        }
      val get_canvas_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_canvas_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_canvas_transform" }
        }
      val get_global_mouse_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_global_mouse_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_mouse_position" }
        }
      val get_global_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_global_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_transform" }
        }
      val get_global_transform_with_canvas: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_global_transform_with_canvas".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_transform_with_canvas" }
        }
      val get_light_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_light_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_light_mask" }
        }
      val get_local_mouse_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_local_mouse_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_local_mouse_position" }
        }
      val get_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_material" }
        }
      val get_modulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_modulate" }
        }
      val get_self_modulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_self_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_self_modulate" }
        }
      val get_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transform" }
        }
      val get_use_parent_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_use_parent_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_use_parent_material" }
        }
      val get_viewport_rect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_viewport_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_viewport_rect" }
        }
      val get_viewport_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_viewport_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_viewport_transform" }
        }
      val get_world_2d: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "get_world_2d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_world_2d" }
        }
      val hide: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "hide".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hide" }
        }
      val is_draw_behind_parent_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "is_draw_behind_parent_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_draw_behind_parent_enabled" }
        }
      val is_local_transform_notification_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "is_local_transform_notification_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_local_transform_notification_enabled" }
        }
      val is_set_as_toplevel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "is_set_as_toplevel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_set_as_toplevel" }
        }
      val is_transform_notification_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "is_transform_notification_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_transform_notification_enabled"
            }
        }
      val is_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "is_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_visible" }
        }
      val is_visible_in_tree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "is_visible_in_tree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_visible_in_tree" }
        }
      val make_canvas_position_local: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "make_canvas_position_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_canvas_position_local" }
        }
      val make_input_local: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "make_input_local".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_input_local" }
        }
      val set_as_toplevel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_as_toplevel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_as_toplevel" }
        }
      val set_draw_behind_parent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_draw_behind_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_draw_behind_parent" }
        }
      val set_light_mask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_light_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_light_mask" }
        }
      val set_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material" }
        }
      val set_modulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_modulate" }
        }
      val set_notify_local_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_notify_local_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_notify_local_transform" }
        }
      val set_notify_transform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_notify_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_notify_transform" }
        }
      val set_self_modulate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_self_modulate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_self_modulate" }
        }
      val set_use_parent_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_use_parent_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_parent_material" }
        }
      val set_visible: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
            "set_visible".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_visible" }
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
