package com.seisme.seismedtos;

import com.seisme.entities.Localisation;
import com.seisme.localisationdtos.LocalisationDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class SeismeDTO {

    @Id
    private String id;
    private String nom;
    private int magnitude;
    private Date date;
    private List<LocalisationDTO> localisations;

    public SeismeDTO(){}

    public SeismeDTO(String id, String nom, int magnitude, Date date, List<LocalisationDTO> localisations) {
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

    public int getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(int magnitude) {
        this.magnitude = magnitude;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<LocalisationDTO> getLocalisations() {
        return localisations;
    }

    public void setLocalisations(List<LocalisationDTO> localisations) {
        this.localisations = localisations;
    }
}
