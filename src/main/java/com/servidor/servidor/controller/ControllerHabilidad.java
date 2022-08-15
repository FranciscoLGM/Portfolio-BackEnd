package com.servidor.servidor.controller;

import com.servidor.servidor.model.Habilidad;
import com.servidor.servidor.service.IHabilidadService;
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
public class ControllerHabilidad {

    @Autowired
    private IHabilidadService skillService;

    @PostMapping("/new/skill")
    public void createSkill(@RequestBody Habilidad skill) {
        skillService.createSkill(skill);
    }

    @GetMapping("/list/skills")
    @ResponseBody
    public List<Habilidad> listskill() {
        return skillService.listSkill();
    }

    @GetMapping("/find/skill/{id}")
    @ResponseBody
    public Habilidad findSkill(@PathVariable Long id) {
        return skillService.findSkill(id);
    }

    @PutMapping("/update/skill")
    public void updateSkill(@RequestBody Habilidad skill) {
        skillService.updateSkill(skill);
    }

    @DeleteMapping("/delete/skill/{id}")
    public void deleteSkill(@PathVariable Long id) {
        skillService.deleteSkill(id);
    }

}
