import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    idea
    id("org.springframework.boot") version "2.7.1"
    id("io.spring.dependency-management") version "1.1.0"
    id("com.google.devtools.ksp") version "1.8.21-1.0.11"

    kotlin("jvm") version "1.8.21"
    kotlin("plugin.spring") version "1.8.21"
}

group = "com.example"
version = "1.0.0"
java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    platform("org.komapper:komapper-platform:1.10.0").let {
        implementation(it)
        ksp(it)
    }
    ksp("org.komapper:komapper-processor")

    implementation("org.komapper:komapper-spring-boot-autoconfigure-r2dbc:1.1.2")
    implementation("org.komapper:komapper-spring-boot-starter-r2dbc:1.1.2")

    implementation("org.modelmapper:modelmapper:3.1.0")
    implementation("org.komapper:komapper-dialect-mysql-r2dbc:1.1.2")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
