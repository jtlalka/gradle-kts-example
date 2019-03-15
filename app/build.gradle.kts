import net.tlalka.gradle.config.Config

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

apply {
    from("$rootDir/gradle/plugin/detekt.gradle")
    from("$rootDir/gradle/plugin/dexcount.gradle")
    from("$rootDir/gradle/plugin/dokka.gradle")
}

android {
    compileSdkVersion(Config.Android.compileSdkVersion)
    buildToolsVersion(Config.Android.buildToolsVersion)

    defaultConfig {
        minSdkVersion(Config.Android.minSdkVersion)
        targetSdkVersion(Config.Android.targetSdkVersion)

        applicationId = "net.tlalka.kts.example"
        versionName = Config.Android.versionName
        versionCode = Config.Android.versionCode
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFile("proguard-rules.pro")
        }
    }

    sourceSets {
        getByName("main").java.srcDir("src/main/kotlin")
        getByName("test").java.srcDir("src/test/kotlin")
        getByName("androidTest").java.srcDir("src/androidTest/kotlin")
    }

    lintOptions {
        ignore("GoogleAppIndexingWarning")
    }
}

dependencies {
    implementation(Config.Libs.kotlinSdk)
    implementation(Config.Libs.androidCore)
    implementation(Config.Libs.androidAppCompat)
    implementation(Config.Libs.androidConstraintLayout)
    implementation(Config.Libs.androidMaterialDesign)

    debugImplementation(Config.Libs.leakcanaryCore)
    debugImplementation(Config.Libs.leakcanaryFragment)
    releaseImplementation(Config.Libs.leakcanaryNoOp)

    testImplementation(Config.UnitTest.junit)
    testImplementation(Config.UnitTest.mockito)

    androidTestImplementation(Config.UiTest.androidRules)
    androidTestImplementation(Config.UiTest.androidRunner)
    androidTestImplementation(Config.UiTest.androidEspresso)
}
