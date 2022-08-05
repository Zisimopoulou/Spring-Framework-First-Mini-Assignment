package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.Movie;

import java.util.List;

public interface MovieService extends BaseService<Movie> {
    Movie findMovieByTitle(List<Movie> movies,String movieTitle);
    public List<Movie> findMovieByGenre(List<Movie> movies,String genreTitle);
    public List<Movie> findMovieRecommendation(List<Movie> movies, String genreTitle);
}
