import net.tlalka.gradle.config.Config
import net.tlalka.gradle.plugin.HelloExtension
import net.tlalka.gradle.plugin.HelloPlugin

buildscript {
    repositories {
        jcenter()
        google()
        maven(Config.pluginsRepository)
    }

    dependencies {
        classpath(Config.Gradle.androidPlugin)
        classpath(Config.Gradle.kotlinPlugin)
        classpath(Config.Gradle.detektPlugin)
        classpath(Config.Gradle.dexcountPlugin)
        classpath(Config.Gradle.dokkaPlugin)
    }
}

allprojects {
    repositories {
        jcenter()
        google()
    }
}


apply<HelloPlugin>()

configure<HelloExtension> {
    message = "Hello GDG Kraków :)"
}

