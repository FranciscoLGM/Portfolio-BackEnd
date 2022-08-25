package com.servidor.servidor.services;

import com.servidor.servidor.models.Certificacion;
import java.util.List;

public interface ICertificacionService {

    public void createCertification(Certificacion certification);

    public List<Certificacion> listCertification();

    public Certificacion findCertification(Long id);

    public void updateCertification(Certificacion certification);

    public void deleteCertificacion(Long id);

}
