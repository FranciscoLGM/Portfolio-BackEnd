package com.servidor.servidor.service;

import com.servidor.servidor.model.Educacion;
import java.util.List;

public interface IEducacionService {

    public void createEducation(Educacion education);

    public List<Educacion> listEducation();

    public Educacion findEducation(Long id);

    public void updateEducation(Educacion education);

    public void deleteEducation(Long id);

}
