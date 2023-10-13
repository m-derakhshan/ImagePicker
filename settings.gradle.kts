pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ImagePicker"
include(":app")
include(":Picker")
include(":Picker:picker_presentation")
include(":Picker:picker_data")
include(":Picker:picker_domain")
