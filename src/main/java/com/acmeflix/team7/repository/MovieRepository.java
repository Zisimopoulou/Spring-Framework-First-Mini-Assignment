package com.acmeflix.team7.repository;

import com.acmeflix.team7.domain.Movie;
import com.acmeflix.team7.domain.enums.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    Movie findMovieByTitle(String movieTitle);
    Movie findMovieByGenre(Genre genre);
}