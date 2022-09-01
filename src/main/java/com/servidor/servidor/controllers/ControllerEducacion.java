package com.servidor.servidor.controllers;

import com.servidor.servidor.models.Educacion;
import com.servidor.servidor.services.IEducacionService;
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
public class ControllerEducacion {

    @Autowired
    private IEducacionService educationService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/education")
    public void createEducation(@RequestBody Educacion education) {
        educationService.createEducation(education);
    }

    @GetMapping("/list/educations")
    @ResponseBody
    public List<Educacion> listEducation() {
        return educationService.listEducation();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/find/education/{id}")
    @ResponseBody
    public Educacion findEducation(@PathVariable Long id) {
        return educationService.findEducation(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/education")
    public void updateEducation(@RequestBody Educacion education) {
        educationService.updateEducation(education);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/education/{id}")
    public void deleteEducation(@PathVariable Long id) {
        educationService.deleteEducation(id);
    }

}
