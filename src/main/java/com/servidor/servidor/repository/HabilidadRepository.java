package com.servidor.servidor.repository;

import com.servidor.servidor.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository<Habilidad, Long> {

}
