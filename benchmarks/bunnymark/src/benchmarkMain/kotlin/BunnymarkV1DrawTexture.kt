import godot.*
import godot.core.Variant
import godot.core.Vector2
import kotlin.random.Random

class BunnymarkV1DrawTexture : Node2D() {
  private val bunnies = mutableListOf<Array<Vector2>>()
  private val bunnyTexture by lazy {
    ResourceLoader.load<Texture>("res://images/godot_bunny.png")
  }
  private val grav = 500
  private lateinit var screenSize: Vector2
  private val normalMap by lazy { Texture() }

  override fun _draw() {
    for (bunny in bunnies) {
      drawTexture(bunnyTexture, bunny[0], normalMap = normalMap)
    }
  }

  override fun _process(delta: Float) {
    screenSize = getViewportRect().size

    for (bunny in bunnies) {
      val pos = bunny[0]
      val newPosition = bunny[1]

      pos.x += newPosition.x * delta
      pos.y += newPosition.y * delta

      newPosition.y += grav * delta

      if (pos.x > screenSize.x) {
        newPosition.x *= -1
        pos.x = screenSize.x
      }

      if (pos.x < 0) {
        newPosition.x *= -1
        pos.x = 0f
      }

      if (pos.y > screenSize.y) {
        pos.y = screenSize.y

        if (Random.nextFloat() > 0.5f) {
          newPosition.y = -(Random.nextInt() % 1100 + 50).toFloat()
        } else {
          newPosition.y *= -0.85f
        }

      }

      if (pos.y < 0) {
        newPosition.y = 0f
        pos.y = 0f
      }

      bunny[0] = pos
      bunny[1] = newPosition
    }

    update()
  }

  fun add_bunny() {
    bunnies.add(
      arrayOf(Vector2(screenSize.x / 2, screenSize.y / 2), Vector2(Random.nextInt() % 200 + 50, Random.nextInt() % 200 + 50))
    )
  }

  fun remove_bunny() {
    if (bunnies.isEmpty()) {
      return
    }
    bunnies.dropLast(1)
  }


  fun finish() {
    emitSignal("benchmark_finished", bunnies.size)
  }

  companion object : GodotClass<Node2D, BunnymarkV1DrawTexture>(::BunnymarkV1DrawTexture) {
    override fun init(registry: ClassMemberRegistry<BunnymarkV1DrawTexture>) {
      with(registry) {
        registerMethod(BunnymarkV1DrawTexture::_draw)
        registerMethod(BunnymarkV1DrawTexture::_process)
        registerMethod(BunnymarkV1DrawTexture::add_bunny)
        registerMethod(BunnymarkV1DrawTexture::remove_bunny)
        registerMethod(BunnymarkV1DrawTexture::finish)
      }
    }
  }
}