package com.servidor.servidor.controllers;

import com.servidor.servidor.models.Persona;
import com.servidor.servidor.services.IPersonaService;
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
public class ControllerPersona {

    @Autowired
    private IPersonaService personService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/person")
    public void createPerson(@RequestBody Persona person) {
        personService.createPerson(person);
    }

    @GetMapping("/list/persons")
    @ResponseBody
    public List<Persona> listPerson() {
        return personService.listPerson();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("find/person/{id}")
    @ResponseBody
    public Persona findPerson(@PathVariable Long id) {
        return personService.findPerson(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/person")
    public void updatePeson(@RequestBody Persona person) {
        personService.updatePerson(person);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/person/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }

}
