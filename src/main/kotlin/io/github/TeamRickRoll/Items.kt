package io.github.TeamRickRoll

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.minestom.server.item.ItemMetaBuilder
import net.minestom.server.item.ItemStack
import net.minestom.server.item.Material

class Items {

    val cheese = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Cheese", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000003)
            }
            .build()

    val lettuce = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Lettuce", NamedTextColor.WHITE))
            .meta {
             it.customModelData(1000006) }
            .build()

    val butter = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Butter", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000001)
            }
            .build()

    val cheeseSlice = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Cheese Slice", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000002)
            }
            .build()

    val cookedTurkey = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Cooked Turkey", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000004)
            }
            .build()

    val lettuceLeaf = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Lettuce Leaf", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000005)
            }
            .build()

    val onion = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Onion", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000007)
            }
            .build()

    val potatoSlice = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Potato Slice", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000008)
            }
            .build()

    val rawTurkey = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Raw Turkey", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000009)
            }
            .build()

    val toast = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Toast", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000010)
            }
            .build()

    val tomatoSlice = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Tomato Slice", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000011)
            }
            .build()

    val tomato = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Tomato", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000012)
            }
            .build()

    val turkeySalad = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Turkey Salad", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000013)
            }
            .build()

    val turkeySandwich = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Turkey Sandwich", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000014)
            }
            .build()

    val turkeyBurger = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Turkey Burger", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000015)
            }
            .build()

    val knife = ItemStack.builder(Material.IRON_SWORD)
            .displayName(Component.text("Knife", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1234567)
            }
            .build()



}