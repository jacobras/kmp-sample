rootProject.name = "KmpSample"

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
    }
    plugins {
        kotlin("multiplatform").version("1.8.10")
        id("org.jetbrains.kotlin.android") version "1.9.30-station-874"
        id("org.jetbrains.kotlin.jvm") version "1.8.10"
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

include(":android")
include(":desktop")
include(":domain")
include(":sharedui")
include(":web")