import org.jetbrains.compose.compose

plugins {
    kotlin("multiplatform")
    alias(libs.plugins.composeWasm)
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
        val jsWasmMain by creating {
            dependencies {
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.runtime)
                implementation(compose.ui)
            }
        }
        val jsMain by getting {
            dependsOn(jsWasmMain)
        }
    }
}

compose.experimental {
    web.application {}
}

compose {
    kotlinCompilerPlugin.set("1.4.0-dev-wasm08")
    kotlinCompilerPluginArgs.add("suppressKotlinVersionCompatibilityCheck=1.9.0-RC")
}