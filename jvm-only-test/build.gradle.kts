
plugins {
    kotlin("jvm")
    id("com.toasttab.protokt") version "1.0.0-beta.0"
}

dependencies {
    implementation("com.google.protobuf:protobuf-java:3.24.4")
    protoktExtensions("com.toasttab.protokt:protokt-extensions-api:1.0.0-alpha.10")
}

tasks.withType<JavaCompile> {
    enabled = false
}
