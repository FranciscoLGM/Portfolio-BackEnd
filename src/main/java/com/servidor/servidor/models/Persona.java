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
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String lastname;
    private String profession;
    private String occupation;
    private String heroDescription;
    private String aboutDescription;
    private String imageProfile;

    public Persona() {
    }

    public Persona(Long id, String name, String lastname, String profession, String occupation, String heroDescription, String aboutDescription, String imageProfile) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.profession = profession;
        this.occupation = occupation;
        this.heroDescription = heroDescription;
        this.aboutDescription = aboutDescription;
        this.imageProfile = imageProfile;
    }

}
