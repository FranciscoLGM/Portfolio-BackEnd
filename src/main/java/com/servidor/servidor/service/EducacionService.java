package com.servidor.servidor.service;

import com.servidor.servidor.model.Educacion;
import com.servidor.servidor.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    public EducacionRepository educationRepo;
    
    @Override
    public void createEducation(Educacion education) {
        educationRepo.save(education);
    }
    
    @Override
    public List<Educacion> listEducation() {
        return educationRepo.findAll();
    }
    
    @Override
    public Educacion findEducation(Long id) {
        return educationRepo.findById(id).orElse(null);
    }
    
    @Override
    public void updateEducation(Educacion education) {
        educationRepo.save(education);
    }
    
    @Override
    public void deleteEducation(Long id) {
        educationRepo.deleteById(id);
    }
    
}
