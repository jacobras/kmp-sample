rootProject.name = "KmpSample"

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    plugins {
        kotlin("multiplatform").version("1.8.10")
        id("org.jetbrains.compose").version("1.4.0")
        id("com.android.library").version("7.4.2")
        id("com.android.application") version "7.4.2"
        id("org.jetbrains.kotlin.android") version "1.8.10"
        id("org.jetbrains.kotlin.jvm") version "1.8.10"
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            library("kotlinx-coroutines-core", "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
            library("touchlab-kermit", "co.touchlab:kermit:1.2.2")
            library("ktor-client-core", "io.ktor:ktor-client-core:2.2.4")
        }
    }
}

include(":android")
include(":desktop")
include(":domain")
include(":sharedui")
include(":web")