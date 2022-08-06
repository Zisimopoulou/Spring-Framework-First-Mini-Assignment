package com.acmeflix.team7.repository;

import com.acmeflix.team7.domain.TvShow;

import java.util.List;

public interface TvShowRepository extends BaseRepository<TvShow, Long> {
    List<TvShow> findTvShowByTitle(final String tvShowTitle);

}
