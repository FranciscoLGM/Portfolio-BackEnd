package com.servidor.servidor.controller;

import com.servidor.servidor.model.Certificacion;
import com.servidor.servidor.service.ICertificacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCertificacion {
    
    @Autowired
    private ICertificacionService certificationService;
    
    @PostMapping("/new/certification")
    public void createCertification(@RequestBody Certificacion certification) {
        certificationService.createCertification(certification);
    }
    
    @GetMapping("/list/certifications")
    @ResponseBody
    public List<Certificacion> listCertification() {
        return certificationService.listCertification();
    }
    
    @GetMapping("/find/certification/{id}")
    @ResponseBody
    public Certificacion findCertification(@PathVariable Long id) {
        return certificationService.findCertification(id);
    }
    
    @PutMapping("/update/certification")
    public void updateCertification(@RequestBody Certificacion certification) {
        certificationService.updateCertification(certification);
    }
    
    @DeleteMapping("/delete/certification/{id}")
    public void deleteCertification(@PathVariable Long id) {
        certificationService.deleteCertificacion(id);
    }
    
}
