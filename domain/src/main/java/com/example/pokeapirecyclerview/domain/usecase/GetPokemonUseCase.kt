package com.example.pokeapirecyclerview.domain.usecase

import com.example.pokeapirecyclerview.domain.model.Pokemon
import com.example.pokeapirecyclerview.domain.repository.PokemonRepository
import javax.inject.Inject

class GetPokemonUseCase @Inject constructor(
    private val pokemonRepository: PokemonRepository
) {

    suspend operator fun invoke() : List<Pokemon> {
        return try {

            pokemonRepository.recoveryPokemon()


        }catch (erroRecuperarUsuarios: Exception){
            erroRecuperarUsuarios.printStackTrace()
            emptyList()
        }
    }

}