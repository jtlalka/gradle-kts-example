package net.tlalka.gradle.plugin

import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

fun Project.hello(configure: HelloExtension.() -> Unit): Unit = configure(configure)
