package com.seisme.localisationdtos;

import com.seisme.seismedtos.SeismeDTO;


public class LocalisationSaveDTO {

    private String nom;
    private String code;
    private SeismeDTO seisme;

    public LocalisationSaveDTO(){}

    public LocalisationSaveDTO(String nom, String code, SeismeDTO seisme) {

        this.nom = nom;
        this.code = code;
        this.seisme = seisme;
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
