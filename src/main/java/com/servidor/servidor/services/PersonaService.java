package com.servidor.servidor.services;

import com.servidor.servidor.models.Persona;
import com.servidor.servidor.repositorys.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository personRepo;

    @Override
    public void createPerson(Persona person) {
        personRepo.save(person);
    }

    @Override
    public List<Persona> listPerson() {
        return personRepo.findAll();
    }

    @Override
    public Persona findPerson(Long id) {
        return personRepo.findById(id).orElse(null);
    }

    @Override
    public void updatePerson(Persona person) {
        personRepo.save(person);
    }

    @Override
    public void deletePerson(Long id) {
        personRepo.deleteById(id);
    }

}
