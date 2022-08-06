package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.Movie;
import com.acmeflix.team7.domain.enums.Country;
import com.acmeflix.team7.repository.BaseRepository;
import com.acmeflix.team7.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MovieServiceImpl extends BaseServiceImpl<Movie> implements MovieService{
    private final MovieRepository movieRepository;

    @Override
    public BaseRepository<Movie, Long> getRepository() {
        return movieRepository;
    }

    @Override
    public Movie findMovieByTitle(final String movieTitle) {
        if (movieRepository.findMovieByTitle(movieTitle) != null) {
            return movieRepository.findMovieByTitle(movieTitle).get(0);
        }
        log.info("Movie with title {} not found.", movieTitle);
        return null;
    }
    @Override
    public Movie findMovieByCountry(final Country country) {
        if (movieRepository.findMovieByCountry(country) != null) {
            return movieRepository.findMovieByCountry(country).get(0);
        }
        log.info("Country {} not found.", country.getCountryName());
        return null;
    }
}
