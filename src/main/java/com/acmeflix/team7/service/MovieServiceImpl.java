package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.Movie;
import com.acmeflix.team7.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class MovieServiceImpl extends BaseServiceImpl <Movie> implements MovieService{

    private final MovieRepository movieRepository;
    public JpaRepository<Movie, Long> getRepository() {
        return movieRepository;
    }

    @Override
    public Movie findMovieByTitle(String movieTitle) {
        List<Movie> movies = movieRepository.findMovieByTitle(movieTitle);
        return movies.get(0);
    }
}
