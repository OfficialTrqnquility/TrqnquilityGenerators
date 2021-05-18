package me.trqnquility.repo

import me.trqnquility.entity.Generator

interface GeneratorRepository {

    val loadedGenerators: MutableList<Generator>

    val placedGenerators: MutableList<Generator>

    fun load()

    fun save()

}