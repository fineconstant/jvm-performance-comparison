plugins {
    id("me.champeau.gradle.jmh") version "0.5.2"
}

dependencies {
    implementation(project(":fibonacci"))
}

jmh {
    duplicateClassesStrategy = DuplicatesStrategy.INCLUDE
}


