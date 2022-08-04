package com.acmeflix.team7.domain;

import com.acmeflix.team7.domain.enums.SubscriptionPlan;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;
@Getter
@Setter
@SuperBuilder
@ToString
public class UserAccount extends BaseModel{
    private String username;
    private String password;
    private String email;
    private List<Profile>profiles;
    private SubscriptionPlan subscriptionPlan;


}
