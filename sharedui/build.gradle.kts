plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
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