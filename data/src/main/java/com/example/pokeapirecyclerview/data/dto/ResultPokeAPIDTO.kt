package com.example.pokeapirecyclerview.data.dto

data class ResultPokeAPIDTO(
    val count: Int,
    val next: String?,
    val previous: Any?,
    val results: List<Result>
)