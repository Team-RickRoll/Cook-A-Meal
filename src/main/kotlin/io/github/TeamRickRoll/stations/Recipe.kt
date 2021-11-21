package io.github.TeamRickRoll.stations

import net.minestom.server.item.ItemStack

abstract class Recipe {
    abstract val id: String
    abstract val cookTime: Int
    abstract val output: ItemStack

    val cuttingBoardRecipes = mutableListOf<Recipe>()

}