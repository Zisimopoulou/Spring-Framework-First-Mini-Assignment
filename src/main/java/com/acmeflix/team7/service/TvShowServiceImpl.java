package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.TvShow;
import com.acmeflix.team7.repository.BaseRepository;
import com.acmeflix.team7.repository.TvShowRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TvShowServiceImpl extends BaseServiceImpl<TvShow> implements TvShowService{
    private final TvShowRepository tvShowRepository;
    @Override
    public BaseRepository<TvShow, Long> getRepository() {
        return tvShowRepository;
    }

    @Override
    public TvShow findTvShowByTitle(final String tvShowTitle) {
        if (tvShowRepository.findTvShowByTitle(tvShowTitle) != null) {
            return tvShowRepository.findTvShowByTitle(tvShowTitle).get(0);
        }
        log.info("TvShow with title {} not found.", tvShowTitle);
        return null;
    }
}
