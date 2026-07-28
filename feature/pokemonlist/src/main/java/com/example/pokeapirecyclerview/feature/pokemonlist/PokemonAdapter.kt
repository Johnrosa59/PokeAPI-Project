package com.example.pokeapirecyclerview.feature.pokemonlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokeapirecyclerview.feature.pokemonlist.databinding.ItemPokemonBinding
import com.example.pokeapirecyclerview.domain.model.Pokemon

class PokemonAdapter(
    private var pokemonList: List<Pokemon> = emptyList()
) : RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    inner class PokemonViewHolder(
        private val binding: ItemPokemonBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(pokemon: Pokemon) {

            binding.textView4.text = pokemon.nameOfPokemon

            Glide.with(binding.root.context)
                .load(pokemon.urlImageOfPokemon)
                .into(binding.imgPokemon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val binding = ItemPokemonBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PokemonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.bind(pokemonList[position])
    }

    override fun getItemCount(): Int = pokemonList.size

    fun updateList(newList: List<Pokemon>) {
        this.pokemonList = newList
        notifyDataSetChanged()
    }
}
