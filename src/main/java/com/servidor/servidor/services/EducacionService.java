package com.servidor.servidor.services;

import com.servidor.servidor.models.Educacion;
import com.servidor.servidor.repositorys.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
        return educationRepo.findAll(Sort.by(Sort.Direction.DESC, "id"));
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
