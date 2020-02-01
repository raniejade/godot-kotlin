// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNodeBlendSpace2D(
  _handle: COpaquePointer
) : AnimationRootNode(_handle) {
  var autoTriangles: Boolean
    get() {
       return getAutoTriangles() 
    }
    set(value) {
      setAutoTriangles(value)
    }

  var blendMode: BlendMode
    get() {
       return getBlendMode() 
    }
    set(value) {
      setBlendMode(value.value)
    }

  var blendPoint0Pos: Vector2
    get() {
       return getBlendPointPosition(0) 
    }
    set(value) {
      setBlendPointPosition(0, value)
    }

  var blendPoint1Pos: Vector2
    get() {
       return getBlendPointPosition(1) 
    }
    set(value) {
      setBlendPointPosition(1, value)
    }

  var blendPoint10Pos: Vector2
    get() {
       return getBlendPointPosition(10) 
    }
    set(value) {
      setBlendPointPosition(10, value)
    }

  var blendPoint11Pos: Vector2
    get() {
       return getBlendPointPosition(11) 
    }
    set(value) {
      setBlendPointPosition(11, value)
    }

  var blendPoint12Pos: Vector2
    get() {
       return getBlendPointPosition(12) 
    }
    set(value) {
      setBlendPointPosition(12, value)
    }

  var blendPoint13Pos: Vector2
    get() {
       return getBlendPointPosition(13) 
    }
    set(value) {
      setBlendPointPosition(13, value)
    }

  var blendPoint14Pos: Vector2
    get() {
       return getBlendPointPosition(14) 
    }
    set(value) {
      setBlendPointPosition(14, value)
    }

  var blendPoint15Pos: Vector2
    get() {
       return getBlendPointPosition(15) 
    }
    set(value) {
      setBlendPointPosition(15, value)
    }

  var blendPoint16Pos: Vector2
    get() {
       return getBlendPointPosition(16) 
    }
    set(value) {
      setBlendPointPosition(16, value)
    }

  var blendPoint17Pos: Vector2
    get() {
       return getBlendPointPosition(17) 
    }
    set(value) {
      setBlendPointPosition(17, value)
    }

  var blendPoint18Pos: Vector2
    get() {
       return getBlendPointPosition(18) 
    }
    set(value) {
      setBlendPointPosition(18, value)
    }

  var blendPoint19Pos: Vector2
    get() {
       return getBlendPointPosition(19) 
    }
    set(value) {
      setBlendPointPosition(19, value)
    }

  var blendPoint2Pos: Vector2
    get() {
       return getBlendPointPosition(2) 
    }
    set(value) {
      setBlendPointPosition(2, value)
    }

  var blendPoint20Pos: Vector2
    get() {
       return getBlendPointPosition(20) 
    }
    set(value) {
      setBlendPointPosition(20, value)
    }

  var blendPoint21Pos: Vector2
    get() {
       return getBlendPointPosition(21) 
    }
    set(value) {
      setBlendPointPosition(21, value)
    }

  var blendPoint22Pos: Vector2
    get() {
       return getBlendPointPosition(22) 
    }
    set(value) {
      setBlendPointPosition(22, value)
    }

  var blendPoint23Pos: Vector2
    get() {
       return getBlendPointPosition(23) 
    }
    set(value) {
      setBlendPointPosition(23, value)
    }

  var blendPoint24Pos: Vector2
    get() {
       return getBlendPointPosition(24) 
    }
    set(value) {
      setBlendPointPosition(24, value)
    }

  var blendPoint25Pos: Vector2
    get() {
       return getBlendPointPosition(25) 
    }
    set(value) {
      setBlendPointPosition(25, value)
    }

  var blendPoint26Pos: Vector2
    get() {
       return getBlendPointPosition(26) 
    }
    set(value) {
      setBlendPointPosition(26, value)
    }

  var blendPoint27Pos: Vector2
    get() {
       return getBlendPointPosition(27) 
    }
    set(value) {
      setBlendPointPosition(27, value)
    }

  var blendPoint28Pos: Vector2
    get() {
       return getBlendPointPosition(28) 
    }
    set(value) {
      setBlendPointPosition(28, value)
    }

  var blendPoint29Pos: Vector2
    get() {
       return getBlendPointPosition(29) 
    }
    set(value) {
      setBlendPointPosition(29, value)
    }

  var blendPoint3Pos: Vector2
    get() {
       return getBlendPointPosition(3) 
    }
    set(value) {
      setBlendPointPosition(3, value)
    }

  var blendPoint30Pos: Vector2
    get() {
       return getBlendPointPosition(30) 
    }
    set(value) {
      setBlendPointPosition(30, value)
    }

  var blendPoint31Pos: Vector2
    get() {
       return getBlendPointPosition(31) 
    }
    set(value) {
      setBlendPointPosition(31, value)
    }

  var blendPoint32Pos: Vector2
    get() {
       return getBlendPointPosition(32) 
    }
    set(value) {
      setBlendPointPosition(32, value)
    }

  var blendPoint33Pos: Vector2
    get() {
       return getBlendPointPosition(33) 
    }
    set(value) {
      setBlendPointPosition(33, value)
    }

  var blendPoint34Pos: Vector2
    get() {
       return getBlendPointPosition(34) 
    }
    set(value) {
      setBlendPointPosition(34, value)
    }

  var blendPoint35Pos: Vector2
    get() {
       return getBlendPointPosition(35) 
    }
    set(value) {
      setBlendPointPosition(35, value)
    }

  var blendPoint36Pos: Vector2
    get() {
       return getBlendPointPosition(36) 
    }
    set(value) {
      setBlendPointPosition(36, value)
    }

  var blendPoint37Pos: Vector2
    get() {
       return getBlendPointPosition(37) 
    }
    set(value) {
      setBlendPointPosition(37, value)
    }

  var blendPoint38Pos: Vector2
    get() {
       return getBlendPointPosition(38) 
    }
    set(value) {
      setBlendPointPosition(38, value)
    }

  var blendPoint39Pos: Vector2
    get() {
       return getBlendPointPosition(39) 
    }
    set(value) {
      setBlendPointPosition(39, value)
    }

  var blendPoint4Pos: Vector2
    get() {
       return getBlendPointPosition(4) 
    }
    set(value) {
      setBlendPointPosition(4, value)
    }

  var blendPoint40Pos: Vector2
    get() {
       return getBlendPointPosition(40) 
    }
    set(value) {
      setBlendPointPosition(40, value)
    }

  var blendPoint41Pos: Vector2
    get() {
       return getBlendPointPosition(41) 
    }
    set(value) {
      setBlendPointPosition(41, value)
    }

  var blendPoint42Pos: Vector2
    get() {
       return getBlendPointPosition(42) 
    }
    set(value) {
      setBlendPointPosition(42, value)
    }

  var blendPoint43Pos: Vector2
    get() {
       return getBlendPointPosition(43) 
    }
    set(value) {
      setBlendPointPosition(43, value)
    }

  var blendPoint44Pos: Vector2
    get() {
       return getBlendPointPosition(44) 
    }
    set(value) {
      setBlendPointPosition(44, value)
    }

  var blendPoint45Pos: Vector2
    get() {
       return getBlendPointPosition(45) 
    }
    set(value) {
      setBlendPointPosition(45, value)
    }

  var blendPoint46Pos: Vector2
    get() {
       return getBlendPointPosition(46) 
    }
    set(value) {
      setBlendPointPosition(46, value)
    }

  var blendPoint47Pos: Vector2
    get() {
       return getBlendPointPosition(47) 
    }
    set(value) {
      setBlendPointPosition(47, value)
    }

  var blendPoint48Pos: Vector2
    get() {
       return getBlendPointPosition(48) 
    }
    set(value) {
      setBlendPointPosition(48, value)
    }

  var blendPoint49Pos: Vector2
    get() {
       return getBlendPointPosition(49) 
    }
    set(value) {
      setBlendPointPosition(49, value)
    }

  var blendPoint5Pos: Vector2
    get() {
       return getBlendPointPosition(5) 
    }
    set(value) {
      setBlendPointPosition(5, value)
    }

  var blendPoint50Pos: Vector2
    get() {
       return getBlendPointPosition(50) 
    }
    set(value) {
      setBlendPointPosition(50, value)
    }

  var blendPoint51Pos: Vector2
    get() {
       return getBlendPointPosition(51) 
    }
    set(value) {
      setBlendPointPosition(51, value)
    }

  var blendPoint52Pos: Vector2
    get() {
       return getBlendPointPosition(52) 
    }
    set(value) {
      setBlendPointPosition(52, value)
    }

  var blendPoint53Pos: Vector2
    get() {
       return getBlendPointPosition(53) 
    }
    set(value) {
      setBlendPointPosition(53, value)
    }

  var blendPoint54Pos: Vector2
    get() {
       return getBlendPointPosition(54) 
    }
    set(value) {
      setBlendPointPosition(54, value)
    }

  var blendPoint55Pos: Vector2
    get() {
       return getBlendPointPosition(55) 
    }
    set(value) {
      setBlendPointPosition(55, value)
    }

  var blendPoint56Pos: Vector2
    get() {
       return getBlendPointPosition(56) 
    }
    set(value) {
      setBlendPointPosition(56, value)
    }

  var blendPoint57Pos: Vector2
    get() {
       return getBlendPointPosition(57) 
    }
    set(value) {
      setBlendPointPosition(57, value)
    }

  var blendPoint58Pos: Vector2
    get() {
       return getBlendPointPosition(58) 
    }
    set(value) {
      setBlendPointPosition(58, value)
    }

  var blendPoint59Pos: Vector2
    get() {
       return getBlendPointPosition(59) 
    }
    set(value) {
      setBlendPointPosition(59, value)
    }

  var blendPoint6Pos: Vector2
    get() {
       return getBlendPointPosition(6) 
    }
    set(value) {
      setBlendPointPosition(6, value)
    }

  var blendPoint60Pos: Vector2
    get() {
       return getBlendPointPosition(60) 
    }
    set(value) {
      setBlendPointPosition(60, value)
    }

  var blendPoint61Pos: Vector2
    get() {
       return getBlendPointPosition(61) 
    }
    set(value) {
      setBlendPointPosition(61, value)
    }

  var blendPoint62Pos: Vector2
    get() {
       return getBlendPointPosition(62) 
    }
    set(value) {
      setBlendPointPosition(62, value)
    }

  var blendPoint63Pos: Vector2
    get() {
       return getBlendPointPosition(63) 
    }
    set(value) {
      setBlendPointPosition(63, value)
    }

  var blendPoint7Pos: Vector2
    get() {
       return getBlendPointPosition(7) 
    }
    set(value) {
      setBlendPointPosition(7, value)
    }

  var blendPoint8Pos: Vector2
    get() {
       return getBlendPointPosition(8) 
    }
    set(value) {
      setBlendPointPosition(8, value)
    }

  var blendPoint9Pos: Vector2
    get() {
       return getBlendPointPosition(9) 
    }
    set(value) {
      setBlendPointPosition(9, value)
    }

  var maxSpace: Vector2
    get() {
       return getMaxSpace() 
    }
    set(value) {
      setMaxSpace(value)
    }

  var minSpace: Vector2
    get() {
       return getMinSpace() 
    }
    set(value) {
      setMinSpace(value)
    }

  var snap: Vector2
    get() {
       return getSnap() 
    }
    set(value) {
      setSnap(value)
    }

  var xLabel: String
    get() {
       return getXLabel() 
    }
    set(value) {
      setXLabel(value)
    }

  var yLabel: String
    get() {
       return getYLabel() 
    }
    set(value) {
      setYLabel(value)
    }

  /**
   * Specialized setter for blendPoint0Pos
   */
  fun blendPoint0Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint0Pos
    cb(_p)
    blendPoint0Pos = _p
  }

  /**
   * Specialized setter for blendPoint1Pos
   */
  fun blendPoint1Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint1Pos
    cb(_p)
    blendPoint1Pos = _p
  }

  /**
   * Specialized setter for blendPoint10Pos
   */
  fun blendPoint10Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint10Pos
    cb(_p)
    blendPoint10Pos = _p
  }

  /**
   * Specialized setter for blendPoint11Pos
   */
  fun blendPoint11Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint11Pos
    cb(_p)
    blendPoint11Pos = _p
  }

  /**
   * Specialized setter for blendPoint12Pos
   */
  fun blendPoint12Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint12Pos
    cb(_p)
    blendPoint12Pos = _p
  }

  /**
   * Specialized setter for blendPoint13Pos
   */
  fun blendPoint13Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint13Pos
    cb(_p)
    blendPoint13Pos = _p
  }

  /**
   * Specialized setter for blendPoint14Pos
   */
  fun blendPoint14Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint14Pos
    cb(_p)
    blendPoint14Pos = _p
  }

  /**
   * Specialized setter for blendPoint15Pos
   */
  fun blendPoint15Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint15Pos
    cb(_p)
    blendPoint15Pos = _p
  }

  /**
   * Specialized setter for blendPoint16Pos
   */
  fun blendPoint16Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint16Pos
    cb(_p)
    blendPoint16Pos = _p
  }

  /**
   * Specialized setter for blendPoint17Pos
   */
  fun blendPoint17Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint17Pos
    cb(_p)
    blendPoint17Pos = _p
  }

  /**
   * Specialized setter for blendPoint18Pos
   */
  fun blendPoint18Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint18Pos
    cb(_p)
    blendPoint18Pos = _p
  }

  /**
   * Specialized setter for blendPoint19Pos
   */
  fun blendPoint19Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint19Pos
    cb(_p)
    blendPoint19Pos = _p
  }

  /**
   * Specialized setter for blendPoint2Pos
   */
  fun blendPoint2Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint2Pos
    cb(_p)
    blendPoint2Pos = _p
  }

  /**
   * Specialized setter for blendPoint20Pos
   */
  fun blendPoint20Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint20Pos
    cb(_p)
    blendPoint20Pos = _p
  }

  /**
   * Specialized setter for blendPoint21Pos
   */
  fun blendPoint21Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint21Pos
    cb(_p)
    blendPoint21Pos = _p
  }

  /**
   * Specialized setter for blendPoint22Pos
   */
  fun blendPoint22Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint22Pos
    cb(_p)
    blendPoint22Pos = _p
  }

  /**
   * Specialized setter for blendPoint23Pos
   */
  fun blendPoint23Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint23Pos
    cb(_p)
    blendPoint23Pos = _p
  }

  /**
   * Specialized setter for blendPoint24Pos
   */
  fun blendPoint24Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint24Pos
    cb(_p)
    blendPoint24Pos = _p
  }

  /**
   * Specialized setter for blendPoint25Pos
   */
  fun blendPoint25Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint25Pos
    cb(_p)
    blendPoint25Pos = _p
  }

  /**
   * Specialized setter for blendPoint26Pos
   */
  fun blendPoint26Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint26Pos
    cb(_p)
    blendPoint26Pos = _p
  }

  /**
   * Specialized setter for blendPoint27Pos
   */
  fun blendPoint27Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint27Pos
    cb(_p)
    blendPoint27Pos = _p
  }

  /**
   * Specialized setter for blendPoint28Pos
   */
  fun blendPoint28Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint28Pos
    cb(_p)
    blendPoint28Pos = _p
  }

  /**
   * Specialized setter for blendPoint29Pos
   */
  fun blendPoint29Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint29Pos
    cb(_p)
    blendPoint29Pos = _p
  }

  /**
   * Specialized setter for blendPoint3Pos
   */
  fun blendPoint3Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint3Pos
    cb(_p)
    blendPoint3Pos = _p
  }

  /**
   * Specialized setter for blendPoint30Pos
   */
  fun blendPoint30Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint30Pos
    cb(_p)
    blendPoint30Pos = _p
  }

  /**
   * Specialized setter for blendPoint31Pos
   */
  fun blendPoint31Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint31Pos
    cb(_p)
    blendPoint31Pos = _p
  }

  /**
   * Specialized setter for blendPoint32Pos
   */
  fun blendPoint32Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint32Pos
    cb(_p)
    blendPoint32Pos = _p
  }

  /**
   * Specialized setter for blendPoint33Pos
   */
  fun blendPoint33Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint33Pos
    cb(_p)
    blendPoint33Pos = _p
  }

  /**
   * Specialized setter for blendPoint34Pos
   */
  fun blendPoint34Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint34Pos
    cb(_p)
    blendPoint34Pos = _p
  }

  /**
   * Specialized setter for blendPoint35Pos
   */
  fun blendPoint35Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint35Pos
    cb(_p)
    blendPoint35Pos = _p
  }

  /**
   * Specialized setter for blendPoint36Pos
   */
  fun blendPoint36Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint36Pos
    cb(_p)
    blendPoint36Pos = _p
  }

  /**
   * Specialized setter for blendPoint37Pos
   */
  fun blendPoint37Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint37Pos
    cb(_p)
    blendPoint37Pos = _p
  }

  /**
   * Specialized setter for blendPoint38Pos
   */
  fun blendPoint38Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint38Pos
    cb(_p)
    blendPoint38Pos = _p
  }

  /**
   * Specialized setter for blendPoint39Pos
   */
  fun blendPoint39Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint39Pos
    cb(_p)
    blendPoint39Pos = _p
  }

  /**
   * Specialized setter for blendPoint4Pos
   */
  fun blendPoint4Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint4Pos
    cb(_p)
    blendPoint4Pos = _p
  }

  /**
   * Specialized setter for blendPoint40Pos
   */
  fun blendPoint40Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint40Pos
    cb(_p)
    blendPoint40Pos = _p
  }

  /**
   * Specialized setter for blendPoint41Pos
   */
  fun blendPoint41Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint41Pos
    cb(_p)
    blendPoint41Pos = _p
  }

  /**
   * Specialized setter for blendPoint42Pos
   */
  fun blendPoint42Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint42Pos
    cb(_p)
    blendPoint42Pos = _p
  }

  /**
   * Specialized setter for blendPoint43Pos
   */
  fun blendPoint43Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint43Pos
    cb(_p)
    blendPoint43Pos = _p
  }

  /**
   * Specialized setter for blendPoint44Pos
   */
  fun blendPoint44Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint44Pos
    cb(_p)
    blendPoint44Pos = _p
  }

  /**
   * Specialized setter for blendPoint45Pos
   */
  fun blendPoint45Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint45Pos
    cb(_p)
    blendPoint45Pos = _p
  }

  /**
   * Specialized setter for blendPoint46Pos
   */
  fun blendPoint46Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint46Pos
    cb(_p)
    blendPoint46Pos = _p
  }

  /**
   * Specialized setter for blendPoint47Pos
   */
  fun blendPoint47Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint47Pos
    cb(_p)
    blendPoint47Pos = _p
  }

  /**
   * Specialized setter for blendPoint48Pos
   */
  fun blendPoint48Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint48Pos
    cb(_p)
    blendPoint48Pos = _p
  }

  /**
   * Specialized setter for blendPoint49Pos
   */
  fun blendPoint49Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint49Pos
    cb(_p)
    blendPoint49Pos = _p
  }

  /**
   * Specialized setter for blendPoint5Pos
   */
  fun blendPoint5Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint5Pos
    cb(_p)
    blendPoint5Pos = _p
  }

  /**
   * Specialized setter for blendPoint50Pos
   */
  fun blendPoint50Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint50Pos
    cb(_p)
    blendPoint50Pos = _p
  }

  /**
   * Specialized setter for blendPoint51Pos
   */
  fun blendPoint51Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint51Pos
    cb(_p)
    blendPoint51Pos = _p
  }

  /**
   * Specialized setter for blendPoint52Pos
   */
  fun blendPoint52Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint52Pos
    cb(_p)
    blendPoint52Pos = _p
  }

  /**
   * Specialized setter for blendPoint53Pos
   */
  fun blendPoint53Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint53Pos
    cb(_p)
    blendPoint53Pos = _p
  }

  /**
   * Specialized setter for blendPoint54Pos
   */
  fun blendPoint54Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint54Pos
    cb(_p)
    blendPoint54Pos = _p
  }

  /**
   * Specialized setter for blendPoint55Pos
   */
  fun blendPoint55Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint55Pos
    cb(_p)
    blendPoint55Pos = _p
  }

  /**
   * Specialized setter for blendPoint56Pos
   */
  fun blendPoint56Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint56Pos
    cb(_p)
    blendPoint56Pos = _p
  }

  /**
   * Specialized setter for blendPoint57Pos
   */
  fun blendPoint57Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint57Pos
    cb(_p)
    blendPoint57Pos = _p
  }

  /**
   * Specialized setter for blendPoint58Pos
   */
  fun blendPoint58Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint58Pos
    cb(_p)
    blendPoint58Pos = _p
  }

  /**
   * Specialized setter for blendPoint59Pos
   */
  fun blendPoint59Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint59Pos
    cb(_p)
    blendPoint59Pos = _p
  }

  /**
   * Specialized setter for blendPoint6Pos
   */
  fun blendPoint6Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint6Pos
    cb(_p)
    blendPoint6Pos = _p
  }

  /**
   * Specialized setter for blendPoint60Pos
   */
  fun blendPoint60Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint60Pos
    cb(_p)
    blendPoint60Pos = _p
  }

  /**
   * Specialized setter for blendPoint61Pos
   */
  fun blendPoint61Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint61Pos
    cb(_p)
    blendPoint61Pos = _p
  }

  /**
   * Specialized setter for blendPoint62Pos
   */
  fun blendPoint62Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint62Pos
    cb(_p)
    blendPoint62Pos = _p
  }

  /**
   * Specialized setter for blendPoint63Pos
   */
  fun blendPoint63Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint63Pos
    cb(_p)
    blendPoint63Pos = _p
  }

  /**
   * Specialized setter for blendPoint7Pos
   */
  fun blendPoint7Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint7Pos
    cb(_p)
    blendPoint7Pos = _p
  }

  /**
   * Specialized setter for blendPoint8Pos
   */
  fun blendPoint8Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint8Pos
    cb(_p)
    blendPoint8Pos = _p
  }

  /**
   * Specialized setter for blendPoint9Pos
   */
  fun blendPoint9Pos(cb: Vector2.() -> Unit) {
    val _p = blendPoint9Pos
    cb(_p)
    blendPoint9Pos = _p
  }

  /**
   * Specialized setter for maxSpace
   */
  fun maxSpace(cb: Vector2.() -> Unit) {
    val _p = maxSpace
    cb(_p)
    maxSpace = _p
  }

  /**
   * Specialized setter for minSpace
   */
  fun minSpace(cb: Vector2.() -> Unit) {
    val _p = minSpace
    cb(_p)
    minSpace = _p
  }

  /**
   * Specialized setter for snap
   */
  fun snap(cb: Vector2.() -> Unit) {
    val _p = snap
    cb(_p)
    snap = _p
  }

  fun addBlendPoint(
    node: AnimationRootNode,
    pos: Vector2,
    atIndex: Int = -1
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(node))
    _args.add(Variant.fromAny(pos))
    _args.add(Variant.fromAny(atIndex))
    __method_bind.addBlendPoint.call(this._handle, _args)
  }

  fun addTriangle(
    x: Int,
    y: Int,
    z: Int,
    atIndex: Int = -1
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(x))
    _args.add(Variant.fromAny(y))
    _args.add(Variant.fromAny(z))
    _args.add(Variant.fromAny(atIndex))
    __method_bind.addTriangle.call(this._handle, _args)
  }

  fun getAutoTriangles(): Boolean {
    val _ret = __method_bind.getAutoTriangles.call(this._handle)
    return _ret.asBoolean()
  }

  fun getBlendMode(): BlendMode {
    val _ret = __method_bind.getBlendMode.call(this._handle)
    return AnimationNodeBlendSpace2D.BlendMode.from(_ret.asInt())
  }

  fun getBlendPointCount(): Int {
    val _ret = __method_bind.getBlendPointCount.call(this._handle)
    return _ret.asInt()
  }

  fun getBlendPointNode(point: Int): AnimationRootNode {
    val _arg = Variant.new(point)
    val _ret = __method_bind.getBlendPointNode.call(this._handle, listOf(_arg))
    return _ret.asObject(::AnimationRootNode)!!
  }

  fun getBlendPointPosition(point: Int): Vector2 {
    val _arg = Variant.new(point)
    val _ret = __method_bind.getBlendPointPosition.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun getMaxSpace(): Vector2 {
    val _ret = __method_bind.getMaxSpace.call(this._handle)
    return _ret.asVector2()
  }

  fun getMinSpace(): Vector2 {
    val _ret = __method_bind.getMinSpace.call(this._handle)
    return _ret.asVector2()
  }

  fun getSnap(): Vector2 {
    val _ret = __method_bind.getSnap.call(this._handle)
    return _ret.asVector2()
  }

  fun getTriangleCount(): Int {
    val _ret = __method_bind.getTriangleCount.call(this._handle)
    return _ret.asInt()
  }

  fun getTrianglePoint(triangle: Int, point: Int): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(triangle))
    _args.add(Variant.fromAny(point))
    val _ret = __method_bind.getTrianglePoint.call(this._handle, _args)
    return _ret.asInt()
  }

  fun getXLabel(): String {
    val _ret = __method_bind.getXLabel.call(this._handle)
    return _ret.asString()
  }

  fun getYLabel(): String {
    val _ret = __method_bind.getYLabel.call(this._handle)
    return _ret.asString()
  }

  fun removeBlendPoint(point: Int) {
    val _arg = Variant.new(point)
    __method_bind.removeBlendPoint.call(this._handle, listOf(_arg))
  }

  fun removeTriangle(triangle: Int) {
    val _arg = Variant.new(triangle)
    __method_bind.removeTriangle.call(this._handle, listOf(_arg))
  }

  fun setAutoTriangles(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAutoTriangles.call(this._handle, listOf(_arg))
  }

  fun setBlendMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setBlendMode.call(this._handle, listOf(_arg))
  }

  fun setBlendPointNode(point: Int, node: AnimationRootNode) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(point))
    _args.add(Variant.fromAny(node))
    __method_bind.setBlendPointNode.call(this._handle, _args)
  }

  fun setBlendPointPosition(point: Int, pos: Vector2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(point))
    _args.add(Variant.fromAny(pos))
    __method_bind.setBlendPointPosition.call(this._handle, _args)
  }

  fun setMaxSpace(maxSpace: Vector2) {
    val _arg = Variant.new(maxSpace)
    __method_bind.setMaxSpace.call(this._handle, listOf(_arg))
  }

  fun setMinSpace(minSpace: Vector2) {
    val _arg = Variant.new(minSpace)
    __method_bind.setMinSpace.call(this._handle, listOf(_arg))
  }

  fun setSnap(snap: Vector2) {
    val _arg = Variant.new(snap)
    __method_bind.setSnap.call(this._handle, listOf(_arg))
  }

  fun setXLabel(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setXLabel.call(this._handle, listOf(_arg))
  }

  fun setYLabel(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setYLabel.call(this._handle, listOf(_arg))
  }

  enum class BlendMode(
    val value: Int
  ) {
    BLEND_MODE_INTERPOLATED(0),

    BLEND_MODE_DISCRETE(1),

    BLEND_MODE_DISCRETE_CARRY(2);

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
    val BLEND_MODE_DISCRETE: Int = 1

    val BLEND_MODE_DISCRETE_CARRY: Int = 2

    val BLEND_MODE_INTERPOLATED: Int = 0

    fun new(): AnimationNodeBlendSpace2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeBlendSpace2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for AnimationNodeBlendSpace2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeBlendSpace2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNodeBlendSpace2D = AnimationNodeBlendSpace2D(ptr)
    /**
     * Container for method_bind pointers for AnimationNodeBlendSpace2D
     */
    private object __method_bind {
      val addBlendPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "add_blend_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_blend_point" }
        }
      val addTriangle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "add_triangle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_triangle" }
        }
      val getAutoTriangles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_auto_triangles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_auto_triangles" }
        }
      val getBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_blend_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_mode" }
        }
      val getBlendPointCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_blend_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_point_count" }
        }
      val getBlendPointNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_blend_point_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_point_node" }
        }
      val getBlendPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_blend_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_point_position" }
        }
      val getMaxSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_max_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_space" }
        }
      val getMinSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_min_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_min_space" }
        }
      val getSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_snap" }
        }
      val getTriangleCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_triangle_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_triangle_count" }
        }
      val getTrianglePoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_triangle_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_triangle_point" }
        }
      val getXLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_x_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_x_label" }
        }
      val getYLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "get_y_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_y_label" }
        }
      val removeBlendPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "remove_blend_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_blend_point" }
        }
      val removeTriangle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "remove_triangle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_triangle" }
        }
      val setAutoTriangles: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_auto_triangles".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_auto_triangles" }
        }
      val setBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_blend_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blend_mode" }
        }
      val setBlendPointNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_blend_point_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blend_point_node" }
        }
      val setBlendPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_blend_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blend_point_position" }
        }
      val setMaxSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_max_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_space" }
        }
      val setMinSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_min_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_min_space" }
        }
      val setSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_snap" }
        }
      val setXLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_x_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_x_label" }
        }
      val setYLabel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
            "set_y_label".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_y_label" }
        }}
  }
}
