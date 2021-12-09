package com.seisme.localisationdtos;

public class LocalisationDeleteDTO {
    private String id;

    public LocalisationDeleteDTO() {
    }

    public LocalisationDeleteDTO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}