package com.servidor.servidor.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Habilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String skill;
    @OrderBy("rate DESC")
    private String rate;

    public Habilidad() {
    }

    public Habilidad(Long id, String skill, String rate) {
        this.id = id;
        this.skill = skill;
        this.rate = rate;
    }

}
