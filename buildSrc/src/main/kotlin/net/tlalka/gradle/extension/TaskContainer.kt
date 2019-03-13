package net.tlalka.gradle.extension

import org.gradle.api.Action
import org.gradle.api.Task
import org.gradle.api.tasks.TaskContainer

fun TaskContainer.clean(configureAction: Action<in Task>) =
    this.getByName("net.tlalka.gradle.extension.clean", configureAction)

fun TaskContainer.check(configureAction: Action<in Task>) =
    this.getByName("check", configureAction)

fun TaskContainer.build(configureAction: Action<in Task>) =
    this.getByName("build", configureAction)

fun TaskContainer.test(configureAction: Action<in Task>) =
    this.getByName("net.tlalka.gradle.extension.test", configureAction)

fun TaskContainer.assemble(configureAction: Action<in Task>) =
    this.getByName("net.tlalka.gradle.extension.assemble", configureAction)
