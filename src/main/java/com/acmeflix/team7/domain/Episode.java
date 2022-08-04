package com.acmeflix.team7.domain;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
public class Episode extends BaseModel{
    private String title;
    private String date;
    private BigDecimal duration;
}
