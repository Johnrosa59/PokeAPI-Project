package com.example.pokeapirecyclerview.data.repository

import com.example.pokeapirecyclerview.data.dto.Result
import com.example.pokeapirecyclerview.data.dto.ResultPokeAPIDTO
import com.example.pokeapirecyclerview.data.remote.PokeAPI
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner
import retrofit2.Response

@RunWith(MockitoJUnitRunner::class)
class PokemonRepositoryImplTwoTest {

    private lateinit var pokemonRepositoryImpl: PokemonRepositoryImpl

    @Mock
    private lateinit var mockPokeAPI: PokeAPI

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        pokemonRepositoryImpl = PokemonRepositoryImpl(mockPokeAPI)
    }

    @Test
    fun recoveryPokemon_whenApiReturnsSuccess_shouldNotReturnEmpty() = runTest {

        // 1. Dados simulados (Mock)
        val responseFakeDTO = ResultPokeAPIDTO(
            count = 2,
            next = null,
            previous = null,
            results = listOf(
                Result(name = "bulbasaur", url = "https://pokeapi.co/api/v2/pokemon/1/"),
                Result(name = "charmander", url = "https://pokeapi.co/api/v2/pokemon/4/")
            )
        )


        Mockito.`when`(mockPokeAPI.recoveryPokemons()).thenReturn(
            Response.success(responseFakeDTO)
        )

        val lista = pokemonRepositoryImpl.recoveryPokemon()

        assertThat(lista).isNotEmpty()
    }
}
