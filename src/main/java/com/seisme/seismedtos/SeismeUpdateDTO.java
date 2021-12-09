package com.seisme.seismedtos;

import com.seisme.localisationdtos.LocalisationDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class SeismeUpdateDTO {

    @Id
    private String id;
    private String nom;
    private int magnitude;
    private Date date;


    public SeismeUpdateDTO(){}

    public SeismeUpdateDTO(String id, String nom, int magnitude, Date date) {
        this.id = id;
        this.nom = nom;
        this.magnitude = magnitude;
        this.date = date;

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


}
