package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.TvShow;

public interface TvShowService extends BaseService<TvShow> {
    TvShow findTvShowByTitle(String showTitle);
}
