package com.acmeflix.team7.repository;

import com.acmeflix.team7.domain.TvShow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TvShowRepository extends JpaRepository<TvShow, Long> {
    TvShow findTvShowByTitle(String tvShowTitle);
}
