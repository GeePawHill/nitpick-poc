rootProject.name = "nitpic-poc"
include("core", "compose", "cli")


dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
    }
}

