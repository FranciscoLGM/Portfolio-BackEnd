package com.servidor.servidor.services;

import com.servidor.servidor.models.Habilidad;
import java.util.List;

public interface IHabilidadService {

    public void createSkill(Habilidad skill);

    public List<Habilidad> listSkill();

    public Habilidad findSkill(Long id);

    public void updateSkill(Habilidad skill);

    public void deleteSkill(Long id);

}
