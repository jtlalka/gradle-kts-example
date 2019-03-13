package net.tlalka.gradle.config

/**
 * Gradle project configuration.
 */
object Config {

    //plugins:
    const val androidGradleVersion = "3.3.0"
    const val kotlinVersion = "1.3.21"
    const val detektVersion = "1.0.0.RC8"
    const val dexcountVersion = "0.8.6"
    const val dokkaVersion = "0.9.17"

    //artifacts:
    const val androidCodeVersion = "1.1.0-alpha04"
    const val androidAppCompatVersion = "1.1.0-alpha02"
    const val constraintLayoutVersion = "1.1.3"
    const val materialDesignVersion = "1.1.0-alpha03"
    const val leakcanaryVersion = "1.6.3"
    const val junitVersion = "4.12"
    const val mockitoVersion = "2.0.0"
    const val androidRulesVersion = "1.1.2-alpha01"
    const val androidEspressoVersion = "3.1.2-alpha01"

    //repos:
    const val pluginsRepository = "https://plugins.gradle.org/m2/"

    /**
     * Gradle build plugins.
     */
    object Gradle {
        const val androidPlugin = "com.android.tools.build:gradle:$androidGradleVersion"
        const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        const val detektPlugin = "gradle.plugin.io.gitlab.arturbosch.detekt:detekt-gradle-plugin:$detektVersion"
        const val dexcountPlugin = "com.getkeepsafe.dexcount:dexcount-gradle-plugin:$dexcountVersion"
        const val dokkaPlugin = "org.jetbrains.dokka:dokka-gradle-plugin:$dokkaVersion"
    }

    /**
     * Android configuration.
     */
    object Android {
        const val buildToolsVersion = "28.0.3"
        const val minSdkVersion = 21
        const val targetSdkVersion = 28
        const val compileSdkVersion = 28
        const val versionName = "0.1.0"
        const val versionCode = 1
    }

    /**
     * Compile.
     */
    object Libs {
        const val kotlinSdk = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
        const val androidCore = "androidx.core:core-ktx:$androidCodeVersion"
        const val androidAppCompat = "androidx.appcompat:appcompat:$androidAppCompatVersion"
        const val androidConstraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
        const val androidMaterialDesign = "com.google.android.material:material:$materialDesignVersion"
        const val leakcanaryCore = "com.squareup.leakcanary:leakcanary-android:$leakcanaryVersion"
        const val leakcanaryNoOp = "com.squareup.leakcanary:leakcanary-android-no-op:$leakcanaryVersion"
        const val leakcanaryFragment = "com.squareup.leakcanary:leakcanary-support-fragment:$leakcanaryVersion"
    }

    /**
     * Unit test.
     */
    object UnitTest {
        const val junit = "junit:junit:$junitVersion"
        const val mockito = "com.nhaarman.mockitokotlin2:mockito-kotlin:$mockitoVersion"
    }

    /**
     * UI test.
     */
    object UiTest {
        const val androidRules = "androidx.test:rules:$androidRulesVersion"
        const val androidRunner = "androidx.test:runner:$androidRulesVersion"
        const val androidEspresso = "androidx.test.espresso:espresso-core:$androidEspressoVersion"
    }
}
