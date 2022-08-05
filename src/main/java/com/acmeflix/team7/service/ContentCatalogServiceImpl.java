package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.ContentCatalog;
import com.acmeflix.team7.domain.Movie;
import com.acmeflix.team7.domain.TvShow;
import com.acmeflix.team7.repository.ContentCatalogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ContentCatalogServiceImpl extends BaseServiceImpl<ContentCatalog> implements ContentCatalogService {
    private final ContentCatalogRepository contentCatalogRepository;

    @Override
    public JpaRepository<ContentCatalog, Long> getRepository() {
        return contentCatalogRepository;
    }

    @Override
    public void addMovieRecommendation(Movie movieRecommendation, Movie movie, ContentCatalog contentCatalog, int count) {
        if (movieRecommendation == null) {
            log.info("No movie recommendations found for the genre = {} and country = {}", movie.getGenres().get(count).getGenreName(), movie.getCountry().getCountryName());
        } else {
            log.info("Adding movie = {} in the recommendation list.", movieRecommendation.getTitle());
            contentCatalog.getMovieRecommendations().add(movieRecommendation);
        }
    }
}
