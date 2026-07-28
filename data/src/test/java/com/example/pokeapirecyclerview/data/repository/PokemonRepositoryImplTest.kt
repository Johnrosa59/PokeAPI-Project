package com.example.pokeapirecyclerview.data.repository

import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue

class PokemonRepositoryImplTest {

    @Test
    fun recoveryPokemon_quandoApiRetornaSucesso_deveRetornarListaDePokemons() = runTest {

        val fakePokeAPI = FakePokeAPI()
        val repository = PokemonRepositoryImpl(fakePokeAPI)

        val resultado = repository.recoveryPokemon()

        assertEquals(2, resultado.size)
    }

    @Test
    fun recoveryPokemon_whenApiReturnsError_shouldReturnEmptyList() = runTest {

        val fakePokeAPI = FakePokeAPI()
        fakePokeAPI.shouldReturnError = true
        val repository = PokemonRepositoryImpl(fakePokeAPI)


        val result = repository.recoveryPokemon()


        assertTrue(result.isEmpty())
    }
}