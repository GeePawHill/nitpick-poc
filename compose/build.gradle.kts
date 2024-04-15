import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("jvm")
    id("org.jetbrains.compose") version "1.6.1"
    id("dev.hydraulic.conveyor") version "1.5"
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-swing:1.8.0")
    implementation("br.com.devsrsouza.compose.icons:font-awesome:1.1.0")
    implementation(project(":core"))
}

kotlin {
    jvmToolchain(17)
}

compose.desktop {
    application {
        mainClass = "org.geepawhill.compose.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "nitpick-poc"
            packageVersion = "1.0.1"
        }
    }
}