import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
    id("org.jetbrains.dokka") version "1.5.31"

    `java-library`
    `maven-publish`
}

group = "de.openenwi.bo4e"
version = "1.2.2"

repositories {
    mavenCentral()
}

dependencies {
    dokkaHtmlPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:1.5.31")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.5.31")
}

java {
    withJavadocJar()
    withSourcesJar()
}


publishing {
    publications {
        create<MavenPublication>("library") {
            from(components["kotlin"])
        }
    }
    repositories {
/*        maven {
            name = "lokal"
            url = uri("${buildDir}/publishing-repository")
        }*/
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/openenwi/ktBO4E-lib")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}
