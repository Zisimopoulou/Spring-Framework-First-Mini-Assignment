package com.acmeflix.team7.repository;

import com.acmeflix.team7.domain.Movie;
import com.acmeflix.team7.domain.enums.Country;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class MovieRepositoryImpl extends BaseRepositoryImpl<Movie> implements MovieRepository{
    private final AtomicLong sequence = new AtomicLong(1);
    private final Map<Long, Movie> storage = new LinkedHashMap<>();
    @Override
    public Map<Long, Movie> getStorage() {
        return storage;
    }
    @Override
    public AtomicLong getSequence() {
        return sequence;
    }
    @Override
    public List<Movie> findMovieByTitle(final String movieTitle) {
        List<Movie> movieList = new ArrayList<>();
        for (int i=0;i<storage.values().size();i++){
            if(storage.get(i).equals(movieTitle)) {
                movieList.add(storage.get(i));
            }
        }
        return movieList;
    }
    @Override
    public List<Movie> findMovieByCountry(Country country) {
        return storage.values().stream().filter(m -> m.getCountry().equals(country)).toList();
    }
}
