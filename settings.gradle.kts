rootProject.name = "jvm-benchmark"

include("fibonacci", "jmh-benchmark")

pluginManagement {
    repositories {
        jcenter()
        gradlePluginPortal()
    }
}
