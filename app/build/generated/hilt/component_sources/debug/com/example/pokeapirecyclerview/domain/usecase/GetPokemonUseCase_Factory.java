package com.example.pokeapirecyclerview.domain.usecase;

import com.example.pokeapirecyclerview.domain.repository.PokemonRepository;
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
public final class GetPokemonUseCase_Factory implements Factory<GetPokemonUseCase> {
  private final Provider<PokemonRepository> pokemonRepositoryProvider;

  private GetPokemonUseCase_Factory(Provider<PokemonRepository> pokemonRepositoryProvider) {
    this.pokemonRepositoryProvider = pokemonRepositoryProvider;
  }

  @Override
  public GetPokemonUseCase get() {
    return newInstance(pokemonRepositoryProvider.get());
  }

  public static GetPokemonUseCase_Factory create(
      Provider<PokemonRepository> pokemonRepositoryProvider) {
    return new GetPokemonUseCase_Factory(pokemonRepositoryProvider);
  }

  public static GetPokemonUseCase newInstance(PokemonRepository pokemonRepository) {
    return new GetPokemonUseCase(pokemonRepository);
  }
}
