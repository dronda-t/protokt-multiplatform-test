plugins {
    kotlin("multiplatform") version "1.9.10" apply false
    kotlin("jvm") version "1.9.10" apply false
}

group = "org.example"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}

