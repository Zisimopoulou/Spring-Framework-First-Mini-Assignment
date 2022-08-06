package com.acmeflix.team7.repository;

import com.acmeflix.team7.domain.TvShow;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class TvShowRepositoryImpl extends BaseRepositoryImpl<TvShow> implements TvShowRepository {
    private final AtomicLong sequence = new AtomicLong(1);
    private final Map<Long, TvShow> storage = new LinkedHashMap<>();
    @Override
    public Map<Long, TvShow> getStorage() {
        return storage;
    }

    @Override
    public AtomicLong getSequence() {
        return sequence;
    }

    @Override
    public List<TvShow> findTvShowByTitle(final String tvShowTitle) {
        return storage.values().stream().filter(tvs -> tvs.getTitle().equalsIgnoreCase(tvShowTitle)).toList();
    }
}
