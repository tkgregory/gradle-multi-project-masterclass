plugins {
    alias(libs.plugins.spring.boot)
    id("com.tomgregory.maxirail.common-conventions")
}

dependencies {
    implementation(project(":service"))
    implementation(libs.spring.boot.web)
    testImplementation(libs.spring.boot.test)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}