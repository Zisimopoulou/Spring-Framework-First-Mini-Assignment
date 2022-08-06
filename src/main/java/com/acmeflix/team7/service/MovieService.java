package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.Movie;
import com.acmeflix.team7.domain.enums.Country;

public interface MovieService extends BaseService<Movie> {
    Movie findMovieByTitle(String movieTitle);
    Movie findMovieByCountry(Country country);
}
