package io.github.TeamRickRoll

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.minestom.server.item.ItemStack
import net.minestom.server.item.Material

class Items {

    var cheese = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Cheese", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1000003)
            })
            .build()

    var lettuce = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Lettuce", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1000006)
            })
            .build()

    var butter = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Butter", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1000001)
            })
            .build()
    //do the same thing but name it cheese slice

    var cheeseSlice = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Cheese Slice", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1000002)
            })
            .build()

    var cookedTurkey = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Cooked Turkey", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1000004)
            })
            .build()

    var lettuceLeaf = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Lettuce Leaf", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1000005)
            })
            .build()

    var onion = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Onion", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1000007)
            })
            .build()

    var potatoSlice = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Potato Slice", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1000008)
            })
            .build()

    var rawTurkey = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Raw Turkey", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1000009)
            })
            .build()

    var toast = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Toast", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1000010)
            })
            .build()

    var tomatoSlice = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Tomato Slice", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1000011)
            })
            .build()

    var tomato = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Tomato", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1000012)
            })
            .build()

    var turkeySalad = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Turkey Salad", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1000013)
            })
            .build()

    var turkeySandwich = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Turkey Sandwich", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1000014)
            })
            .build()

    var turkeyBurger = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Turkey Burger", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1000015)
            })
            .build()

    //new item called knife that uses the Material IRON_SWORD with model data of 1234567

    var knife = ItemStack.builder(Material.IRON_SWORD)
            .displayName(Component.text("Knife", NamedTextColor.WHITE))
            .meta(metaBuilder = {
                it.customModelData(1234567)
            })
            .build()

}