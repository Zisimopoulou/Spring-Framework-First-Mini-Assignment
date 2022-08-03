package com.acmeflix.team7.domain;

import com.acmeflix.team7.domain.enums.KindOfCast;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
public class Cast extends BaseModel{
    private String firstName, lastName;
    private KindOfCast kindOfCast;
}
