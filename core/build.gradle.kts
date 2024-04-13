plugins {
    kotlin("jvm")
    java
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
    testImplementation("org.assertj:assertj-core:3.24.2")
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

group = "org.geepawhill.nitpick-poc"
version = "0.0.1"

kotlin {
    jvmToolchain(17)
}
