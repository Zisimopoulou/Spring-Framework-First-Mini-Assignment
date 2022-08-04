package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.Movie;
import com.acmeflix.team7.repository.MovieRepository;

import java.util.List;

public interface MovieServiceImpl extends BaseServiceImpl<UserAccount> implements MovieService{
    private final MovieRepository movieRepository;
    @Override
    public BaseRepository<Movie, Long> getRepository() {
        return movieRepository;
    }
    @Override
    public Movie findByTitle(final String title) {
        List<Movie> movies = movieRepository.findByTitle(title);
        return movies.get(0);
    }
}
