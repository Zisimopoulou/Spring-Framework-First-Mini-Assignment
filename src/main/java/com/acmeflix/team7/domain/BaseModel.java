package com.acmeflix.team7.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@MappedSuperclass
@SuperBuilder
@Data
public abstract class BaseModel implements Serializable {
    private static long serialVersionUID = 1L;
    private Long id;

}
