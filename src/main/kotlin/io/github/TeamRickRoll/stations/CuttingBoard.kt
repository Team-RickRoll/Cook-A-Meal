package io.github.TeamRickRoll.stations

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.minestom.server.inventory.Inventory
import net.minestom.server.inventory.InventoryType
import net.minestom.server.item.ItemStack
import net.minestom.server.item.Material
import net.minestom.server.tag.Tag

class CuttingBoard : Station() {
    private val inventory = Inventory(InventoryType.CHEST_3_ROW, Component.text("Cutting Board", NamedTextColor.WHITE))
    init {
        inventory.setItemStack(1, ItemStack.of(Material.BOOK).withTag(Tag.String("ItemType"), "Recipes"))
        inventory.setTag(Tag.String("StationType"), "CuttingBoard")
    }
    override val name: String
        get() = "station:cutting_board"
    override val gui: Inventory
        get() = inventory
    override val stationType: StationType
        get() = StationType.CUTTING_BOARD
}