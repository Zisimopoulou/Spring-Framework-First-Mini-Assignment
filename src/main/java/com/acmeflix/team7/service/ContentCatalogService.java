package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.ContentCatalog;
import com.acmeflix.team7.domain.Movie;
import com.acmeflix.team7.domain.TvShow;

public interface ContentCatalogService {
    void addMovieRecommendation(final Movie movie,final ContentCatalog contentCatalog);
    void addTvShowRecommendation(final TvShow tvShow, final ContentCatalog contentCatalog);
}
