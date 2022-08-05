package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.TvShow;
import com.acmeflix.team7.repository.TvShowRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TvShowServiceImpl extends BaseServiceImpl<TvShow> implements TvShowService{
    private final TvShowRepository tvShowRepository;
    public JpaRepository<TvShow, Long> getRepository() {
        return tvShowRepository;
    }

    @Override
    public TvShow findTvShowByTitle(List<TvShow> tvShows,String tvShowTitle) {
            for (int i = 0; i < tvShows.size(); i++) {
                if(tvShows.get(i).getTitle().equals(tvShowTitle)){
                    return tvShows.get(i);
                }
            }
            log.info("TvShow with title {} not found.", tvShowTitle);
            return null;
    }
}
