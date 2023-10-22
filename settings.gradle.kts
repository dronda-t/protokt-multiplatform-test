pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "protokt"

include(
    "jvm-only-test",
    "multiplatform-test"
)