plugins {
    kotlin("multiplatform")
    id("com.android.application")
    id("org.jetbrains.compose")
}

kotlin {
    androidTarget()
    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation(project(":domain"))
                implementation(project(":sharedui"))
            }
        }
    }
}

android {
    namespace = "nl.jacobras.kmpsample"
    compileSdk = 33
    defaultConfig {
        applicationId = "nl.jacobras.kmpsample"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        compose = true
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.android.ktx)
    implementation(libs.activity.compose)
    implementation(libs.lifecycle.runtime.ktx)

    implementation(compose.ui)
//    implementation(compose.ui.graphics)
    implementation(compose.uiTooling)
    implementation(compose.material3)
    debugImplementation(compose.preview)
    debugImplementation(compose.uiTooling)
}

compose {
    kotlinCompilerPlugin.set("1.4.0") // TODO: read
    kotlinCompilerPluginArgs.add("suppressKotlinVersionCompatibilityCheck=1.9.0-RC") // TODO: read
}