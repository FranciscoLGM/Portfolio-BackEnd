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
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;
    private String imageProject;
    private String urlProject;

    public Proyecto() {
    }

    public Proyecto(Long id, String title, String description, String imageProject, String urlProject) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageProject = imageProject;
        this.urlProject = urlProject;
    }

}
