package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.ContentCatalog;
import com.acmeflix.team7.domain.Movie;
import com.acmeflix.team7.domain.TvShow;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ContentCatalogServiceImpl implements ContentCatalogService {

    @Override
    public void addMovieRecommendation(final Movie movie,final ContentCatalog contentCatalog) {
        contentCatalog.getMovieRecommendations().add(movie);
    }
    @Override
    public void addTvShowRecommendation(final TvShow tvShow, final ContentCatalog contentCatalog) {
        contentCatalog.getTvShowRecommendations().add(tvShow);
    }
}
