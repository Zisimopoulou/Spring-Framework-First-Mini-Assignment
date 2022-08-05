package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.Movie;
import com.acmeflix.team7.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public abstract class MovieServiceImpl extends BaseServiceImpl<Movie> implements MovieService{
    private final MovieRepository movieRepository;
    public JpaRepository<Movie, Long> getRepository() {
        return movieRepository;
    }

    @Override
    public Movie findMovieByTitle(List<Movie> movies,String movieTitle) {
        for (int i = 0; i < movies.size(); i++) {
            if(movies.get(i).getTitle().equals(movieTitle)){
                return movies.get(i);
            }
        }
        log.info("Movie with title {} not found.", movieTitle);
        return null;
    }
    @Override
    public List<Movie> findMovieByGenre(List<Movie> movies,String genreTitle) {
        List<Movie> moviesByGenre = null;
        for (int i = 0; i < movies.size(); i++) {
            if(movies.get(i).getGenres().equals(genreTitle)){
                moviesByGenre.add(movies.get(i));
                return moviesByGenre;
            }
        }
        log.info("Movie with genre {} not found.", genreTitle);
        return null;
    }

    public List<Movie> findMovieRecommendation(List<Movie> movies, String genreTitle) {
        log.info("Initialize movie recommendations = {}.");
        List<Movie> movieRecommendation = findMovieByGenre(movies,  genreTitle);
        return movieRecommendation;
    }
}
