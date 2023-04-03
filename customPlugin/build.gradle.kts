plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("com.gradle.plugin-publish") version "1.1.0"
}

group = "com.devexperto"
version = "1.0"

pluginBundle {
    website = "https://devexperto.com"
    vcsUrl = "https://github.com/devexperto/gradle-training"
    tags = listOf("gradle", "plugin", "android", "kotlin")
}

gradlePlugin {

    plugins {
        create("custom-plugin") {
            id = "com.devexperto.customplugin"
            implementationClass = "com.devexperto.customplugin.CustomPlugin"
            displayName = "Custom-Plugin"
            description = "A plugin that does nothing and serves no purpose"
        }
    }

}

publishing {
    repositories {
        maven {
            name = "localPluginRepository"
            url = uri("../local-plugin-repository")
        }
    }
}