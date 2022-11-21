package bridge

import bridge.model.GameState

interface MovingEventListener {

    fun notify(gameState: GameState)
}