package com.acmeflix.team7.repository;

import com.acmeflix.team7.domain.Movie;

import java.util.List;

public interface MovieRepository extends BaseRepository<Movie, Long> {
    List<Movie> findByTitle(String title);
}