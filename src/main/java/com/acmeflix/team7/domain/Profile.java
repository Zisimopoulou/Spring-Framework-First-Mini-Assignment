package com.acmeflix.team7.domain;

import com.acmeflix.team7.domain.enums.MaturityRatingLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
@Builder
public class Profile extends BaseModel{
    private String name;
    private String country;
    private String language;
    private String gender;
    private MaturityRatingLevel maturialRaingLevel;

}
