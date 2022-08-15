package com.servidor.servidor.service;

import com.servidor.servidor.model.Proyecto;
import com.servidor.servidor.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    public ProyectoRepository projectRepo;
    
    @Override
    public void createProject(Proyecto project) {
        projectRepo.save(project);
    }
    
    @Override
    public List<Proyecto> listProject() {
        return projectRepo.findAll();
    }
    
    @Override
    public Proyecto findProject(Long id) {
        return projectRepo.findById(id).orElse(null);
    }
    
    @Override
    public void updateProject(Proyecto project) {
        projectRepo.save(project);
    }
    
    @Override
    public void deleteProject(Long id) {
        projectRepo.deleteById(id);
    }
    
}
