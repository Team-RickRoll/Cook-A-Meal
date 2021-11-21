package io.github.TeamRickRoll.stations

import io.github.TeamRickRoll.stations.recipes.Rice
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.minestom.server.entity.Player
import net.minestom.server.event.inventory.InventoryClickEvent
import net.minestom.server.event.inventory.InventoryPreClickEvent
import net.minestom.server.inventory.Inventory
import net.minestom.server.inventory.InventoryType
import net.minestom.server.item.ItemStack
import net.minestom.server.tag.Tag

abstract class Station {
    abstract val name: String
    abstract val gui: Inventory
    abstract val stationType: StationType
    private var recipeProgress = mutableListOf<RecipeProgress>()
    fun onInventoryClick(event: InventoryPreClickEvent){
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

    fun openRecipeGUI(player: Player){
        player.openInventory(createRecipeGui(stationType))
    }
    private val rice = Rice()
    private fun createRecipeGui(type: StationType): Inventory {
        when(stationType){
            StationType.CUTTING_BOARD -> {
                val inventory = Inventory(InventoryType.CHEST_1_ROW, "Cutting board recipes")
                for(i in 1..rice.cuttingBoardRecipes.size){
                    inventory.itemStacks[i] = rice.cuttingBoardRecipes[i - 1].output
                }
                return inventory
            }
            StationType.OVEN -> TODO()
            StationType.STOVE -> TODO()
            StationType.MICROWAVE -> TODO()
        }
    }
}