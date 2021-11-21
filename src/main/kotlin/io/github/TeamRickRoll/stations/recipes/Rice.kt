package io.github.TeamRickRoll.stations.recipes

import io.github.TeamRickRoll.stations.Recipe
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.minestom.server.item.*
import net.minestom.server.tag.Tag

class Rice : Recipe() {
    override val id: String
        get() = "recipes:rice_bowl"
    override val cookTime: Int
        get() = 30
    override val output: ItemStack
        get() = ItemStack.of(Material.APPLE)


            /*ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Rice Bowl", NamedTextColor.WHITE))
            .amount(1)
            .meta {
                it.customModelData(10000016)
            }
            .build()
            .withTag(Tag.String("Food"), "food:rice_bowl")*/

    init {
        cuttingBoardRecipes.add(this)
    }
}