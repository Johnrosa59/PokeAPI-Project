package com.example.pokeapirecyclerview.domain.repository

import com.example.pokeapirecyclerview.domain.model.Pokemon

interface PokemonRepository {

    suspend fun recoveryPokemon(): List<Pokemon>
}