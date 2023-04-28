import org.jetbrains.compose.compose

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

group = "nl.jacobras.kmpsample"
version = "1.0-SNAPSHOT"

kotlin {
    js(IR) {
        browser {
            testTask {
                testLogging.showStandardStreams = true
                useKarma {
                    useChromeHeadless()
                    useFirefox()
                }
            }
        }
        binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.runtime)
                implementation(compose.ui)

                implementation(libs.touchlab.kermit)

                implementation(project(":domain"))
                implementation(project(":sharedui"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}

compose.experimental {
    web.application {}
}