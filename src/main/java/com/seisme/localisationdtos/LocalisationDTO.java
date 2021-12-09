package com.seisme.localisationdtos;

import com.seisme.entities.Seisme;
import com.seisme.seismedtos.SeismeDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


public class LocalisationDTO {

    private String id;
    private String nom;
    private String code;
    private SeismeDTO seisme;

    public LocalisationDTO(){}

    public LocalisationDTO(String id, String nom, String code, SeismeDTO seisme) {
        this.id = id;
        this.nom = nom;
        this.code = code;
        this.seisme = seisme;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public SeismeDTO getSeisme() {
        return seisme;
    }

    public void setSeisme(SeismeDTO seisme) {
        this.seisme = seisme;
    }
}
