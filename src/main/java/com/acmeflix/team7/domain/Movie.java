package com.acmeflix.team7.domain;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie extends ContentCatalog{
    private BigDecimal duration;
    private Date date;
}
