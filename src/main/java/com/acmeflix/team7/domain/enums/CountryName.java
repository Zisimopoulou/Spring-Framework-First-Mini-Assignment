package com.acmeflix.team7.domain.enums;


import lombok.Getter;

@Getter

public enum CountryName {
    Austria("austria"),
	German("german"),
	France("france"),
    Greece("greece");

    private String country;
    CountryName(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

}








