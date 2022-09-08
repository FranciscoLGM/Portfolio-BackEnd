package com.servidor.servidor.services;

import com.servidor.servidor.models.Experiencia;
import com.servidor.servidor.repositorys.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
        return expertiseRepo.findAll(Sort.by(Sort.Direction.DESC, "id"));
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
