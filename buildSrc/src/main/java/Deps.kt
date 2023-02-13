package buildSrc.src.main.java

object Deps {

    // Core

    const val coreKTX = "androidx.core:core-ktx:${Versions.coreVersion}"
    const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.stdLibVersion}"


    // Compose dependencies

    const val ComposeUI = "androidx.compose.ui:ui:${Versions.composeVersion}"
    const val ComposeActivity = "androidx.activity:activity-compose:${Versions.composeVersion}"
    const val ComposeUIToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"
    const val ComposeMaterial = "androidx.compose.material:material:${Versions.composeVersion}"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.viewModelComposeVersion}"
    const val navigationCompose = "androidx.navigation:navigation-compose:${Versions.navigationComposeVersion}"
    const val glideCompose = "com.github.bumptech.glide:compose:${Versions.glideComposeVersion}"

    // Test dependencies
    const val jUnit = "junit:junit:${Versions.junitVersion}"
    const val  jUnitX = "androidx.test.ext:junit:${Versions.junitXVersion}"
    const val espressoCore =  "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}"
    const val composeJunitUITest = "androidx.compose.ui:ui-test-junit4:${Versions.composeJunitUIVersion}"
    const val composeToolingDebugUI = "androidx.compose.ui:ui-tooling:${Versions.composeToolingDebugUIVersion}"
    const val composeTestManifestUI = "androidx.compose.ui:ui-test-manifest:${Versions.composeTestManifestUIVersion}"
    const val testJunitExt = "androidx.test.ext:junit:${Versions.testJunitExt}"

    // Navigation
    const val lifeCycle =  "androidx.lifecycle:lifecycle-extensions:${Versions.lifeCycleVersion}"

    // Logging
    const val timber =  "com.jakewharton.timber:timber:${Versions.timberVersion}"
}