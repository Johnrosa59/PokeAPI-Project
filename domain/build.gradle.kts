plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.example.pokeapirecyclerview.domain"
    compileSdk {
        version = release(37) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        minSdk = 24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    // Only javax.inject, NOT the full Hilt library. :domain should not know
    // that Hilt/Dagger even exists -- it just marks a constructor as
    // "injectable" using the plain JSR-330 annotation.
    implementation("javax.inject:javax.inject:1")

    testImplementation(libs.junit)
}
