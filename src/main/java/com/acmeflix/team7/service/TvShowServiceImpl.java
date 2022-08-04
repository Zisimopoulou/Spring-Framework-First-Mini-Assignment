package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.TvShow;
import com.acmeflix.team7.repository.TvShowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TvShowServiceImpl extends BaseServiceImpl <TvShow> implements TvShowService{
    private final TvShowRepository tvShowRepository;
    public JpaRepository<TvShow, Long> getRepository() {
        return tvShowRepository;
    }

    @Override
    public TvShow findTvShowByTitle(String tvShowTitle) {
        List<TvShow> tvShows = tvShowRepository.findTvShowByTitle(tvShowTitle);
        return tvShows.get(0);
    }
}
