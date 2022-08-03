package com.acmeflix.team7.domain;

import com.acmeflix.team7.domain.enums.Status;
import com.acmeflix.team7.domain.enums.Tag;

import java.util.List;

public class ContentCatalog {
    private String title,plot;
    private List<Genre> genres;
    private List<Language> languages;
    private List<Language> subtitles;
    private MaturityRaingLevel maturityRatingLevel;
    private Rating rating;
    private List<Cast> cast;
    private List<Tag> tags;
    private List<Status> status;
    private Country country;



}
