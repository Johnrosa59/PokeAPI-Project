package com.example.pokeapirecyclerview.data.repository

import com.example.pokeapirecyclerview.data.dto.Result
import com.example.pokeapirecyclerview.data.dto.ResultPokeAPIDTO
import com.example.pokeapirecyclerview.data.remote.PokeAPI
import retrofit2.Response

class FakePokeAPI : PokeAPI {

    var shouldReturnError: Boolean = false

    override suspend fun recoveryPokemons(): Response<ResultPokeAPIDTO> {
        if (shouldReturnError) {
            return Response.error(400, okhttp3.ResponseBody.create(null, "Erro simulado"))
        }

        val listaFakeDTO = listOf(
            Result(name = "bulbasaur", url = "url1"),
            Result(name = "charmander", url = "url2")
        )

        val respostaFake = ResultPokeAPIDTO(count = 2,
            next = null,
            previous = null,
            results = listaFakeDTO )

        return Response.success(respostaFake)
    }
}