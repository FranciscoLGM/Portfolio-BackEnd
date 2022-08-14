package com.servidor.servidor.service;

import com.servidor.servidor.model.Certificacion;
import com.servidor.servidor.repository.CertificacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificacionService implements ICertificacionService {
    
    @Autowired
    public CertificacionRepository certificationRepo;
    
    @Override
    public void createCertification(Certificacion certification) {
        certificationRepo.save(certification);
    }
    
    @Override
    public List<Certificacion> listCertification() {
        return certificationRepo.findAll();
    }
    
    @Override
    public Certificacion findCertification(Long id) {
        return certificationRepo.findById(id).orElse(null);
    }
    
    @Override
    public void updateCertification(Certificacion certification) {
        certificationRepo.save(certification);
    }
    
    @Override
    public void deleteCertificacion(Long id) {
        certificationRepo.deleteById(id);
    }
    
}
