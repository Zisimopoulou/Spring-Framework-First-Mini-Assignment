package com.acmeflix.team7.repository;

import com.acmeflix.team7.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findMovieByTitle(String title);
}