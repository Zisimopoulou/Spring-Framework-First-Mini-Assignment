package com.acmeflix.team7.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class Movie extends ContentCatalog{
    private BigDecimal duration;
    private String year;
}
