package com.servidor.servidor.service;

import com.servidor.servidor.model.Experiencia;
import com.servidor.servidor.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository expertiseRepo;

    @Override
    public void createExpertise(Experiencia expertise) {
        expertiseRepo.save(expertise);
    }

    @Override
    public List<Experiencia> listExpertise() {
        return expertiseRepo.findAll();
    }

    @Override
    public Experiencia findExpertise(Long id) {
        return expertiseRepo.findById(id).orElse(null);
    }

    @Override
    public void updateExpertise(Experiencia expertise) {
        expertiseRepo.save(expertise);
    }

    @Override
    public void deleteExpertise(Long id) {
        expertiseRepo.deleteById(id);
    }

}
