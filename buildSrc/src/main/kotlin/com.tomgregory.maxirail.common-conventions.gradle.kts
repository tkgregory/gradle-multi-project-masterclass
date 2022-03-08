plugins {
    java
}

repositories {
    mavenCentral()
}

testing {
    suites {
        named("test", JvmTestSuite::class) {
            useJUnitJupiter()
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}