package com.acmeflix.team7.bootstrap;

import com.acmeflix.team7.base.BaseComponent;
import com.acmeflix.team7.domain.*;
import com.acmeflix.team7.domain.enums.*;
import com.acmeflix.team7.service.MovieService;
import com.acmeflix.team7.service.TvShowService;
import com.acmeflix.team7.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Component
@Profile("generate-basic-content")
@RequiredArgsConstructor
@Slf4j
public class BasicSampleContentCreator extends BaseComponent implements CommandLineRunner {
    private final UserAccountService userAccountService;
    private final MovieService movieService;
    private final TvShowService tvShowService;

    @Override
    public void run(String... args) throws Exception {

        log.info("Creating first user account.");
        UserAccount firstUserAccount = UserAccount.builder().email("alex@alex.com")
                .username("alex@alex.com").password("alex123").subscriptionPlan(SubscriptionPlan.PREMIUM)
                .profiles(List.of(
                        com.acmeflix.team7.domain.Profile.builder().country("Greece").gender("female")
                                .language(Language.GREEK).maturityRatingLevel(MaturityRatingLevel.PG13).build(),
                        com.acmeflix.team7.domain.Profile.builder().country("Germany").gender("male")
                                .language(Language.GERMAN).maturityRatingLevel(MaturityRatingLevel.G).build()))
                .build();
        log.info("Username of first account = {} ",firstUserAccount.getUsername());

        //Add profiles service
        log.info("Creating first movie.");
        Movie firstMovie = Movie.builder().title("Hunger Games").year("2014").duration(BigDecimal.valueOf(180))
                .country(Country.AUSTRIA).maturityRatingLevel(MaturityRatingLevel.G).plot("Katniss Everdeen voluntarily takes her younger sister's place in the Hunger Games: a televised competition in which two teenagers from each of the twelve Districts of Panem are chosen at random to fight to the death.")
                .genres(List.of(Genre.ACTION,Genre.ROMANTIC)).rating(Rating.fiveStar).languages(List.of(Language.ENGLISH,Language.GREEK))
                .subtitles(List.of(Language.ENGLISH,Language.GREEK)).status(Status.COMPLETED)
                .tags(List.of(Tag.ADAPTEDFROMANOVEL,Tag.ASSASSINFEMALELEAD))
                .build();

        firstMovie.setCast(List.of(
                Cast.builder().kindOfCast(KindOfCast.DIRECTOR).firstName("Gary").lastName("Ross").build(),
                Cast.builder().kindOfCast(KindOfCast.WRITER).firstName("Suzanne").lastName("Collins").build(),
                Cast.builder().kindOfCast(KindOfCast.ACTOR).lastName("Lawrence").lastName("Jeniffer").build(),
                Cast.builder().kindOfCast(KindOfCast.ACTOR).lastName("Hutch").lastName("Josh").build()
        ));
        log.info("Title of first movie = {} ",firstMovie.getTitle());

        log.info("Creating first TVShow.");
        TvShow firstTvShow = TvShow.builder().title("Attorney Woo").country(Country.AUSTRIA).maturityRatingLevel(MaturityRatingLevel.G)
                .plot("About an autistic 27-year-old lawyer. Due to her high IQ of 164, impressive memory, and creative thought process, the brilliant Woo Young Woo graduated at the top of her class from a prestigious law school.")
                .genres(List.of(Genre.COMEDY,Genre.ACTION)).rating(Rating.fiveStar).languages(List.of(Language.ENGLISH,Language.GREEK))
                .subtitles(List.of(Language.ENGLISH,Language.GREEK)).status(Status.ONGOING).tags(List.of(Tag.ADAPTEDFROMANOVEL,Tag.AUTISTIC))
                .build();

        firstTvShow.setSeasons(List.of(Season.builder().year("2022").title("First Season")
                .episodes(List.of(Episode.builder().title("If I Were a Whale").date("12-01-2022").duration(BigDecimal.valueOf(60)).build(),
                                  Episode.builder().title("The Pied Piper").date("18-01-2022").duration(BigDecimal.valueOf(60)).build()))
                .build()));

        firstTvShow.setCast(List.of(
                Cast.builder().kindOfCast(KindOfCast.DIRECTOR).firstName("Eun-bik").lastName("Park").build(),
                Cast.builder().kindOfCast(KindOfCast.WRITER).firstName("Tae-oh").lastName("Kang").build(),
                Cast.builder().kindOfCast(KindOfCast.ACTOR).lastName("Kang").lastName("Ki-young").build(),
                Cast.builder().kindOfCast(KindOfCast.ACTOR).lastName("Yoon-keyong").lastName("Ha").build()
        ));
        log.info("Title of first TvShow = {} ",firstTvShow.getTitle());

        firstTvShow.setMovieRecommendations(List.of(firstMovie));
        log.info("The TvShow = {} has as a recommendation the movie = {} ",firstTvShow.getTitle(),firstTvShow.getMovieRecommendations().get(0).getTitle());

        userAccountService.create(firstUserAccount);
        movieService.create(firstMovie);
        tvShowService.create(firstTvShow);

        log.info("Finding all info.");
        userAccountService.findAll();
        movieService.findAll();
        tvShowService.findAll();

    }

//    public void movieRecommendation(Movie movie,ContentCatalog contentCatalog){
//        int count = 0;
//        while (count < movie.getGenres().size())
//            ContentCatalogRepositoryImpl.addMovieRecommendation(movieRepositoryImpl.findMovieRecommendation(movie,count),movie,contentCatalog);
//        count++;
//    }
}
