import modules.Picker

apply {
    from("$rootDir/compose-base-module.gradle")
}
plugins {
    id("com.android.library")
}

android {
    namespace = Picker.presentationNamespace
    buildTypes {
        release {
            isMinifyEnabled = true
        }
    }
}

dependencies {
    implementation(libs.coil)
    implementation(libs.androidx.compose.material.icons.extended)
}