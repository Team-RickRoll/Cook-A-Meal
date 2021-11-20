package io.github.TeamRickRoll.stations

import net.minestom.server.entity.Player
import net.minestom.server.event.inventory.InventoryClickEvent
import net.minestom.server.event.inventory.InventoryPreClickEvent
import net.minestom.server.inventory.Inventory
import net.minestom.server.item.ItemStack
import net.minestom.server.tag.Tag

abstract class Station {
    abstract val name: String
    abstract val gui: Inventory
    abstract val stationType: StationType
    private var recipeProgress = mutableListOf<RecipeProgress>()
    private fun onInventoryClick(event: InventoryPreClickEvent){
        event.isCancelled = true
        if(!event.inventory?.hasTag(Tag.String("StationType"))!!) return
        if(!event.clickedItem.hasTag(Tag.String("ItemType"))) return
        when (event.clickedItem.getTag(Tag.String("ItemType"))){
            "Recipes" ->{ openRecipeGUI(event.player) }
            "Slot" -> {
                if(event.clickedItem.isSimilar(ItemStack.AIR)) return
                for (recipe in recipeProgress){
                    if(event.slot == recipe.slot){
                        event.inventory?.setItemStack(recipe.slot, ItemStack.AIR)
                        recipeProgress.remove(recipe)
                    }
                }
            }

            else -> {

            }
        }
    }

    private fun openRecipeGUI(player: Player){

    }
}