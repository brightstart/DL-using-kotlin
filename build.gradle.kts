plugins {
    kotlin("jvm") version "1.8.21"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    dependencies {
        implementation("org.slf4j:slf4j-api:1.7.26")
        implementation("org.slf4j:slf4j-simple:1.7.26")
        implementation("org.jetbrains.kotlinx:kotlin-deeplearning-api:0.2.0")
    }
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}