plugins {
    java
    id("org.springframework.boot") version "2.6.3"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":service"))
    implementation("org.springframework.boot:spring-boot-starter-web:2.6.3")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.6.3")
}

tasks.test {
    useJUnitPlatform()
}