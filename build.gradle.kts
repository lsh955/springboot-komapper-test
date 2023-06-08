import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    idea
    id("org.springframework.boot") version "2.7.1"
    id("io.spring.dependency-management") version "1.1.0"
    id("com.google.devtools.ksp") version "1.6.21-1.0.5"

    kotlin("jvm") version "1.8.21"
    kotlin("plugin.spring") version "1.8.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

idea {
    module {
        sourceDirs = sourceDirs + file("build/generated/ksp/main/kotlin")
        testSourceDirs = testSourceDirs + file("build/generated/ksp/test/kotlin")
        generatedSourceDirs =
            generatedSourceDirs + file("build/generated/ksp/main/kotlin") + file("build/generated/ksp/test/kotlin")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    platform("org.komapper:komapper-platform:1.10.0").let {
        implementation(it)
        ksp(it)
    }
    ksp("org.komapper:komapper-processor")

    implementation("org.komapper:komapper-starter-jdbc")
    implementation("org.komapper:komapper-dialect-h2-jdbc")

    implementation("org.komapper:komapper-dialect-mysql-r2dbc:1.1.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
