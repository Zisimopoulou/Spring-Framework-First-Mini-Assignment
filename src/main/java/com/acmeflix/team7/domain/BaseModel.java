package com.acmeflix.team7.domain;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Getter
@ToString
@MappedSuperclass
@SuperBuilder
public abstract class BaseModel implements Serializable {
    private final Long id;
}
