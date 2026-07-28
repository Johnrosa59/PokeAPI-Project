package com.example.pokeapirecyclerview.feature.pokemonlist

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.pokeapirecyclerview.feature.pokemonlist.databinding.ActivityMainBinding
import com.example.pokeapirecyclerview.feature.pokemonlist.viewmodel.PokemonViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val pokemonViewModel: PokemonViewModel by viewModels()
    private lateinit var pokemonAdapter: PokemonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupRecyclerView()
        observePokemonModel()
    }

    private fun setupRecyclerView() {
        pokemonAdapter = PokemonAdapter()

        binding.rvPokemon.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = pokemonAdapter
        }
    }

    private fun observePokemonModel() {
        pokemonViewModel.pokemon.observe(this) { pokemonList ->
            pokemonList?.let { list ->
                pokemonAdapter.updateList(list)
            }
        }
    }
}
