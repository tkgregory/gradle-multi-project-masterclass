plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(":model"))
    implementation("org.springframework.boot:spring-boot-starter:2.6.3")
}