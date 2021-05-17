package me.trqnquility.entity.implementation

import me.trqnquility.entity.Generator
import org.bukkit.Location
import org.bukkit.inventory.ItemStack
import kotlin.math.floor

class SimpleGenerator(override val generationSpeed: Long,
                      override val lastCollected: Long,
                      override val storageType: ItemStack,
                      override var size: Int,
                      override val location: Location
) : Generator {

    override fun getAmountGenerated(): Int {
        var amount = floor((System.currentTimeMillis() - lastCollected).toDouble() / generationSpeed).toInt()
        return if (amount > size) size else amount
    }

    override fun getProgressTillNext(): Double {
        return if (getAmountGenerated() == size) 1.0 else (System.currentTimeMillis() - lastCollected).toDouble() / generationSpeed
    }

}