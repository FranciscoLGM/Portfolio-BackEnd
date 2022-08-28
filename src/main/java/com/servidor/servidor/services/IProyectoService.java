package com.servidor.servidor.services;

import com.servidor.servidor.models.Proyecto;
import java.util.List;

public interface IProyectoService {

    public void createProject(Proyecto project);

    public List<Proyecto> listProject();

    public Proyecto findProject(Long id);

    public void updateProject(Proyecto project);

    public void deleteProject(Long id);

}
