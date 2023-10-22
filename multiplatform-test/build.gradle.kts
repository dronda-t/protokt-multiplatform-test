plugins {
    kotlin("multiplatform")
    id("com.toasttab.protokt") version "1.0.0-alpha.10"
}

kotlin {
    jvmToolchain(17)
    jvm {
        withJava()
    }

    js(IR) {
        browser()
    }

}

tasks.named("allMetadataJar").get().dependsOn("extractProto")
tasks.named("jvmJar").get().dependsOn("extractProto")
tasks.named("jsJar").get().dependsOn("extractProto")
