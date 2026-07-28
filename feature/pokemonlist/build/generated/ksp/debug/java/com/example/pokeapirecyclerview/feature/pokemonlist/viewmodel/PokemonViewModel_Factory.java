package com.example.pokeapirecyclerview.feature.pokemonlist.viewmodel;

import com.example.pokeapirecyclerview.domain.usecase.GetPokemonUseCase;
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
public final class PokemonViewModel_Factory implements Factory<PokemonViewModel> {
  private final Provider<GetPokemonUseCase> pokemonUseCaseProvider;

  private PokemonViewModel_Factory(Provider<GetPokemonUseCase> pokemonUseCaseProvider) {
    this.pokemonUseCaseProvider = pokemonUseCaseProvider;
  }

  @Override
  public PokemonViewModel get() {
    return newInstance(pokemonUseCaseProvider.get());
  }

  public static PokemonViewModel_Factory create(
      Provider<GetPokemonUseCase> pokemonUseCaseProvider) {
    return new PokemonViewModel_Factory(pokemonUseCaseProvider);
  }

  public static PokemonViewModel newInstance(GetPokemonUseCase pokemonUseCase) {
    return new PokemonViewModel(pokemonUseCase);
  }
}
