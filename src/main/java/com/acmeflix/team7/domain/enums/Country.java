package com.acmeflix.team7.domain.enums;


import lombok.Getter;

@Getter

public enum Country {
    Austria("austria"),
    German("german"),
    France("france"),
    Greece("greece");

    private String countryName;

    Country(String country) {
        this.countryName = country;
    }
}











