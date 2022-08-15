package com.servidor.servidor.repository;

import com.servidor.servidor.model.Certificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificacionRepository extends JpaRepository<Certificacion, Long> {

}
