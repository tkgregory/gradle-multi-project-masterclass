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

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter()
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}