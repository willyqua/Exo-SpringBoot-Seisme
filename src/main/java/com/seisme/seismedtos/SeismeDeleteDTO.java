package com.seisme.seismedtos;

public class SeismeDeleteDTO {
    private String id;

    public SeismeDeleteDTO() {
    }

    public SeismeDeleteDTO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}