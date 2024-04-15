plugins {
    kotlin("jvm")
    java
    application
}

dependencies {
    implementation(project(":core"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
    testImplementation("org.assertj:assertj-core:3.24.2")

}

application {
    mainClass.set("org.geepawhill.cli.MainKt")
}

kotlin {
    jvmToolchain(17)
}