package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.ContentCatalog;
import com.acmeflix.team7.domain.Movie;
import com.acmeflix.team7.domain.TvShow;

public interface ContentCatalogService extends BaseService<ContentCatalog>{
    public void addMovieRecommendation(Movie movieRecommendation,Movie movie,ContentCatalog contentCatalog);
//    public void addTvShowRecommendation(TvShow tvShow, ContentCatalog contentCatalog);
}
