package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.TvShow;

import java.util.List;

public interface TvShowService extends BaseService<TvShow> {
    TvShow findTvShowByTitle(List<TvShow> tvShows, String tvShowTitle);
}
