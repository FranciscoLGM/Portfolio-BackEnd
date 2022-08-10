package com.servidor.servidor.controller;

import com.servidor.servidor.model.Persona;
import com.servidor.servidor.service.IPersonaService;
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
public class Controller {

    @Autowired
    private IPersonaService personService;

    @PostMapping("/new/person")
    public void createPerson(@RequestBody Persona person) {
        personService.createPerson(person);
    }

    @GetMapping("/list/persons")
    @ResponseBody
    public List<Persona> listPerson() {
        return personService.listPerson();
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }

    @PutMapping("/update/person")
    public void updatePeson(@RequestBody Persona person) {
        personService.updatePerson(person);
    }

}
