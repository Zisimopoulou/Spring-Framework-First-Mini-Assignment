package com.acmeflix.team7.domain.enums;


import lombok.Getter;

@Getter

public enum Country {
    Austria("austria"),
	German("german"),
	France("france"),
    Greece("greece");

    private String country;
    Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

}








