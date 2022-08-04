package com.acmeflix.team7.domain;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class Episode extends BaseModel{
    private String title;
    private String date;
    private BigDecimal duration;
}
