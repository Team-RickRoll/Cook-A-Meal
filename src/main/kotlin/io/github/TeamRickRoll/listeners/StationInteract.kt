package io.github.TeamRickRoll.listeners

import io.github.TeamRickRoll.KCAM.Companion.listenOnly
import io.github.TeamRickRoll.stations.CuttingBoard
import io.github.TeamRickRoll.stations.Station
import io.github.TeamRickRoll.stations.StationType
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.minestom.server.entity.Player
import net.minestom.server.event.Event
import net.minestom.server.event.EventNode
import net.minestom.server.event.inventory.InventoryPreClickEvent
import net.minestom.server.event.player.PlayerBlockInteractEvent
import net.minestom.server.inventory.Inventory
import net.minestom.server.inventory.InventoryType
import net.minestom.server.tag.Tag

class StationInteract(eventNode: EventNode<Event>) {
    init{
        val cuttingBoard = CuttingBoard()

        eventNode.listenOnly<PlayerBlockInteractEvent> {
            if(hand != Player.Hand.MAIN) return@listenOnly
            when(block.getTag(Tag.String("StationType"))){
                "CuttingBoard" -> {
                    player.openInventory(cuttingBoard.gui)
                }
                else -> {
                    // Not a custom station
                    return@listenOnly
                }
            }
        }
        eventNode.listenOnly<InventoryPreClickEvent> {
            if(inventory!!.hasTag(Tag.String("StationType"))){

                when(inventory!!.getTag(Tag.String("StationType"))){
                    "CuttingBoard" -> {
                        cuttingBoard.onInventoryClick(this)
                    }
                    else -> {
                        // Not a custom station inventory
                        return@listenOnly
                    }
                }

            }
        }
    }


}
