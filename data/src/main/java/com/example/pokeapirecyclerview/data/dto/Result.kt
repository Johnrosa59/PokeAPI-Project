package com.example.pokeapirecyclerview.data.dto

import com.example.pokeapirecyclerview.domain.model.Pokemon

data class Result(
    val name: String,
    val url: String
)

fun Result.toPokemon(): Pokemon {
    val pokemonId = extractPokemonId(url)
    val imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$pokemonId.png"

    return Pokemon(
        nameOfPokemon = name,
        urlOfPokemon = url,
        urlImageOfPokemon = imageUrl
    )
}

private fun extractPokemonId(detailUrl: String): String {
    return detailUrl.trimEnd('/').substringAfterLast('/')
}