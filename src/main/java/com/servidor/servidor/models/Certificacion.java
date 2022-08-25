package com.servidor.servidor.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Certificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String degree;
    private String university;
    private String inicio;
    private String fin;
    private String city;
    private String description;
    private String imageUniversity;

    public Certificacion() {
    }

    public Certificacion(Long id, String degree, String university, String inicio, String fin, String city, String description, String imageUniversity) {
        this.id = id;
        this.degree = degree;
        this.university = university;
        this.inicio = inicio;
        this.fin = fin;
        this.city = city;
        this.description = description;
        this.imageUniversity = imageUniversity;
    }

}
