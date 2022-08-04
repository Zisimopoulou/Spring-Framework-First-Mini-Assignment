package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.ContentCatalog;
import com.acmeflix.team7.domain.Movie;
import com.acmeflix.team7.domain.TvShow;
import com.acmeflix.team7.repository.ContentCatalogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ContentCatalogServiceImpl extends BaseServiceImpl<ContentCatalog> implements ContentCatalogService {
    private final ContentCatalogRepository contentCatalogRepository;
    @Override
    public JpaRepository<ContentCatalog, Long> getRepository() {
        return contentCatalogRepository;
    }

//    @Override
//    public void addMovieRecommendation(Movie movie,ContentCatalog contentCatalog) {
//        int count = 0;
//        while (count < movie.getGenres().size())
//        if (findMovieRecommendation(movie,count) == null) {
//            log.info("No movie recommendations found for the genre = {} and country = {}",movie.getGenres().get(count).getGenreName(),movie.getCountry().getCountryName());
//        } else {
//            log.info("Adding movie = {} in the recommendation list.", findMovieRecommendation(movie,count).getTitle());
//            contentCatalog.getMovieRecommendations().add(findMovieRecommendation(movie,count));
//        }
//        count++;
//    }
//    @Override
//    public TvShow findTvShowRecommendation(TvShow tvShow, int count) {
//        log.info("Initialize TvShow recommendations based on the genre = {}.", tvShow.getGenres().get(count).getGenreName());
//        List<TvShow> tvShowRecommendations = findMovieByGenre(tvShow.getGenres().get(count));
//        log.info("Finalize TvShow recommendations based on the country = {}.", tvShow.getCountry().getCountryName());
//        TvShow tvShowRecommendation = findMovieByCountry(movieRecommendations.get(count));
//        return tvShowRecommendation;
//    }
    @Override
    public void addMovieRecommendation(Movie movieRecommendation,Movie movie,ContentCatalog contentCatalog) {
        int count = 0;
        while (count < movie.getGenres().size())
            if (movieRecommendation == null) {
                log.info("No movie recommendations found for the genre = {} and country = {}",movie.getGenres().get(count).getGenreName(),movie.getCountry().getCountryName());
            } else {
                log.info("Adding movie = {} in the recommendation list.", movieRecommendation.getTitle());
                contentCatalog.getMovieRecommendations().add(movieRecommendation);
            }
        count++;
    }

//    public void allRecommendations(Movie movie,ContentCatalog contentCatalog){
//        int count = 0;
//        while (count < movie.getGenres().size())
//            ContentCatalogRepositoryImpl.addMovieRecommendation(movieRepositoryImpl.findMovieRecommendation(movie,count),movie,contentCatalog);
//        count++;
//    }

//    @Override
//    public void addTvShowRecommendation(TvShow tvShow, ContentCatalog contentCatalog) {
//        int count = 0;
//        while (count < tvShow.getGenres().size())
//            if (findTvShowRecommendation(tvShow,count) == null) {
//                log.info("No TvShow recommendations found for the genre = {} and country = {}",tvShow.getGenres().get(count).getGenreName(),tvShow.getCountry().getCountryName());
//            } else {
//                log.info("Adding TvShow = {} in the recommendation list.", findTvShowRecommendation(tvShow,count).getTitle());
//                contentCatalog.getTvShowRecommendations().add(findTvShowRecommendation(tvShow,count));
//            }
//        count++;
//    }

}
