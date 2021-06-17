package com.github.andrewedstrom.pico8intellijplugin.services

import com.github.andrewedstrom.pico8intellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
