package com.example.pokeapirecyclerview.data.di

import com.example.pokeapirecyclerview.core.util.Consts
import com.example.pokeapirecyclerview.data.remote.PokeAPI
import com.example.pokeapirecyclerview.data.repository.PokemonRepositoryImpl
import com.example.pokeapirecyclerview.domain.repository.PokemonRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

/**
 * This module lives in :data because it is the module responsible for
 * knowing HOW to talk to the network (Retrofit) and HOW to implement the
 * PokemonRepository contract declared in :domain. Nothing outside :data
 * needs to know these details.
 */
@Module
@InstallIn(ViewModelComponent::class)
object NetworkModule {

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Consts.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun providePokeAPI(
        retrofit: Retrofit
    ): PokeAPI {
        return retrofit.create(PokeAPI::class.java)
    }

    @Provides
    fun providePokemonRepository(
        pokeAPI: PokeAPI
    ): PokemonRepository {
        return PokemonRepositoryImpl(pokeAPI)
    }
}
