dependencies {
    implementation(project(":domain"))

    kapt("io.micronaut:micronaut-http-validation")

    implementation("io.micronaut:micronaut-http-server-netty")
}