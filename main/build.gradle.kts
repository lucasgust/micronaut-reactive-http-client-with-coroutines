import io.micronaut.gradle.MicronautRuntime.NETTY
import io.micronaut.gradle.MicronautTestRuntime.KOTEST_5

val kotestRunnerVersion: String by project
val mockkVersion: String by project
val instancioVersion: String by project
val assertjVersion: String by project

plugins {
    // https://plugins.gradle.org/plugin/io.micronaut.application
    val micronautVersion = "4.1.1"
    // https://plugins.gradle.org/plugin/com.github.johnrengelman.shadow
    val shadowVersion = "8.1.1"

    application
    id("io.micronaut.application") version micronautVersion
    id("com.github.johnrengelman.shadow") version shadowVersion
}

application {
    mainClass.set("example.micronaut.ApplicationKt")

    applicationDefaultJvmArgs = listOf(
        "-server",
        "-XX:+UseNUMA",
        "-XX:+UseParallelGC"
    )
}

graalvmNative {
    toolchainDetection.set(true)
}

micronaut {
    runtime(NETTY)
    testRuntime(KOTEST_5)

    processing {
        incremental(true)
        annotations("example.micronaut.*")
    }
}

tasks {
    shadowJar {
        archiveBaseName.set("app")
        archiveVersion.set("")
        archiveAppendix.set("")
        archiveClassifier.set("")
    }
}

dependencies {
    listOf(
        ":domain",
        // DRIVEN
        ":github",
        // DRIVER
        ":http",
    ).forEach {
        implementation(project(it))
    }
}