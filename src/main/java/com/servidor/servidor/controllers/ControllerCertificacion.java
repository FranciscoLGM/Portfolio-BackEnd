package com.servidor.servidor.controllers;

import com.servidor.servidor.models.Certificacion;
import com.servidor.servidor.services.ICertificacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "https://franciscolopezgarciamayorga.web.app")
public class ControllerCertificacion {

    @Autowired
    private ICertificacionService certificationService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new/certification")
    public void createCertification(@RequestBody Certificacion certification) {
        certificationService.createCertification(certification);
    }

    @GetMapping("/list/certifications")
    @ResponseBody
    public List<Certificacion> listCertification() {
        return certificationService.listCertification();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/find/certification/{id}")
    @ResponseBody
    public Certificacion findCertification(@PathVariable Long id) {
        return certificationService.findCertification(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/certification")
    public void updateCertification(@RequestBody Certificacion certification) {
        certificationService.updateCertification(certification);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/certification/{id}")
    public void deleteCertification(@PathVariable Long id) {
        certificationService.deleteCertificacion(id);
    }

}
