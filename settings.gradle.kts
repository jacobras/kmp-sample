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
        val kotlinVersion = "1.9.0-RC"
        val composeVersion = "1.4.0-dev-wasm08" // TODO: read

        kotlin("multiplatform").version(kotlinVersion)
        id("org.jetbrains.kotlin.android").version(kotlinVersion)
        id("org.jetbrains.kotlin.jvm").version(kotlinVersion)
        id("org.jetbrains.compose").version(composeVersion)
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