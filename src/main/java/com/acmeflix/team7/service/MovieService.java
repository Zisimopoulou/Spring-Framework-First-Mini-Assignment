package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.Movie;
import com.acmeflix.team7.domain.TvShow;
import com.acmeflix.team7.domain.UserAccount;
import com.acmeflix.team7.domain.enums.Country;
import com.acmeflix.team7.domain.enums.Genre;

import java.util.List;

public interface MovieService extends BaseService<Movie> {
    Movie findMovieByTitle(String movieTitle);
    Movie findMovieByGenre(Genre genre);
//    Movie findMovieByCountry(Country country);
    Movie findMovieRecommendation(Movie movie,int count);
}
