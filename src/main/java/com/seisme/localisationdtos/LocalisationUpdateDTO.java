package com.seisme.localisationdtos;

import com.seisme.seismedtos.SeismeDTO;


public class LocalisationUpdateDTO {

    private String id;
    private String nom;
    private String code;
    private SeismeRelationDTO seisme;

    public LocalisationUpdateDTO(){}

    public LocalisationUpdateDTO(String id, String nom, String code, SeismeRelationDTO seisme) {
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

    public SeismeRelationDTO getSeisme() {
        return seisme;
    }

    public void setSeisme(SeismeRelationDTO seisme) {
        this.seisme = seisme;
    }
}
