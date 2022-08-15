package com.servidor.servidor.service;

import com.servidor.servidor.model.Habilidad;
import java.util.List;

public interface IHabilidadService {

    public void createSkill(Habilidad skill);

    public List<Habilidad> listSkill();

    public Habilidad findSkill(Long id);

    public void updateSkill(Habilidad skill);

    public void deleteSkill(Long id);

}
