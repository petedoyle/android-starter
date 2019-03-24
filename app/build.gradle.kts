val kotlinVersion = "1.3.21"

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "dev.petedoyle.starter"
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Deps.androidx_appcompat)
    implementation(Deps.androidx_constraintlayout)
    implementation(Deps.androidx_ktx)
    implementation(Deps.kotlin_stdlib)

    testImplementation(Deps.Test.junit)

    androidTestImplementation(Deps.AndroidTest.androidx_junit)
    androidTestImplementation(Deps.AndroidTest.espresso)
}
