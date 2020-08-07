package com.github.captainkant.myphpstormpersonal.services

import com.intellij.openapi.project.Project
import com.github.captainkant.myphpstormpersonal.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
