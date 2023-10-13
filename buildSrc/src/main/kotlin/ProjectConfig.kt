import org.gradle.api.JavaVersion

object ProjectConfig {
    const val compileSdk = 34
    const val applicationId = "m.derakhshan.imagepicker"
    const val minSdk = 26
    const val targetSdk = 34
    const val versionCode = 1
    const val versionName = "1.0"
    const val jvmTarget = "1.8"
    const val kotlinCompilerExtensionVersion = "1.5.3"
    val sourceCompatibility = JavaVersion.VERSION_1_8
    val targetCompatibility = JavaVersion.VERSION_1_8
}