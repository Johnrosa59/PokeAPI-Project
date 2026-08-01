package com.example.pokeapirecyclerview.data.repository

import android.util.Log
import com.example.pokeapirecyclerview.data.dto.toPokemon
import com.example.pokeapirecyclerview.data.remote.PokeAPI
import com.example.pokeapirecyclerview.domain.model.Pokemon
import com.example.pokeapirecyclerview.domain.repository.PokemonRepository
import javax.inject.Inject

class PokemonRepositoryImpl @Inject constructor(
    private val pokeAPI: PokeAPI
): PokemonRepository {

    override suspend fun recoveryPokemon(): List<Pokemon> {


        try {

            val response = pokeAPI.recoveryPokemons()
            if( response.isSuccessful && response.body() != null ){
                val resultAPIDTO = response.body()
                val listPokemons = resultAPIDTO?.results
                if( listPokemons != null ){
                    return listPokemons.map { it.toPokemon() }
                }
            }else{
                Log.i("lista_pokemons", "${response.message()}")
            }

        }catch (erroRecuperarUsuarios: Exception){
            erroRecuperarUsuarios.printStackTrace()
        }
        return emptyList()
    }
}