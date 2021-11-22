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

    val pepper = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Pepper", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000016)
            }
            .build()

    val cucumber = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Cucumber", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000017)
            }
            .build()

    val rawCorn = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Raw Corn", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000018)
            }
            .build()

    val corn = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Corn", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000019)
            }
            .build()

    val sausage = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Sausage", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000020)
            }
            .build()

    val caesarSalad = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Caesar Salad", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000021)
            }
            .build()

    val beefStew = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Beef Stew", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000022)
            }
            .build()

    val tomatoSoup = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Tomato Soup", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000023)
            }
            .build()

    val vegetableSoup = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Vegetable Soup", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000024)
            }
            .build()

    val burrito = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Burrito", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000025)
            }
            .build()

    val appleJam = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Apple Jam", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000026)
            }
            .build()

    val appleSlice = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Apple Slice", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000028)
            }
            .build()

    val rawBacon = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Raw Bacon", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000029)
            }
            .build()

    val CookedBacon = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Cooked Bacon", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000030)
            }
            .build()

    val BreadSlice = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Bread Slice", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000031)
            }
            .build()

    val jamJar = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Jam Jar", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000032)
            }
            .build()

    val flour = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Flour", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000033)
            }
            .build()

    val cucumberSlice = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Cucumber Slice", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000034)
            }
            .build()

    val cleanPotato = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Clean Potato", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000035)
            }
            .build()

    val mashedPotato = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Mashed Potato", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000036)
            }
            .build()

    val grilledCorn = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Grilled Corn", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000037)
            }
            .build()

    val cookedChickenFillet = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Cooked Chicken Fillet", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000038)
            }
            .build()

    val rawChickenFillet = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Raw Chicken Fillet", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000039)
            }
            .build()

    val chickenLeg = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Chicken Leg", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000040)
            }
            .build()

    val sandwich = ItemStack.builder(Material.APPLE)
            .displayName(Component.text("Sandwich", NamedTextColor.WHITE))
            .meta {
                it.customModelData(1000041)
            }
            .build()



}