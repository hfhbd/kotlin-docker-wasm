plugins {
    kotlin("multiplatform") version "1.8.0-RC"
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
