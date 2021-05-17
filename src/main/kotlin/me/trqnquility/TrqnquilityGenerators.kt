package me.trqnquility

import org.bukkit.plugin.java.JavaPlugin

class TrqnquilityGenerators : JavaPlugin() {

    companion object {
        lateinit var instance: TrqnquilityGenerators
    }

    override fun onEnable() {
        instance = this
    }

    override fun onDisable() {


    }
}