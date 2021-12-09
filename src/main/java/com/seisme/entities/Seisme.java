package com.seisme.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class Seisme {

    @Id
    private String id;
    private String nom;
    private String magnitude;
    private Date date;

    @DBRef
    private List<Localisation> localisations;

    public Seisme(){}

    public Seisme(String id, String nom, String magnitude, Date date, List<Localisation> localisations) {
        this.id = id;
        this.nom = nom;
        this.magnitude = magnitude;
        this.date = date;
        this.localisations = localisations;
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

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Localisation> getLocalisations() {
        return localisations;
    }

    public void setLocalisations(List<Localisation> localisations) {
        this.localisations = localisations;
    }
}
