package com.acmeflix.team7.repository;

import com.acmeflix.team7.domain.Movie;
import com.acmeflix.team7.domain.enums.Country;

import java.util.List;

public interface MovieRepository extends BaseRepository<Movie, Long> {
    List<Movie> findMovieByTitle(final String movieTitle);
    List<Movie> findMovieByCountry(Country country);
}