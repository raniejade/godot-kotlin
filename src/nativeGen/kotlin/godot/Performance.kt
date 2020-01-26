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

open class Performance internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  companion object {
    val AudioOutputLatency: Int = 28

    val MemoryDynamic: Int = 4

    val MemoryDynamicMax: Int = 6

    val MemoryMessageBufferMax: Int = 7

    val MemoryStatic: Int = 3

    val MemoryStaticMax: Int = 5

    val MonitorMax: Int = 29

    val ObjectCount: Int = 8

    val ObjectNodeCount: Int = 10

    val ObjectOrphanNodeCount: Int = 11

    val ObjectResourceCount: Int = 9

    val Physics2dActiveObjects: Int = 22

    val Physics2dCollisionPairs: Int = 23

    val Physics2dIslandCount: Int = 24

    val Physics3dActiveObjects: Int = 25

    val Physics3dCollisionPairs: Int = 26

    val Physics3dIslandCount: Int = 27

    val RenderDrawCallsInFrame: Int = 17

    val RenderMaterialChangesInFrame: Int = 14

    val RenderObjectsInFrame: Int = 12

    val RenderShaderChangesInFrame: Int = 15

    val RenderSurfaceChangesInFrame: Int = 16

    val RenderTextureMemUsed: Int = 19

    val RenderUsageVideoMemTotal: Int = 21

    val RenderVertexMemUsed: Int = 20

    val RenderVerticesInFrame: Int = 13

    val RenderVideoMemUsed: Int = 18

    val TimeFps: Int = 0

    val TimePhysicsProcess: Int = 2

    val TimeProcess: Int = 1
  }
}
