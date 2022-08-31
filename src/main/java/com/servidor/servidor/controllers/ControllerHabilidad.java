package com.servidor.servidor.controllers;

import com.servidor.servidor.models.Habilidad;
import com.servidor.servidor.services.IHabilidadService;
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
@CrossOrigin
public class ControllerHabilidad {

    @Autowired
    private IHabilidadService skillService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/skill")
    public void createSkill(@RequestBody Habilidad skill) {
        skillService.createSkill(skill);
    }

    @GetMapping("/list/skills")
    @ResponseBody
    public List<Habilidad> listskill() {
        return skillService.listSkill();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/find/skill/{id}")
    @ResponseBody
    public Habilidad findSkill(@PathVariable Long id) {
        return skillService.findSkill(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/skill")
    public void updateSkill(@RequestBody Habilidad skill) {
        skillService.updateSkill(skill);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/skill/{id}")
    public void deleteSkill(@PathVariable Long id) {
        skillService.deleteSkill(id);
    }

}
