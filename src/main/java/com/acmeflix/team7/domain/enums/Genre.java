package com.acmeflix.team7.domain.enums;

import lombok.Getter;

@Getter
public enum Genre {
    comedy("comedy"),
    action("action"),
    thriller("thriller"),
    romantic("romantic");
    private String genre;


        Genre (String genre) {
            this.genre = genre;
        }

    }

