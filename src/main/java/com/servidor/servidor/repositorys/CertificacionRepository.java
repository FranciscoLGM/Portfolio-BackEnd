package com.servidor.servidor.repositorys;

import com.servidor.servidor.models.Certificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificacionRepository extends JpaRepository<Certificacion, Long> {

}
