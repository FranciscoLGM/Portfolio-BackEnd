package com.servidor.servidor.service;

import com.servidor.servidor.model.Persona;
import java.util.List;

public interface IPersonaService {

    public List<Persona> listPerson();

    public void createPerson(Persona person);

    public void deletePerson(Long id);

    public Persona findPerson(Long id);

}
