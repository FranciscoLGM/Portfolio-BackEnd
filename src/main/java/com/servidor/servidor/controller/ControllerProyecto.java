package com.servidor.servidor.controller;

import com.servidor.servidor.model.Proyecto;
import com.servidor.servidor.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerProyecto {

    @Autowired
    private IProyectoService projectService;

    @PostMapping("/new/project")
    public void createproject(@RequestBody Proyecto project) {
        projectService.createProject(project);
    }

    @GetMapping("/list/projects")
    @ResponseBody
    public List<Proyecto> listproject() {
        return projectService.listProject();
    }

    @GetMapping("/find/project/{id}")
    @ResponseBody
    public Proyecto findProject(@PathVariable Long id) {
        return projectService.findProject(id);
    }

    @PutMapping("/update/project")
    public void updateProject(@RequestBody Proyecto project) {
        projectService.updateProject(project);
    }

    @DeleteMapping("/delete/project/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
    }

}
