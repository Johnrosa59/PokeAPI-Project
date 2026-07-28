package com.example.pokeapirecyclerview.data.di;

import com.example.pokeapirecyclerview.data.remote.PokeAPI;
import com.example.pokeapirecyclerview.domain.repository.PokemonRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class NetworkModule_ProvidePokemonRepositoryFactory implements Factory<PokemonRepository> {
  private final Provider<PokeAPI> pokeAPIProvider;

  private NetworkModule_ProvidePokemonRepositoryFactory(Provider<PokeAPI> pokeAPIProvider) {
    this.pokeAPIProvider = pokeAPIProvider;
  }

  @Override
  public PokemonRepository get() {
    return providePokemonRepository(pokeAPIProvider.get());
  }

  public static NetworkModule_ProvidePokemonRepositoryFactory create(
      Provider<PokeAPI> pokeAPIProvider) {
    return new NetworkModule_ProvidePokemonRepositoryFactory(pokeAPIProvider);
  }

  public static PokemonRepository providePokemonRepository(PokeAPI pokeAPI) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providePokemonRepository(pokeAPI));
  }
}
