plugins {
    kotlin("jvm")
    java
    id("dev.hydraulic.conveyor") version "1.5"
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
    testImplementation("org.assertj:assertj-core:3.24.2")
}

kotlin {
    jvmToolchain(17)
}
