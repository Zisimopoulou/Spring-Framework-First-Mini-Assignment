package com.acmeflix.team7.domain.enums;

import lombok.Getter;

@Getter
public enum Genre {
    COMEDY("comedy"),
    ACTION("action"),
    THRILLER("thriller"),
    ROMANTIC("romantic");
    private final String genreName;
    Genre(String genre) {
        this.genreName = genre;
    }

}

