package io.getstream.log

object Configuration {
    const val compileSdk = 33
    const val targetSdk = 32
    const val sampleTargetSdk = 33
    const val minSdk = 21
    const val majorVersion = 1
    const val minorVersion = 0
    const val patchVersion = 0
    const val versionName = "$majorVersion.$minorVersion.$patchVersion"
    const val snapshotVersionName = "$majorVersion.$minorVersion.${patchVersion + 1}-SNAPSHOT"
    const val artifactGroup = "io.getstream"
}