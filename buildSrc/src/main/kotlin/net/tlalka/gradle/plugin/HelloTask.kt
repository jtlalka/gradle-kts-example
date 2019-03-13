package net.tlalka.gradle.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class HelloTask : DefaultTask() {

    @TaskAction
    fun run() {
        val extension = project.extensions.run {
            findByName(HelloPlugin.PLUGIN_NAME) as HelloExtension
        }
        if (extension.enabled) {
            println(extension.message)
        }
    }
}