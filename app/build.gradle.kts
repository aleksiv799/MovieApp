import buildSrc.src.main.java.Config
import buildSrc.src.main.java.Deps

plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("kotlin-parcelize")
}

android {
    namespace  = Config.applicationId
    compileSdk = Config.compileSdk

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = Config.isMinifyEnabled
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Config.jvmTarget
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Config.kotlinCompilerExtensionVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Deps.coreKTX)
    implementation (Deps.lifeCycle)
    implementation (Deps.ComposeActivity)
    implementation (Deps.ComposeUI)
    implementation (Deps.ComposeUIToolingPreview)
    implementation (Deps.ComposeMaterial)
    testImplementation (Deps.jUnit)
    androidTestImplementation (Deps.testJunitExt)
    androidTestImplementation (Deps.espressoCore)
    androidTestImplementation (Deps.composeJunitUITest)
    debugImplementation (Deps.composeToolingDebugUI)
    debugImplementation (Deps.composeTestManifestUI)
    implementation (Deps.viewModelCompose)
    implementation (Deps.navigationCompose)
    implementation (Deps.glideCompose)
    implementation (Deps.timber)

}