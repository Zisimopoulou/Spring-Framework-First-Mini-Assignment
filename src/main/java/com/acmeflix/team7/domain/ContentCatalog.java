package com.acmeflix.team7.domain;

import com.acmeflix.team7.domain.enums.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class ContentCatalog extends BaseModel {
    private String title,plot;
    private List<Genre> genres;
    private List<Language> languages;
    private List<Language> subtitles;
    private List<Movie> movieRecommendations;
    private List<TvShow> tvShowRecommendations;
    private MaturityRatingLevel maturityRatingLevel;
    private Rating rating;
    private List<Cast> cast;
    private List<Tag> tags;
    private Status status;
    private Country country;

}
