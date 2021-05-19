import Scenes.*

import com.soywiz.korge.scene.*
import com.soywiz.korinject.*
import com.soywiz.korma.geom.*
import kotlin.reflect.*

object GameModule : Module() {

    override val mainScene: KClass<out Scene> = TestScene::class
    override val size: SizeInt = SizeInt(1920,1080)
    //override val bgcolor: RGBA = Colors.WHITE

    override suspend fun AsyncInjector.configure() {
        mapPrototype { TestScene() }
        mapPrototype { Physics_Sample() }


    }

}