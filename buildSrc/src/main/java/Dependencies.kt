import org.gradle.api.artifacts.dsl.RepositoryHandler

private object Versions {
    const val androidx_appcompat = "1.0.2"
    const val androidx_constraintlayout = "1.1.3"
    const val androidx_ktx = "1.0.1"
    const val kotlin = "1.3.21"

    object Build {
        const val android_gradle_plugin = "3.5.0-alpha07"
        const val kotlin_gradle_plugin = Versions.kotlin
    }

    object Test {
        const val junit = "4.12"
    }

    object AndroidTest {
        const val androidx_junit = "1.1.0" // androidx.test.ext:junit
        const val espresso = "3.1.1"
    }
}

@Suppress("unused")
object Deps {
    const val androidx_appcompat = "androidx.appcompat:appcompat:${Versions.androidx_appcompat}"
    const val androidx_constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.androidx_constraintlayout}"
    const val androidx_ktx = "androidx.core:core-ktx:${Versions.androidx_ktx}"
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    object Build {
        const val gradle_android = "com.android.tools.build:gradle:${Versions.Build.android_gradle_plugin}"
        const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Build.kotlin_gradle_plugin}"
    }

    object Test {
        const val junit = "junit:junit:${Versions.Test.junit}"
    }

    object AndroidTest {
        const val androidx_junit = "androidx.test.ext:junit:${Versions.AndroidTest.androidx_junit}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.AndroidTest.espresso}"
    }

    /**
     * Apply common repos for the `buildscript` block.
     *
     * To use, add the following to a module's `build.gradle`:
     *
     * ```
     * buildscript {
     *     Deps.applyBuildRepos(repositories)
     * }
     * ```
     */
    fun applyBuildRepos(handler: RepositoryHandler) {
        handler.google()
        handler.mavenCentral()
        handler.jcenter() // last to resolve, for security: https://twitter.com/jakewharton/status/1073102730443526144
    }

    /**
     * Apply common repos for a project's `dependencies` block.
     *
     * To use, add the following to a module's `build.gradle`:
     *
     * ```
     * Deps.applyProjectRepos(repositories)
     * ```
     */
    fun applyProjectRepos(handler: RepositoryHandler) {
        handler.google()
        handler.mavenCentral()
        handler.jcenter() // last to resolve, for security: https://twitter.com/jakewharton/status/1073102730443526144
    }
}