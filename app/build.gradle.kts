plugins {
    application
    id("com.github.ben-manes.versions") version "0.52.0"
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.12.0-M1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.apache.commons:commons-lang3:3.17.0")
}
application {
    mainClass.set("hexlet.code.App")
}

tasks.test {
    useJUnitPlatform()
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
