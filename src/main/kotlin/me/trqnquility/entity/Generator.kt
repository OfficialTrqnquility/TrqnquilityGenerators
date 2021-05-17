package me.trqnquility.entity

import org.bukkit.Location
import org.bukkit.inventory.ItemStack

interface Generator {

    val location: Location

    val generationSpeed: Long

    val lastCollected: Long

    val storageType: ItemStack

    var size: Int

    fun getAmountGenerated(): Int

    fun getProgressTillNext(): Double




}