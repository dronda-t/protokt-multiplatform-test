plugins {
    kotlin("multiplatform")
    id("com.toasttab.protokt") version "1.0.0-beta.0"
}

kotlin {
    jvmToolchain(17)
    jvm {
        withJava()
    }

    js(IR) {
        browser()
    }

    sourceSets {
        commonMain {}
    }

}
dependencies {
    protoktExtensions("com.toasttab.protokt:protokt-extensions-api:1.0.0-beta.0")
}

tasks.withType<JavaCompile> {
    enabled = false
}

tasks.named("allMetadataJar").get().dependsOn("extractProto")
tasks.named("jvmJar").get().dependsOn("extractProto")
tasks.named("jsJar").get().dependsOn("extractProto")
