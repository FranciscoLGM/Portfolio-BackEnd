package com.servidor.servidor.controllers;

import com.servidor.servidor.models.Experiencia;
import com.servidor.servidor.services.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ControllerExperiencia {

    @Autowired
    private IExperienciaService expertiseService;

    @PostMapping("/new/expertise")
    public void createExpertise(@RequestBody Experiencia expertise) {
        expertiseService.createExpertise(expertise);
    }

    @GetMapping("/list/expertises")
    @ResponseBody
    public List<Experiencia> listExpertise() {
        return expertiseService.listExpertise();
    }

    @GetMapping("find/expertise/{id}")
    @ResponseBody
    public Experiencia findExpertise(@PathVariable Long id) {
        return expertiseService.findExpertise(id);
    }

    @PutMapping("/update/expertise")
    public void updateExpertise(@RequestBody Experiencia expertise) {
        expertiseService.updateExpertise(expertise);
    }

    @DeleteMapping("/delete/expertise/{id}")
    public void deleteExpertise(@PathVariable Long id) {
        expertiseService.deleteExpertise(id);
    }

}
