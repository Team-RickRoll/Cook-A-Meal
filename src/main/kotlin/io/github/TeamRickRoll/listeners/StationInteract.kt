package io.github.TeamRickRoll.listeners

import io.github.TeamRickRoll.KCAM.Companion.listenOnly
import net.minestom.server.entity.Player
import net.minestom.server.event.Event
import net.minestom.server.event.EventNode
import net.minestom.server.event.player.PlayerBlockInteractEvent
import net.minestom.server.tag.Tag

class StationInteract(eventNode: EventNode<Event>) {
    init{
        eventNode.listenOnly<PlayerBlockInteractEvent> {
            if(hand != Player.Hand.MAIN) return@listenOnly
            when(block.getTag(Tag.String("StationType"))){
                "CuttingBoard" -> {
                    println("deboug mesog")
                }
                else -> {
                    // Not a custom station
                    return@listenOnly
                }
            }
        }
    }
}
