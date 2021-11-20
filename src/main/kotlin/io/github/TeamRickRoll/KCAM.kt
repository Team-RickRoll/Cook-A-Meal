package io.github.TeamRickRoll

import io.github.TeamRickRoll.listeners.StationInteract
import net.minestom.server.MinecraftServer
import net.minestom.server.event.Event
import net.minestom.server.event.EventNode
import net.minestom.server.event.GlobalEventHandler

class KCAM {
    init {
        val node = EventNode.all("event-node")
        MinecraftServer.getGlobalEventHandler().addChild(node)

        StationInteract(node)
    }

    companion object{
        // Magic listener stuff
        inline fun <reified E : Event> EventNode<in E>.listenOnly(noinline lambda: E.() -> Unit) {
            this.addListener(
                E::class.java,
                lambda
            )
        }
    }
}