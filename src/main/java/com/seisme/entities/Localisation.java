package com.seisme.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Localisation {

    @Id
    private String id;
    private String nom;
    private String code;


    @DBRef
    private Seisme seisme;

    public Localisation(){}

    public Localisation(String id, String nom, String code, Seisme seisme) {
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

    public Seisme getSeisme() {
        return seisme;
    }

    public void setSeisme(Seisme seisme) {
        this.seisme = seisme;
    }
}
