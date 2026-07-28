package com.example.pokeapirecyclerview.data.remote

import com.example.pokeapirecyclerview.data.dto.ResultPokeAPIDTO
import retrofit2.Response
import retrofit2.http.GET

interface PokeAPI {

    @GET("pokemon?limit=151&offset=0")
    suspend fun recuperarUsuarios() : Response<ResultPokeAPIDTO>

}