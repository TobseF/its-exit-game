package de.tfr.game

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import ktx.graphics.use

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class ExitGamesStart : ApplicationAdapter() {
    private lateinit var batch : SpriteBatch
    private lateinit var font : BitmapFont

    override fun create() {
        batch = SpriteBatch()
        font = BitmapFont()
    }

    override fun render() {
        batch.use {
            font.draw(it, "Boom!", 100f, 100f)
        }
    }
}