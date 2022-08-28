package com.servidor.servidor.services;

import com.servidor.servidor.models.Persona;
import java.util.List;

public interface IPersonaService {

    public void createPerson(Persona person);

    public List<Persona> listPerson();

    public Persona findPerson(Long id);

    public void updatePerson(Persona person);

    public void deletePerson(Long id);

}
