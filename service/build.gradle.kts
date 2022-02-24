plugins {
    `java-library`
    id("com.tomgregory.maxirail.common-conventions")
}

dependencies {
    api(project(":model"))
    implementation(libs.spring.boot.starter)
}
