plugins {
    kotlin("multiplatform") version "1.8.0-Beta"
}

repositories {
    mavenCentral()
}

kotlin {
    wasm {
        binaries.executable()
        nodejs()
        d8()
    }
}
