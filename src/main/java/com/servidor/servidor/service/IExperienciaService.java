package com.servidor.servidor.service;

import com.servidor.servidor.model.Experiencia;
import java.util.List;

public interface IExperienciaService {

    public void createExpertise(Experiencia expertise);

    public List<Experiencia> listExpertise();

    public Experiencia findExpertise(Long id);

    public void updateExpertise(Experiencia expertise);

    public void deleteExpertise(Long id);

}
