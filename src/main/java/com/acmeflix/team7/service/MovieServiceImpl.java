package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.Movie;
import com.acmeflix.team7.domain.TvShow;
import com.acmeflix.team7.domain.enums.Country;
import com.acmeflix.team7.domain.enums.Genre;
import com.acmeflix.team7.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class MovieServiceImpl extends BaseServiceImpl<Movie> implements MovieService{
    private final MovieRepository movieRepository;
    public JpaRepository<Movie, Long> getRepository() {
        return movieRepository;
    }

    @Override
    public Movie findMovieByTitle(String movieTitle) {
        return movieRepository.findMovieByTitle(movieTitle);
    }
    @Override
    public Movie findMovieByGenre(Genre genre) {
        return movieRepository.findMovieByGenre(genre);
    }
    @Override
    public Movie findMovieRecommendation(Movie movie,int count) {
        log.info("Initialize movie recommendations based on the genre = {}.", movie.getGenres().get(count).getGenreName());
        Movie movieRecommendation = findMovieByGenre(movie.getGenres().get(count));
        log.info("Finalize movie recommendations based on the country = {}.", movie.getCountry().getCountryName());
        if (movie.getCountry().getCountryName() == movieRecommendation.getCountry().getCountryName()){
            return movieRecommendation;
        }
        return null;
    }

}
