package com.example.pokeapirecyclerview.feature.pokemonlist.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokeapirecyclerview.domain.model.Pokemon
import com.example.pokeapirecyclerview.domain.usecase.GetPokemonUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val pokemonUseCase: GetPokemonUseCase
) : ViewModel() {

    private val _pokemon = MutableLiveData<List<Pokemon>>()

    val pokemon: LiveData<List<Pokemon>>
        get() = _pokemon

    init {
        recoveryPokemons()
    }

    fun recoveryPokemons() {
        viewModelScope.launch {
            val listPokemons = pokemonUseCase()
            _pokemon.postValue(listPokemons)
        }
    }
}
