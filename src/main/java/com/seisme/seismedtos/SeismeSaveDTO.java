package com.seisme.seismedtos;

import com.seisme.localisationdtos.LocalisationDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;


public class SeismeSaveDTO {


    private String nom;
    private int magnitude;
    private Date date;


    public SeismeSaveDTO(){}

    public SeismeSaveDTO(String nom, int magnitude, Date date) {
        this.nom = nom;
        this.magnitude = magnitude;
        this.date = date;
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
}
