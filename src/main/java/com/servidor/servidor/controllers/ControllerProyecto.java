package com.servidor.servidor.controllers;

import com.servidor.servidor.models.Proyecto;
import com.servidor.servidor.services.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerProyecto {

    @Autowired
    private IProyectoService projectService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/project")
    public void createproject(@RequestBody Proyecto project) {
        projectService.createProject(project);
    }

    @GetMapping("/list/projects")
    @ResponseBody
    public List<Proyecto> listproject() {
        return projectService.listProject();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/find/project/{id}")
    @ResponseBody
    public Proyecto findProject(@PathVariable Long id) {
        return projectService.findProject(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/project")
    public void updateProject(@RequestBody Proyecto project) {
        projectService.updateProject(project);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/project/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
    }

}
