package com.acmeflix.team7.domain;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class TvShow extends ContentCatalog{
    private List<Season> seasons;
}
