package com.acmeflix.team7.domain;

import com.acmeflix.team7.domain.enums.Status;
import com.acmeflix.team7.domain.enums.Tag;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


import java.util.List;
@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContentCatalog extends BaseModel {
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
