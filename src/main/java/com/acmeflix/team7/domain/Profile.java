package com.acmeflix.team7.domain;

import com.acmeflix.team7.domain.enums.Language;
import com.acmeflix.team7.domain.enums.MaturityRatingLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;
@Getter
@Setter
@ToString
@SuperBuilder
public class Profile extends BaseModel{
    private String name;
    private String country;
    private Language language;
    private String gender;
    private MaturityRatingLevel maturityRatingLevel;

}
