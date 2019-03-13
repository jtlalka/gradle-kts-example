package net.tlalka.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.extensions.run {
            create(PLUGIN_NAME, HelloExtension::class.java)
        }
        project.tasks.create(PLUGIN_NAME, HelloTask::class.java)
    }

    companion object {

        const val PLUGIN_NAME = "hello"
    }
}
