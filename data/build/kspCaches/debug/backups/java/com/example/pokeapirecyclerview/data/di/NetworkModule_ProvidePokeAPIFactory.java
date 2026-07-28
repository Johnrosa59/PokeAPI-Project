package com.example.pokeapirecyclerview.data.di;

import com.example.pokeapirecyclerview.data.remote.PokeAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import retrofit2.Retrofit;

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
public final class NetworkModule_ProvidePokeAPIFactory implements Factory<PokeAPI> {
  private final Provider<Retrofit> retrofitProvider;

  private NetworkModule_ProvidePokeAPIFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PokeAPI get() {
    return providePokeAPI(retrofitProvider.get());
  }

  public static NetworkModule_ProvidePokeAPIFactory create(Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvidePokeAPIFactory(retrofitProvider);
  }

  public static PokeAPI providePokeAPI(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providePokeAPI(retrofit));
  }
}
