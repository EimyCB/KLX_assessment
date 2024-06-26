
import net.rubygrapefruit.platform.internal.Platform
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.implementation(dependency: String) {
    add("implementation", dependency)
}

fun DependencyHandler.implementation(dependency: Dependency) {
    add("implementation", dependency)
}

fun DependencyHandler.implementation(dependency: Platform) {
    add("platform", dependency)
}

fun DependencyHandler.testImplementation(dependency: String) {
    add("testImplementation", dependency)
}

fun DependencyHandler.androidTestImplementation(library: String) {
    add("androidTestImplementation", library)
}

fun DependencyHandler.androidTestImplementation(library: Platform) {
    add("androidTestImplementationPlatform", library)
}


fun DependencyHandler.kapt(library: String) {
    add("kapt", library)
}
