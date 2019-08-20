plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
}

ext["kitDescription"] = "Media Api to supplement core SDK"

apply(from= "../scripts/maven.gradle")

android {
    defaultConfig {
        compileSdkVersion(28)
    }
}

repositories {
    jcenter()
    mavenLocal()
    google()
}


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-common")
    implementation("com.mparticle:android-core:5.10.2")

    testImplementation("junit:junit:4.12")
}