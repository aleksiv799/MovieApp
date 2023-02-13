
buildscript {

}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id (buildSrc.src.main.java.Config.pluginAndroidApp) version buildSrc.src.main.java.Versions.pluginAndroidVersion apply false
    id (buildSrc.src.main.java.Config.pluginAndroidLibrary) version (buildSrc.src.main.java.Versions.pluginAndroidLibraryVersion) apply false
    id (buildSrc.src.main.java.Config.pluginJetBrainsKotlin) version (buildSrc.src.main.java.Versions.pluginJetBrainsVersions) apply false
}