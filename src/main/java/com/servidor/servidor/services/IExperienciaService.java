package com.servidor.servidor.services;

import com.servidor.servidor.models.Experiencia;
import java.util.List;

public interface IExperienciaService {

    public void createExpertise(Experiencia expertise);

    public List<Experiencia> listExpertise();

    public Experiencia findExpertise(Long id);

    public void updateExpertise(Experiencia expertise);

    public void deleteExpertise(Long id);

}
