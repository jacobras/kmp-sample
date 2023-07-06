plugins {
    kotlin("multiplatform")
    alias(libs.plugins.composeWasm)
}

kotlin {
    jvm()
    js(IR) { browser() }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.runtime)
                implementation(compose.ui)

                implementation(project(":domain"))
            }
        }
    }
}

compose {
    kotlinCompilerPlugin.set("1.4.0-dev-wasm08") // TODO: read
    kotlinCompilerPluginArgs.add("suppressKotlinVersionCompatibilityCheck=1.9.0-RC") // TODO: read
}