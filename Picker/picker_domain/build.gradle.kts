import modules.Picker

apply {
    from("$rootDir/base-module.gradle")
}
plugins {
    id("com.android.library")
}

android {
    namespace = Picker.domainNamespace
    buildTypes {
        release {
            isMinifyEnabled = true
        }
    }
}