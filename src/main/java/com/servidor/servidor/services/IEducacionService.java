package com.servidor.servidor.services;

import com.servidor.servidor.models.Educacion;
import java.util.List;

public interface IEducacionService {

    public void createEducation(Educacion education);

    public List<Educacion> listEducation();

    public Educacion findEducation(Long id);

    public void updateEducation(Educacion education);

    public void deleteEducation(Long id);

}
