package com.mygdx.game.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.mygdx.game.MyGdxGame

object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        val config = LwjglApplicationConfiguration()

        config.title = MyGdxGame().GAME_NAME
        config.width = MyGdxGame().WIDTH
        config.height =  MyGdxGame().HEIGHT
        config.backgroundFPS = MyGdxGame().NUMBER_OF_FPS

        LwjglApplication(MyGdxGame(), config)
    }
}
