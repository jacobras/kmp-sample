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