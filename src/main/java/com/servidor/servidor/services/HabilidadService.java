package com.servidor.servidor.services;

import com.servidor.servidor.models.Habilidad;
import com.servidor.servidor.repositorys.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService {
    
    @Autowired
    public HabilidadRepository skillRepo;
    
    @Override
    public void createSkill(Habilidad skill) {
        skillRepo.save(skill);
    }
    
    @Override
    public List<Habilidad> listSkill() {
        return skillRepo.findAll();
    }
    
    @Override
    public Habilidad findSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
    
    @Override
    public void updateSkill(Habilidad skill) {
        skillRepo.save(skill);
    }
    
    @Override
    public void deleteSkill(Long id) {
        skillRepo.deleteById(id);
    }
    
}
