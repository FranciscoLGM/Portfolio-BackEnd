package com.servidor.servidor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String position;
    private String company;
    private String inicio;
    private String fin;
    private String city;
    private String description;
    private String imageCompany;

    public Experiencia() {
    }

    public Experiencia(Long id, String position, String company, String inicio, String fin, String city, String description, String imageCompany) {
        this.id = id;
        this.position = position;
        this.company = company;
        this.inicio = inicio;
        this.fin = fin;
        this.city = city;
        this.description = description;
        this.imageCompany = imageCompany;
    }

}
