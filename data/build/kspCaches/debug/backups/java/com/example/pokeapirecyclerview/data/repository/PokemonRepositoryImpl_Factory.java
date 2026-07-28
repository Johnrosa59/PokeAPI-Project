package com.example.pokeapirecyclerview.data.repository;

import com.example.pokeapirecyclerview.data.remote.PokeAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class PokemonRepositoryImpl_Factory implements Factory<PokemonRepositoryImpl> {
  private final Provider<PokeAPI> pokeAPIProvider;

  private PokemonRepositoryImpl_Factory(Provider<PokeAPI> pokeAPIProvider) {
    this.pokeAPIProvider = pokeAPIProvider;
  }

  @Override
  public PokemonRepositoryImpl get() {
    return newInstance(pokeAPIProvider.get());
  }

  public static PokemonRepositoryImpl_Factory create(Provider<PokeAPI> pokeAPIProvider) {
    return new PokemonRepositoryImpl_Factory(pokeAPIProvider);
  }

  public static PokemonRepositoryImpl newInstance(PokeAPI pokeAPI) {
    return new PokemonRepositoryImpl(pokeAPI);
  }
}
