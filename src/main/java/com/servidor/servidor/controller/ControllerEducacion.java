package com.servidor.servidor.controller;

import com.servidor.servidor.model.Educacion;
import com.servidor.servidor.service.IEducacionService;
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
public class ControllerEducacion {

    @Autowired
    private IEducacionService educationService;

    @PostMapping("/new/education")
    public void createEducation(@RequestBody Educacion education) {
        educationService.createEducation(education);
    }

    @GetMapping("/list/educations")
    @ResponseBody
    public List<Educacion> listEducation() {
        return educationService.listEducation();
    }

    @GetMapping("/find/education/{id}")
    @ResponseBody
    public Educacion findEducation(@PathVariable Long id) {
        return educationService.findEducation(id);
    }

    @PutMapping("/update/education")
    public void updateEducation(@RequestBody Educacion education) {
        educationService.updateEducation(education);
    }

    @DeleteMapping("/delete/education/{id}")
    public void deleteEducation(@PathVariable Long id) {
        educationService.deleteEducation(id);
    }

}
