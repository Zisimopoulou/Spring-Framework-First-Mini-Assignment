package com.acmeflix.team7.domain.enums;


import lombok.Getter;

@Getter

public enum Country {
    AUSTRIA("Αustria"),
    GERMAN("German"),
    FRANCE("France"),
    GREECE("Greece");

    private String countryName;

    Country(String country) {
        this.countryName = country;
    }
}











