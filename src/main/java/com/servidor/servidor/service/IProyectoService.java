package com.servidor.servidor.service;

import com.servidor.servidor.model.Proyecto;
import java.util.List;

public interface IProyectoService {

    public void createProject(Proyecto project);

    public List<Proyecto> listProject();

    public Proyecto findProject(Long id);

    public void updateProject(Proyecto project);

    public void deleteProject(Long id);

}
