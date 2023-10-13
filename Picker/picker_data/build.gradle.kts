import modules.Picker

apply {
    from("$rootDir/base-module.gradle")
}
plugins {
    id("com.android.library")
}

android {
    namespace = Picker.dataNamespace
    buildTypes {
        release {
            isMinifyEnabled = true
        }
    }
}


dependencies {
    implementation(project(Picker.domain))
}